package X;

import android.widget.TextView;

/* renamed from: X.VXw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79912VXw {
    public int LIZ;
    public int LIZIZ;
    public String LIZJ = "";

    public final int LIZ(TextView textView) {
        if (textView == null) {
            return 0;
        }
        if (this.LIZIZ > textView.length()) {
            return textView.length();
        }
        int i = this.LIZIZ;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public final int LIZIZ(TextView textView) {
        if (textView == null) {
            return 0;
        }
        if (this.LIZ > textView.length()) {
            return textView.length();
        }
        int i = this.LIZ;
        if (i < 0) {
            return 0;
        }
        return i;
    }
}
