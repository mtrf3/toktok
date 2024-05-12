package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HJP implements InterfaceC63955P8d {
    public final /* synthetic */ InterfaceC88471Ynr<Bitmap, Long, C76800UCe> LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    public HJP(long j, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LIZ = interfaceC88471Ynr;
        this.LIZIZ = j;
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC63955P8d
    public final void LIZ(int i, Bitmap bitmap) {
        if (i == 0) {
            InterfaceC88471Ynr<Bitmap, Long, C76800UCe> interfaceC88471Ynr = this.LIZ;
            o.LJIIIIZZ(bitmap, "bitmap");
            interfaceC88471Ynr.invoke(bitmap, Long.valueOf(System.currentTimeMillis() - this.LIZIZ));
            return;
        }
        this.LIZJ.invoke();
    }
}
