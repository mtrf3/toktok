package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.bytedance.hybrid.spark.schema.SparkSchemaModifier;
import com.google.gson.m;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class E7K {
    public static void LIZ(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        SparkSchemaModifier sparkSchemaModifier = SparkSchemaModifier.globalPostModifier;
        if (sparkSchemaModifier != null) {
            SchemaBundle schemaBundle = sparkContext.schemaBundle;
            if (schemaBundle == null) {
                schemaBundle = new SchemaBundle(sparkContext.url, sparkContext);
                sparkContext.schemaBundle = schemaBundle;
            }
            sparkSchemaModifier.handleSchemaBundle(schemaBundle, sparkContext);
        }
        sparkContext.LJIILJJIL();
    }

    public static void LIZIZ(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        SparkSchemaModifier sparkSchemaModifier = SparkSchemaModifier.globalPreModifier;
        if (sparkSchemaModifier != null) {
            SchemaBundle schemaBundle = sparkContext.schemaBundle;
            if (schemaBundle == null) {
                schemaBundle = new SchemaBundle(sparkContext.url, sparkContext);
                sparkContext.schemaBundle = schemaBundle;
            }
            sparkSchemaModifier.handleSchemaBundle(schemaBundle, sparkContext);
        }
        sparkContext.LJIILJJIL();
    }

    public static void LIZJ(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
        Iterator<SparkSchemaModifier> it = SparkSchemaModifier.normalModifiers.iterator();
        while (it.hasNext()) {
            SparkSchemaModifier next = it.next();
            SchemaBundle schemaBundle = sparkContext.schemaBundle;
            if (schemaBundle == null) {
                schemaBundle = new SchemaBundle(sparkContext.url, sparkContext);
                sparkContext.schemaBundle = schemaBundle;
            }
            next.handleSchemaBundle(schemaBundle, sparkContext);
        }
        sparkContext.LJIILJJIL();
    }

    public static SparkSchemaModifier LIZLLL(m config, InterfaceC34553DhF interfaceC34553DhF) {
        o.LJIIJ(config, "config");
        long currentTimeMillis = System.currentTimeMillis();
        String str = "";
        int i = -1;
        try {
            Integer LIZ = interfaceC34553DhF.LIZ(config);
            if (LIZ != null) {
                i = LIZ.intValue();
            }
            String LIZIZ = interfaceC34553DhF.LIZIZ(config);
            if (LIZIZ != null) {
                str = LIZIZ;
            }
            SparkSchemaModifier sparkSchemaModifier = new SparkSchemaModifier(config, str, i);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(" version ");
            LIZ2.append(i);
            LIZ2.append(" is finished in ");
            C37682Eqc.LIZIZ(null, "SparkSchemaModifier", C0H1.LIZJ(LIZ2, currentTimeMillis2, " ms", LIZ2));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", i);
            jSONObject.put("time_cost", currentTimeMillis2);
            jSONObject.put("identifier", str);
            LJ("SparkSchemaModifierParse", jSONObject, null);
            return sparkSchemaModifier;
        } catch (Throwable th) {
            StringBuilder LJ = AnonymousClass028.LJ("error occurs when parsing ", str, " version ", i, ": ");
            LJ.append(th);
            C37682Eqc.LIZ(null, "SparkSchemaModifier", X1D.LIZIZ(LJ));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time_cost", System.currentTimeMillis() - currentTimeMillis);
            jSONObject2.put("error", th.getMessage());
            jSONObject2.put("version", i);
            jSONObject2.put("identifier", str);
            LJ("SparkSchemaModifierParse", jSONObject2, null);
            return null;
        }
    }

    public static void LJ(String str, JSONObject jSONObject, SparkContext sparkContext) {
        String str2;
        String str3;
        if (sparkContext != null) {
            str2 = sparkContext.containerId;
        } else {
            str2 = null;
        }
        C79605VMb c79605VMb = new C79605VMb(str);
        if (sparkContext == null || (str3 = sparkContext.bid) == null) {
            str3 = "hybridkit_default_bid";
        }
        c79605VMb.LIZIZ = str3;
        c79605VMb.LIZLLL = jSONObject;
        c79605VMb.LIZIZ(0);
        c79605VMb.LJIIJJI = EnumC40073Fo5.Tea;
        FD5.LJ(str2, c79605VMb.LIZ());
    }
}
