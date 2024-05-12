package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerManager$getStickerAssist$1$showStickerGuide$1", f = "StickerManager.kt", l = {720}, m = "invokeSuspend")
/* renamed from: X.6Pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159826Pa extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6QO LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C6PV LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ EnumC159956Pn LJLJJLL;
    public final /* synthetic */ Integer LJLJL;
    public final /* synthetic */ Integer LJLJLJ;
    public final /* synthetic */ Integer LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159826Pa(C6QO c6qo, boolean z, C6PV c6pv, String str, EnumC159956Pn enumC159956Pn, Integer num, Integer num2, Integer num3, InterfaceC67352kd<? super C159826Pa> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6qo;
        this.LJLJI = z;
        this.LJLJJI = c6pv;
        this.LJLJJL = str;
        this.LJLJJLL = enumC159956Pn;
        this.LJLJL = num;
        this.LJLJLJ = num2;
        this.LJLJLLL = num3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C159826Pa(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
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
            C6QO c6qo = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (c6qo.LJIJJLI(false, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C159836Pb.LJI(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLILLLLZI, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
