package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: X.IHs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46368IHs {
    public static boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static void LIZ(FeedItemList feedItemList) {
        if (feedItemList != null && feedItemList.getItems() != null && feedItemList.getItems().size() > 0 && LIZIZ && LIZJ) {
            Aweme aweme = (Aweme) ListProtector.get(feedItemList.getItems(), 0);
            if (!C46366IHq.LIZ) {
                C38995FSd.LIZLLL().execute(new ARunnableS44S0100000_8(aweme, 187));
                return;
            }
            if (KL2.LJIILIIL()) {
                if (C46365IHp.LIZ) {
                    new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS44S0100000_8(aweme, 188));
                    return;
                } else {
                    LIZIZ(aweme);
                    return;
                }
            }
            if (C46365IHp.LIZ) {
                new Handler(C16880lQ.LLJJJJ()).postAtFrontOfQueue(new ARunnableS44S0100000_8(aweme, 189));
            } else {
                ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS44S0100000_8(aweme, 190));
            }
        }
    }

    public static void LIZIZ(Aweme aweme) {
        boolean z;
        if (aweme == null || aweme.getVideo() == null || LIZ) {
            return;
        }
        if ((C46369IHt.LIZ && !C56662Kg.LIZ().LIZLLL) || !FVW.LIZ.LIZ(FVU.PLAYER_FIRST_VIDEO_PREPARED)) {
            return;
        }
        if (((Boolean) C99O.LJ.getValue()).booleanValue()) {
            C38995FSd.LIZLLL().execute(new ARunnableS44S0100000_8(aweme, 191));
        }
        if (C00F.LIZ(31744, 0, "force_first_video_soft_decode", true) == 1 && !C46254IDi.LJI && C48236IwS.LJIJJ()) {
            z = true;
        } else {
            z = false;
        }
        IWF.LJJLIIIIJ().LJJJJJ(aweme, false, z);
        LIZLLL = true;
    }
}
