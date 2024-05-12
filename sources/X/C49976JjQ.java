package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.JjQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49976JjQ implements InterfaceC49992Jjg {
    public final InterfaceC49985JjZ LIZ;
    public final JVP LIZIZ;

    @Override // X.InterfaceC49295JWh
    public final AbstractC49294JWg LJ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        return C49990Jje.LIZ(this, videoEvent);
    }

    public C49976JjQ(JVP jvp, JVP jvp2) {
        this.LIZ = jvp;
        this.LIZIZ = jvp2;
    }

    @Override // X.InterfaceC49992Jjg
    public final AbstractC49294JWg LIZ(int i, Aweme aweme) {
        return C49989Jjd.LIZ(i, aweme);
    }

    @Override // X.InterfaceC49991Jjf
    public final boolean LIZIZ(C50420Jqa videoEvent, Aweme aweme) {
        o.LJIIIZ(videoEvent, "videoEvent");
        if (TrendingDetailServiceImpl.LIZLLL().LIZ() && this.LIZIZ.LLFII()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC49992Jjg
    public final int LIZJ(C50420Jqa videoEvent, Aweme aweme) {
        String str;
        Aweme aweme2;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(videoEvent, "videoEvent");
        InterfaceC49985JjZ interfaceC49985JjZ = this.LIZ;
        SearchMixFeed LJZL = this.LIZIZ.LJZL();
        if (LJZL == null || (aweme2 = LJZL.getAweme()) == null || (str = aweme2.getAid()) == null) {
            str = "";
        }
        return interfaceC49985JjZ.LJJI(str);
    }

    @Override // X.InterfaceC49991Jjf
    public final AbstractC49294JWg LIZLLL(C50420Jqa c50420Jqa, Aweme aweme) {
        return C49989Jjd.LIZIZ(c50420Jqa, aweme, this);
    }
}
