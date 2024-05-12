package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes14.dex */
public final class U5Z {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Fragment fragment, boolean z) {
        Context context;
        if (z) {
            if (fragment != null) {
                context = fragment.getContext();
            } else {
                context = null;
            }
            return (B9K.LIZJ(context) * 550) / 375;
        }
        return -1;
    }
}
