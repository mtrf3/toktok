package X;

import Y.ACallableS113S0100000_10;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.O1i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61230O1i implements InterfaceC61240O1s {
    public final /* synthetic */ C61225O1d LIZ;
    public final /* synthetic */ O1I LIZIZ;
    public final /* synthetic */ C61237O1p LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ boolean LJI;
    public final /* synthetic */ O1U LJII;
    public final /* synthetic */ InterfaceC88472Yns LJIIIIZZ;
    public final /* synthetic */ InterfaceC88472Yns LJIIIZ;

    @Override // X.InterfaceC61240O1s
    public final void LIZIZ(List channelList) {
        o.LJIIJ(channelList, "channelList");
        JSONObject jSONObject = this.LIZIZ.LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("g_update", this.LIZJ.LIZ());
        }
        C61225O1d c61225O1d = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download success with dynamic=");
        LIZ.append(this.LIZLLL);
        LIZ.append(" , channel=");
        LIZ.append(this.LJ);
        LIZ.append(",bundle=");
        LIZ.append(this.LJFF);
        C39973FmT.LIZIZ(c61225O1d, X1D.LIZIZ(LIZ), null, null, 6);
        if (this.LJI) {
            C39973FmT.LIZIZ(this.LIZ, "success, skip callbacks when onlyLocal is true", null, null, 6);
        } else {
            C10K.LIZIZ(new ACallableS113S0100000_10(this, 8), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.InterfaceC61240O1s
    public final void LIZ(Throwable th, List channelList) {
        o.LJIIJ(channelList, "channelList");
        JSONObject jSONObject = this.LIZIZ.LIZLLL.LJII;
        if (jSONObject != null) {
            jSONObject.put("g_update", this.LIZJ.LIZ());
        }
        C61225O1d c61225O1d = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed with dynamic=");
        LIZ.append(this.LIZLLL);
        LIZ.append(" ,channel = ");
        LIZ.append(this.LJ);
        LIZ.append(",bundle = ");
        LIZ.append(this.LJFF);
        LIZ.append(',');
        LIZ.append(th.getMessage());
        C39973FmT.LIZIZ(c61225O1d, X1D.LIZIZ(LIZ), null, null, 6);
        O1I o1i = this.LIZIZ;
        if (o1i instanceof O1W) {
            ((O1W) o1i).LJIILLIIL = "gecko CheckUpdate Failed ";
        }
        if (this.LJI) {
            C39973FmT.LIZIZ(this.LIZ, "failed, skip callbacks when onlyLocal is true", null, null, 6);
        } else {
            C10K.LIZIZ(new ACallableS113S0100000_10(this, 7), C10K.LJIIIIZZ, null);
        }
    }

    public C61230O1i(C61225O1d c61225O1d, O1I o1i, C61237O1p c61237O1p, String str, String str2, String str3, boolean z, O1U o1u, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        this.LIZ = c61225O1d;
        this.LIZIZ = o1i;
        this.LIZJ = c61237O1p;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = z;
        this.LJII = o1u;
        this.LJIIIIZZ = interfaceC88472Yns;
        this.LJIIIZ = interfaceC88472Yns2;
    }
}
