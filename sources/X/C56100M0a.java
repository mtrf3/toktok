package X;

import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.IconCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.bottomtab.BottomTabCustomDotHandler;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.M0a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56100M0a implements LDY {
    public final /* synthetic */ BottomTabCustomDotHandler LJLIL;
    public final /* synthetic */ CustomDotAssem LJLILLLLZI;

    public C56100M0a(BottomTabCustomDotHandler bottomTabCustomDotHandler, CustomDotAssem customDotAssem) {
        this.LJLIL = bottomTabCustomDotHandler;
        this.LJLILLLLZI = customDotAssem;
    }

    @Override // X.LDY
    public final void LIZ(String str, String to) {
        IconCfg iconCfg;
        o.LJIIIZ(to, "to");
        if (o.LJ(this.LJLIL.LIZLLL, to)) {
            CustomDotVM v3 = this.LJLILLLLZI.v3();
            v3.LJLIL = v3.LJLILLLLZI;
            v3.withState(new AqS175S0100000_9(v3, 475));
            CustomDotResponse customDotResponse = v3.LJLL;
            if (customDotResponse != null) {
                iconCfg = customDotResponse.getIconConfig();
            } else {
                iconCfg = null;
            }
            if (iconCfg == null && (customDotResponse == null || customDotResponse.getCountConfig() == null)) {
                v3.lv0(new EC2(true, v3, null), true, false);
                return;
            } else {
                v3.lv0(new EC1(customDotResponse, v3, null), true, true);
                return;
            }
        }
        CustomDotVM v32 = this.LJLILLLLZI.v3();
        v32.getClass();
        v32.lv0(new EC2(false, v32, null), false, false);
    }
}
