package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SPy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72062SPy {
    public String LIZIZ;
    public Integer LIZJ;
    public int LIZLLL;
    public InterfaceC65784Pro<C76800UCe> LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LIZ = true;
    public boolean LJ = true;

    public final void LJ(int i) {
        int i2;
        this.LJI = R.raw.icon_chevron_right_offset_fill_ltr;
        this.LJIIIZ = R.attr.gp;
        if (i == 0) {
            i2 = R.attr.e2;
        } else if (i == 1) {
            i2 = R.attr.go;
        } else if (i == 2) {
            i2 = R.attr.gu;
        } else if (i == 3) {
            i2 = R.attr.gv;
        } else if (i == 4) {
            i2 = R.attr.dj;
        } else if (i != 5) {
            return;
        } else {
            i2 = R.attr.bx;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf != null) {
            this.LJIIIIZZ = valueOf.intValue();
        }
    }

    public final CharSequence LIZ(Context ctx) {
        int i;
        String str;
        o.LJIIIZ(ctx, "ctx");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.LJ) {
            i = this.LJIIIIZZ;
        } else {
            i = this.LJIIIZ;
        }
        if (C26338AVi.LIZJ(ctx)) {
            str = "\u200f";
        } else {
            str = "\u200e";
        }
        spannableStringBuilder.append((CharSequence) str);
        String str2 = this.LIZIZ;
        Integer num = this.LIZJ;
        if (str2 == null) {
            if (num != null) {
                str2 = ctx.getResources().getString(num.intValue());
                o.LJIIIIZZ(str2, "ctx.resources.getString(textRes)");
            } else {
                str2 = "";
            }
        }
        T5R t5r = new T5R(str2);
        t5r.LIZ(this.LIZLLL);
        spannableStringBuilder.append((CharSequence) t5r);
        if (this.LIZ) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = this.LJI;
            c2068389v.LJ = Integer.valueOf(i);
            int i2 = this.LJII;
            c2068389v.LIZIZ = i2;
            c2068389v.LIZJ = i2;
            C8FR LIZIZ = c2068389v.LIZIZ(2, ctx);
            spannableStringBuilder.append((CharSequence) "*");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(LIZIZ, length - 1, length, 17);
        }
        Integer LJI = C79045V0n.LJI(i, ctx);
        if (LJI != null) {
            int intValue = LJI.intValue();
            if (this.LJFF != null && this.LJ) {
                spannableStringBuilder.setSpan(new C2066589d(intValue, this.LJFF), 0, spannableStringBuilder.length(), 17);
            } else {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(intValue), 0, spannableStringBuilder.length(), 17);
            }
        }
        return spannableStringBuilder;
    }

    public final void LIZIZ(int i) {
        C72063SPz c72063SPz;
        this.LIZLLL = i;
        int i2 = UYR.LIZIZ(i, true).LJLIL;
        if (i2 <= 13) {
            c72063SPz = new C72063SPz(14, 10, 4);
        } else if (i2 == 14 || i2 == 15) {
            c72063SPz = new C72063SPz(16, 12, 4);
        } else if (i2 == 16) {
            c72063SPz = new C72063SPz(18, 12, 4);
        } else if (i2 == 17) {
            c72063SPz = new C72063SPz(18, 12, 6);
        } else if (i2 <= 20) {
            c72063SPz = new C72063SPz(20, 14, 6);
        } else if (i2 <= 24) {
            c72063SPz = new C72063SPz(24, 16, 8);
        } else if (i2 <= 32) {
            c72063SPz = new C72063SPz(32, 20, 8);
        } else {
            c72063SPz = new C72063SPz(18, 12, 4);
        }
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(c72063SPz.LJLIL)));
        this.LJII = C7MY.LIZIZ(c72063SPz.LJLILLLLZI);
        O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(c72063SPz.LJLJI)));
    }

    public final void LIZJ(int i) {
        this.LIZJ = Integer.valueOf(i);
    }

    public final void LIZLLL(String text) {
        o.LJIIIZ(text, "text");
        this.LIZIZ = text;
    }
}
