package X;

import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSPanelUIComponent$fetchVoiceEffectList$1$voiceListResult$1", f = "TTSPanelUIComponent.kt", l = {948}, m = "invokeSuspend")
/* renamed from: X.5aW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137525aW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends ReadTextEffectBean>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C138075bP LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137525aW(C138075bP c138075bP, InterfaceC67352kd<? super C137525aW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c138075bP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137525aW(this.LJLILLLLZI, interfaceC67352kd);
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
            C138075bP c138075bP = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c138075bP.LLJJIII(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends ReadTextEffectBean>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
