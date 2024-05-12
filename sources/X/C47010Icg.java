package X;

import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Icg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47010Icg implements InterfaceC47032Id2 {
    public final ITZ LIZ;
    public final C46999IcV LIZIZ;
    public final Queue<HandlerThread> LIZJ;
    public final ArrayList<HandlerThread> LIZLLL;
    public final ArrayList<C47007Icd> LJ;
    public final C62822Ol8 LJFF;
    public ITX LJI;
    public boolean LJII;

    @Override // X.InterfaceC47032Id2
    public final void release() {
        if (this.LJII) {
            return;
        }
        for (HandlerThread handlerThread : this.LIZJ) {
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        }
        ((LinkedList) this.LIZJ).clear();
        this.LIZLLL.clear();
        this.LJII = true;
    }

    public final void LIZJ() {
        int threadPoolInitStrategy = IZ8.LJJIL().getThreadPoolInitStrategy();
        if (threadPoolInitStrategy != 0) {
            if (threadPoolInitStrategy != 1) {
                if (threadPoolInitStrategy != 2) {
                    return;
                }
                LIZLLL(1);
                return;
            } else {
                try {
                    LIZLLL(this.LIZIZ.LJ);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        LIZLLL(this.LIZIZ.LJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a7, code lost:
    
        if (r4 == null) goto L14;
     */
    @Override // X.InterfaceC47032Id2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47007Icd LIZIZ(X.IX4 r10) {
        /*
            r9 = this;
            boolean r0 = r9.LJII
            r3 = 0
            if (r0 == 0) goto La
            r9.LIZJ()
            r9.LJII = r3
        La:
            java.util.Queue<android.os.HandlerThread> r0 = r9.LIZJ
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            java.lang.Object r4 = r0.poll()
            android.os.HandlerThread r4 = (android.os.HandlerThread) r4
            if (r4 != 0) goto L4c
            X.IcV r0 = r9.LIZIZ
            int r2 = r0.LIZLLL
            java.util.Queue<android.os.HandlerThread> r0 = r9.LIZJ
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r1 = r0.size()
            java.util.ArrayList<android.os.HandlerThread> r0 = r9.LIZLLL
            int r0 = r0.size()
            int r0 = r0 + r1
            if (r2 <= r0) goto L8a
            java.util.Queue<android.os.HandlerThread> r0 = r9.LIZJ
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r1 = r0.size()
            java.util.ArrayList<android.os.HandlerThread> r0 = r9.LIZLLL
            int r0 = r0.size()
            int r0 = r0 + r1
            android.os.HandlerThread r4 = new android.os.HandlerThread
            java.lang.String r1 = "explay_thread_"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = kotlin.jvm.internal.o.LJIILLIIL(r0, r1)
            r4.<init>(r0, r3)
            r4.start()
        L4c:
            java.util.ArrayList<android.os.HandlerThread> r0 = r9.LIZLLL
            r0.add(r4)
            java.lang.String r1 = X.C17N.LJJLIIIIJ(r4)
            java.lang.String r0 = "obtain | thread: "
            java.lang.String r0 = kotlin.jvm.internal.o.LJIILLIIL(r1, r0)
            java.lang.String r1 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            X.Icd r2 = new X.Icd
            X.ITZ r3 = r9.LIZ
            X.Ol8 r0 = r9.LJFF
            java.lang.Object r6 = r0.getValue()
            X.Ich r6 = (X.C47011Ich) r6
            X.ITX r7 = r9.LJI
            X.IcV r0 = r9.LIZIZ
            boolean r8 = r0.LJIILJJIL
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.IcV r0 = r9.LIZIZ
            r0.getClass()
            java.lang.String r0 = "obtain | session: "
            java.lang.String r0 = kotlin.jvm.internal.o.LJIILLIIL(r2, r0)
            kotlin.jvm.internal.o.LJIIIZ(r0, r1)
            java.util.ArrayList<X.Icd> r0 = r9.LJ
            r0.add(r2)
            return r2
        L8a:
            java.util.ArrayList<android.os.HandlerThread> r0 = r9.LIZLLL
            int r0 = r0.size()
            if (r0 > 0) goto L99
        L92:
            java.lang.String r0 = "new_create"
            android.os.HandlerThread r4 = X.C06M.LIZ(r0)
            goto L4c
        L99:
            java.util.ArrayList<android.os.HandlerThread> r1 = r9.LIZLLL
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            android.os.HandlerThread r4 = (android.os.HandlerThread) r4
            if (r4 != 0) goto L4c
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47010Icg.LIZIZ(X.IX4):X.Icd");
    }

    public final void LIZLLL(int i) {
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                HandlerThread handlerThread = new HandlerThread(o.LJIILLIIL(Integer.valueOf(i2), "play_thread_"), 0);
                handlerThread.start();
                this.LIZJ.add(handlerThread);
                if (i2 == i) {
                    return;
                } else {
                    i2 = i3;
                }
            }
        }
    }

    public C47010Icg(ITZ playerType, C46999IcV playSessionConfig) {
        o.LJIIIZ(playerType, "playerType");
        o.LJIIIZ(playSessionConfig, "playSessionConfig");
        this.LIZ = playerType;
        this.LIZIZ = playSessionConfig;
        this.LIZJ = new LinkedList();
        this.LIZLLL = new ArrayList<>(playSessionConfig.LIZLLL);
        this.LJ = new ArrayList<>();
        this.LJFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 547));
        LIZJ();
    }
}
