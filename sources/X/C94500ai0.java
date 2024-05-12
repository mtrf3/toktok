package X;

import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AddSongToMusicAppResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.AmazonAccessTokenResponse;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.SpotifyAccessTokenResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.ai0, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94500ai0 implements InterfaceC94324afA {
    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha<XGX<C94480ahg>> LJJI() {
        XGR LIZIZ = XGJ.LIZ().LIZIZ(new C94481ahh());
        C78977Uz7.LJJIJL(LIZIZ, EnumC199577sP.NetWhenCacheMiss);
        return LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha<XGX<C94488aho>> LJIIJJI(String str, String str2) {
        XGL LIZ = XGJ.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Bearer ");
        LIZ2.append(str);
        XGR LIZ3 = LIZ.LIZ(new C94489ahp(X1D.LIZIZ(LIZ2), str2));
        LIZ3.LIZ(new XH7(new C94327afD()));
        return LIZ3.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha LJJIJLIJ(int i, String clientId, String str) {
        o.LJIIIZ(clientId, "clientId");
        XGR LIZ = XGJ.LIZ().LIZ(new C94485ahl(i, clientId, str));
        LIZ.LIZ(new C84568XGy(new C94484ahk(new SpotifyAccessTokenResponse(null, null, null, null, null, 31, null))));
        return LIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha LJJLIIIJJIZ(int i, String clientId, String str) {
        o.LJIIIZ(clientId, "clientId");
        XGR LIZ = XGJ.LIZ().LIZ(new C94491ahr(i, clientId, str));
        LIZ.LIZ(new C84568XGy(new C94490ahq(new SpotifyAccessTokenResponse(null, null, null, null, null, 31, null))));
        return LIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha<XGX<C94496ahw>> LJLIIL(int i, int i2, String str) {
        return XGJ.LIZ().LIZ(new C94497ahx(i, i2, str)).LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha<XGX<C94474aha>> LJLLJ(int i, String songId, String authToken) {
        o.LJIIIZ(songId, "songId");
        o.LJIIIZ(authToken, "authToken");
        XGR LIZ = XGJ.LIZ().LIZ(new C94475ahb(i, songId, authToken));
        LIZ.LIZ(new XH4(new C94499ahz(songId)));
        boolean z = false;
        new AddSongToMusicAppResponse(z, z, 3, null);
        LIZ.LIZ(new C84568XGy(new C94474aha()));
        return LIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha LJLZ(String str, String clientId, String clientSecret) {
        o.LJIIIZ(clientId, "clientId");
        o.LJIIIZ(clientSecret, "clientSecret");
        XGR LIZ = XGJ.LIZ().LIZ(new C94487ahn(str, clientId, clientSecret));
        LIZ.LIZ(new XH7(new C94326afC()));
        return LIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha<XGX<C94476ahc>> LJJIFFI(int i, String authToken, String preAddedSongId, String title) {
        o.LJIIIZ(authToken, "authToken");
        o.LJIIIZ(preAddedSongId, "preAddedSongId");
        o.LJIIIZ(title, "title");
        XGR LIZ = XGJ.LIZ().LIZ(new C94477ahd(i, authToken, preAddedSongId, title));
        LIZ.LIZ(new XH4(new C94501ai1(preAddedSongId)));
        return LIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha<XGX<C94492ahs>> LJJJJJ(int i, String songId, String playlistId, String authToken) {
        o.LJIIIZ(songId, "songId");
        o.LJIIIZ(playlistId, "playlistId");
        o.LJIIIZ(authToken, "authToken");
        XGR LIZ = XGJ.LIZ().LIZ(new C94493aht(i, songId, playlistId, authToken));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(songId);
        LIZ2.append(playlistId);
        LIZ.LIZ(new XH4(new C94501ai1(X1D.LIZIZ(LIZ2))));
        return LIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha<XGX<C94494ahu>> LJJJLIIL(int i, String songId, String authToken, String str) {
        o.LJIIIZ(songId, "songId");
        o.LJIIIZ(authToken, "authToken");
        if (!C78685UuP.LJJJZ(str)) {
            str = null;
        }
        XGR LIZIZ = XGJ.LIZ().LIZIZ(new C94495ahv(i, songId, authToken, str));
        C78977Uz7.LJJIJL(LIZIZ, EnumC199577sP.CacheFirst);
        return LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha LJJIJIL(int i, Long l, int i2, String authToken, String str) {
        o.LJIIIZ(authToken, "authToken");
        XGR LIZIZ = XGJ.LIZ().LIZIZ(new C94483ahj(i, l, i2, authToken, str));
        C78977Uz7.LJJIJL(LIZIZ, EnumC199577sP.NetworkOnly);
        return LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC94324afA
    public final InterfaceC65462ha LJJJI(String code, String clientId, String clientSecret, String redirectUri, String codeVerifier) {
        o.LJIIIZ(code, "code");
        o.LJIIIZ(clientId, "clientId");
        o.LJIIIZ(clientSecret, "clientSecret");
        o.LJIIIZ(redirectUri, "redirectUri");
        o.LJIIIZ(codeVerifier, "codeVerifier");
        XGR LIZ = XGJ.LIZ().LIZ(new C94479ahf(code, clientId, clientSecret, redirectUri, codeVerifier));
        LIZ.LIZ(new C84568XGy(new C94478ahe(new AmazonAccessTokenResponse(null, null, null, null, 15, null))));
        LIZ.LIZ(new XH7(new C94325afB()));
        return LIZ.LIZIZ();
    }
}
