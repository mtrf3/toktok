package X;

import android.content.Context;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.EwN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38039EwN extends O6R {
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC38186Eyk LJLJJL;
    public final /* synthetic */ InterfaceC60761Nsz LJLJJLL;

    @Override // X.O6R
    public final void LJJIII() {
        this.LJLJJL.release();
    }

    @Override // X.O6R, X.InterfaceC60617Nqf
    public final void LJIJ(Context context) {
        o.LJIIIZ(context, "context");
        F3T f3t = (F3T) this.LJLJJLL.getHybridContext().LIZIZ(F3T.class);
        if (f3t != null) {
            f3t.LJFF(Context.class, context);
        }
        C31926Cfy c31926Cfy = (C31926Cfy) this.LJLJJLL.getHybridContext().LIZIZ(C31926Cfy.class);
        if (c31926Cfy == null) {
            C31926Cfy c31926Cfy2 = new C31926Cfy();
            c31926Cfy2.LIZJ(Context.class, context);
            c31926Cfy2.LIZJ(F3T.class, f3t);
            this.LJLJJLL.getHybridContext().LJII(C31926Cfy.class, c31926Cfy2);
            return;
        }
        c31926Cfy.LIZJ(Context.class, context);
        c31926Cfy.LIZJ(F3T.class, f3t);
    }

    public C38039EwN(boolean z, InterfaceC38186Eyk interfaceC38186Eyk, InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJLJJI = z;
        this.LJLJJL = interfaceC38186Eyk;
        this.LJLJJLL = interfaceC60761Nsz;
    }

    @Override // X.O6R
    public final void LJIL(C37955Ev1 call, String str, C37945Eur c37945Eur) {
        JSONObject jSONObject;
        String str2;
        Object LIZ;
        o.LJIIIZ(call, "call");
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            if (o.LJ(s.LJZI(str).toString(), "")) {
                jSONObject = new JSONObject();
            } else {
                c37945Eur.LIZ(-1, "params illegal, params = ".concat(str), null);
                return;
            }
        }
        if (this.LJLJJI) {
            String str3 = call.LJIIJJI;
            EnumC38003Evn enumC38003Evn = call.LJIILJJIL;
            if (enumC38003Evn == null || (str2 = enumC38003Evn.getValue()) == null) {
                str2 = "";
            }
            try {
                JSONObject jSONObject2 = new JSONObject(str3);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type", jSONObject2.optString("__msg_type"));
                jSONObject3.put("func", jSONObject2.optString("func"));
                jSONObject3.put("callback_id", jSONObject2.optString("__callback_id", ""));
                jSONObject3.put("version", jSONObject2.optString("JSSDK"));
                jSONObject3.put("fromBDXBridge", true);
                jSONObject3.put("needCallback", true);
                jSONObject3.put("permissionGroup", str2);
                jSONObject.put("jsMsg", jSONObject3);
                jSONObject.put("func", jSONObject2.optString("func"));
                jSONObject.put("res", new JSONObject());
                LIZ = jSONObject.put("permissionGroup", str2);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
        }
        this.LJLJJL.handle(jSONObject, new C38038EwM(c37945Eur));
    }
}
