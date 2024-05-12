package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model.ActionBarConf;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.controller.ActionBarResourceManager$fetchActionBarResource$1$1", f = "ActionBarResourceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4FB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<ActionBarConf, C76800UCe> LJLIL;
    public final /* synthetic */ ActionBarConf LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4FB(InterfaceC88472Yns<? super ActionBarConf, C76800UCe> interfaceC88472Yns, ActionBarConf actionBarConf, InterfaceC67352kd<? super C4FB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = actionBarConf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4FB(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC88472Yns<ActionBarConf, C76800UCe> interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
