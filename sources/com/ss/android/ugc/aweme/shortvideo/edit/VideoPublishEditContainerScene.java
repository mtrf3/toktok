package com.ss.android.ugc.aweme.shortvideo.edit;

import X.AbstractC143185je;
import X.AnonymousClass668;
import X.C157226Fa;
import X.C157236Fb;
import X.C43212Gxc;
import X.C6D8;
import X.C6F2;
import X.C6FB;
import X.C6J8;
import X.GGS;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public abstract class VideoPublishEditContainerScene extends BaseScreenAdaptScene {
    public C6F2 LJLLI;
    public boolean LJLLILLLL;
    public AbstractC143185je LJLLJ;

    @Override // X.AbstractC42651GoZ
    public final boolean LLJJIJIIJIL() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final String LLL() {
        return "video_edit_page";
    }

    @Override // X.AbstractC147255qD
    public final Bundle LLJILJILJ() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final C43212Gxc LLJZIJLIL() {
        GGS.LIZ.getClass();
        return GGS.LJI;
    }

    public VideoPublishEditContainerScene() {
        LLJLLIL(C6J8.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public final C6FB LLLFF() {
        if (AnonymousClass668.LIZ()) {
            return C157226Fa.LIZ;
        }
        return C157236Fb.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.WM7
    public void onStart() {
        C6F2 c6f2;
        super.onStart();
        if (!this.LJLLILLLL && (c6f2 = this.LJLLI) != null) {
            add(R.id.cpl, c6f2, "EditRootScene");
            this.LJLLILLLL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene, X.AbstractC42651GoZ, X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.AbstractC147255qD, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ceh, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
    }
}
