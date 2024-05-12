package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import kotlin.jvm.internal.o;
import p83.a;

/* loaded from: classes14.dex */
public final class UZK {
    public static final String LIZ(Context context) {
        String str;
        o.LJIIIZ(context, "context");
        try {
            C39253Far.LIZJ.getClass();
            a.C0043a LIZIZ = C39252Faq.LIZIZ(context);
            if (LIZIZ != null) {
                str = LIZIZ.LIZ;
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        } catch (Exception e) {
            C0NB.LJII(e);
            return "";
        }
    }

    public static void LIZLLL(UZL uzl, UZI uzi) {
        BZI LIZ = C28787BRn.LIZ("livesdk_partnership_download_click");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ(Integer.valueOf(uzl.ordinal()), "result");
        LIZ.LJIJJ(uzi.LJLJLJ, "room_id");
        LIZ.LJIJJ(uzi.LJLL, "audience_uid");
        LIZ.LJIJJ(uzi.LJLJJI, "game_id");
        LIZ.LJIJJ(uzi.LJLJL, "game_name");
        LIZ.LJIJJ(Boolean.valueOf(uzi.LJLLILLLL), "is_anchor");
        LIZ.LJIJJ(uzi.LJLJI, "anchor_id");
        LIZ.LJIJJ(uzi.LJLILLLLZI, "task_id");
        LIZ.LJIJJ(uzi.LJLJLLL, "package_name");
        LIZ.LJJIIJZLJL();
    }

    public static final boolean LIZJ(Context context, String str, String referrer) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(referrer, "referrer");
        StringBuilder sb = new StringBuilder(i0.LJFF("https://play.google.com/store/apps/details?id=", str));
        if (referrer.length() > 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("&referrer=");
            LIZ.append(referrer);
            sb.append(X1D.LIZIZ(LIZ));
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse(sb.toString()));
        intent.setPackage("com.android.vending");
        try {
            intent.putExtra("pns.sandbox.dataflow_id", 1207965953);
            C16880lQ.LIZJ(context, intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            C16880lQ.LIZJ(context, new Intent("android.intent.action.VIEW", UriProtector.parse(sb.toString())));
            return false;
        }
    }

    public final void LIZIZ(Context context, UZI downloadInfo, UZM uzm) {
        String str;
        o.LJIIIZ(downloadInfo, "downloadInfo");
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            str = iHostAppContext.getServerDeviceId();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        if (downloadInfo.LJLJLLL.length() == 0) {
            C30868C9o.LIZJ(R.string.ld8);
            LIZLLL(UZL.PACKAGE_NAME_IS_EMPTY, downloadInfo);
        } else if (context == null) {
            LIZLLL(UZL.CONTEXT_ERROR, downloadInfo);
        } else if (downloadInfo.LJLLILLLL) {
            LJ(downloadInfo, context, "");
        } else {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new UZH(this, context, downloadInfo, str, uzm, R.string.ld8, null), 2);
        }
    }

    public final boolean LJ(UZI uzi, Context context, String str) {
        int i;
        String str2 = uzi.LJLJJLL;
        if (str2.length() != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(str2));
            intent.setPackage(uzi.LJLJLLL);
            intent.putExtra("pns.sandbox.dataflow_id", 1207968513);
            try {
                C16880lQ.LIZJ(context, intent);
                i = 1;
            } catch (Exception e) {
                C0NB.LJ("DownloadPartneringGameMethod", e.getMessage());
                i = 0;
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_gp_open_deeplink");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(uzi.LJLJJLL, "deeplink_url");
            LIZ.LJIJJ(uzi.LJLLI, "app_id");
            LIZ.LJIJJ(uzi.LJLJLJ, "room_id");
            LIZ.LJIJJ(uzi.LJLILLLLZI, "task_id");
            LIZ.LJIJJ(uzi.LJLJI, "anchor_id");
            LIZ.LJIJJ(uzi.LJLJJI, "game_id");
            LIZ.LJIJJ(uzi.LJLJL, "game_name");
            C0JT.LIZJ(LIZ, uzi.LJLJLLL, "package_name", i, "success");
            if (i != 0) {
                LIZLLL(UZL.SUCCESS, uzi);
                return true;
            }
        }
        String str3 = uzi.LJLJLLL;
        if (str3 == null) {
            str3 = "";
        }
        if (LIZJ(context, str3, str)) {
            LIZLLL(UZL.SUCCESS, uzi);
            return true;
        }
        LIZLLL(UZL.GOOGLE_SERVICE_DISABLE, uzi);
        return false;
    }
}
