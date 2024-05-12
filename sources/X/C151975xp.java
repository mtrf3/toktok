package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shoutouts.ShoutOutsData;
import kotlin.jvm.internal.o;

/* renamed from: X.5xp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151975xp {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (H7R.LJJLIIIJJIZ(videoPublishEditModel) || H7R.LJJJJZI(videoPublishEditModel)) {
                return true;
            }
            if (videoPublishEditModel.isShoutout() || o.LJ(videoPublishEditModel.mShootWay, ShoutOutsData.shootWay)) {
                return false;
            }
        }
        if (C151965xo.LIZIZ() && C00F.LIZ(31744, 0, "studio_story_lightning_editpage_settings", true) != 0) {
            return true;
        }
        return false;
    }
}
