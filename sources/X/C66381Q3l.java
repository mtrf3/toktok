package X;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Q3l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66381Q3l {
    public static final /* synthetic */ int LJFF = 0;
    public final HttpURLConnection LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public final FacebookRequestError LIZLLL;
    public final JSONObject LJ;

    static {
        C16880lQ.LJLLILLLL(C66381Q3l.class);
    }

    public final String toString() {
        String str;
        int responseCode;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.LIZ;
            if (httpURLConnection == null) {
                responseCode = 200;
            } else {
                responseCode = httpURLConnection.getResponseCode();
            }
            objArr[0] = Integer.valueOf(responseCode);
            str = C16880lQ.LLLZI(locale, "%d", Arrays.copyOf(objArr, 1));
            o.LJIIIIZZ(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder LIZLLL = C1FL.LIZLLL("{Response: ", " responseCode: ", str, ", graphObject: ");
        LIZLLL.append(this.LIZJ);
        LIZLLL.append(", error: ");
        LIZLLL.append(this.LIZLLL);
        LIZLLL.append("}");
        String LIZIZ = X1D.LIZIZ(LIZLLL);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return LIZIZ;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C66381Q3l(GraphRequest request, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(request, httpURLConnection, null, null, null, facebookRequestError);
        o.LJIIIZ(request, "request");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C66381Q3l(GraphRequest request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        o.LJIIIZ(request, "request");
        o.LJIIIZ(rawResponse, "rawResponse");
    }

    public C66381Q3l(GraphRequest request, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        o.LJIIIZ(request, "request");
        this.LIZ = httpURLConnection;
        this.LIZIZ = str;
        this.LIZJ = jSONObject;
        this.LIZLLL = facebookRequestError;
        this.LJ = jSONObject;
    }
}
