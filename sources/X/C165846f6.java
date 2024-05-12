package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startFilterVoiceChange$1", f = "VoiceChanger.kt", l = {189}, m = "invokeSuspend")
/* renamed from: X.6f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165846f6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C165866f8 LJLILLLLZI;
    public final /* synthetic */ InterfaceC166046fQ LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165846f6(C165866f8 c165866f8, InterfaceC166046fQ interfaceC166046fQ, String str, int i, InterfaceC67352kd<? super C165846f6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c165866f8;
        this.LJLJI = interfaceC166046fQ;
        this.LJLJJI = str;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165846f6(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            XIC xic = C78613UtF.LIZ;
            C165856f7 c165856f7 = new C165856f7(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, null);
            this.LJLIL = 1;
            if (XKX.LJI(xic, c165856f7, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
