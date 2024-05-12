package X;

import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.SparkContext;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.common.utils.SearchInitTaskHelper$run$2$2", f = "SearchInitTaskHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Jy0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50880Jy0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SparkContext LJLIL;
    public final /* synthetic */ Forest LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50880Jy0(SparkContext sparkContext, Forest forest, InterfaceC67352kd<? super C50880Jy0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = sparkContext;
        this.LJLILLLLZI = forest;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50880Jy0(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SparkContext hybridContext = this.LJLIL;
        C50882Jy2 c50882Jy2 = new C50882Jy2();
        Forest forest = this.LJLILLLLZI;
        o.LJIIJ(hybridContext, "hybridContext");
        C40498Fuw.LIZ(hybridContext, new C50883Jy3(new C50885Jy5(c50882Jy2, hybridContext), hybridContext), forest);
        C50766JwA.LJI = this.LJLIL;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
