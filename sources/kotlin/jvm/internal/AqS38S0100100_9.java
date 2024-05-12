package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C36746EbW;
import X.C38943FQd;
import X.C47261Igj;
import X.C56023Lyl;
import X.C56045Lz7;
import X.C56074Lza;
import X.C56090Lzq;
import X.C56091Lzr;
import X.C56117M0r;
import X.C56165M2n;
import X.C56167M2p;
import X.C64504PTg;
import X.C76800UCe;
import X.C79081V1x;
import X.EnumC56116M0q;
import X.InterfaceC65784Pro;
import X.KR8;
import X.M0P;
import X.M16;
import X.M17;
import X.M2D;
import X.M3Z;
import X.O3U;
import X.O9C;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.settings.ECFashionMallConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.ShopMainContentAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.placediscovery2.ui.assem.DiscoveryPoiListAssem;
import com.ss.android.ugc.aweme.placediscovery2.vm.DiscoveryLandingMapVM;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class AqS38S0100100_9 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS38S0100100_9 aqS38S0100100_9) {
        if (!KR8.LJIIIZ((DiscoveryPoiListAssem) aqS38S0100100_9.l0)) {
            ((DiscoveryPoiListAssem) aqS38S0100100_9.l0).LJLJI.getValue();
            C56165M2n.LIZIZ(new C56167M2p("KEY_INIT_LYNX", null, C47261Igj.LJJIJIIJI("KEY_FIRST_RESPONSE_SUCCESS", "KEY_FIRST_RESPONSE_ERROR"), true, null, 88));
            DiscoveryLandingMapVM discoveryLandingMapVM = (DiscoveryLandingMapVM) ((DiscoveryPoiListAssem) aqS38S0100100_9.l0).LJLJI.getValue();
            M3Z m3z = new M3Z("places_discover");
            m3z.LIZLLL = "page_render_list";
            m3z.LIZ(System.currentTimeMillis() - aqS38S0100100_9.j1);
            m3z.LIZIZ(1L);
            discoveryLandingMapVM.lv0(m3z);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS38S0100100_9 aqS38S0100100_9) {
        boolean z;
        boolean z2;
        long currentTimeMillis;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("jasontime = ");
        LIZ.append(System.currentTimeMillis() - aqS38S0100100_9.j1);
        C36746EbW.LIZ(3, X1D.LIZIZ(LIZ));
        Context context = ((ShopMainContentAssem) aqS38S0100100_9.l0).getContext();
        if (context == null) {
            context = ((ShopMainContentAssem) aqS38S0100100_9.l0)._$_findCachedViewById(R.id.isn).getContext();
        }
        o.LJIIIIZZ(context, "context ?: recycler_view.context");
        C56074Lza shopContentLynxCallback = ((ShopMainContentAssem) aqS38S0100100_9.l0).LJLJLJ;
        C56023Lyl c56023Lyl = C56023Lyl.LIZ;
        synchronized (c56023Lyl) {
            z = false;
            if (c56023Lyl.LIZ("ec_shop_main_cache_data").length() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        ShopMainContentAssem shopMainContentAssem = (ShopMainContentAssem) aqS38S0100100_9.l0;
        if (shopMainContentAssem.v3().LJLIL > 0) {
            currentTimeMillis = shopMainContentAssem.v3().LJLIL;
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        long j = ((ShopMainContentAssem) aqS38S0100100_9.l0).v3().LJLIL;
        float LJJIIZI = C79081V1x.LJJIIZI(Integer.valueOf(((ShopMainContentAssem) aqS38S0100100_9.l0)._$_findCachedViewById(R.id.isn).getHeight())) + 0.5f;
        String str2 = ((ShopMainContentAssem) aqS38S0100100_9.l0).v3().LJZ;
        if (str2 == null || ujb.o.LJJJJJL(str2)) {
            z = true;
        }
        boolean z3 = !z;
        o.LJIIIZ(shopContentLynxCallback, "shopContentLynxCallback");
        C56045Lz7.LJI(C56045Lz7.LIZ, EnumC56116M0q.STAGE_CREATE_SPARKVIEW.getStage(), System.currentTimeMillis() - C56090Lzq.LIZ, false, 28);
        HashMap hashMap = new HashMap();
        long currentTimeMillis2 = System.currentTimeMillis();
        C56117M0r c56117M0r = new C56117M0r(shopContentLynxCallback);
        long j2 = currentTimeMillis;
        C64504PTg.LIZJ(currentTimeMillis, hashMap, "tab_clicked_time", currentTimeMillis2, "init_time");
        String str3 = "1";
        if (z2) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_use_cache", obj);
        hashMap.put("enter_from", C56045Lz7.LIZIZ());
        if (C56090Lzq.LJFF == null) {
            C56090Lzq.LJFF = Boolean.valueOf(O3U.LJIILL("tiktok_live_ecommerce_ttmall"));
        }
        if (o.LJ(C56090Lzq.LJFF, Boolean.TRUE)) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_offline", obj2);
        if (z3) {
            obj3 = "1";
        } else {
            obj3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("from_deeplink", obj3);
        if (!C56090Lzq.LIZ()) {
            obj4 = "1";
        } else {
            obj4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_first_install_launch", obj4);
        if (C56090Lzq.LIZIZ()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_first_show_mall", str3);
        hashMap.put("recommend_height", String.valueOf(LJJIIZI));
        if (C56090Lzq.LJII == null) {
            C56090Lzq.LJII = O3U.LJIIJ(C38943FQd.LIZ(), "tiktok_live_ecommerce_ttmall");
        }
        Long l = C56090Lzq.LJII;
        if (l == null || (str = l.toString()) == null) {
            str = "";
        }
        hashMap.put("gecko_version_id", str);
        String url = ECFashionMallConfigSettings.LIZ().homeSchema;
        M2D m2d = new M2D();
        o.LJIIIZ(url, "url");
        m2d.LJIILLIIL = url;
        m2d.LIZJ.putAll(hashMap);
        m2d.LJ = "ec_mall_main_lynx_group_name";
        m2d.LJIILIIL = c56117M0r;
        m2d.LJII = new C56091Lzr(j, shopContentLynxCallback, z2);
        m2d.LJI = new M0P(j2, shopContentLynxCallback, z2);
        m2d.LJIIIIZZ = new AqS191S0100000_9(shopContentLynxCallback, 79);
        M16 action = M16.LJLIL;
        o.LJIIIZ(action, "action");
        m2d.LJIIIZ = action;
        M17 action2 = M17.LJLIL;
        o.LJIIIZ(action2, "action");
        m2d.LJFF = action2;
        return O9C.LIZ(context, m2d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS38S0100100_9(long j, ShopMainContentAssem shopMainContentAssem, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = shopMainContentAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS38S0100100_9(DiscoveryPoiListAssem discoveryPoiListAssem, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = discoveryPoiListAssem;
        this.j1 = j;
    }
}
