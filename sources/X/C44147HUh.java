package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.video.IActivityNameService;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;

/* renamed from: X.HUh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44147HUh implements IActivityNameService {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(HV3.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getDraftBoxActivity() {
        return DraftBoxActivity.class;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IActivityNameService
    public final Class<? extends Activity> getVideoRecordPermissionActivityClass() {
        return VideoRecordPermissionActivity.class;
    }
}
