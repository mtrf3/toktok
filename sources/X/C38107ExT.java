package X;

import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.ExT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38107ExT extends O6R {
    public final /* synthetic */ C68322mC<AbstractC38123Exj<?, ?>> LJLJJI;
    public final /* synthetic */ SparkContext LJLJJL;
    public final /* synthetic */ InterfaceC31920Cfs LJLJJLL;

    @Override // X.O6R
    public final void LJJIII() {
        AbstractC38123Exj<?, ?> abstractC38123Exj = this.LJLJJI.element;
        if (abstractC38123Exj != null) {
            abstractC38123Exj.onTerminate();
        }
        AbstractC38123Exj<?, ?> abstractC38123Exj2 = this.LJLJJI.element;
        if (abstractC38123Exj2 != null) {
            abstractC38123Exj2.onDestroy();
        }
    }

    public C38107ExT(C68322mC<AbstractC38123Exj<?, ?>> c68322mC, SparkContext sparkContext, InterfaceC31920Cfs interfaceC31920Cfs) {
        this.LJLJJI = c68322mC;
        this.LJLJJL = sparkContext;
        this.LJLJJLL = interfaceC31920Cfs;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.Ex4, X.Exj] */
    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        if (this.LJLJJL.LJI() == null) {
            return;
        }
        C68322mC<AbstractC38123Exj<?, ?>> c68322mC = this.LJLJJI;
        InterfaceC31920Cfs interfaceC31920Cfs = this.LJLJJLL;
        SparkContext sparkContext = this.LJLJJL;
        try {
            ?? LIZ = interfaceC31920Cfs.LIZ();
            c68322mC.element = LIZ;
            if (LIZ != 0) {
                LIZ.invokeActual(C38108ExU.LIZJ(str, LIZ), C38108ExU.LIZIZ(sparkContext.LJI()), new C38106ExS(sparkContext, c37945Eur));
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
