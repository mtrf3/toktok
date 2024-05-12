package X;

import android.graphics.Bitmap;

/* renamed from: X.UyN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78931UyN implements InterfaceC63955P8d {
    public final /* synthetic */ InterfaceC67352kd<Bitmap> LIZ;

    public C78931UyN(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC63955P8d
    public final void LIZ(int i, Bitmap bitmap) {
        C15280iq.LIZIZ("DiyProp", "shot screen callback");
        InterfaceC67352kd<Bitmap> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(bitmap);
        interfaceC67352kd.resumeWith(bitmap);
    }
}
