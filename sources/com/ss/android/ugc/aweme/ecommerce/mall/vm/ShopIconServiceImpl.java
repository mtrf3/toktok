package com.ss.android.ugc.aweme.ecommerce.mall.vm;

import X.C36746EbW;
import X.C53286Kvi;
import X.C58096Mr6;
import X.C78565UsT;
import X.ECA;
import X.MBB;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotVM;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.toptab.TopTabCustomDotHandler;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;

/* loaded from: classes10.dex */
public final class ShopIconServiceImpl implements IShopIconService {
    public CustomDotAssem LIZ;

    public static IShopIconService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IShopIconService.class, false);
        if (LIZ != null) {
            return (IShopIconService) LIZ;
        }
        if (C58096Mr6.f82X == null) {
            synchronized (IShopIconService.class) {
                if (C58096Mr6.f82X == null) {
                    C58096Mr6.f82X = new ShopIconServiceImpl();
                }
            }
        }
        return C58096Mr6.f82X;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final void LIZIZ() {
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null) {
            customDotAssem.LJLIL.LJIIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final void LIZJ() {
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null) {
            CustomDotVM v3 = customDotAssem.v3();
            v3.getClass();
            C78565UsT.LJJIJIIJI(v3, MBB.INSTANCE, new ECA(v3, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final boolean LJ() {
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem == null || !customDotAssem.LJLIL.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final CustomDotAssem LIZ() {
        CustomDotAssem customDotAssem;
        if (C53286Kvi.LIZLLL()) {
            customDotAssem = new CustomDotAssem(new BottomTabCustomDotHandler());
        } else if (C53286Kvi.LJ()) {
            customDotAssem = new CustomDotAssem(new TopTabCustomDotHandler());
        } else {
            customDotAssem = null;
        }
        this.LIZ = customDotAssem;
        return customDotAssem;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService
    public final void LIZLLL(int i, int i2) {
        CustomDotAssem customDotAssem = this.LIZ;
        if (customDotAssem != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ShopTab Tooltip TooltipAvoid onTopTabScrollChanged l: ");
            LIZ.append(i);
            LIZ.append(" oldl: ");
            LIZ.append(i2);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
            customDotAssem.LJLIL.LJIIJJI();
        }
    }
}
