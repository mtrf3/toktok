package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.UseLiveEffectHelper$setEffect$2", f = "UseLiveEffectHelper.kt", l = {102}, m = "invokeSuspend")
/* renamed from: X.S6t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71563S6t extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71562S6s LJLILLLLZI;
    public final /* synthetic */ InterfaceC07990Tb LJLJI;
    public final /* synthetic */ LiveEffect LJLJJI;
    public final /* synthetic */ RootData LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71563S6t(C71562S6s c71562S6s, InterfaceC07990Tb interfaceC07990Tb, LiveEffect liveEffect, RootData rootData, String str, String str2, InterfaceC67352kd<? super C71563S6t> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71562S6s;
        this.LJLJI = interfaceC07990Tb;
        this.LJLJJI = liveEffect;
        this.LJLJJL = rootData;
        this.LJLJJLL = str;
        this.LJLJL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71563S6t(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            C71562S6s c71562S6s = this.LJLILLLLZI;
            InterfaceC07990Tb interfaceC07990Tb = this.LJLJI;
            LiveEffect liveEffect = this.LJLJJI;
            RootData rootData = this.LJLJJL;
            String str = this.LJLJJLL;
            String str2 = this.LJLJL;
            this.LJLIL = 1;
            c71562S6s.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            S5G.LIZJ(rootData, str, liveEffect.getResourceId(), str2, "download_effect_resource");
            interfaceC07990Tb.LIZIZ(liveEffect, new C71568S6y(rootData, str, liveEffect, str2, System.currentTimeMillis(), c84654XKg));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
