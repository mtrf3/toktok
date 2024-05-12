package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.0uN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22430uN {
    public static Bundle LIZ(String requestJson, String str, boolean z) {
        o.LJIIIZ(requestJson, "requestJson");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
        bundle.putString("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", str);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        return bundle;
    }
}
