package X;

import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FfT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39539FfT implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ VNU LJLJLJ;

    public final void LIZ() {
        String str;
        try {
            JSONObject put = new JSONObject().put("res_load_start", this.LJLIL).put("res_load_finish", this.LJLILLLLZI);
            if (this.LJLJI) {
                str = "success";
            } else {
                str = "failed";
            }
            int isGeckoResource = ((VA4) VEZ.LIZIZ().LIZ(VA4.class)).isGeckoResource(this.LJLJJI);
            String str2 = "missing";
            if (isGeckoResource != 0) {
                if (isGeckoResource == 1) {
                    str2 = "gecko";
                }
            } else {
                str2 = "cdn";
            }
            JSONObject put2 = new JSONObject().put("res_src", this.LJLJJI).put("res_state", str).put("res_scene", "lynx_image").put("res_from", str2).put("res_size", this.LJLJJL).put("is_memory", this.LJLJJLL);
            JSONObject put3 = new JSONObject().put("res_loader_name", "Lynx");
            LynxEnv.LJIIIZ().getClass();
            JSONObject put4 = new JSONObject().put("res_load_perf", put).put("res_info", put2).put("res_loader_info", put3.put("res_loader_version", "2.10.16-rc.10"));
            int i = this.LJLJL;
            if (i != 0 && !this.LJLJI) {
                put4.put("res_load_error", new JSONObject().put("net_library_error_code", this.LJLJL).put("res_loader_error_code", C78685UuP.LJI(i)));
            }
            VNU vnu = this.LJLJLJ;
            if (vnu != null) {
                VNS LJI = vnu.LJI();
                if (LJI == null) {
                    LLog.LIZLLL(3, "LynxFrescoEventHelper", "reportResourceStatus Failed, cause: ((LynxContext)context).getLynxView() is null");
                } else {
                    ((InterfaceC79401VEf) VEZ.LIZIZ().LIZ(InterfaceC79401VEf.class)).reportResourceStatus(LJI, "res_loader_perf", put4, null);
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC39539FfT(int i, int i2, long j, long j2, VNU vnu, String str, boolean z, boolean z2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = i;
        this.LJLJJLL = z2;
        this.LJLJL = i2;
        this.LJLJLJ = vnu;
    }
}
