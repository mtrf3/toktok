package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.Zg1, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90533Zg1 {
    public final int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final /* synthetic */ C90534Zg2 LJIIIZ;

    public final void LIZ() {
        C90534Zg2 c90534Zg2 = this.LJIIIZ;
        int[] iArr = c90534Zg2.LIZ;
        int[] iArr2 = c90534Zg2.LIZIZ;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = LiveLayoutPreloadThreadPriority.DEFAULT;
        int i5 = LiveLayoutPreloadThreadPriority.DEFAULT;
        int i6 = LiveLayoutPreloadThreadPriority.DEFAULT;
        int i7 = 0;
        for (int i8 = this.LIZ; i8 <= this.LIZIZ; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        this.LIZLLL = i;
        this.LJ = i4;
        this.LJFF = i2;
        this.LJI = i5;
        this.LJII = i3;
        this.LJIIIIZZ = i6;
        this.LIZJ = i7;
    }

    public C90533Zg1(C90534Zg2 c90534Zg2, int i, int i2) {
        this.LJIIIZ = c90534Zg2;
        this.LIZ = i;
        this.LIZIZ = i2;
        LIZ();
    }
}
