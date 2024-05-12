package X;

import com.ss.android.ugc.aweme.live.ILiveVersionCodeProvider;
import com.ss.android.ugc.aweme.live.LiveVersionCodeProvider;

/* loaded from: classes7.dex */
public final class F81 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final F81 LJLIL = new F81();

    public F81() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        ILiveVersionCodeProvider iLiveVersionCodeProvider;
        Object LIZ = C58096Mr6.LIZ(ILiveVersionCodeProvider.class, false);
        if (LIZ != null) {
            iLiveVersionCodeProvider = (ILiveVersionCodeProvider) LIZ;
        } else {
            if (C58096Mr6.v2 == null) {
                synchronized (ILiveVersionCodeProvider.class) {
                    if (C58096Mr6.v2 == null) {
                        C58096Mr6.v2 = new LiveVersionCodeProvider();
                    }
                }
            }
            iLiveVersionCodeProvider = C58096Mr6.v2;
        }
        iLiveVersionCodeProvider.LIZ();
        return "";
    }
}
