package X;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: X.0zQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25560zQ {
    public final Context LIZ;

    public final int LIZ() {
        Configuration configuration = this.LIZ.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600) {
            if (i < 500) {
                if (i > 480) {
                    if (i2 > 640) {
                        return 4;
                    }
                    return 3;
                }
                if (i >= 360) {
                    return 3;
                }
                return 2;
            }
            return 4;
        }
        return 5;
    }

    public C25560zQ(Context context) {
        this.LIZ = context;
    }
}
