package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.EqK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37664EqK implements InterfaceC37405Em9<JSONObject, java.util.Map<?, ?>> {
    public final InterfaceC37666EqM LIZ;

    public C37664EqK(InterfaceC37666EqM interfaceC37666EqM) {
        this.LIZ = interfaceC37666EqM;
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        JSONObject jSONObject = (JSONObject) obj;
        InterfaceC37666EqM interfaceC37666EqM = this.LIZ;
        C37922EuU c37922EuU = new C37922EuU();
        c37922EuU.LJFF(InterfaceC37930Euc.class, new C37670EqQ(c37449Emr.toString()));
        c37922EuU.LIZLLL = c37449Emr.toString();
        c37922EuU.LJFF(InterfaceC37674EqU.class, new C37671EqR());
        c37922EuU.LJI(Context.class, C37509Enp.LIZ);
        new WeakReference(c37449Emr);
        c37922EuU.LJFF(InterfaceC31922Cfu.class, new C37672EqS());
        interfaceC37666EqM.LIZJ(c37922EuU);
        C36572EWy c36572EWy = new C36572EWy(new C37379Elj(c37399Em3, c37400Em4), this);
        InterfaceC37666EqM interfaceC37666EqM2 = this.LIZ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        new C37662EqI(interfaceC37666EqM2, jSONObject).LIZJ(c36572EWy);
        c37449Emr.LIZIZ.LIZJ(new C37667EqN(this));
    }
}
