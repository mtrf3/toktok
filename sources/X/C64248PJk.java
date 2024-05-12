package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PJk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64248PJk {
    public static volatile C64248PJk LIZIZ;
    public final Context LIZ;

    public static void LIZ(String str, List list) {
        if (new C03880Dg(2).LIZJ(10302, "com/bytedance/crash/alog/AlogUploadManager", "uploadAlog", PKB.class, new Object[]{list, str}, "java.lang.String", new C65300Pk0(false, "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;", "4496611804595803929")).LIZ) {
            return;
        }
        PKB.LIZLLL(str, list);
    }

    public static C64248PJk LIZIZ() {
        if (LIZIZ == null) {
            LIZIZ = new C64248PJk(PK0.LIZ);
        }
        return LIZIZ;
    }

    public C64248PJk(Context context) {
        this.LIZ = context;
    }

    public final void LJ(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String LJFF = C63986P9i.LJFF(C63986P9i.LJI(), jSONObject.optJSONObject("header"));
            File LJIJJLI = C78596Usy.LJIJJLI(this.LIZ);
            String LJ = PK0.LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dart_");
            LIZ.append(LJ);
            File file = new File(LJIJJLI, X1D.LIZIZ(LIZ));
            PK8.LJIILIIL(file, file.getName(), LJFF, jSONObject);
            jSONObject.put("upload_scene", "direct");
            if (C63986P9i.LJIIIIZZ(LJFF, jSONObject.toString()).LIZ()) {
                PK8.LIZJ(file);
            }
        } catch (Throwable unused) {
            C78685UuP.LJLIL();
        }
    }

    public final void LJI(JSONObject jSONObject) {
        if (PJC.LJII(jSONObject)) {
            return;
        }
        try {
            String LJFF = C63986P9i.LJFF(C63986P9i.LJI(), jSONObject.optJSONObject("header"));
            File LJIJJLI = C78596Usy.LJIJJLI(this.LIZ);
            String LJ = PK0.LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("game_");
            LIZ.append(LJ);
            File file = new File(LJIJJLI, X1D.LIZIZ(LIZ));
            String LJIILIIL = PK8.LJIILIIL(file, file.getName(), LJFF, jSONObject);
            jSONObject.put("upload_scene", "direct");
            if (C63986P9i.LJIIIIZZ(LJFF, jSONObject.toString()).LIZ() && !TextUtils.isEmpty(LJIILIIL)) {
                PK8.LIZJ(new File(LJIILIIL));
            }
        } catch (Throwable unused) {
            C78685UuP.LJLIL();
        }
    }

    public final void LJFF(String str, JSONObject jSONObject) {
        if (PJC.LJII(jSONObject)) {
            return;
        }
        try {
            File file = new File(C78596Usy.LJIJJLI(this.LIZ), C16880lQ.LLLZ("ensure_%s", new Object[]{PK0.LJ()}));
            PK8.LJIILIIL(file, file.getName(), str, jSONObject);
            if (C63986P9i.LJIIIIZZ(str, jSONObject.toString()).LIZ()) {
                PK8.LIZJ(file);
            }
        } catch (Throwable unused) {
            C78685UuP.LJLIL();
        }
    }

    public static boolean LIZLLL(String str, String str2, String str3, List list) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("real upload alog ");
        LIZ.append(str3);
        LIZ.append(": ");
        LIZ.append(list);
        X1D.LIZIZ(LIZ);
        C78685UuP.LJJJLZIJ();
        String alogUploadUrl = PK0.LJIIIIZZ.getAlogUploadUrl();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("aid=");
        LIZ2.append(str);
        LIZ2.append("&device_id=");
        LIZ2.append(str2);
        String LJIIJJI = C63986P9i.LJIIJJI(alogUploadUrl, X1D.LIZIZ(LIZ2));
        if (PKZ.LJI) {
            return false;
        }
        C63980P9c c63980P9c = new C63980P9c(LJIIJJI, false);
        c63980P9c.LJ("aid", str, false);
        c63980P9c.LJ("device_id", str2, false);
        c63980P9c.LJ("os", "Android", false);
        c63980P9c.LJ("process_name", str3, false);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            if (file.exists()) {
                c63980P9c.LIZLLL(file.getName(), C45243HpH.LIZ("logtype", "alog", WM7.SCENE_SERVICE, "crash"));
                c63980P9c.LIZ(file);
                c63980P9c.LJII("\r\n".getBytes());
            }
        }
        if (new JSONObject(c63980P9c.LJI("alog")).optInt("errno", -1) != 200) {
            return false;
        }
        return true;
    }

    public final void LIZJ(JSONObject jSONObject, String str, long j, List<String> list, File file, File file2) {
        boolean z;
        PK7 pk7;
        if (PJC.LJII(jSONObject)) {
            return;
        }
        try {
            if (PJA.LJIIJ("custom_event_settings", "npth_simple_setting", "enable_anr_all_process_trace") == 1) {
                z = true;
            } else {
                z = false;
            }
            String name = CrashType.ANR.getName();
            String jSONObject2 = jSONObject.toString();
            PK7[] pk7Arr = new PK7[4];
            pk7Arr[0] = new PK7(file, true);
            pk7Arr[1] = C64263PJz.LJ(j);
            pk7Arr[2] = new PK7(PJ7.LIZIZ(), false);
            if (!z) {
                pk7 = null;
            } else {
                pk7 = PKQ.LJ(jSONObject.optJSONArray("alive_pids"));
            }
            pk7Arr[3] = pk7;
            if (C63986P9i.LJIIJ(name, str, jSONObject2, null, pk7Arr).LIZ()) {
                LIZ(C64264PKa.LIZJ(this.LIZ), list);
                PK8.LIZJ(file2);
                if (!PKZ.LIZJ()) {
                    PK8.LIZJ(C78596Usy.LJIJ(PK0.LIZ));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
