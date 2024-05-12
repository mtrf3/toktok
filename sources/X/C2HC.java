package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$selectItem$1", f = "SoundEffectViewModel.kt", l = {143, 145}, m = "invokeSuspend")
/* renamed from: X.2HC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public SoundEffect LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ SoundEffectViewModel LJLJI;
    public final /* synthetic */ SoundEffect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2HC(SoundEffectViewModel soundEffectViewModel, SoundEffect soundEffect, InterfaceC67352kd<? super C2HC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = soundEffectViewModel;
        this.LJLJJI = soundEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2HC(this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
