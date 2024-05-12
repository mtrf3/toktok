package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Iq2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47838Iq2 extends C47836Iq0 {
    public ArrayList<String> LJIJJ;
    public String LJIJJLI;

    @Override // X.C47836Iq0
    public final boolean LIZ(C47789IpF c47789IpF) {
        return false;
    }

    public static C47838Iq2 LJIIJ() {
        C47838Iq2 c47838Iq2 = new C47838Iq2();
        super.LJIIIZ();
        c47838Iq2.LJIJJ = null;
        c47838Iq2.LJIJJLI = null;
        c47838Iq2.LIZJ = "url_task";
        return c47838Iq2;
    }

    @Override // X.C47836Iq0
    public final JSONObject LIZJ() {
        HashMap hashMap = new HashMap();
        C47836Iq0.LJFF("base_json", hashMap, LIZLLL());
        C47836Iq0.LJ("key", this.LJIJJLI, hashMap);
        ArrayList<String> arrayList = this.LJIJJ;
        if (arrayList != null && !arrayList.isEmpty()) {
            hashMap.put("urls", arrayList);
        }
        return new JSONObject(hashMap);
    }

    @Override // X.C47836Iq0
    public final void LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[downloader] did call resume, key = ");
        LIZ.append(this.LJIIIIZZ.toString());
        TTVideoEngineLog.d("TTVideoEngine.DownloadURLTask", X1D.LIZIZ(LIZ));
        if (this.LJIIJJI) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadURLTask", "[downloader] task did canceled");
            return;
        }
        if (this.LJFF == 2) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadURLTask", "[downloader] state is running");
            return;
        }
        super.LJII();
        C47837Iq1 c47837Iq1 = this.LJIILJJIL;
        if (c47837Iq1 != null && !c47837Iq1.LIZLLL(this)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[downloader] not should resume task = ");
            LIZ2.append(toString());
            C78253UnR.LJI("TTVideoEngine.DownloadURLTask", X1D.LIZIZ(LIZ2));
            return;
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        this.LJIIIZ = hashMap;
        hashMap.put(this.LJIJJLI, this.LJIJJ);
        LJIIIIZZ(2);
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        String str = this.LJIJJLI;
        String str2 = this.LJIIL;
        ArrayList<String> arrayList = this.LJIJJ;
        String LJJI = dataLoaderHelper.LJJI(str, str2, (String[]) arrayList.toArray(new String[arrayList.size()]), this.LJIJ.version, this.LJIJI);
        C47878Iqg.LIZ((String) ListProtector.get(this.LJIJJ, 0));
        if (!dataLoaderHelper.LJJJJ(LJJI)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("resume download fail. url = ", LJJI, " dataload state is ");
            LIZIZ.append(dataLoaderHelper.LJJIJIL());
            LJI(new C47789IpF("kTTVideoErrorDomainDownload", -9996, 0, X1D.LIZIZ(LIZIZ)));
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("[downloader] resume a task. key = ");
        LIZ3.append(this.LJIJJLI);
        LIZ3.append(" downloader url is ");
        LIZ3.append(LJJI);
        C78253UnR.LJI("TTVideoEngine.DownloadURLTask", X1D.LIZIZ(LIZ3));
        C47837Iq1 c47837Iq12 = this.LJIILJJIL;
        if (c47837Iq12 != null) {
            c47837Iq12.LIZJ(this);
        }
    }

    @Override // X.C47836Iq0
    public final void LIZIZ(JSONObject jSONObject) {
        super.LIZIZ(jSONObject.optJSONObject("base_json"));
        this.LJIJJLI = jSONObject.optString("key");
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(optString);
                }
            }
            this.LJIJJ = arrayList;
            if (!arrayList.isEmpty()) {
                C47878Iqg.LIZ((String) ListProtector.get(arrayList, 0));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(C47838Iq2.class)) {
            return false;
        }
        return ((C47838Iq2) obj).LJIJJLI.equals(this.LJIJJLI);
    }
}
