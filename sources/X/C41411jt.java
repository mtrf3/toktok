package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41411jt implements C1J6 {
    public final float LIZ;
    public final C0QH LIZIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C41411jt() {
        /*
            r2 = this;
            r1 = 0
            r0 = 7
            r2.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41411jt.<init>():void");
    }

    @Override // X.C1J6
    public final float LIZLLL(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // X.C0Q2
    public final C0QF LIZ(C0QC converter) {
        o.LJIIIZ(converter, "converter");
        return new C1J3(this);
    }

    public C41411jt(float f, float f2, float f3) {
        this.LIZ = f3;
        C0QH c0qh = new C0QH();
        if (f >= 0.0f) {
            c0qh.LJI = f;
            c0qh.LIZJ = false;
            double d = c0qh.LIZIZ;
            if (((float) (d * d)) > 0.0f) {
                c0qh.LIZIZ = Math.sqrt(f2);
                c0qh.LIZJ = false;
                this.LIZIZ = c0qh;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0285, code lost:
    
        if (r20 > com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113 A[EDGE_INSN: B:85:0x0113->B:38:0x0113 BREAK  A[LOOP:2: B:79:0x0235->B:84:?], SYNTHETIC] */
    @Override // X.C1J6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZJ(float r31, float r32, float r33) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41411jt.LIZJ(float, float, float):long");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C41411jt(float r2, float r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L6
            r2 = 1065353216(0x3f800000, float:1.0)
        L6:
            r0 = r4 & 2
            if (r0 == 0) goto Ld
            r3 = 1153138688(0x44bb8000, float:1500.0)
        Ld:
            r0 = r4 & 4
            if (r0 == 0) goto L18
            r0 = 1008981770(0x3c23d70a, float:0.01)
        L14:
            r1.<init>(r2, r3, r0)
            return
        L18:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41411jt.<init>(float, float, int):void");
    }

    @Override // X.C1J6
    public final float LIZIZ(long j, float f, float f2, float f3) {
        C0QH c0qh = this.LIZIZ;
        c0qh.LIZ = f2;
        return Float.intBitsToFloat((int) (c0qh.LIZ(j / 1000000, f, f3) & 4294967295L));
    }

    @Override // X.C1J6
    public final float LJ(long j, float f, float f2, float f3) {
        C0QH c0qh = this.LIZIZ;
        c0qh.LIZ = f2;
        return Float.intBitsToFloat((int) (c0qh.LIZ(j / 1000000, f, f3) >> 32));
    }
}
