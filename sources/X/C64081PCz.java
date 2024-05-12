package X;

import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PCz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64081PCz implements PD3 {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ List LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(this.LJLIL, "DATA_DOCTOR");
            jSONObject.put(this.LJLILLLLZI, System.currentTimeMillis());
            int optInt = jSONObject.optInt("DATA_ID");
            Iterator it = this.LJLJI.iterator();
            while (it.hasNext()) {
                ((DoctorManager.ApmListener) it.next()).onDataEvent(optInt, this.LJLILLLLZI, this.LJLIL);
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.PD3
    public final PD7 LJIJ() {
        return PD7.LIGHT_WEIGHT;
    }

    public C64081PCz(JSONObject jSONObject, String str, List list) {
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = str;
        this.LJLJI = list;
    }
}
