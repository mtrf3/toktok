package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.C0K2;
import X.C38131Exr;
import X.C72818Shy;
import X.C76052yf;
import X.C78528Urs;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class DownloadLiveReplayMethod extends AbstractC38123Exj<Params, Object> {
    public WeakReference<C38131Exr> LJLIL;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
    }

    @Override // X.AbstractC38123Exj
    public final void onDestroy() {
        super.onDestroy();
    }

    /* loaded from: classes14.dex */
    public class Params {

        @InterfaceC65349Pkn("action")
        public int action;

        @InterfaceC65349Pkn("demand")
        public String demand;

        @InterfaceC65349Pkn("event_page")
        public String eventPage;

        @InterfaceC65349Pkn("ids")
        public List<String> ids;

        @InterfaceC65349Pkn("ids_for_event")
        public List<String> idsForEvent;

        @InterfaceC65349Pkn("ids_from_source")
        public List<String> idsFromSource;

        @InterfaceC65349Pkn("suffix")
        public String suffix;

        @InterfaceC65349Pkn("type")
        public String type;

        @InterfaceC65349Pkn("urls")
        public List<String> urls;

        public Params(DownloadLiveReplayMethod downloadLiveReplayMethod) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        if (r1 != 6) goto L49;
     */
    @Override // X.AbstractC38123Exj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod.Params r13, X.C38131Exr r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.DownloadLiveReplayMethod.invoke(java.lang.Object, X.Exr):void");
    }

    public final void LJJI(String str, int i, DownloadInfo downloadInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("download_status", Integer.valueOf(i));
        C0K2.LJII(0, "ttlive_live_replay_send_js_event", hashMap);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", str);
            jSONObject.put("code", 1);
            if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getExtra())) {
                jSONObject.put("id", downloadInfo.getExtra());
            }
            if (downloadInfo != null) {
                jSONObject.put("status", i);
                jSONObject.put("percent", downloadInfo.getDownloadProcess() / 100.0d);
            } else {
                if (i != 4) {
                    jSONObject.put("status", 0);
                } else {
                    jSONObject.put("status", 4);
                }
                jSONObject.put("percent", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            }
        } catch (JSONException unused) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("error_msg", 1);
            C0K2.LJII(1, "ttlive_live_replay_send_js_error", hashMap2);
        }
        WeakReference<C38131Exr> weakReference = this.LJLIL;
        if (weakReference != null && weakReference.get() != null) {
            this.LJLIL.get().LIZ(jSONObject, "downloadMediaStatusChange");
        } else {
            C72818Shy.LIZ(new C76052yf(System.currentTimeMillis(), new C78528Urs(jSONObject), "downloadMediaStatusChange"));
        }
    }
}
