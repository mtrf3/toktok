package X;

import com.ss.android.ugc.aweme.spark.AdSparkContext;

/* renamed from: X.N7k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58840N7k implements InterfaceC59990NgY {
    public final /* synthetic */ NWI LIZ;

    public C58840N7k(NWI nwi) {
        this.LIZ = nwi;
    }

    @Override // X.InterfaceC59990NgY
    public final void LIZ(C60002Ngk c60002Ngk) {
        InterfaceC60770Nt8 interfaceC60770Nt8;
        AdSparkContext sparkContext = this.LIZ.getSparkContext();
        if (sparkContext != null && (interfaceC60770Nt8 = (InterfaceC60770Nt8) sparkContext.LIZIZ(InterfaceC60770Nt8.class)) != null) {
            interfaceC60770Nt8.LIZ((int) (c60002Ngk.LJIIIIZZ * 100));
        }
    }
}
