package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9uv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252099uv {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        try {
            if (C78857UxB.LJJJIL(str)) {
                return new JSONObject(str).get("code").toString();
            }
        } catch (JSONException unused) {
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
