package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Oz4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63686Oz4<T> {
    public final InterfaceC70422pa LIZ;
    public final C114454eP LIZIZ;
    public final AtomicBoolean LIZJ;
    public final PthreadTimer LIZLLL;
    public final Object LJ;
    public int LJFF;

    public final void LIZJ() {
        C63322OtC.LJI("SendMessageQueue", "Resume queue", null);
        this.LIZJ.set(false);
        synchronized (this.LJ) {
            this.LJFF = 0;
        }
    }

    public C63686Oz4(C64962gm c64962gm) {
        C114454eP c114454eP = new C114454eP(0);
        this.LIZ = c64962gm;
        this.LIZIZ = c114454eP;
        this.LIZJ = new AtomicBoolean(false);
        this.LIZLLL = new PthreadTimer("SendMessageQueueTimer");
        this.LJ = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC67352kd<? super X.C76800UCe> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C63689Oz7
            if (r0 == 0) goto L7a
            r7 = r9
            X.Oz7 r7 = (X.C63689Oz7) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 != r5) goto L9e
            X.Oz4 r2 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L23:
            X.34K r0 = new X.34K
            r0.<init>()
            java.lang.Object r1 = r2.LJ
            monitor-enter(r1)
            goto L80
        L2c:
            X.C141335gf.LIZJ(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.LIZJ
            r0.compareAndSet(r4, r5)
            X.2zl r3 = new X.2zl
            r3.<init>()
            java.lang.Object r2 = r8.LJ
            monitor-enter(r2)
            X.4eP r0 = r8.LIZIZ     // Catch: java.lang.Throwable -> La6
            int r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> La6
            int r0 = r8.LJFF     // Catch: java.lang.Throwable -> La6
            int r0 = r0 + 1
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Throwable -> La6
            r8.LJFF = r0     // Catch: java.lang.Throwable -> La6
            r3.element = r0     // Catch: java.lang.Throwable -> La6
            monitor-exit(r2)
            java.lang.String r2 = "SendMessageQueue"
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Bad network detected from failed request "
            r1.append(r0)
            int r0 = r3.element
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            r0 = 0
            X.C63322OtC.LJI(r2, r1, r0)
            int r0 = r3.element
            long r2 = (long) r0
            X.4eP r0 = r8.LIZIZ
            long r0 = r0.LIZJ
            long r2 = r2 * r0
            r7.LJLIL = r8
            r7.LJLJJI = r5
            java.lang.Object r0 = X.C1JD.LIZJ(r2, r7)
            if (r0 != r6) goto L78
            return r6
        L78:
            r2 = r8
            goto L23
        L7a:
            X.Oz7 r7 = new X.Oz7
            r7.<init>(r8, r9)
            goto L12
        L80:
            int r0 = r2.LJFF     // Catch: java.lang.Throwable -> L9b
            if (r0 <= 0) goto L8c
            int r0 = r0 - r5
            r2.LJFF = r0     // Catch: java.lang.Throwable -> L9b
        L87:
            int r0 = r2.LJFF     // Catch: java.lang.Throwable -> L9b
            if (r0 != 0) goto L8f
            goto L90
        L8c:
            r2.LJFF = r4     // Catch: java.lang.Throwable -> L9b
            goto L87
        L8f:
            r5 = 0
        L90:
            monitor-exit(r1)
            if (r5 == 0) goto L98
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.LIZJ
            r0.set(r4)
        L98:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L9b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63686Oz4.LIZ(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(5:19|20|(2:22|(1:24))(1:25)|14|15))(5:26|27|28|14|15))(1:30))(1:46)|31|(3:34|(2:36|37)(1:38)|32)|39|40|(1:42)(1:45)|(1:44)|28|14|15))|59|6|7|(0)(0)|31|(1:32)|39|40|(0)(0)|(0)|28|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r2 = r13.getFirst().LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
    
        if ((r9 instanceof X.C63599Oxf) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
    
        r1 = ((X.C63599Oxf) r9).getErrorCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        if (r1 == (-1031)) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f5, code lost:
    
        r13.getSecond().LJJ(new X.C63555Owx(r9, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0105, code lost:
    
        r7.LJLIL = r3;
        r7.LJLILLLLZI = r13;
        r7.LJLJI = r9;
        r7.LJLJJI = r2;
        r7.LJLJL = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        if (r3.LIZ(r7) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016b, code lost:
    
        r13.getSecond().LJJ(new X.C63555Owx(r9, r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:27:0x00a0, B:28:0x00a3, B:40:0x0055, B:42:0x008a, B:45:0x0097), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[Catch: Exception -> 0x00d9, TryCatch #0 {Exception -> 0x00d9, blocks: (B:27:0x00a0, B:28:0x00a3, B:40:0x0055, B:42:0x008a, B:45:0x0097), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.OSZ<X.C63690Oz8<T>, ? extends X.InterfaceC43919HLn<X.IV4<T>>> r13, X.InterfaceC67352kd<? super X.C76800UCe> r14) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63686Oz4.LIZLLL(X.OSZ, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[PHI: r1
      0x0024: PHI (r1v5 java.lang.Object) = (r1v4 java.lang.Object), (r1v0 java.lang.Object) binds: [B:17:0x0094, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.XKW r13, X.C63444OvA r14, X.InterfaceC67352kd r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C63688Oz6
            if (r0 == 0) goto L97
            r7 = r15
            X.Oz6 r7 = (X.C63688Oz6) r7
            int r2 = r7.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r7.LJLJJI = r2
        L12:
            java.lang.Object r1 = r7.LJLILLLLZI
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJI
            r6 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L25
            if (r0 == r9) goto L87
            if (r0 != r6) goto L9e
            X.C141335gf.LIZJ(r1)
        L24:
            return r1
        L25:
            X.C141335gf.LIZJ(r1)
            X.XKj r4 = X.C77275UUl.LIZ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Async job created "
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            java.lang.String r3 = "SendMessageQueue"
            X.C63322OtC.LJI(r3, r0, r5)
            X.OSZ r2 = new X.OSZ
            X.Oz8 r11 = new X.Oz8
            X.2pa r0 = r12.LIZ
            X.XKY r10 = X.XKY.LAZY
            X.XKn r1 = X.XKX.LIZ(r0, r13, r10, r14)
            X.2pa r0 = r12.LIZ
            X.XKn r0 = X.XKX.LIZ(r0, r13, r10, r14)
            r11.<init>(r1, r0)
            r2.<init>(r11, r4)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Async job submitted "
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C63322OtC.LJI(r3, r0, r5)
            r7.LJLIL = r4
            r7.LJLJJI = r9
            java.lang.Object r0 = r12.LIZLLL(r2, r7)
            if (r0 != r8) goto L8c
            return r8
        L87:
            X.XKj r4 = r7.LJLIL
            X.C141335gf.LIZJ(r1)
        L8c:
            r7.LJLIL = r5
            r7.LJLJJI = r6
            java.lang.Object r1 = r4.LJI(r7)
            if (r1 != r8) goto L24
            return r8
        L97:
            X.Oz6 r7 = new X.Oz6
            r7.<init>(r12, r15)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63686Oz4.LIZIZ(X.XKW, X.OvA, X.2kd):java.lang.Object");
    }
}
