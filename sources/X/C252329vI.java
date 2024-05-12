package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStandardApi;
import com.ss.android.ugc.aweme.services.NetworkStandardApiImpl;

/* renamed from: X.9vI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252329vI implements INetworkStandardApi {
    public static final C252329vI LIZIZ = new C252329vI();
    public final /* synthetic */ INetworkStandardApi LIZ = NetworkStandardApiImpl.createINetworkStandardApibyMonsterPlugin(false);

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public final void addEffectiveConnectionTypeChangedListener(FBC fbc) {
        this.LIZ.addEffectiveConnectionTypeChangedListener(fbc);
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public final int getEffectiveConnectionType() {
        return this.LIZ.getEffectiveConnectionType();
    }

    @Override // com.ss.android.ugc.aweme.network.spi.INetworkStandardApi
    public final void removeEffectiveConnectionTypeChangedListener(FBC fbc) {
        this.LIZ.removeEffectiveConnectionTypeChangedListener(fbc);
    }
}
