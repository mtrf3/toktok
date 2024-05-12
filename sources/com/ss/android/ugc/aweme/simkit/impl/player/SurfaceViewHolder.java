package com.ss.android.ugc.aweme.simkit.impl.player;

import X.C16880lQ;
import X.InterfaceC47258Igg;
import X.J9U;
import X.J9V;
import X.J9W;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes9.dex */
public class SurfaceViewHolder implements InterfaceC47258Igg {
    public final J9V LIZ;
    public volatile Surface LIZIZ;
    public J9W LIZJ;

    @Override // X.InterfaceC47258Igg
    public final void LLJJIII() {
    }

    @Override // X.InterfaceC47258Igg
    public final void LLLI() {
    }

    @Override // X.InterfaceC47258Igg
    public final boolean LLLIIII() {
        if (this.LIZIZ != null && this.LIZIZ.isValid()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47258Igg
    public final void release() {
        if (this.LIZIZ != null) {
            this.LIZIZ.release();
            this.LIZIZ = null;
        }
    }

    @Override // X.InterfaceC47258Igg
    public final Surface getSurface() {
        return this.LIZIZ;
    }

    public SurfaceViewHolder(J9V j9v) {
        this.LIZ = j9v;
        j9v.setRelatedSurfaceHolder(this);
        j9v.getHolder().addCallback(new J9U(this));
    }

    @Override // X.InterfaceC47258Igg
    public final void LLLII(FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        J9V j9v = this.LIZ;
        if (j9v != null) {
            ViewParent parent = j9v.getParent();
            if (parent instanceof ViewGroup) {
                C16880lQ.LJLLL(j9v, (ViewGroup) parent);
            }
        }
        frameLayout.addView(this.LIZ, layoutParams);
    }

    @Override // X.InterfaceC47258Igg
    public final void LLLIIIIL(J9W j9w) {
        this.LIZJ = j9w;
    }
}
