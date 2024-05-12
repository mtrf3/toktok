package X;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* renamed from: X.0r5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20390r5 {
    public static final String[] LIZ = new String[0];

    public static void LIZ(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        int i2;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        charSequence.getClass();
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        if (i3 > i4) {
            i = i4;
        } else {
            i = i3;
        }
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i < 0 || i3 > length) {
            LIZIZ(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            LIZIZ(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            LIZIZ(editorInfo, charSequence, i, i3);
            return;
        }
        int i6 = i3 - i;
        if (i6 > 1024) {
            i2 = 0;
        } else {
            i2 = i6;
        }
        int i7 = 2048 - i2;
        int min = Math.min(charSequence.length() - i3, i7 - Math.min(i, (int) (i7 * 0.8d)));
        int min2 = Math.min(i, i7 - min);
        int i8 = i - min2;
        if (Character.isLowSurrogate(charSequence.charAt(i8))) {
            i8++;
            min2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + min) - 1))) {
            min--;
        }
        int i9 = min2 + i2 + min;
        if (i2 != i6) {
            subSequence = TextUtils.concat(charSequence.subSequence(i8, i8 + min2), charSequence.subSequence(i3, min + i3));
        } else {
            subSequence = charSequence.subSequence(i8, i9 + i8);
        }
        LIZIZ(editorInfo, subSequence, min2, i2 + min2);
    }

    public static void LIZIZ(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
