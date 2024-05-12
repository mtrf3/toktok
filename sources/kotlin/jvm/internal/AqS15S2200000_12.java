package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C46415IJn;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.S3O;
import com.bytedance.tux.input.TuxTextView;

/* loaded from: classes13.dex */
public class AqS15S2200000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AqS15S2200000_12 aqS15S2200000_12) {
        TuxTextView tuxTextView = ((S3O) aqS15S2200000_12.l2).LJIILL;
        if (tuxTextView != null) {
            tuxTextView.LJJJ(((C46415IJn) aqS15S2200000_12.l3).LJLIL);
            TuxTextView tuxTextView2 = ((S3O) aqS15S2200000_12.l2).LJIILLIIL;
            if (tuxTextView2 != null) {
                tuxTextView2.LJJJ(((C46415IJn) aqS15S2200000_12.l3).LJLIL);
                TuxTextView tuxTextView3 = ((S3O) aqS15S2200000_12.l2).LJIILL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(aqS15S2200000_12.s0);
                    TuxTextView tuxTextView4 = ((S3O) aqS15S2200000_12.l2).LJIILLIIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText(aqS15S2200000_12.s1);
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("hotSaleCountV2");
                    throw null;
                }
                o.LJIJI("hotSaleTitleV2");
                throw null;
            }
            o.LJIJI("hotSaleCountV2");
            throw null;
        }
        o.LJIJI("hotSaleTitleV2");
        throw null;
    }

    public static final Object invoke$1(AqS15S2200000_12 aqS15S2200000_12) {
        TuxTextView tuxTextView = ((S3O) aqS15S2200000_12.l2).LJIILL;
        if (tuxTextView != null) {
            tuxTextView.setText(aqS15S2200000_12.s0);
            TuxTextView tuxTextView2 = ((S3O) aqS15S2200000_12.l2).LJIILLIIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(aqS15S2200000_12.s1);
                TuxTextView tuxTextView3 = ((S3O) aqS15S2200000_12.l2).LJIILL;
                if (tuxTextView3 != null) {
                    tuxTextView3.LJJJ(((C46415IJn) aqS15S2200000_12.l3).LJLIL);
                    TuxTextView tuxTextView4 = ((S3O) aqS15S2200000_12.l2).LJIILLIIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.LJJJ(((C46415IJn) aqS15S2200000_12.l3).LJLIL);
                        return C76800UCe.LIZ;
                    }
                    o.LJIJI("hotSaleCountV2");
                    throw null;
                }
                o.LJIJI("hotSaleTitleV2");
                throw null;
            }
            o.LJIJI("hotSaleCountV2");
            throw null;
        }
        o.LJIJI("hotSaleTitleV2");
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS15S2200000_12(X.S3O r3, X.C46415IJn r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l2 = r3
            r1.s0 = r5
            r1.s1 = r6
            r1.l3 = r4
            r0 = 0
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l2 = r3
            r1.l3 = r4
            r1.s0 = r5
            r1.s1 = r6
            r0 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS15S2200000_12.<init>(X.S3O, X.IJn, java.lang.String, java.lang.String, int):void");
    }
}
