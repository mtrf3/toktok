package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.tasm.TemplateData;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O9C {
    public static final ConcurrentHashMap<String, ConcurrentSkipListSet<String>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, M2M> LIZIZ = new ConcurrentHashMap<>();

    public static SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ(Context context, M2D m2d) {
        return KMP.LIZJ(C40343FsR.LJIILJJIL, context, m2d.LIZ(C113554cx.LJJJLIIL(), false));
    }

    public static void LIZJ(Context context, M2D m2d) {
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext LIZ2 = m2d.LIZ(C113554cx.LJJJLIIL(), false);
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, LIZ2).LIZIZ();
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ(Context context, String biz, String schema, TemplateData templateData) {
        SparkSchemaParam sparkSchemaParam;
        o.LJIIIZ(biz, "biz");
        o.LJIIIZ(schema, "schema");
        InterfaceC60831Nu7 LIZIZ2 = C60827Nu3.LIZIZ(C58310MuY.LIZIZ, context, schema, biz);
        M2M m2m = LIZIZ.get(biz);
        if (m2m == null) {
            m2m = new M2M();
        }
        if (LIZIZ2 == null || !(LIZIZ2 instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
            m2m.LJIIZILJ = false;
            m2m.LJIILLIIL = schema;
            if (templateData != null) {
                m2m.LIZ = templateData;
            }
            LIZIZ2 = KMP.LIZJ(C40343FsR.LJIILJJIL, context, m2m.LIZ(C113554cx.LJJJLIIL(), false));
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = (SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) LIZIZ2;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext();
        if (sparkContext != null) {
            sparkSchemaParam = sparkContext.LJIIZILJ(-1);
        } else {
            sparkSchemaParam = null;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILIIL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getSparkContext(), sparkSchemaParam);
        return sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
    }
}
