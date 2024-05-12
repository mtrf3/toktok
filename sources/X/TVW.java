package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TVW implements F6T {
    public final /* synthetic */ TVS LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ String LIZJ = "game_link_icon";
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.F6T
    public final void onFailed() {
        TYP.LIZ("game_link_aab", "load game link aab failed with dialog", false);
        if (o.LJ("local_test", ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getChannel())) {
            C30868C9o.LJI("please set setting 【live_test_skip_aab_check】 = true to skip aab check and restart app。");
        }
    }

    @Override // X.F6T
    public final void onSuccess() {
        this.LIZ.LIZIZ(0, "source", System.currentTimeMillis() - this.LIZIZ, "", "", false);
        if (this.LIZ.LIZ != Integer.MAX_VALUE) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load success with dialog ");
        LIZ.append(this.LIZJ);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        TYP.LIZ("game_link_aab", msg, false);
        this.LIZLLL.invoke();
    }

    public TVW(TVS tvs, long j, AqS160S0200000_13 aqS160S0200000_13) {
        this.LIZ = tvs;
        this.LIZIZ = j;
        this.LIZLLL = aqS160S0200000_13;
    }

    @Override // X.F6T
    public final void LIZ(int i, String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load failed with dialog: reason");
        LIZ.append(i);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        TYP.LIZ("game_link_aab", msg, false);
        TVS tvs = this.LIZ;
        tvs.LIZ = i;
        tvs.LIZIZ(1, this.LIZJ, System.currentTimeMillis() - this.LIZIZ, String.valueOf(this.LIZ.LIZ), "", false);
        C75516TkO c75516TkO = C75516TkO.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPluginInstallError reason = ");
        LIZ2.append(i);
        LIZ2.append(' ');
        LIZ2.append(this.LIZJ);
        c75516TkO.LIZ(601, X1D.LIZIZ(LIZ2), null);
    }
}
