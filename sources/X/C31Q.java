package X;

import Y.AfS53S0100000_1;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.31Q */
/* loaded from: classes2.dex */
public final class C31Q implements C31Y {
    public static final C31Q LJIILLIIL = C31W.LIZ;
    public boolean LIZJ;
    public final C62822Ol8 LJI;
    public final List<C109544Rq> LJII;
    public C76002ya LJIIIIZZ;
    public C76022yc LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C31R.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C31S.LJLIL);
    public boolean LIZLLL = true;
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1028));
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C31U.LJLIL);

    public final void LIZIZ() {
        boolean z;
        boolean z2 = false;
        if ((this.LJIILIIL != -1 || !C75912yR.LIZ()) && this.LJIILJJIL != -1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIIJ != -1) {
            z2 = true;
        }
        if (z && z2) {
            LJIIL(this, 0L, 3);
        }
    }

    public final void LIZJ() {
        List<InterfaceC75962yW> LLJI;
        List<C771931f> LLJI2;
        this.LJII.clear();
        C3GW c3gw = C3GW.LIZ;
        List<C771931f> list = C3GW.LIZJ;
        int size = list.size();
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        if (C772631m.LIZ()) {
            onEventV3.LIZIZ("im_inner_push_queue_clear", C113554cx.LJJL(new OSZ("is_assemble", "1"), new OSZ("count", String.valueOf(size))));
        }
        C112464bC.LIZJ("cleared", list.size());
        synchronized (c3gw) {
            LLJI = ORZ.LLJI(C3GW.LIZLLL);
        }
        if (!LLJI.isEmpty()) {
            for (InterfaceC75962yW interfaceC75962yW : LLJI) {
                List<C771931f> assembleUnitList = C3GW.LIZJ;
                o.LJIIIIZZ(assembleUnitList, "assembleUnitList");
                synchronized (assembleUnitList) {
                    LLJI2 = ORZ.LLJI(assembleUnitList);
                }
                interfaceC75962yW.LIZ(LLJI2);
            }
        }
        C3GW.LIZJ.clear();
    }

    public final C118534kz LJ() {
        return (C118534kz) this.LJ.getValue();
    }

    public final long LJFF() {
        return ((Number) this.LIZ.getValue()).longValue();
    }

    public final C112444bA LJI() {
        return (C112444bA) this.LJFF.getValue();
    }

    public C31Q() {
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJI = C221108m2.LIZIZ(C31T.LJLIL);
        this.LJII = FII.LIZ();
        this.LJIIJ = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        c73318Sq2.LIZ(C84763XOl.LIZLLL().LJJJJZI(new AfS53S0100000_1(this, 102)));
        c73318Sq2.LIZ(C84763XOl.LJI().LJJJJZI(new AfS53S0100000_1(this, 103)));
    }

    public static MBA LJIIIIZZ() {
        if (C3TX.LIZ()) {
            return (MBA) C771431a.LIZ().LL.getValue();
        }
        return C78613UtF.LIZJ;
    }

    public final boolean LJII() {
        if (LJI().LJII || LJI().LJFF || LJI().LJI) {
            return false;
        }
        if (C31V.LIZ() != 2 && !this.LJIILL) {
            return false;
        }
        return true;
    }

    @Override // X.C31Y
    public final void LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                LIZJ();
                C3GW.LIZ.LIZLLL();
                return;
            }
            if (!this.LIZJ) {
                return;
            }
            C3GW.LIZ.LIZLLL();
            return;
        }
        if (this.LIZLLL) {
            LJIIL(this, LJFF(), 2);
            this.LIZLLL = false;
        } else {
            LJIIL(this, 1000L, 2);
        }
    }

    public final boolean LIZLLL(int i, List list) {
        if (((ArrayList) list).isEmpty() || LJ().LIZJ == 2) {
            return false;
        }
        C31Z type = C31Z.ASSEMBLE;
        o.LJIIIZ(type, "type");
        type.enqueueConversations(list, i);
        return true;
    }

    public final void LJIIIZ(int i, long j) {
        if (i != 3) {
            if (i != 9) {
                if (i == 10) {
                    this.LJIILJJIL = SystemClock.elapsedRealtime() - j;
                }
            } else {
                this.LJIILIIL = SystemClock.elapsedRealtime() - j;
            }
        } else {
            this.LJIIJ = SystemClock.elapsedRealtime() - j;
        }
        if (LJII()) {
            LIZIZ();
        }
    }

    public final void LJIIJJI(long j, boolean z) {
        if (z) {
            this.LJIILL = true;
            if (LJII()) {
                LIZIZ();
                return;
            }
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C75842yK(j, this, null), 3);
    }

    public final List LJIILIIL(int i, List list) {
        long j;
        if (!C84763XOl.LJIIJJI) {
            C112464bC.LIZJ("trying_enqueue", list.size());
            if (LJ().LIZJ == 2 || !C31D.LIZIZ()) {
                LJIILJJIL(this, null, list, 1);
            }
        }
        if (list.isEmpty() || LJ().LIZJ == 2) {
            return C61878OQg.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C109544Rq msg = (C109544Rq) obj;
            C771931f.LJI.getClass();
            o.LJIIIZ(msg, "msg");
            if (!C4YR.LIZIZ(msg, C99033ud.Companion) && !msg.isSelf() && msg.getReadStatus() != 1 && !o.LJ(msg.getExt().get("a:disable_inner_push"), "1") && (C00F.LIZ(31744, 0, "internal_share_holdout_receiver_receiver_side", true) <= 0 || (msg.getMsgType() != 8 && msg.getMsgType() != 11))) {
                if (!C4LS.LIZIZ() || (msg.getMsgType() != 5 && msg.getMsgType() != 1805)) {
                    arrayList.add(obj);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C112464bC.LIZJ("enqueued", arrayList.size());
            if (i == 9 || i == 10) {
                C3GW.LJ(C31Z.ASSEMBLE, arrayList, i);
            } else if (this.LIZJ) {
                C3GW.LJ(C31Z.ASSEMBLE, arrayList, i);
            } else if (i == 3) {
                C3GW.LJ(C31Z.ASSEMBLE, arrayList, i);
                if (!LJI().LJII) {
                    j = LJFF();
                } else {
                    j = 30000;
                }
                LJIIL(this, j, 2);
            } else {
                C3GW.LJ(C31Z.NORMAL, arrayList, i);
                LIZJ();
                LJIIL(this, 1000L, 2);
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public static void LJIIJ(C31Q c31q, String str, int i) {
        c31q.getClass();
        C118534kz LJ = c31q.LJ();
        LJ.getClass();
        if (i == 0) {
            LJ.LIZIZ.remove(str);
        } else {
            LJ.LIZIZ.put(str, Integer.valueOf(i));
        }
        int LIZ = LJ.LIZ();
        if (LJ.LIZJ != LIZ) {
            LJ.LIZJ = LIZ;
            LJ.LIZ.LIZ(LIZ);
        }
    }

    public static /* synthetic */ void LJIIL(C31Q c31q, long j, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c31q.LJIIJJI(j, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0067, code lost:
    
        if (r7.longValue() > ((com.bytedance.keva.Keva) r6.LJI.getValue()).getLong("index_of_latest_message_consumed_by_push", Long.MIN_VALUE)) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(X.C31Q r6, java.lang.Long r7, java.util.List r8, int r9) {
        /*
            r0 = r9 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r7 = r1
        L6:
            r0 = r9 & 2
            if (r0 == 0) goto Lb
            r8 = r1
        Lb:
            monitor-enter(r6)
            if (r7 != 0) goto L69
            if (r8 == 0) goto L7a
            java.util.Iterator r4 = r8.iterator()     // Catch: java.lang.Throwable -> L7c
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L7c
            r2 = -9223372036854775808
            if (r0 != 0) goto L1d
            goto L7a
        L1d:
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L7c
            X.4Rq r0 = (X.C109544Rq) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L4e
            long r0 = r0.getIndex()     // Catch: java.lang.Throwable -> L7c
        L29:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L7c
        L2d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L51
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L7c
            X.4Rq r0 = (X.C109544Rq) r0     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L4b
            long r0 = r0.getIndex()     // Catch: java.lang.Throwable -> L7c
        L3f:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L7c
            int r0 = r7.compareTo(r1)     // Catch: java.lang.Throwable -> L7c
            if (r0 >= 0) goto L2d
            r7 = r1
            goto L2d
        L4b:
            r0 = -9223372036854775808
            goto L3f
        L4e:
            r0 = -9223372036854775808
            goto L29
        L51:
            if (r7 == 0) goto L7a
            long r4 = r7.longValue()     // Catch: java.lang.Throwable -> L7c
            X.Ol8 r0 = r6.LJI     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L7c
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "index_of_latest_message_consumed_by_push"
            long r1 = r1.getLong(r0, r2)     // Catch: java.lang.Throwable -> L7c
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7a
        L69:
            long r2 = r7.longValue()     // Catch: java.lang.Throwable -> L7c
            X.Ol8 r0 = r6.LJI     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L7c
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = "index_of_latest_message_consumed_by_push"
            r1.storeLong(r0, r2)     // Catch: java.lang.Throwable -> L7c
        L7a:
            monitor-exit(r6)
            return
        L7c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31Q.LJIILJJIL(X.31Q, java.lang.Long, java.util.List, int):void");
    }
}
