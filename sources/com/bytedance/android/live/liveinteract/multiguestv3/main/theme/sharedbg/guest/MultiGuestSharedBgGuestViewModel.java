package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest;

import X.C74987Tbr;
import X.C75160Tee;
import X.C75235Tfr;
import X.C75241Tfx;
import X.C75272TgS;
import X.C78886Uxe;
import X.C8E;
import X.CN1;
import X.X1D;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class MultiGuestSharedBgGuestViewModel extends AssemViewModel<C75235Tfr> {
    public static final /* synthetic */ int LJLJJI = 0;
    public long LJLIL;
    public String LJLILLLLZI;
    public final C75160Tee LJLJI = new C75160Tee(this);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C75235Tfr defaultState() {
        return new C75235Tfr(false, null, "", null);
    }

    public final void hv0(SeiAppData seiAppData) {
        long j;
        String str;
        Map<String, Map<String, String>> map;
        Map<String, String> map2;
        if (seiAppData != null) {
            j = seiAppData.timestamp;
        } else {
            j = 0;
        }
        if (j < this.LJLIL) {
            return;
        }
        if (seiAppData != null) {
            this.LJLIL = seiAppData.timestamp;
        }
        if (C78886Uxe.LJJJJZ(C8E.LJ()) == 5) {
            return;
        }
        if (seiAppData == null || (map = seiAppData.businessExtraInfo) == null || (map2 = map.get("shared_bg")) == null || (str = map2.get("sticker_id")) == null) {
            str = "";
        }
        gv0(str, false);
    }

    public final void gv0(String str, boolean z) {
        if (o.LJ(getState().LJLILLLLZI, str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply shared bg, sharedBgStickerId = ");
        LIZ.append(str);
        C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ));
        if (str == null || str.length() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("clear shared bg ");
            LIZ2.append(str);
            C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ2));
            setState(C75241Tfx.LJLIL);
            this.LJLILLLLZI = null;
            return;
        }
        if (o.LJ(this.LJLILLLLZI, str)) {
            C74987Tbr.LIZJ("guest_shared_bg", "apply shared bg, ignore duplicate loading");
            return;
        }
        this.LJLILLLLZI = str;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("fetchSingleEffect ");
        LIZ3.append(str);
        C74987Tbr.LIZJ("guest_shared_bg", X1D.LIZIZ(LIZ3));
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveEffectDataProvider().LIZJ(str, new C75272TgS(this, z, str));
    }
}
