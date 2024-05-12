package com.ss.android.ugc.aweme.feed.widget;

import X.AbstractC55114Lk6;
import X.C81334Vw2;
import X.InterfaceC54977Lht;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public class FeedSwipeRefreshLayout extends C81334Vw2 implements InterfaceC54977Lht {
    public AbstractC55114Lk6 LLIL;
    public boolean LLILII;
    public RecyclerView LLILIL;

    public FeedSwipeRefreshLayout() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // X.C81334Vw2, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC55114Lk6 abstractC55114Lk6;
        RecyclerView recyclerView;
        if (this.LLILII && (((abstractC55114Lk6 = this.LLIL) == null || abstractC55114Lk6.getAdapter() == null || this.LLIL.getAdapter().getCount() == 0 || this.LLIL.getCurrentItem() == 0) && (((recyclerView = this.LLILIL) == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).LLIL() == 0) && super.onInterceptTouchEvent(motionEvent)))) {
            return true;
        }
        return false;
    }

    @Override // X.C81334Vw2, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLILII && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC54977Lht
    public void setCanTouch(boolean z) {
        this.LLILII = z;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.LLILIL = recyclerView;
    }

    @Override // X.InterfaceC54977Lht
    public void setViewPager(AbstractC55114Lk6 abstractC55114Lk6) {
        this.LLIL = abstractC55114Lk6;
    }

    public FeedSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILII = true;
    }
}
