package X;

import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;

/* renamed from: X.GsS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42892GsS {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(PublishOutput publishOutput, boolean z, AVPublishContentType aVPublishContentType) {
        if (C78685UuP.LJJJZ(publishOutput.getMusicId()) && aVPublishContentType == AVPublishContentType.Video && !z && !publishOutput.isOriginalSound()) {
            return true;
        }
        return false;
    }
}
