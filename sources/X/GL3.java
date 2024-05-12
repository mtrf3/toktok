package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GL3 extends AbstractC41354GKw<C76800UCe> {
    public final Activity LIZ;
    public final RetakeVideoContext LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final boolean LIZLLL;

    public GL3(Activity activity, RetakeVideoContext retakeVideoContext, VideoPublishEditModel editModel, boolean z) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = activity;
        this.LIZIZ = retakeVideoContext;
        this.LIZJ = editModel;
        this.LIZLLL = z;
    }
}
