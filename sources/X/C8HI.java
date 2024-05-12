package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.8HI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HI {
    public static volatile C8HI LIZIZ;
    public boolean LIZ;

    public static C8HI LIZJ() {
        if (LIZIZ == null) {
            synchronized (C8HI.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C8HI();
                }
            }
        }
        return LIZIZ;
    }

    public final synchronized Typeface LIZLLL(String str) {
        if (!this.LIZ) {
            return null;
        }
        return C49616Jdc.LIZIZ().LIZLLL(str);
    }

    public final synchronized void LIZ(TextView textView, AttributeSet attributeSet) {
        LJFF(textView, attributeSet);
        if (textView != null && this.LIZ) {
            int i = 1;
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.aeh, R.attr.aek, R.attr.ael});
                i = obtainStyledAttributes.getInt(0, 1);
                obtainStyledAttributes.recycle();
            }
            Typeface LIZJ = C49616Jdc.LIZIZ().LIZJ(i);
            if (LIZJ != null) {
                textView.setTypeface(LIZJ);
            }
        }
    }

    public final synchronized void LIZIZ(TextView textView, String str) {
        if (textView != null) {
            if (this.LIZ) {
                Typeface LIZLLL = LIZLLL(str);
                if (LIZLLL != null) {
                    textView.setTypeface(LIZLLL);
                }
            }
        }
    }

    public final synchronized void LJ(Context context, java.util.Map<String, String> map) {
        this.LIZ = false;
        if (context != null && map != null && ((HashMap) map).size() > 0) {
            C49616Jdc.LIZ();
            C49616Jdc.LIZIZ().LJ(context, map);
            this.LIZ = true;
        }
    }

    public final void LJFF(TextView textView, AttributeSet attributeSet) {
        if (textView == null || attributeSet == null) {
            return;
        }
        if (this.LIZ) {
            TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.aeh, R.attr.aek, R.attr.ael});
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.recycle();
            if (!z) {
                return;
            }
            textView.setIncludeFontPadding(true);
            return;
        }
        TypedArray obtainStyledAttributes2 = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.aeh, R.attr.aek, R.attr.ael});
        boolean z2 = obtainStyledAttributes2.getBoolean(1, false);
        obtainStyledAttributes2.recycle();
        if (z2) {
            return;
        }
        textView.setIncludeFontPadding(true);
    }
}
