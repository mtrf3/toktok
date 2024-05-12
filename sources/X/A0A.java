package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$refreshSparkView$1$3", f = "StoreFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class A0A extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC70422pa, View, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ StoreFragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0A(StoreFragment storeFragment, String str, InterfaceC67352kd<? super A0A> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = storeFragment;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        View view = (View) this.LJLIL;
        StoreFragment storeFragment = this.LJLILLLLZI;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        String str = this.LJLJI;
        storeFragment.getClass();
        String LIZLLL = C78685UuP.LIZLLL(str, Long.valueOf(System.currentTimeMillis()), "_ec_start_time");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJIJLIJ(LIZLLL);
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, sparkContext).LIZIZ();
        storeFragment.LJLJI.put("click_area", "name");
        C76542zS.LIZ("tiktokec_module_click", storeFragment.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, View view, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        A0A a0a = new A0A(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        a0a.LJLIL = view;
        return a0a.invokeSuspend(C76800UCe.LIZ);
    }
}
