package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.GlobalUserRightVH;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.GlobalUserRightVH$onClick$1", f = "GlobalUserRightVH.kt", l = {84}, m = "invokeSuspend")
/* renamed from: X.AdR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26673AdR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C26675AdT LJLILLLLZI;
    public final /* synthetic */ GlobalUserRightVH LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26673AdR(View view, GlobalUserRightVH globalUserRightVH, C26675AdT c26675AdT, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c26675AdT;
        this.LJLJI = globalUserRightVH;
        this.LJLJJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C26675AdT c26675AdT = this.LJLILLLLZI;
        return new C26673AdR(this.LJLJJI, this.LJLJI, c26675AdT, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        List<ExposeUserRight> list;
        List<ExposeUserRight> list2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            ExposeUserRightPanel exposeUserRightPanel = this.LJLILLLLZI.LJLIL.exposeUserRightPanel;
            if (exposeUserRightPanel != null && (list2 = exposeUserRightPanel.exposeUserRights) != null) {
                i = list2.size();
            } else {
                i = 0;
            }
            ExposeUserRightPanel exposeUserRightPanel2 = this.LJLILLLLZI.LJLIL.exposeUserRightPanel;
            if (exposeUserRightPanel2 != null) {
                list = exposeUserRightPanel2.exposeUserRights;
            } else {
                list = null;
            }
            String LIZIZ = C26672AdQ.LIZIZ(list);
            if (LIZIZ == null) {
                LIZIZ = "";
            }
            C70414RkI c70414RkI = this.LJLJI.getVm().LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, "user_rights", null, null, C113554cx.LJJL(new OSZ("rights_cnt", new Integer(i)), new OSZ("rights_content", LIZIZ), new OSZ("module_show_type", CardStruct.IStatusCode.DEFAULT)), 22);
            }
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("rights_service");
            PdpViewModel vm = this.LJLJI.getVm();
            C26674AdS c26674AdS = new C26674AdS(this.LJLJJI, this.LJLJI, this.LJLILLLLZI, null);
            this.LJLIL = 1;
            if (vm.Nw0(this, c26674AdS, false) == enumC58928NAu) {
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
