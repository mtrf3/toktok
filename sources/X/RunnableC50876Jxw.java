package X;

import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.common.config.SearchIntermediateCardsConfig;
import com.ss.android.ugc.aweme.search.lynx.core.model.DynamicData;
import kotlin.jvm.internal.o;

/* renamed from: X.Jxw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50876Jxw implements Runnable {
    public static final RunnableC50876Jxw LJLIL = new RunnableC50876Jxw();

    public static void LIZ() {
        Forest LIZ = C39914FlW.LIZ();
        SparkContext sparkContext = new SparkContext();
        if (!SearchIntermediateCardsConfig.LIZ().isEmpty()) {
            String str = ((DynamicData) ListProtector.get(SearchIntermediateCardsConfig.LIZ(), 0)).dynamicPatch.schema;
            o.LJIIIIZZ(str, "SearchIntermediateCardsC…()[0].dynamicPatch.schema");
            sparkContext.LJJIJLIJ(str);
        }
        int intValue = (((Number) C50877Jxx.LIZ.getValue()).intValue() - 1) % 2;
        if (intValue != 0) {
            if (intValue != 1) {
                return;
            }
            sparkContext.LJJIFFI(1, "enable_pre_code_cache");
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C50880Jy0(sparkContext, LIZ, null), 3);
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C50879Jxz(sparkContext, LIZ, null), 3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
