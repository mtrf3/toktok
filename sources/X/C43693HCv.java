package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.detail.ui.PublishPreviewDetailActivity;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.servicimpl.CreativePageService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* renamed from: X.HCv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43693HCv {
    public final ActivityC45651qj LIZ;
    public final Boolean LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;

    public final Activity LIZ() {
        ActivityC45651qj activityC45651qj = this.LIZ;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        if (ActivityStack.getTopActivity() != null) {
            return ActivityStack.getTopActivity();
        }
        return C84763XOl.LJIIIIZZ();
    }

    public C43693HCv() {
        Boolean bool = Boolean.FALSE;
        this.LIZJ = bool;
        this.LIZLLL = null;
        this.LIZLLL = bool;
        this.LIZJ = Boolean.TRUE;
    }

    public final Boolean LIZIZ() {
        Activity LIZ = LIZ();
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return bool;
        }
        if (LIZ != null) {
            return Boolean.valueOf(CreativePageService.LIZ().isPublishPage(LIZ));
        }
        return Boolean.FALSE;
    }

    public C43693HCv(ActivityC45651qj activityC45651qj) {
        boolean z;
        this.LIZJ = Boolean.FALSE;
        this.LIZLLL = null;
        this.LIZ = activityC45651qj;
        if (!(activityC45651qj instanceof MainActivity) && !(activityC45651qj instanceof PublishPreviewDetailActivity)) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = Boolean.valueOf(z);
        this.LIZLLL = Boolean.valueOf(CreativePageService.LIZ().isPublishPage(activityC45651qj));
    }

    public final Boolean LIZJ(Object obj) {
        boolean z;
        Activity LIZ = LIZ();
        Boolean bool = this.LIZIZ;
        if (bool != null) {
            return bool;
        }
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (!(LIZ instanceof MainActivity) && videoPublishEditModel.creativeModel.paidContentModel.getCollectionId().isEmpty() && !(LIZ instanceof PublishPreviewDetailActivity)) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }
}
