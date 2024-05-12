package X;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Aru, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27570Aru {
    public static final void LIZJ(Activity activity) {
        o.LJIIIZ(activity, "<this>");
        Object LLIZ = C16880lQ.LLIZ("input_method", activity.getApplication());
        o.LJII(LLIZ, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) LLIZ;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            currentFocus.clearFocus();
        }
    }

    public static final void LIZLLL(T5T t5t) {
        Object LLILL = C16880lQ.LLILL(t5t.getContext(), "input_method");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) LLILL).hideSoftInputFromWindow(t5t.getWindowToken(), 0);
        t5t.clearFocus();
    }

    public static final ViewGroup.MarginLayoutParams LJFF(View view) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        return null;
    }

    public static final SpannableStringBuilder LIZIZ(CharSequence charSequence, String... strArr) {
        o.LJIIIZ(charSequence, "<this>");
        try {
            SpannableStringBuilder spanBuilder = SpannableStringBuilder.valueOf(charSequence);
            for (String str : strArr) {
                int LJJLIIIJL = s.LJJLIIIJL(charSequence, str, 0, false, 6);
                if (LJJLIIIJL != -1) {
                    spanBuilder.setSpan(new T5U(52, true), LJJLIIIJL, str.length() + LJJLIIIJL, 18);
                }
            }
            o.LJIIIIZZ(spanBuilder, "spanBuilder");
            return spanBuilder;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bold failed ");
            LIZ.append((Object) charSequence);
            LIZ.append(' ');
            LIZ.append(ORY.LJJJJLL(strArr, "|", null, null, null, 62));
            C78983UzD.LJIJ(e, X1D.LIZIZ(LIZ));
            return new SpannableStringBuilder(charSequence);
        }
    }

    public static final CharSequence LJ(CharSequence charSequence, C27572Arw... c27572ArwArr) {
        o.LJIIIZ(charSequence, "<this>");
        try {
            SpannableStringBuilder spanBuilder = SpannableStringBuilder.valueOf(charSequence);
            for (C27572Arw c27572Arw : c27572ArwArr) {
                String str = c27572Arw.LIZ;
                int i = c27572Arw.LIZIZ;
                InterfaceC65784Pro<Object> interfaceC65784Pro = c27572Arw.LIZJ;
                o.LJIIIIZZ(spanBuilder, "spanBuilder");
                int LJJLIIIJL = s.LJJLIIIJL(spanBuilder, str, 0, false, 6);
                if (LJJLIIIJL != -1) {
                    spanBuilder.setSpan(new C27571Arv(i, interfaceC65784Pro), LJJLIIIJL, str.length() + LJJLIIIJL, 18);
                }
            }
            o.LJIIIIZZ(spanBuilder, "spanBuilder");
            return spanBuilder;
        } catch (Exception unused) {
            return charSequence;
        }
    }

    public static final void LJII(int i, View view) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static final void LJIIIIZZ(int i, Fragment fragment) {
        Window window;
        View decorView;
        o.LJIIIZ(fragment, "<this>");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.clf, Integer.valueOf(i));
        }
    }

    public static final void LJIIIZ(View view, int i) {
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, Object obj) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(obj, length, spannableStringBuilder.length(), 33);
    }

    public static final void LJI(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }
}
