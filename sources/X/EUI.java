package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EUI implements InterfaceC85901XnV {
    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        EUH.LIZIZ(pushSettings);
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        EUH.LIZ(e);
    }
}
