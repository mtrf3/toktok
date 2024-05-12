package com.bytedance.ugc.ugcwidget;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class UGCOnClickListener implements View.OnClickListener {
    public long interval;
    public long timeMillis;

    public abstract void doClick(View view);

    public UGCOnClickListener() {
        this(500L);
    }

    public long getInterval() {
        return this.interval;
    }

    public UGCOnClickListener(long j) {
        this.interval = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.timeMillis < currentTimeMillis) {
            this.timeMillis = currentTimeMillis + this.interval;
            doClick(view);
        }
    }

    public void setInterval(long j) {
        this.interval = j;
    }
}
