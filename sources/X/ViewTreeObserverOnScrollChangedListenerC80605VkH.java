package X;

import android.view.ViewTreeObserver;
import com.ss.android.videoshop.context.VideoContext;

/* renamed from: X.VkH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewTreeObserverOnScrollChangedListenerC80605VkH implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ YS4 LJLIL;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        boolean globalVisibleRect;
        YS4 ys4 = this.LJLIL;
        ys4.getClass();
        if (!ys4.isShown()) {
            globalVisibleRect = false;
        } else {
            ys4.LJZL.setEmpty();
            globalVisibleRect = ys4.getGlobalVisibleRect(ys4.LJZL);
        }
        VideoContext videoContext = this.LJLIL.LJLJJL;
        if (videoContext != null && videoContext.isHalfScreen()) {
            YS4 ys42 = this.LJLIL;
            if (ys42.LJLJL != null && videoContext.isCurrentView(ys42) && videoContext.isCurrentSource(this.LJLIL.LJLIL)) {
                YS4 ys43 = this.LJLIL;
                ys43.LJLJL.LJI(ys43, globalVisibleRect);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onScrollVisibilityChange simpleMediaView hash:");
                LIZ.append(this.LJLIL.hashCode());
                LIZ.append(" nowVisible:");
                LIZ.append(globalVisibleRect);
                X1D.LIZIZ(LIZ);
            }
        }
    }

    public ViewTreeObserverOnScrollChangedListenerC80605VkH(YS4 ys4) {
        this.LJLIL = ys4;
    }
}
