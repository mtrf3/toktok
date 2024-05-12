package kotlin.jvm.internal;

import X.AA1;
import X.AA3;
import X.AA5;
import X.AbstractC65781Prl;
import X.C244869jG;
import X.C246509lu;
import X.C27943Axv;
import X.C76800UCe;
import X.C84661XKn;
import X.InterfaceC88472Yns;
import android.os.SystemClock;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class AqS9S1100100_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S1100100_4 aqS9S1100100_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("quit_type", aqS9S1100100_4.s0);
        logView.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - aqS9S1100100_4.j2));
        logView.plusAssign("previous_page", "order_submit");
        logView.plusAssign("page_name", "free_return_via_drop_off");
        logView.putAll((HashMap) aqS9S1100100_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S1100100_4 aqS9S1100100_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("quit_type", aqS9S1100100_4.s0);
        logView.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - aqS9S1100100_4.j2));
        logView.plusAssign("previous_page", "order_submit");
        logView.plusAssign("page_name", "free_return_via_drop_off");
        logView.putAll((HashMap) aqS9S1100100_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS9S1100100_4 aqS9S1100100_4, Object obj) {
        LaneParams logNodeId = (LaneParams) obj;
        o.LJIIIZ(logNodeId, "$this$logNodeId");
        logNodeId.plusAssign("quit_type", aqS9S1100100_4.s0);
        logNodeId.plusAssign("stay_time", Long.valueOf(aqS9S1100100_4.j2));
        logNodeId.putAll((HashMap) aqS9S1100100_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS9S1100100_4 aqS9S1100100_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        HashMap hashMap = (HashMap) aqS9S1100100_4.l1;
        if (hashMap != null) {
            String str = aqS9S1100100_4.s0;
            long j = aqS9S1100100_4.j2;
            C27943Axv.LIZ(sendLog, hashMap);
            sendLog.LIZJ("quit_type", str);
            sendLog.LIZJ("stay_time", Long.valueOf(j));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS9S1100100_4 aqS9S1100100_4, Object obj) {
        AA5 reason = (AA5) obj;
        o.LJIIIZ(reason, "reason");
        long currentTimeMillis = System.currentTimeMillis() - aqS9S1100100_4.j2;
        String enterFrom = aqS9S1100100_4.s0;
        o.LJIIIIZZ(enterFrom, "enterFrom");
        boolean z = false;
        if (AA1.LIZ().LIZ.getInt("dialog_close_without_action_in_times", 0) >= 2) {
            z = true;
        }
        new AA3(enterFrom, currentTimeMillis, reason, null, Boolean.valueOf(z), 8).LIZLLL(null);
        PopupManager.LIZJ(C246509lu.class);
        RecUserAfterAuthPopupVM recUserAfterAuthPopupVM = ((C244869jG) aqS9S1100100_4.l1).LJLJI;
        recUserAfterAuthPopupVM.getClass();
        recUserAfterAuthPopupVM.setState(new AqS170S0100000_4(recUserAfterAuthPopupVM, 1264));
        C84661XKn c84661XKn = recUserAfterAuthPopupVM.LJLJL;
        if (c84661XKn != null) {
            c84661XKn.LIZIZ(null);
        }
        C84661XKn c84661XKn2 = recUserAfterAuthPopupVM.LJLJJLL;
        if (c84661XKn2 != null) {
            c84661XKn2.LIZIZ(null);
        }
        recUserAfterAuthPopupVM.LJLJJLL = null;
        recUserAfterAuthPopupVM.LJLJL = null;
        ((C244869jG) aqS9S1100100_4.l1).LJLILLLLZI.destroy();
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0006: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS9S1100100_4) (LINE:67108870) kotlin.jvm.internal.AqS9S1100100_4.l1 java.lang.Object, block:B:3:0x0005 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0016: IPUT (r6 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS9S1100100_4) (LINE:67108886) kotlin.jvm.internal.AqS9S1100100_4.l1 java.lang.Object, block:B:7:0x0011 */
    public AqS9S1100100_4(java.lang.String r3, java.lang.String r4, long r5, java.util.HashMap<java.lang.String, java.lang.Object> r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 0: goto L11;
                case 1: goto L11;
                case 2: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r6
            r1.s0 = r3
            r1.j2 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.s0 = r3
            r1.j2 = r4
            r1.l1 = r6
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS9S1100100_4.<init>(java.lang.String, long, java.util.HashMap, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS9S1100100_4(long j, String str, C244869jG c244869jG, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.s0 = str;
        this.l1 = c244869jG;
    }
}
