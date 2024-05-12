package X;

import com.bytedance.android.live.browser.ILiveSparkService;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Fq0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40192Fq0 extends AbstractC40122Fos {
    @Override // X.AbstractC40122Fos
    public final String LJI() {
        return "webcast";
    }

    @Override // X.AbstractC40122Fos
    public final void LJ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJ(sparkContext, str);
        ((ILiveSparkService) CN1.LIZ(ILiveSparkService.class)).Y90(sparkContext);
    }

    @Override // X.AbstractC40122Fos
    public final void LJFF(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJFF(sparkContext, str);
        ((ILiveSparkService) CN1.LIZ(ILiveSparkService.class)).Iu0(sparkContext);
    }
}
