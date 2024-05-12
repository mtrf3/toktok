package X;

import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import kotlin.jvm.internal.o;

/* renamed from: X.G2k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40874G2k implements InterfaceC40880G2q {
    public final C40875G2l LIZ;

    @Override // X.InterfaceC40880G2q
    public final String getName() {
        return "onboarding.skip";
    }

    public C40874G2k(C40875G2l c40875G2l) {
        this.LIZ = c40875G2l;
    }

    @Override // X.InterfaceC40880G2q
    public final void LIZ(ReadableMap params, Callback callback) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "new_user_journey");
        c188727au.LIZLLL(0, "selected_languages_count");
        c188727au.LIZLLL(this.LIZ.LIZ, "content_languages_count");
        FMX.LJIIL("lynx_skip_tapped", c188727au.LIZ);
        callback.invoke("succeed");
        C2U8.LIZ(new G2P("cancel"));
        C35878E6g.LIZ();
        C2U8.LIZ(new C40879G2p());
    }
}
