package com.ss.android.ugc.aweme.simkit.impl.player;

import X.C16880lQ;
import X.InterfaceC47258Igg;
import X.J9W;
import X.J9Y;
import X.J9Z;
import X.X1D;
import Y.IDCListenerS245S0100000_8;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes9.dex */
public class TextureViewHolder implements InterfaceC47258Igg {
    public final J9Y LIZ;
    public final boolean LIZIZ = true;
    public SurfaceTexture LIZJ;
    public boolean LIZLLL;
    public volatile Surface LJ;
    public J9W LJFF;

    @Override // X.InterfaceC47258Igg
    public final void LLLI() {
        this.LIZLLL = true;
    }

    public final void LIZ() {
        if (this.LIZIZ && this.LIZJ != null) {
            SurfaceTexture surfaceTexture = this.LIZ.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = this.LIZJ;
            if (surfaceTexture != surfaceTexture2) {
                this.LIZ.setSurfaceTexture(surfaceTexture2);
            }
        }
    }

    @Override // X.InterfaceC47258Igg
    public final boolean LLLIIII() {
        if (this.LJ != null && this.LJ.isValid()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47258Igg
    public final void LLJJIII() {
        if (LLLIIII() && this.LIZLLL) {
            this.LJ.release();
            this.LJ = new Surface(this.LIZJ);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reCreateSurface: Surface:");
            LIZ.append(this.LJ);
            LIZ.append(", SurfaceTexture:");
            LIZ.append(this.LIZJ);
            X1D.LIZIZ(LIZ);
            this.LIZLLL = false;
        }
    }

    @Override // X.InterfaceC47258Igg
    public final void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release: Surface:");
        LIZ.append(this.LJ);
        LIZ.append(", SurfaceTexture:");
        LIZ.append(this.LIZJ);
        X1D.LIZIZ(LIZ);
        SurfaceTexture surfaceTexture = this.LIZJ;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.LIZJ = null;
        }
        if (this.LJ != null) {
            this.LJ.release();
            this.LJ = null;
        }
        this.LIZ.setSurfaceTextureListener(null);
    }

    @Override // X.InterfaceC47258Igg
    public final Surface getSurface() {
        return this.LJ;
    }

    public TextureViewHolder(J9Y j9y) {
        this.LIZ = j9y;
        j9y.setRelatedSurfaceHolder(this);
        j9y.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 12));
        j9y.setSurfaceTextureListener(new J9Z(this, j9y));
    }

    @Override // X.InterfaceC47258Igg
    public final void LLLII(FrameLayout frameLayout) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        J9Y j9y = this.LIZ;
        if (j9y != null) {
            ViewParent parent = j9y.getParent();
            if (parent instanceof ViewGroup) {
                C16880lQ.LJLLL(j9y, (ViewGroup) parent);
            }
        }
        frameLayout.addView(this.LIZ, layoutParams);
        LIZ();
    }

    @Override // X.InterfaceC47258Igg
    public final void LLLIIIIL(J9W j9w) {
        this.LJFF = j9w;
    }
}
