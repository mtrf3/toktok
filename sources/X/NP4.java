package X;

import android.app.Activity;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.commercialize.business.DownloadBusiness;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NP4 implements DownloadListener {
    public final /* synthetic */ WebView LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ NP1 LIZJ;
    public final /* synthetic */ DownloadBusiness LIZLLL;

    public NP4(OM1 om1, Activity activity, NP1 np1, DownloadBusiness downloadBusiness) {
        this.LIZ = om1;
        this.LIZIZ = activity;
        this.LIZJ = np1;
        this.LIZLLL = downloadBusiness;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        long j2;
        String str5;
        C59297NOz c59297NOz;
        NP0 np0;
        Long value;
        String url = this.LIZ.getUrl();
        Activity activity = this.LIZIZ;
        NP1 np1 = this.LIZJ;
        if (np1 != null && (np0 = np1.LJJZ) != null && (value = np0.getValue()) != null) {
            j2 = value.longValue();
        } else {
            j2 = 0;
        }
        NP1 np12 = this.LIZJ;
        if (np12 != null) {
            str5 = np12.LJII();
        } else {
            str5 = null;
        }
        JSONObject LIZIZ = C40686Fxy.LIZIZ(j2, activity, str5, str, url, this.LIZ.getUrl());
        NP1 np13 = this.LIZJ;
        if (np13 != null && (c59297NOz = np13.LJLLILLLL) != null) {
            o.LJ(c59297NOz.getValue(), Boolean.TRUE);
        }
        this.LIZLLL.getClass();
        C40686Fxy.LIZJ(this.LIZIZ, str, str2, str3, str4, LIZIZ, NP5.LIZ);
    }
}
