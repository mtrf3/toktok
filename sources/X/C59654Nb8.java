package X;

import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel;

/* renamed from: X.Nb8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59654Nb8 implements InterfaceC77468Uam {
    public final /* synthetic */ DialogFragment LIZ;
    public final /* synthetic */ FragmentManager LIZIZ;
    public final /* synthetic */ java.util.Map<String, Object> LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ OpenRechargePanel LJ;

    @Override // X.InterfaceC77468Uam
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC77468Uam
    public final void LJ() {
    }

    @Override // X.InterfaceC77468Uam
    public final void onShow() {
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZ() {
        this.LIZ.showNow(this.LIZIZ, C16880lQ.LJLLJ(C59654Nb8.class));
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZJ() {
        this.LIZ.showNow(this.LIZIZ, C16880lQ.LJLLJ(C59654Nb8.class));
    }

    @Override // X.InterfaceC77468Uam
    public final void LJFF() {
        this.LIZ.showNow(this.LIZIZ, C16880lQ.LJLLJ(C59654Nb8.class));
    }

    @Override // X.InterfaceC77468Uam
    public final void LIZLLL(int i, long j, boolean z, boolean z2) {
        String str;
        this.LIZJ.put("code", "1");
        this.LIZJ.put("exchangeType", Integer.valueOf(i));
        this.LIZJ.put("trackParams", C113554cx.LJJL(new OSZ("exchangeType", Integer.valueOf(i)), new OSZ("isAutoExchange", Boolean.valueOf(z)), new OSZ("source", this.LIZLLL), new OSZ("coins", Long.valueOf(j))));
        java.util.Map<String, Object> map = this.LIZJ;
        C60737Nsb c60737Nsb = this.LJ.contextProviderFactory.LIZIZ;
        if (c60737Nsb == null || (str = c60737Nsb.containerId) == null) {
            str = "";
        }
        map.put("container_id", str);
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentThreadTimeMillis, F15.LIZLLL(this.LIZJ), "coinsExchangeStatus"));
    }

    public C59654Nb8(DialogFragment dialogFragment, FragmentManager fragmentManager, java.util.Map<String, Object> map, String str, OpenRechargePanel openRechargePanel) {
        this.LIZ = dialogFragment;
        this.LIZIZ = fragmentManager;
        this.LIZJ = map;
        this.LIZLLL = str;
        this.LJ = openRechargePanel;
    }
}
