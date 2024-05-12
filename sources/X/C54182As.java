package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$unSelectItem$1", f = "SoundEffectViewModel.kt", l = {197}, m = "invokeSuspend")
/* renamed from: X.2As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54182As extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SoundEffectViewModel LJLILLLLZI;
    public final /* synthetic */ SoundEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54182As(SoundEffectViewModel soundEffectViewModel, SoundEffect soundEffect, InterfaceC67352kd<? super C54182As> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = soundEffectViewModel;
        this.LJLJI = soundEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54182As(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C37931eH c37931eH = this.LJLILLLLZI.LJLJJI;
            if (o.LJ(this.LJLJI, c37931eH.LJLJI)) {
                SoundEffect soundEffect = c37931eH.LJLJI;
                c37931eH.LJLJI = null;
                if (soundEffect != null) {
                    XLL xll = this.LJLILLLLZI.LJLJI;
                    C37121cy c37121cy = new C37121cy(soundEffect);
                    this.LJLIL = 1;
                    if (xll.emit(c37121cy, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
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
