package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JI1 implements View.OnAttachStateChangeListener {
    public final C49153JQv LJLIL;
    public final JIB LJLILLLLZI;
    public final JGU LJLJI;
    public final RecyclerView LJLJJI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        JI2 ji2 = new JI2(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        RecyclerView itemView = this.LJLJJI;
        o.LJIIIZ(itemView, "itemView");
        if (!C48923JHz.LIZIZ().containsKey(itemView)) {
            C48923JHz.LIZIZ().put(itemView, ji2);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        RecyclerView itemView = this.LJLJJI;
        o.LJIIIZ(itemView, "itemView");
        if (C48923JHz.LIZIZ().containsKey(itemView)) {
            C48923JHz.LIZIZ().remove(itemView);
        }
    }

    public JI1(C49153JQv mScrollStateManager, JIB mContainerStatusProvider, JGU mPlayVideoObserver, RecyclerView mRecyclerView) {
        o.LJIIIZ(mScrollStateManager, "mScrollStateManager");
        o.LJIIIZ(mContainerStatusProvider, "mContainerStatusProvider");
        o.LJIIIZ(mPlayVideoObserver, "mPlayVideoObserver");
        o.LJIIIZ(mRecyclerView, "mRecyclerView");
        this.LJLIL = mScrollStateManager;
        this.LJLILLLLZI = mContainerStatusProvider;
        this.LJLJI = mPlayVideoObserver;
        this.LJLJJI = mRecyclerView;
    }
}
