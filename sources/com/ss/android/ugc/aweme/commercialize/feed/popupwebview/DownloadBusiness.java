package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.C16880lQ;
import X.C59484NWe;
import X.C78983UzD;
import X.NP2;
import X.NXI;
import X.ViewOnClickListenerC40943G5b;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.DownloadBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class DownloadBusiness extends BusinessService.Business {
    public final NP2 LIZLLL;
    public int LJ;

    public DownloadBusiness(C59484NWe c59484NWe) {
        super(c59484NWe);
        this.LIZLLL = new NP2();
        this.LJ = 0;
    }

    public final void LIZ(final Activity activity, final NXI nxi) {
        int i = this.LJ;
        if (i == 0) {
            i = R.id.r2;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(i);
        frameLayout.setVisibility(8);
        NP2 np2 = this.LIZLLL;
        Bundle bundle = this.LIZIZ.LIZ.LIZIZ;
        np2.getClass();
        if (bundle != null) {
            np2.LIZ = bundle.getString("aweme_creative_id", "");
            bundle.getString("aweme_group_id", "");
            bundle.getString("bundle_download_app_log_extra");
            bundle.getString("aweme_package_name");
            bundle.getString("bundle_download_url");
            bundle.getString("bundle_download_app_name");
            bundle.getInt("bundle_app_ad_from", 0);
            bundle.getString("bundle_download_app_extra");
            bundle.getInt("bundle_download_mode");
            bundle.getBoolean("bundle_support_multiple_download");
            try {
                new JSONObject(bundle.getString("aweme_json_extra", ""));
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
            bundle.getString("bundle_ad_quick_app_url");
            try {
                CastLongProtector.parseLong(np2.LIZ);
            } catch (Exception e2) {
                C78983UzD.LJIIZILJ(e2);
            }
        }
        C16880lQ.LJIILJJIL(frameLayout, new ViewOnClickListenerC40943G5b(0));
        nxi.LIZ().setDownloadListener(new DownloadListener() { // from class: X.NPA
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                InterfaceC59585Na1 interfaceC59585Na1;
                DownloadBusiness downloadBusiness = DownloadBusiness.this;
                NXI nxi2 = nxi;
                Activity activity2 = activity;
                downloadBusiness.getClass();
                C59866NeY monitorSession = nxi2.LIZ().getMonitorSession();
                if (monitorSession != null && (interfaceC59585Na1 = (InterfaceC59585Na1) monitorSession.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
                    interfaceC59585Na1.LJIIIIZZ(j, str, str3, str4);
                }
                String url = nxi2.LIZ().getUrl();
                C59273NOb c59273NOb = downloadBusiness.LIZIZ.LIZIZ;
                C40686Fxy.LIZJ(activity2, str, str2, str4, str3, C40686Fxy.LIZIZ(c59273NOb.LIZ, activity2, c59273NOb.LJIIIIZZ, str, url, nxi2.LIZ().getUrl()), new NPB());
            }
        });
    }
}
