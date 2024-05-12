package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VoucherInfoNew;
import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.legacy.select.SelectedCardVM$followUsers$2", f = "SelectedCardVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3El, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80633El extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ SelectedCardVM LJLILLLLZI;
    public final /* synthetic */ List<User> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C80633El(SelectedCardVM selectedCardVM, List<? extends User> list, InterfaceC67352kd<? super C80633El> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = selectedCardVM;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C80633El c80633El = new C80633El(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c80633El.LJLIL = obj;
        return c80633El;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        C141335gf.LIZJ(obj);
        Boolean value = this.LJLILLLLZI.LJLLJ.getValue();
        Boolean bool = Boolean.TRUE;
        if (o.LJ(value, bool)) {
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.LJLLJ.postValue(bool);
        List<User> list = this.LJLJI;
        SelectedCardVM selectedCardVM = this.LJLILLLLZI;
        try {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (User user : list) {
                selectedCardVM.gv0(user);
                int i = 1;
                if (user.getFollowStatus() >= 1) {
                    i = 0;
                }
                user.setFollowStatus(i);
                arrayList.add(C78983UzD.LJJLI(user));
            }
            selectedCardVM.LJLLI.postValue(arrayList);
            InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, InterfaceC80643Em.class, "source_default_key");
            if (LIZLLL != null) {
                LIZLLL.LIZ(new AqS167S0100000_1(list, (List<VoucherInfoNew>) 281));
            }
            LIZ = new Integer(android.util.Log.i("SelectCard", "follow success!"));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            SelectedCardVM selectedCardVM2 = this.LJLILLLLZI;
            C221018lt.LIZJ("SelectCard", "follow net work error!", m10exceptionOrNullimpl);
            C57293Me9.LIZ(ActivityStack.getTopActivity(), m10exceptionOrNullimpl);
            selectedCardVM2.LJLJI = false;
        }
        this.LJLILLLLZI.LJLLJ.postValue(Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
