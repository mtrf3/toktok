package X;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.LruCache;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.o;

/* renamed from: X.TBz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74247TBz {
    public static final LruCache<Integer, Layout> LJI = new LruCache<>(100);
    public static Constructor<StaticLayout> LJII;
    public static boolean LJIIIIZZ;
    public T5S LIZ;
    public final TC0 LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C62822Ol8 LJFF;

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout LIZ() {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74247TBz.LIZ():android.text.Layout");
    }

    public final void LIZIZ() {
        if (this.LIZJ) {
            T5S t5s = new T5S();
            t5s.set((TextPaint) this.LIZ);
            this.LIZ = t5s;
            this.LIZJ = false;
        }
    }

    public C74247TBz() {
        T5S t5s = new T5S();
        t5s.setAntiAlias(true);
        this.LIZ = t5s;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        o.LJIIIIZZ(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        this.LIZIZ = new TC0(alignment, FIRSTSTRONG_LTR, this.LIZ.getColor(), ((TextPaint) this.LIZ).linkColor);
        this.LJFF = C221108m2.LIZIZ(TC1.LJLIL);
    }

    public final void LIZJ(int i) {
        LIZIZ();
        this.LIZ.LIZ(i);
        this.LIZIZ.LJJI = i;
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(UYR.LIZIZ(i, true).LJLILLLLZI)));
        LIZIZ();
        this.LIZIZ.LJJIFFI = LJJIIZ;
    }

    public final void LIZLLL(CharSequence charSequence) {
        if (o.LJ(this.LIZIZ.LIZ, charSequence)) {
            return;
        }
        this.LIZIZ.LIZ = charSequence;
    }

    public final void LJ(int i) {
        LIZIZ();
        this.LIZIZ.LJIIZILJ = i;
        this.LIZ.setColor(i);
    }

    public final void LJFF(int i) {
        int i2;
        if (i <= 0) {
            i2 = 0;
        } else {
            i2 = 1073741824;
        }
        TC0 tc0 = this.LIZIZ;
        tc0.LIZLLL = i;
        tc0.LIZJ = i2;
    }
}
