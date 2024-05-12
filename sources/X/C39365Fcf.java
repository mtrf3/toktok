package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.Fcf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39365Fcf implements InterfaceC38277F0n {
    public final /* synthetic */ InterfaceC60761Nsz LJLIL;

    public C39365Fcf(InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJLIL = interfaceC60761Nsz;
    }

    @Override // X.InterfaceC38277F0n
    public final void putAdInfo(JSONObject jSONObject) {
        AwemeRawAd awemeRawAd;
        String landingPageInfo;
        Long creativeId;
        C59222NMc c59222NMc = (C59222NMc) this.LJLIL.getHybridContext().LIZIZ(C59222NMc.class);
        if (c59222NMc != null) {
            awemeRawAd = c59222NMc.LIZ;
        } else {
            awemeRawAd = null;
        }
        C59222NMc c59222NMc2 = (C59222NMc) this.LJLIL.getHybridContext().LIZIZ(C59222NMc.class);
        if (c59222NMc2 != null && TextUtils.equals(c59222NMc2.LJIJ, "1") && C78685UuP.LJJJZ(c59222NMc2.LJIJI)) {
            try {
                JSONObject jSONObject2 = new JSONObject(c59222NMc2.LJIJI);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        if (awemeRawAd != null) {
            Long creativeId2 = awemeRawAd.getCreativeId();
            if (creativeId2 != null) {
                jSONObject.put("cid", creativeId2.longValue());
            }
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                jSONObject.put("group_id", groupId.longValue());
            }
            jSONObject.put("ad_type", awemeRawAd.getSystemOrigin());
            String logExtra = awemeRawAd.getLogExtra();
            if (logExtra != null) {
                jSONObject.put("log_extra", logExtra);
            }
            String downloadUrl = awemeRawAd.getDownloadUrl();
            if (downloadUrl != null) {
                jSONObject.put("download_url", downloadUrl);
            }
            String packageName = awemeRawAd.getPackageName();
            if (packageName != null) {
                jSONObject.put("package_name", packageName);
            }
            String appName = awemeRawAd.getAppName();
            if (appName != null) {
                jSONObject.put("app_name", appName);
            }
        }
        int i = 0;
        if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null && creativeId.longValue() == 0) {
            i = 1;
        }
        jSONObject.put("code", 1 ^ i);
        if (awemeRawAd != null && (landingPageInfo = awemeRawAd.getLandingPageInfo()) != null) {
            jSONObject.put("land_page_data", landingPageInfo);
        }
    }
}
