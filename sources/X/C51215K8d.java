package X;

import com.ss.android.ugc.aweme.ecomsearch.ui.EcSearchContainerFragment;
import org.json.JSONObject;

/* renamed from: X.K8d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51215K8d implements InterfaceC74055T4p {
    public final /* synthetic */ EcSearchContainerFragment LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI kei) {
    }

    public C51215K8d(EcSearchContainerFragment ecSearchContainerFragment) {
        this.LIZ = ecSearchContainerFragment;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI kei) {
        int i = kei.LIZLLL;
        this.LIZ.LJLIL.setIndex(i);
        if (kei.LIZLLL != this.LIZ.LJLLL) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", System.currentTimeMillis() - this.LIZ.LJZ.longValue());
                jSONObject.put("enter_method", "switch_tab");
                jSONObject.put("next_tab", C51214K8c.LJ(kei.LIZLLL));
                jSONObject.put("search_entrance", this.LIZ.LJLIL.getSearchEnterParam().getEnterSearchFrom());
                jSONObject.put("search_id", this.LIZ.vl().LJLJJI.getSearchId());
                jSONObject.put("search_keyword", this.LIZ.LJLIL.getKeyword());
                jSONObject.put("current_tab", C51214K8c.LJ(this.LIZ.LJLLL));
                C48658J7u.LIZIZ("rd_ec_search_switch_tab_finish", jSONObject);
            } catch (Exception unused) {
            }
        }
        this.LIZ.LJZ = Long.valueOf(System.currentTimeMillis());
        EcSearchContainerFragment ecSearchContainerFragment = this.LIZ;
        ecSearchContainerFragment.LJLLL = i;
        ecSearchContainerFragment.Dl(i);
    }
}
