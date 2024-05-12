package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.zhiliaoapp.musically.R;

/* renamed from: X.9g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C242879g3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity) {
        if (activity != null) {
            AnonymousClass114.LIZ(activity, R.string.g20);
        }
    }

    public static boolean LIZIZ(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DIAL", android.net.Uri.fromParts("tel", str, null));
        if (context != null) {
            try {
                C16880lQ.LIZJ(context, intent);
                return true;
            } catch (ActivityNotFoundException e) {
                LIZ(C45804HyK.LJIJJ(context));
                C78983UzD.LJIIZILJ(e);
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        return false;
    }

    public static boolean LIZJ(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", android.net.Uri.fromParts("smsto", str, null));
        if (context != null) {
            try {
                C16880lQ.LIZJ(context, intent);
                return true;
            } catch (ActivityNotFoundException e) {
                LIZ(C45804HyK.LJIJJ(context));
                C78983UzD.LJIIZILJ(e);
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        return false;
    }
}
