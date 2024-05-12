package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.jvm.internal.o;

/* renamed from: X.3qX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C96493qX implements TextWatcher {
    public final EditText LJLIL;
    public final int LJLILLLLZI;
    public final String LJLJI;
    public final int LJLJJI;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s) {
        o.LJIIIZ(s, "s");
        if (this.LJLILLLLZI <= 0) {
            return;
        }
        String obj = s.toString();
        int i = 0;
        String substring = obj.substring(0, this.LJLIL.getSelectionStart());
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        int length = ujb.o.LJJJJZ(substring, this.LJLJI, "", false).length();
        StringBuilder sb = new StringBuilder();
        int length2 = obj.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt = obj.charAt(i3);
            if (charAt != this.LJLJI.charAt(0)) {
                sb.append(charAt);
                if ((sb.length() - i2) % this.LJLILLLLZI == 0) {
                    sb.append(this.LJLJI);
                    i2++;
                }
            }
        }
        int lastIndexOf = sb.lastIndexOf(this.LJLJI);
        if (lastIndexOf >= 0 && lastIndexOf == sb.length() - 1) {
            sb.deleteCharAt(lastIndexOf);
        }
        String sb2 = sb.toString();
        int length3 = sb2.length();
        int i4 = this.LJLJJI;
        if (length3 > i4) {
            sb2 = sb2.substring(0, i4);
            o.LJIIIIZZ(sb2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        int i5 = this.LJLILLLLZI;
        int i6 = (length % i5) + ((i5 + 1) * (length / i5));
        if (i6 % (i5 + 1) == 0) {
            i6--;
        }
        int length4 = sb2.length();
        if (i6 >= 0) {
            i = i6;
        }
        if (i <= length4) {
            length4 = i;
        }
        if (!o.LJ(sb2, obj)) {
            this.LJLIL.setText(sb2);
        }
        this.LJLIL.setSelection(length4);
    }

    public C96493qX(EditText editText, int i, String str, int i2) {
        int i3;
        o.LJIIIZ(editText, "editText");
        this.LJLIL = editText;
        this.LJLILLLLZI = i;
        this.LJLJI = str;
        int i4 = (i2 / i) + i2;
        if (i2 % i > 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.LJLJJI = i4 - i3;
    }
}
