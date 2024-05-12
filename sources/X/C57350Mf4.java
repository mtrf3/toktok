package X;

import Y.AgS112S0200000_9;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.Mf4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57350Mf4 extends F9E implements XGE {
    public final IAVEffectService.EffectPlatformLoader LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC84562XGs
    public final C57332Mem LLZL() {
        return new C57332Mem(3, 3000L, true);
    }

    @Override // X.InterfaceC84562XGs
    public final Object LJJLIIIJILLIZJL(XH8 xh8, InterfaceC67352kd<? super C57352Mf6> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        this.LJLIL.load(new AgS112S0200000_9(c84654XKg, this, 3));
        return c84654XKg.LIZ();
    }

    public C57350Mf4(IAVEffectService.EffectPlatformLoader effectPlatformSupplier, String str, boolean z) {
        o.LJIIIZ(effectPlatformSupplier, "effectPlatformSupplier");
        this.LJLIL = effectPlatformSupplier;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
    }
}
