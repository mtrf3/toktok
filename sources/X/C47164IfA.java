package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IfA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47164IfA implements InterfaceC47616ImS {
    public List<C36918EeI> LIZ;
    public C47173IfJ LIZIZ;
    public C47163If9 LIZJ;
    public int LIZLLL = 1;
    public HashMap<String, EnumC47176IfM> LJ;
    public JSONObject LJFF;
    public boolean LJI;
    public String LJII;

    @Override // X.InterfaceC47616ImS
    public final boolean LIZ() {
        if (this.LIZJ != null || this.LIZIZ != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final String LIZIZ() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJI(211);
        }
        return "mp4";
    }

    @Override // X.InterfaceC47616ImS
    public final List<C47160If6> LIZLLL() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 == null) {
            return Collections.emptyList();
        }
        return c47163If9.LJIIIIZZ();
    }

    @Override // X.InterfaceC47616ImS
    public final String LJ() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJI(215);
        }
        return "";
    }

    @Override // X.InterfaceC47616ImS
    public final String[] LJI() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJ;
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final C47172IfI LJIIJ() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJJLIIIJJIZ;
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final JSONObject LJIIJJI() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJJJJLI;
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final String LJIILIIL() {
        List<C47160If6> LJIIIIZZ;
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 == null || (LJIIIIZZ = c47163If9.LJIIIIZZ()) == null || LJIIIIZZ.size() == 0) {
            return null;
        }
        Iterator<C47160If6> it = LJIIIIZZ.iterator();
        while (it.hasNext()) {
            String LIZIZ = it.next().LIZIZ(5);
            if (!TextUtils.isEmpty(LIZIZ)) {
                return LIZIZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final JSONObject LJIILL() {
        C46931IbP c46931IbP;
        String LJJI = LJJI(211);
        String LJJI2 = LJJI(2);
        int LJII = LJII(3);
        List<C47160If6> LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            try {
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                Iterator<C47160If6> it = LIZLLL.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJIIL());
                }
                C47163If9 c47163If9 = this.LIZJ;
                if (c47163If9 != null && (c46931IbP = c47163If9.LJJIJL) != null) {
                    arrayList.add(c46931IbP.LIZJ());
                }
                hashMap.put("format", LJJI);
                hashMap.put("vid", LJJI2);
                hashMap.put("bid", LJJI(246));
                hashMap.put("category", Integer.valueOf(LJII(232)));
                hashMap.put("duration", Integer.valueOf(LJII));
                hashMap.put("infos", arrayList);
                C47163If9 c47163If92 = this.LIZJ;
                if (c47163If92 != null) {
                    hashMap.put("pallas_vid_labels", c47163If92.LJI(237));
                }
                return new JSONObject(hashMap);
            } catch (Throwable th) {
                TTVideoEngineLog.d(th);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final String[] LJIJJ() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            if (c47163If9.LJFF == null) {
                List<C47160If6> LJIIIIZZ = c47163If9.LJIIIIZZ();
                ArrayList arrayList = new ArrayList();
                if (LJIIIIZZ != null && LJIIIIZZ.size() > 0) {
                    for (C47160If6 c47160If6 : LJIIIIZZ) {
                        if (c47160If6 != null) {
                            String LIZIZ = c47160If6.LIZIZ(8);
                            if (!TextUtils.isEmpty(LIZIZ) && !arrayList.contains(LIZIZ)) {
                                arrayList.add(LIZIZ);
                            }
                        }
                    }
                }
                String[] strArr = new String[arrayList.size()];
                c47163If9.LJFF = strArr;
                arrayList.toArray(strArr);
            }
            return c47163If9.LJFF;
        }
        return new String[0];
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJJIFFI() {
        if (TextUtils.isEmpty(LJJI(8)) || !LJFF(EnumC47157If3.HLS) || !LJIL(222)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC47616ImS
    public final List<C47170IfG> LJJII() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJJIL;
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJJIII() {
        if (TextUtils.isEmpty(LJJI(8))) {
            return false;
        }
        if (LJFF(EnumC47157If3.DASH)) {
            String LJ = LJ();
            if (!TextUtils.isEmpty(LJ) && LJ.equals("segment_base")) {
                return true;
            }
        } else if (LJFF(EnumC47157If3.MP4) && LJIL(222) && TextUtils.isEmpty(LJIILIIL())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final EnumC47176IfM[] LJJIIJ() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LIZIZ;
        }
        return new EnumC47176IfM[0];
    }

    public final boolean LJJIJ() {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null && c47163If9.LIZLLL(205).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final String LJIIIIZZ() {
        JSONObject LJIILL = LJIILL();
        if (LJIILL != null) {
            return LJIILL.toString();
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final long LIZJ(int i) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 == null) {
            return 0L;
        }
        if (i != 216) {
            if (i != 220) {
                if (i != 243) {
                    c47163If9.getClass();
                    return 0L;
                }
                return c47163If9.LJLJJLL;
            }
            return c47163If9.LJLJI;
        }
        return c47163If9.LJJJJLL;
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJFF(EnumC47157If3 enumC47157If3) {
        if (this.LIZJ == null) {
            return false;
        }
        int i = C47158If4.LIZ[enumC47157If3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return this.LIZJ.LIZLLL(205).booleanValue();
            }
            return this.LIZJ.LIZLLL(206).booleanValue();
        }
        return this.LIZJ.LIZLLL(208).booleanValue();
    }

    @Override // X.InterfaceC47616ImS
    public final int LJII(int i) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJ(i);
        }
        return -1;
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIIIZ(int i) {
        C47163If9 c47163If9;
        List<C47160If6> LJIIIIZZ;
        if (i >= 0 && (c47163If9 = this.LIZJ) != null && (LJIIIIZZ = c47163If9.LJIIIIZZ()) != null && LJIIIIZZ.size() != 0) {
            for (C47160If6 c47160If6 : LJIIIIZZ) {
                if (c47160If6.LJJJJI == i) {
                    return c47160If6;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final float LJIIL(int i) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            if (i != 224) {
                if (i != 225) {
                    if (i != 236) {
                        if (i != 252) {
                            if (i != 239) {
                                if (i != 240) {
                                    switch (i) {
                                        case 247:
                                            return c47163If9.LJJJLZIJ;
                                        case 248:
                                            return c47163If9.LJJJZ;
                                        case 249:
                                            return c47163If9.LJJL;
                                        case LiveCoverMinSizeSetting.DEFAULT /* 250 */:
                                            return c47163If9.LJJLI;
                                    }
                                }
                                return c47163If9.LJJJI;
                            }
                            return c47163If9.LJJJ;
                        }
                        return c47163If9.LJJJLL;
                    }
                    return c47163If9.LJJIZ;
                }
                return c47163If9.LJJJLIIL;
            }
            return c47163If9.LJJJJZI;
        }
        return 0.0f;
    }

    @Override // X.InterfaceC47616ImS
    public final String LJIILJJIL(EnumC47176IfM enumC47176IfM) {
        HashMap<String, EnumC47176IfM> hashMap;
        String str;
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            int LJ = c47163If9.LJ(7);
            if (LJ == 1) {
                hashMap = c47163If9.LJJJJJL;
            } else {
                hashMap = c47163If9.LJJJJJ;
            }
            Iterator<Map.Entry<String, EnumC47176IfM>> it = hashMap.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<String, EnumC47176IfM> next = it.next();
                    if (next.getValue().getIndex() == enumC47176IfM.getIndex()) {
                        str = next.getKey();
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            if (TextUtils.isEmpty(str)) {
                return enumC47176IfM.toString(LJ);
            }
            return str;
        }
        return enumC47176IfM.toString(0);
    }

    @Override // X.InterfaceC47616ImS
    public final void LJIJ(HashMap<String, EnumC47176IfM> hashMap) {
        String str;
        this.LJ = hashMap;
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            int LJ = c47163If9.LJ(7);
            if (hashMap == null || hashMap.size() <= 0) {
                if (LJ == 1) {
                    hashMap = c47163If9.LJJJJJL;
                } else {
                    hashMap = c47163If9.LJJJJJ;
                }
            } else if (LJ == 1) {
                c47163If9.LJJJJJL = hashMap;
            } else {
                c47163If9.LJJJJJ = hashMap;
            }
            List<C47160If6> LJIIIIZZ = c47163If9.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                for (int i = 0; i < LJIIIIZZ.size(); i++) {
                    C47160If6 c47160If6 = (C47160If6) ListProtector.get(LJIIIIZZ, i);
                    if (c47160If6 != null && c47160If6.LIZ() == LJ) {
                        if (hashMap != null && hashMap.size() > 0) {
                            int i2 = c47160If6.LJJIJIIJI;
                            if (i2 == 1) {
                                str = c47160If6.LIZIZ(18);
                                if (TextUtils.isEmpty(str)) {
                                    str = EnumC47176IfM.Standard.toString(c47160If6.LJJIJIIJI);
                                }
                            } else if (i2 == 0) {
                                str = c47160If6.LIZIZ(7);
                                if (TextUtils.isEmpty(str)) {
                                    str = EnumC47176IfM.Standard.toString(c47160If6.LJJIJIIJI);
                                }
                            } else {
                                str = null;
                            }
                            EnumC47176IfM enumC47176IfM = hashMap.get(str);
                            c47160If6.LIZIZ = enumC47176IfM;
                            if (enumC47176IfM == null) {
                                c47160If6.LIZIZ = EnumC47176IfM.Standard;
                            }
                        }
                        EnumC47176IfM resolution = c47160If6.getResolution();
                        String LIZIZ = c47160If6.LIZIZ(32);
                        if (!c47163If9.LIZLLL.contains(LIZIZ)) {
                            c47163If9.LIZLLL.add(LIZIZ);
                        }
                        if (!c47163If9.LIZJ.contains(resolution)) {
                            c47163If9.LIZJ.add(resolution);
                        }
                    }
                }
            }
            EnumC47176IfM[] enumC47176IfMArr = new EnumC47176IfM[c47163If9.LIZJ.size()];
            c47163If9.LIZIZ = enumC47176IfMArr;
            c47163If9.LIZJ.toArray(enumC47176IfMArr);
            String[] strArr = new String[c47163If9.LIZLLL.size()];
            c47163If9.LJ = strArr;
            c47163If9.LIZLLL.toArray(strArr);
        }
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJIL(int i) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LIZLLL(i).booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final String LJJI(int i) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJI(i);
        }
        return "";
    }

    public final void LJJIIJZLJL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            this.LJFF = new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            C78253UnR.LIZLLL("VideoModel", "generate mJsonInfo error");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
        if (optJSONObject != null && optJSONObject.length() > 0) {
            this.LIZLLL = 1;
            C47163If9 c47163If9 = new C47163If9();
            c47163If9.LIZ = this.LIZLLL;
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("data");
            c47163If9.LJJJJIZL = this.LJI;
            c47163If9.LJJJJ = this.LJII;
            c47163If9.LIZJ(optJSONObject2);
            this.LIZJ = c47163If9;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("video_ad_list");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            this.LIZ = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    C36918EeI c36918EeI = new C36918EeI();
                    c36918EeI.LIZ(JSONArrayProtectorUtils.getJSONObject(optJSONArray, i));
                    ((ArrayList) this.LIZ).add(c36918EeI);
                } catch (Exception unused2) {
                }
            }
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("live_info");
        if (optJSONObject3 != null) {
            this.LIZIZ = new C47173IfJ();
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("data");
            C47173IfJ c47173IfJ = this.LIZIZ;
            c47173IfJ.getClass();
            if (optJSONObject4 != null) {
                JSONObject optJSONObject5 = optJSONObject4.optJSONObject("live_info");
                try {
                    if (optJSONObject5.has("live_0")) {
                        E7P e7p = new E7P();
                        c47173IfJ.LIZ = e7p;
                        e7p.LIZ(JSONObjectProtectorUtils.getJSONObject(optJSONObject5, "live_0"));
                    }
                    if (optJSONObject5.has("live_1")) {
                        E7P e7p2 = new E7P();
                        c47173IfJ.LIZIZ = e7p2;
                        e7p2.LIZ(JSONObjectProtectorUtils.getJSONObject(optJSONObject5, "live_1"));
                    }
                    optJSONObject5.optInt("backup_status");
                    optJSONObject5.optInt("live_status");
                    optJSONObject5.optInt("status");
                    optJSONObject5.optLong("start_time");
                    optJSONObject5.optLong("end_time");
                } catch (JSONException e) {
                    TTVideoEngineLog.d(e);
                }
                optJSONObject4.optString("user_id");
                optJSONObject4.optString("live_id");
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("PlayInfoList");
        if ((optJSONArray2 != null && optJSONArray2.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID")) || !TextUtils.isEmpty(jSONObject.optString("Vid"))) {
            if (jSONObject.optInt("Version") == 4) {
                this.LIZLLL = 4;
            } else {
                this.LIZLLL = 2;
            }
            C47163If9 c47163If92 = new C47163If9();
            this.LIZJ = c47163If92;
            c47163If92.LIZ = this.LIZLLL;
            c47163If92.LIZJ(jSONObject);
        }
        LJIJ(this.LJ);
    }

    public final C47160If6 LJJIIZ(java.util.Map<Integer, String> map) {
        List<C47160If6> LJIIIIZZ;
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null && (LJIIIIZZ = c47163If9.LJIIIIZZ()) != null && LJIIIIZZ.size() != 0) {
            for (C47160If6 c47160If6 : LJIIIIZZ) {
                if (c47160If6 != null) {
                    HashMap hashMap = (HashMap) map;
                    if (hashMap.size() == 0) {
                        return c47160If6;
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        int intValue = ((Integer) entry.getKey()).intValue();
                        String str = (String) entry.getValue();
                        if (TextUtils.isEmpty(str) || str.equals(c47160If6.LIZIZ(intValue))) {
                        }
                    }
                    return c47160If6;
                }
            }
        }
        return null;
    }

    public final void LJJIIZI(JSONObject jSONObject) {
        jSONObject.put("mb_refactor", true);
        LJJIIJZLJL(new JSONObject().put("video_info", new JSONObject().put("data", jSONObject)));
    }

    public final void LJJIJIIJI(C47163If9 c47163If9) {
        this.LIZJ = c47163If9;
        LJIJ(this.LJ);
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIIZILJ(EnumC47176IfM enumC47176IfM, java.util.Map<Integer, String> map) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJII(enumC47176IfM, c47163If9.LJ(7), map);
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final String[] LJJ(EnumC47176IfM enumC47176IfM, java.util.Map<Integer, String> map) {
        E7P e7p;
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            String[] strArr = c47163If9.LJJIJIIJI;
            if (strArr != null && strArr.length > 0) {
                return strArr;
            }
            C47160If6 LJII = c47163If9.LJII(enumC47176IfM, c47163If9.LJ(7), map);
            if (LJII == null) {
                return new String[0];
            }
            return LJII.LJIIIZ();
        }
        C47173IfJ c47173IfJ = this.LIZIZ;
        if (c47173IfJ != null && ((e7p = c47173IfJ.LIZ) != null || (e7p = c47173IfJ.LIZIZ) != null)) {
            return e7p.LIZJ;
        }
        return new String[0];
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIJI(EnumC47176IfM enumC47176IfM, int i, java.util.Map<Integer, String> map) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return c47163If9.LJII(enumC47176IfM, i, map);
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIJJLI(EnumC47176IfM enumC47176IfM, java.util.Map<Integer, String> map, boolean z) {
        C47163If9 c47163If9 = this.LIZJ;
        if (c47163If9 != null) {
            return LJIILLIIL(enumC47176IfM, c47163If9.LJ(7), map, z);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        r5 = LJIJI(r4[r2], r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r2 = ((r2 + r4.length) - 1) % r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r2 != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        return r5;
     */
    @Override // X.InterfaceC47616ImS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47160If6 LJIILLIIL(X.EnumC47176IfM r7, int r8, java.util.Map<java.lang.Integer, java.lang.String> r9, boolean r10) {
        /*
            r6 = this;
            X.If6 r5 = r6.LJIJI(r7, r8, r9)
            if (r10 != 0) goto L7
            return r5
        L7:
            X.IfM[] r4 = X.EnumC47176IfM.getAllResolutions()
            int r0 = r4.length
            if (r0 > 0) goto Lf
            return r5
        Lf:
            int r0 = r4.length
            int r3 = r0 + (-1)
            if (r7 == 0) goto L25
            r2 = 0
        L15:
            int r0 = r4.length
            if (r2 >= r0) goto L25
            r0 = r4[r2]
            int r1 = r0.getIndex()
            int r0 = r7.getIndex()
            if (r1 != r0) goto L3b
            r3 = r2
        L25:
            r2 = r3
            if (r5 != 0) goto L31
        L28:
            r1 = r4[r2]
            r0 = 0
            X.If6 r5 = r6.LJIJI(r1, r8, r0)
            if (r5 == 0) goto L32
        L31:
            return r5
        L32:
            int r0 = r4.length
            int r2 = r2 + r0
            int r2 = r2 + (-1)
            int r0 = r4.length
            int r2 = r2 % r0
            if (r2 != r3) goto L28
            goto L31
        L3b:
            int r2 = r2 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47164IfA.LJIILLIIL(X.IfM, int, java.util.Map, boolean):X.If6");
    }
}
