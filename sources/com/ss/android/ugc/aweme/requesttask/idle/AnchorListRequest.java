package com.ss.android.ugc.aweme.requesttask.idle;

import X.AnonymousClass030;
import X.C16880lQ;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.G7Q;
import X.UTU;
import X.UTV;
import X.UTW;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes14.dex */
public final class AnchorListRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "AnchorListRequest";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.BOOT_FINISH;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        UTW utw;
        if (!UTU.LJ) {
            UTU.LIZIZ = UTU.LIZ();
            UTU.LJ = true;
        }
        long j = UTU.LIZIZ;
        if (j != 60000 && (utw = (UTW) ((LinkedHashMap) UTV.LIZ).get("anchor_list")) != null) {
            j = utw.LJLIL ? 2147483647L : utw.LJLILLLLZI;
        }
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        G7Q g7q = G7Q.LJLIL;
        if (!AnchorListManager.LIZJ.getBoolean("anchor_local_map_success", false) || !AnchorListManager.LIZIZ()) {
            j = 0;
        }
        handler.postDelayed(g7q, j);
    }
}
