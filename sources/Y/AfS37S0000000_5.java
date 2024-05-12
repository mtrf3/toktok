package Y;

import X.BLU;
import X.C0NB;
import X.C30868C9o;
import X.C32151Nz;
import X.C32553Cq5;
import X.C36582EXi;
import X.InterfaceC64592gB;
import X.X1D;
import android.util.Pair;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.liveroom.RoomStatusController;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes6.dex */
public class AfS37S0000000_5 implements InterfaceC64592gB {
    public final int $t;

    public static final void accept$12(AfS37S0000000_5 afS37S0000000_5, Object obj) {
    }

    @Override // X.InterfaceC64592gB
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            case 9:
                accept$9(this, obj);
                return;
            case 10:
                C30868C9o.LIZJ(R.string.mg2);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                C30868C9o.LIZJ(R.string.mt9);
                return;
            case 12:
                accept$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                accept$13(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS37S0000000_5(int i) {
        this.$t = i;
    }

    public AfS37S0000000_5(C32553Cq5 c32553Cq5, int i) {
        this.$t = i;
    }

    public static final void accept$1(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        C0NB.LJI("LinkVideo2View", (Throwable) obj);
    }

    public static final void accept$13(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        C36582EXi.LIZJ(new IDRunnableS6S0101000(10, obj, 0));
    }

    public static final void accept$2(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        VideoWidget.lambda$reportStickerChange$15((Throwable) obj);
    }

    public static final void accept$4(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        C0NB.LIZIZ("DrawerBannerViewHolder", ((Throwable) obj).getMessage());
    }

    public static final void accept$5(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        C0NB.LIZIZ("DrawerBannerViewHolder", ((Throwable) obj).getMessage());
    }

    public static final void accept$6(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        RoomStatusController.lambda$refreshRoomStats$3((Throwable) obj);
    }

    public static final void accept$7(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        C0NB.LJI("MultiRoomIdListProvider", (Throwable) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$8(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        Pair pair = (Pair) ((BLU) obj).LIZ;
        if (pair != null && !C32151Nz.LJJIIJZLJL((List) pair.first)) {
            for (FeedItem feedItem : (List) pair.first) {
                if (((FeedExtra) pair.second).LIZ() != null) {
                    feedItem.logPb = ((FeedExtra) pair.second).LIZ().toString();
                }
            }
        }
    }

    public static final void accept$9(AfS37S0000000_5 afS37S0000000_5, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("there is error");
        LIZ.append(((Throwable) obj).toString());
        C0NB.LJIIIZ("LiveIconGeneratorLog", X1D.LIZIZ(LIZ));
    }

    public static final /* bridge */ /* synthetic */ void accept$0(AfS37S0000000_5 afS37S0000000_5, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void accept$3(AfS37S0000000_5 afS37S0000000_5, Object obj) {
    }
}
