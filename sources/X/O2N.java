package X;

import Y.ACallableS113S0100000_10;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O2N implements InterfaceC61273O2z {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final /* synthetic */ O2F LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ O26 LJFF;
    public final /* synthetic */ C61268O2u LJI;
    public final /* synthetic */ boolean LJII;
    public final /* synthetic */ O1V LJIIIIZZ;
    public final /* synthetic */ InterfaceC88472Yns LJIIIZ;
    public final /* synthetic */ InterfaceC88472Yns LJIIJ;

    @Override // X.InterfaceC61273O2z
    public final void LIZIZ(List channelList) {
        o.LJIIJ(channelList, "channelList");
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download success with dynamic=");
        LIZ.append(this.LIZJ);
        LIZ.append(" , channel=");
        LIZ.append(this.LIZLLL);
        LIZ.append(",bundle=");
        LIZ.append(this.LJ);
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        JSONObject jSONObject = this.LJFF.LJIILLIIL;
        if (jSONObject != null) {
            jSONObject.put("g_update", this.LJI.LIZ());
        }
        if (this.LJII) {
            C39048FUe.LIZIZ(c39048FUe, "success, skip callbacks when onlyLocal is true", null, null, 6);
        } else {
            C10K.LIZIZ(new ACallableS113S0100000_10(this, 22), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC61273O2z
    public final void LIZ(Throwable th, List channelList) {
        o.LJIIJ(channelList, "channelList");
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        C39048FUe c39048FUe = C39048FUe.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed with dynamic=");
        LIZ.append(this.LIZJ);
        LIZ.append(" ,channel = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(",bundle = ");
        LIZ.append(this.LJ);
        LIZ.append(',');
        LIZ.append(th.getMessage());
        C39048FUe.LIZIZ(c39048FUe, X1D.LIZIZ(LIZ), null, null, 6);
        JSONObject jSONObject = this.LJFF.LJIILLIIL;
        if (jSONObject != null) {
            jSONObject.put("g_update", this.LJI.LIZ());
        }
        O26 o26 = this.LJFF;
        if (o26 instanceof O2Z) {
            ((O2Z) o26).LJIIZILJ = "gecko CheckUpdate Failed ";
        }
        if (this.LJII) {
            C39048FUe.LIZIZ(c39048FUe, "failed, skip callbacks when onlyLocal is true", null, null, 6);
        } else {
            C10K.LIZIZ(new ACallableS113S0100000_10(this, 21), C10K.LJIIIIZZ, null);
        }
    }

    public O2N(O2F o2f, String str, String str2, String str3, O26 o26, C61268O2u c61268O2u, boolean z, O1V o1v, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LIZIZ = o2f;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = o26;
        this.LJI = c61268O2u;
        this.LJII = z;
        this.LJIIIIZZ = o1v;
        this.LJIIIZ = interfaceC88472Yns;
        this.LJIIJ = interfaceC88472Yns2;
    }
}
