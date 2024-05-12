package X;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;

/* renamed from: X.VQr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public enum EnumC79725VQr {
    SOLID,
    DASHED,
    DOTTED,
    DOUBLE,
    GROOVE,
    RIDGE,
    INSET,
    OUTSET,
    HIDDEN,
    NONE;

    public boolean isSolidDashedOrDotted() {
        int i = C79731VQx.LIZ[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public static EnumC79725VQr parse(int i) {
        if (i < 0 || i > NONE.ordinal()) {
            return null;
        }
        return values()[i];
    }

    public static EnumC79725VQr valueOf(String str) {
        return (EnumC79725VQr) V0N.LJJJ(EnumC79725VQr.class, str);
    }

    public PathEffect getPathEffect(float f) {
        int i = C79731VQx.LIZ[ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
        }
        float f2 = f * 3.0f;
        return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
    }

    public PathEffect getPathEffectAutoAdjust(float f, float f2) {
        int i;
        if (this != DASHED && this != DOTTED) {
            return null;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (this == DOTTED) {
            i = 2;
        } else {
            i = 6;
        }
        int i2 = (((int) (((f2 / ((f * i) * 0.5f)) - 0.5f) * 0.5f)) * 2) + 1;
        if (i2 <= 1) {
            return null;
        }
        float f3 = f2 / i2;
        return new DashPathEffect(new float[]{f3, f3}, 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r3 == 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r3 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r0 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r0 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        if (r3 == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        if (r3 == 1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(android.graphics.Canvas r10, android.graphics.Paint r11, int r12, float r13, float r14, int r15, int r16, float r17, float r18, float r19, float r20) {
        /*
            r0 = 0
            r9 = r11
            r9.setPathEffect(r0)
            r9.setStrokeWidth(r13)
            r3 = -1
        L9:
            r4 = 1
            if (r3 > r4) goto L48
            r2 = 0
            if (r12 == 0) goto L3a
            if (r12 == r4) goto L2c
            r0 = 2
            if (r12 == r0) goto L40
            r0 = 3
            if (r12 == r0) goto L32
            r0 = 0
            r2 = 0
        L19:
            r1 = 0
        L1a:
            r9.setColor(r0)
            float r5 = r17 + r2
            float r6 = r18 + r1
            float r7 = r19 + r2
            float r8 = r20 + r1
            r4 = r10
            r4.drawLine(r5, r6, r7, r8, r9)
            int r3 = r3 + 2
            goto L9
        L2c:
            float r1 = (float) r3
            float r1 = r1 * r14
            if (r3 != r4) goto L37
        L30:
            r0 = r15
            goto L1a
        L32:
            float r1 = -r14
            float r0 = (float) r3
            float r1 = r1 * r0
            if (r3 != r4) goto L30
        L37:
            r0 = r16
            goto L1a
        L3a:
            float r2 = (float) r3
            float r2 = r2 * r14
            if (r3 != r4) goto L45
        L3e:
            r0 = r15
            goto L19
        L40:
            float r2 = -r14
            float r0 = (float) r3
            float r2 = r2 * r0
            if (r3 != r4) goto L3e
        L45:
            r0 = r16
            goto L19
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC79725VQr.LIZJ(android.graphics.Canvas, android.graphics.Paint, int, float, float, int, int, float, float, float, float):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (r31 != 2) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r31 != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r31 != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r31 != 2) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0031. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void strokeBorderLine(android.graphics.Canvas r29, android.graphics.Paint r30, int r31, float r32, int r33, float r34, float r35, float r36, float r37, float r38, float r39) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC79725VQr.strokeBorderLine(android.graphics.Canvas, android.graphics.Paint, int, float, int, float, float, float, float, float, float):void");
    }
}
