package X;

import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wuh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83799Wuh implements InterfaceC83812Wuu<InterfaceC83687Wst>, InterfaceC83687Wst {
    public TextureView LIZ;
    public C83802Wuk LIZIZ;
    public final InterfaceC83796Wue LIZJ;

    @Override // X.InterfaceC83812Wuu
    public final void onDestroy() {
    }

    @Override // X.InterfaceC83687Wst
    public final boolean A0() {
        C83802Wuk c83802Wuk = this.LIZIZ;
        if (c83802Wuk != null) {
            return c83802Wuk.LIZJ;
        }
        o.LJIJI("textureViewFunctionImpl");
        throw null;
    }

    @Override // X.InterfaceC83687Wst
    public final View K5() {
        TextureView textureView = this.LIZ;
        if (textureView != null) {
            return textureView;
        }
        o.LJIJI("textureView");
        throw null;
    }

    @Override // X.InterfaceC83687Wst
    public final Surface getSurface() {
        C83802Wuk c83802Wuk = this.LIZIZ;
        if (c83802Wuk != null) {
            return c83802Wuk.LIZIZ;
        }
        o.LJIJI("textureViewFunctionImpl");
        throw null;
    }

    @Override // X.InterfaceC83812Wuu
    public final void init() {
        this.LIZ = new TextureView(this.LIZJ.getActivity());
        this.LIZIZ = new C83802Wuk(new AqS164S0100000_14(this, 364));
    }

    public C83799Wuh(InterfaceC83796Wue ckCameraViewContext) {
        o.LJIIIZ(ckCameraViewContext, "ckCameraViewContext");
        this.LIZJ = ckCameraViewContext;
    }

    @Override // X.InterfaceC83687Wst
    public final void L5(C83680Wsm c83680Wsm) {
        C83802Wuk c83802Wuk = this.LIZIZ;
        if (c83802Wuk != null) {
            synchronized (c83802Wuk) {
                c83802Wuk.LIZ.add(c83680Wsm);
            }
        } else {
            o.LJIJI("textureViewFunctionImpl");
            throw null;
        }
    }
}
