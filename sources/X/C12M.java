package X;

import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.12M, reason: invalid class name */
/* loaded from: classes.dex */
public class C12M {
    public C12F LIZ;
    public final /* synthetic */ C12U LIZIZ;

    public void LIZ(C12M c12m) {
        this.LIZIZ.LJJIIJZLJL = System.currentTimeMillis();
    }

    public void LIZIZ(C12M c12m) {
        this.LIZIZ.LJIILL = false;
    }

    public boolean LIZJ(C12F cmd) {
        o.LJIIIZ(cmd, "cmd");
        int i = C12L.LIZ[cmd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        C12U c12u = this.LIZIZ;
                        C12U.LJJI(c12u, c12u.LJJJJJL, null, 6);
                    } else {
                        C12U c12u2 = this.LIZIZ;
                        C12U.LJJI(c12u2, c12u2.LJJJI, null, 6);
                    }
                } else {
                    C12U c12u3 = this.LIZIZ;
                    C12U.LJJI(c12u3, c12u3.LJJJIL, null, 6);
                }
            } else {
                C12U c12u4 = this.LIZIZ;
                C12U.LJJI(c12u4, c12u4.LJJJ, null, 6);
            }
        } else {
            C12U c12u5 = this.LIZIZ;
            C12U.LJJI(c12u5, c12u5.LJJIZ, null, 6);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, r0) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.CWR
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L1f
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r7
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r5)
            java.lang.String r0 = "remind param should be TipMessage ! current is"
            java.lang.String r1 = X.C16880lQ.LLLZ(r0, r1)
            java.lang.String r0 = "format(format, *args)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "GameUiStateMachine"
            X.C0NB.LJ(r0, r1)
            return
        L1f:
            X.CWR r7 = (X.CWR) r7
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r7.LIZLLL
            r2 = 0
            if (r0 == 0) goto L2d
            java.lang.String r1 = r0.punishId
        L28:
            int r0 = r7.LIZJ
            if (r0 >= 0) goto L2f
            return
        L2d:
            r1 = r2
            goto L28
        L2f:
            X.12a[] r3 = X.EnumC264412a.values()
            int r0 = r7.LIZJ
            r3 = r3[r0]
            int r0 = r3.getPriority()
            if (r0 != r5) goto L6b
            X.12U r0 = r6.LIZIZ
            X.12v r0 = r0.LIZLLL
            if (r0 == 0) goto L57
            X.12a r0 = r0.LJJJJL()
            if (r3 != r0) goto L57
            X.12U r0 = r6.LIZIZ
            X.12v r0 = r0.LIZLLL
            X.12a r0 = r0.LJJJJL()
            boolean r0 = X.C264512b.LIZIZ(r3, r0)
            if (r0 == 0) goto L6b
        L57:
            if (r1 == 0) goto Laa
            X.12U r0 = r6.LIZIZ
            X.CWR r0 = r0.LJJIJ
            if (r0 == 0) goto La8
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r0.LIZLLL
            if (r0 == 0) goto La8
            java.lang.String r0 = r0.punishId
        L65:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto Laa
        L6b:
            X.12a r0 = X.EnumC264412a.LIVE_TIP_MESSAGE_MUTING_TIP
            if (r3 != r0) goto L73
            X.12U r0 = r6.LIZIZ
            r0.LJJIIZ = r4
        L73:
            X.12U r0 = r6.LIZIZ
            X.12v r0 = r0.LIZLLL
            if (r0 == 0) goto L9d
            X.12a r0 = r0.LJJJJL()
            if (r3 != r0) goto L9d
            X.12U r0 = r6.LIZIZ
            X.12v r0 = r0.LIZLLL
            boolean r0 = r0.LLIIIJ()
            if (r0 == 0) goto L9d
            if (r1 == 0) goto L9e
            X.12U r0 = r6.LIZIZ
            X.CWR r0 = r0.LJJIIZI
            if (r0 == 0) goto L97
            com.bytedance.android.livesdk.model.message.PunishEventInfo r0 = r0.LIZLLL
            if (r0 == 0) goto L97
            java.lang.String r2 = r0.punishId
        L97:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r2)
            if (r0 != 0) goto L9e
        L9d:
            return
        L9e:
            X.12U r0 = r6.LIZIZ
            X.12v r0 = r0.LIZLLL
            if (r0 == 0) goto L9d
            r0.LJJJZ()
            goto L9d
        La8:
            r0 = r2
            goto L65
        Laa:
            X.12U r0 = r6.LIZIZ
            X.12v r0 = r0.LIZLLL
            if (r0 == 0) goto L6b
            r0.LJJJJJ(r3)
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12M.LIZLLL(java.lang.Object):void");
    }

    public final void LJ(Object obj) {
        View view;
        if (!(obj instanceof CWR)) {
            String LLLZ = C16880lQ.LLLZ("remind param should be TipMessage ! current is", Arrays.copyOf(new Object[]{obj}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            C0NB.LJ("GameUiStateMachine", LLLZ);
            return;
        }
        CWR cwr = (CWR) obj;
        if (cwr.LIZJ < 0) {
            return;
        }
        C45101pq c45101pq = this.LIZIZ.LIZIZ.LIZ;
        if (c45101pq != null && !(!c45101pq.LJLJL) && ((view = c45101pq.LJLJJI) == null || view.getParent() == null)) {
            C29306Beo.LJIIIZ(this.LIZIZ.LIZIZ.LIZIZ());
            this.LIZIZ.LIZIZ.LIZLLL();
        }
        CharSequence charSequence = cwr.LIZ;
        EnumC264412a enumC264412a = EnumC264412a.values()[cwr.LIZJ];
        InterfaceC266512v interfaceC266512v = this.LIZIZ.LIZLLL;
        if (interfaceC266512v != null && interfaceC266512v.LJIILLIIL() == 0 && enumC264412a.getPriority() != 0) {
            return;
        }
        InterfaceC266512v interfaceC266512v2 = this.LIZIZ.LIZLLL;
        if (interfaceC266512v2 != null && interfaceC266512v2.LJIILLIIL() == 1) {
            C12U c12u = this.LIZIZ;
            c12u.LJJIJ = c12u.LJJIIZI;
        }
        C12U c12u2 = this.LIZIZ;
        c12u2.LJJIIZI = cwr;
        if (enumC264412a == EnumC264412a.LIVE_TIP_MESSAGE_MUTING_TIP) {
            c12u2.LJJIIZ = true;
            c12u2.LJJIJIIJI = charSequence;
        }
        c12u2.LIZLLL();
        C2H0 c2h0 = this.LIZIZ.LJII;
        if (c2h0 != null) {
            c2h0.LLLZI(false);
        }
        C12U c12u3 = this.LIZIZ;
        InterfaceC266512v interfaceC266512v3 = c12u3.LIZLLL;
        if (interfaceC266512v3 != null) {
            interfaceC266512v3.LJJJJZ(enumC264412a, charSequence, o.LJ(this, c12u3.LJJJI), cwr.LJ);
        }
        C0RI c0ri = this.LIZIZ.LJIIIZ;
        if (c0ri != null) {
            c0ri.LIZIZ.LJJLL(false);
        }
        this.LIZIZ.LIZLLL();
        if (cwr.LIZLLL != null || cwr.LIZJ == EnumC264412a.LIVE_TIP_CONTROL_MESSAGE_SUSPENDED_TIP.ordinal()) {
            C24180xC.LIZIZ("show", cwr.LIZLLL);
        }
        Object obj2 = cwr.LJ;
        if (obj2 instanceof C31977Cgn) {
            int i = cwr.LIZJ;
            if (i == EnumC264412a.LIVE_TIP_GAMING_GOODY_BAG.ordinal()) {
                C0E5.LIZIZ("goody_bag", ((C31977Cgn) obj2).LIZ);
                return;
            }
            if (i == EnumC264412a.LIVE_TIP_GAMING_TREASURE.ordinal()) {
                C0E5.LIZIZ("treasure_box", ((C31977Cgn) obj2).LIZ);
            } else if (i == EnumC264412a.LIVE_TIP_GAMING_SUB_GOAL.ordinal()) {
                C0E5.LIZIZ("sub_goal", ((C31977Cgn) obj2).LIZ);
            } else {
                if (i != EnumC264412a.LIVE_TIP_GAMING_LIVE_GOAL.ordinal()) {
                    return;
                }
                C0E5.LIZIZ("live_goal", ((C31977Cgn) obj2).LIZ);
            }
        }
    }

    public C12M(C12U c12u, String str) {
        this.LIZIZ = c12u;
    }
}
