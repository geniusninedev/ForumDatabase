package com.google.firebase.quickstart.database.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.quickstart.database.R;
import com.google.firebase.quickstart.database.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;
    public Button likeView;
    public TextView numLikeView;
    public TextView bodyView;
    public Button commentView;
    public Button shareView;

    public PostViewHolder(View itemView) {
        super(itemView);

        titleView = (TextView) itemView.findViewById(R.id.post_title);
        authorView = (TextView) itemView.findViewById(R.id.post_author);
        likeView = (Button) itemView.findViewById(R.id.like);
        numLikeView = (TextView) itemView.findViewById(R.id.post_num_likes);
        bodyView = (TextView) itemView.findViewById(R.id.post_body);
        commentView = (Button) itemView.findViewById(R.id.comment);
        shareView = (Button) itemView.findViewById(R.id.share);
    }

    public void bindToPost(Post post, View.OnClickListener starClickListener) {
        titleView.setText(post.title);
        authorView.setText(post.author);
        numLikeView.setText(String.valueOf(post.likeCount));
        bodyView.setText(post.body);

        likeView.setOnClickListener(starClickListener);
    }
}
