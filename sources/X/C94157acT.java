package X;

import android.graphics.Bitmap;

/* renamed from: X.acT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94157acT implements InterfaceC78660Uu0 {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        this.LJLIL.invoke(null);
    }

    public C94157acT(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        this.LJLIL.invoke(bitmap);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        this.LJLIL.invoke(null);
    }
}
