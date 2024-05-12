package X;

import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Idd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47069Idd extends C47075Idj {
    public final InterfaceC47616ImS LIZLLL;
    public final InterfaceC46923IbH LJFF;
    public int LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public List<C46860IaG> LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public boolean LJIIZILJ;
    public final EnumC47176IfM LJ = EnumC47176IfM.Undefine;
    public int LJIIJ = -1;
    public final String LJIILJJIL = "";
    public String LJIILL = "";
    public String LJIILLIIL = "";

    @Override // X.C47075Idj
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.LIZLLL);
    }

    public final String LIZ() {
        JSONObject LJIILL = this.LIZLLL.LJIILL();
        try {
            LJIILL.put("sc_priority", this.LJI);
            String str = this.LJII;
            if (str != null) {
                LJIILL.put("sc_custom_path", str);
            }
            String str2 = this.LJIIIIZZ;
            if (str2 != null) {
                LJIILL.put("sc_context", str2);
            }
            long j = this.LIZ;
            if (j > 0) {
                LJIILL.put("sc_preload_size", j);
            }
            String str3 = this.LJIIIZ;
            if (str3 != null) {
                LJIILL.put("sc_frt_sub_vid", str3);
            }
            int i = this.LJIIJ;
            if (i != -1) {
                LJIILL.put("sc_sub_list_index", i);
            }
            if (this.LJIILJJIL.length() > 0) {
                LJIILL.put("sc_tag", this.LJIILJJIL);
            }
            if (this.LJIILL.length() > 0) {
                LJIILL.put("sc_sub_tag", this.LJIILL);
            }
            if (this.LJIILLIIL.length() > 0) {
                LJIILL.put("sc_gid", this.LJIILLIIL);
            }
            if (this.LJIIJJI != null && this.LJIIL) {
                JSONArray jSONArray = new JSONArray();
                for (C46860IaG c46860IaG : this.LJIIJJI) {
                    if (c46860IaG.LIZJ() != null) {
                        jSONArray.put(c46860IaG.LIZJ());
                    }
                }
                LJIILL.put("sc_dubbed_audios", jSONArray);
                LJIILL.put("sc_dubbed_preload", this.LJIIL);
                LJIILL.put("sc_dubbed_size", this.LJIILIIL);
            }
            return LJIILL.toString();
        } catch (JSONException e) {
            TTVideoEngineLog.d(e);
            return "";
        }
    }

    @Override // X.C47075Idj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47069Idd) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.LIZLLL, ((C47069Idd) obj).LIZLLL);
    }

    public C47069Idd(InterfaceC47616ImS interfaceC47616ImS, C46922IbG c46922IbG) {
        this.LIZLLL = interfaceC47616ImS;
        this.LJFF = c46922IbG;
    }
}
