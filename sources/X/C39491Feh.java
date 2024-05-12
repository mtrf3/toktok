package X;

import com.bytedance.pumbaa.hybrid.base.BridgeConfig;
import com.bytedance.pumbaa.hybrid.base.NavigationConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Feh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39491Feh extends F9E {
    public final NavigationConfig LJLIL;
    public final BridgeConfig LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C39491Feh(NavigationConfig navigationConfig, BridgeConfig bridgeConfig) {
        o.LJIIIZ(navigationConfig, "navigationConfig");
        o.LJIIIZ(bridgeConfig, "bridgeConfig");
        this.LJLIL = navigationConfig;
        this.LJLILLLLZI = bridgeConfig;
    }
}
