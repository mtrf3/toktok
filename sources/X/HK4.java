package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;

/* loaded from: classes8.dex */
public final class HK4 {
    public static final TikTokCameraBaseGroupScene LIZ(Activity activity) {
        if (activity instanceof VideoRecordNewActivity) {
            return ((VideoRecordNewActivity) activity).LJLJJI;
        }
        if (activity instanceof SAAActivity) {
            AbstractC42651GoZ LLIIIILZ = ((SAAActivity) activity).LLIIIILZ();
            if (LLIIIILZ instanceof TikTokCameraBaseGroupScene) {
                return (TikTokCameraBaseGroupScene) LLIIIILZ;
            }
        }
        return null;
    }
}
