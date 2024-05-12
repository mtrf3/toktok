package com.ss.android.ugc.aweme.live.alphaplayer;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes15.dex */
public class Configuration {
    public int alphaVideoViewType;
    public Context context;
    public LifecycleOwner lifecycleOwner;
    public String threadName = "alpha-play-thread";

    public Configuration copy() {
        Configuration configuration = new Configuration();
        configuration.setContext(this.context);
        configuration.setLifecycleOwner(this.lifecycleOwner);
        configuration.setAlphaVideoViewType(this.alphaVideoViewType);
        configuration.setThreadName(this.threadName);
        return configuration;
    }

    public int getAlphaVideoViewType() {
        return this.alphaVideoViewType;
    }

    public Context getContext() {
        return this.context;
    }

    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public String getThreadName() {
        return this.threadName;
    }

    public Configuration setAlphaVideoViewType(int i) {
        this.alphaVideoViewType = i;
        return this;
    }

    public Configuration setContext(Context context) {
        this.context = context;
        return this;
    }

    public Configuration setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        return this;
    }

    public Configuration setThreadName(String str) {
        this.threadName = str;
        return this;
    }
}
