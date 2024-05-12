package X;

import android.graphics.Bitmap;

/* renamed from: X.SbA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72396SbA implements InterfaceC78660Uu0 {
    public final /* synthetic */ InterfaceC88472Yns<Bitmap, C76800UCe> LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C72396SbA(InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        this.LJLIL.invoke(bitmap);
    }
}
