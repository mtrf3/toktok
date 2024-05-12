package X;

import Y.ARunnableS12S0101000_8;
import Y.ARunnableS7S0210000_8;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* renamed from: X.IHo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46364IHo {
    public static volatile boolean LIZIZ;
    public static boolean LIZJ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(DQD.LJLIL);
    public static volatile boolean LIZLLL = true;

    public static void LIZIZ(Aweme aweme) {
        Video video;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(video.getOriginCover()));
        LJII.LJJI = KL0.HIGH;
        LJII.LJI();
    }

    public static void LIZ(FeedItemList list, int i) {
        o.LJIIIZ(list, "list");
        if (((Boolean) DQB.LIZIZ.getValue()).booleanValue() && DUE.LIZJ() && LIZLLL) {
            LIZLLL = false;
            return;
        }
        LIZLLL = false;
        if (!C56662Kg.LIZ().LJIIIIZZ("feed_parse_end_to_video_preload")) {
            C56662Kg.LIZ().LJFF("feed_parse_end_to_video_preload", false);
        }
        if (!C56662Kg.LIZ().LJII("feed_video_preload_method_duration")) {
            C56662Kg.LIZ().LIZJ("feed_video_preload_method_duration", false);
        }
        if (!C46366IHq.LIZ) {
            C38995FSd.LIZLLL().execute(new ARunnableS12S0101000_8(i, list, 12));
            return;
        }
        if (KL2.LJIILIIL()) {
            if (C46365IHp.LIZ) {
                new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS12S0101000_8(i, list, 13));
                return;
            } else {
                LIZJ(list, i);
                return;
            }
        }
        if (C46365IHp.LIZ) {
            new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS12S0101000_8(i, list, 14));
        } else {
            ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS12S0101000_8(i, list, 15));
        }
    }

    public static void LIZJ(FeedItemList feedItemList, int i) {
        boolean z;
        boolean z2;
        boolean LIZ2;
        if (DUE.LIZJ() || DUE.LIZIZ() || DUE.LJFF(false) || ((Boolean) C33867DQx.LIZJ.getValue()).booleanValue() || ((Boolean) DPY.LIZJ.getValue()).booleanValue()) {
            z = true;
            z2 = true;
        } else {
            z = false;
            z2 = FVW.LIZ.LIZ(FVU.FEED_FIRST_VIDEO_PRELOAD);
        }
        if (i != 4) {
        }
        if (feedItemList != null && !C79004UzY.LJJIFFI(feedItemList.getItems()) && z2) {
            C46728IVo.LJIILIIL(0, feedItemList.getItems());
            if (((Boolean) DPY.LIZJ.getValue()).booleanValue()) {
                for (int i2 = 1; i2 < feedItemList.getItems().size() && i2 < ((Number) LIZ.getValue()).intValue(); i2++) {
                    C46728IVo.LJIILIIL(i2, feedItemList.getItems());
                }
            }
            if (z) {
                LIZ2 = true;
            } else {
                LIZ2 = FVW.LIZ.LIZ(FVU.PLAYER_FIRST_VIDEO_PREPARED);
            }
            if ((!DUE.LJFF(false) || !LIZJ) && LIZ2) {
                Aweme aweme = (Aweme) ListProtector.get(feedItemList.getItems(), 0);
                C46367IHr c46367IHr = new C46367IHr();
                if (aweme != null && aweme.getVideo() != null) {
                    if (i == 4 || ((Boolean) C33867DQx.LIZJ.getValue()).booleanValue()) {
                        if (C36152EGu.LIZIZ(FDW.LJLIL)) {
                            IWF.LJJLIIIIJ().LJIIIZ(aweme.getAid());
                        }
                        FMW.LIZ(new ARunnableS7S0210000_8(c46367IHr, aweme, z, 3));
                    } else if (C46368IHs.LIZIZ && C46368IHs.LIZJ) {
                        IWF.LJJLIIIIJ().LJJJJJ(aweme, false, false);
                    }
                }
            }
        }
        if (!C56662Kg.LIZ().LJIIIIZZ("feed_video_preload_method_duration")) {
            C56662Kg.LIZ().LJFF("feed_video_preload_method_duration", false);
        }
        if (!C56662Kg.LIZ().LJII("feed_video_preload_method_end_to_prepare")) {
            C56662Kg.LIZ().LIZJ("feed_video_preload_method_end_to_prepare", false);
        }
    }
}
