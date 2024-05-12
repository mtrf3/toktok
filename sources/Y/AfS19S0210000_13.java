package Y;

import X.AbstractC75865Tq1;
import X.C05630Jz;
import X.C0NB;
import X.C29306Beo;
import X.C32014ChO;
import X.C58416MwG;
import X.C65618Pp8;
import X.C75516TkO;
import X.C75688TnA;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76272Twa;
import X.C76278Twg;
import X.C76279Twh;
import X.C76324TxQ;
import X.C8E;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC76313TxF;
import X.InterfaceC76675U7j;
import X.InterfaceC76768UAy;
import X.U4C;
import X.U7T;
import X.X1D;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelResult;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkJoinChannelExceptionOptSetting;
import java.util.Iterator;
import kotlin.jvm.internal.AqS102S0300000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AfS19S0210000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS19S0210000_13 afS19S0210000_13, Object obj) {
        if (!afS19S0210000_13.z2) {
            C8E.LIZLLL().LJJJJJ("randomLinkMicCancelMatch", true);
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LIZ(0, "err_code", jSONObject);
        C58416MwG c58416MwG = C58416MwG.LIZLLL;
        c58416MwG.LIZ("cancel_match", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C05630Jz.LJI(jSONObject2, "end_reason", "cancel_match");
        C75688TnA c75688TnA = (C75688TnA) afS19S0210000_13.l0;
        boolean z = afS19S0210000_13.z2;
        c75688TnA.LJIIJJI();
        AbstractC75865Tq1.LJIIIZ(c75688TnA.LIZIZ, "is_match_success", Integer.valueOf(z ? 1 : 0), true);
        c75688TnA.LJIILLIIL("auto_match_cancel_succeed");
        if (!afS19S0210000_13.z2) {
            c58416MwG.LIZIZ(2, jSONObject2);
        }
        ((InterfaceC65784Pro) afS19S0210000_13.l1).invoke();
    }

    public static final void accept$1(AfS19S0210000_13 afS19S0210000_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C76271TwZ.LIZ.LJJJJJ(throwable, afS19S0210000_13.z2);
        C0NB.LJIIIZ("MultiMatchViewAnchorPre", "punish, failed");
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS19S0210000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C76278Twg) afS19S0210000_13.l1).LJIIIIZZ(throwable);
    }

    public static final void accept$2(AfS19S0210000_13 afS19S0210000_13, Object obj) {
        Throwable throwable = (Throwable) obj;
        o.LJIIIZ(throwable, "throwable");
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "punish, failed");
        boolean z = afS19S0210000_13.z2;
        JSONObject jSONObject = new JSONObject();
        C76272Twa c76272Twa = C76272Twa.LIZ;
        c76272Twa.LJIIL(throwable, jSONObject);
        C05630Jz.LJI(jSONObject, "cut_short", String.valueOf(z ? 1 : 0));
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C76272Twa.LJIIJ);
        C76272Twa.LJIJJ(jSONObject, false);
        C76272Twa.LJJJLIIL(c76272Twa, "punish_finish_failed", jSONObject, false, null, 48);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS19S0210000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C76279Twh) afS19S0210000_13.l1).LJIIIIZZ(throwable);
    }

    public static final void accept$3(AfS19S0210000_13 afS19S0210000_13, Object obj) {
        int i;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS19S0210000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        ((C76279Twh) afS19S0210000_13.l1).LJJI();
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "cancel, success");
        boolean z = afS19S0210000_13.z2;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C76272Twa.LJFF);
        C76272Twa c76272Twa = C76272Twa.LIZ;
        C76272Twa.LJIJJ(jSONObject, z);
        C76272Twa.LJJJLIIL(c76272Twa, "cancel_succeed", jSONObject, false, null, 60);
        if (afS19S0210000_13.z2) {
            i = 2;
        } else {
            i = 1;
        }
        C76265TwT.LJII(i, "cancel_success");
        C76324TxQ.LIZJ();
    }

    public static final void accept$4(AfS19S0210000_13 afS19S0210000_13, Object obj) {
        Throwable th = (Throwable) obj;
        C76272Twa.LJJIJIL(th, afS19S0210000_13.z2);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) afS19S0210000_13.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C0NB.LJIIIZ("TwoMatchViewAnchorPrese", "cancel, failed");
        InterfaceC76313TxF interfaceC76313TxF = (InterfaceC76313TxF) ((C76279Twh) afS19S0210000_13.l1).LIZLLL;
        if (interfaceC76313TxF != null) {
            interfaceC76313TxF.LJII(th, afS19S0210000_13.z2);
        }
        if (th != null) {
            ((C76279Twh) afS19S0210000_13.l1).LJIIIIZZ(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x025e, code lost:
    
        if (r10 == null) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$5(Y.AfS19S0210000_13 r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS19S0210000_13.accept$5(Y.AfS19S0210000_13, java.lang.Object):void");
    }

    public static final void accept$6(AfS19S0210000_13 afS19S0210000_13, Object obj) {
        String str;
        Throwable it = (Throwable) obj;
        String LJJJJI = U7T.LJJJJI(1541);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinChannel error ");
        if (it != null) {
            str = it.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        C32014ChO.LIZJ(LJJJJI, X1D.LIZIZ(LIZ), null);
        if (!afS19S0210000_13.z2 || C29306Beo.LJIL(U4C.LIZ("listchange_optimize"))) {
            ((U7T) afS19S0210000_13.l0).LJJJLL(0);
            ((U7T) afS19S0210000_13.l0).LJIIIZ.LJIIIZ("join_channel_error");
            U7T u7t = (U7T) afS19S0210000_13.l0;
            Iterator<InterfaceC76675U7j> it2 = u7t.LJIIIIZZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJJJJI(u7t);
            }
            C29306Beo.LJJJ(new AqS102S0300000_13(it, (Throwable) afS19S0210000_13.l1, (InterfaceC76768UAy<JoinChannelResult>) afS19S0210000_13.l0, (U7T) 14));
        }
        if (LinkmicSdkJoinChannelExceptionOptSetting.INSTANCE.isOpt()) {
            C75516TkO c75516TkO = C75516TkO.LIZ;
            o.LJIIIIZZ(it, "it");
            c75516TkO.LIZIZ(50001, "multi_guest guest join channel failed", it, C65618Pp8.of("mCurrentUserId", String.valueOf(((U7T) afS19S0210000_13.l0).LJIILIIL), "mChannelId", String.valueOf(((U7T) afS19S0210000_13.l0).LJI)));
        }
        U7T.LJJIII(((U7T) afS19S0210000_13.l0).LJJJJLI);
        ((U7T) afS19S0210000_13.l0).LJJJJLI = null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS19S0210000_13(X.C76279Twh r2, X.InterfaceC65784Pro r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 2: goto L10;
                case 3: goto L5;
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.z2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.z2 = r4
            r0.l0 = r3
            r0.l1 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS19S0210000_13.<init>(X.Twh, X.Pro, boolean, int):void");
    }

    public AfS19S0210000_13(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
