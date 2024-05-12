package X;

import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VEh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79403VEh {
    public static final java.util.Set<String> LJIIIZ;
    public static String LJIIJ;
    public static String LJIIJJI;
    public String LIZ;
    public String LIZIZ;
    public int LIZJ = -1;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;

    static {
        HashSet hashSet = new HashSet();
        LJIIIZ = hashSet;
        C012403c.LJFF(hashSet, "url", "surl", "channel", "bundle");
    }

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("url", this.LIZ);
            jSONObject.putOpt("relative_path", this.LIZIZ);
            jSONObject.putOpt("thread_mode", Integer.valueOf(this.LIZJ));
            jSONObject.putOpt("lynx_sdk_version", this.LIZLLL);
            jSONObject.putOpt("lynx_target_sdk_version", this.LJ);
            jSONObject.putOpt("lynx_session_id", this.LJFF);
            jSONObject.putOpt("lynx_dsl", this.LJI);
            jSONObject.putOpt("lynx_lepus_type", this.LJII);
            jSONObject.putOpt("lynx_page_version", this.LJIIIIZZ);
        } catch (JSONException e) {
            LLog.LIZLLL(3, "LynxGenericInfo", "LynxGenericInfo toJSONObject failed");
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public C79403VEh(VNS vns) {
        LynxEnv.LJIIIZ().getClass();
        this.LIZLLL = "2.10.16-rc.10";
        this.LJFF = C16880lQ.LLLZ("%s-%s-%s", new Object[]{String.valueOf(System.currentTimeMillis()), ((InterfaceC79400VEe) VEZ.LIZIZ().LIZ(InterfaceC79400VEe.class)).getDeviceID(), String.valueOf(System.identityHashCode(vns))});
    }
}
