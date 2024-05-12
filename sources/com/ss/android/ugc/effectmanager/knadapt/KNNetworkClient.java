package com.ss.android.ugc.effectmanager.knadapt;

import X.C113554cx;
import X.C12310e3;
import X.C16880lQ;
import X.C78855Ux9;
import X.OJD;
import X.OSZ;
import X.VNB;
import X.X1D;
import X.X62;
import X.XD6;
import X.XD7;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class KNNetworkClient implements X62 {
    public static final Companion Companion = new Companion();
    public final IEffectNetWorker effectNetWrapper;

    /* loaded from: classes16.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KNNetworkClient(IEffectNetWorker effectNetWrapper) {
        o.LJIIJ(effectNetWrapper, "effectNetWrapper");
        this.effectNetWrapper = effectNetWrapper;
    }

    private final void logRequestedUrl(XD6 xd6) {
        try {
            String replace = new OJD("&?device_info=[^&]*").replace(xd6.LIZ, "");
            C12310e3 c12310e3 = C12310e3.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("request url: ");
            LIZ.append(replace);
            String LIZIZ = X1D.LIZIZ(LIZ);
            c12310e3.getClass();
            C12310e3.LIZ("KNNetworker", LIZIZ);
        } catch (Exception e) {
            C12310e3.LIZIZ.getClass();
            C12310e3.LIZIZ("KNNetworker", "error in print url", e);
        }
    }

    @Override // X.X62
    public VNB fetchFromNetwork(XD6 netRequest) {
        String str;
        HashMap hashMap;
        o.LJIIJ(netRequest, "netRequest");
        if (netRequest.LIZJ == XD7.POST) {
            str = "POST";
        } else {
            str = "GET";
        }
        logRequestedUrl(netRequest);
        EffectRequest effectRequest = new EffectRequest(str, netRequest.LIZ, netRequest.LJI);
        effectRequest.setContentType(netRequest.LJFF);
        Map<String, String> map = netRequest.LIZLLL;
        if (map != null) {
            effectRequest.setHeaders(map);
        }
        Map<String, Object> map2 = netRequest.LJ;
        if (map2 != null) {
            effectRequest.setBodyParams(map2);
        }
        try {
            InputStream execute = this.effectNetWrapper.execute(effectRequest);
            String logId = effectRequest.getLogId();
            if (logId == null || ujb.o.LJJJJJL(logId)) {
                hashMap = new HashMap();
            } else {
                hashMap = C113554cx.LJJJLZIJ(new OSZ("x-tt-logid", effectRequest.getLogId()));
            }
            if (execute != null) {
                return new VNB(200, new InputStreamByteRead(execute), effectRequest.getContentLength(), effectRequest.getErrorMsg(), hashMap);
            }
            return new VNB(LiveChatShowDelayForHotLiveSetting.DEFAULT, new C78855Ux9(), 0L, effectRequest.getErrorMsg(), hashMap);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            C78855Ux9 c78855Ux9 = new C78855Ux9();
            String errorMsg = effectRequest.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = e.getMessage();
            }
            return new VNB(LiveChatShowDelayForHotLiveSetting.DEFAULT, c78855Ux9, 0L, errorMsg);
        }
    }
}
