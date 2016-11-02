package com.example.anubh.contactsearch;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by anubh on 11-Oct-16.
 */
public class ListViewHolder extends RecyclerView.ViewHolder {
    protected ImageView contactimage;
    protected TextView contactname,contactnum;
    protected RelativeLayout relativeLayout;
    public ListViewHolder(View view){
        super(view);

        contactimage = (ImageView)view.findViewById(R.id.contactimage);
        contactname = (TextView) view.findViewById(R.id.contactname);
        contactnum = (TextView) view.findViewById(R.id.contactno);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.relativeLayout);

        view.setClickable(false);
    }
}
