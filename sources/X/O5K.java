package X;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O5K implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public final void LIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gecko_sdk_version", "3.4.2.2-bugfix");
            jSONObject.put("access_key", this.LJLIL);
            jSONObject.put("gecko_channel", this.LJLILLLLZI);
            jSONObject.put("gecko_id", this.LJLJI);
            jSONObject.put("type", this.LJLJJI);
            jSONObject.put("hit_local", this.LJLJJL);
            jSONObject.put("is_blacklist", this.LJLJJLL);
            C61318O4s.LIZ.LIZ("geckosdk_resource_access", jSONObject, null, null);
        } catch (Throwable th) {
            OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadResourceAccess", th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public O5K(String str, String str2, String str3, String str4, String str5, String str6) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = str6;
    }
}
