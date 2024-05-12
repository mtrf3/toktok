package com.ss.android.ugc.aweme.commercialize.preview.service;

import X.C16880lQ;
import X.C26227ARb;
import X.C26231ARf;
import X.C53743L7j;
import X.C58096Mr6;
import X.C61175Nzf;
import X.C61176Nzg;
import X.C72827Si7;
import X.C78983UzD;
import X.FMX;
import X.ORY;
import X.UC0;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.preview.experiment.PreviewConfiguration;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdsPreviewServiceImpl implements IAdsPreviewService {
    public static IAdsPreviewService LJI() {
        Object LIZ = C58096Mr6.LIZ(IAdsPreviewService.class, false);
        if (LIZ != null) {
            return (IAdsPreviewService) LIZ;
        }
        if (C58096Mr6.LLLLLZIL == null) {
            synchronized (IAdsPreviewService.class) {
                if (C58096Mr6.LLLLLZIL == null) {
                    C58096Mr6.LLLLLZIL = new AdsPreviewServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLLZIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final boolean LIZ() {
        C26231ARf c26231ARf = C61176Nzg.LIZ;
        if (c26231ARf != null) {
            return c26231ARf.LJII();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LIZLLL(ViewGroup viewGroup) {
        C16880lQ.LJLLL(viewGroup.findViewById(R.id.xr), viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LJFF(ViewGroup viewGroup) {
        C26231ARf c26231ARf = C61176Nzg.LIZ;
        if (c26231ARf != null) {
            c26231ARf.LIZIZ(null);
        }
        C61176Nzg.LIZ = null;
        C16880lQ.LJLLL(viewGroup.findViewById(R.id.xr), viewGroup);
    }

    public static boolean LJII(String str, String str2) {
        PreviewConfiguration previewConfiguration;
        Keva repo = Keva.getRepo("ads_preview_keva");
        long j = repo.getLong("preview_timestamp", 0L);
        if (j == 0) {
            return false;
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j);
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            previewConfiguration = C61175Nzf.LIZ;
            PreviewConfiguration previewConfiguration2 = (PreviewConfiguration) LIZLLL.LJIIIIZZ("ads_preview_configuration", PreviewConfiguration.class, previewConfiguration);
            if (previewConfiguration2 != null) {
                previewConfiguration = previewConfiguration2;
            }
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            previewConfiguration = C61175Nzf.LIZ;
        }
        if (minutes <= previewConfiguration.getValidationDurationInMinute()) {
            if (o.LJ(str, "adid")) {
                String[] previewAdIds = repo.getStringArray("preview_adids", new String[0]);
                o.LJIIIIZZ(previewAdIds, "previewAdIds");
                if (ORY.LJJIJIIJIL(str2, previewAdIds)) {
                    return true;
                }
            } else if (o.LJ(str, "cid")) {
                String[] previewCids = repo.getStringArray("preview_cids", new String[0]);
                o.LJIIIIZZ(previewCids, "previewCids");
                if (ORY.LJJIJIIJIL(str2, previewCids)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final boolean LIZJ(String str, String str2) {
        if (str != null) {
            List<String> list = AdsPreviewStateManager.LJLJL;
            if (list != null && list.contains(str)) {
                return true;
            }
            List<String> list2 = AdsPreviewStateManager.LJLJL;
            if ((list2 == null || list2.isEmpty()) && LJII("adid", str)) {
                return true;
            }
        }
        if (str2 != null) {
            List<String> list3 = AdsPreviewStateManager.LJLJLJ;
            if (list3 != null && list3.contains(str2)) {
                return true;
            }
            List<String> list4 = AdsPreviewStateManager.LJLJLJ;
            if ((list4 == null || list4.isEmpty()) && LJII("cid", str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LIZIZ(Context context, ViewGroup viewGroup, C72827Si7 c72827Si7) {
        C53743L7j.LIZ(context, viewGroup, c72827Si7);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService
    public final void LJ(Context context, ViewGroup viewGroup, AqS160S0100000_10 aqS160S0100000_10, AqS160S0100000_10 aqS160S0100000_102) {
        o.LJIIIZ(context, "context");
        C53743L7j.LIZ(context, viewGroup, null);
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.bh4);
        c26227ARb.LIZ(R.string.bh3);
        UC0.LIZJ(c26227ARb, new AqS167S0100000_1(aqS160S0100000_102, 286));
        c26227ARb.LJII = false;
        c26227ARb.LIZLLL(new AqS176S0100000_10(aqS160S0100000_10, 108));
        C26231ARf LJI = c26227ARb.LJI();
        C61176Nzg.LIZ = LJI;
        LJI.LIZLLL();
        FMX.onEventV3("ads_interface_preview_ad_successfully");
    }
}
