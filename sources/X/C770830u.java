package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.30u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C770830u {
    public static JSONObject LIZLLL(String str, int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, i);
        return jSONObject;
    }

    public static StringBuilder LIZIZ(String str, Class cls, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(cls);
        LIZ.append(str2);
        return LIZ;
    }

    public static String LIZ(StringBuilder sb, Aweme aweme, char c, StringBuilder sb2) {
        sb.append(aweme);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static C65082PgU LIZJ(String str, String str2, IRetrofitFactory iRetrofitFactory, String str3) {
        o.LJIIIIZZ(str, str2);
        return iRetrofitFactory.LIZ(str3).LJFF();
    }
}
