package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.GlobalUserRightVH;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.GlobalUserRightVH$onClick$1$1", f = "GlobalUserRightVH.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AdS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26674AdS extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ GlobalUserRightVH LJLIL;
    public final /* synthetic */ C26675AdT LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26674AdS(View view, GlobalUserRightVH globalUserRightVH, C26675AdT c26675AdT, InterfaceC67352kd interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = globalUserRightVH;
        this.LJLILLLLZI = c26675AdT;
        this.LJLJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C26674AdS(this.LJLJI, this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        FragmentManager fragmentManager = this.LJLIL.fragment.getFragmentManager();
        if (fragmentManager != null) {
            C26675AdT c26675AdT = this.LJLILLLLZI;
            View view = this.LJLJI;
            C27066Ajm c27066Ajm = UserRightFragment.Companion;
            UserRight userRight = c26675AdT.LJLIL;
            C27066Ajm.LIZJ(c27066Ajm, fragmentManager, userRight, userRight.name, null, C79234V7u.LJJIJ(view), 0, null, (int) C27162AlK.LIZLLL, 104);
            return C76800UCe.LIZ;
        }
        return null;
    }
}
