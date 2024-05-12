package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.HashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel$clickAddAddressForResult$2$1", f = "AddressListViewModel.kt", l = {347}, m = "invokeSuspend")
/* renamed from: X.Aej, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26753Aej extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super AddressPageStarter.AddressEvent>, Object> {
    public int LJLIL;
    public final /* synthetic */ AddressListViewModel LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ InterfaceC71003Rtn LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26753Aej(AddressListViewModel addressListViewModel, Activity activity, InterfaceC71003Rtn interfaceC71003Rtn, InterfaceC67352kd<? super C26753Aej> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = addressListViewModel;
        this.LJLJI = activity;
        this.LJLJJI = interfaceC71003Rtn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26753Aej(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super AddressPageStarter.AddressEvent> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C141335gf.LIZJ(obj);
        int size = ((ArrayList) this.LJLILLLLZI.LJLLI).size();
        AddressListViewModel addressListViewModel = this.LJLILLLLZI;
        if (size >= addressListViewModel.LJLLL) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
            c26045AKb.LJIIIZ(this.LJLJI.getString(R.string.f6i));
            c26045AKb.LJIIJ();
            return new AddressPageStarter.AddressEvent("", -1, null, 4, null);
        }
        Activity activity = this.LJLJI;
        InterfaceC71003Rtn interfaceC71003Rtn = this.LJLJJI;
        HashMap<String, Object> hashMap = addressListViewModel.LJLJL;
        if (hashMap != null) {
            str = C27739Aud.LJI(hashMap);
        } else {
            str = null;
        }
        this.LJLIL = 1;
        Object LIZIZ = AddressPageStarter.LIZIZ(activity, interfaceC71003Rtn, "shipping_info", true, str, null, this, 65420);
        if (LIZIZ != enumC58928NAu) {
            return LIZIZ;
        }
        return enumC58928NAu;
    }
}
