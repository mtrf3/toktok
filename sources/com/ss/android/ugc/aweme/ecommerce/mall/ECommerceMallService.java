package com.ss.android.ugc.aweme.ecommerce.mall;

import X.ActivityC45651qj;
import X.C00F;
import X.C16880lQ;
import X.C188787b0;
import X.C212428Vi;
import X.C221108m2;
import X.C2U8;
import X.C52428Khs;
import X.C52933Kq1;
import X.C53285Kvh;
import X.C53286Kvi;
import X.C53913LDx;
import X.C54741Le5;
import X.C56092Lzs;
import X.C56141M1p;
import X.C56662Kg;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C91493iT;
import X.IKB;
import X.InterfaceC53894LDe;
import X.LE1;
import X.LE2;
import X.LIT;
import X.X1D;
import android.os.Bundle;
import android.view.View;
import com.bytedance.hox.Hox;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideComponent;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa;
import com.ss.android.ugc.aweme.ecommerce.mall.settings.EcMallConfigSettings;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ECommerceMallService extends BaseMainContainerAssem implements IECommerceMallService, InterfaceC53894LDe, IECommerceServiceForSa {
    public String LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(LIT.LJLIL);

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final ECommerceMallService b() {
        return this;
    }

    public static IECommerceMallService v3() {
        Object LIZ = C58096Mr6.LIZ(IECommerceMallService.class, false);
        if (LIZ != null) {
            return (IECommerceMallService) LIZ;
        }
        if (C58096Mr6.V == null) {
            synchronized (IECommerceMallService.class) {
                if (C58096Mr6.V == null) {
                    C58096Mr6.V = new ECommerceMallService();
                }
            }
        }
        return C58096Mr6.V;
    }

    public static IECommerceServiceForSa x3() {
        Object LIZ = C58096Mr6.LIZ(IECommerceServiceForSa.class, false);
        if (LIZ != null) {
            return (IECommerceServiceForSa) LIZ;
        }
        if (C58096Mr6.V == null) {
            synchronized (IECommerceServiceForSa.class) {
                if (C58096Mr6.V == null) {
                    C58096Mr6.V = new ECommerceMallService();
                }
            }
        }
        return C58096Mr6.V;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final List<IInterceptor> LJJL() {
        return (List) this.LJLILLLLZI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final ECColdStartFetchTask LJJZ() {
        return new ECColdStartFetchTask();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa
    public final boolean LLLIIL() {
        if (((Number) C53285Kvh.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final LE1 R2() {
        return new LE1();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean a3() {
        if (o.LJ(this.LJLIL, "SHOP_MALL") || o.LJ(this.LJLIL, "Shop")) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void h() {
        C54741Le5 c54741Le5 = ShopMainFragment.LJZ;
        String str = this.LJLIL;
        c54741Le5.getClass();
        ShopMainFragment.LLII = str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final String i3() {
        C56092Lzs.LIZ.getClass();
        return C56092Lzs.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void l3() {
        C2U8.LIZ(new IKB());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean m3() {
        if (C00F.LIZ(31744, 1, "ec_mall_reuse_live_player", true) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean G2() {
        return C53286Kvi.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final String J0() {
        String str = EcMallConfigSettings.getValue().videoScene;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean LJJLI() {
        return C53286Kvi.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final EcVideoGuideComponent LLILLIZIL() {
        if (!LLJLILLLLZIIL() || (!C52933Kq1.LIZ() && C00F.LIZ(31744, 0, "no_cart_feed_video_find_more", true) < 1)) {
            return null;
        }
        return new EcVideoGuideComponent();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean LLJLILLLLZIIL() {
        if (C53286Kvi.LIZ() || C53286Kvi.LIZIZ()) {
            return C53286Kvi.LIZJ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final boolean Q1() {
        return C53286Kvi.LJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa
    public final boolean R1() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canShowFashionMallV2 ");
        if (C53285Kvh.LIZ() && !C52428Khs.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (!C53285Kvh.LIZ() || C52428Khs.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceServiceForSa
    public final boolean v1() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("canShowShopV3ForSA == ");
        if (C53285Kvh.LIZ() && C52428Khs.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
        if (!C53285Kvh.LIZ() || !C52428Khs.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void D0(String str) {
        ShopMainFragment.LJZ.getClass();
        ShopMainFragment.LLIIIJ = str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void L(ImageUrlModel imageUrlModel) {
        ShopMainFragment.LJZ.getClass();
        ShopMainFragment.LLIIII = imageUrlModel;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final View LJLJLLL(ActivityC45651qj activityC45651qj) {
        return C91493iT.LIZ(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void U2(C56141M1p c56141M1p) {
        C2U8.LIZ(new C53913LDx(c56141M1p, LE2.SHOW));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void Z0(C56141M1p c56141M1p) {
        C2U8.LIZ(new C53913LDx(c56141M1p, LE2.HIDE));
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(ECommerceMallService.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        C188787b0 c188787b0 = Hox.LJLLI;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            c188787b0.LIZ(LIZ).gv0(this);
            C56662Kg.LIZ().LJFF(LLLZ, false);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService
    public final void t3(String str) {
        ShopMainFragment.LJZ.getClass();
        ShopMainFragment.LLIIIILZ = str;
    }

    @Override // X.InterfaceC53894LDe
    public final void LJLJL(String str, String to) {
        o.LJIIIZ(to, "to");
        this.LJLIL = to;
    }
}
