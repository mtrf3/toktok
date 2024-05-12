package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.toptab.TopTabCustomDotHandler;
import kotlin.jvm.internal.o;

/* renamed from: X.Lx0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55914Lx0 implements LDY {
    public final /* synthetic */ CustomDotAssem LJLIL;
    public final /* synthetic */ TopTabCustomDotHandler LJLILLLLZI;

    public C55914Lx0(CustomDotAssem customDotAssem, TopTabCustomDotHandler topTabCustomDotHandler) {
        this.LJLIL = customDotAssem;
        this.LJLILLLLZI = topTabCustomDotHandler;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        LQ6 lq6;
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
        this.LJLIL.v3().getClass();
        if (!o.LJ(to, "HOME") && (lq6 = this.LJLILLLLZI.LJ) != null) {
            EnumC55811LvL disappearType = EnumC55811LvL.OTHER;
            o.LJIIIZ(disappearType, "disappearType");
            C55927LxD c55927LxD = lq6.LIZJ;
            if (c55927LxD != null) {
                c55927LxD.LIZ(disappearType);
            }
            lq6.LIZJ = null;
        }
        this.LJLIL.v3().rv0(this.LJLILLLLZI.LJII());
    }
}
