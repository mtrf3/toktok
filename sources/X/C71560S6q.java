package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.UseLiveEffectHelper$setEffect$4", f = "UseLiveEffectHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.S6q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71560S6q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71562S6s LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71560S6q(C71562S6s c71562S6s, boolean z, Boolean bool, String str, String str2, String str3, InterfaceC67352kd<? super C71560S6q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71562S6s;
        this.LJLILLLLZI = z;
        this.LJLJI = bool;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71560S6q(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        C141335gf.LIZJ(obj);
        C71554S6k c71554S6k = this.LJLIL.LIZ.LIZ;
        boolean z2 = this.LJLILLLLZI;
        Boolean bool = this.LJLJI;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (this.LJLILLLLZI) {
            str = this.LJLJJI;
        } else {
            str = this.LJLJJL;
        }
        if (str == null) {
            str = "";
        }
        C71559S6p c71559S6p = new C71559S6p(str, System.currentTimeMillis(), this.LJLJJLL, z2, z);
        c71554S6k.getClass();
        C71569S6z.LIZ().storeString("key_last_use_effect_record", C27739Aud.LJI(c71559S6p));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
