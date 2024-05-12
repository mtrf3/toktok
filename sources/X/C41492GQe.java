package X;

import com.ss.android.ugc.aweme.geofencing.api.TranslatedRegionApi;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.GQe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41492GQe {
    public static final /* synthetic */ C41492GQe LIZ = new C41492GQe();

    public static TranslatedRegionApi LIZ() {
        InterfaceC36395EQd networkService = C60903NvH.LJIIJJI().getNetworkService();
        String LIZ2 = AVApiImpl.LIZJ().LIZ();
        o.LJIIIIZZ(LIZ2, "get().getService(AVApi::…s.java).apI_URL_PREFIX_SI");
        return (TranslatedRegionApi) networkService.createRetrofit(LIZ2, true, TranslatedRegionApi.class);
    }
}
