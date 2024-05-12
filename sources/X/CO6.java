package X;

import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* loaded from: classes6.dex */
public final class CO6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CO6 LJLIL = new CO6();

    public CO6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && EnableLynxDebugBadgeSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
