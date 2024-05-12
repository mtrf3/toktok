package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel$display$1", f = "TemplateListViewModel.kt", l = {108, 125, 136, 154}, m = "invokeSuspend")
/* loaded from: classes13.dex */
public final class S7P extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public S6S LJLIL;
    public LiveEffect LJLILLLLZI;
    public InterfaceC07990Tb LJLJI;
    public int LJLJJI;
    public final /* synthetic */ TemplateListViewModel LJLJJL;
    public final /* synthetic */ TemplateItem LJLJJLL;
    public final /* synthetic */ ViewGroup LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7P(TemplateListViewModel templateListViewModel, TemplateItem templateItem, ViewGroup viewGroup, InterfaceC67352kd<? super S7P> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = templateListViewModel;
        this.LJLJJLL = templateItem;
        this.LJLJL = viewGroup;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new S7P(this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7P.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
