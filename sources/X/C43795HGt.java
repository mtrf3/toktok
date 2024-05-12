package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

/* renamed from: X.HGt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43795HGt extends AbstractC65781Prl implements InterfaceC65784Pro<IAVServiceProxy> {
    public static final C43795HGt LJLIL = new C43795HGt();

    public C43795HGt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IAVServiceProxy invoke() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        if (createIAVServiceProxybyMonsterPlugin != null) {
            return createIAVServiceProxybyMonsterPlugin;
        }
        throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
    }
}
