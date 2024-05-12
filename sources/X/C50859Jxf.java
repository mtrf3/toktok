package X;

import X.C0M9;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jxf */
/* loaded from: classes9.dex */
public final class C50859Jxf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(TemplateData templateData, C1HQ c1hq) {
        JSONObject jSONObject = new JSONObject();
        if (c1hq != null) {
            Iterator it = ((C0M9.b) c1hq.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "commonParam.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            templateData.LJI(next, jSONObject.get(next));
        }
    }

    public static void LIZ(SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView, String str, TemplateData templateData, boolean z, AbstractC60800Ntc callback, LynxViewClient lynxViewClient, java.util.Map map) {
        String str2;
        SparkContext sparkContext;
        String str3;
        o.LJIIIZ(sparkView, "sparkView");
        o.LJIIIZ(callback, "callback");
        boolean z2 = false;
        if (C19N.LJ("search_use_forest", false)) {
            EZQ ezq = new EZQ(str);
            ezq.LIZ(1, "use_forest");
            str2 = ezq.LIZLLL();
            o.LJIIIIZZ(str2, "UrlBuilder(schema).apply…st\", 1)\n        }.build()");
        } else {
            str2 = str;
        }
        SparkContext sparkContext2 = sparkView.getSparkContext();
        if (sparkContext2 == null || (str3 = sparkContext2.url) == null || ujb.o.LJJJJJL(str3)) {
            z2 = true;
        }
        String str4 = "normal_load_spark";
        if (z2) {
            C50856Jxc c50856Jxc = new C50856Jxc();
            if (z) {
                str4 = "preload";
            }
            c50856Jxc.LJIILL("type", str4);
            c50856Jxc.LJIIZILJ(1);
            c50856Jxc.LJIILL("error", "load");
            c50856Jxc.LJIILL("schema", str2);
            c50856Jxc.LJIILIIL();
            SparkContext sparkContext3 = sparkView.getSparkContext();
            if (sparkContext3 == null) {
                sparkContext3 = new SparkContext();
            }
            sparkContext3.LJJIJLIJ(str2);
            if (map == null) {
                map = C113554cx.LJJJLIIL();
            }
            sparkContext3.LJJIJ(map);
            sparkContext3.LJII(InterfaceC60819Ntv.class, new C59956Ng0(sparkView, str, templateData, lynxViewClient));
            sparkContext3.LJIL(callback);
            sparkView.LJIIJJI(sparkContext3);
            sparkView.LIZIZ();
            return;
        }
        C50856Jxc c50856Jxc2 = new C50856Jxc();
        c50856Jxc2.LJIILL("type", "normal_load_spark");
        c50856Jxc2.LJIIZILJ(1);
        c50856Jxc2.LJIILL("error", "reload");
        c50856Jxc2.LJIILL("schema", str2);
        c50856Jxc2.LJIILIIL();
        SparkContext sparkContext4 = sparkView.getSparkContext();
        if (sparkContext4 != null) {
            sparkContext4.LJIL(callback);
        }
        if (lynxViewClient != null && (sparkContext = sparkView.getSparkContext()) != null) {
            sparkContext.LJJ(new C50861Jxh(lynxViewClient));
        }
        sparkView.LJIILL(str2, templateData);
    }
}
