package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3N extends WT3 implements InterfaceC135635Tz {
    public final C82622Wbi LJLIL;

    @Override // X.WT3
    public final boolean LLJJI() {
        return false;
    }

    @Override // X.WT3
    public final String getTag() {
        return "StoryTabScene";
    }

    @Override // X.WT3
    public final void hide() {
    }

    @Override // X.WT3
    public final void show() {
    }

    @Override // X.WT3
    public final I0E LLJJIJI() {
        return I0E.NON_COVER_SCENE;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public I3N(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C44384HbQ.LJIIIZ(this, new AqS173S0100000_7(this, 173));
    }

    @Override // X.WT3, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cef, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
