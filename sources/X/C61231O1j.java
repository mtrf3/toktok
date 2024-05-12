package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.O1j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61231O1j implements InterfaceC61240O1s {
    public final /* synthetic */ C61225O1d LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // X.InterfaceC61240O1s
    public final void LIZIZ(List channelList) {
        o.LJIIJ(channelList, "channelList");
        C61225O1d c61225O1d = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download success with dynamic=");
        LIZ.append(this.LIZIZ);
        LIZ.append(" , channel=");
        LIZ.append(this.LIZJ);
        LIZ.append(",bundle=");
        LIZ.append(this.LIZLLL);
        C39973FmT.LIZIZ(c61225O1d, X1D.LIZIZ(LIZ), null, null, 6);
    }

    @Override // X.InterfaceC61240O1s
    public final void LIZ(Throwable th, List channelList) {
        o.LJIIJ(channelList, "channelList");
        C61225O1d c61225O1d = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed with dynamic=");
        LIZ.append(this.LIZIZ);
        LIZ.append(" ,channel = ");
        LIZ.append(this.LIZJ);
        LIZ.append(",bundle = ");
        C39973FmT.LIZIZ(c61225O1d, C61328O5c.LIZLLL(LIZ, this.LIZLLL, ",errorMessage=", th, LIZ), null, null, 6);
    }

    public C61231O1j(C61225O1d c61225O1d, int i, String str, String str2) {
        this.LIZ = c61225O1d;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
