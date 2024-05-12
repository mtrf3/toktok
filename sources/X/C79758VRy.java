package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.VRy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79758VRy {
    public final int LIZ;
    public final int LIZIZ;
    public final Object LIZJ;

    public void LIZ(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int i2 = this.LIZ;
        if (i2 == 0) {
            i = 18;
        } else {
            i = 34;
        }
        Object obj = this.LIZJ;
        if ((obj instanceof AbstractC79742VRi) || (obj instanceof C79748VRo)) {
            i = 33;
        }
        spannableStringBuilder.setSpan(obj, i2, this.LIZIZ, i);
    }

    public C79758VRy(int i, int i2, Object obj) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = obj;
    }
}
