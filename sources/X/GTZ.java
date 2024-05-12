package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* loaded from: classes8.dex */
public final class GTZ implements InterfaceC41597GUf {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ InterfaceC153045zY LIZIZ;
    public final /* synthetic */ Bundle LIZJ;
    public final /* synthetic */ VideoPublishEditModel LIZLLL;

    @Override // X.InterfaceC41597GUf
    public final void LIZ() {
        if (GUH.LJIIZILJ() == 0) {
            C41571GTf.LJFF("PublishParallel previous task is finished, start pre publish task");
            C41571GTf.LIZJ(this.LIZ, this.LIZJ, this.LIZLLL);
            GUH.LJFF = null;
        }
    }

    public GTZ(Activity activity, int i, InterfaceC153045zY interfaceC153045zY, Bundle bundle, VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = activity;
        this.LIZIZ = interfaceC153045zY;
        this.LIZJ = bundle;
        this.LIZLLL = videoPublishEditModel;
    }
}
