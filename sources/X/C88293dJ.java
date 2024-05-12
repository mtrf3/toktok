package X;

import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.3dJ */
/* loaded from: classes2.dex */
public final class C88293dJ {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZ;

    static {
        TBR tbr = new TBR(C88293dJ.class, "vm", "<v#0>", 1);
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbr};
    }

    public static final /* synthetic */ FeedBaseViewModel LIZ(InterfaceC115514g7 interfaceC115514g7) {
        return (FeedBaseViewModel) interfaceC115514g7.LIZ(null, LIZ[0]);
    }

    public static final VideoExposeSharerInformationVM LIZIZ(C2MA c2ma) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModel = null;
        if (c2ma == null) {
            return null;
        }
        C240999d1 c240999d1 = C240999d1.LIZ;
        try {
            if ((c2ma instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c2ma) != null && (feedVideoAssem = videoViewCell.LJLZ) != null) {
                C65776Prg LIZ2 = C65352Pkq.LIZ(VideoExposeSharerInformationVM.class);
                feedBaseViewModel = LIZ(C214348b8.LIZ(feedVideoAssem, LIZ2, c240999d1, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 780), null, C87563c8.INSTANCE, null, null));
            } else {
                C3C5.m7constructorimpl(null);
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return (VideoExposeSharerInformationVM) feedBaseViewModel;
    }

    public static final VideoShareViewModel LIZJ(C2MA c2ma) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModel = null;
        if (c2ma == null) {
            return null;
        }
        C241249dQ c241249dQ = C241249dQ.LIZ;
        try {
            if ((c2ma instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c2ma) != null && (feedVideoAssem = videoViewCell.LJLZ) != null) {
                C65776Prg LIZ2 = C65352Pkq.LIZ(VideoShareViewModel.class);
                feedBaseViewModel = LIZ(C214348b8.LIZ(feedVideoAssem, LIZ2, c241249dQ, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 780), null, C87563c8.INSTANCE, null, null));
            } else {
                C3C5.m7constructorimpl(null);
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return (VideoShareViewModel) feedBaseViewModel;
    }
}
