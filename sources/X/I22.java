package X;

import com.ss.android.ugc.aweme.opensdkservice.HandleMediaListener;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class I22 {
    public final /* synthetic */ HandleMediaListener LIZ;

    public final void LIZ() {
        HandleMediaListener handleMediaListener = this.LIZ;
        if (handleMediaListener != null) {
            handleMediaListener.onArgsError();
        }
    }

    public I22(C45835Hyp c45835Hyp) {
        this.LIZ = c45835Hyp;
    }

    public final void LIZIZ(ArrayList<String> arrayList) {
        HandleMediaListener handleMediaListener = this.LIZ;
        if (handleMediaListener != null) {
            handleMediaListener.onGetImagePath(arrayList);
        }
    }

    public final void LIZJ(ArrayList<String> arrayList) {
        HandleMediaListener handleMediaListener = this.LIZ;
        if (handleMediaListener != null) {
            handleMediaListener.onGetVideoPath(arrayList);
        }
    }
}
