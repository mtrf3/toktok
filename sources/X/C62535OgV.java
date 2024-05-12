package X;

import android.view.View;
import fjb.a;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.core.ui.SkeletonShareManager$doRealSetupChannels$1$onChannelRealClicked$1", f = "SkeletonShareManager.kt", l = {153}, m = "invokeSuspend")
/* renamed from: X.OgV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62535OgV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C62534OgU LJLJI;
    public final /* synthetic */ InterfaceC62225ObV LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62535OgV(C62534OgU c62534OgU, InterfaceC62225ObV interfaceC62225ObV, View view, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c62534OgU;
        this.LJLJJI = interfaceC62225ObV;
        this.LJLJJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C62535OgV c62535OgV = new C62535OgV(this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
        c62535OgV.LJLIL = obj;
        return c62535OgV;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, null, null, new C62536OgW(this, null), 3);
            this.LJLILLLLZI = 1;
            if (LIZIZ.LJJIJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C62534OgU c62534OgU = this.LJLJI;
        if (!c62534OgU.LJLJI.LJIIJ.LIZLLL(this.LJLJJI, c62534OgU.LJLJJL, this.LJLJJL, new C62541Ogb(this), new AqS176S0100000_10(this, 115))) {
            if (C62547Ogh.LIZ(this.LJLJJI.key())) {
                C43285Gyn.LIZIZ(this.LJLJI.LJLJJLL);
            }
            this.LJLJI.LJLJI.LJIIJ.LJIILIIL(this.LJLJJI, new AqS176S0100000_10(this, 116));
        }
        return C76800UCe.LIZ;
    }
}
