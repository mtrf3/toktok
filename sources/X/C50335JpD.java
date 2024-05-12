package X;

import android.text.TextUtils;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.JpD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50335JpD {
    public final JSONObject LIZ;
    public final JSONObject LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;

    public final TemplateData LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("serverData", this.LIZ);
        jSONObject.put("nativeData", this.LIZIZ);
        jSONObject.put("logExtra", this.LIZJ);
        jSONObject.put("storageData", this.LIZLLL);
        return TemplateData.LJFF(jSONObject.toString());
    }

    public C50335JpD(java.util.Map<String, ? extends Object> map) {
        this.LIZ = new JSONObject();
        this.LIZIZ = new JSONObject();
        this.LIZJ = new JSONObject();
        this.LIZLLL = new JSONObject();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            this.LIZ.put((String) entry.getKey(), entry.getValue());
        }
    }

    public final void LIZ(C60737Nsb c60737Nsb) {
        ISearchContextAbility iSearchContextAbility;
        String str;
        if (c60737Nsb != null && (iSearchContextAbility = (ISearchContextAbility) c60737Nsb.LIZIZ(ISearchContextAbility.class)) != null) {
            C50427Jqh LIZJ = iSearchContextAbility.cs().LIZJ();
            C50322Jp0 LIZJ2 = iSearchContextAbility.If().LIZJ();
            C49587Jd9 LIZJ3 = iSearchContextAbility.ut0().LIZJ();
            C49589JdB LIZJ4 = iSearchContextAbility.IO().LIZJ();
            C50468JrM LIZJ5 = iSearchContextAbility.pE().LIZJ();
            try {
                JSONObject jSONObject = this.LIZJ;
                jSONObject.put("searchKeyword", LIZJ2.LJLJJI);
                if (LIZJ2.LJLIL == 0) {
                    str = "general_search";
                } else {
                    str = "search_result";
                }
                jSONObject.put("enterFrom", str);
                jSONObject.put("searchId", LIZJ2.LJLJI);
                jSONObject.put("searchType", LIZJ2.LJLILLLLZI);
                jSONObject.put("preSearchId", C50440Jqu.LIZ);
                jSONObject.put("enterMethod", LIZJ2.LJZ);
                jSONObject.put("searchSessionId", LIZJ4.LJLIL);
                jSONObject.put("searchEntrance", LIZJ.LJLIL);
                jSONObject.put("enterFromSub", LIZJ.LJLILLLLZI);
                jSONObject.put("lastFromGroupId", LIZJ5.LJLILLLLZI);
                jSONObject.put("rank", LIZJ3.LJLJJI);
                String str2 = LIZJ3.LJLJJLL;
                if (str2.length() == 0) {
                    str2 = LIZJ2.LJZI;
                }
                jSONObject.put("logPb", str2);
                jSONObject.put("docId", LIZJ3.LJLJL);
                jSONObject.put("isPreload", LIZJ3.LJLJLJ);
            } catch (JSONException unused) {
            }
        }
    }

    public final void LIZJ(java.util.Map map) {
        if (map != null && (r4 = map.entrySet().iterator()) != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                C50336JpE c50336JpE = C50336JpE.LJI;
                if (c50336JpE.LIZJ.contains(str)) {
                    this.LIZIZ.put(str, value);
                }
                if (c50336JpE.LIZLLL.contains(str)) {
                    this.LIZJ.put(str, value);
                }
                if (c50336JpE.LJ.contains(str)) {
                    this.LIZIZ.put(str, value);
                }
            }
        }
    }

    public C50335JpD(String string) {
        o.LJIIIZ(string, "string");
        this.LIZ = new JSONObject();
        this.LIZIZ = new JSONObject();
        this.LIZJ = new JSONObject();
        this.LIZLLL = new JSONObject();
        if (TextUtils.isEmpty(string)) {
            this.LIZ = new JSONObject();
        } else {
            this.LIZ = new JSONObject(string);
        }
    }
}
