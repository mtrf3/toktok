package X;

import Y.ARunnableS18S0300000_7;
import android.app.Activity;
import android.os.Handler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GxP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43199GxP {
    public static void LIZ(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        C43213Gxd.LIZJ = false;
        C43206GxW.LIZIZ = 5;
        C43206GxW.LIZJ = 0;
        C43206GxW.LIZLLL = editModel;
        C2U8.LIZ(new C43203GxT());
    }

    public final void LIZIZ(Activity activity, VideoPublishEditModel videoPublishEditModel) {
        new Handler().post(new ARunnableS18S0300000_7(activity, this, videoPublishEditModel, 6));
    }
}
