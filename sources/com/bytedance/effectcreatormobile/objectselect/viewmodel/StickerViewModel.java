package com.bytedance.effectcreatormobile.objectselect.viewmodel;

import X.C113554cx;
import X.C79863Bm;
import X.C93670aUc;
import X.C94061aav;
import X.C94845anZ;
import X.OSZ;
import X.V1M;
import X.V8H;
import X.XKX;
import X.XLM;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class StickerViewModel extends ViewModel {
    public final XLM LJLIL;
    public final C79863Bm LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public StickerViewModel(String lokiPanelKey, String category) {
        o.LJIIIZ(lokiPanelKey, "lokiPanelKey");
        o.LJIIIZ(category, "category");
        this.LJLJI = lokiPanelKey;
        this.LJLJJI = category;
        XLM LIZ = V8H.LIZ(C94061aav.LIZIZ);
        this.LJLIL = LIZ;
        this.LJLILLLLZI = V1M.LIZLLL(LIZ);
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94845anZ(this, null), 3);
    }

    public static void gv0(Long l, boolean z) {
        String str;
        OSZ[] oszArr = new OSZ[1];
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        oszArr[0] = new OSZ("deliver_result", str);
        Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        if (l != null) {
            LJJLIIIIJ.put("time_cost", String.valueOf(l.longValue()));
        }
        StatisticReporter LIZ = C93670aUc.LIZ();
        if (LIZ != null) {
            LIZ.onEvent("server_deliver_library_asset_list", LJJLIIIIJ);
        }
    }
}
