package X;

import com.bytedance.effectcreatormobile.ckeapi.api.ConfigProvider;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.AssetsFragment$initTabs$1", f = "AssetsFragment.kt", l = {200}, m = "invokeSuspend")
/* renamed from: X.apR, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94961apR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AssetsFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94961apR(AssetsFragment assetsFragment, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = assetsFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94961apR(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            AssetsFragment assetsFragment = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = assetsFragment.Il(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        List list = (List) obj;
        C0CM c0cm = AssetsFragment.wl(this.LJLILLLLZI).LJLJLJ;
        o.LJIIIIZZ(c0cm, "binding.viewPager");
        c0cm.setAdapter(new C94516aiG(list, this.LJLILLLLZI));
        AssetsFragment.wl(this.LJLILLLLZI).LJLJL.LIZIZ(new C94395agJ(this, list));
        new C93637aU5(AssetsFragment.wl(this.LJLILLLLZI).LJLJL, AssetsFragment.wl(this.LJLILLLLZI).LJLJLJ, new C94396agK(this, list)).LIZ();
        ConfigProvider LIZ = C93938aYw.LIZ();
        if (LIZ != null && LIZ.showGifFirstInObjectPanel()) {
            AssetsFragment.wl(this.LJLILLLLZI).LJLJLJ.LIZLLL(this.LJLILLLLZI.LJLJJL, false);
        }
        return C76800UCe.LIZ;
    }
}
