package X;

import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.NearByAuth;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.JpE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50336JpE extends AbstractC50337JpF {
    public static final C50336JpE LJI = new C50336JpE();

    public static void LJ(String schema) {
        o.LJIIIZ(schema, "schema");
        if (!C50342JpK.LIZ(schema) || !C50346JpO.LIZIZ()) {
            C50346JpO.LIZJ();
        }
    }

    public static TemplateData LIZIZ(DynamicPatch dynamicPatch, java.util.Map map, C60737Nsb c60737Nsb) {
        JSONObject LIZ;
        o.LJIIIZ(dynamicPatch, "dynamicPatch");
        String str = dynamicPatch.schema;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if ((C50342JpK.LIZ(str) && C50346JpO.LIZIZ()) || C50346JpO.LIZJ()) {
            return LIZJ(dynamicPatch, map, c60737Nsb);
        }
        String rawData = dynamicPatch.getRawData();
        if (rawData != null) {
            str2 = rawData;
        }
        TemplateData LJFF = TemplateData.LJFF(str2);
        NearByAuth nearByAuth = dynamicPatch.getNearByAuth();
        if (nearByAuth == null) {
            LIZ = null;
        } else {
            LIZ = Q95.LIZ(nearByAuth);
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null && (r2 = map.entrySet().iterator()) != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "commonParam.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            LJFF.LJI(next, jSONObject.get(next));
        }
        if (LIZ != null) {
            LJFF.LJI("location", LIZ);
        }
        String docId = dynamicPatch.getDocId();
        if (docId != null) {
            LJFF.LJI("docId", docId);
        }
        String alaSrc = dynamicPatch.getAlaSrc();
        if (alaSrc == null) {
            return LJFF;
        }
        LJFF.LJI("alaSrc", alaSrc);
        return LJFF;
    }

    public static TemplateData LIZJ(DynamicPatch dynamicPatch, java.util.Map map, C60737Nsb c60737Nsb) {
        ISearchContextAbility iSearchContextAbility;
        AbstractC50059Jkl<C50322Jp0> If;
        C50322Jp0 LIZJ;
        NearByAuth nearByAuth;
        o.LJIIIZ(dynamicPatch, "dynamicPatch");
        String rawData = dynamicPatch.getRawData();
        if (rawData == null) {
            rawData = "";
        }
        C50335JpD c50335JpD = new C50335JpD(rawData);
        c50335JpD.LIZJ(map);
        c50335JpD.LIZ(c60737Nsb);
        if (dynamicPatch.getNearByAuth() != null && (nearByAuth = dynamicPatch.getNearByAuth()) != null) {
            c50335JpD.LIZIZ.put("location", Q95.LIZ(nearByAuth));
        }
        if (dynamicPatch.getEncodedSequence() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                String encodedSequence = dynamicPatch.getEncodedSequence();
                if (encodedSequence != null) {
                    for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(encodedSequence)).entrySet()) {
                        if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue().toString())) {
                            jSONObject.put(entry.getKey(), RopaEncrypt.getDecryptSeq(entry.getValue().toString()).getData());
                        }
                    }
                    c50335JpD.LIZIZ.put("decodedSequence", jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        String docId = dynamicPatch.getDocId();
        if (docId != null) {
            c50335JpD.LIZJ.put("docId", docId);
        }
        String alaSrc = dynamicPatch.getAlaSrc();
        if (alaSrc != null) {
            c50335JpD.LIZJ.put("alaSrc", alaSrc);
        }
        if (c60737Nsb != null && (iSearchContextAbility = (ISearchContextAbility) c60737Nsb.LIZIZ(ISearchContextAbility.class)) != null && (If = iSearchContextAbility.If()) != null && (LIZJ = If.LIZJ()) != null) {
            int i = LIZJ.LJLIL;
            try {
                JSONObject jSONObject2 = c50335JpD.LIZIZ;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("duration", C50139Jm3.LIZIZ(i));
                jSONObject2.put("requestInfo", jSONObject3);
            } catch (JSONException unused2) {
            }
        }
        return c50335JpD.LIZIZ();
    }

    public static TemplateData LIZLLL(String rawData, java.util.Map map, C60737Nsb c60737Nsb) {
        o.LJIIIZ(rawData, "rawData");
        if (map != null) {
            C50335JpD c50335JpD = new C50335JpD(rawData);
            c50335JpD.LIZJ(map);
            c50335JpD.LIZ(c60737Nsb);
            return c50335JpD.LIZIZ();
        }
        return new C50335JpD(rawData).LIZIZ();
    }

    public static TemplateData LIZ(C50336JpE c50336JpE, String str, java.util.Map map, SparkContext sparkContext) {
        c50336JpE.getClass();
        if ((C50342JpK.LIZ(str) && C50346JpO.LIZIZ()) || C50346JpO.LIZJ()) {
            C50335JpD c50335JpD = new C50335JpD((java.util.Map<String, ? extends Object>) map);
            c50335JpD.LIZ(sparkContext);
            return c50335JpD.LIZIZ();
        }
        return TemplateData.LJ(map);
    }
}
