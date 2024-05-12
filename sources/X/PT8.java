package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes12.dex */
public final class PT8 implements PT9 {
    @Override // X.PT9
    public final Bundle LIZ(Context context, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("_storage_key");
        String string2 = bundle.getString("_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("_result", PT6.LIZ.LIZ(context, string, true).contains(string2));
        return bundle2;
    }
}
