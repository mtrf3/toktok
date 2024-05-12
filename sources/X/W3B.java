package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.text.effect.EffectEditText$initBgRes$2", f = "EffectEditText.kt", l = {240}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class W3B extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InnerEffectTextConfig LJLILLLLZI;
    public final /* synthetic */ WH4 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3B(InnerEffectTextConfig innerEffectTextConfig, WH4 wh4, InterfaceC67352kd<? super W3B> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = innerEffectTextConfig;
        this.LJLJI = wh4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new W3B(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0022 A[SYNTHETIC] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3B.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
