package X;

import com.ss.android.ugc.aweme.aigc.AIGCApi;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.T2h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73995T2h extends AbstractC65781Prl implements InterfaceC65784Pro<AIGCApi.Api> {
    public static final C73995T2h LJLIL = new C73995T2h();

    public C73995T2h() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.aigc.AIGCApi$Api] */
    @Override // X.InterfaceC65784Pro
    public final AIGCApi.Api invoke() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        return networkService.createRetrofit(LIZ, true, AIGCApi.Api.class);
    }
}
