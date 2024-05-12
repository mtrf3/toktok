package X;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PFZ extends PEG {
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final boolean LIZLLL;

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.PEG
    public final JSONObject LJFF() {
        return null;
    }

    @Override // X.PEG
    public final String LJII() {
        return "fd";
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return true;
    }

    @Override // X.PEG
    public final JSONObject LIZLLL() {
        String sb;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fd_count", this.LIZIZ);
            if (!C78915Uy7.LJIJJ(this.LIZJ)) {
                List<String> list = this.LIZJ;
                if (list == null) {
                    sb = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z = true;
                    for (String str : list) {
                        if (z) {
                            z = false;
                        } else {
                            sb2.append("\n");
                        }
                        sb2.append(str.toString());
                    }
                    sb = sb2.toString();
                }
                jSONObject.put("fd_detail", sb);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // X.PEG
    public final JSONObject LJ() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            jSONObject.put(WM7.SCENE_SERVICE, PGQ.LIZ().LJ());
            jSONObject.put("process_name", PC5.LJIJJ());
            jSONObject.put("is_main_process", PC5.LJJIIZ());
        } catch (Throwable unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("is_front", this.LIZLLL);
        return jSONObject;
    }

    @Override // X.PEG
    public final JSONObject LJI() {
        return PGQ.LIZ().LIZIZ();
    }

    public PFZ(int i, boolean z, List list) {
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = z;
    }
}
