package X;

import Y.ACallableS25S1300000_7;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService;
import v5.n;

/* renamed from: X.HFg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43756HFg {
    public static void LIZIZ(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("authkey", C43379H0t.LIZ());
        intent.putExtra("aid", str);
        JobIntentService.enqueueWork(C16880lQ.LLLLL(context), (Class<?>) VideoFramesUploadService.class, 3009, intent);
    }

    public static C10K LIZ(HG7 hg7, VideoPublishEditModel videoPublishEditModel, String str) {
        HG2.LIZ(str, "before_create_extractor");
        n nVar = new n();
        AbstractC43762HFm LIZ = HFA.LIZ(hg7, videoPublishEditModel);
        if (LIZ == null) {
            nVar.LIZJ(null);
            return C10K.LJIIL;
        }
        C10K.LIZ(new ACallableS25S1300000_7(LIZ, videoPublishEditModel, str, nVar, 2));
        return nVar.LIZ;
    }
}
