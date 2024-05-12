package X;

import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

/* renamed from: X.HEg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43730HEg extends AbstractC65781Prl implements InterfaceC65784Pro<IAVServiceProxy> {
    public static final C43730HEg LJLIL = new C43730HEg();

    public C43730HEg() {
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
