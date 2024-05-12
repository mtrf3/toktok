package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;
import kotlin.jvm.internal.o;

/* renamed from: X.CiV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32083CiV {
    public final EnumC32070CiI LIZ;
    public final C31495CXr LIZIZ;

    public final String LIZ() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("wss://");
        LIZ.append(((IHostNetwork) CN1.LIZ(IHostNetwork.class)).getHostWebSocketDomain());
        if (this.LIZ == EnumC32070CiI.PREVIEW) {
            str = "/webcast/im/ws_proxy/from_preview/";
        } else {
            str = "/webcast/im/ws_proxy/";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public C32083CiV(EnumC32070CiI messageScene, C31495CXr c31495CXr) {
        o.LJIIIZ(messageScene, "messageScene");
        this.LIZ = messageScene;
        this.LIZIZ = c31495CXr;
    }
}
