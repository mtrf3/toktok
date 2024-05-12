package Y;

import X.C2U8;
import X.C50137Jm1;
import X.C50162JmQ;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;

/* loaded from: classes9.dex */
public class ACListenerS28S1200000_8 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS28S1200000_8 aCListenerS28S1200000_8, View view) {
        String correctedKeyword = ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getCorrectedKeyword();
        ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getCorrectedLevel();
        C2U8.LIZ(new C50162JmQ(correctedKeyword));
        C50137Jm1 c50137Jm1 = (C50137Jm1) aCListenerS28S1200000_8.l2;
        int correctedLevel = ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getCorrectedLevel();
        String correctedKeyword2 = ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getCorrectedKeyword();
        String str = aCListenerS28S1200000_8.s0;
        String requestId = ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getRequestId();
        c50137Jm1.getClass();
        C50137Jm1.LIZIZ(correctedLevel, "click", correctedKeyword2, str, requestId, "corrected_keyword");
    }

    public static final void onClick$1(ACListenerS28S1200000_8 aCListenerS28S1200000_8, View view) {
        String str = aCListenerS28S1200000_8.s0;
        ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getCorrectedLevel();
        C2U8.LIZ(new C50162JmQ(str));
        C50137Jm1 c50137Jm1 = (C50137Jm1) aCListenerS28S1200000_8.l2;
        int correctedLevel = ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getCorrectedLevel();
        String correctedKeyword = ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getCorrectedKeyword();
        String str2 = aCListenerS28S1200000_8.s0;
        String requestId = ((QueryCorrectInfo) aCListenerS28S1200000_8.l1).getRequestId();
        c50137Jm1.getClass();
        C50137Jm1.LIZIZ(correctedLevel, "click", correctedKeyword, str2, requestId, "corrected_keyword");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS28S1200000_8(com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo r2, X.C50137Jm1 r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r2
            r0.l2 = r3
            r0.s0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS28S1200000_8.<init>(com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo, X.Jm1, java.lang.String, int):void");
    }
}
