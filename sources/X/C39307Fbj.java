package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.Fbj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39307Fbj implements InterfaceC39320Fbw {
    public final Context LIZ;
    public final String[] LIZIZ;

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        Bundle bundle;
        String string;
        boolean z;
        String campaign;
        boolean z2;
        o.LJIIIZ(preInstallResult, "preInstallResult");
        try {
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 128);
            o.LJIIIIZZ(LLLLLLLLL, "context.packageManager.g…T_META_DATA\n            )");
            bundle = LLLLLLLLL.metaData;
            string = bundle.getString("AF_PRE_INSTALL_NAME", "");
            z = false;
        } catch (Throwable unused) {
        }
        if (string != null && string.length() != 0) {
            if (bundle.getInt("AF_PRE_INSTALL_CAMPAIGN", 0) == 0) {
                campaign = bundle.getString("AF_PRE_INSTALL_CAMPAIGN", "");
            } else {
                campaign = String.valueOf(bundle.getInt("AF_PRE_INSTALL_CAMPAIGN"));
            }
            String siteId = bundle.getString("AF_PRE_INSTALL_SITE_ID", "");
            C39310Fbm c39310Fbm = preInstallResult.LIZ;
            c39310Fbm.LJLLILLLL = 1;
            o.LJIIIZ(string, "<set-?>");
            c39310Fbm.LJLL = string;
            String[] strArr = this.LIZIZ;
            if (strArr != null && ORY.LJJIJIIJIL(string, strArr)) {
                z2 = true;
            } else {
                z2 = false;
            }
            c39310Fbm.LJLLI = z2;
            if (!TextUtils.isEmpty(campaign) || !TextUtils.isEmpty(siteId)) {
                z = true;
            }
            if (!TextUtils.isEmpty(string) && z) {
                c39310Fbm.LJLIL = string;
                o.LJIIIIZZ(campaign, "campaign");
                c39310Fbm.LJLILLLLZI = campaign;
                o.LJIIIIZZ(siteId, "siteId");
                c39310Fbm.LJLJI = siteId;
                preInstallResult.LJ = true;
            }
            java.util.Map<String, String> map = preInstallResult.LIZLLL.LJLJJL;
            map.put("channel", string);
            o.LJIIIIZZ(campaign, "campaign");
            map.put("campaign", campaign);
            o.LJIIIIZZ(siteId, "siteId");
            map.put("siteId", siteId);
            return preInstallResult;
        }
        return preInstallResult;
    }

    public C39307Fbj(Context context, String[] strArr) {
        this.LIZ = context;
        this.LIZIZ = strArr;
    }
}
