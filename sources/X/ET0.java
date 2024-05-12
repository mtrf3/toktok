package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;

/* loaded from: classes7.dex */
public final class ET0 extends AbstractC65781Prl implements InterfaceC65784Pro<Gson> {
    public static final ET0 LJLIL = new ET0();

    public ET0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Gson invoke() {
        return AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getNetworkService().getRetrofitFactoryGson();
    }
}
