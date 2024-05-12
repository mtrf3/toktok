package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.Qps, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68212Qps extends AbstractRunnableC68155Qox {
    public final /* synthetic */ Bundle LJLJJL;
    public final /* synthetic */ Activity LJLJJLL;
    public final /* synthetic */ C68217Qpx LJLJL;

    @Override // X.AbstractRunnableC68155Qox
    public final void LIZ() {
        Bundle bundle;
        if (this.LJLJJL != null) {
            bundle = new Bundle();
            if (this.LJLJJL.containsKey("com.google.app_measurement.screen_service")) {
                Object LLJJIII = C16880lQ.LLJJIII(this.LJLJJL, "com.google.app_measurement.screen_service");
                if (LLJJIII instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) LLJJIII);
                }
            }
        } else {
            bundle = null;
        }
        InterfaceC68207Qpn interfaceC68207Qpn = this.LJLJL.LJLIL.LJI;
        QH7.LJIIIIZZ(interfaceC68207Qpn);
        interfaceC68207Qpn.onActivityCreated(new BinderC68153Qov(this.LJLJJLL), bundle, this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68212Qps(C68217Qpx c68217Qpx, Bundle bundle, Activity activity) {
        super(c68217Qpx.LJLIL, true);
        this.LJLJL = c68217Qpx;
        this.LJLJJL = bundle;
        this.LJLJJLL = activity;
    }
}
