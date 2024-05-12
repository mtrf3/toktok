package X;

import com.bytedance.android.live.effect.soundeffect.SoundEffectFragment;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectFragment$initView$2$1$1", f = "SoundEffectFragment.kt", l = {133}, m = "invokeSuspend")
/* renamed from: X.2HB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SoundEffectFragment LJLILLLLZI;
    public final /* synthetic */ C28J LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2HB(SoundEffectFragment soundEffectFragment, C28J c28j, InterfaceC67352kd<? super C2HB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = soundEffectFragment;
        this.LJLJI = c28j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2HB(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XK4 xk4;
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
            C76104Tts c76104Tts = this.LJLILLLLZI.LJLJI;
            if (c76104Tts != null) {
                c76104Tts.LJII = true;
                c76104Tts.LIZLLL();
            }
            SoundEffectViewModel soundEffectViewModel = this.LJLILLLLZI.LJLIL;
            if (soundEffectViewModel != null && (xk4 = soundEffectViewModel.LJLILLLLZI) != null) {
                C36941cg c36941cg = new C36941cg(this.LJLJI.LJLIL);
                this.LJLIL = 1;
                if (xk4.LJIIIZ(c36941cg, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
