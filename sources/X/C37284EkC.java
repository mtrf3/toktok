package X;

/* renamed from: X.EkC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C37284EkC {
    public static boolean LIZ;
    public static boolean LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.atomic.AtomicLong, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC70422pa r11, android.content.Context r12, boolean r13, X.InterfaceC67352kd<? super X.OSZ<java.lang.Long, java.lang.Long>> r14) {
        /*
            boolean r0 = r14 instanceof X.C36114EFi
            if (r0 == 0) goto L90
            r8 = r14
            X.EFi r8 = (X.C36114EFi) r8
            int r2 = r8.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r8.LJLJJL = r2
        L12:
            java.lang.Object r4 = r8.LJLJJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJL
            r9 = 0
            r6 = 2
            r10 = 1
            if (r0 == 0) goto L45
            if (r0 == r10) goto L78
            if (r0 != r6) goto L97
            long r1 = r8.LJLJI
            X.2mC r5 = r8.LJLIL
            X.C141335gf.LIZJ(r4)
        L28:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            T r0 = r5.element
            java.util.concurrent.atomic.AtomicLong r0 = (java.util.concurrent.atomic.AtomicLong) r0
            long r0 = r0.get()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r3)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r2, r1)
            return r0
        L45:
            X.2mC r5 = X.C793239k.LIZ(r4)
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r2.<init>(r0)
            r5.element = r2
            long r1 = java.lang.System.currentTimeMillis()
            X.Ek9 r0 = new X.Ek9
            r0.<init>(r5, r12, r9)
            r3 = 3
            X.XKn r4 = X.XKX.LIZIZ(r11, r9, r9, r0, r3)
            X.EkD r0 = new X.EkD
            r0.<init>(r12, r5, r13, r9)
            X.XKn r3 = X.XKX.LIZIZ(r11, r9, r9, r0, r3)
            r8.LJLIL = r5
            r8.LJLILLLLZI = r3
            r8.LJLJI = r1
            r8.LJLJJL = r10
            java.lang.Object r0 = r4.LJJIJ(r8)
            if (r0 != r7) goto L81
            return r7
        L78:
            long r1 = r8.LJLJI
            X.XKn r3 = r8.LJLILLLLZI
            X.2mC r5 = r8.LJLIL
            X.C141335gf.LIZJ(r4)
        L81:
            r8.LJLIL = r5
            r8.LJLILLLLZI = r9
            r8.LJLJI = r1
            r8.LJLJJL = r6
            java.lang.Object r0 = r3.LJI(r8)
            if (r0 != r7) goto L28
            return r7
        L90:
            X.EFi r8 = new X.EFi
            r8.<init>(r14)
            goto L12
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37284EkC.LIZ(X.2pa, android.content.Context, boolean, X.2kd):java.lang.Object");
    }

    public static final void LIZIZ(long j, long j2, boolean z, boolean z2) {
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(j / 52428800, "available_size");
        long j3 = 1024;
        c145995oB.LIZIZ((j2 / j3) / j3, "min_size");
        c145995oB.LJ("is_sd", z);
        c145995oB.LJ("enable_shoot", z2);
        FMX.LJIIL("tool_performance_record_check", c145995oB.LIZ);
    }

    public static final void LIZJ(EnumC36113EFh enumC36113EFh, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        if (C48331Ixz.LIZ() && !C48331Ixz.LIZLLL()) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(j / 52428800, "available_size");
        long j6 = 1024;
        c145995oB.LIZIZ((j2 / j6) / j6, "min_size");
        c145995oB.LJ("is_sd", true);
        c145995oB.LJ("enable_shoot", z);
        c145995oB.LIZ(enumC36113EFh.getValue(), "storage_clean_type");
        c145995oB.LIZIZ((j3 / j6) / j6, "storage_clean_limit");
        c145995oB.LIZIZ((j4 / j6) / j6, "storage_clean_size");
        c145995oB.LIZIZ(j5, "storage_clean_time");
        c145995oB.LJ("open_cache_settings", z2);
        FMX.LJIIL("tool_performance_record_check", c145995oB.LIZ);
    }
}
