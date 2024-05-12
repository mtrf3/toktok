package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HYX {
    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (C41669GWz.LIZ() && !V16.LJJIIJ(shortVideoContext) && !TextUtils.equals(shortVideoContext.enterFrom, "super_entrance") && !shortVideoContext.creativeModel.recordEffectModel.hasAutoApplyEffect && !shortVideoContext.mIsFromDraft) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(ShortVideoContext shortVideoContext) {
        int i;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (C46140I8y.LIZ(shortVideoContext.enterFrom) && !HVI.LIZ() && C41669GWz.LIZ()) {
            return true;
        }
        if (GX0.LIZ() && !C77123UOp.LJJ(shortVideoContext)) {
            i = 16;
        } else {
            i = 17;
        }
        if (shortVideoContext.mIsFromDraft && shortVideoContext.shootMode == i) {
            return true;
        }
        if ((V18.LJI(shortVideoContext) || o.LJ("camera_shortcut", shortVideoContext.shootWay)) && LIZ(shortVideoContext) && e1.LIZ(31744, "studio_enable_default_landing_photo_tab", true, true)) {
            return true;
        }
        return false;
    }
}
