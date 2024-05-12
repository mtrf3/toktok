package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O2U implements InterfaceC61273O2z {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.InterfaceC61273O2z
    public final void LIZIZ(List channelList) {
        o.LJIIJ(channelList, "channelList");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download success with dynamic=");
        LIZ.append(this.LIZ);
        LIZ.append(" , channel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(",bundle=");
        LIZ.append(this.LIZJ);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
    }

    @Override // X.InterfaceC61273O2z
    public final void LIZ(Throwable th, List channelList) {
        o.LJIIJ(channelList, "channelList");
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed with dynamic=");
        LIZ.append(this.LIZ);
        LIZ.append(" ,channel = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(",bundle = ");
        C39048FUe.LIZIZ(c39048FUe, C61328O5c.LIZLLL(LIZ, this.LIZJ, ",errorMessage=", th, LIZ), null, null, 6);
    }

    public O2U(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
