package X;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* renamed from: X.TBy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74246TBy {
    public static boolean LJIIIZ;
    public static Constructor<StaticLayout> LJIIJ;
    public static Object LJIIJJI;
    public CharSequence LIZ;
    public final TextPaint LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public boolean LJII;
    public Layout.Alignment LJ = Layout.Alignment.ALIGN_NORMAL;
    public int LJFF = Integer.MAX_VALUE;
    public boolean LJI = true;
    public TextUtils.TruncateAt LJIIIIZZ = null;

    public final StaticLayout LIZ() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        int max = Math.max(0, this.LIZJ);
        CharSequence charSequence = this.LIZ;
        if (this.LJFF == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.LIZIZ, max, this.LJIIIIZZ);
        }
        int min = Math.min(charSequence.length(), this.LIZLLL);
        this.LIZLLL = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.LJII) {
                this.LJ = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.LIZIZ, max);
            obtain.setAlignment(this.LJ);
            obtain.setIncludePad(this.LJI);
            if (this.LJII) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.LJIIIIZZ;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.LJFF);
            return obtain.build();
        }
        if (!LJIIIZ) {
            try {
                boolean z = this.LJII;
                LJIIJJI = TextDirectionHeuristics.LTR;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                LJIIJ = declaredConstructor;
                declaredConstructor.setAccessible(true);
                LJIIIZ = true;
            } catch (Exception e) {
                throw new S9J(e);
            }
        }
        try {
            Constructor<StaticLayout> constructor = LJIIJ;
            constructor.getClass();
            Object[] objArr = new Object[13];
            objArr[0] = charSequence;
            objArr[1] = 0;
            objArr[2] = Integer.valueOf(this.LIZLLL);
            objArr[3] = this.LIZIZ;
            objArr[4] = Integer.valueOf(max);
            objArr[5] = this.LJ;
            Object obj = LJIIJJI;
            obj.getClass();
            objArr[6] = obj;
            objArr[7] = Float.valueOf(1.0f);
            objArr[8] = Float.valueOf(0.0f);
            objArr[9] = Boolean.valueOf(this.LJI);
            objArr[10] = null;
            objArr[11] = Integer.valueOf(max);
            objArr[12] = Integer.valueOf(this.LJFF);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            throw new S9J(e2);
        }
    }

    public C74246TBy(int i, TextPaint textPaint, CharSequence charSequence) {
        this.LIZ = charSequence;
        this.LIZIZ = textPaint;
        this.LIZJ = i;
        this.LIZLLL = charSequence.length();
    }
}
