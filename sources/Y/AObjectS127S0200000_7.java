package Y;

import X.AI8;
import X.AbstractC42838Gra;
import X.C145995oB;
import X.C2U8;
import X.C44018HPi;
import X.C44172HVg;
import X.C76800UCe;
import X.C78605Ut7;
import X.FMX;
import X.G63;
import X.G7J;
import X.G7K;
import X.HVO;
import X.InterfaceC65784Pro;
import X.OHQ;
import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS127S0200000_7 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS127S0200000_7 aObjectS127S0200000_7) {
        G63 g63 = (G63) aObjectS127S0200000_7.l0;
        AI8 ai8 = (AI8) aObjectS127S0200000_7.l1;
        g63.LJIIJ = false;
        if (ai8.getAccessory() != null) {
            ai8.getAccessory().LJ().callOnClick();
            return null;
        }
        return null;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    public static final Object invoke$1(AObjectS127S0200000_7 aObjectS127S0200000_7) {
        VideoRecordPermissionActivity videoRecordPermissionActivity = (VideoRecordPermissionActivity) aObjectS127S0200000_7.l0;
        String[] strArr = (String[]) aObjectS127S0200000_7.l1;
        videoRecordPermissionActivity.getClass();
        String[] LJIILL = C78605Ut7.LJIILL(strArr);
        o.LJIIIZ(LJIILL, OHQ.LIZIZ);
        FMX.LJIIL("permission_rationale_page_action_close", HVO.LIZ(LJIILL, videoRecordPermissionActivity, null));
        videoRecordPermissionActivity.finish();
        if (videoRecordPermissionActivity.LJLILLLLZI && C78605Ut7.LIZJ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})) {
            C2U8.LIZ(new SuperEntranceEvent(3, false));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS127S0200000_7 aObjectS127S0200000_7) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS127S0200000_7.l0;
        G7K g7k = (G7K) aObjectS127S0200000_7.l1;
        videoPublishContainerScene.getClass();
        Boolean bool = g7k.LIZIZ;
        if (bool != null && bool.booleanValue()) {
            C145995oB c145995oB = new C145995oB();
            VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLILZLL;
            if (videoPublishEditModel != null) {
                str = videoPublishEditModel.getCreationId();
            } else {
                str = "mModel is null";
            }
            c145995oB.LJI("creation_id", str);
            c145995oB.LJI("user_id", C44172HVg.LJIJ.getCurrentUser().getUid());
            FMX.LJIIL("tns_video_push_words_sh", c145995oB.LIZ);
            G7J.LIZ(videoPublishContainerScene.mActivity, g7k, new AObjectS136S0100000_7(videoPublishContainerScene, 3), new AObjectS52S0101000_7(1, videoPublishContainerScene, 11));
            return null;
        }
        videoPublishContainerScene.J();
        return null;
    }

    public static final Object invoke$3(AObjectS127S0200000_7 aObjectS127S0200000_7) {
        C44018HPi.LJIIIZ((Activity) aObjectS127S0200000_7.l0, (Intent) aObjectS127S0200000_7.l1);
        return null;
    }

    public static final Object invoke$4(AObjectS127S0200000_7 aObjectS127S0200000_7) {
        AbstractC42838Gra abstractC42838Gra = (AbstractC42838Gra) aObjectS127S0200000_7.l0;
        abstractC42838Gra.LJLJLJ = (List) aObjectS127S0200000_7.l1;
        abstractC42838Gra.notifyDataSetChanged();
        return C76800UCe.LIZ;
    }

    public AObjectS127S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
