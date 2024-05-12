package X;

import com.google.gson.m;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreFragment$startRequestV2$1$deferred$1", f = "StoreFragment.kt", l = {327}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class OS3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super TemplateData>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StoreFragment LJLJI;
    public final /* synthetic */ m LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OS3(StoreFragment storeFragment, m mVar, InterfaceC67352kd<? super OS3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = storeFragment;
        this.LJLJJI = mVar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        OS3 os3 = new OS3(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        os3.LJLILLLLZI = obj;
        return os3;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            C73305Spp status_view = (C73305Spp) this.LJLJI._$_findCachedViewById(R.id.kf_);
            o.LJIIIIZZ(status_view, "status_view");
            AqS176S0100000_10 aqS176S0100000_10 = new AqS176S0100000_10(this.LJLJI, 270);
            C61921ORx c61921ORx = new C61921ORx(this.LJLJI, interfaceC70422pa, this.LJLJJI, null);
            this.LJLIL = 1;
            obj = C90393gh.LIZIZ(status_view, aqS176S0100000_10, c61921ORx, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super TemplateData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
