package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import kotlin.jvm.internal.o;

/* renamed from: X.6bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163816bp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Activity activity, BaseScreenAdaptScene baseScreenAdaptScene) {
        if (activity instanceof SAAActivity) {
            NavigationScene navigationScene = ((SAAActivity) activity).LJLJJLL;
            if (navigationScene != null) {
                C42663Gol c42663Gol = new C42663Gol();
                c42663Gol.LIZJ = new C82161WMj();
                c42663Gol.LIZ = true;
                navigationScene.LLJJJJ(baseScreenAdaptScene, c42663Gol.LIZ());
                return;
            }
            return;
        }
        throw new RuntimeException("activity should be SAAActivity when in SAA");
    }

    public static void LIZIZ(AbstractC42651GoZ rootScene, Bundle bundle) {
        o.LJIIIZ(rootScene, "rootScene");
        Activity activity = rootScene.mActivity;
        if (activity == null) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("creation_mode", 1);
        bundle.putLong("video_image_switch_start_time", System.currentTimeMillis());
        if (C163846bs.LIZ()) {
            C139895eL.LIZIZ = false;
            VideoEditContainerScene videoEditContainerScene = new VideoEditContainerScene();
            videoEditContainerScene.mArguments = C43573H8f.LIZ(bundle);
            LIZ(activity, videoEditContainerScene);
            return;
        }
        C42662Gok.LJFF(activity, bundle);
        activity.finish();
    }
}
