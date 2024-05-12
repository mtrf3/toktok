package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* renamed from: X.ExQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38104ExQ extends O6R {
    public final C38089ExB LJLJJI;
    public final /* synthetic */ InterfaceC60761Nsz LJLJJL;
    public final /* synthetic */ C68322mC<AbstractC38123Exj<?, ?>> LJLJJLL;
    public final /* synthetic */ InterfaceC31920Cfs LJLJL;
    public final /* synthetic */ SparkContext LJLJLJ;

    @Override // X.O6R
    public final void LJJIII() {
        AbstractC38123Exj<?, ?> abstractC38123Exj = this.LJLJJLL.element;
        if (abstractC38123Exj != null) {
            abstractC38123Exj.onTerminate();
        }
        AbstractC38123Exj<?, ?> abstractC38123Exj2 = this.LJLJJLL.element;
        if (abstractC38123Exj2 != null) {
            abstractC38123Exj2.onDestroy();
        }
    }

    @Override // X.O6R, X.InterfaceC60617Nqf
    public final void LJIJ(Context context) {
        o.LJIIIZ(context, "context");
        C38089ExB c38089ExB = this.LJLJJI;
        if (c38089ExB == null) {
            return;
        }
        c38089ExB.LIZ = context;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.Ex4, X.Exj] */
    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        C76800UCe c76800UCe;
        o.LJIIIZ(bridgeName, "bridgeName");
        InterfaceC60761Nsz interfaceC60761Nsz = this.LJLJJL;
        if (interfaceC60761Nsz == null) {
            return;
        }
        C68322mC<AbstractC38123Exj<?, ?>> c68322mC = this.LJLJJLL;
        InterfaceC31920Cfs interfaceC31920Cfs = this.LJLJL;
        SparkContext sparkContext = this.LJLJLJ;
        try {
            ?? LIZ = interfaceC31920Cfs.LIZ();
            c68322mC.element = LIZ;
            if (LIZ == 0) {
                c76800UCe = null;
            } else {
                Object LIZ2 = C38110ExW.LIZ(str, LIZ);
                C38089ExB c38089ExB = this.LJLJJI;
                if (c38089ExB == null) {
                    c38089ExB = C38088ExA.LIZIZ(interfaceC60761Nsz);
                }
                LIZ.invokeActual(LIZ2, c38089ExB, new C38105ExR(sparkContext, c37945Eur));
                c76800UCe = C76800UCe.LIZ;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    public C38104ExQ(InterfaceC60761Nsz interfaceC60761Nsz, C68322mC<AbstractC38123Exj<?, ?>> c68322mC, InterfaceC31920Cfs interfaceC31920Cfs, SparkContext sparkContext) {
        C38089ExB LIZIZ;
        this.LJLJJL = interfaceC60761Nsz;
        this.LJLJJLL = c68322mC;
        this.LJLJL = interfaceC31920Cfs;
        this.LJLJLJ = sparkContext;
        if (interfaceC60761Nsz == null) {
            LIZIZ = null;
        } else {
            LIZIZ = C38088ExA.LIZIZ(interfaceC60761Nsz);
        }
        this.LJLJJI = LIZIZ;
    }
}
