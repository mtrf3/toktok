package X;

import kotlin.jvm.internal.AqS171S0100000_5;

/* renamed from: X.QTi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67054QTi extends AbstractC68941R3x {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    public C67054QTi(AqS171S0100000_5 aqS171S0100000_5) {
        this.LIZ = aqS171S0100000_5;
    }

    @Override // X.AbstractC67055QTj
    public final void onSuccess(R4V r4v) {
        boolean z;
        QTX qtx;
        String str;
        R4V r4v2 = r4v;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (r4v2 == null || (qtx = r4v2.LJIIIZ) == null || (str = qtx.LJII) == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        interfaceC88472Yns.invoke(Boolean.valueOf(!z));
    }

    @Override // X.AbstractC67055QTj
    public final void onError(R4V r4v, int i) {
        this.LIZ.invoke(Boolean.FALSE);
    }
}
