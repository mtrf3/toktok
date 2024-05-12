package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.I2p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45975I2p extends WT3 {
    public final /* synthetic */ C46001I3p LJLIL;

    @Override // X.WT3
    public final boolean LLJJI() {
        return false;
    }

    @Override // X.WT3
    public final String getTag() {
        return "PhotoScene";
    }

    @Override // X.WT3
    public final void hide() {
    }

    @Override // X.WT3
    public final void show() {
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        C45850Hz4 c45850Hz4 = this.LJLIL.LJLJLJ;
        if (c45850Hz4 != null) {
            c45850Hz4.LIZLLL().mIsPhotoMvModeMusic = false;
        } else {
            o.LJIJI("tabEnv");
            throw null;
        }
    }

    @Override // X.WT3
    public final I0E LLJJIJI() {
        return I0E.NON_COVER_SCENE;
    }

    public C45975I2p(C46001I3p c46001I3p) {
        this.LJLIL = c46001I3p;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.WT3, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        return new FrameLayout(requireSceneContext());
    }
}
