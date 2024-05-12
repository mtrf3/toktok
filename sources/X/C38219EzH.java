package X;

import Y.ACallableS35S1200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.EzH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C38219EzH extends C74232TBk implements InterfaceC88471Ynr<String, C38184Eyi, C76800UCe> {
    public C38219EzH(C60238NkY c60238NkY) {
        super(2, c60238NkY);
    }

    @Override // X.AbstractC74233TBl, X.InterfaceC74234TBm
    public final String getName() {
        return "onPerfDataReady";
    }

    @Override // X.AbstractC74233TBl
    public final InterfaceC36731EbH getOwner() {
        return C65352Pkq.LIZ(C60238NkY.class);
    }

    @Override // X.AbstractC74233TBl
    public final String getSignature() {
        return "onPerfDataReady(Ljava/lang/String;Lcom/bytedance/ies/bullet/core/kit/bridge/BridgePerfData;)V";
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, C38184Eyi c38184Eyi) {
        String p1 = str;
        C38184Eyi p2 = c38184Eyi;
        o.LJIIJ(p1, "p1");
        o.LJIIJ(p2, "p2");
        C60238NkY c60238NkY = (C60238NkY) this.receiver;
        c60238NkY.getClass();
        C10K.LIZJ(new ACallableS35S1200000_6(c60238NkY, p2, p1, 1));
        return C76800UCe.LIZ;
    }
}
