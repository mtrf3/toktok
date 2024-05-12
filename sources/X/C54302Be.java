package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController$updateEffectValue$2$1", f = "LiveEffectController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54302Be extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ LiveEffect LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54302Be(LiveEffect liveEffect, String str, int i, InterfaceC67352kd<? super C54302Be> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = liveEffect;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54302Be(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C1KC c1kc = C1KC.LIZ;
        LiveEffect liveEffect = this.LJLIL;
        String str = this.LJLILLLLZI;
        int i = this.LJLJI;
        c1kc.getClass();
        C12880ey.LIZ().LJIIJJI(i, liveEffect, str);
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
