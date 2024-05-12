package com.ss.android.ugc.aweme.task;

import X.AV1;
import X.C0RN;
import X.C16880lQ;
import X.C38995FSd;
import X.C47497IkX;
import X.C47636Imm;
import X.C47959Irz;
import X.C48480J0y;
import X.C54874LgE;
import X.C54875LgF;
import X.C78685UuP;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.J10;
import X.LJ5;
import Y.ARunnableS45S0100000_9;
import Y.IDhS105S0100000_12;
import android.content.Context;
import com.ss.android.ugc.aweme.api.NearbyFeedApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class InitNearbyTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InitNearbyTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static void LIZLLL() {
        String str;
        boolean z;
        String str2;
        FeedItemList itemList;
        List<Aweme> items;
        File LIZLLL;
        J10.LIZ.getClass();
        if (J10.LIZ() == 0 || !NearbyTabConfig.LIZIZ().showTab || !NearbyTabConfig.LJFF()) {
            return;
        }
        RoamingLocationInfo LJFF = LJ5.LJFF();
        if (LJFF != null) {
            str = LJFF.getManualRegion();
            z = LJFF.isManual();
        } else {
            str = null;
            z = false;
        }
        if (o.LJ(C48480J0y.LJ().getString("nearby_cache_current_uid", ""), AV1.LIZIZ().getSecUid()) && (LIZLLL = C48480J0y.LIZLLL()) != null) {
            try {
                if (!o.LJ(C48480J0y.LJ().getString("nearby_cache_last_region", ""), str)) {
                    C16880lQ.LLLZZIL(LIZLLL);
                } else if (System.currentTimeMillis() - C48480J0y.LJ().getLong("nearby_cache_time", 0L) <= J10.LIZ()) {
                    return;
                } else {
                    C16880lQ.LLLZZIL(LIZLLL);
                }
            } catch (Exception unused) {
                if (1 == 0) {
                    return;
                }
            }
        }
        double LJII = C47636Imm.LJII(2);
        int LIZJ = C47497IkX.LIZJ();
        if (z) {
            str2 = str;
        } else {
            str2 = null;
        }
        C54874LgE c54874LgE = new C54874LgE(0, LJII, LIZJ, str2, null, 0, null, null, 3968);
        String LIZLLL2 = C47959Irz.LIZLLL(31744, "nearby_preload_cache_url", "", false);
        if (LIZLLL2 != null && C78685UuP.LJJJZ(LIZLLL2)) {
            new C54875LgF().LIZ.getClass();
            String LIZJ2 = a.LJIIZILJ().LIZJ();
            ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LJIIIZ("nearby");
            itemList = NearbyFeedApi.LIZIZ.preloadNearbyFeedList(LIZLLL2, LIZJ, 6, null, 0, LJII, c54874LgE.LJI, LIZJ2, "").get().LIZJ(new IDhS105S0100000_12(0, 6));
            if (itemList != null && (items = itemList.getItems()) != null) {
                ((IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class)).LIZIZ("nearby", items);
                itemList.items = items;
            }
            o.LJIIIIZZ(itemList, "itemList");
        } else {
            itemList = new C54875LgF().LIZ.LJIILL(c54874LgE);
        }
        if (itemList.size() > 0) {
            C48480J0y.LIZ(itemList, str);
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C38995FSd.LIZLLL().execute(new ARunnableS45S0100000_9(this, 97));
    }
}
