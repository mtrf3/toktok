package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C36704Eaq;
import X.C36910EeA;
import X.C64797Pbt;
import X.EJ6;
import X.FUA;
import X.X1D;
import android.net.Uri;
import android.os.Handler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.agilelogger.ALog;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class AbsApiMonitorService {
    public static final Companion Companion = new Companion();
    public final Handler handler = new Handler(C16880lQ.LLJJJJ());

    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final void addALog(String url, C64797Pbt<?> res) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(res, "res");
        try {
            C36704Eaq.LIZ(url, res);
        } catch (NoSuchMethodError e) {
            e.printStackTrace();
        }
    }

    public final void addFailLog(String url, Throwable th, C36910EeA c36910EeA) {
        String str;
        o.LJIIIZ(url, "url");
        if (c36910EeA != null) {
            try {
                List<EJ6> list = c36910EeA.LIZLLL;
                if (list != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("URL: ");
                    LIZ.append(url);
                    LIZ.append("\r\nHEADER");
                    LIZ.append(list);
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("API_URL_HEADER", X1D.LIZIZ(LIZ));
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        Uri parse = UriProtector.parse(url);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(parse.getPath());
        LIZ2.append(" failed, ");
        if (th == null) {
            str = null;
        } else {
            str = th.getMessage();
        }
        LIZ2.append(str);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("API_URL_HEADER", X1D.LIZIZ(LIZ2));
    }

    public final void apiMonitor(String url, String str, String body) {
        o.LJIIIZ(url, "url");
        o.LJIIIZ(body, "body");
        Uri parse = UriProtector.parse(url);
        if (parse != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", url);
                jSONObject.put("path", parse.getPath());
                jSONObject.put("host", parse.getHost());
                jSONObject.put("body", body);
                jSONObject.put("requestid", str);
                jSONObject.put("debug", false);
                FUA.LIZIZ("api_error_service_log", "", jSONObject);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }
}
