package X;

import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207998Eh {
    public static final int LIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C208008Ei.LJLIL);
    public static final java.util.Map<String, String> LIZJ = new LinkedHashMap();
    public static final java.util.Map<String, BaseAccountFlowFragment> LIZLLL = new LinkedHashMap();

    public static void LIZIZ() {
        java.util.Map<String, BaseAccountFlowFragment> map = LIZLLL;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        map.put(curUserId, null);
    }

    public static boolean LIZJ(EditText editText) {
        Editable text = editText.getText();
        if (text.length() <= 30) {
            return false;
        }
        int selectionEnd = Selection.getSelectionEnd(text);
        String substring = text.toString().substring(0, 30);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        editText.setText(substring);
        Editable text2 = editText.getText();
        if (selectionEnd > text2.length()) {
            selectionEnd = text2.length();
        }
        Selection.setSelection(text2, selectionEnd);
        return true;
    }

    public static void LIZ(Context context, TuxTextView tuxTextView, boolean z, int i) {
        int i2;
        ForegroundColorSpan foregroundColorSpan;
        Integer LJI;
        if (z) {
            i2 = R.attr.e7;
        } else {
            i2 = R.attr.gv;
        }
        if (context != null && (LJI = C79045V0n.LJI(i2, context)) != null) {
            foregroundColorSpan = new ForegroundColorSpan(LJI.intValue());
        } else {
            foregroundColorSpan = null;
        }
        int min = Math.min(i, 30);
        C116724i4 c116724i4 = new C116724i4();
        c116724i4.LIZJ(C208018Ej.LIZ(min), foregroundColorSpan);
        c116724i4.LJ("/");
        c116724i4.LIZIZ(C208018Ej.LIZ(30));
        C116714i3 c116714i3 = c116724i4.LIZ;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(c116714i3);
    }
}
