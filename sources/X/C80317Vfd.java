package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vfd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80317Vfd extends C16120kC {
    public final C80315Vfb LIZ;

    public C80317Vfd(C80315Vfb c80315Vfb) {
        this.LIZ = c80315Vfb;
    }

    @Override // X.C16120kC
    public void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        CharSequence charSequence;
        boolean z;
        String str;
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        EditText editText = this.LIZ.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = this.LIZ.getHint();
        CharSequence error = this.LIZ.getError();
        CharSequence placeholderText = this.LIZ.getPlaceholderText();
        int counterMaxLength = this.LIZ.getCounterMaxLength();
        CharSequence counterOverflowDescription = this.LIZ.getCounterOverflowDescription();
        boolean z2 = !TextUtils.isEmpty(charSequence);
        boolean z3 = !TextUtils.isEmpty(hint);
        boolean z4 = !this.LIZ.LLJLLL;
        boolean z5 = !TextUtils.isEmpty(error);
        if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
            z = true;
        } else {
            z = false;
        }
        if (z3) {
            str = hint.toString();
        } else {
            str = "";
        }
        if (z2) {
            c17760mq.LJJIIJ(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            c17760mq.LJJIIJ(str);
            if (z4 && placeholderText != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str);
                LIZ.append(", ");
                LIZ.append((Object) placeholderText);
                c17760mq.LJJIIJ(X1D.LIZIZ(LIZ));
            }
        } else if (placeholderText != null) {
            c17760mq.LJJIIJ(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                c17760mq.LJJ(str);
            } else {
                if (z2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append((Object) charSequence);
                    LIZ2.append(", ");
                    LIZ2.append(str);
                    str = X1D.LIZIZ(LIZ2);
                }
                c17760mq.LJJIIJ(str);
            }
            boolean z6 = !z2;
            if (i >= 26) {
                c17760mq.LIZ.setShowingHintText(z6);
            } else {
                c17760mq.LJIIIZ(4, z6);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        c17760mq.LIZ.setMaxTextLength(counterMaxLength);
        if (z) {
            if (!z5) {
                error = counterOverflowDescription;
            }
            c17760mq.LIZ.setError(error);
        }
        if (editText != null) {
            editText.setLabelFor(R.id.l5v);
        }
    }
}
