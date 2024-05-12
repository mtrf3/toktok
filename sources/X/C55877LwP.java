package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;

/* renamed from: X.LwP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55877LwP implements InterfaceC55929LxF {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<EnumC55811LvL, C76800UCe> LIZIZ;
    public final /* synthetic */ BottomTabCustomDotHandler LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.InterfaceC55929LxF
    public final void LIZ() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.InterfaceC55929LxF
    public final void LIZIZ() {
        InterfaceC55235Lm3 LJIIZILJ;
        HomeTabAbility homeTabAbility;
        LLQ OH;
        BottomTabCustomDotHandler bottomTabCustomDotHandler = this.LIZJ;
        ActivityC45651qj activityC45651qj = bottomTabCustomDotHandler.LIZ;
        if (activityC45651qj != null) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
            C36746EbW.LIZ(3, "ShopTab Tooltip Click");
            CustomDotAssem customDotAssem = bottomTabCustomDotHandler.LIZJ;
            if (customDotAssem != null && (LJIIZILJ = C55096Ljo.LJIIZILJ(customDotAssem)) != null && (homeTabAbility = (HomeTabAbility) C55096Ljo.LIZ(LJIIZILJ, HomeTabAbility.class, null)) != null && (OH = homeTabAbility.OH(activityC45651qj)) != null) {
                OH.LJIJJ("SHOP_MALL");
            }
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    @Override // X.InterfaceC55929LxF
    public final void LIZJ(EnumC55811LvL enumC55811LvL) {
        InterfaceC88472Yns<EnumC55811LvL, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(enumC55811LvL);
        }
    }

    public C55877LwP(AqS156S0200000_9 aqS156S0200000_9, AqS140S0200000_9 aqS140S0200000_9, BottomTabCustomDotHandler bottomTabCustomDotHandler, AqS156S0200000_9 aqS156S0200000_92) {
        this.LIZ = aqS156S0200000_9;
        this.LIZIZ = aqS140S0200000_9;
        this.LIZJ = bottomTabCustomDotHandler;
        this.LIZLLL = aqS156S0200000_92;
    }
}
