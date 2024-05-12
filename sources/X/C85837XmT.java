package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import yq4.a;

/* renamed from: X.XmT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85837XmT {
    public static final java.util.Set<String> LIZ = new HashSet(Arrays.asList("AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"));
    public static final java.util.Set<String> LIZIZ = new HashSet(Arrays.asList("US", "AS", "GU", "MP", "PR", "VI", "UM"));

    public static Typeface LJ() {
        T5S t5s = new T5S();
        t5s.LIZ(82);
        return t5s.getTypeface();
    }

    public static int LJFF() {
        if (((HashSet) LIZ).contains(LJII())) {
            if (C35870E5y.LIZ()) {
                return R.string.pyo;
            }
            return R.string.du8;
        }
        if (LJII().equals("CO")) {
            if (C35870E5y.LIZ()) {
                return R.string.pyn;
            }
            return R.string.dpn;
        }
        if ((!((HashSet) LIZIZ).contains(LJII())) && C35870E5y.LIZ()) {
            return R.string.pyp;
        }
        return R.string.dug;
    }

    public static String LJII() {
        String LIZ2 = C85990Xow.LIZ();
        if (C35870E5y.LIZ()) {
            LIZ2 = a.LIZIZ().LJIILL();
        }
        return LIZ2.toUpperCase(Locale.getDefault());
    }

    public static void LJIIIIZZ(String str, String str2) {
        a.LJII().LIZ(new O0X(false, str, true, true, str2));
    }

    public static SpannableString LJI(Context context, Integer num, Integer num2, View.OnClickListener onClickListener) {
        SpannableStringBuilder append;
        Integer LJI;
        int i;
        int i2;
        int length;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" ");
        LIZ2.append(context.getString(R.string.jja));
        LIZ2.append(" ");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 3) {
                if (intValue != 4) {
                    append = new SpannableStringBuilder(context.getString(R.string.r0b)).append((CharSequence) LIZIZ2);
                } else {
                    LIZIZ2 = context.getString(R.string.t8b);
                    append = new SpannableStringBuilder(context.getString(R.string.t8a, LIZIZ2));
                }
            } else {
                append = new SpannableStringBuilder(context.getString(R.string.r0c)).append((CharSequence) LIZIZ2);
            }
        } else {
            append = new SpannableStringBuilder(context.getString(R.string.rdh)).append((CharSequence) LIZIZ2);
        }
        if (num2.intValue() == 2) {
            LJI = C79045V0n.LJI(R.attr.e2, context);
        } else if (num2.intValue() == 1) {
            LJI = C79045V0n.LJI(R.attr.go, context);
        } else {
            LJI = C79045V0n.LJI(R.attr.gu, context);
        }
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        C85677Xjt c85677Xjt = new C85677Xjt(i, i, num, context, onClickListener, num2);
        int indexOf = append.toString().toLowerCase(Locale.getDefault()).indexOf(LIZIZ2.toLowerCase(Locale.getDefault()));
        if (num.intValue() == 4) {
            i2 = indexOf;
        } else {
            i2 = indexOf + 1;
        }
        if (num.intValue() == 4) {
            length = LIZIZ2.length() + i2;
        } else {
            length = (LIZIZ2.length() + indexOf) - 1;
        }
        append.setSpan(c85677Xjt, i2, length, 33);
        return SpannableString.valueOf(append);
    }

    public static void LIZ(Context context, TuxTextView tuxTextView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        try {
            if (EP5.LIZ()) {
                LIZLLL(context, tuxTextView, onClickListener, onClickListener2, onClickListener3);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" ");
            LIZ2.append(context.getString(R.string.dr0));
            LIZ2.append(" ");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" ");
            LIZ3.append(context.getString(R.string.dqt));
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            int i = 0;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.dpq, LIZIZ2, LIZIZ3));
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            C85838XmU c85838XmU = new C85838XmU(LJIIIIZZ, LJIIIIZZ2, onClickListener);
            C85839XmV c85839XmV = new C85839XmV(LJIIIIZZ, LJIIIIZZ2, onClickListener2);
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int indexOf = lowerCase.indexOf(LIZIZ2.toLowerCase(Locale.getDefault()));
            int indexOf2 = lowerCase.indexOf(LIZIZ3.toLowerCase(Locale.getDefault()));
            if (indexOf < 0 || indexOf2 < 0) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("enter_from", "login");
                Q13.LIZ(c198517qh.LJ());
            }
            spannableStringBuilder.setSpan(c85838XmU, indexOf + 1, (indexOf + LIZIZ2.length()) - 1, 34);
            spannableStringBuilder.setSpan(c85839XmV, indexOf2 + 1, indexOf2 + LIZIZ3.length(), 34);
            tuxTextView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(AnonymousClass894.LIZ());
            Integer LJI = C79045V0n.LJI(R.attr.gv, context);
            if (LJI != null) {
                i = LJI.intValue();
            }
            tuxTextView.setTextColor(i);
        } catch (Exception unused) {
        }
    }

    public static void LIZJ(Context context, TuxTextView tuxTextView, Integer num, Integer num2, View.OnClickListener onClickListener) {
        try {
            SpannableString LJI = LJI(context, num, num2, onClickListener);
            tuxTextView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
            tuxTextView.setText(LJI);
            tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
            tuxTextView.setMovementMethod(AnonymousClass894.LIZ());
        } catch (Exception unused) {
        }
    }

    public static void LIZLLL(Context context, TuxTextView tuxTextView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" ");
            LIZ2.append(context.getString(R.string.g1w));
            LIZ2.append(" ");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(" ");
            LIZ3.append(context.getString(R.string.g1x));
            String LIZIZ3 = X1D.LIZIZ(LIZ3);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(" ");
            LIZ4.append(context.getString(R.string.r0b));
            String LIZIZ4 = X1D.LIZIZ(LIZ4);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(" ");
            LIZ5.append(context.getString(R.string.g1y));
            LIZ5.append(" ");
            String LIZIZ5 = X1D.LIZIZ(LIZ5);
            SpannableStringBuilder append = new SpannableStringBuilder(context.getString(R.string.dpq, LIZIZ2, LIZIZ3)).append((CharSequence) LIZIZ4).append((CharSequence) LIZIZ5);
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            C85834XmQ c85834XmQ = new C85834XmQ(LJIIIIZZ, LJIIIIZZ2, onClickListener);
            C85835XmR c85835XmR = new C85835XmR(LJIIIIZZ, LJIIIIZZ2, onClickListener2);
            C85836XmS c85836XmS = new C85836XmS(LJIIIIZZ, LJIIIIZZ2, onClickListener3);
            String lowerCase = append.toString().toLowerCase(Locale.getDefault());
            int indexOf = lowerCase.indexOf(LIZIZ2.toLowerCase(Locale.getDefault()));
            int indexOf2 = lowerCase.indexOf(LIZIZ3.toLowerCase(Locale.getDefault()));
            int indexOf3 = lowerCase.indexOf(LIZIZ5.toLowerCase(Locale.getDefault()));
            if (indexOf < 0 || indexOf2 < 0 || indexOf3 < 0) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("enter_from", "login");
                Q13.LIZ(c198517qh.LJ());
            }
            append.setSpan(c85834XmQ, indexOf + 1, (indexOf + LIZIZ2.length()) - 1, 34);
            append.setSpan(c85835XmR, indexOf2 + 1, indexOf2 + LIZIZ3.length(), 34);
            append.setSpan(c85836XmS, indexOf3 + 1, indexOf3 + LIZIZ5.length(), 34);
            tuxTextView.setHighlightColor(0);
            tuxTextView.setText(append);
            tuxTextView.setMovementMethod(AnonymousClass894.LIZ());
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ(Context context, TuxTextView tuxTextView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, int i, String str) {
        SpannableStringBuilder spannableStringBuilder;
        int i2;
        try {
            String string = context.getString(R.string.dua);
            String string2 = context.getString(R.string.du_);
            String string3 = context.getString(R.string.du9);
            String[] strArr = {a.LIZIZ().LJIJI()};
            if (C35870E5y.LIZ() && (!((HashSet) LIZIZ).contains(LJII()))) {
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i, strArr[0], string, string2, string3));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(context.getString(i, string, string2, string3));
            }
            int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
            C85831XmN c85831XmN = new C85831XmN(LJIIIIZZ, LJIIIIZZ2, onClickListener);
            C85832XmO c85832XmO = new C85832XmO(LJIIIIZZ, LJIIIIZZ2, onClickListener2);
            C85833XmP c85833XmP = new C85833XmP(LJIIIIZZ, LJIIIIZZ2, onClickListener3);
            C85829XmL c85829XmL = new C85829XmL(LJIIIIZZ, LJIIIIZZ2, tuxTextView, spannableStringBuilder, strArr);
            String lowerCase = spannableStringBuilder.toString().toLowerCase(Locale.getDefault());
            int indexOf = lowerCase.indexOf(string.toLowerCase(Locale.getDefault()));
            int indexOf2 = lowerCase.indexOf(string2.toLowerCase(Locale.getDefault()));
            int indexOf3 = lowerCase.indexOf(string3.toLowerCase(Locale.getDefault()));
            if (C35870E5y.LIZ() && (!((HashSet) LIZIZ).contains(LJII()))) {
                i2 = new SpannableStringBuilder(context.getString(i, "%1$s", string, string2, string3)).toString().toLowerCase(Locale.getDefault()).indexOf("%1$s".toLowerCase(Locale.getDefault()));
            } else {
                i2 = -1;
            }
            if (indexOf < 0 || indexOf2 < 0) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("enter_from", "login");
                Q13.LIZ(c198517qh.LJ());
            }
            spannableStringBuilder.setSpan(c85831XmN, indexOf, string.length() + indexOf, 34);
            spannableStringBuilder.setSpan(c85832XmO, indexOf2, string2.length() + indexOf2, 34);
            if (C53203KuN.LIZ()) {
                LJIIIIZZ(str, "terms-of-use");
                LJIIIIZZ(str, "privacy-policy");
            }
            if (indexOf3 >= 0) {
                spannableStringBuilder.setSpan(c85833XmP, indexOf3, string3.length() + indexOf3, 34);
                if (C53203KuN.LIZ()) {
                    LJIIIIZZ(str, "cookie-policy");
                }
            }
            if (i2 >= 0) {
                spannableStringBuilder.setSpan(c85829XmL, i2, strArr[0].length() + i2, 34);
                spannableStringBuilder.setSpan(new T5U(12, true), i2, strArr[0].length() + i2, 33);
                C198517qh c198517qh2 = new C198517qh();
                c198517qh2.LIZ.put("enter_from", "signup_login_page");
                c198517qh2.LIZ.put("is_client_value", Integer.valueOf(a.LIZIZ().LJIILIIL()));
                FMX.LJIILJJIL("account_region_status_show", c198517qh2.LJ());
            }
            tuxTextView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setMovementMethod(AnonymousClass894.LIZ());
        } catch (Exception unused) {
        }
    }
}
