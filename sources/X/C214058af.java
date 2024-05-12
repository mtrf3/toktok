package X;

import com.ss.android.ugc.aweme.commercialize.feed.assem.playfun.AdPlayFunVM;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlin.jvm.internal.AqS153S0100000_3;

/* renamed from: X.8af */
/* loaded from: classes4.dex */
public final class C214058af {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZ;

    static {
        TBR tbr = new TBR(C214058af.class, "vm", "<v#0>", 1);
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbr};
    }

    public static final AdPlayFunVM LIZ(VideoBaseCell videoBaseCell) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModel = null;
        if (videoBaseCell == null) {
            return null;
        }
        C240999d1 c240999d1 = C240999d1.LIZ;
        try {
            if ((videoBaseCell instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) videoBaseCell) != null && (feedVideoAssem = videoViewCell.LJLZ) != null) {
                C65776Prg LIZ2 = C65352Pkq.LIZ(AdPlayFunVM.class);
                feedBaseViewModel = LIZIZ(C214348b8.LIZ(feedVideoAssem, LIZ2, c240999d1, new AqS153S0100000_3(LIZ2, 1470), null, C214028ac.INSTANCE, null, null));
            } else {
                C3C5.m7constructorimpl(null);
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return (AdPlayFunVM) feedBaseViewModel;
    }

    public static final /* synthetic */ FeedBaseViewModel LIZIZ(InterfaceC115514g7 interfaceC115514g7) {
        return (FeedBaseViewModel) interfaceC115514g7.LIZ(null, LIZ[0]);
    }

    public static final AdPopUpWebPageVM LIZJ(VideoBaseCell videoBaseCell) {
        VideoViewCell videoViewCell;
        FeedVideoAssem feedVideoAssem;
        FeedBaseViewModel feedBaseViewModel = null;
        if (videoBaseCell == null) {
            return null;
        }
        C240999d1 c240999d1 = C240999d1.LIZ;
        try {
            if ((videoBaseCell instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) videoBaseCell) != null && (feedVideoAssem = videoViewCell.LJLZ) != null) {
                C65776Prg LIZ2 = C65352Pkq.LIZ(AdPopUpWebPageVM.class);
                feedBaseViewModel = LIZIZ(C214348b8.LIZ(feedVideoAssem, LIZ2, c240999d1, new AqS153S0100000_3(LIZ2, 1470), null, C214028ac.INSTANCE, null, null));
            } else {
                C3C5.m7constructorimpl(null);
            }
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return (AdPopUpWebPageVM) feedBaseViewModel;
    }
}
