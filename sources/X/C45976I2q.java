package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.I2q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45976I2q extends WT3 {
    @Override // X.WT3
    public final boolean LLJJI() {
        return true;
    }

    @Override // X.WT3
    public final String getTag() {
        return "AlbumScene";
    }

    @Override // X.WT3
    public final void hide() {
    }

    @Override // X.WT3
    public final void show() {
    }

    @Override // X.WT3
    public final I0E LLJJIJI() {
        return I0E.ALBUM_TAB_CONTENT_SCENE;
    }

    @Override // X.WT3, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        return new FrameLayout(requireSceneContext());
    }
}
