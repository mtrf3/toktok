package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.AbstractC73672Svk;
import X.C2U8;
import X.C47261Igj;
import X.C73411SrX;
import X.C73542Ste;
import X.C76800UCe;
import X.C78999UzT;
import X.C87123bQ;
import X.C87223ba;
import X.C87393br;
import X.C87483c0;
import X.EnumC87203bY;
import X.EnumC87313bj;
import X.EnumC87323bk;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AqS26S0100100_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS26S0100100_1 aqS26S0100100_1, Object obj) {
        ((ActivityStatusViewModelImpl) aqS26S0100100_1.l0).LJLILLLLZI.LIZ("reportMyStatus on success");
        ActivityStatusViewModelImpl activityStatusViewModelImpl = (ActivityStatusViewModelImpl) aqS26S0100100_1.l0;
        C73411SrX c73411SrX = activityStatusViewModelImpl.LJZ;
        if (c73411SrX != null) {
            activityStatusViewModelImpl.LJLLJ.LIZIZ(c73411SrX);
        }
        ActivityStatusViewModelImpl activityStatusViewModelImpl2 = (ActivityStatusViewModelImpl) aqS26S0100100_1.l0;
        C73411SrX LJIIIIZZ = C73542Ste.LJIIIIZZ(AbstractC73672Svk.LJJIJ(aqS26S0100100_1.j1, activityStatusViewModelImpl2.LJLJJI.status_report_interval, TimeUnit.MILLISECONDS, activityStatusViewModelImpl2.LJLLLL), new AqS167S0100000_1((ActivityStatusViewModelImpl) aqS26S0100100_1.l0, 55), null, new AqS167S0100000_1((ActivityStatusViewModelImpl) aqS26S0100100_1.l0, 56), 2);
        C78999UzT.LJFF(LJIIIIZZ, ((ActivityStatusViewModelImpl) aqS26S0100100_1.l0).LJLLJ);
        activityStatusViewModelImpl2.LJZ = LJIIIIZZ;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS26S0100100_1 aqS26S0100100_1, Object it) {
        VideoSticker videoSticker;
        Long videoStickerId;
        o.LJIIIZ(it, "it");
        if (((VideoStickerContentCell) aqS26S0100100_1.l0).P()) {
            String str = null;
            ((VideoStickerContentCell) aqS26S0100100_1.l0).Q().mv0(aqS26S0100100_1.j1, EnumC87313bj.DELETED.getValue(), null);
            C2U8.LIZ(new C87223ba(EnumC87203bY.REMOVE.getType(), null));
            VideoStickerContentViewModel Q = ((VideoStickerContentCell) aqS26S0100100_1.l0).Q();
            long j = aqS26S0100100_1.j1;
            Q.getClass();
            Q.withState(new AqS26S0100100_1(j, Q, 3));
            VideoStickerContentCell videoStickerContentCell = (VideoStickerContentCell) aqS26S0100100_1.l0;
            VideoSticker videoSticker2 = videoStickerContentCell.LJLJLLL;
            if (videoSticker2 != null) {
                videoSticker = VideoSticker.copy$default(videoSticker2, null, null, null, null, null, Integer.valueOf(EnumC87323bk.DELETED.getStatus()), null, null, null, null, null, null, null, null, 16351, null);
            } else {
                videoSticker = null;
            }
            videoStickerContentCell.LJLJLLL = videoSticker;
            VideoSticker videoSticker3 = ((VideoStickerContentCell) aqS26S0100100_1.l0).LJLJLLL;
            if (videoSticker3 != null && (videoStickerId = videoSticker3.getVideoStickerId()) != null) {
                str = videoStickerId.toString();
            }
            C87393br.LJIILL(str, "delete");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS26S0100100_1 aqS26S0100100_1, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJ(R.string.h58, new AqS26S0100100_1((VideoStickerContentCell) aqS26S0100100_1.l0, aqS26S0100100_1.j1, 1));
        actionGroup.LJIIIIZZ(R.string.cg_, new AqS167S0100000_1((VideoStickerContentCell) aqS26S0100100_1.l0, 312));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS26S0100100_1 aqS26S0100100_1, Object obj) {
        C87483c0 it = (C87483c0) obj;
        o.LJIIIZ(it, "it");
        List<C87123bQ> list = it.LJLIL.LJLJJI;
        if (list != null) {
            long j = aqS26S0100100_1.j1;
            VideoStickerContentViewModel videoStickerContentViewModel = (VideoStickerContentViewModel) aqS26S0100100_1.l0;
            Iterator<C87123bQ> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C87123bQ next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    Long videoStickerId = next.LJLIL.getVideoStickerId();
                    if (videoStickerId == null || videoStickerId.longValue() != j) {
                        i = i2;
                    } else {
                        videoStickerContentViewModel.listRemoveItemAt(i);
                        break;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS26S0100100_1 aqS26S0100100_1, Object obj) {
        List list = (List) obj;
        Object obj2 = null;
        if (list != null) {
            long j = aqS26S0100100_1.j1;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((Emoji) next).getId() == j) {
                    obj2 = next;
                    break;
                }
            }
        }
        ((InterfaceC88472Yns) aqS26S0100100_1.l0).invoke(obj2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0100100_1(long j, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0100100_1(long j, VideoStickerContentViewModel videoStickerContentViewModel, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = videoStickerContentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0100100_1(ActivityStatusViewModelImpl activityStatusViewModelImpl, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = activityStatusViewModelImpl;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS26S0100100_1(VideoStickerContentCell videoStickerContentCell, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoStickerContentCell;
        this.j1 = j;
    }
}
