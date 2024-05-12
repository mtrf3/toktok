package X;

import android.graphics.Bitmap;

/* renamed from: X.FgB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39583FgB implements InterfaceC78660Uu0 {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ InterfaceC67352kd<Bitmap> LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (!this.LJLIL.element) {
            if (bitmap != null) {
                InterfaceC67352kd<Bitmap> interfaceC67352kd = this.LJLILLLLZI;
                C3C5.m7constructorimpl(bitmap);
                interfaceC67352kd.resumeWith(bitmap);
            } else {
                InterfaceC67352kd<Bitmap> interfaceC67352kd2 = this.LJLILLLLZI;
                C3C4 LIZ = C141335gf.LIZ(new Exception("Bitmap is null"));
                C3C5.m7constructorimpl(LIZ);
                interfaceC67352kd2.resumeWith(LIZ);
            }
            this.LJLIL.element = true;
        }
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        if (!this.LJLIL.element) {
            InterfaceC67352kd<Bitmap> interfaceC67352kd = this.LJLILLLLZI;
            if (th == null) {
                th = new Exception("Failed to download bitmap; exception is null");
            }
            OUR.LJ(th, interfaceC67352kd);
            this.LJLIL.element = true;
        }
    }

    public C39583FgB(C34K c34k, C84654XKg c84654XKg) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = c84654XKg;
    }
}
