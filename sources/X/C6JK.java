package X;

import android.graphics.Paint;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.widget.EditText;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.6JK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JK {
    public static int LIZ = 200;
    public static int LIZIZ = 3;
    public static int LIZJ;

    public static final int LIZ(EditText editText) {
        int i = 0;
        if (editText == null) {
            return 0;
        }
        try {
            String obj = editText.getText().toString();
            Editable text = editText.getText();
            o.LJIIIIZZ(text, "text");
            if (s.LJJLI(text, " ")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(s.LJLL(obj, new C40517FvF(0, obj.length() - 2)));
                LIZ2.append('-');
                obj = X1D.LIZIZ(LIZ2);
            }
            i = new StaticLayout(obj, editText.getPaint(), editText.getMaxWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
            return i;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return i;
        }
    }

    public static final void LIZLLL(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        KeyboardUtils.LIZIZ(C60903NvH.LJ, editText);
        editText.setSelection(editText.getText().length());
    }

    public static final void LIZIZ(EditText editText, int i) {
        Editable text;
        if (editText != null && (text = editText.getText()) != null && text.length() != 0 && LIZ(editText) > i) {
            String obj = editText.getText().toString();
            int i2 = i * 50;
            if (obj.length() >= i2) {
                obj = obj.substring(0, i2);
                o.LJIIIIZZ(obj, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String LIZIZ2 = C58314Muc.LIZIZ(obj, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
            for (int length = LIZIZ2.length() - 1; length >= 0 && Character.isHighSurrogate(LIZIZ2.charAt(length)); length--) {
                LIZIZ2 = LIZIZ2.substring(0, length);
                o.LJIIIIZZ(LIZIZ2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            editText.setText(LIZIZ2);
            editText.setSelection(editText.getText().length());
        }
    }

    public static final void LIZJ(EditText editText, double d) {
        if (editText == null) {
            return;
        }
        if (TextUtils.isEmpty(editText.getText().toString()) && editText.getHint() != null) {
            Paint paint = new Paint();
            paint.setTextSize(editText.getTextSize());
            paint.setTypeface(editText.getTypeface());
            int measureText = (int) ((editText.getLayoutParams().width - paint.measureText(editText.getHint().toString())) / 2);
            if (measureText < 0) {
                editText.setPaddingRelative(0, 0, 0, 0);
                editText.setGravity(8388659);
                return;
            } else {
                editText.setPaddingRelative(measureText, 0, 0, 0);
                editText.setGravity(8388627);
                return;
            }
        }
        editText.setGravity(17);
        editText.setPaddingRelative(SFS.LJI(d), 0, SFS.LJI(d), 0);
    }
}
