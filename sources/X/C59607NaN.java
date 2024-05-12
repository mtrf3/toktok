package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.NaN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59607NaN {
    public final Bundle LIZ;

    public final boolean LIZ() {
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            if (bundle.getInt("web_type") == 1) {
                return true;
            }
            String string = bundle.getString("disable_pop_gesture");
            if (string != null) {
                if (TextUtils.equals(string, CardStruct.IStatusCode.DEFAULT)) {
                    return true;
                }
                TextUtils.equals(string, "1");
            }
        }
        return false;
    }

    public C59607NaN(Bundle bundle) {
        this.LIZ = bundle;
    }
}
