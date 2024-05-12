package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GLA {
    public final Activity LIZ;
    public final VideoPublishEditModel LIZIZ;
    public C42278GiY LIZJ;

    public final void LIZ(boolean z) {
        if (z) {
            if (this.LIZJ == null) {
                C42279GiZ c42279GiZ = C42279GiZ.LIZ;
                Activity activity = this.LIZ;
                CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                creativeLoadingDialogBuilder.backCanCancel(false);
                creativeLoadingDialogBuilder.showProgress(false);
                String LJFF = C86V.LJFF(R.string.pc7);
                o.LJIIIIZZ(LJFF, "getString(R.string.processing)");
                creativeLoadingDialogBuilder.loadingMessage(LJFF);
                this.LIZJ = (C42278GiY) c42279GiZ.createLoadingDialog(activity, 1118, creativeLoadingDialogBuilder);
            }
            C42278GiY c42278GiY = this.LIZJ;
            if (c42278GiY != null) {
                c42278GiY.delayShow(C42279GiZ.LIZ());
                return;
            }
            return;
        }
        C42278GiY c42278GiY2 = this.LIZJ;
        if (c42278GiY2 != null) {
            c42278GiY2.dismiss();
        }
        this.LIZJ = null;
    }

    public GLA(Activity activity, VideoPublishEditModel editModel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(editModel, "editModel");
        this.LIZ = activity;
        this.LIZIZ = editModel;
    }
}
