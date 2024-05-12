package X;

import Y.ARunnableS15S0300000_4;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import java.util.HashMap;
import yq4.a;

/* renamed from: X.AJz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26043AJz implements InterfaceC41034G8o {
    public final AK0 LJLIL;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public final void LIZ() {
        Activity activity;
        HashMap hashMap = new HashMap();
        String logExtra = this.LJLIL.getLogExtra();
        if (logExtra == null) {
            logExtra = "";
        }
        hashMap.put("log_extra", logExtra);
        String cid = this.LJLIL.getCid();
        if (cid == null) {
            cid = "";
        }
        hashMap.put("cid", cid);
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "ad").appendQueryParameter("object_id", this.LJLIL.getAid()).appendQueryParameter("item_id", this.LJLIL.getAid()).appendQueryParameter("owner_id", this.LJLIL.LIZJ()).appendQueryParameter("user_id", ((RBX) HG3.LJIILL()).getCurUserId()).appendQueryParameter("group_id", "").appendQueryParameter("report_from", this.LJLIL.LIZIZ()).appendQueryParameter("app_language", SettingServiceImpl.LIZ().getAppLanguage()).appendQueryParameter("app_name", EF7.LIZ()).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("platform", "android").appendQueryParameter("version", EF7.LIZLLL()).appendQueryParameter("install_id", AppLog.getInstallId()).appendQueryParameter("report_ad_type", String.valueOf(this.LJLIL.LIZ())).appendQueryParameter("room_id", this.LJLIL.getRoomId());
        C38995FSd.LIZIZ().execute(new ARunnableS15S0300000_4(hashMap, appendQueryParameter, this, 22));
        IReportService LJIILLIIL = a.LJIILLIIL();
        Context context = this.LJLIL.getContext();
        if (context != null) {
            activity = KR3.LIZJ(context);
        } else {
            activity = null;
        }
        LJIILLIIL.LIZJ(activity, appendQueryParameter);
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public C26043AJz(AK0 ak0) {
        this.LJLIL = ak0;
    }
}
