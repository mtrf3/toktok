package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.VTx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79809VTx implements InterfaceC04630Gd {
    public final /* synthetic */ C79802VTq LIZ;

    public C79809VTx(C79802VTq c79802VTq) {
        this.LIZ = c79802VTq;
    }

    @Override // X.InterfaceC04630Gd
    public final void LIZ() {
        C79810VTy c79810VTy = this.LIZ.LIZ.LLD;
        c79810VTy.getClass();
        long nanoTime = System.nanoTime();
        long j = c79810VTy.LIZ;
        if (j != 0) {
            long[] jArr = c79810VTy.LIZIZ;
            int i = c79810VTy.LIZJ;
            jArr[i] = nanoTime - j;
            c79810VTy.LIZJ = i + 1;
            c79810VTy.LIZLLL++;
        }
        c79810VTy.LIZ = nanoTime;
        int i2 = c79810VTy.LIZJ;
        long[] jArr2 = c79810VTy.LIZIZ;
        if (i2 != jArr2.length || jArr2.length == 0) {
            return;
        }
        int length = jArr2.length;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            d += jArr2[i3];
            c79810VTy.LIZIZ[i4] = 0;
            i3++;
            i4++;
        }
        double d2 = c79810VTy.LJ;
        c79810VTy.LJ = ((d2 * (r4 - c79810VTy.LIZJ)) + d) / c79810VTy.LIZLLL;
        c79810VTy.LIZJ = 0;
    }
}
