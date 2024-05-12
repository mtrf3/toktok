package X;

import com.ss.android.ugc.aweme.nows.api.AICaptionApi;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import kotlin.jvm.internal.o;

/* renamed from: X.Eac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36690Eac extends AbstractC65781Prl implements InterfaceC65784Pro<AICaptionApi> {
    public static final C36690Eac LJLIL = new C36690Eac();

    public C36690Eac() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.nows.api.AICaptionApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final AICaptionApi invoke() {
        String host = new Host("https://api-va.tiktokv.com").getItemName();
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        o.LJIIIIZZ(host, "host");
        return networkService.createRetrofit(host, true, AICaptionApi.class);
    }
}
