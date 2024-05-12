package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.UseLiveEffectHelper$setEffect$result$1", f = "UseLiveEffectHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.S6u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71564S6u extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ InterfaceC07990Tb LJLIL;
    public final /* synthetic */ LiveEffect LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71564S6u(InterfaceC07990Tb interfaceC07990Tb, LiveEffect liveEffect, String str, String str2, InterfaceC67352kd<? super C71564S6u> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC07990Tb;
        this.LJLILLLLZI = liveEffect;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71564S6u(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC07990Tb interfaceC07990Tb = this.LJLIL;
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        return Boolean.valueOf(interfaceC07990Tb.LIZJ(STICKER, this.LJLILLLLZI, null, this.LJLJI, true, this.LJLJJI));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
