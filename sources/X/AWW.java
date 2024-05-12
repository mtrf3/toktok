package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;

/* loaded from: classes5.dex */
public final class AWW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj activityC45651qj, AWV awv, InterfaceC65784Pro interfaceC65784Pro) {
        if (awv != null) {
            Bundle bundle = new Bundle();
            bundle.putString("uncrop_avatar_path", awv.LIZ);
            bundle.putString("image_uri", awv.LIZIZ);
            bundle.putString("image_url", awv.LIZJ);
            bundle.putString("origin_no_crop_avatar_path", awv.LIZLLL);
            bundle.putString("path_mode", awv.LJ);
            ShareServiceImpl.LJJJLZIJ().LJJIJLIJ(activityC45651qj, bundle);
            interfaceC65784Pro.invoke();
        }
    }
}
