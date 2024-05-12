package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.UploadFrameServiceImpl$UploadFrameTask$createFramePackage$2$1", f = "UploadFrameServiceImpl.kt", l = {136}, m = "invokeSuspend")
/* renamed from: X.ENo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36328ENo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC67352kd LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<String> LJLJI;
    public final /* synthetic */ H16 LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C36328ENo(InterfaceC67352kd<? super String> interfaceC67352kd, H16 h16, InterfaceC67352kd<? super C36328ENo> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLJI = interfaceC67352kd;
        this.LJLJJI = h16;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36328ENo(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC67352kd<String> interfaceC67352kd;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                interfaceC67352kd = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC67352kd = this.LJLJI;
            InterfaceC36329ENp interfaceC36329ENp = (InterfaceC36329ENp) this.LJLJJI.LJII.getValue();
            this.LJLIL = interfaceC67352kd;
            this.LJLILLLLZI = 1;
            obj = interfaceC36329ENp.LIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
