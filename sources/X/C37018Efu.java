package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Efu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37018Efu extends C37011Efn {
    public final /* synthetic */ C37017Eft LJLIL;
    public final /* synthetic */ InterfaceC37120EhY LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;

    @Override // X.C37011Efn, X.InterfaceC37007Efj
    public final void LJ(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        jSONObject2.put("data", jSONObject);
        this.LJLILLLLZI.LIZ(jSONObject2);
        this.LJLIL.LJLJJI.remove(this);
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) this.LJLIL.LJLJJL.getService(InterfaceC60276NlA.class);
        if (interfaceC60276NlA != null) {
            C60547NpX c60547NpX = new C60547NpX("bdx_monitor_prefetch_data", null, null, 254);
            c60547NpX.LIZJ = (AbstractC60548NpY) this.LJLIL.LJLJJLL.LIZJ(AbstractC60548NpY.class);
            JSONObject LIZJ = C65232Piu.LIZJ("prefetch_state", "success");
            LIZJ.put("prefetch_cached", jSONObject.optInt("cached"));
            LIZJ.put("prefetch_api", this.LJLJI.optString("url"));
            c60547NpX.LJI = LIZJ;
            interfaceC60276NlA.LJ(c60547NpX);
        }
    }

    @Override // X.C37011Efn, X.InterfaceC37007Efj
    public final void onFailed(Throwable throwable) {
        int i;
        o.LJIIJ(throwable, "throwable");
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(throwable instanceof C64802Pby)) {
                if (throwable instanceof C64799Pbv) {
                    jSONObject.put("status", ((C64799Pbv) throwable).getStatusCode());
                }
            } else {
                jSONObject.put("status", ((C64802Pby) throwable).getStatusCode());
            }
            if (throwable instanceof C64698PaI) {
                i = -106;
            } else {
                i = 1001;
            }
            C3C5.m7constructorimpl(jSONObject.put("error_code", i));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        InterfaceC37120EhY interfaceC37120EhY = this.LJLILLLLZI;
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        interfaceC37120EhY.LIZIZ(4, message, jSONObject);
        this.LJLIL.LJLJJI.remove(this);
        InterfaceC60276NlA interfaceC60276NlA = (InterfaceC60276NlA) this.LJLIL.LJLJJL.getService(InterfaceC60276NlA.class);
        if (interfaceC60276NlA != null) {
            C60547NpX c60547NpX = new C60547NpX("bdx_monitor_prefetch_data", null, null, 254);
            c60547NpX.LIZJ = (AbstractC60548NpY) this.LJLIL.LJLJJLL.LIZJ(AbstractC60548NpY.class);
            JSONObject LIZJ = C65232Piu.LIZJ("prefetch_state", "fail");
            LIZJ.put("prefetch_error", throwable.getMessage());
            LIZJ.put("prefetch_api", this.LJLJI.optString("url"));
            c60547NpX.LJI = LIZJ;
            interfaceC60276NlA.LJ(c60547NpX);
        }
    }

    public C37018Efu(C37017Eft c37017Eft, InterfaceC37120EhY interfaceC37120EhY, JSONObject jSONObject) {
        this.LJLIL = c37017Eft;
        this.LJLILLLLZI = interfaceC37120EhY;
        this.LJLJI = jSONObject;
    }
}
