package X;

import kotlin.jvm.internal.o;

/* renamed from: X.O3f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61279O3f implements InterfaceC39418FdW {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ String LIZIZ;

    public C61279O3f(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC39418FdW
    public final void LIZ(String channel, Throwable th) {
        o.LJIIJ(channel, "channel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download failed with waitGeckoUpdate=");
        LIZ.append(this.LIZ);
        LIZ.append(" ,channel = ");
        LIZ.append(channel);
        LIZ.append(",bundle = ");
        LIZ.append(this.LIZIZ);
        C39930Flm.LIZIZ("GeckoFetcher", X1D.LIZIZ(LIZ), th);
    }

    @Override // X.InterfaceC39418FdW
    public final void LIZIZ(Long l, String channel) {
        o.LJIIJ(channel, "channel");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUpdateSuccess with waitGeckoUpdate=");
        LIZ.append(this.LIZ);
        LIZ.append(" , channel=");
        LIZ.append(channel);
        LIZ.append(",bundle=");
        LIZ.append(this.LIZIZ);
        C39930Flm.LIZ("GeckoFetcher", X1D.LIZIZ(LIZ));
    }
}
