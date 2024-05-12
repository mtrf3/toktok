package X;

import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi;
import kotlin.jvm.internal.o;

/* renamed from: X.5cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139025cw extends AbstractC65781Prl implements InterfaceC65784Pro<SubtitleApi> {
    public static final C139025cw LJLIL = new C139025cw();

    public C139025cw() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SubtitleApi invoke() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        return networkService.createRetrofit(LIZ, true, SubtitleApi.class);
    }
}
