package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.addyours.RecordAddYoursStickerComponent$onCreate$1$5$1$1", f = "RecordAddYoursStickerComponent.kt", l = {231}, m = "invokeSuspend")
/* renamed from: X.6UZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6UZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6QO LJLILLLLZI;
    public final /* synthetic */ C6UV LJLJI;
    public final /* synthetic */ C6UY LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6UZ(C6QO c6qo, C6UV c6uv, C6UY c6uy, InterfaceC67352kd<? super C6UZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6qo;
        this.LJLJI = c6uv;
        this.LJLJJI = c6uy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6UZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            if (c6qo != null) {
                this.LJLIL = 1;
                if (c6qo.LJIJJLI(false, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        this.LJLJI.yc();
        InterfaceC45889Hzh LJJLIIIJILLIZJL = this.LJLJJI.LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null) {
            LJJLIIIJILLIZJL.manualClickUploadButton();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
