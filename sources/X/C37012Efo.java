package X;

import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37012Efo extends C37011Efn {
    public final /* synthetic */ C37009Efl LJLIL;
    public final /* synthetic */ InterfaceC31943CgF LJLILLLLZI;
    public final /* synthetic */ InterfaceC78280Uns LJLJI;

    @Override // X.C37011Efn, X.InterfaceC37007Efj
    public final void LJ(JSONObject jSONObject) {
        String LJJIJIL;
        C37009Efl c37009Efl = this.LJLIL;
        InterfaceC31943CgF interfaceC31943CgF = this.LJLILLLLZI;
        EHM ehm = new EHM(jSONObject);
        c37009Efl.getClass();
        AbstractC37780EsC.LJI(interfaceC31943CgF, "", ehm);
        C37009Efl.LIZIZ.remove(this);
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_prefetch_data");
        JSONObject LIZJ = C65232Piu.LIZJ("prefetch_state", "success");
        LIZJ.put("prefetch_cached", jSONObject.optInt("cached"));
        LJJIJIL = u.LJJIJIL(this.LJLJI, "url", "");
        LIZJ.put("prefetch_api", LJJIJIL);
        c79605VMb.LIZLLL = LIZJ;
        FD5.LJ(null, c79605VMb.LIZ());
    }

    @Override // X.C37011Efn, X.InterfaceC37007Efj
    public final void onFailed(Throwable throwable) {
        String message;
        String LJJIJIL;
        o.LJIIJ(throwable, "throwable");
        C37009Efl c37009Efl = this.LJLIL;
        InterfaceC31943CgF interfaceC31943CgF = this.LJLILLLLZI;
        if (throwable.getMessage() == null) {
            message = "";
        } else {
            message = throwable.getMessage();
            if (message == null) {
                o.LJIIZILJ();
                throw null;
            }
        }
        AbstractC37780EsC.LJFF(c37009Efl, interfaceC31943CgF, 4, message, 8);
        C37009Efl.LIZIZ.remove(this);
        C79605VMb c79605VMb = new C79605VMb("hybrid_monitor_prefetch_data");
        JSONObject LIZJ = C65232Piu.LIZJ("prefetch_state", "fail");
        LIZJ.put("prefetch_error", throwable.getMessage());
        LJJIJIL = u.LJJIJIL(this.LJLJI, "url", "");
        LIZJ.put("prefetch_api", LJJIJIL);
        c79605VMb.LIZLLL = LIZJ;
        FD5.LJ(null, c79605VMb.LIZ());
    }

    public C37012Efo(C37009Efl c37009Efl, InterfaceC31943CgF interfaceC31943CgF, InterfaceC78280Uns interfaceC78280Uns) {
        this.LJLIL = c37009Efl;
        this.LJLILLLLZI = interfaceC31943CgF;
        this.LJLJI = interfaceC78280Uns;
    }
}
