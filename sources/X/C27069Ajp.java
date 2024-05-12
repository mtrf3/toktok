package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH$ShopSkuAdapter$jumpUserRightSecondPage$2$2", f = "MainOrderInfoVH.kt", l = {863}, m = "invokeSuspend")
/* renamed from: X.Ajp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27069Ajp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C27959AyB LJLILLLLZI;
    public final /* synthetic */ MainOrderInfoVH LJLJI;
    public final /* synthetic */ UserRightDetail LJLJJI;
    public final /* synthetic */ HashMap<String, Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27069Ajp(C27959AyB c27959AyB, MainOrderInfoVH mainOrderInfoVH, UserRightDetail userRightDetail, HashMap<String, Object> hashMap, InterfaceC67352kd<? super C27069Ajp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c27959AyB;
        this.LJLJI = mainOrderInfoVH;
        this.LJLJJI = userRightDetail;
        this.LJLJJL = hashMap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27069Ajp(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("rights_service");
            UserRight userRight = this.LJLILLLLZI.LJIIJJI;
            if (userRight == null) {
                return C76800UCe.LIZ;
            }
            C27066Ajm c27066Ajm = UserRightFragment.Companion;
            FragmentManager fragmentManager = this.LJLJI.LJLILLLLZI.getFragmentManager();
            UserRight LIZ = UserRight.LIZ(userRight, C47261Igj.LJJIJ(this.LJLJJI));
            String str = this.LJLJJI.name;
            View itemView = this.LJLJI.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            String LJJIJ = C79234V7u.LJJIJ(itemView);
            HashMap<String, Object> hashMap = this.LJLJJL;
            this.LJLIL = 1;
            c27066Ajm.getClass();
            if (C27066Ajm.LIZ(fragmentManager, LIZ, str, null, LJJIJ, 1, hashMap, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
