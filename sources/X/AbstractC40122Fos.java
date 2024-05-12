package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Fos, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40122Fos extends AbstractC40151FpL {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.AbstractC40151FpL
    public final void LIZ(SparkContext sparkContext) {
        o.LJIIJ(sparkContext, "sparkContext");
    }

    @Override // X.AbstractC40151FpL
    public final boolean LIZJ(android.net.Uri uri) {
        return false;
    }

    @Override // X.AbstractC40151FpL
    public final boolean LIZLLL(String str) {
        return false;
    }

    public String LJI() {
        return "default";
    }

    public void LJ(SparkContext sparkContext, String str) {
        o.LJIIJ(sparkContext, "sparkContext");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("find custom SparkPlugin{");
        LIZ2.append(LJI());
        LIZ2.append('}');
        C37682Eqc.LIZIZ(sparkContext, "SparkPlugin", X1D.LIZIZ(LIZ2));
    }

    public void LJFF(SparkContext sparkContext, String str) {
        o.LJIIJ(sparkContext, "sparkContext");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("find custom SparkPlugin For Third Party {");
        LIZ2.append(LJI());
        LIZ2.append('}');
        C37682Eqc.LIZIZ(sparkContext, "SparkPlugin", X1D.LIZIZ(LIZ2));
    }
}
