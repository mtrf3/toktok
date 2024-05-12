package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.NiI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60098NiI extends AbstractC40122Fos {
    public final String LIZIZ;

    @Override // X.AbstractC40122Fos
    public final String LJI() {
        return "spark_plugin_game_station";
    }

    public C60098NiI(String str) {
        this.LIZIZ = str;
    }

    @Override // X.AbstractC40122Fos
    public final void LJ(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJ(sparkContext, str);
        sparkContext.LJJ(new C60099NiJ(this));
    }
}
