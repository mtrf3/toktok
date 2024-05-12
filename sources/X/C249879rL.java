package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ug.settings.SparkOptimizationModel;
import com.ss.android.ugc.aweme.ug.settings.SparkPreloadModel;
import com.ss.android.ugc.aweme.ug.settings.SparkReUseModel;

/* renamed from: X.9rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249879rL {
    public static final C249879rL LIZ = new C249879rL();
    public static final SparkOptimizationModel LIZIZ = new SparkOptimizationModel(null, null);

    static {
        C221108m2.LIZIZ(C249869rK.LJLIL);
        C221108m2.LIZIZ(C249839rH.LJLIL);
    }

    public static SparkPreloadModel LIZ() {
        SparkOptimizationModel sparkOptimizationModel = (SparkOptimizationModel) SettingsManager.LIZLLL().LJIIIIZZ("ug_spark_optimization", SparkOptimizationModel.class, LIZIZ);
        if (sparkOptimizationModel != null) {
            return sparkOptimizationModel.sparkPreloadModel;
        }
        return null;
    }

    public static SparkReUseModel LIZIZ() {
        SparkOptimizationModel sparkOptimizationModel = (SparkOptimizationModel) SettingsManager.LIZLLL().LJIIIIZZ("ug_spark_optimization", SparkOptimizationModel.class, LIZIZ);
        if (sparkOptimizationModel != null) {
            return sparkOptimizationModel.sparkReUseModel;
        }
        return null;
    }
}
