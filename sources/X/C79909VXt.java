package X;

import Y.ARunnableS12S0301000_12;
import android.app.Activity;
import android.graphics.Rect;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.VXt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79909VXt {
    public static final int LJIIL = C78688UuS.LJIILIIL(5);
    public static final int LJIILIIL = C78688UuS.LJIILIIL(20);
    public TextView LIZIZ;
    public C79910VXu LJ;
    public C79910VXu LJFF;
    public C79910VXu LJI;
    public C79908VXs LJII;
    public final int LJIIJ;
    public final TCQ LJIIJJI;
    public boolean LIZ = true;
    public final C79912VXw LIZJ = new C79912VXw();
    public int LIZLLL = ColorProtector.parseColor("#9BFAB4");
    public boolean LJIIIIZZ = true;
    public final int LJIIIZ = C78688UuS.LJIILIIL(-50);

    public final int LIZLLL() {
        int[] iArr = new int[2];
        TextView textView = this.LIZIZ;
        if (textView != null) {
            textView.getLocationInWindow(iArr);
        }
        return iArr[0];
    }

    public final int LJ() {
        int[] iArr = new int[2];
        TextView textView = this.LIZIZ;
        if (textView != null) {
            textView.getLocationInWindow(iArr);
        }
        return iArr[1];
    }

    public final boolean LJFF() {
        C79910VXu c79910VXu = this.LJ;
        if (c79910VXu != null && c79910VXu.LJFF) {
            return true;
        }
        C79910VXu c79910VXu2 = this.LJFF;
        if (c79910VXu2 != null && c79910VXu2.LJFF) {
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        if (LJFF()) {
            C79912VXw c79912VXw = this.LIZJ;
            c79912VXw.getClass();
            c79912VXw.LIZJ = "";
            C79912VXw c79912VXw2 = this.LIZJ;
            c79912VXw2.LIZ = 0;
            c79912VXw2.LIZIZ = 0;
            C79910VXu c79910VXu = this.LJ;
            if (c79910VXu != null) {
                c79910VXu.LJFF = false;
            }
            C79910VXu c79910VXu2 = this.LJFF;
            if (c79910VXu2 != null) {
                c79910VXu2.LJFF = false;
            }
            this.LJI = null;
            this.LJIIJJI.LIZ();
            C79908VXs c79908VXs = this.LJII;
            if (c79908VXs != null) {
                c79908VXs.LIZLLL();
            }
        }
    }

    public C79909VXt(Activity activity) {
        int LJIILIIL2 = C78688UuS.LJIILIIL(80);
        this.LJIIJ = LJIILIIL2;
        this.LJIIJJI = new TCQ(activity, LJIILIIL2, C78688UuS.LJIILIIL(42));
    }

    public final Rect LIZJ(C79910VXu c79910VXu) {
        if (c79910VXu == null) {
            return new Rect(0, 0, 0, 0);
        }
        int[] iArr = new int[2];
        TextView textView = this.LIZIZ;
        if (textView != null) {
            textView.getLocationInWindow(iArr);
        }
        int i = iArr[0];
        int i2 = c79910VXu.LJIIIZ;
        int i3 = iArr[1];
        int i4 = c79910VXu.LJIIJ;
        return new Rect(i + i2, i3 + i4, i + i2 + c79910VXu.LIZIZ, i3 + i4 + c79910VXu.LIZJ);
    }

    public final void LJII(C79910VXu c79910VXu) {
        int LIZ;
        C79909VXt c79909VXt;
        TextView textView;
        TextView textView2 = this.LIZIZ;
        if (textView2 == null || c79910VXu == null) {
            return;
        }
        if (c79910VXu.LIZ) {
            LIZ = this.LIZJ.LIZIZ(textView2);
        } else {
            LIZ = this.LIZJ.LIZ(textView2);
        }
        int intValue = ((Number) C79911VXv.LIZJ(LIZ, textView2, c79910VXu.LIZ).getFirst()).intValue();
        int LIZLLL = C79911VXv.LIZLLL(LIZ, textView2, c79910VXu.LIZ);
        c79910VXu.LJFF = true;
        c79910VXu.LJIIIZ = c79910VXu.LIZIZ() + c79910VXu.LIZLLL() + intValue;
        c79910VXu.LJIIJ = c79910VXu.LIZJ() + c79910VXu.LJ() + LIZLLL;
        if (!o.LJ(c79910VXu, c79910VXu.LJIIJJI.LJI) || (textView = (c79909VXt = c79910VXu.LJIIJJI).LIZIZ) == null) {
            return;
        }
        textView.post(new ARunnableS12S0301000_12(1, c79909VXt, textView, c79910VXu, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r0 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r5 < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r8, int r9) {
        /*
            r7 = this;
            r1 = -1
            if (r8 == r1) goto L7
            X.VXw r0 = r7.LIZJ
            r0.LIZ = r8
        L7:
            if (r9 == r1) goto Ld
            X.VXw r0 = r7.LIZJ
            r0.LIZIZ = r9
        Ld:
            X.VXw r1 = r7.LIZJ
            android.widget.TextView r0 = r7.LIZIZ
            int r2 = r1.LIZIZ(r0)
            X.VXw r1 = r7.LIZJ
            android.widget.TextView r0 = r7.LIZIZ
            int r0 = r1.LIZ(r0)
            if (r2 <= r0) goto L35
            X.VXw r1 = r7.LIZJ
            android.widget.TextView r0 = r7.LIZIZ
            int r2 = r1.LIZIZ(r0)
            X.VXw r1 = r7.LIZJ
            android.widget.TextView r0 = r7.LIZIZ
            int r0 = r1.LIZ(r0)
            r1.LIZ = r0
            X.VXw r0 = r7.LIZJ
            r0.LIZIZ = r2
        L35:
            android.widget.TextView r1 = r7.LIZIZ
            r3 = 0
            r0 = 0
            if (r1 == 0) goto L69
            java.lang.CharSequence r6 = r1.getText()
            if (r6 == 0) goto L69
            X.VXw r4 = r7.LIZJ
            android.widget.TextView r0 = r7.LIZIZ
            if (r0 == 0) goto L4d
            java.lang.CharSequence r2 = r0.getText()
            if (r2 != 0) goto Laf
        L4d:
            r4.getClass()
        L50:
            r5 = 0
        L51:
            X.VXw r4 = r7.LIZJ
            android.widget.TextView r0 = r7.LIZIZ
            if (r0 == 0) goto L5d
            java.lang.CharSequence r2 = r0.getText()
            if (r2 != 0) goto L9d
        L5d:
            r4.getClass()
        L60:
            r0 = 0
        L61:
            java.lang.CharSequence r0 = r6.subSequence(r5, r0)
            java.lang.String r0 = r0.toString()
        L69:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.VXw r0 = r7.LIZJ
            java.lang.String r0 = r0.LIZJ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L9c
            X.VXw r0 = r7.LIZJ
            r0.getClass()
            r0.LIZJ = r1
            X.VXs r2 = r7.LJII
            if (r2 == 0) goto L9c
            X.VXw r0 = r7.LIZJ
            java.lang.String r1 = r0.LIZJ
            if (r8 != 0) goto L99
            android.widget.TextView r0 = r7.LIZIZ
            if (r0 == 0) goto L99
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L99
            int r0 = r0.length()
            if (r9 != r0) goto L99
            r3 = 1
        L99:
            r2.LJ(r1, r3)
        L9c:
            return
        L9d:
            int r1 = r4.LIZIZ
            int r0 = r2.length()
            if (r1 <= r0) goto Laa
            int r0 = r2.length()
            goto L61
        Laa:
            int r0 = r4.LIZIZ
            if (r0 >= 0) goto L61
            goto L60
        Laf:
            int r1 = r4.LIZ
            int r0 = r2.length()
            if (r1 <= r0) goto Lbc
            int r5 = r2.length()
            goto L51
        Lbc:
            int r5 = r4.LIZ
            if (r5 >= 0) goto L51
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79909VXt.LJI(int, int):void");
    }

    public static boolean LIZ(float f, float f2, C79910VXu c79910VXu, int i) {
        if (c79910VXu == null) {
            return false;
        }
        int i2 = c79910VXu.LJIIIZ;
        if (f > i2 - i && f < i2 + c79910VXu.LIZIZ + i) {
            int i3 = c79910VXu.LJIIJ;
            if (f2 > i3 - i && f2 < i3 + c79910VXu.LIZJ + i) {
                return true;
            }
        }
        return false;
    }
}
