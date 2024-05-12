package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.music.artist.api.MusicPinnedAwemeApi;

/* renamed from: X.9T0, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9T0 {
    public static final /* synthetic */ C9T0 LIZ = new C9T0();

    public static MusicPinnedAwemeApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        return (MusicPinnedAwemeApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(MusicPinnedAwemeApi.class);
    }
}
