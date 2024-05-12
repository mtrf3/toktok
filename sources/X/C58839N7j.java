package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.web.service.impl.AdWebSparkFragment;

/* renamed from: X.N7j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58839N7j implements InterfaceC59990NgY {
    public final /* synthetic */ AdWebSparkFragment LIZ;

    public C58839N7j(AdWebSparkFragment adWebSparkFragment) {
        this.LIZ = adWebSparkFragment;
    }

    @Override // X.InterfaceC59990NgY
    public final void LIZ(C60002Ngk c60002Ngk) {
        InterfaceC60770Nt8 interfaceC60770Nt8;
        SparkContext xl = this.LIZ.xl();
        if (xl != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) xl.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            interfaceC60770Nt8.LIZ((int) (c60002Ngk.LJIIIIZZ * 100));
        }
    }
}
