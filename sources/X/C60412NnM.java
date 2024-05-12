package X;

import com.bytedance.hybrid.spark.SparkContext;

/* renamed from: X.NnM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60412NnM extends AbstractC60629Nqr<C60422NnW> {
    public SparkContext LJLJL;
    public final NXG LJLJLJ = new NXG(this);

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        LIZLLL("onPageStarted", this.LJLJLJ);
        LIZLLL("onPageFinished", this.LJLJLJ);
    }

    public C60412NnM(SparkContext sparkContext) {
        this.LJLJL = sparkContext;
    }
}
