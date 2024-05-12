package X;

import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audio.copyrightdetect.AutoSoundCheckService$getAutoSoundStatus$1", f = "AutoSoundCheckService.kt", l = {27}, m = "invokeSuspend")
/* renamed from: X.2eD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63372eD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ AutoSoundCheckService LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C63372eD(AutoSoundCheckService autoSoundCheckService, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super C63372eD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = autoSoundCheckService;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63372eD(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            boolean LIZ = ((AudioCopyrightDetectAPI) this.LJLILLLLZI.LIZ.getValue()).LIZ();
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C63332e9 c63332e9 = new C63332e9(null, this.LJLJI, LIZ);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c63332e9, this) == enumC58928NAu) {
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
