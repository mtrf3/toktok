package X;

import android.widget.TextView;

/* renamed from: X.5xn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151955xn {
    public static String LIZ(TextView textView) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(textView.getClass().getName());
        sb.append("{#");
        sb.append(Integer.toHexString(textView.getId()));
        sb.append(" text=");
        sb.append(textView.getText());
        sb.append("}");
        return sb.toString();
    }
}
