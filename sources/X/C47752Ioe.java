package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttm.player.u;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ioe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47752Ioe {
    public static volatile String LJLI = "unknown";
    public static volatile String LJLIIIL = "unknown";
    public static C47906Ir8 LJLIIL;
    public static String LJLIL;
    public final InterfaceC46858IaE LIZ;
    public C47583Ilv LIZIZ;
    public WeakReference<InterfaceC47584Ilw> LIZJ;
    public String LIZLLL;
    public ArrayList<String> LJII;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJLI;
    public String LJIL;
    public int LJJ;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public String LJJJIL;
    public String LJJJJ;
    public float LJJJJJ;
    public float LJJJJJL;
    public float LJJJJL;
    public java.util.Map LJJJJLL;
    public InterfaceC47616ImS LJJJJZ;
    public final Context LJJJLIIL;
    public boolean LJJL;
    public boolean LJJLI;
    public boolean LJJLIIIIJ;
    public final C47782Ip8 LJJLIIIJILLIZJL;
    public final C47782Ip8 LJJLIIIJJI;
    public int LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public java.util.Map LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public int LJJLIL;
    public int LJJLJ;
    public int LJJLJLI;
    public java.util.Map<String, Object> LJJLL;
    public int LJJZ;
    public boolean LJJZZI;
    public java.util.Map LJJZZIII;
    public int LJL;
    public String LJ = "";
    public String LJFF = "";
    public String LJI = "";
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public String LJIIL = "";
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public String LJIJJ = "";
    public String LJJI = "";
    public String LJJIFFI = "";
    public String LJJII = "";
    public int LJJIIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public long LJJIIZI = -2147483648L;
    public String LJJIJ = "";
    public String LJJIJIIJI = "";
    public int LJJIJIIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJIL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJIJL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJJIJLIJ = "";
    public String LJJIL = "";
    public String LJJIZ = "";
    public String LJJJ = "";
    public int LJJJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LJJJJI = LiveLayoutPreloadThreadPriority.DEFAULT;
    public String LJJJJIZL = "";
    public String LJJJJLI = "";
    public String LJJJJZI = "";
    public String LJJJLL = "";
    public String LJJJLZIJ = "";
    public String LJJJZ = "";
    public volatile int LJJLIIIJ = -1;

    public static String LIZ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "excellent" : "good" : "medium" : "weak";
    }

    public static String LIZIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "5G" : "3G" : "2G" : "4G" : "WIFI";
    }

    public static String LJIIIZ() {
        C47906Ir8 c47906Ir8;
        if (LJLI.equals("unknown") && (c47906Ir8 = LJLIIL) != null) {
            LJLI = LIZIZ(c47906Ir8.LIZ);
        }
        return LJLI;
    }

    public final float LIZLLL() {
        Context context;
        float f = -1.0f;
        if (!this.LJJLI || (context = this.LJJJLIIL) == null) {
            return -1.0f;
        }
        try {
            if (C47795IpL.LJI == null) {
                C47795IpL.LJI = Class.forName("d5b.c");
            }
            if (C47795IpL.LJII == null) {
                C47795IpL.LJII = C47795IpL.LJI.getMethod("getGalvanicNow", Context.class);
            }
            f = ((Float) C47795IpL.LJII.invoke(null, context)).floatValue();
            return f;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("startThorMonitor failed:");
            LIZ.append(e);
            TTVideoEngineLog.d("DeviceMonitorUtils", X1D.LIZIZ(LIZ));
            return f;
        }
    }

    public final double LJ() {
        Object invoke;
        Double valueOf;
        double d = -1.0d;
        if (!this.LJJLI) {
            return -1.0d;
        }
        try {
            if (C47795IpL.LIZ == null) {
                C47795IpL.LIZ = Class.forName("com.bytedance.apm6.cpu.ApmCpuManager");
            }
            if (C47795IpL.LIZJ == null) {
                C47795IpL.LIZJ = C47795IpL.LIZ.getMethod("getInstance", new Class[0]);
            }
            if (C47795IpL.LJ == null) {
                C47795IpL.LJ = C47795IpL.LIZ.getMethod("getCpuRate", new Class[0]);
            }
            Object invoke2 = C47795IpL.LIZJ.invoke(null, new Object[0]);
            if (invoke2 == null || (invoke = C47795IpL.LJ.invoke(invoke2, new Object[0])) == null || (valueOf = Double.valueOf(CastDoubleProtector.parseDouble(invoke.toString()))) == null) {
                return -1.0d;
            }
            d = valueOf.doubleValue();
            return d;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCPURate:");
            LIZ.append(e);
            TTVideoEngineLog.d("DeviceMonitorUtils", X1D.LIZIZ(LIZ));
            return d;
        }
    }

    public final double LJFF() {
        Object invoke;
        Double valueOf;
        double d = -1.0d;
        if (!this.LJJLI) {
            return -1.0d;
        }
        try {
            if (C47795IpL.LIZ == null) {
                C47795IpL.LIZ = Class.forName("com.bytedance.apm6.cpu.ApmCpuManager");
            }
            if (C47795IpL.LIZJ == null) {
                C47795IpL.LIZJ = C47795IpL.LIZ.getMethod("getInstance", new Class[0]);
            }
            if (C47795IpL.LJFF == null) {
                C47795IpL.LJFF = C47795IpL.LIZ.getMethod("getCpuSpeed", new Class[0]);
            }
            Object invoke2 = C47795IpL.LIZJ.invoke(null, new Object[0]);
            if (invoke2 == null || (invoke = C47795IpL.LJFF.invoke(invoke2, new Object[0])) == null || (valueOf = Double.valueOf(CastDoubleProtector.parseDouble(invoke.toString()))) == null) {
                return -1.0d;
            }
            d = valueOf.doubleValue();
            return d;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCPUSpeed:");
            LIZ.append(e);
            TTVideoEngineLog.d("DeviceMonitorUtils", X1D.LIZIZ(LIZ));
            return d;
        }
    }

    public final HashMap<String, Object> LJI() {
        Context context;
        Intent LJJLIIIJILLIZJL;
        int i;
        if (!this.LJJLI || (context = this.LJJJLIIL) == null || (LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, context, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return null;
        }
        int intExtra = LJJLIIIJILLIZJL.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            i = 1;
        } else {
            i = 0;
        }
        int intExtra2 = LJJLIIIJILLIZJL.getIntExtra("plugged", -1);
        int intExtra3 = (LJJLIIIJILLIZJL.getIntExtra("level", -1) * 100) / LJJLIIIJILLIZJL.getIntExtra("scale", -1);
        HashMap<String, Object> hashMap = new HashMap<>(3);
        hashMap.put("isCharging", Integer.valueOf(i));
        hashMap.put("chargePlug", Integer.valueOf(intExtra2));
        hashMap.put("power", Integer.valueOf(intExtra3));
        return hashMap;
    }

    public final C47626Imc LJII() {
        if (!this.LJJLI) {
            return null;
        }
        C47626Imc c47626Imc = new C47626Imc();
        try {
            if (C47795IpL.LIZ == null) {
                C47795IpL.LIZ = Class.forName("com.bytedance.apm6.cpu.ApmCpuManager");
            }
            if (C47795IpL.LIZJ == null) {
                C47795IpL.LIZJ = C47795IpL.LIZ.getMethod("getInstance", new Class[0]);
            }
            if (C47795IpL.LIZLLL == null) {
                C47795IpL.LIZLLL = C47795IpL.LIZ.getMethod("getCurrentCpuRate", new Class[0]);
            }
            if (C47795IpL.LIZIZ == null) {
                C47795IpL.LIZIZ = Class.forName("oy0.a");
            }
            Object invoke = C47795IpL.LIZJ.invoke(null, new Object[0]);
            if (invoke != null) {
                Object invoke2 = C47795IpL.LIZLLL.invoke(invoke, new Object[0]);
                if (invoke2 != null && C47795IpL.LIZIZ.isInstance(invoke2)) {
                    Field declaredField = C47795IpL.LIZIZ.getDeclaredField("cpuAppRate");
                    if (declaredField != null) {
                        c47626Imc.LIZ = declaredField.getDouble(invoke2);
                    }
                    Field declaredField2 = C47795IpL.LIZIZ.getDeclaredField("cpuAppSpeed");
                    if (declaredField2 != null) {
                        c47626Imc.LIZIZ = declaredField2.getDouble(invoke2);
                    }
                } else {
                    C78253UnR.LJI("DeviceMonitorUtils", "is not instance");
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCurrentCPUInfo:");
            LIZ.append(e);
            TTVideoEngineLog.d("DeviceMonitorUtils", X1D.LIZIZ(LIZ));
        }
        return c47626Imc;
    }

    public final JSONObject LJIIIIZZ() {
        String LJFF;
        if (this.LIZ == null) {
            return null;
        }
        synchronized (this) {
            LJFF = ((C47619ImV) this.LIZ).LJFF();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update mdl info: ");
        LIZ.append(LJFF);
        TTVideoEngineLog.d("VideoEventBase", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(LJFF)) {
            return null;
        }
        try {
            return new JSONObject(LJFF);
        } catch (JSONException e) {
            C78253UnR.LIZLLL("VideoEventBase", e.toString());
            return null;
        }
    }

    public final void LJIIJ() {
        if (this.LJJJLIIL != null) {
            synchronized ("VideoEventBase") {
                if (LJLIIL == null) {
                    C47906Ir8 LIZLLL = C47906Ir8.LIZLLL();
                    LJLIIL = LIZLLL;
                    LIZLLL.LJI(this.LJJJLIIL);
                }
                if (!C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 64L)) {
                    this.LIZIZ = new C47583Ilv(this);
                    WeakReference<InterfaceC47584Ilw> weakReference = new WeakReference<>(this.LIZIZ);
                    this.LIZJ = weakReference;
                    LJLIIL.LJII(weakReference);
                    LJLI = LIZIZ(LJLIIL.LIZ);
                    LJLIIIL = LIZ(LJLIIL.LIZIZ);
                }
            }
        }
    }

    public final void LJIIL() {
        boolean z;
        JSONObject LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null) {
            try {
                if (!LJIIIIZZ.isNull("audio")) {
                    this.LJJLIIIJJI.LIZ(JSONObjectProtectorUtils.getJSONObject(LJIIIIZZ, "audio"));
                    z = true;
                } else {
                    z = false;
                }
                if (!LJIIIIZZ.isNull("video")) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("found video: ");
                    LIZ.append(JSONObjectProtectorUtils.getJSONObject(LJIIIIZZ, "video").toString());
                    TTVideoEngineLog.d("VideoEventBase", X1D.LIZIZ(LIZ));
                    this.LJJLIIIJILLIZJL.LIZ(JSONObjectProtectorUtils.getJSONObject(LJIIIIZZ, "video"));
                } else if (!z) {
                    this.LJJLIIIJILLIZJL.LIZ(LJIIIIZZ);
                }
                if (!LJIIIIZZ.isNull("cur_task_num")) {
                    this.LJJLIIIJJIZ = ((Integer) LJIIIIZZ.get("cur_task_num")).intValue();
                }
                if (!LJIIIIZZ.isNull("conc_count")) {
                    this.LJJLIIIJL = ((Integer) LJIIIIZZ.get("conc_count")).intValue();
                }
                if (!LJIIIIZZ.isNull("mdl_preload_info")) {
                    this.LJJLIIIJLJLI = LJIIIIZZ.get("mdl_preload_info").toString();
                }
                if (!LJIIIIZZ.isNull("dns_type")) {
                    int intValue = ((Integer) LJIIIIZZ.get("dns_type")).intValue();
                    if (intValue != 0) {
                        if (intValue != 2) {
                            if (intValue != 3) {
                                if (intValue == 4) {
                                    InterfaceC46858IaE interfaceC46858IaE = this.LIZ;
                                    if (interfaceC46858IaE != null && ((C47619ImV) interfaceC46858IaE).LIZJ(85) == 1) {
                                        this.LJIJJ = "customDNSInnerByteDanceHTTPDNS";
                                    } else {
                                        this.LJIJJ = "customDNS";
                                    }
                                }
                            } else {
                                this.LJIJJ = "httpDNS_google";
                            }
                        } else {
                            this.LJIJJ = "httpDNS_own";
                        }
                    } else {
                        this.LJIJJ = "localDNS";
                    }
                }
                if (!LJIIIIZZ.isNull("mdl_features")) {
                    LJIILIIL(JSONObjectProtectorUtils.getJSONObject(LJIIIIZZ, "mdl_features"));
                }
            } catch (Exception e) {
                TTVideoEngineLog.d(e);
            }
        }
    }

    public final void LJIILJJIL() {
        TTVideoEngineImpl tTVideoEngineImpl;
        java.util.Map map;
        Object obj;
        Object obj2;
        long j;
        Object obj3;
        java.util.Map map2 = this.LJJJJLL;
        long j2 = 0;
        if (map2 != null) {
            if (this.LJJIIZ <= 0) {
                this.LJJIIZ = ((Integer) ((HashMap) map2).get("duration")).intValue() * 1000;
            }
            if (this.LJJIIZI <= 0) {
                Object obj4 = ((java.util.Map) ((HashMap) this.LJJJJLL).get("size")).get(this.LJJJ);
                if (obj4 != null) {
                    j = ((Number) obj4).longValue();
                } else {
                    j = 0;
                }
                java.util.Map map3 = (java.util.Map) ((HashMap) this.LJJJJLL).get("audio_size");
                if (map3 != null && map3.size() > 0 && this.LJJLIIIJ != -1 && (obj3 = map3.get(Integer.valueOf(this.LJJLIIIJ))) != null) {
                    j2 = ((Number) obj3).longValue();
                }
                this.LJJIIZI = j + j2;
            }
            if (TextUtils.isEmpty(this.LJJIJ)) {
                java.util.Map map4 = (java.util.Map) ((HashMap) this.LJJJJLL).get("codec");
                if (map4.get(this.LJJJ) == null) {
                    obj2 = "";
                } else {
                    obj2 = map4.get(this.LJJJ);
                }
                this.LJJIJ = (String) obj2;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("brian codec_type:");
                LIZ.append(this.LJJIJ);
                LIZ.append(", for resolution:");
                LIZ.append(this.LJJJ);
                LIZ.append(", quality desc:");
                JBR.LJIIIZ(LIZ, this.LJJJZ, LIZ, "VideoEventBase");
            }
            if (TextUtils.isEmpty(this.LJJIJLIJ) && (map = (java.util.Map) ((HashMap) this.LJJJJLL).get("vtype")) != null && (obj = map.get(this.LJJJ)) != null) {
                this.LJJIJLIJ = (String) obj;
            }
        }
        if (this.LIZ != null) {
            String str = this.LJ;
            if ((str == null || str.isEmpty()) && (tTVideoEngineImpl = ((C47619ImV) this.LIZ).LIZ.get()) != null) {
                HashMap hashMap = new HashMap();
                String LIZJ = u.LIZJ(14, "");
                int i = tTVideoEngineImpl.LJI;
                if (i == 0 || i == 1) {
                    hashMap.put("sv", "5.6");
                    InterfaceC47775Ip1 interfaceC47775Ip1 = tTVideoEngineImpl.LJ;
                    if (interfaceC47775Ip1 != null) {
                        String LIZIZ = interfaceC47775Ip1.LIZIZ(1095);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("playerLibName:");
                        LIZ2.append(LIZIZ);
                        C78253UnR.LJI("TTVideoEngine", X1D.LIZIZ(LIZ2));
                        if ("ttmplayerbeta" == LIZIZ) {
                            hashMap.put("pv", "3.0-beta");
                        } else {
                            hashMap.put("pv", "3.0");
                        }
                    } else {
                        hashMap.put("pv", "3.0");
                    }
                    hashMap.put("pc", LIZJ);
                    hashMap.put("sdk_version", "1.10.149.1-mt");
                } else if (i == 2) {
                    hashMap.put("sv", "5.6");
                    hashMap.put("pv", "1.0");
                    hashMap.put("pc", CardStruct.IStatusCode.DEFAULT);
                    hashMap.put("sdk_version", "1.10.149.1-mt");
                } else if (i == 5) {
                    hashMap.put("sv", "5.6");
                    hashMap.put("pv", "5.0");
                    hashMap.put("pc", "5");
                    hashMap.put("sdk_version", "1.10.149.1-mt");
                } else {
                    hashMap.put("sv", "5.6");
                    hashMap.put("pv", "4.0");
                    hashMap.put("pc", LIZJ);
                    hashMap.put("sdk_version", "1.10.149.1-mt");
                }
                hashMap.put("trv", "3.46.12");
                try {
                    hashMap.put("ffv", (String) Class.forName("com.ss.ttffmpeg.FFmpegLibLoaderWrapper").getMethod("getFFmpegVersion", new Class[0]).invoke(null, new Object[0]));
                } catch (Throwable th) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("get ffmpeg version error: ");
                    LIZ3.append(th.toString());
                    TTVideoEngineLog.w("TTVideoEngine", X1D.LIZIZ(LIZ3));
                }
                this.LJ = (String) hashMap.get("pv");
                this.LJFF = (String) hashMap.get("pc");
                this.LJI = (String) hashMap.get("sv");
                this.LJIIIIZZ = (String) hashMap.get("sdk_version");
                this.LJIIIZ = (String) hashMap.get("ffv");
                this.LJIIJ = (String) hashMap.get("vcnv");
                this.LJIIJJI = (String) hashMap.get("trv");
                this.LJIILIIL = (String) hashMap.get("abrv");
                this.LJIILJJIL = (String) hashMap.get("prdtv");
                this.LJIIL = (String) hashMap.get("prldv");
            }
            if (TextUtils.isEmpty(this.LJJIJ)) {
                this.LJJIJ = ((C47619ImV) this.LIZ).LJ(0);
            }
            if (TextUtils.isEmpty(this.LJJIJIIJI)) {
                this.LJJIJIIJI = ((C47619ImV) this.LIZ).LJ(146);
            }
            String LJ = ((C47619ImV) this.LIZ).LJ(37);
            if (!TextUtils.isEmpty(LJ)) {
                this.LJJJLL = LJ;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("video_type:");
            JBR.LJIIIZ(LIZ4, this.LJJIJLIJ, LIZ4, "VideoEventBase");
            if (TextUtils.isEmpty(this.LJJIJLIJ)) {
                String LJ2 = ((C47619ImV) this.LIZ).LJ(65);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("get video_type from player:");
                LIZ5.append(LJ2);
                C78253UnR.LJI("VideoEventBase", X1D.LIZIZ(LIZ5));
                if (!TextUtils.isEmpty(LJ2)) {
                    if (LJ2.indexOf("mp4") > 0) {
                        this.LJJIJLIJ = "mp4";
                    } else {
                        int indexOf = LJ2.indexOf(",");
                        if (indexOf < 0) {
                            this.LJJIJLIJ = LJ2;
                        } else {
                            this.LJJIJLIJ = LJ2.substring(0, indexOf);
                        }
                    }
                }
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("video_size :");
            LIZ6.append(this.LJJIIZI);
            C78253UnR.LJI("VideoEventBase", X1D.LIZIZ(LIZ6));
            if (this.LJJIIZI <= 0) {
                this.LJJIIZI = ((C47619ImV) this.LIZ).LIZLLL(66);
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("get video_size from player:");
                LIZ7.append(this.LJJIIZI);
                C78253UnR.LJI("VideoEventBase", X1D.LIZIZ(LIZ7));
            }
            this.LJJIJIL = ((C47619ImV) this.LIZ).LIZJ(24);
            this.LJJIJIIJIL = ((C47619ImV) this.LIZ).LIZJ(25);
            switch (this.LJJIJIL) {
                case 2:
                    this.LJJIII = 1;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.LJJIII = 0;
                    break;
            }
            this.LJJIJL = ((C47619ImV) this.LIZ).LIZJ(49);
        }
    }

    public final void LJIIJJI(InterfaceC47616ImS interfaceC47616ImS) {
        Object obj;
        List<C47160If6> LIZLLL;
        if (interfaceC47616ImS == null) {
            return;
        }
        this.LJJJJZ = interfaceC47616ImS;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (interfaceC47616ImS.LIZ() && (LIZLLL = interfaceC47616ImS.LIZLLL()) != null && LIZLLL.size() > 0) {
            int i = 0;
            for (C47160If6 c47160If6 : LIZLLL) {
                int LIZ = c47160If6.LIZ();
                long LJIIIIZZ = c47160If6.LJIIIIZZ(12);
                String LIZIZ = c47160If6.LIZIZ(8);
                int LIZLLL2 = c47160If6.LIZLLL(3);
                String enumC47176IfM = c47160If6.getResolution().toString(LIZ);
                String LIZIZ2 = c47160If6.LIZIZ(6);
                hashMap.put(enumC47176IfM, Long.valueOf(LJIIIIZZ));
                hashMap3.put(enumC47176IfM, LIZIZ);
                hashMap4.put(enumC47176IfM, Integer.valueOf(LIZLLL2));
                hashMap5.put(Integer.valueOf(c47160If6.LIZLLL(3)), c47160If6.LIZIZ(15));
                hashMap6.put(Integer.valueOf(c47160If6.LIZLLL(3)), Integer.valueOf(i));
                hashMap7.put(enumC47176IfM, LIZIZ2);
                if (LIZ == 1) {
                    arrayList.add(Integer.valueOf(c47160If6.LIZLLL(3)));
                } else {
                    arrayList2.add(Integer.valueOf(c47160If6.LIZLLL(3)));
                }
                if (this.LJJL) {
                    StringBuilder LIZ2 = C06830Op.LIZ("setVideoInfo i:", i, ", resolution:", enumC47176IfM, ", size:");
                    C65232Piu.LIZLLL(LIZ2, LJIIIIZZ, ",codec_type:", LIZIZ);
                    LIZ2.append(", bitrate:");
                    LIZ2.append(LIZLLL2);
                    C78253UnR.LJI("VideoEventBase", X1D.LIZIZ(LIZ2));
                }
                i++;
                int LIZLLL3 = c47160If6.LIZLLL(42);
                if (LIZ == 1 && ("dash".equals(LIZIZ2) || "bash".equals(LIZIZ2))) {
                    hashMap2.put(Integer.valueOf(LIZLLL3), Long.valueOf(LJIIIIZZ));
                }
            }
        }
        HashMap hashMap8 = new HashMap();
        String LJ = interfaceC47616ImS.LJ();
        hashMap8.put("duration", Integer.valueOf(interfaceC47616ImS.LJII(3)));
        hashMap8.put("size", hashMap);
        hashMap8.put("audio_size", hashMap2);
        hashMap8.put("codec", hashMap3);
        hashMap8.put("vtype", hashMap7);
        hashMap8.put("dynamic_type", LJ);
        hashMap8.put("bitrate", hashMap4);
        hashMap8.put("fileKey", hashMap5);
        hashMap8.put("bitrateMapTable", hashMap6);
        hashMap8.put("audio_bitrate", arrayList);
        hashMap8.put("video_bitrate", arrayList2);
        this.LJJJJLL = hashMap8;
        if (!TextUtils.isEmpty(this.LJJJ) && (obj = hashMap4.get(this.LJJJ)) != null) {
            this.LJJJI = ((Integer) obj).intValue();
        }
        this.LJJIL = LJ;
    }

    public final void LJIILIIL(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                int i = JSONObjectProtectorUtils.getInt(jSONObject, next);
                hashMap.put(next, Integer.valueOf(i));
                if (this.LJL == -1 && next.equals("mdl_p2p_loader")) {
                    this.LJL = i;
                }
            }
        } catch (JSONException e) {
            TTVideoEngineLog.d(e);
        }
        if (!hashMap.isEmpty()) {
            this.LJJZZIII = hashMap;
        }
    }

    public final void LIZJ(String str, String str2) {
        java.util.Map map;
        Object obj;
        this.LJJIZ = str2;
        this.LJJJ = str;
        java.util.Map map2 = this.LJJJJLL;
        if (map2 == null || (map = (java.util.Map) ((HashMap) map2).get("bitrate")) == null || (obj = map.get(this.LJJJ)) == null) {
            return;
        }
        this.LJJJI = ((Integer) obj).intValue();
    }

    public C47752Ioe(InterfaceC46858IaE interfaceC46858IaE, boolean z, Context context) {
        this.LJJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIII = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIIJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJIIJZLJL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJJIL = "";
        this.LJJJJ = "";
        this.LJJJJJ = Float.MIN_VALUE;
        this.LJJJJJL = Float.MIN_VALUE;
        this.LJJJJL = Float.MIN_VALUE;
        C47782Ip8 c47782Ip8 = new C47782Ip8();
        this.LJJLIIIJILLIZJL = c47782Ip8;
        C47782Ip8 c47782Ip82 = new C47782Ip8();
        this.LJJLIIIJJI = c47782Ip82;
        this.LJJLIIIJJIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJLIIIJL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJLIIIJLJLI = "";
        this.LJJLIIIJLLLLLLLZ = null;
        this.LJJLIL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJLL = null;
        this.LJJZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LJJZZIII = null;
        this.LJL = -1;
        this.LIZ = interfaceC46858IaE;
        this.LJIILL = C78966Uyw.LJJII(null);
        this.LJJZZI = z;
        this.LJJJLIIL = context;
        this.LJJ = 0;
        this.LJJIII = 0;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = 0;
        this.LJJJIL = "default";
        this.LJJJJ = "default";
        this.LJJJJJ = 1.0f;
        this.LJJJJJL = 1.0f;
        this.LJJJJL = 1.0f;
        c47782Ip8.LIZ = 0;
        c47782Ip82.LIZ = 0;
    }
}
