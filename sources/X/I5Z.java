package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I5Z extends I5Y implements InterfaceC46100I7k {
    public final C82622Wbi LJLJLLL;
    public final WMH LJLL;
    public final int LJLLI;
    public final String LJLLILLLL;

    @Override // X.I5Y
    public final void LLJJ() {
    }

    public final void show() {
        if (!this.LJLL.isAdded(this)) {
            this.LJLL.add(this.LJLLI, this, this.LJLLILLLL);
        }
        if (!this.LJLL.isShowing(this)) {
            this.LJLL.show(this);
        }
    }

    @Override // X.InterfaceC46100I7k
    public final String getTag() {
        return this.LJLLILLLL;
    }

    @Override // X.I5Y, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LJLJJI = (CutMultiVideoViewModel) this.LJLJLLL.LJ(CutMultiVideoViewModel.class, null);
        this.LJLJJL = (CutVideoSpeedViewModel) this.LJLJLLL.LJ(CutVideoSpeedViewModel.class, null);
    }

    public I5Z(C82622Wbi diContainer, I6N parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLLL = diContainer;
        this.LJLL = parentScene;
        this.LJLLI = R.id.ddu;
        this.LJLLILLLL = "EditCutVideoSpeedScene";
    }
}
