package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.ISearchVerticalContext;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.StoreVerticalAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KGL extends AbstractC60800Ntc {
    public final /* synthetic */ StoreVerticalAssem LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLLLLLL.put("container_inited", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLLLLLL).get("start_navigation");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.E3(currentTimeMillis - j, "init_container");
    }

    public KGL(StoreVerticalAssem storeVerticalAssem) {
        this.LJLIL = storeVerticalAssem;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        long j;
        ISearchVerticalContext iSearchVerticalContext;
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLLLLLL.put("template_loaded", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLLLLLL).get("template_prepared");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.E3(currentTimeMillis - j, "load_template");
        if (C58802Sm.LIZ()) {
            this.LJLIL.LJLIL = new KFW(view, "search-live-tab");
            StoreVerticalAssem storeVerticalAssem = this.LJLIL;
            KFW kfw = storeVerticalAssem.LJLIL;
            if (kfw != null && (iSearchVerticalContext = (ISearchVerticalContext) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(storeVerticalAssem), ISearchVerticalContext.class, null)) != null) {
                iSearchVerticalContext.aQ(kfw);
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLLLLLL.put("view_inited", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLLLLLL).get("container_inited");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.E3(currentTimeMillis - j, "init_view");
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        long j;
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(kitType, "kitType");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLLLLLL.put("app_loaded", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLLLLLL).get("template_prepared");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.E3(currentTimeMillis - j, "load_app");
        StoreVerticalAssem storeVerticalAssem = this.LJLIL;
        if (storeVerticalAssem.LJLLLLLL.containsKey("app_loaded") && storeVerticalAssem.LJLLLLLL.containsKey("draw_done")) {
            C50865Jxl c50865Jxl = this.LJLIL.LJLLLL;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
            if (c50865Jxl != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50865Jxl.LJIIJ;
            }
            if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
                kitView.updateData(C51029K0z.LJJIIZI(new OSZ("searchShopContainerPerf", this.LJLIL.LJLLLLLL)));
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        long j;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LJLLLLLL.put("template_prepared", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LJLLLLLL).get("view_inited");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.E3(currentTimeMillis - j, "prepare_template");
    }
}
