package com.ss.android.ugc.aweme;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C58096Mr6;
import X.C78983UzD;
import android.content.Intent;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CQrcodeService implements ICQrcodeService {
    @Override // com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService
    public final boolean LIZIZ() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_qrcode_jump_to_browser", true);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService
    public final boolean LIZJ() {
        boolean z = true;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_cqrcode_intercept", true);
            return z;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            return z;
        }
    }

    public static ICQrcodeService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(ICQrcodeService.class, false);
        if (LIZ != null) {
            return (ICQrcodeService) LIZ;
        }
        if (C58096Mr6.LJJL == null) {
            synchronized (ICQrcodeService.class) {
                if (C58096Mr6.LJJL == null) {
                    C58096Mr6.LJJL = new CQrcodeService();
                }
            }
        }
        return C58096Mr6.LJJL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.qrcode.ICQrcodeService
    public final void LIZ(ActivityC86117Xqz activity) {
        o.LJIIIZ(activity, "activity");
        C16880lQ.LIZIZ(activity, new Intent(activity, (Class<?>) CQRCodeFailActivity.class));
    }
}
