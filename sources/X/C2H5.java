package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import fjb.a;
import kotlin.jvm.internal.IDqS172S0200000;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$downloadItem$1", f = "SoundEffectViewModel.kt", l = {205}, m = "invokeSuspend")
/* renamed from: X.2H5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2H5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SoundEffectViewModel LJLILLLLZI;
    public final /* synthetic */ SoundEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2H5(SoundEffectViewModel soundEffectViewModel, SoundEffect soundEffect, InterfaceC67352kd<? super C2H5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = soundEffectViewModel;
        this.LJLJI = soundEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2H5(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C37951eJ c37951eJ = this.LJLILLLLZI.LJLJJL;
            SoundEffect soundEffect = this.LJLJI;
            c37951eJ.getClass();
            if (C37951eJ.LIZLLL(soundEffect)) {
                XLL xll = this.LJLILLLLZI.LJLJI;
                C37091cv c37091cv = new C37091cv(this.LJLJI);
                this.LJLIL = 1;
                if (xll.emit(c37091cv, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                SoundEffectViewModel soundEffectViewModel = this.LJLILLLLZI;
                C37951eJ c37951eJ2 = soundEffectViewModel.LJLJJL;
                SoundEffect soundEffect2 = this.LJLJI;
                c37951eJ2.LIZJ(soundEffect2, new IDqS172S0200000(soundEffectViewModel, soundEffect2, 94));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
