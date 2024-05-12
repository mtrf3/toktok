package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FoG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C40084FoG {
    public static C65082PgU LIZIZ(String str) {
        return RetrofitFactory.LIZLLL().LIZ(str).LJFF();
    }

    public static W5F LIZLLL(UrlModel urlModel, String str) {
        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        LJII.LIZIZ(str);
        return LJII;
    }

    public static void LJ(DIJ dij, String str, float f) {
        o.LJIIIZ(dij, str);
        dij.LJIIJJI(f);
        dij.LIZLLL();
    }

    public static String LIZ(StringBuilder sb, String str, String str2, int i, StringBuilder sb2) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        return X1D.LIZIZ(sb2);
    }

    public static JSONObject LIZJ(C40083FoF c40083FoF, String str, JSONObject jSONObject, String str2, String str3) {
        C40082FoE.LJIIJ(jSONObject, str2, c40083FoF.LIZIZ(str));
        return OFA.LJ(str3);
    }
}
