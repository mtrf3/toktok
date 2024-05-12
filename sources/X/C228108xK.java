package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.8xK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C228108xK implements InterfaceC57784Mm4 {
    public final Aweme LJLIL;
    public final Integer LJLILLLLZI;
    public final String LJLJI;
    public final UrlModel LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public Integer LJLJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        Integer num = this.LJLILLLLZI;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MixFeedItem(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", position=");
        return s0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C228108xK(Aweme aweme) {
        this(aweme, null);
        o.LJIIIZ(aweme, "aweme");
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C228108xK)) {
            return false;
        }
        C228108xK c228108xK = (C228108xK) interfaceC57784Mm4;
        if (!o.LJ(this.LJLJI, c228108xK.LJLJI) || !o.LJ(this.LJLJL, c228108xK.LJLJL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof C228108xK)) {
            return false;
        }
        C228108xK c228108xK = (C228108xK) interfaceC57784Mm4;
        if (!o.LJ(this.LJLJI, c228108xK.LJLJI) || !o.LJ(this.LJLJL, c228108xK.LJLJL)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C228108xK)) {
            return false;
        }
        C228108xK c228108xK = (C228108xK) obj;
        if (!o.LJ(this.LJLJI, c228108xK.LJLJI) || !o.LJ(this.LJLJL, c228108xK.LJLJL)) {
            return false;
        }
        return true;
    }

    public C228108xK(Aweme aweme, Integer num) {
        UrlModel urlModel;
        long j;
        Integer index;
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        this.LJLILLLLZI = num;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        this.LJLJI = aid;
        Video video = aweme.getVideo();
        if (video != null) {
            urlModel = video.getCover();
        } else {
            urlModel = null;
        }
        this.LJLJJI = urlModel;
        this.LJLJJL = aweme.getDesc();
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            j = statistics.getPlayCount();
        } else {
            j = 0;
        }
        String LJJIIJ = C77123UOp.LJJIIJ(j);
        o.LJIIIIZZ(LJJIIJ, "getDisplayCount(aweme.statistics?.playCount ?: 0)");
        this.LJLJJLL = LJJIIJ;
        if (num == null) {
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo != null && (index = playListInfo.getIndex()) != null) {
                num = C77339UWx.LIZIZ(index, 1);
            } else {
                num = null;
            }
        }
        this.LJLJL = num;
    }
}
