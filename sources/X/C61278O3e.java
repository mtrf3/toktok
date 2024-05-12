package X;

import com.bytedance.forest.chain.fetchers.GeckoFetcher;
import com.bytedance.forest.model.Request;
import kotlin.jvm.internal.o;

/* renamed from: X.O3e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61278O3e implements InterfaceC39418FdW {
    public boolean LIZ;
    public final /* synthetic */ GeckoFetcher LIZIZ;
    public final /* synthetic */ C61295O3v LIZJ;
    public final /* synthetic */ Request LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ boolean LJFF;
    public final /* synthetic */ InterfaceC88472Yns LJI;
    public final /* synthetic */ C61157NzN LJII;

    @Override // X.InterfaceC39418FdW
    public final void LIZ(String channel, Throwable th) {
        o.LJIIJ(channel, "channel");
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed with waitGeckoUpdate=");
        LIZ.append(this.LIZLLL.getWaitGeckoUpdate());
        LIZ.append(" ,channel = ");
        LIZ.append(channel);
        LIZ.append(",bundle = ");
        LIZ.append(this.LJ);
        LIZ.append(',');
        LIZ.append(th.getMessage());
        C39930Flm.LJ("GeckoFetcher", X1D.LIZIZ(LIZ), 4);
        C61287O3n c61287O3n = this.LIZJ.LL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CheckUpdate Failed:");
        LIZ2.append(th.getMessage());
        c61287O3n.LIZIZ(5, X1D.LIZIZ(LIZ2));
        if (this.LJFF) {
            C39930Flm.LIZ("GeckoFetcher", "failed, skip callbacks when onlyLocal is true");
        } else {
            this.LIZIZ.loadGeckoFile(this.LIZLLL, this.LIZJ, channel, this.LJ, false, null, this.LJI, this.LJII);
        }
    }

    @Override // X.InterfaceC39418FdW
    public final void LIZIZ(Long l, String channel) {
        o.LJIIJ(channel, "channel");
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        this.LIZJ.W(null, "gecko_update_finish");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download success with waitGeckoUpdate=");
        LIZ.append(this.LIZLLL.getWaitGeckoUpdate());
        LIZ.append(" , channel=");
        LIZ.append(channel);
        LIZ.append(",bundle=");
        LIZ.append(this.LJ);
        C39930Flm.LIZ("GeckoFetcher", X1D.LIZIZ(LIZ));
        C61287O3n c61287O3n = this.LIZJ.LL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("is expire cleaned:");
        LIZ2.append(this.LIZJ.LL.LJFF);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        c61287O3n.getClass();
        o.LJIIJ(LIZIZ, "<set-?>");
        c61287O3n.LJIIIIZZ = LIZIZ;
        if (this.LJFF) {
            C39930Flm.LIZ("GeckoFetcher", "success, skip callbacks when onlyLocal is true");
        } else {
            this.LIZIZ.loadGeckoFile(this.LIZLLL, this.LIZJ, channel, this.LJ, false, l, this.LJI, this.LJII);
        }
    }

    public C61278O3e(GeckoFetcher geckoFetcher, C61295O3v c61295O3v, Request request, String str, boolean z, InterfaceC88472Yns interfaceC88472Yns, C61157NzN c61157NzN) {
        this.LIZIZ = geckoFetcher;
        this.LIZJ = c61295O3v;
        this.LIZLLL = request;
        this.LJ = str;
        this.LJFF = z;
        this.LJI = interfaceC88472Yns;
        this.LJII = c61157NzN;
    }
}
