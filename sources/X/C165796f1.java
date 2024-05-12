package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startPrefetchVoiceChangeMaterial$1", f = "VoiceChanger.kt", l = {251}, m = "invokeSuspend")
/* renamed from: X.6f1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165796f1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC165816f3 LJLILLLLZI;
    public final /* synthetic */ C165866f8 LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165796f1(InterfaceC165816f3 interfaceC165816f3, C165866f8 c165866f8, String str, InterfaceC67352kd<? super C165796f1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC165816f3;
        this.LJLJI = c165866f8;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165796f1(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            InterfaceC165816f3 interfaceC165816f3 = this.LJLILLLLZI;
            if (interfaceC165816f3 != null) {
                interfaceC165816f3.onStart();
            }
            XIC xic = C78613UtF.LIZ;
            C165806f2 c165806f2 = new C165806f2(this.LJLJI, this.LJLJJI, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xic, c165806f2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC165816f3 interfaceC165816f32 = this.LJLILLLLZI;
            if (interfaceC165816f32 != null) {
                interfaceC165816f32.onSuccess();
            }
        } else {
            InterfaceC165816f3 interfaceC165816f33 = this.LJLILLLLZI;
            if (interfaceC165816f33 != null) {
                interfaceC165816f33.onFailed();
            }
        }
        return C76800UCe.LIZ;
    }
}
