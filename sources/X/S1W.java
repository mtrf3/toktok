package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S1W implements S1Y {
    public final S1U LIZ;
    public final InterfaceC44105HSr LIZIZ;
    public final C51556KLg LIZJ;

    public S1W(S1U s1u, InterfaceC44105HSr interfaceC44105HSr, C51556KLg c51556KLg) {
        this.LIZ = s1u;
        this.LIZIZ = interfaceC44105HSr;
        this.LIZJ = c51556KLg;
    }

    @Override // X.S1Y
    public final void LIZ(C188727au eventMapBuilder, Aweme aweme, String enterMethod, String enterFrom) {
        S1U s1u;
        String str;
        PoiAnchorInfo commentAnchor;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (this.LIZJ != null && (s1u = this.LIZ) != null) {
            Activity LIZ = this.LIZIZ.LIZ();
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (commentAnchor = poiDataStruct.getCommentAnchor()) == null || (str = commentAnchor.getTrackInfo()) == null) {
                str = "";
            }
            S1V.LIZ(s1u, LIZ, aweme, enterMethod, enterFrom, eventMapBuilder, str, 32);
        }
    }

    @Override // X.S1Y
    public final void LIZIZ(C188727au c188727au, Aweme aweme, String enterMethod, String enterFrom) {
        String str;
        PoiAnchorInfo videoAnchor;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        S1U s1u = this.LIZ;
        if (s1u != null) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (videoAnchor = poiDataStruct.getVideoAnchor()) == null || (str = videoAnchor.getTrackInfo()) == null) {
                str = "";
            }
            S1V.LIZIZ(s1u, aweme, enterMethod, enterFrom, false, false, str, c188727au, 24);
        }
    }

    @Override // X.S1Y
    public final void LIZJ(C188727au eventMapBuilder, Aweme aweme, String enterMethod, String enterFrom) {
        S1U s1u;
        String str;
        PoiAnchorInfo commentAnchor;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        if (this.LIZJ != null && (s1u = this.LIZ) != null) {
            Activity LIZ = this.LIZIZ.LIZ();
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (commentAnchor = poiDataStruct.getCommentAnchor()) == null || (str = commentAnchor.getTrackInfo()) == null) {
                str = "";
            }
            s1u.LJJL(LIZ, aweme, enterMethod, enterFrom, eventMapBuilder, true, str);
        }
    }

    @Override // X.S1Y
    public final void LIZLLL(C188727au eventMapBuilder, Aweme aweme, String enterMethod, String enterFrom) {
        String str;
        PoiAnchorInfo videoAnchor;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        S1U s1u = this.LIZ;
        if (s1u != null) {
            PoiDataStruct poiDataStruct = aweme.getPoiDataStruct();
            if (poiDataStruct == null || (videoAnchor = poiDataStruct.getVideoAnchor()) == null || (str = videoAnchor.getTrackInfo()) == null) {
                str = "";
            }
            S1V.LIZJ(s1u, aweme, enterMethod, enterFrom, false, str, eventMapBuilder, 8);
        }
    }
}
