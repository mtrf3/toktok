package X;

import android.graphics.Bitmap;

/* loaded from: classes8.dex */
public final class HKB implements InterfaceC63955P8d {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<Bitmap, Long, C76800UCe> LIZIZ;
    public final /* synthetic */ long LIZJ;

    public HKB(long j, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = j;
    }

    @Override // X.InterfaceC63955P8d
    public final void LIZ(int i, Bitmap bitmap) {
        if (bitmap == null || i != 0) {
            this.LIZ.invoke();
        } else {
            this.LIZIZ.invoke(bitmap, Long.valueOf(System.currentTimeMillis() - this.LIZJ));
        }
    }
}
