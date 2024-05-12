package X;

import android.text.StaticLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c0;

/* renamed from: X.032, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass032 {
    public void LIZ(StaticLayout.Builder builder, TextView textView) {
    }

    public boolean LIZIZ(TextView textView) {
        Object obj = Boolean.FALSE;
        try {
            obj = c0.LIZLLL("getHorizontallyScrolling").invoke(textView, new Object[0]);
        } catch (Exception unused) {
        }
        return ((Boolean) obj).booleanValue();
    }
}
