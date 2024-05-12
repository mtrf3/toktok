package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectAdapter$onItemClicked$1", f = "SoundEffectAdapter.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.2H4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2H4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C44351od LJLILLLLZI;
    public final /* synthetic */ SoundEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2H4(C44351od c44351od, SoundEffect soundEffect, InterfaceC67352kd<? super C2H4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c44351od;
        this.LJLJI = soundEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2H4(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            SoundEffectViewModel soundEffectViewModel = this.LJLILLLLZI.LJLJJL;
            if (soundEffectViewModel != null && (xk4 = soundEffectViewModel.LJLILLLLZI) != null) {
                C36951ch c36951ch = new C36951ch(this.LJLJI);
                this.LJLIL = 1;
                if (xk4.LJIIIZ(c36951ch, this) == enumC58928NAu) {
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
