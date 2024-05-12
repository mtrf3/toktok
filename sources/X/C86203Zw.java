package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine$getSearchResultFlow$1$1", f = "IMSearchEngine.kt", l = {176, 177}, m = "invokeSuspend")
/* renamed from: X.3Zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86203Zw extends AbstractC65782Prm implements InterfaceC88471Ynr {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C86233Zz<SEARCH_RESULT> LJLJI;
    public final /* synthetic */ C86333a9 LJLJJI;
    public final /* synthetic */ C86283a4 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86203Zw(C86233Zz<SEARCH_RESULT> c86233Zz, C86333a9 c86333a9, C86283a4 c86283a4, InterfaceC67352kd<? super C86203Zw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c86233Zz;
        this.LJLJJI = c86333a9;
        this.LJLJJL = c86283a4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C86203Zw c86203Zw = new C86203Zw(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c86203Zw.LJLILLLLZI = obj;
        return c86203Zw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC64672gJ interfaceC64672gJ;
        C86323a8 c86323a8;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c86323a8 = (C86323a8) this.LJLILLLLZI;
                    C141335gf.LIZJ(obj);
                    C86283a4 c86283a4 = this.LJLJJL;
                    c86283a4.LJLIL = c86323a8.LJLJJI;
                    c86283a4.LJLJLJ = false;
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            interfaceC64672gJ = (InterfaceC64672gJ) this.LJLILLLLZI;
            C86233Zz<SEARCH_RESULT> c86233Zz = this.LJLJI;
            C86333a9 c86333a9 = this.LJLJJI;
            C86283a4 c86283a42 = this.LJLJJL;
            this.LJLILLLLZI = interfaceC64672gJ;
            this.LJLIL = 1;
            obj = c86233Zz.LIZJ(c86333a9, c86283a42, new C4ZR(C4ZS.LIZ), new C86043Zg(c86233Zz), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C86323a8 c86323a82 = (C86323a8) obj;
        this.LJLILLLLZI = c86323a82;
        this.LJLIL = 2;
        if (interfaceC64672gJ.emit(c86323a82, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        c86323a8 = c86323a82;
        C86283a4 c86283a43 = this.LJLJJL;
        c86283a43.LJLIL = c86323a8.LJLJJI;
        c86283a43.LJLJLJ = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create(obj, (InterfaceC67352kd) obj2)).invokeSuspend(C76800UCe.LIZ);
    }
}
