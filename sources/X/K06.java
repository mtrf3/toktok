package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public abstract class K06 extends AbstractC40122Fos {
    @Override // X.AbstractC40122Fos
    public final void LJ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        sparkContext.LJJIFFI(1, "enable_code_cache");
        sparkContext.LJJIFFI(1, "enable_memory_cache");
        sparkContext.LJJIFFI(1, "use_forest");
        super.LJ(sparkContext, str);
        if (C50346JpO.LIZIZ()) {
            sparkContext.LJII(C50069Jkv.class, new C50069Jkv(true));
        }
        C38518F9u c38518F9u = new C38518F9u();
        c38518F9u.put("isSearchStandardContainer", (Object) 1);
        c38518F9u.put("isPad", (Object) Integer.valueOf(LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL()));
        sparkContext.runtimeInfo = c38518F9u;
    }
}
