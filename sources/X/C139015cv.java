package X;

import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.subtitle.MusicCopyrightApi;
import kotlin.jvm.internal.o;

/* renamed from: X.5cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139015cv extends AbstractC65781Prl implements InterfaceC65784Pro<MusicCopyrightApi> {
    public static final C139015cv LJLIL = new C139015cv();

    public C139015cv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.shortvideo.subtitle.MusicCopyrightApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MusicCopyrightApi invoke() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        return networkService.createRetrofit(LIZ, true, MusicCopyrightApi.class);
    }
}
