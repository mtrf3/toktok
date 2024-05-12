package X;

import Y.IDeS152S0200000_13;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine$getSearchResultFlow$$inlined$flatMapLatest$1", f = "IMSearchEngine.kt", l = {193}, m = "invokeSuspend")
/* renamed from: X.3Zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86183Zu extends AbstractC65782Prm implements InterfaceC88473Ynt {
    public int LJLIL;
    public /* synthetic */ InterfaceC64672gJ LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C86233Zz LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86183Zu(InterfaceC67352kd interfaceC67352kd, C86233Zz c86233Zz) {
        super(3, interfaceC67352kd);
        this.LJLJJI = c86233Zz;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ interfaceC64672gJ, Object obj, InterfaceC67352kd interfaceC67352kd) {
        C86183Zu c86183Zu = new C86183Zu(interfaceC67352kd, this.LJLJJI);
        c86183Zu.LJLILLLLZI = interfaceC64672gJ;
        c86183Zu.LJLJI = obj;
        return c86183Zu.invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC64672gJ interfaceC64672gJ = this.LJLILLLLZI;
            C86333a9 c86333a9 = (C86333a9) this.LJLJI;
            C86283a4 c86283a4 = new C86283a4(0);
            IDeS152S0200000_13 iDeS152S0200000_13 = new IDeS152S0200000_13(new C3C3(new C86203Zw(this.LJLJJI, c86333a9, c86283a4, null)), new C86193Zv(this.LJLJJI, c86283a4, null), 1);
            this.LJLIL = 1;
            if (V1M.LJIIL(this, iDeS152S0200000_13, interfaceC64672gJ) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
