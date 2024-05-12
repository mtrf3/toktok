package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.13d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C267313d {
    public View LIZ;
    public int LIZIZ;
    public C11X[] LJII;
    public C37511db LJIIIIZZ;
    public int[] LJIIL;
    public double[] LJIILIIL;
    public double[] LJIILJJIL;
    public String[] LJIILL;
    public int[] LJIILLIIL;
    public HashMap<String, AbstractC267713h> LJIJJLI;
    public HashMap<String, AbstractC267613g> LJIL;
    public HashMap<String, C13X> LJJ;
    public C38151ed[] LJJI;
    public int LIZJ = -1;
    public final C267513f LIZLLL = new C267513f();
    public final C267513f LJ = new C267513f();
    public final C267213c LJFF = new C267213c();
    public final C267213c LJI = new C267213c();
    public float LJIIIZ = Float.NaN;
    public float LJIIJ = 0.0f;
    public float LJIIJJI = 1.0f;
    public final float[] LJIIZILJ = new float[4];
    public final ArrayList<C267513f> LJIJ = new ArrayList<>();
    public final float[] LJIJI = new float[1];
    public final ArrayList<C13R> LJIJJ = new ArrayList<>();
    public int LJJIFFI = -1;

    public final float LIZIZ() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i = 0;
        float f2 = 0.0f;
        do {
            float f3 = i * f;
            double d3 = f3;
            C11Y c11y = this.LIZLLL.LJLIL;
            Iterator<C267513f> it = this.LJIJ.iterator();
            float f4 = Float.NaN;
            float f5 = 0.0f;
            while (it.hasNext()) {
                C267513f next = it.next();
                C11Y c11y2 = next.LJLIL;
                if (c11y2 != null) {
                    float f6 = next.LJLJI;
                    if (f6 < f3) {
                        f5 = f6;
                        c11y = c11y2;
                    } else if (Float.isNaN(f4)) {
                        f4 = next.LJLJI;
                    }
                }
            }
            if (c11y != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                d3 = (((float) c11y.LIZ((f3 - f5) / r11)) * (f4 - f5)) + f5;
            }
            this.LJII[0].LIZJ(this.LJIILIIL, d3);
            this.LIZLLL.LJ(this.LJIIL, this.LJIILIIL, fArr, 0);
            if (i > 0) {
                f2 = (float) (Math.hypot(d2 - fArr[1], d - fArr[0]) + f2);
            }
            d = fArr[0];
            d2 = fArr[1];
            i++;
        } while (i < 100);
        return f2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" start: x: ");
        LIZ.append(this.LIZLLL.LJLJJL);
        LIZ.append(" y: ");
        LIZ.append(this.LIZLLL.LJLJJLL);
        LIZ.append(" end: x: ");
        LIZ.append(this.LJ.LJLJJL);
        LIZ.append(" y: ");
        LIZ.append(this.LJ.LJLJJLL);
        return X1D.LIZIZ(LIZ);
    }

    public C267313d(View view) {
        this.LIZ = view;
        this.LIZIZ = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C018905p) {
        }
    }

    public final void LIZLLL(C267513f c267513f) {
        float x = (int) this.LIZ.getX();
        float y = (int) this.LIZ.getY();
        float width = this.LIZ.getWidth();
        float height = this.LIZ.getHeight();
        c267513f.LJLJJL = x;
        c267513f.LJLJJLL = y;
        c267513f.LJLJL = width;
        c267513f.LJLJLJ = height;
    }

    public final float LIZ(float[] fArr, float f) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.LJIIJJI;
            if (f4 != 1.0d) {
                float f5 = this.LJIIJ;
                if (f < f5) {
                    f = 0.0f;
                }
                if (f > f5 && f < 1.0d) {
                    f = (f - f5) * f4;
                }
            }
        }
        C11Y c11y = this.LIZLLL.LJLIL;
        Iterator<C267513f> it = this.LJIJ.iterator();
        float f6 = Float.NaN;
        while (it.hasNext()) {
            C267513f next = it.next();
            C11Y c11y2 = next.LJLIL;
            if (c11y2 != null) {
                float f7 = next.LJLJI;
                if (f7 < f) {
                    c11y = c11y2;
                    f2 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = next.LJLJI;
                }
            }
        }
        if (c11y != null) {
            if (!Float.isNaN(f6)) {
                f3 = f6;
            }
            float f8 = f3 - f2;
            double d = (f - f2) / f8;
            f = (((float) c11y.LIZ(d)) * f8) + f2;
            if (fArr != null) {
                fArr[0] = (float) c11y.LIZIZ(d);
            }
        }
        return f;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 768
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final void LJ(long r41, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 3692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267313d.LJ(long, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0382  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(float r29, long r30, android.view.View r32, X.C13T r33) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C267313d.LIZJ(float, long, android.view.View, X.13T):boolean");
    }
}
