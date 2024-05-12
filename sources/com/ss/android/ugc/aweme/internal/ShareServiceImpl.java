package com.ss.android.ugc.aweme.internal;

import X.C4LD;
import X.C58096Mr6;
import android.os.Bundle;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes11.dex */
public final class ShareServiceImpl implements IShareService {
    @Override // com.ss.android.ugc.aweme.internal.IShareService
    public final String LIZIZ(int i) {
        if (i == 2) {
            return "instagram";
        }
        if (i == 3) {
            return "instagram_story";
        }
        if (i == 101) {
            return "twitter";
        }
        switch (i) {
            case 5:
                return "whatsapp";
            case 6:
                return "facebook";
            case 7:
                return "messenger";
            case 8:
                return "snapchat";
            case 9:
                return "vk";
            case 10:
                return "zalo";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "line";
            case 12:
                return "kakaotalk";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "sms";
            case 14:
                return "whatsapp_status";
            default:
                return "";
        }
    }

    public static IShareService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IShareService.class, false);
        if (LIZ != null) {
            return (IShareService) LIZ;
        }
        if (C58096Mr6.D1 == null) {
            synchronized (IShareService.class) {
                if (C58096Mr6.D1 == null) {
                    C58096Mr6.D1 = new ShareServiceImpl();
                }
            }
        }
        return C58096Mr6.D1;
    }

    @Override // com.ss.android.ugc.aweme.internal.IShareService
    public final void LIZ(int i, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("publish_private_status", i);
        bundle.putBoolean("music_prevent_download", z);
        C4LD.LIZIZ.LJJIJIIJI(null, "ug_publish_share_show", bundle);
    }
}
