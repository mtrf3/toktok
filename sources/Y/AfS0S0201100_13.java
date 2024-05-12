package Y;

import X.C28467BFf;
import X.C75832TpU;
import X.C76231Tvv;
import X.C76244Tw8;
import X.C76265TwT;
import X.C76271TwZ;
import X.C76732zl;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.U9S;
import X.U9U;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract$AbsView;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS0S0201100_13 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public long j3;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public static final void accept$0(AfS0S0201100_13 afS0S0201100_13, Object obj) {
        long LIZIZ;
        boolean z;
        C28467BFf<Void> it = (C28467BFf) obj;
        C76244Tw8 LJFF = ((C76231Tvv) afS0S0201100_13.l0).LJFF();
        C75832TpU c75832TpU = C75832TpU.LIZ;
        Long valueOf = Long.valueOf(LJFF.LJIIIIZZ);
        List<TeamUsersInfo> list = LJFF.LJIIIZ;
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView = (MultiMatchBeInvitedContract$AbsView) ((C76231Tvv) afS0S0201100_13.l0).LJLILLLLZI;
        int i = 0;
        if (multiMatchBeInvitedContract$AbsView != null && multiMatchBeInvitedContract$AbsView.wl() == 1) {
            LIZIZ = C76265TwT.LIZIZ.LIZIZ();
        } else {
            LIZIZ = C76265TwT.LIZ.LIZIZ();
        }
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView2 = (MultiMatchBeInvitedContract$AbsView) ((C76231Tvv) afS0S0201100_13.l0).LJLILLLLZI;
        if (multiMatchBeInvitedContract$AbsView2 != null && multiMatchBeInvitedContract$AbsView2.wl() == 1) {
            z = true;
        } else {
            z = false;
        }
        c75832TpU.LJJ(false, true, valueOf, list, LIZIZ, z);
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        MultiMatchBeInvitedContract$AbsView multiMatchBeInvitedContract$AbsView3 = (MultiMatchBeInvitedContract$AbsView) ((C76231Tvv) afS0S0201100_13.l0).LJLILLLLZI;
        if (multiMatchBeInvitedContract$AbsView3 != null) {
            i = multiMatchBeInvitedContract$AbsView3.wl();
        }
        long j = afS0S0201100_13.j3;
        o.LJIIIIZZ(it, "it");
        c76271TwZ.LJJL(i, j, it);
        ((InterfaceC88472Yns) afS0S0201100_13.l1).invoke(Boolean.TRUE);
        C76265TwT.LJII(afS0S0201100_13.i2, "reject_success");
    }

    public static final void accept$1(AfS0S0201100_13 afS0S0201100_13, Object obj) {
        C28467BFf<Void> it = (C28467BFf) obj;
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        int i = ((C76732zl) afS0S0201100_13.l0).element;
        long j = afS0S0201100_13.j3;
        o.LJIIIIZZ(it, "it");
        c76271TwZ.LJJL(i, j, it);
        ((InterfaceC88472Yns) afS0S0201100_13.l1).invoke(Boolean.TRUE);
        C76265TwT.LJII(afS0S0201100_13.i2, "reject_success");
    }

    public static final void accept$2(AfS0S0201100_13 afS0S0201100_13, Object obj) {
        Throwable it = (Throwable) obj;
        C76265TwT.LJII(afS0S0201100_13.i2, "reject_failed");
        ((InterfaceC88472Yns) afS0S0201100_13.l0).invoke(Boolean.FALSE);
        C76271TwZ c76271TwZ = C76271TwZ.LIZ;
        int i = ((C76732zl) afS0S0201100_13.l1).element;
        long j = afS0S0201100_13.j3;
        o.LJIIIIZZ(it, "it");
        c76271TwZ.LJJJZ(i, j, it);
    }

    public static final void accept$3(AfS0S0201100_13 afS0S0201100_13, Object obj) {
        String message;
        String message2;
        U9U u9u;
        String message3;
        int i = afS0S0201100_13.i2;
        String str = "";
        if (i != -3) {
            if (i != -2) {
                if (i != -1 || (u9u = ((U9S) afS0S0201100_13.l0).LIZ) == null) {
                    return;
                }
                int i2 = (int) afS0S0201100_13.j3;
                Exception exc = (Exception) afS0S0201100_13.l1;
                if (exc != null && (message3 = exc.getMessage()) != null) {
                    str = message3;
                }
                u9u.LJII(i2, str, (Exception) afS0S0201100_13.l1);
                return;
            }
            U9U u9u2 = ((U9S) afS0S0201100_13.l0).LIZ;
            if (u9u2 == null) {
                return;
            }
            int i3 = (int) afS0S0201100_13.j3;
            Exception exc2 = (Exception) afS0S0201100_13.l1;
            if (exc2 != null && (message2 = exc2.getMessage()) != null) {
                str = message2;
            }
            u9u2.LIZJ(i3, str, (Exception) afS0S0201100_13.l1);
            return;
        }
        U9U u9u3 = ((U9S) afS0S0201100_13.l0).LIZ;
        if (u9u3 == null) {
            return;
        }
        int i4 = (int) afS0S0201100_13.j3;
        Exception exc3 = (Exception) afS0S0201100_13.l1;
        if (exc3 != null && (message = exc3.getMessage()) != null) {
            str = message;
        }
        u9u3.LJFF(i4, str, (Exception) afS0S0201100_13.l1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0159, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x02b1, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0317, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$4(Y.AfS0S0201100_13 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0201100_13.accept$4(Y.AfS0S0201100_13, java.lang.Object):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS0S0201100_13(int r2, long r3, X.InterfaceC88472Yns r5, X.C76732zl r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i2 = r2
            r0.l0 = r5
            r0.l1 = r6
            r0.j3 = r3
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r6
            r0.j3 = r3
            r0.l1 = r5
            r0.i2 = r2
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS0S0201100_13.<init>(int, long, X.Yns, X.2zl, int):void");
    }

    public AfS0S0201100_13(int i, Object obj, long j, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.j3 = j;
        this.l1 = obj2;
    }
}
