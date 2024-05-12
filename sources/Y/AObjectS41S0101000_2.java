package Y;

import X.C122004qa;
import X.C122024qc;
import X.C122034qd;
import X.C164246cW;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.model.message.RemindMessage;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AObjectS41S0101000_2 implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
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

    public static final Object invoke$0(AObjectS41S0101000_2 aObjectS41S0101000_2, Object obj) {
        C76800UCe lambda$continueAfterWidgetLoaded$11;
        switch (aObjectS41S0101000_2.i1) {
            case 0:
                lambda$continueAfterWidgetLoaded$11 = ((AbsAudienceInteractionFragment) aObjectS41S0101000_2.l0).lambda$continueAfterWidgetLoaded$11((RemindMessage) obj);
                return lambda$continueAfterWidgetLoaded$11;
            default:
                VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aObjectS41S0101000_2.l0;
                vEVideoPublishPreviewScene.LLLJ(vEVideoPublishPreviewScene.findViewById(R.id.naa));
                vEVideoPublishPreviewScene.LLJILLL = (View) obj;
                vEVideoPublishPreviewScene.LLLIIII();
                return null;
        }
    }

    public static final Object invoke$1(AObjectS41S0101000_2 aObjectS41S0101000_2, Object obj) {
        StickerItemModel stickerItemModel = (StickerItemModel) aObjectS41S0101000_2.l0;
        int i = aObjectS41S0101000_2.i1;
        C122034qd c122034qd = (C122034qd) obj;
        C122024qc LJJJJLI = c122034qd.LJIIIIZZ().LJJJJLI(stickerItemModel.uuid);
        if (LJJJJLI != null) {
            stickerItemModel.startTime = 0;
            stickerItemModel.endTime = i;
            LJJJJLI.LIZJ = 0L;
            LJJJJLI.LIZLLL = i;
            c122034qd.LJIIIIZZ().LJIIJ(LJJJJLI);
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS41S0101000_2 aObjectS41S0101000_2, Object obj) {
        TextStickerData textStickerData = (TextStickerData) aObjectS41S0101000_2.l0;
        int i = aObjectS41S0101000_2.i1;
        C122034qd c122034qd = (C122034qd) obj;
        C122004qa c122004qa = c122034qd.LJFF().get(textStickerData.getNleUuid());
        if (c122004qa != null) {
            c122004qa.LIZJ = 0L;
            c122004qa.LIZLLL = textStickerData.getAudioTrackDuration();
            c122004qa.LJ = i;
            c122004qa.LJFF = textStickerData.getAudioTrackDuration() + i;
            c122034qd.LJFF().LJJJI(c122004qa);
            return null;
        }
        return null;
    }

    public static final Object invoke$3(AObjectS41S0101000_2 aObjectS41S0101000_2, Object eventArgs) {
        o.LJIIIZ(eventArgs, "eventArgs");
        ((C164246cW) aObjectS41S0101000_2.l0).LLJILJIL().C("cancel", aObjectS41S0101000_2.i1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AObjectS41S0101000_2 aObjectS41S0101000_2, Object eventArgs) {
        o.LJIIIZ(eventArgs, "eventArgs");
        ((C164246cW) aObjectS41S0101000_2.l0).LLJILJIL().C("cancel", aObjectS41S0101000_2.i1);
        return C76800UCe.LIZ;
    }

    public AObjectS41S0101000_2(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
