package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.Erx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37765Erx implements InterfaceC37405Em9<JSONObject, java.util.Map<?, ?>> {
    public static final C78528Urs LIZIZ = new C78528Urs(new JSONObject());
    public final InterfaceC37774Es6 LIZ;

    public C37765Erx(InterfaceC37774Es6 interfaceC37774Es6) {
        this.LIZ = interfaceC37774Es6;
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        C78528Urs c78528Urs;
        JSONObject jSONObject = (JSONObject) obj;
        InterfaceC37774Es6 interfaceC37774Es6 = this.LIZ;
        C31926Cfy c31926Cfy = new C31926Cfy();
        c31926Cfy.LIZIZ(InterfaceC37790EsM.class, new C31924Cfw(new C37769Es1(c37449Emr.toString())));
        c31926Cfy.LIZIZ(InterfaceC37772Es4.class, new C31924Cfw(new C37770Es2()));
        c31926Cfy.LIZJ(Context.class, C37509Enp.LIZ);
        c31926Cfy.LIZIZ(InterfaceC40311Frv.class, new C31924Cfw(new C37681Eqb(new WeakReference(c37449Emr))));
        interfaceC37774Es6.LIZIZ(c31926Cfy);
        if (jSONObject != null) {
            c78528Urs = new C78528Urs(jSONObject);
        } else {
            c78528Urs = LIZIZ;
        }
        this.LIZ.LIZJ(c78528Urs, new C37380Elk(c37399Em3, c37400Em4), EnumC37847EtH.ALL);
        c37449Emr.LIZIZ.LIZJ(new C37768Es0(this));
    }
}
