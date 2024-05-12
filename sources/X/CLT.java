package X;

import com.bytedance.hybrid.spark.SparkContext;

/* loaded from: classes6.dex */
public final class CLT extends C61170Nza {
    @Override // X.C61170Nza
    public final void LIZLLL(SparkContext sparkContext) {
        InterfaceC40159FpT LJIILL;
        if (sparkContext != null && (LJIILL = sparkContext.LJIILL()) != null) {
            LJIILL.close();
        }
        C0NB.LJIIIZ("HybridPerf", "spark container closed by icon");
    }
}
