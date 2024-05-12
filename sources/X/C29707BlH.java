package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSparkOptimizeLandscapeParametersSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.BlH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29707BlH {
    public static final void LIZ(SparkContext sparkContext) {
        IHostAction iHostAction;
        Activity topActivity;
        Resources resources;
        Configuration configuration;
        o.LJIIIZ(sparkContext, "sparkContext");
        if (LiveSparkOptimizeLandscapeParametersSetting.INSTANCE.getValue() && (iHostAction = (IHostAction) CN1.LIZ(IHostAction.class)) != null && (topActivity = iHostAction.getTopActivity()) != null && (resources = topActivity.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            sparkContext.LJJIFFI((int) C15380j0.LJIJ(C15380j0.LJIIJJI()), "landscape_width");
            sparkContext.LJJIIJ("landscape_gravity", "end");
            sparkContext.LJJIIJ("landscape_transition_animation", "end");
        }
    }
}
