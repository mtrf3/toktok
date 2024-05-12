package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XBg, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84420XBg implements InterfaceC13840gW<XD6, VNB> {
    public final X62 LIZ;

    public C84420XBg(X62 x62) {
        this.LIZ = x62;
    }

    @Override // X.InterfaceC13840gW
    public final VNB LIZ(XD6 xd6) {
        XD6 param = xd6;
        o.LJIIJ(param, "param");
        X62 x62 = this.LIZ;
        if (x62 != null) {
            VNB fetchFromNetwork = x62.fetchFromNetwork(param);
            if (fetchFromNetwork.LIZIZ == 200) {
                return fetchFromNetwork;
            }
            throw new C84434XBu(fetchFromNetwork.LIZIZ, fetchFromNetwork.LJ);
        }
        throw new C84434XBu(3, "networker is null!");
    }
}
