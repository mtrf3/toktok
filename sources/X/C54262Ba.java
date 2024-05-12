package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectController$setEffect$2$2", f = "LiveEffectController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54262Ba extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<LiveEffect, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ LiveEffect LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C54262Ba(InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super LiveEffect, C76800UCe> interfaceC88472Yns, LiveEffect liveEffect, String str, String str2, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC67352kd<? super C54262Ba> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = liveEffect;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = z;
        this.LJLJL = interfaceC65784Pro2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54262Ba(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.invoke().booleanValue()) {
            InterfaceC88472Yns<LiveEffect, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(this.LJLJI);
            }
            C1KC c1kc = C1KC.LIZ;
            String str = this.LJLJJI;
            String str2 = this.LJLJJL;
            LiveEffect liveEffect = this.LJLJI;
            boolean z = this.LJLJJLL;
            c1kc.getClass();
            C1KC.LJFF(liveEffect, str, str2, z);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJL;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
