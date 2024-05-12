package X;

import android.graphics.Rect;

/* renamed from: X.14i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C270414i {
    public static boolean LIZIZ(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 >= i3 && rect.bottom > i3) || rect.bottom >= rect2.bottom) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 >= i5 && rect.right > i5) || rect.right >= rect2.right) {
                    return false;
                }
                return true;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 <= i7 && rect.top < i7) || rect.top <= rect2.top) {
                return false;
            }
            return true;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 <= i9 && rect.left < i9) || rect.left <= rect2.left) {
            return false;
        }
        return true;
    }

    public static int LIZLLL(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    public static int LJ(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r10.bottom <= r12.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r2 = LIZLLL(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r9 == 33) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r9 == 66) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r9 != 130) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r1 = r12.bottom;
        r0 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r2 >= java.lang.Math.max(1, r1 - r0)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r1 = r12.right;
        r0 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r1 = r10.top;
        r0 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r10.top >= r12.bottom) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r1 = LIZIZ(r9, r10, r11)
            boolean r0 = LIZIZ(r9, r10, r12)
            r8 = 0
            if (r0 != 0) goto Ld
            if (r1 != 0) goto Le
        Ld:
            return r8
        Le:
            r3 = 1
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7 = 130(0x82, float:1.82E-43)
            r5 = 33
            r4 = 66
            r0 = 17
            if (r9 == r0) goto L5b
            if (r9 == r5) goto L48
            if (r9 == r4) goto L62
            if (r9 != r7) goto L55
            int r1 = r10.bottom
            int r0 = r12.top
            if (r1 > r0) goto L69
        L27:
            int r2 = LIZLLL(r9, r10, r11)
            if (r9 == r5) goto L43
            if (r9 == r4) goto L3e
            if (r9 != r7) goto L4f
            int r1 = r12.bottom
            int r0 = r10.bottom
        L35:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            if (r2 >= r0) goto L3d
            r8 = 1
        L3d:
            return r8
        L3e:
            int r1 = r12.right
            int r0 = r10.right
            goto L35
        L43:
            int r1 = r10.top
            int r0 = r12.top
            goto L35
        L48:
            int r1 = r10.top
            int r0 = r12.bottom
            if (r1 < r0) goto L69
            goto L27
        L4f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L5b:
            int r1 = r10.left
            int r0 = r12.right
            if (r1 < r0) goto L69
            goto L68
        L62:
            int r1 = r10.right
            int r0 = r12.left
            if (r1 > r0) goto L69
        L68:
            return r3
        L69:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270414i.LIZ(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }
}
