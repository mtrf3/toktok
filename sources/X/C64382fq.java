package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget$showFavoriteTip$3", f = "PdpHeadNavBarWidget.kt", l = {735}, m = "invokeSuspend")
/* renamed from: X.2fq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64382fq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ PdpHeadNavBarWidget LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64382fq(long j, PdpHeadNavBarWidget pdpHeadNavBarWidget, View view, InterfaceC67352kd<? super C64382fq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = pdpHeadNavBarWidget;
        this.LJLJJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64382fq(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            long j = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.replaceIconRes(this.LJLJJI, R.raw.icon_ellipsis_horizontal);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
