package X;

import android.os.RemoteException;
import kotlin.jvm.internal.o;

/* renamed from: X.aQ9, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93393aQ9 implements C8DV {
    public final C68824Qzk LIZ;

    @Override // X.C8DV
    public final void LJJLIIIJ() {
        C0R4 LJ = this.LIZ.LJ();
        LJ.getClass();
        try {
            ((InterfaceC68835Qzv) LJ.LIZ).LJJLIIIJ();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public C93393aQ9(C68824Qzk googleMap) {
        o.LJIIIZ(googleMap, "googleMap");
        this.LIZ = googleMap;
    }
}
