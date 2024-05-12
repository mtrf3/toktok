package Y;

import X.AbstractAsyncTaskC60035NhH;
import X.AsyncTaskC60025Nh7;
import X.AsyncTaskC60026Nh8;
import X.AsyncTaskC60028NhA;
import X.C10K;
import X.C16880lQ;
import X.C1DJ;
import X.C1GE;
import X.C30591Hz;
import X.C48003Ish;
import X.C48473J0r;
import X.C60014Ngw;
import X.C60021Nh3;
import X.C60023Nh5;
import X.C60030NhC;
import X.C60031NhD;
import X.C60032NhE;
import X.C60033NhF;
import X.C60034NhG;
import X.C60037NhJ;
import X.C60038NhK;
import X.C60040NhM;
import X.C60045NhR;
import X.C60297NlV;
import X.C60498Nok;
import X.C61357O6f;
import X.C61359O6h;
import X.C61375O6x;
import X.C61463OAh;
import X.C61464OAi;
import X.C61467OAl;
import X.C61511OCd;
import X.C61532OCy;
import X.C63081OpJ;
import X.C63144OqK;
import X.C63276OsS;
import X.C63308Osy;
import X.C63312Ot2;
import X.C63314Ot4;
import X.C63322OtC;
import X.C63323OtD;
import X.C63333OtN;
import X.C63501Ow5;
import X.C63502Ow6;
import X.C63519OwN;
import X.C63521OwP;
import X.C78886Uxe;
import X.C89453Z8v;
import X.EBC;
import X.EnumC35451Dvj;
import X.ExecutorC142245i8;
import X.InterfaceC59245NMz;
import X.InterfaceC60041NhN;
import X.InterfaceC60042NhO;
import X.InterfaceC60493Nof;
import X.InterfaceC61465OAj;
import X.InterfaceC63516OwK;
import X.InterfaceC63520OwO;
import X.O75;
import X.O76;
import X.O77;
import X.O78;
import X.O79;
import X.O7E;
import X.O7I;
import X.O80;
import X.O8B;
import X.O8O;
import X.O8W;
import X.OAH;
import X.OC6;
import X.OD6;
import X.OL1;
import X.OL2;
import X.OL3;
import X.OL5;
import X.X1D;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ARunnableS17S0000000_10 implements Runnable {
    public final int $t;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            default:
                return;
        }
    }

    public static void LIZ$0() {
        InterfaceC61465OAj LIZJ;
        File[] listFiles;
        String str;
        int i;
        long j;
        C61532OCy c61532OCy = EBC.LIZ;
        GlobalConfigSettings LJFF = c61532OCy.LJFF();
        if (LJFF != null) {
            int version = LJFF.getVersion();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(version);
            OD6.LJI(5, "", 1001, X1D.LIZIZ(LIZ));
        }
        c61532OCy.LIZIZ();
        File rootDirectory = c61532OCy.LJ.getRootDirectory();
        ArrayList arrayList = new ArrayList();
        File[] listFiles2 = rootDirectory.listFiles();
        if (listFiles2 != null && listFiles2.length != 0) {
            long j2 = 0;
            for (File file : listFiles2) {
                String name = file.getName();
                if (!TextUtils.isEmpty(name) && (listFiles = new File(file, name).listFiles(new C61464OAi())) != null && listFiles.length != 0) {
                    long j3 = 0;
                    int i2 = 0;
                    for (File file2 : listFiles) {
                        File[] listFiles3 = file2.listFiles(new C61464OAi());
                        if (listFiles3 != null && listFiles3.length > 1) {
                            Long l = null;
                            long j4 = 0;
                            for (File file3 : listFiles3) {
                                try {
                                    long longValue = CastLongProtector.valueOf(file3.getName()).longValue();
                                    long lastModified = file3.lastModified();
                                    if (l == null || lastModified > j4) {
                                        l = Long.valueOf(longValue);
                                        j4 = lastModified;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            i = OAH.LIZLLL(l, file2.getAbsolutePath(), true, true);
                        } else {
                            i = 0;
                        }
                        i2 += i;
                        if (listFiles3 == null || listFiles3.length == 0) {
                            j = 0;
                        } else {
                            j = 0;
                            for (File file4 : listFiles3) {
                                try {
                                    CastLongProtector.valueOf(file4.getName());
                                    File file5 = new File(file4, "res.zip");
                                    if (file5.exists()) {
                                        C16880lQ.LLLZZIL(file5);
                                    }
                                    File file6 = new File(file4, "res");
                                    if (file6.exists()) {
                                        j += C61467OAl.LJI(file6);
                                    }
                                } catch (Exception unused2) {
                                    j = C61467OAl.LJI(file4) + j;
                                }
                            }
                        }
                        j3 += j;
                    }
                    j2 += j3;
                    int length = listFiles.length;
                    C61532OCy c61532OCy2 = EBC.LIZ;
                    Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map = c61532OCy2.LIZIZ;
                    if (map == null) {
                        str = c61532OCy2.LIZLLL().appVersion;
                    } else {
                        Map map2 = (Map) ((ConcurrentHashMap) map).get(name);
                        if (map2 == null) {
                            str = c61532OCy2.LIZLLL().appVersion;
                        } else {
                            OptionCheckUpdateParams.CustomValue customValue = (OptionCheckUpdateParams.CustomValue) map2.get("business_version");
                            if (customValue == null) {
                                str = c61532OCy2.LIZLLL().appVersion;
                            } else {
                                str = (String) customValue.getValue();
                                if (TextUtils.isEmpty(str)) {
                                    str = c61532OCy2.LIZLLL().appVersion;
                                }
                            }
                        }
                    }
                    arrayList.add(new C61463OAh(length, j3, name, i2, str));
                }
            }
            if (arrayList.size() != 0 && (LIZJ = OD6.LIZJ()) != null) {
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C61463OAh c61463OAh = (C61463OAh) it.next();
                        JSONObject jSONObject = new JSONObject();
                        OD6.LIZ(jSONObject);
                        jSONObject.put("access_key", c61463OAh.LJLIL);
                        jSONObject.put("access_key_resource_usage", c61463OAh.LJLILLLLZI);
                        jSONObject.put("channel_count", c61463OAh.LJLJI);
                        jSONObject.put("business_version", c61463OAh.LJLJJI);
                        jSONObject.put("delete_old_dir_count", c61463OAh.LJLJJL);
                        jSONObject.put("gecko_total_resource_usage", j2);
                        jSONObject.put("block_channels", C61511OCd.LJ(c61463OAh.LJLIL));
                        jSONObject.put("blocklist_count", C61511OCd.LJFF(c61463OAh.LJLIL));
                        LIZJ.LIZ("geckosdk_access_key_resource_info", jSONObject);
                    }
                } catch (Exception e) {
                    OC6.LJ("gecko-debug-tag", "UploadStatistic.uploadResourceInfoToTea", e);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        C61532OCy c61532OCy3 = EBC.LIZ;
        c61532OCy3.LIZIZ();
        for (File file7 : c61532OCy3.LJ.getCandidateRootDirectories()) {
            if (file7.exists()) {
                C61532OCy c61532OCy4 = EBC.LIZ;
                c61532OCy4.LIZIZ();
                if (!file7.equals(c61532OCy4.LJ.getRootDirectory())) {
                    try {
                        C61467OAl.LIZLLL(file7);
                        arrayList2.add(file7.getName());
                    } catch (Throwable th) {
                        OC6.LIZJ("gecko-debug-tag", "error happened when clean other root directories", th);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str2);
        }
        OD6.LJI(6, "", 601, sb.toString());
    }

    public static void LIZ$4() {
        String str;
        C60030NhC c60030NhC = C60030NhC.LJI;
        c60030NhC.LIZIZ = 0;
        c60030NhC.LJFF = System.nanoTime();
        C60034NhG c60034NhG = c60030NhC.LIZLLL;
        c60034NhG.getClass();
        C60023Nh5 c60023Nh5 = C60023Nh5.LIZJ;
        if (c60023Nh5 != null) {
            for (C60014Ngw c60014Ngw : Collections.unmodifiableCollection(c60023Nh5.LIZIZ)) {
                View view = c60014Ngw.LIZLLL.get();
                if (c60014Ngw.LJFF && !c60014Ngw.LJI) {
                    String str2 = c60014Ngw.LJII;
                    if (view != null) {
                        if (!view.hasWindowFocus()) {
                            str = "noWindowFocus";
                        } else {
                            HashSet hashSet = new HashSet();
                            View view2 = view;
                            do {
                                str = C60040NhM.LIZ(view2);
                                if (str == null) {
                                    hashSet.add(view2);
                                    Object parent = view2.getParent();
                                    if (!(parent instanceof View)) {
                                        break;
                                    } else {
                                        view2 = (View) parent;
                                    }
                                }
                            } while (view2 != null);
                            c60034NhG.LIZLLL.addAll(hashSet);
                            c60034NhG.LJ.add(str2);
                            c60034NhG.LIZ.put(view, str2);
                            Iterator it = ((ArrayList) c60014Ngw.LIZJ).iterator();
                            while (it.hasNext()) {
                                C60021Nh3 c60021Nh3 = (C60021Nh3) it.next();
                                View view3 = c60021Nh3.LIZ.get();
                                if (view3 != null) {
                                    C60037NhJ c60037NhJ = c60034NhG.LIZIZ.get(view3);
                                    if (c60037NhJ != null) {
                                        c60037NhJ.LIZIZ.add(c60014Ngw.LJII);
                                    } else {
                                        c60034NhG.LIZIZ.put(view3, new C60037NhJ(c60021Nh3, c60014Ngw.LJII));
                                    }
                                }
                            }
                        }
                        c60034NhG.LJFF.add(str2);
                        c60034NhG.LIZJ.put(str2, view);
                        c60034NhG.LJI.put(str2, str);
                        break;
                    } else {
                        c60034NhG.LJFF.add(str2);
                        c60034NhG.LJI.put(str2, "noAdView");
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        C60032NhE c60032NhE = (C60032NhE) c60030NhC.LIZJ.LIZIZ;
        if (c60030NhC.LIZLLL.LJFF.size() > 0) {
            Iterator<String> it2 = c60030NhC.LIZLLL.LJFF.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                c60032NhE.getClass();
                JSONObject LIZ = C60031NhD.LIZ(0, 0, 0, 0);
                View view4 = c60030NhC.LIZLLL.LIZJ.get(next);
                C60033NhF c60033NhF = (C60033NhF) c60030NhC.LIZJ.LIZ;
                String str3 = c60030NhC.LIZLLL.LJI.get(next);
                if (str3 != null) {
                    JSONObject LIZ2 = c60033NhF.LIZ(view4);
                    try {
                        LIZ2.put("adSessionId", next);
                    } catch (JSONException unused) {
                        C1GE.LIZ("Error with setting ad session id");
                    }
                    try {
                        LIZ2.put("notVisibleReason", str3);
                    } catch (JSONException unused2) {
                        C1GE.LIZ("Error with setting not visible reason");
                    }
                    try {
                        JSONArray optJSONArray = LIZ.optJSONArray("childViews");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                            LIZ.put("childViews", optJSONArray);
                        }
                        optJSONArray.put(LIZ2);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                C60031NhD.LIZIZ(LIZ);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(next);
                C60038NhK c60038NhK = c60030NhC.LJ;
                C60045NhR c60045NhR = c60038NhK.LIZIZ;
                AsyncTaskC60025Nh7 asyncTaskC60025Nh7 = new AsyncTaskC60025Nh7(c60038NhK, hashSet2, LIZ, nanoTime);
                c60045NhR.getClass();
                asyncTaskC60025Nh7.LIZ = c60045NhR;
                c60045NhR.LIZIZ.add(asyncTaskC60025Nh7);
                if (c60045NhR.LIZJ == null) {
                    AbstractAsyncTaskC60035NhH poll = c60045NhR.LIZIZ.poll();
                    c60045NhR.LIZJ = poll;
                    if (poll != null) {
                        poll.executeOnExecutor(c60045NhR.LIZ, new Object[0]);
                    }
                }
            }
        }
        if (c60030NhC.LIZLLL.LJ.size() > 0) {
            c60032NhE.getClass();
            JSONObject LIZ3 = C60031NhD.LIZ(0, 0, 0, 0);
            c60032NhE.LIZIZ(null, LIZ3, c60030NhC, true);
            C60031NhD.LIZIZ(LIZ3);
            C60038NhK c60038NhK2 = c60030NhC.LJ;
            HashSet<String> hashSet3 = c60030NhC.LIZLLL.LJ;
            C60045NhR c60045NhR2 = c60038NhK2.LIZIZ;
            AsyncTaskC60026Nh8 asyncTaskC60026Nh8 = new AsyncTaskC60026Nh8(c60038NhK2, hashSet3, LIZ3, nanoTime);
            c60045NhR2.getClass();
            asyncTaskC60026Nh8.LIZ = c60045NhR2;
            c60045NhR2.LIZIZ.add(asyncTaskC60026Nh8);
            if (c60045NhR2.LIZJ == null) {
                AbstractAsyncTaskC60035NhH poll2 = c60045NhR2.LIZIZ.poll();
                c60045NhR2.LIZJ = poll2;
                if (poll2 != null) {
                    poll2.executeOnExecutor(c60045NhR2.LIZ, new Object[0]);
                }
            }
        } else {
            C60038NhK c60038NhK3 = c60030NhC.LJ;
            C60045NhR c60045NhR3 = c60038NhK3.LIZIZ;
            AsyncTaskC60028NhA asyncTaskC60028NhA = new AsyncTaskC60028NhA(c60038NhK3);
            c60045NhR3.getClass();
            asyncTaskC60028NhA.LIZ = c60045NhR3;
            c60045NhR3.LIZIZ.add(asyncTaskC60028NhA);
            if (c60045NhR3.LIZJ == null) {
                AbstractAsyncTaskC60035NhH poll3 = c60045NhR3.LIZIZ.poll();
                c60045NhR3.LIZJ = poll3;
                if (poll3 != null) {
                    poll3.executeOnExecutor(c60045NhR3.LIZ, new Object[0]);
                }
            }
        }
        C60034NhG c60034NhG2 = c60030NhC.LIZLLL;
        c60034NhG2.LIZ.clear();
        c60034NhG2.LIZIZ.clear();
        c60034NhG2.LIZJ.clear();
        c60034NhG2.LIZLLL.clear();
        c60034NhG2.LJ.clear();
        c60034NhG2.LJFF.clear();
        c60034NhG2.LJI.clear();
        c60034NhG2.LJII = false;
        long nanoTime2 = System.nanoTime() - c60030NhC.LJFF;
        if (((ArrayList) c60030NhC.LIZ).size() > 0) {
            Iterator it3 = ((ArrayList) c60030NhC.LIZ).iterator();
            while (it3.hasNext()) {
                InterfaceC60042NhO interfaceC60042NhO = (InterfaceC60042NhO) it3.next();
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                interfaceC60042NhO.LIZ();
                if (interfaceC60042NhO instanceof InterfaceC60041NhN) {
                    ((InterfaceC60041NhN) interfaceC60042NhO).LIZIZ();
                }
            }
        }
    }

    public final void LIZ$3() {
        C63323OtD LIZJ = C63144OqK.LIZJ("imsdk_ws_connection_survival");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().isAppBackground()), "is_background");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().isWsConnected()), "is_connected");
        LIZJ.LIZ(Boolean.valueOf(C63308Osy.LJI().LIZIZ().LJIL()), "net_connected");
        LIZJ.LIZLLL();
        if (C63314Ot4.LIZLLL() > 0) {
            C63333OtN.LIZ.postDelayed(this, C63314Ot4.LIZLLL() * 1000);
        }
    }

    public static void LIZ$1() {
        C63521OwP LIZIZ = C63521OwP.LIZIZ();
        LIZIZ.getClass();
        C63322OtC.LJI("RequestManagerFactory", "loadCoreParallelRequestManager", null);
        Iterator<InterfaceC63520OwO> it = LIZIZ.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC63520OwO next = it.next();
            if (next.LIZ() == EnumC35451Dvj.CORE_PARALLEL) {
                InterfaceC63516OwK LIZIZ2 = next.LIZIZ();
                if (LIZIZ2 instanceof C63519OwN) {
                    C63519OwN c63519OwN = (C63519OwN) LIZIZ2;
                    C63322OtC.LJI("RequestManagerFactory", "instRightNow", null);
                    synchronized (c63519OwN) {
                        if (!C63519OwN.LJI()) {
                            c63519OwN.LJII();
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static void LIZ$2() {
        int i;
        int i2;
        O7E o7e;
        boolean z;
        O7E o7e2;
        C61375O6x.LIZ().getClass();
        if (O75.LIZJ == null) {
            synchronized (O75.class) {
                if (O75.LIZJ == null) {
                    O75.LIZJ = new O75();
                }
            }
        }
        O75 o75 = O75.LIZJ;
        o75.getClass();
        if (!C48003Ish.LIZJ(C61359O6h.LJIILL)) {
            C1DJ.LJIJJ(" network is unavailable, requesting data is impossible");
            return;
        }
        if (System.currentTimeMillis() - o75.LIZ > o75.LIZIZ) {
            long currentTimeMillis = System.currentTimeMillis();
            o75.LIZ = currentTimeMillis;
            Future submit = C61359O6h.LJ.submit(new O78());
            try {
                JSONObject jSONObject = new JSONObject();
                O80 o80 = (O80) submit.get(30L, TimeUnit.SECONDS);
                if (o80 != null && o80.LIZIZ && o80.LIZ != null) {
                    O79.LIZIZ().LJFF(true);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject optJSONObject = o80.LIZ.optJSONObject("data");
                    if (optJSONObject == null) {
                        return;
                    }
                    boolean optBoolean = optJSONObject.optBoolean("no_change_show_list", false);
                    HashMap<String, Object> hashMap = new HashMap<>(1);
                    HashMap<String, Object> hashMap2 = new HashMap<>(1);
                    hashMap2.put("log_extra", O7I.LIZIZ().LIZJ());
                    if (optBoolean) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    hashMap.put("status", Integer.valueOf(i2));
                    O79.LIZIZ().LJI(null, 84378473382L, "update_local_data", hashMap2, hashMap);
                    if (optBoolean) {
                        return;
                    }
                    long optLong = optJSONObject.optLong("leave_interval", 300L) * 1000;
                    long optLong2 = optJSONObject.optLong("splash_interval", 1800L) * 1000;
                    o75.LIZIZ = optJSONObject.optLong("splash_load_interval", 20L) * 1000;
                    long optLong3 = optJSONObject.optLong("cold_boot_interval", 0L) * 1000;
                    String optString = optJSONObject.optString("log_extra", "{}");
                    long optLong4 = optJSONObject.optLong("server_time", 0L);
                    O76.LJI().LJIIJJI(optLong4);
                    String optString2 = optJSONObject.optString("period_first_map");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                    if (optJSONArray != null && optJSONArray.length() == 2) {
                        long j = JSONArrayProtectorUtils.getLong(optJSONArray, 0) * 1000;
                        long j2 = JSONArrayProtectorUtils.getLong(optJSONArray, 1) * 1000;
                        O7I LIZIZ = O7I.LIZIZ();
                        if (j > 0) {
                            LIZIZ.LJ = j;
                        } else {
                            LIZIZ.getClass();
                        }
                        O7I LIZIZ2 = O7I.LIZIZ();
                        if (j2 > 0) {
                            LIZIZ2.LJFF = j2;
                        } else {
                            LIZIZ2.getClass();
                        }
                    } else if (optJSONArray == null) {
                        optJSONArray = new JSONArray();
                    }
                    int optInt = optJSONObject.optInt("show_limit", 0);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (!C61359O6h.LJJJJ || optLong4 == 0 || (C61359O6h.LJJJJI / 100) % 10 == 1) {
                        optLong4 = currentTimeMillis3;
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("preload_feed_ads");
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashMap.put("failed_type", 1);
                            O79.LIZIZ().LJI(null, 84378473382L, "topview_data_got_failed", hashMap2, hashMap);
                        } else {
                            O79.LIZIZ().LJI(null, 84378473382L, "topview_data_got_succeed", hashMap2, hashMap);
                        }
                        if (C61359O6h.LJJIIZI != null) {
                            C10K.LIZJ(new ACallableS80S0101000_9(0, optJSONArray3, 0));
                        }
                    } else {
                        hashMap.put("failed_type", 2);
                        O79.LIZIZ().LJI(null, 84378473382L, "topview_data_got_failed", hashMap2, hashMap);
                    }
                    if (optJSONArray2 == null) {
                        optJSONArray2 = new JSONArray();
                    }
                    C1DJ.LJIJJ(" parsing preloaded data success ");
                    O7I LIZIZ3 = O7I.LIZIZ();
                    List<O7E> LIZ = O77.LIZ(optJSONArray2, optLong4, false);
                    long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis;
                    if (C61359O6h.LJJJJJ != null) {
                        O8W.LIZJ("service_splash_ad_status_listener", "duration_on_parse_splash_ad_finished", new O8B(LIZ));
                    }
                    O79.LIZIZ().LJ(((ArrayList) LIZ).isEmpty());
                    List<O7E> list = LIZIZ3.LIZ;
                    if (C61359O6h.LJJIJLIJ) {
                        List<O7E> LJI = O77.LJI(LIZIZ3.LIZIZ, LIZ);
                        JSONArray LJIILJJIL = O77.LJIILJJIL(LJI);
                        LIZIZ3.LIZIZ = LJI;
                        O76 LJI2 = O76.LJI();
                        LJI2.LIZJ.LJI("splash_ad_first_show_data", LJIILJJIL.toString());
                        LJI2.LIZJ();
                        if (!O76.LJI().LJFF()) {
                            if (!C30591Hz.LJIILLIIL(list)) {
                                Iterator<O7E> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    O7E next = it.next();
                                    if (next.LLII == 1 && next.LJIIL()) {
                                        O75.LJIIIIZZ(next);
                                        break;
                                    }
                                }
                            }
                            O75.LJIIIIZZ(null);
                        }
                    }
                    if (!C30591Hz.LJIILLIIL(LIZ)) {
                        o7e = (O7E) ListProtector.get(LIZ, 0);
                        z = false;
                    } else {
                        o7e = null;
                        z = true;
                    }
                    if (!C30591Hz.LJIILLIIL(list)) {
                        o7e2 = (O7E) ListProtector.get(list, 0);
                    } else {
                        o7e2 = null;
                    }
                    O75.LJIIJJI(o7e, o7e2);
                    LIZIZ3.LIZ = LIZ;
                    LIZIZ3.LIZLLL = optLong;
                    LIZIZ3.LIZJ = optLong2;
                    LIZIZ3.LJI = optLong3;
                    LIZIZ3.LJIIJJI = optString;
                    LIZIZ3.LJIIIZ = C48473J0r.LIZ(optString2);
                    C61359O6h.LJJ = true;
                    O76 LJI3 = O76.LJI();
                    LJI3.LIZJ.LJFF(optLong, "splash_ad_leave_interval");
                    LJI3.LIZJ.LJ(optInt, "splash_ad_show_limit");
                    LJI3.LIZJ.LJFF(optLong2, "splash_ad_splash_interval");
                    LJI3.LIZJ.LJFF(optLong3, "splash_ad_cold_launch_interval");
                    LJI3.LJIILIIL(optJSONArray2.toString());
                    LJI3.LIZJ.LJI("key_splash_ad_penalty_period", optJSONArray.toString());
                    LJI3.LIZJ.LIZ.LIZIZ.putBoolean("key_splash_ad_empty", z);
                    LJI3.LIZJ.LJI("key_empty_log_extra_substitute", optString);
                    LJI3.LIZJ.LJI("key_splash_ad_time_period_map", optString2);
                    LJI3.LIZJ.LIZ.LIZIZ.remove("key_splash_show_times_map");
                    LJI3.LIZJ();
                    C61359O6h.LJJI = true;
                    O75.LJIILL(LIZ);
                    jSONObject.put("durarion_ad_request_total_times", currentTimeMillis2 - currentTimeMillis);
                    jSONObject.put("duration_ad_parse_finish_total_time", currentTimeMillis4 - currentTimeMillis);
                    O75.LJIILIIL(LIZ);
                    if (C48003Ish.LIZJ(C61359O6h.LJIILL)) {
                        C30591Hz.LJIILLIIL(LIZ);
                    }
                    if (C61359O6h.LJJJIL) {
                        C61357O6f.LIZIZ().LJ();
                    }
                    C61357O6f.LIZIZ().getClass();
                    String LIZLLL = C61359O6h.LIZLLL();
                    if (!C78886Uxe.LJJIIZI(LIZLLL)) {
                        C61357O6f.LIZJ(LIZLLL, false);
                    }
                    if (!TextUtils.isEmpty(null)) {
                        C61357O6f.LIZJ(null, true);
                    }
                    i = 0;
                } else {
                    i = 0;
                    O79.LIZIZ().LJFF(false);
                    C1DJ.LJIJJ(" request failed or request success with empty response ");
                }
                O8O.LIZLLL().LJII("service_ad_request_status", i, jSONObject, null);
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                O79.LIZIZ().LJFF(false);
                C1DJ.LJIIIZ(0L, " request failed, maybe there is an exception", e);
                O8O.LIZLLL().LIZ(e, "key_exception_request");
                return;
            }
        }
        C1DJ.LJIJJ(" too short to request ");
    }

    public ARunnableS17S0000000_10(int i) {
        this.$t = i;
    }

    public static final void run$0(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            C60498Nok LIZ2 = C60297NlV.LIZLLL.LIZ();
            if (LIZ2 != null) {
                if (!LIZ2.LIZIZ.isEmpty()) {
                    LIZ2.LIZIZ(LIZ2.LJ.remove(LIZ2.LIZIZ.pop()));
                } else {
                    InterfaceC60493Nof LIZ3 = LIZ2.LIZ();
                    if (LIZ3 != null) {
                        LIZ3.LJIJJLI();
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            OL3.LJ("init fail");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            OL5 LIZIZ = OL1.LIZIZ(OL1.LIZIZ);
            if (LIZIZ != null && !LIZIZ.LJIIJJI) {
                LIZIZ.LJIIJJI = true;
                try {
                    ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS16S0000000_9(5));
                } catch (Throwable unused) {
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        InterfaceC59245NMz LJI;
        try {
            IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
            if (LJJIJLIJ != null && (LJI = LJJIJLIJ.LJI()) != null) {
                LJI.hide();
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$13(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            for (int i : C63312Ot2.LIZLLL()) {
                C63276OsS c63276OsS = new C63276OsS();
                C63502Ow6 build = new C63501Ow5().build();
                C89453Z8v c89453Z8v = new C89453Z8v();
                c89453Z8v.LJJIFFI = build;
                c63276OsS.LJIIJJI(i, c89453Z8v.build(), null, new Object[0]);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            Handler handler = C60030NhC.LJIIIIZZ;
            if (handler != null) {
                handler.post(C60030NhC.LJIIIZ);
                C60030NhC.LJIIIIZZ.postDelayed(C60030NhC.LJIIJ, 200L);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            C63081OpJ.LLJLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            C1DJ.LJJJ("clear splash ad data");
            JSONArray jSONArray = new JSONArray();
            O76 LJI = O76.LJI();
            LJI.LJIILIIL(jSONArray.toString());
            LJI.LIZJ.LJI("splash_ad_first_show_data", jSONArray.toString());
            LJI.LIZJ();
        } finally {
            try {
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public static final void run$5(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            C61359O6h.LJFF.submit(new ARunnableS17S0000000_10(5));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            aRunnableS17S0000000_10.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        InterfaceC59245NMz LJI;
        try {
            IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
            if (LJJIJLIJ != null && (LJI = LJJIJLIJ.LJI()) != null) {
                LJI.show();
            }
        } catch (Throwable unused) {
        }
    }

    public static final void run$9(ARunnableS17S0000000_10 aRunnableS17S0000000_10) {
        boolean LIZ;
        try {
            OL5 LIZIZ = OL1.LIZIZ(OL1.LIZIZ);
            if (LIZIZ != null) {
                LIZIZ.LJIIL = true;
                try {
                    DataCenter dataCenter = LIZIZ.LJIIIZ;
                    if (dataCenter != null) {
                        dataCenter.jv0(Boolean.TRUE, "AD_ACTION_MOVE_IN_DESC");
                    }
                } catch (Throwable unused) {
                }
                OL2.LJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
