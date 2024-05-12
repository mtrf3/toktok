package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.EcUgVSAService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import kotlin.jvm.internal.o;

/* renamed from: X.Lx3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55917Lx3 implements LDY {
    public final /* synthetic */ CustomDotAssem LJLIL;

    public C55917Lx3(CustomDotAssem customDotAssem) {
        this.LJLIL = customDotAssem;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        o.LJIIIZ(to, "to");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopTab Tooltip TooltipAvoid onTabChange from: ");
        LIZ.append(str);
        LIZ.append(" to: ");
        LIZ.append(to);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        CustomDotVM v3 = this.LJLIL.v3();
        v3.getClass();
        v3.LJLLL = to;
        if (o.LJ("SHOP_MALL", to)) {
            CustomDotVM v32 = this.LJLIL.v3();
            v32.getClass();
            IEcUgVSAService LJIIJJI = EcUgVSAService.LJIIJJI();
            if (LJIIJJI == null || !LJIIJJI.LJFF()) {
                C78565UsT.LJJIJIIJI(v32, MBB.INSTANCE, new EC9(v32, null));
                return;
            }
            return;
        }
        this.LJLIL.v3().rv0(false);
    }
}
