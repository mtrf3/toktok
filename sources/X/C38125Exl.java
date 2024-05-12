package X;

import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Exl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38125Exl implements InterfaceC38137Exx {
    public final /* synthetic */ C38117Exd LIZ;
    public final /* synthetic */ AbstractC38123Exj LIZIZ;
    public final /* synthetic */ C38112ExY LIZJ;

    @Override // X.InterfaceC38137Exx
    public final void LIZ(Object obj) {
        if (this.LIZJ.LJIIIZ == null) {
            return;
        }
        JSONObject jSONObject = null;
        if (obj instanceof JSONObject) {
            try {
                ((JSONObject) obj).put("code", 1);
                jSONObject = (JSONObject) obj;
            } catch (JSONException unused) {
            }
            if (jSONObject != null) {
                this.LIZJ.LJIIIZ.LIZLLL(jSONObject, this.LIZ);
                ((HashSet) this.LIZJ.LJFF).remove(this.LIZIZ);
            }
        }
        C38112ExY c38112ExY = this.LIZJ;
        c38112ExY.LJIIIZ.LIZJ(C79081V1x.LJIILL(c38112ExY.LIZ, obj), this.LIZ);
        ((HashSet) this.LIZJ.LJFF).remove(this.LIZIZ);
    }

    @Override // X.InterfaceC38137Exx
    public final void LIZIZ(JSONObject jSONObject) {
        AbstractC38114Exa abstractC38114Exa = this.LIZJ.LJIIIZ;
        if (abstractC38114Exa == null) {
            return;
        }
        abstractC38114Exa.LIZLLL(jSONObject, this.LIZ);
        ((HashSet) this.LIZJ.LJFF).remove(this.LIZIZ);
    }

    @Override // X.InterfaceC38137Exx
    public final void onFailed(Throwable th) {
        AbstractC38114Exa abstractC38114Exa = this.LIZJ.LJIIIZ;
        if (abstractC38114Exa == null) {
            return;
        }
        abstractC38114Exa.LIZJ(C79081V1x.LJIILIIL(th), this.LIZ);
        ((HashSet) this.LIZJ.LJFF).remove(this.LIZIZ);
    }

    public C38125Exl(C38112ExY c38112ExY, C38117Exd c38117Exd, AbstractC38123Exj abstractC38123Exj) {
        this.LIZJ = c38112ExY;
        this.LIZ = c38117Exd;
        this.LIZIZ = abstractC38123Exj;
    }
}
