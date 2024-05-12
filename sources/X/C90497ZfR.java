package X;

import com.google.android.gms.common.images.WebImage;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ZfR, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90497ZfR {
    public static final C90469Zez LIZ = new C90469Zez("MetadataUtils");
    public static final String[] LIZIZ;
    public static final String LIZJ;

    static {
        String str;
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        LIZIZ = strArr;
        String valueOf = String.valueOf(strArr[0]);
        if (valueOf.length() != 0) {
            str = "yyyyMMdd'T'HHmmss".concat(valueOf);
        } else {
            str = new String("yyyyMMdd'T'HHmmss");
        }
        LIZJ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Calendar LIZ(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90497ZfR.LIZ(java.lang.String):java.util.Calendar");
    }

    public static JSONArray LIZIZ(List<WebImage> list) {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        for (WebImage webImage : list) {
            webImage.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", webImage.zab.toString());
                jSONObject.put("width", webImage.zac);
                jSONObject.put("height", webImage.zad);
            } catch (JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
