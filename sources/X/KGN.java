package X;

import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchStoreFragmentNew;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KGN extends AbstractC60800Ntc {
    public final /* synthetic */ DynamicSearchStoreFragmentNew LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLL() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LLJ.put("container_inited", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LLJ).get("start_navigation");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.hm(currentTimeMillis - j, "init_container");
    }

    public KGN(DynamicSearchStoreFragmentNew dynamicSearchStoreFragmentNew) {
        this.LJLIL = dynamicSearchStoreFragmentNew;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        long j;
        o.LJIIIZ(view, "view");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LLJ.put("template_loaded", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LLJ).get("template_prepared");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.hm(currentTimeMillis - j, "load_template");
        KGP kgp = this.LJLIL.LLIIIZ;
        if (kgp != null && C58802Sm.LIZ()) {
            DynamicSearchStoreFragmentNew dynamicSearchStoreFragmentNew = this.LJLIL;
            KFW kfw = new KFW(view, "store-tab-vertical-page");
            dynamicSearchStoreFragmentNew.LLIIJI = kfw;
            kgp.LJLJJLL = kfw;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LLJ.put("view_inited", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LLJ).get("container_inited");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.hm(currentTimeMillis - j, "init_view");
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        long j;
        InterfaceC60761Nsz kitView;
        o.LJIIIZ(kitType, "kitType");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LLJ.put("app_loaded", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LLJ).get("template_prepared");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.hm(currentTimeMillis - j, "load_app");
        DynamicSearchStoreFragmentNew dynamicSearchStoreFragmentNew = this.LJLIL;
        if (dynamicSearchStoreFragmentNew.LLJ.containsKey("app_loaded") && dynamicSearchStoreFragmentNew.LLJ.containsKey("draw_done")) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = this.LJLIL.Ol().LIZIZ();
            if ((LIZIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) && LIZIZ != null && (kitView = LIZIZ.getKitView()) != null) {
                kitView.updateData(C51029K0z.LJJIIZI(new OSZ("searchShopContainerPerf", this.LJLIL.LLJ)));
            }
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        long j;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL.LLJ.put("template_prepared", Long.valueOf(currentTimeMillis));
        Long l = (Long) ((LinkedHashMap) this.LJLIL.LLJ).get("view_inited");
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.LJLIL.hm(currentTimeMillis - j, "prepare_template");
    }
}
