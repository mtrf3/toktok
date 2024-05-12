package X;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.agilelogger.ALog;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class PKT {
    public final CrashType LIZ;
    public final Context LIZIZ;
    public final ICommonParams LIZJ = PK0.LIZIZ().LIZIZ;
    public final C64269PKf LIZLLL;
    public final C47949Irp LJ;

    public PKN LIZ(PKN pkn) {
        return pkn;
    }

    public void LIZJ() {
    }

    public PKN LIZIZ(int i, PKN pkn) {
        String str;
        int i2;
        if (pkn == null) {
            pkn = new PKN();
        }
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 5 && (!(this instanceof C64285PKv))) {
                        PKN.LJIJJLI(pkn.LIZ, PIW.LIZ());
                    }
                } else {
                    C64257PJt LIZIZ = PK0.LIZIZ();
                    LIZIZ.getClass();
                    try {
                        str = LIZIZ.LIZIZ.getSessionId();
                    } catch (Throwable unused) {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        pkn.LJIIJJI("session_id", str);
                    }
                    C47949Irp c47949Irp = this.LJ;
                    if (c47949Irp == null) {
                        i2 = 0;
                    } else {
                        i2 = c47949Irp.LIZ;
                    }
                    pkn.LJIIJJI("battery", Integer.valueOf(i2));
                    if (PKB.LIZJ().LIZ == null && (PKG.LIZJ == null || !ALog.isInitSuccess())) {
                        z = false;
                    }
                    pkn.LJFF("alog_inited", String.valueOf(z));
                }
            } else {
                if (!C64264PKa.LJII(PK0.LIZ)) {
                    pkn.LJIIJJI("remote_process", 1);
                }
                pkn.LJIIJJI("pid", Integer.valueOf(Process.myPid()));
                pkn.LJIILL(PK0.LIZJ, PK0.LIZLLL);
                C64269PKf c64269PKf = this.LIZLLL;
                if (c64269PKf != null) {
                    JSONObject jSONObject = new JSONObject();
                    PJC.LJIIJ(jSONObject, "last_create_activity", C64269PKf.LIZ(c64269PKf.LJII, c64269PKf.LJI));
                    PJC.LJIIJ(jSONObject, "last_start_activity", C64269PKf.LIZ(c64269PKf.LJIIIZ, c64269PKf.LJIIIIZZ));
                    PJC.LJIIJ(jSONObject, "last_resume_activity", C64269PKf.LIZ(c64269PKf.LJIIJJI, c64269PKf.LJIIJ));
                    PJC.LJIIJ(jSONObject, "last_pause_activity", C64269PKf.LIZ(c64269PKf.LJIILIIL, c64269PKf.LJIIL));
                    PJC.LJIIJ(jSONObject, "last_stop_activity", C64269PKf.LIZ(c64269PKf.LJIILL, c64269PKf.LJIILJJIL));
                    PJC.LJIIJ(jSONObject, "alive_activities", c64269PKf.LIZJ(c64269PKf.LIZ, c64269PKf.LIZIZ));
                    PJC.LJIIJ(jSONObject, "finish_activities", c64269PKf.LIZJ(c64269PKf.LIZJ, c64269PKf.LIZLLL));
                    pkn.LJIIJJI("activity_trace", jSONObject);
                    JSONArray LIZIZ2 = c64269PKf.LIZIZ();
                    JSONObject optJSONObject = pkn.LIZ.optJSONObject("custom_long");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                        pkn.LJIIJJI("custom_long", optJSONObject);
                    }
                    PJC.LJIIJ(optJSONObject, "activity_track", LIZIZ2);
                }
                try {
                    pkn.LJIJI(this.LIZJ.getPatchInfo());
                } catch (Throwable th) {
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Code err:\n");
                        LIZ.append(PKW.LIZJ(th));
                        pkn.LJIJI(Collections.singletonList(X1D.LIZIZ(LIZ)));
                    } catch (Throwable unused2) {
                    }
                }
                String str2 = PK0.LJ;
                if (str2 != null) {
                    pkn.LJIIJJI("business", str2);
                }
                pkn.LJIIJJI("is_background", Boolean.valueOf(C64264PKa.LJI(this.LIZIZ)));
                List<AttachUserData> attachUserData = PK0.LJIIIZ.getAttachUserData(this.LIZ);
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject2 = pkn.LIZ.optJSONObject("custom");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    pkn.LJIIJJI("custom", optJSONObject2);
                }
                if (attachUserData != null) {
                    for (int i3 = 0; i3 < attachUserData.size(); i3++) {
                        try {
                            AttachUserData attachUserData2 = (AttachUserData) ListProtector.get(attachUserData, i3);
                            long uptimeMillis = SystemClock.uptimeMillis();
                            PKN.LJIILJJIL(attachUserData2.getUserData(this.LIZ), optJSONObject2);
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("custom_cost_");
                            LIZ2.append(attachUserData2.getClass().getName());
                            LIZ2.append("_");
                            LIZ2.append(hashMap.size());
                            hashMap.put(X1D.LIZIZ(LIZ2), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                        } catch (Throwable th2) {
                            PKN.LJIIL(th2, optJSONObject2);
                        }
                    }
                }
                PJC.LJIIJ(optJSONObject2, "fd_count", Integer.valueOf(NativeTools.LJIILJJIL().LJIJ()));
                for (Map.Entry entry : hashMap.entrySet()) {
                    PJC.LJIIJ(optJSONObject2, (String) entry.getKey(), entry.getValue());
                }
                List<InterfaceC64299PLj> userCrashInfoCallback = PK0.LJIIIZ.getUserCrashInfoCallback(this.LIZ);
                HashMap hashMap2 = new HashMap();
                JSONObject jSONObject2 = pkn.LIZ;
                JSONObject optJSONObject3 = jSONObject2.optJSONObject("custom");
                if (optJSONObject3 == null) {
                    optJSONObject3 = new JSONObject();
                    pkn.LJIIJJI("custom", optJSONObject3);
                }
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.putOpt("tid", Integer.valueOf(jSONObject2.optInt("tid")));
                } catch (Throwable unused3) {
                }
                if (userCrashInfoCallback != null) {
                    for (int i4 = 0; i4 < userCrashInfoCallback.size(); i4++) {
                        try {
                            InterfaceC64299PLj interfaceC64299PLj = (InterfaceC64299PLj) ListProtector.get(userCrashInfoCallback, i4);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            PKN.LJIILJJIL(interfaceC64299PLj.LIZ(jSONObject3), optJSONObject3);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("custom_cost_");
                            LIZ3.append(interfaceC64299PLj.getClass().getName());
                            LIZ3.append("_");
                            LIZ3.append(hashMap2.size());
                            hashMap2.put(X1D.LIZIZ(LIZ3), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                        } catch (Throwable th3) {
                            PKN.LJIIL(th3, optJSONObject3);
                        }
                    }
                }
                for (Map.Entry entry2 : hashMap2.entrySet()) {
                    PJC.LJIIJ(optJSONObject3, (String) entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            HashMap hashMap3 = new HashMap();
            try {
                PKU pku = PK0.LJIIIZ;
                java.util.Map<String, String> tagMap = pku.getTagMap();
                if (tagMap != null) {
                    hashMap3.putAll(tagMap);
                }
                java.util.Map<String, String> importTagMap = pku.getImportTagMap();
                if (importTagMap != null) {
                    hashMap3.putAll(importTagMap);
                }
            } catch (Exception unused4) {
            }
            pkn.LJIILLIIL(hashMap3);
            int i5 = PK0.LJIILL;
            String str3 = PK0.LJIILLIIL;
            PJC.LJIIJ(pkn.LIZ, "miniapp_id", Integer.valueOf(i5));
            PJC.LJIIJ(pkn.LIZ, "miniapp_version", str3);
            if (PK0.LJFF) {
                pkn.LJIIJJI("is_mp", 1);
            }
            pkn.LJIJJ(this.LIZJ);
            ConcurrentHashMap<Integer, String> concurrentHashMap = PK0.LJIIJ;
            if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                JSONObject jSONObject4 = new JSONObject();
                for (Integer num : concurrentHashMap.keySet()) {
                    PJC.LJIIJ(jSONObject4, String.valueOf(num), concurrentHashMap.get(num));
                }
                PJC.LJIIJ(pkn.LIZ, "sdk_info", jSONObject4);
            }
            pkn.LJIIJJI("inner_sdk", PK0.LJIIJJI);
            pkn.LJIIJJI("process_name", C64264PKa.LIZJ(PK0.LIZ));
        }
        return pkn;
    }

    public PKT(CrashType crashType, Context context, C64269PKf c64269PKf, C47949Irp c47949Irp) {
        this.LIZ = crashType;
        this.LIZIZ = context;
        this.LIZLLL = c64269PKf;
        this.LJ = c47949Irp;
    }
}
