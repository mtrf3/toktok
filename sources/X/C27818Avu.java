package X;

import android.graphics.Bitmap;

/* renamed from: X.Avu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27818Avu implements InterfaceC78660Uu0 {
    public final /* synthetic */ InterfaceC43919HLn<C76800UCe> LJLIL;

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
        this.LJLIL.LJ(C76800UCe.LIZ);
    }

    public C27818Avu(InterfaceC43919HLn<C76800UCe> interfaceC43919HLn) {
        this.LJLIL = interfaceC43919HLn;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        this.LJLIL.LJ(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        this.LJLIL.LJ(C76800UCe.LIZ);
    }
}
