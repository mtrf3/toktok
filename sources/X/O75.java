package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O75 {
    public static volatile O75 LIZJ;
    public volatile long LIZ;
    public long LIZIZ = 20000;

    public static boolean LIZIZ(O7E o7e) {
        String str;
        O7J o7j = o7e.LJLIL;
        O76 LJI = O76.LJI();
        if (o7j != null && o7j.LIZJ() && O77.LJIJI(o7j.LIZLLL, LJI)) {
            C1DJ.LJIJI(o7e.LJLL, "The image ad data is illegal or the resource already exists and will not be downloaded anymore");
            LJIIIZ(0, o7e);
            return false;
        }
        HashMap<String, Object> hashMap = new HashMap<>(1);
        if (o7e.LJIIIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_topview", str);
        O79.LIZIZ().LJI(o7e, 0L, "splash_start_download", null, hashMap);
        return true;
    }

    public static void LJIIIIZZ(O7E o7e) {
        long j;
        String LIZJ2 = O7I.LIZIZ().LIZJ();
        long currentTimeMillis = System.currentTimeMillis();
        if (o7e != null) {
            j = o7e.LJLL;
            LIZJ2 = o7e.LJLZ;
            currentTimeMillis = o7e.LJLILLLLZI;
        } else {
            j = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", LIZJ2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(currentTimeMillis));
            O79.LIZIZ().LIZLLL("splash_ad", "launch_covered", jSONObject, j);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIILIIL(List list) {
        if (!C48003Ish.LIZJ(C61359O6h.LJIILL) || C30591Hz.LJIILLIIL(list) || C61359O6h.LIZJ == null) {
            return;
        }
        try {
            if (C48003Ish.LIZIZ(C61359O6h.LJIILL) == 0) {
                return;
            }
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                O7E o7e = (O7E) it.next();
                if (o7e != null && o7e.LJIILIIL()) {
                    int i = o7e.LLFZ;
                    if (i != 0 && i != 1) {
                        if (i == 2) {
                            LJIIL(2, o7e);
                        }
                    } else {
                        LJIIL(1, o7e);
                        if (!C30591Hz.LJIILLIIL(o7e.LLFF)) {
                            Iterator it2 = ((ArrayList) o7e.LLFF).iterator();
                            while (it2.hasNext()) {
                                O7E o7e2 = (O7E) it2.next();
                                if (o7e2 != null && o7e2.LJIILIIL()) {
                                    LJIIL(1, o7e2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean LJIILJJIL(O7E o7e) {
        int i;
        O7J o7j = o7e.LJLIL;
        if (o7j == null || !o7j.LIZJ()) {
            return false;
        }
        if (!LIZIZ(o7e)) {
            LIZLLL(o7j, o7e);
            return false;
        }
        LIZLLL(o7j, o7e);
        if (TextUtils.isEmpty(o7j.LJ)) {
            i = 1;
        } else {
            i = 3;
        }
        return LIZJ(o7e, i, o7j.LIZLLL, o7j.LIZ);
    }

    public static void LJIILL(List list) {
        String LIZIZ;
        int i;
        boolean z;
        boolean z2;
        if (!C48003Ish.LIZJ(C61359O6h.LJIILL) || C30591Hz.LJIILLIIL(list)) {
            return;
        }
        C1DJ.LJIJJ(" prepare to download resource ");
        if (C61359O6h.LJJIIZI != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                O7E o7e = (O7E) it.next();
                if (o7e.LJIIIZ() && !C78886Uxe.LJJIIZI(o7e.LLIILII)) {
                    arrayList.add(o7e.LLIILII);
                    arrayList2.add(o7e);
                }
            }
            O8W.LIZJ("service_splash_origin_operation", "duration_preload_origin_splash_resources", new NPS(arrayList, arrayList2));
        }
        int LIZIZ2 = C48003Ish.LIZIZ(C61359O6h.LJIILL);
        if (LIZIZ2 == 0) {
            return;
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            O7E o7e2 = (O7E) it2.next();
            if (o7e2 != null && o7e2.LJIILIIL()) {
                if ((o7e2.LLIILZL & LIZIZ2) != 0) {
                    int i2 = o7e2.LLFZ;
                    if (i2 != 0 && i2 != 1) {
                        if (i2 == 2) {
                            O7G o7g = o7e2.LLI;
                            if (TextUtils.isEmpty(o7g.LJI)) {
                                LIZIZ = o7g.LIZLLL;
                            } else {
                                LIZIZ = o7g.LIZIZ();
                            }
                            if (O77.LJIJI(LIZIZ, O76.LJI())) {
                                C1DJ.LJIJI(o7e2.LJLL, " video resource exist, no more download");
                                LJIIIZ(0, o7e2);
                            } else {
                                if (O77.LJIJJ(o7e2)) {
                                    O79.LIZIZ().LJII(o7e2, "topview_start_download");
                                }
                                O7G o7g2 = o7e2.LLI;
                                if (TextUtils.isEmpty(o7g2.LJI)) {
                                    i = 1;
                                } else {
                                    i = 3;
                                }
                                if (o7e2.LJIIIZ() && o7e2.LLFZ == 2) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                String str = null;
                                if (!TextUtils.isEmpty(o7g2.LJI)) {
                                    if (!TextUtils.isEmpty(null) && z) {
                                        if (o7g2.LIZJ()) {
                                            str = O77.LJIIJ(o7g2.LIZIZ());
                                        }
                                    } else if (o7g2.LIZJ()) {
                                        str = O77.LJIILIIL(o7g2.LIZIZ());
                                    }
                                } else if (!TextUtils.isEmpty(null) && z) {
                                    if (o7g2.LIZJ()) {
                                        str = O77.LJIIJ(o7g2.LIZLLL);
                                    }
                                } else {
                                    str = O77.LJIIZILJ(o7g2);
                                }
                                if (!TextUtils.isEmpty(str)) {
                                    List<String> list2 = o7g2.LIZJ;
                                    O76.LJI().LIZIZ(str);
                                    if (C30591Hz.LJIJJ(list2)) {
                                        O81 LJII = LJII(o7e2, true);
                                        Iterator it3 = ((ArrayList) list2).iterator();
                                        while (it3.hasNext()) {
                                            String LIZIZ3 = O7K.LIZIZ((String) it3.next());
                                            long currentTimeMillis = System.currentTimeMillis();
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append("try to download the video，url: ");
                                            LIZ.append(LIZIZ3);
                                            C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
                                            if (!TextUtils.isEmpty(LIZIZ3) && C61359O6h.LIZJ != null) {
                                                try {
                                                    if (((O7C) C61359O6h.LIZJ).LIZ(LJII, LIZIZ3, str)) {
                                                        LJFF(2, System.currentTimeMillis() - currentTimeMillis);
                                                        z2 = true;
                                                        break;
                                                    }
                                                } catch (Exception e) {
                                                    StringBuilder LIZ2 = X1D.LIZ();
                                                    LIZ2.append("Failed to download video, error: ");
                                                    LIZ2.append(e.getMessage());
                                                    C1DJ.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                    long j = o7e2.LJLL;
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("whether the download is successful：");
                                    LIZ3.append(z2);
                                    C1DJ.LJIJI(j, X1D.LIZIZ(LIZ3));
                                    if (z2) {
                                        LIZ(o7e2.LJI(), str);
                                        LJIIJ(o7e2, 16, false, i);
                                        LJ(1, str);
                                        LJI(str, true, true);
                                        O76.LJI().LJIILL(o7e2.LLI);
                                    } else {
                                        LJIIJ(o7e2, 17, false, i);
                                        LJI(str, true, false);
                                    }
                                }
                            }
                        }
                    } else {
                        if (LJIILJJIL(o7e2)) {
                            O76 LJI = O76.LJI();
                            O7J o7j = o7e2.LJLIL;
                            LJI.getClass();
                            if (o7j != null && !C78886Uxe.LJJIIZI(o7j.LIZLLL)) {
                                LJI.LJIILJJIL(o7j.LIZLLL);
                            }
                        }
                        if (!C30591Hz.LJIILLIIL(o7e2.LLFF)) {
                            C1DJ.LJIJI(o7e2.LJLL, "start to download resource of time-gap ad");
                            Iterator it4 = ((ArrayList) o7e2.LLFF).iterator();
                            while (it4.hasNext()) {
                                O7E o7e3 = (O7E) it4.next();
                                if (o7e3 != null && o7e3.LJIILIIL() && LJIILJJIL(o7e3)) {
                                    O76 LJI2 = O76.LJI();
                                    O7J o7j2 = o7e3.LJLIL;
                                    LJI2.getClass();
                                    if (o7j2 != null && !C78886Uxe.LJJIIZI(o7j2.LIZLLL)) {
                                        LJI2.LJIILJJIL(o7j2.LIZLLL);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    LJIIIZ(1, o7e2);
                }
            }
        }
    }

    public static void LIZ(long j, String str) {
        JSONArray jSONArray;
        try {
            if (C78886Uxe.LJJIIZI(str) || j <= 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j));
            synchronized (O76.class) {
                String LIZLLL = O76.LJI().LIZJ.LIZLLL("splash_ad_local_cache_data");
                if (C78886Uxe.LJJIIZI(LIZLLL)) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(LIZLLL);
                }
                jSONArray.put(jSONObject);
                O76 LJI = O76.LJI();
                LJI.LIZJ.LJI("splash_ad_local_cache_data", jSONArray.toString());
                LJI.LIZJ();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LIZLLL(O7J o7j, O7E o7e) {
        if (!o7j.LIZIZ() || O77.LJIJI(o7j.LJFF, O76.LJI()) || !LIZJ(o7e, 1, o7j.LJFF, o7j.LJI)) {
            return;
        }
        O76.LJI().LJIILJJIL(o7j.LJFF);
    }

    public static void LJ(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(O5Y.LJIJJLI(str)));
            O8O.LIZLLL().LJII("sevice_ad_file_size", i, jSONObject, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJFF(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("res_type", Integer.valueOf(i));
            O8O.LIZLLL().LJII("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static O81 LJII(O7E o7e, boolean z) {
        O8C o8c = new O8C();
        o8c.LIZ = o7e.LJLL;
        o8c.LIZIZ = o7e.LJLZ;
        return new O81(o8c);
    }

    public static void LJIIIZ(int i, O7E o7e) {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("reason", Integer.valueOf(i));
        if (O77.LJIJJ(o7e)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_topview", str);
        O79.LIZIZ().LJI(o7e, 0L, "splash_no_download", null, hashMap);
    }

    public static void LJIIJJI(O7E o7e, O7E o7e2) {
        if (o7e != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("log_extra", o7e.LJLZ).putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_fetch_time", Long.valueOf(o7e.LJLILLLLZI));
                if (o7e2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("boarding_to", Long.valueOf(o7e2.LJLL));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                O79.LIZIZ().LIZLLL("splash_ad", "boarding", jSONObject, o7e.LJLL);
            } catch (Exception unused) {
                return;
            }
        }
        if (o7e2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("log_extra", o7e2.LJLZ).putOpt("is_ad_event", "1");
            jSONObject3.putOpt("ad_fetch_time", Long.valueOf(o7e2.LJLILLLLZI));
            if (o7e != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("covered_by", Long.valueOf(o7e.LJLL));
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
            O79.LIZIZ().LIZLLL("splash_ad", "covered", jSONObject3, o7e2.LJLL);
        }
    }

    public static void LJIIL(int i, O7E o7e) {
        new O8C();
        C61359O6h.LIZJ.getClass();
    }

    public static void LJI(String str, boolean z, boolean z2) {
        O7L o7l = O76.LJI().LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("bda_splash");
        LIZ.append(str);
        int LIZIZ = o7l.LIZIZ(X1D.LIZIZ(LIZ));
        long LJIJJLI = O5Y.LJIJJLI(str);
        int i = !z2 ? 1 : 0;
        if (z2) {
            O7L o7l2 = O76.LJI().LIZJ;
            String LJFF = i0.LJFF("bda_splash", str);
            O7M o7m = o7l2.LIZ;
            if (LJFF != null) {
                o7m.LIZIZ.remove(LJFF);
            } else {
                o7m.getClass();
            }
            o7l2.LIZ();
        }
        C61352O6a.LIZ().getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resource_type", z ? 1 : 0);
            jSONObject.put("resource_size", LJIJJLI);
            jSONObject.put("download_count", LIZIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        O8O.LIZLLL().LJII("bda_splash_download", i, jSONObject, null);
    }

    public static boolean LIZJ(O7E o7e, int i, String str, List list) {
        boolean z;
        String str2;
        String LJIILIIL = O77.LJIILIIL(str);
        if (TextUtils.isEmpty(LJIILIIL)) {
            return false;
        }
        O76.LJI().LIZIZ(LJIILIIL);
        if (C30591Hz.LJIJJ(list)) {
            O81 LJII = LJII(o7e, false);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("try to download images，url: ");
                if (str3 == null) {
                    str2 = "";
                } else {
                    str2 = str3;
                }
                LIZ.append(str2);
                C1DJ.LJIJJ(X1D.LIZIZ(LIZ));
                long currentTimeMillis = System.currentTimeMillis();
                if (str3 != null && !str3.isEmpty() && C61359O6h.LIZJ != null) {
                    try {
                        if (((O7C) C61359O6h.LIZJ).LIZ(LJII, str3, LJIILIIL)) {
                            LJFF(1, System.currentTimeMillis() - currentTimeMillis);
                            z = true;
                            break;
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Failed to download image, error: ");
                        LIZ2.append(e.getMessage());
                        C1DJ.LJIIIIZZ(X1D.LIZIZ(LIZ2));
                    }
                }
            }
        }
        z = false;
        long j = o7e.LJLL;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("whether the download is successful：");
        LIZ3.append(z);
        C1DJ.LJIJI(j, X1D.LIZIZ(LIZ3));
        if (z) {
            LIZ(o7e.LJI(), LJIILIIL);
            LJIIJ(o7e, 0, false, i);
            LJ(0, LJIILIIL);
            LJI(LJIILIIL, false, true);
        } else {
            LJIIJ(o7e, 1, false, i);
            LJI(LJIILIIL, false, false);
        }
        return z;
    }

    public static void LJIIJ(O7E o7e, int i, boolean z, int i2) {
        String LJIIJJI;
        String str;
        Object obj;
        HashMap<String, Object> hashMap = new HashMap<>();
        HashMap<String, Object> hashMap2 = new HashMap<>();
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 16) {
                        if (i != 17) {
                            LJIIJJI = "";
                            str = "";
                        } else {
                            LJIIJJI = O77.LJIJ(o7e.LLI);
                            str = "download_video_failed";
                        }
                    } else {
                        LJIIJJI = O77.LJIJ(o7e.LLI);
                        str = "download_video_succeed";
                    }
                } else {
                    LJIIJJI = O77.LJIIJJI(o7e.LJLIL);
                    str = "download_image_failed";
                    hashMap2.put("image_mode", Integer.valueOf(o7e.LL));
                }
            } else {
                LJIIJJI = O77.LJIIJJI(o7e.LJLIL);
                str = "download_image_succeed";
                hashMap2.put("image_mode", Integer.valueOf(o7e.LL));
            }
            if (i2 != -1) {
                hashMap2.put("position", Integer.valueOf(i2));
            }
            hashMap2.put("url", LJIIJJI);
            String str2 = "1";
            if (O77.LJIJJ(o7e)) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap2.put("is_topview", obj);
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap2.put("is_async", str2);
            O79.LIZIZ().LJI(o7e, 0L, str, hashMap, hashMap2);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
