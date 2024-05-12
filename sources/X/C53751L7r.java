package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import kotlin.jvm.internal.AqS156S0200000_9;

/* renamed from: X.L7r, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53751L7r {
    public static void LIZ(Context context) {
        EnterStoryParam enterStoryParam = new EnterStoryParam(null, "inbox_top_cell", "notification_page", false, false, false, false, "notification_page", null, null, false, new ShootExtraData("notification_page", "inbox_top_cell", null, null, null, null, null, null, null, null, null, null, 4092, null), 1841, null);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            AVExternalServiceImpl.LIZ().storyService().startStoryPublish(LJIJJ, enterStoryParam, "notification_page", "inbox_top_cell", new TokenCert((String) AVExternalServiceImpl.LIZ().storyService().convertTIRAMISU("bpea-story_top_cell_request_read_storage_permission_target33", "bpea-story_top_cell_request_read_storage_permission")), new AqS156S0200000_9(context, enterStoryParam, 77));
        }
    }
}
