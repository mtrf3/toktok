package Y;

import X.AEY;
import X.AI8;
import X.C145995oB;
import X.C40944G5c;
import X.C60903NvH;
import X.FMX;
import X.G5V;
import X.G63;
import X.G83;
import X.GUT;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;

/* loaded from: classes8.dex */
public class AObjectS131S0200000_7 implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public AObjectS131S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object invoke$0(AObjectS131S0200000_7 aObjectS131S0200000_7, Object obj, Object obj2) {
        AI8 ai8 = (AI8) aObjectS131S0200000_7.l0;
        G63 g63 = (G63) aObjectS131S0200000_7.l1;
        Boolean bool = (Boolean) obj2;
        ((AEY) ai8.getAccessory()).LJIILIIL(bool.booleanValue());
        g63.LJ = bool.booleanValue();
        return null;
    }

    public static final Object invoke$1(AObjectS131S0200000_7 aObjectS131S0200000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS131S0200000_7.l0;
        G63 g63 = (G63) aObjectS131S0200000_7.l1;
        videoPublishContainerScene.getClass();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        G83.LIZ(videoPublishContainerScene.LLJLL(), booleanValue ? 1 : 0, videoPublishContainerScene.LLILZLL, null, new AObjectS131S0200000_7((AI8) obj, g63, 0));
        return null;
    }

    public static final Object invoke$2(AObjectS131S0200000_7 aObjectS131S0200000_7, Object obj, Object obj2) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS131S0200000_7.l0;
        G63 g63 = (G63) aObjectS131S0200000_7.l1;
        Boolean bool = (Boolean) obj2;
        videoPublishContainerScene.getClass();
        C40944G5c.LIZ.storeBoolean("has_water_mark", !bool.booleanValue());
        ((AEY) ((AI8) obj).getAccessory()).LJIILIIL(bool.booleanValue());
        g63.LJ = bool.booleanValue();
        if (videoPublishContainerScene.mActivity != null) {
            C60903NvH.LJIIJJI().getPublishService().LJI();
            GUT.LIZ(videoPublishContainerScene.requireActivity(), null);
        }
        if (bool.booleanValue()) {
            str = "on";
        } else {
            str = "off";
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", videoPublishContainerScene.LLILZLL.getCreationId());
        c145995oB.LJI("enter_from", "video_post_page");
        c145995oB.LJI("to_status", str);
        c145995oB.LJI("shoot_way", videoPublishContainerScene.LLILZLL.mShootWay);
        c145995oB.LJI("content_source", videoPublishContainerScene.LLILZLL.getAvetParameter().getContentSource());
        FMX.LJIIL("click_save_without_watermark", c145995oB.LIZ);
        return null;
    }

    public static final Object invoke$3(AObjectS131S0200000_7 aObjectS131S0200000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS131S0200000_7.l0;
        videoPublishContainerScene.getClass();
        videoPublishContainerScene.y(new G5V(videoPublishContainerScene, (G63) aObjectS131S0200000_7.l1, (AI8) obj2));
        return null;
    }
}
