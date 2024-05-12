package X;

import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PKK implements InterfaceC64239PJb {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ PKP LIZJ;

    @Override // X.InterfaceC64239PJb
    public final boolean LIZ(JSONObject jSONObject) {
        PKP pkp = this.LIZJ;
        long j = this.LIZ;
        boolean z = pkp.LJFF;
        List<String> list = this.LIZIZ;
        PKY pky = pkp.LJII;
        if (PJC.LJII(jSONObject)) {
            return true;
        }
        try {
            String LJFF = C63986P9i.LJFF(C63986P9i.LJI(), jSONObject.optJSONObject("header"));
            File LJIJJLI = C78596Usy.LJIJJLI(pkp.LIZIZ);
            CrashType crashType = CrashType.ANR;
            boolean z2 = false;
            File file = new File(LJIJJLI, PK0.LJFF(j, crashType, false, false));
            PK8.LJIILIIL(file, file.getName(), LJFF, jSONObject);
            if (z && !PKZ.LJI) {
                jSONObject.put("upload_scene", "direct");
                jSONObject.put("crash_uuid", file.getName());
                File LJIJI = C78596Usy.LJIJI(pkp.LIZIZ, PK0.LIZJ());
                C30581Hy.LJJIJLIJ(LJIJI, crashType);
                C78857UxB.LJIL(jSONObject, LJIJI);
                boolean LJI = C64264PKa.LJI(PK0.LIZ);
                if (Settings.Secure.getInt(PK0.LIZ.getContentResolver(), "anr_show_background", 0) == 0 && LJI) {
                    z2 = true;
                }
                String str = "silent anr no anr info";
                if (!z2) {
                    String LIZJ = C64278PKo.LIZJ(50, pkp.LIZIZ);
                    if (!TextUtils.isEmpty(LIZJ)) {
                        str = LIZJ;
                    }
                    PJC.LJIIJ(jSONObject, "anr_info", str);
                }
                List<ICrashCallback> list2 = PKZ.LJFF.LIZ.getList(crashType);
                if (list2.size() > 0) {
                    Iterator<ICrashCallback> it = list2.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().onCrash(CrashType.ANR, str, null);
                        } catch (Throwable th) {
                            PJZ.LIZ.getClass();
                            PJY.LIZ("NPTH_CATCH", th);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    try {
                        PJC.LJIIJ(jSONObject, "anr_info", PKP.LIZLLL(str, pky));
                        pky.LIZLLL(jSONObject.optJSONObject("filters"));
                    } catch (Throwable th2) {
                        PJZ.LIZ.getClass();
                        PJY.LIZ("NPTH_CATCH", th2);
                    }
                }
                if (!PJA.LJFF()) {
                    PK8.LIZJ(new File(LJIJI.getAbsolutePath(), "os_memory.txt"));
                }
                C64248PJk.LIZIZ().LIZJ(jSONObject, LJFF, j, list, LJIJI, file);
                return true;
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public PKK(PKP pkp, long j, List list) {
        this.LIZJ = pkp;
        this.LIZ = j;
        this.LIZIZ = list;
    }
}
