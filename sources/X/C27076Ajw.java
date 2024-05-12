package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.TtfUkUserRightVH;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.TtfUkUserRightVH$onClick$1$2", f = "TtfUkUserRightVH.kt", l = {125}, m = "invokeSuspend")
/* renamed from: X.Ajw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27076Ajw extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TtfUkUserRightVH LJLILLLLZI;
    public final /* synthetic */ List<UserRightDetail> LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27076Ajw(TtfUkUserRightVH ttfUkUserRightVH, List<UserRightDetail> list, String str, InterfaceC67352kd<? super C27076Ajw> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = ttfUkUserRightVH;
        this.LJLJI = list;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27076Ajw(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            C27066Ajm c27066Ajm = UserRightFragment.Companion;
            FragmentManager fragmentManager = this.LJLILLLLZI.LJLIL.getFragmentManager();
            UserRight userRight = new UserRight(((C27079Ajz) this.LJLILLLLZI.getItem()).LJLIL.title, this.LJLJI, null, null, null, null, null, null);
            String str = ((C27079Ajz) this.LJLILLLLZI.getItem()).LJLIL.title;
            String str2 = this.LJLJJI;
            this.LJLIL = 1;
            if (C27066Ajm.LIZIZ(c27066Ajm, fragmentManager, userRight, str, str2, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
