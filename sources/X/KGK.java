package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.ShopVerticalAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KGK extends AbstractC60800Ntc {
    public final /* synthetic */ ShopVerticalAssem LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLZ.put("container_inited", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLZ).get("start_navigation");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.H3(currentTimeMillis - j, "init_container");
    }

    public KGK(ShopVerticalAssem shopVerticalAssem) {
        this.LJLIL = shopVerticalAssem;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        long j;
        ISearchVerticalContext iSearchVerticalContext;
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLZ.put("template_loaded", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLZ).get("template_prepared");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.H3(currentTimeMillis - j, "load_template");
        if (C58802Sm.LIZ()) {
            this.LJLIL.LJZ = new KFW(view, "search-live-tab");
            ShopVerticalAssem shopVerticalAssem = this.LJLIL;
            KFW kfw = shopVerticalAssem.LJZ;
            if (kfw != null && (iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(shopVerticalAssem), ISearchVerticalContext.class, null)) != null) {
                iSearchVerticalContext.aQ(kfw);
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLZ.put("view_inited", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLZ).get("container_inited");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.H3(currentTimeMillis - j, "init_view");
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        long j;
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(kitType, "kitType");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLZ.put("app_loaded", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLZ).get("template_prepared");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.H3(currentTimeMillis - j, "load_app");
        ShopVerticalAssem shopVerticalAssem = this.LJLIL;
        if (shopVerticalAssem.LJLZ.containsKey("app_loaded") && shopVerticalAssem.LJLZ.containsKey("draw_done")) {
            C50865Jxl c50865Jxl = this.LJLIL.LJLLLLLL;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
            if (c50865Jxl != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
            }
            if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.updateData(C51029K0z.LJJIIZI(new OSZ("searchShopContainerPerf", this.LJLIL.LJLZ)));
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        long j;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLZ.put("template_prepared", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLZ).get("view_inited");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.H3(currentTimeMillis - j, "prepare_template");
    }
}
