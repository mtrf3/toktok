package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C188727au;
import X.C44100HSm;
import X.C76800UCe;
import X.C7F9;
import X.C8IM;
import X.HSS;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.S1B;
import X.S1E;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS22S0500000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS22S0500000_12 aqS22S0500000_12) {
        C7F9 c7f9 = (C7F9) aqS22S0500000_12.l2;
        S1B s1b = (S1B) aqS22S0500000_12.l3;
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS22S0500000_12.l4;
        S1B.LJIJI((C8IM) aqS22S0500000_12.l1, (S1E) aqS22S0500000_12.l0, c7f9, s1b, interfaceC88471Ynr);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS22S0500000_12 aqS22S0500000_12) {
        if (((C8IM) aqS22S0500000_12.l0).LJIIIIZZ()) {
            C8IM c8im = (C8IM) aqS22S0500000_12.l0;
            C7F9 c7f9 = (C7F9) aqS22S0500000_12.l1;
            String LIZ = c8im.LIZ(C44100HSm.LIZIZ(c7f9, (S1E) aqS22S0500000_12.l2, ((S1B) aqS22S0500000_12.l3).LJIILL(c7f9)));
            S1E s1e = (S1E) aqS22S0500000_12.l2;
            o.LJII(s1e, "null cannot be cast to non-null type com.ss.android.ugc.aweme.multi.maker.SimpleAnchorMaker");
            HSS hss = (HSS) s1e;
            C7F9 c7f92 = (C7F9) aqS22S0500000_12.l1;
            C188727au LIZ2 = C44100HSm.LIZ((S1E) aqS22S0500000_12.l2, c7f92, LIZ, ((S1B) aqS22S0500000_12.l3).LJIILL(c7f92));
            HashMap<String, String> showContentInfo = ((C8IM) aqS22S0500000_12.l0).getShowContentInfo();
            if (showContentInfo != null) {
                for (Map.Entry<String, String> entry : showContentInfo.entrySet()) {
                    LIZ2.LJI(entry.getKey(), entry.getValue());
                }
            }
            hss.LJJJ(LIZ2);
        } else {
            C7F9 c7f93 = (C7F9) aqS22S0500000_12.l1;
            S1B s1b = (S1B) aqS22S0500000_12.l3;
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aqS22S0500000_12.l4;
            S1B.LJIJI((C8IM) aqS22S0500000_12.l0, (S1E) aqS22S0500000_12.l2, c7f93, s1b, interfaceC88471Ynr);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS22S0500000_12(X.C8IM r3, X.S1E r4, X.C7F9 r5, X.S1B r6, kotlin.jvm.internal.AqS128S0300000_12 r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            switch(r8) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r1.l3 = r6
            r1.l4 = r7
            r0 = 0
        L11:
            r1.<init>(r0)
            return
        L15:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r1.l3 = r6
            r1.l4 = r7
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS22S0500000_12.<init>(X.8IM, X.S1E, X.7F9, X.S1B, kotlin.jvm.internal.AqS128S0300000_12, int):void");
    }
}
