package X;

import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import fjb.a;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS52S1200000_10;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.share.GuideSharePopWindow$setChannels$1$onChannelClicked$1", f = "GuideSharePopWindow.kt", l = {138}, m = "invokeSuspend")
/* renamed from: X.OgX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62537OgX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C62594OhS LJLJI;
    public final /* synthetic */ InterfaceC62225ObV LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62537OgX(C62594OhS c62594OhS, InterfaceC62225ObV interfaceC62225ObV, View view, String str, InterfaceC67352kd<? super C62537OgX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c62594OhS;
        this.LJLJJI = interfaceC62225ObV;
        this.LJLJJL = view;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C62537OgX c62537OgX = new C62537OgX(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c62537OgX.LJLILLLLZI = obj;
        return c62537OgX;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean LIZLLL;
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
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLILLLLZI, null, null, new C62538OgY(this.LJLJI, this.LJLJJI, null), 3);
            this.LJLIL = 1;
            if (LIZIZ.LJJIJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C62594OhS c62594OhS = this.LJLJI;
        BaseSharePackage baseSharePackage = c62594OhS.LJLILLLLZI.LJIIJ;
        InterfaceC62225ObV interfaceC62225ObV = this.LJLJJI;
        LIZLLL = baseSharePackage.LIZLLL(interfaceC62225ObV, c62594OhS.LJLIL, this.LJLJJL, null, new AqS141S0200000_10(c62594OhS, interfaceC62225ObV, 20));
        if (!LIZLLL) {
            if (C62547Ogh.LIZ(this.LJLJJI.key())) {
                V1B.LJLJJL(this.LJLJI.LJLL);
            }
            C62594OhS c62594OhS2 = this.LJLJI;
            BaseSharePackage baseSharePackage2 = c62594OhS2.LJLILLLLZI.LJIIJ;
            InterfaceC62225ObV interfaceC62225ObV2 = this.LJLJJI;
            baseSharePackage2.LJIILIIL(interfaceC62225ObV2, new AqS52S1200000_10(interfaceC62225ObV2, c62594OhS2, this.LJLJJLL, 2));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
