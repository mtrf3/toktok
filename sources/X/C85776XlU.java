package X;

import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.XlU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85776XlU {
    public static C85777XlV LIZ(Bundle data) {
        android.net.Uri uri;
        o.LJIIIZ(data, "data");
        try {
            String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            if (Build.VERSION.SDK_INT >= 33) {
                uri = (android.net.Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", android.net.Uri.class);
            } else {
                uri = (android.net.Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            }
            String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            o.LJI(string);
            o.LJI(string2);
            return new C85777XlV(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e) {
            throw new C85774XlS(e);
        }
    }
}
