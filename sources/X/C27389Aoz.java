package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm$onResume$1$3$1", f = "DistrictFragment.kt", l = {1523}, m = "invokeSuspend")
/* renamed from: X.Aoz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27389Aoz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ DistrictVm LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ FragmentManager LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27389Aoz(Fragment fragment, DistrictVm districtVm, int i, FragmentManager fragmentManager, InterfaceC67352kd<? super C27389Aoz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = fragment;
        this.LJLJI = districtVm;
        this.LJLJJI = i;
        this.LJLJJL = fragmentManager;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27389Aoz(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        DistrictPage districtPage;
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
            Fragment fragment = this.LJLILLLLZI;
            if ((fragment instanceof DistrictPage) && (districtPage = (DistrictPage) fragment) != null) {
                District district = (District) ListProtector.get(this.LJLJI.LL, this.LJLJJI);
                this.LJLIL = 1;
                obj = districtPage.Al(district, false, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        if (((Boolean) obj).booleanValue()) {
            DistrictVm districtVm = this.LJLJI;
            FragmentManager fragmentManager = this.LJLJJL;
            List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "manager.fragments");
            districtVm.jv0(fragmentManager, C47261Igj.LJJI(LJJJJLI));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
