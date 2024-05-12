package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NJG extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC59138NIw LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJG(long j, InterfaceC59138NIw interfaceC59138NIw) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = interfaceC59138NIw;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String url) {
        o.LJIIIZ(url, "url");
        C58655N0h LJ = C58704N2e.LJ("ad_wap_stat", "gecko_hit_status", String.valueOf(this.LJLIL), this.LJLILLLLZI.LJIIL(), null);
        LJ.LIZIZ("pixel_preload", "gecko_channel");
        LJ.LIZIZ(url, "url");
        LJ.LJI();
        return null;
    }
}
