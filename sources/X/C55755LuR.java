package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.ui.share.ShowInviteDialogOperator$asyncShowDialog$1$2$1", f = "ShowInviteDialogOperator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.LuR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55755LuR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ C55756LuS LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55755LuR(Aweme aweme, C55756LuS c55756LuS, InterfaceC67352kd<? super C55755LuR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aweme;
        this.LJLILLLLZI = c55756LuS;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55755LuR(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((ArrayList) C76322z6.LIZIZ).add(this.LJLIL);
        C55756LuS c55756LuS = this.LJLILLLLZI;
        c55756LuS.LJFF = c55756LuS.LIZJ(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
