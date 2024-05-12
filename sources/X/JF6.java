package X;

import android.content.res.Resources;

/* loaded from: classes9.dex */
public final class JF6 {
    public final int LIZ;

    public JF6(ActivityC45651qj activityC45651qj) {
        int i;
        int identifier;
        try {
            identifier = Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android");
        } catch (Resources.NotFoundException unused) {
        }
        if (identifier > 0) {
            int dimensionPixelSize = activityC45651qj.getResources().getDimensionPixelSize(identifier);
            i = Resources.getSystem().getDimensionPixelSize(identifier);
            if (i < dimensionPixelSize) {
                i = Math.round((dimensionPixelSize * Resources.getSystem().getDisplayMetrics().density) / activityC45651qj.getResources().getDisplayMetrics().density);
            }
            this.LIZ = i;
        }
        i = 0;
        this.LIZ = i;
    }
}
