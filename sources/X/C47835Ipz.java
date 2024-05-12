package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ipz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47835Ipz extends C47836Iq0 {
    public EnumC47176IfM LJIJJ;
    public String LJIJJLI = "h264";
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public C47804IpU LJJIFFI;
    public C47164IfA LJJII;
    public int LJJIII;
    public java.util.Map<Integer, String> LJJIIJ;
    public HashMap<String, EnumC47176IfM> LJJIIJZLJL;
    public EnumC47176IfM LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String LJJIJIIJI;
    public int LJJIJIIJIL;

    public final void LJIIL() {
        int i;
        this.LJJIIZI = null;
        this.LJJIFFI = null;
        C47804IpU c47804IpU = new C47804IpU(null);
        this.LJJIFFI = c47804IpU;
        c47804IpU.LJII = new C47840Iq4(this, this);
        C47804IpU c47804IpU2 = this.LJJIFFI;
        c47804IpU2.LJIIIZ = this.LJJIIJZLJL;
        c47804IpU2.LJIIL = this.LJIIL;
        c47804IpU2.LJIILIIL = true;
        C47903Ir5.LIZ(c47804IpU2.LJIIJJI);
        if (!TextUtils.isEmpty(this.LJJIJ)) {
            try {
                i = C47810Ipa.LIZ();
            } catch (Exception unused) {
                i = 0;
            }
            String LLLZ = C16880lQ.LLLZ("%s&method=%d", new Object[]{this.LJJIJ, Integer.valueOf(i)});
            this.LJJIIZI = LLLZ;
            if (this.LJJI) {
                this.LJJIIZI = C47756Ioi.LIZJ(LLLZ);
            }
            String LIZ = C77117UOj.LIZ(this.LJJIIZI);
            this.LJJIIZI = LIZ;
            C78253UnR.LJI("TTVideoEngine.DownloadVidTask", C16880lQ.LLLZ("[downloader] api string from fallback api:%s ,keySeed = %s", new Object[]{LIZ, this.LJJIJIIJI}));
            C47804IpU c47804IpU3 = this.LJJIFFI;
            c47804IpU3.getClass();
            c47804IpU3.LJI = true;
            this.LJJIFFI.LJII(0, this.LJJIIZI, null, this.LJJIJIIJI);
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.LJIJJLI.equals("bytevc2")) {
            hashMap.put("codec_type", "4");
        } else if (this.LJIJJLI.equals("bytevc1")) {
            hashMap.put("codec_type", "3");
        }
        if (this.LJIL) {
            hashMap.put("format_type", "dash");
        }
        if (this.LJJ) {
            hashMap.put("ssl", "1");
        }
        String LIZ2 = C77117UOj.LIZ(this.LJJIIZI);
        this.LJJIIZI = LIZ2;
        this.LJJIFFI.LJII(this.LJJIII, LIZ2, null, null);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("[downloader] fetch videoModel, apiString = ");
        JBR.LJIIIZ(LIZ3, this.LJJIIZI, LIZ3, "TTVideoEngine.DownloadVidTask");
    }

    public static C47835Ipz LJIILJJIL() {
        C47835Ipz c47835Ipz = new C47835Ipz();
        super.LJIIIZ();
        c47835Ipz.LJJIJIIJIL = 0;
        c47835Ipz.LIZJ = "vid_task";
        c47835Ipz.LJJIII = 0;
        c47835Ipz.LJIJJ = EnumC47176IfM.Standard;
        return c47835Ipz;
    }

    @Override // X.C47836Iq0
    public final JSONObject LIZJ() {
        HashMap hashMap = new HashMap();
        C47836Iq0.LJFF("base_json", hashMap, LIZLLL());
        C47836Iq0.LJ("codec_type", this.LJIJJLI, hashMap);
        hashMap.put("base_dash", Boolean.valueOf(this.LJIL));
        hashMap.put("https", Boolean.valueOf(this.LJJ));
        hashMap.put("boe", Boolean.valueOf(this.LJJI));
        C47836Iq0.LJ("resolution", EnumC47176IfM.toString(this.LJIJJ), hashMap);
        C47836Iq0.LJFF("param", hashMap, this.LJJIIJ);
        HashMap<String, EnumC47176IfM> hashMap2 = this.LJJIIJZLJL;
        if (hashMap2 != null && hashMap2.size() > 0) {
            HashMap hashMap3 = new HashMap();
            for (String str : this.LJJIIJZLJL.keySet()) {
                hashMap3.put(str, EnumC47176IfM.toString(this.LJJIIJZLJL.get(str)));
            }
            C47836Iq0.LJFF("resolution_map", hashMap, hashMap3);
        }
        hashMap.put("api_version", Integer.valueOf(this.LJJIII));
        C47836Iq0.LJ("curr_resolution", EnumC47176IfM.toString(this.LJJIIZ), hashMap);
        JSONObject jSONObject = new JSONObject(hashMap);
        try {
            try {
                C47164IfA c47164IfA = this.LJJII;
                if (c47164IfA != null) {
                    jSONObject.putOpt("video_model", c47164IfA.LJFF);
                }
                return jSONObject;
            } catch (JSONException unused) {
                C78253UnR.LIZLLL("TTVideoEngine.DownloadVidTask", "[downloader] jsonObject fail.");
                return jSONObject;
            }
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    @Override // X.C47836Iq0
    public final void LJII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[downloader] did call resume, videoId = ");
        LIZ.append(this.LJIIL);
        TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", X1D.LIZIZ(LIZ));
        if (this.LJIIJJI) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", "[downloader] task did canceled");
            return;
        }
        if (this.LJFF == 2) {
            TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", "[downloader] state is running");
            return;
        }
        super.LJII();
        C47837Iq1 c47837Iq1 = this.LJIILJJIL;
        if (c47837Iq1 != null && !c47837Iq1.LIZLLL(this)) {
            return;
        }
        this.LJJIJIIJIL = 0;
        LJIIIIZZ(2);
        C47837Iq1 c47837Iq12 = this.LJIILJJIL;
        if (c47837Iq12 != null) {
            c47837Iq12.LIZJ(this);
        }
        C47164IfA c47164IfA = this.LJJII;
        if (c47164IfA != null) {
            LJIIJJI(c47164IfA);
        } else {
            LJIIL();
        }
    }

    @Override // X.C47836Iq0
    public final boolean LIZ(C47789IpF c47789IpF) {
        if (!super.LIZ(c47789IpF) || this.LJJIJIIJIL >= 10) {
            return false;
        }
        return true;
    }

    @Override // X.C47836Iq0
    public final void LIZIZ(JSONObject jSONObject) {
        super.LIZIZ(jSONObject.optJSONObject("base_json"));
        this.LJIJJLI = jSONObject.optString("codec_type");
        this.LJIL = jSONObject.optBoolean("base_dash");
        this.LJJ = jSONObject.optBoolean("https");
        this.LJJI = jSONObject.optBoolean("boe");
        EnumC47176IfM forString = EnumC47176IfM.forString(jSONObject.optString("resolution"));
        this.LJIJJ = forString;
        if (forString == EnumC47176IfM.Undefine) {
            this.LJIJJ = EnumC47176IfM.Standard;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("param");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            this.LJJIIJ = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                ((HashMap) this.LJJIIJ).put(CastIntegerProtector.valueOf(next), optJSONObject.optString(next));
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("resolution_map");
        if (optJSONObject2 != null && optJSONObject2.length() > 0) {
            this.LJJIIJZLJL = new HashMap<>();
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                this.LJJIIJZLJL.put(next2, EnumC47176IfM.forString(optJSONObject2.optString(next2)));
            }
        }
        this.LJJIII = jSONObject.optInt("api_version");
        this.LJJIIZ = EnumC47176IfM.forString(jSONObject.optString("curr_resolution"));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("video_model");
        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
            C47164IfA c47164IfA = new C47164IfA();
            try {
                try {
                    c47164IfA.LJJIIJZLJL(optJSONObject3);
                } catch (Throwable unused) {
                    C78253UnR.LIZLLL("TTVideoEngine.DownloadVidTask", "[downloader] ssignWithJson fail.");
                    LJIILIIL(null);
                }
            } finally {
                LJIILIIL(c47164IfA);
            }
        }
    }

    @Override // X.C47836Iq0
    public final void LJI(C47789IpF c47789IpF) {
        if (LIZ(c47789IpF)) {
            this.LJJIJIIJIL++;
            LJIIL();
        } else {
            super.LJI(c47789IpF);
        }
    }

    public final boolean LJIIJ(C47160If6 c47160If6) {
        String[] LJIIIZ = c47160If6.LJIIIZ();
        String LIZIZ = c47160If6.LIZIZ(15);
        if (LJIIIZ == null || LJIIIZ.length < 1 || TextUtils.isEmpty(LIZIZ)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error info  urls or filehash is null: apiString = ");
            YE1.LIZLLL(LIZ, this.LJJIIZI, " authString = ", null, " filehash = ");
            LIZ.append(LIZIZ);
            LJI(new C47789IpF("kTTVideoErrorDomainFetchingInfo", -9996, 0, X1D.LIZIZ(LIZ)));
            return false;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[downloader] download urlinfo videoId = ");
        LIZ2.append(this.LJIIL);
        LIZ2.append(" ");
        LIZ2.append(c47160If6.getResolution().toString());
        LIZ2.append(" filehash = ");
        LIZ2.append(LIZIZ);
        TTVideoEngineLog.d("TTVideoEngine.DownloadVidTask", X1D.LIZIZ(LIZ2));
        this.LJIIIIZZ.add(LIZIZ);
        this.LJIIIZ.put(LIZIZ, Arrays.asList(LJIIIZ));
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        String LJJI = dataLoaderHelper.LJJI(LIZIZ, this.LJIIL, LJIIIZ, this.LJIJ.version, this.LJIJI);
        C47878Iqg.LIZ(LJIIIZ[0]);
        if (dataLoaderHelper.LJJJJ(LJJI)) {
            return true;
        }
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("resume download fail. url = ", LJJI, " dataloader state is ");
        LIZIZ2.append(dataLoaderHelper.LJJIJIL());
        LJI(new C47789IpF("kTTVideoErrorDomainDownload", -9996, 0, X1D.LIZIZ(LIZIZ2)));
        return false;
    }

    public final void LJIIJJI(C47164IfA c47164IfA) {
        this.LJIIIIZZ.clear();
        this.LJIIIZ = new HashMap<>();
        String LJ = c47164IfA.LJ();
        if (!TextUtils.isEmpty(LJ) && LJ.equals("segment_base")) {
            C47160If6 LJIILLIIL = c47164IfA.LJIILLIIL(this.LJIJJ, 1, this.LJJIIJ, true);
            if (LJIILLIIL != null) {
                if (!LJIIJ(LJIILLIIL)) {
                    return;
                } else {
                    this.LJJIIZ = LJIILLIIL.getResolution();
                }
            }
            C47160If6 LJIILLIIL2 = c47164IfA.LJIILLIIL(this.LJIJJ, 0, this.LJJIIJ, true);
            if (LJIILLIIL2 == null || !LJIIJ(LJIILLIIL2)) {
                return;
            }
            this.LJJIIZ = LJIILLIIL2.getResolution();
            return;
        }
        C47160If6 LJIJJLI = c47164IfA.LJIJJLI(this.LJIJJ, this.LJJIIJ, true);
        if (LJIJJLI == null || !LJIIJ(LJIJJLI)) {
            return;
        }
        this.LJJIIZ = LJIJJLI.getResolution();
    }

    public final void LJIILIIL(C47164IfA c47164IfA) {
        this.LJJII = c47164IfA;
        String LJJI = c47164IfA.LJJI(217);
        String LJJI2 = c47164IfA.LJJI(218);
        if (!TextUtils.isEmpty(LJJI)) {
            this.LJJIJ = LJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[downloader] set fallbackapi ");
            LIZ.append(LJJI);
            C78253UnR.LJI("TTVideoEngine.DownloadVidTask", X1D.LIZIZ(LIZ));
        }
        if (!TextUtils.isEmpty(LJJI2)) {
            this.LJJIJIIJI = LJJI2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[downloader] set keyseed ");
            JBR.LJIIIZ(LIZ2, this.LJJIJIIJI, LIZ2, "TTVideoEngine.DownloadVidTask");
        }
    }

    public final boolean equals(Object obj) {
        ArrayList<String> arrayList;
        if (obj == null) {
            return false;
        }
        if (super.equals(obj)) {
            return true;
        }
        if (!obj.getClass().equals(C47835Ipz.class)) {
            return false;
        }
        C47835Ipz c47835Ipz = (C47835Ipz) obj;
        ArrayList<String> arrayList2 = this.LJIIIIZZ;
        if (arrayList2 != null && arrayList2.size() > 0 && (arrayList = c47835Ipz.LJIIIIZZ) != null) {
            return this.LJIIIIZZ.equals(arrayList);
        }
        String str = this.LJIIL;
        if (str != null) {
            String str2 = c47835Ipz.LJIIL;
            if (str2 == null || !str.equals(str2)) {
                return false;
            }
        } else if (c47835Ipz.LJIIL != null) {
            return false;
        }
        if (this.LJIL != c47835Ipz.LJIL || !this.LJIJJLI.equals(c47835Ipz.LJIJJLI) || this.LJIJJ != c47835Ipz.LJIJJ) {
            return false;
        }
        return true;
    }
}
