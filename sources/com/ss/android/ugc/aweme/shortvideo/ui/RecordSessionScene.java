package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AnonymousClass668;
import X.C157226Fa;
import X.C157236Fb;
import X.C6FB;
import X.InterfaceC42677Goz;
import android.os.Bundle;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;

/* loaded from: classes8.dex */
public abstract class RecordSessionScene extends BaseScreenAdaptScene implements InterfaceC42677Goz {
    public boolean LJLLI;

    @Override // X.AbstractC42651GoZ
    public void LLJJI() {
        this.LJLLI = false;
        super.LLJJI();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.AbsSceneAdaptationScene
    public final String LLL() {
        return "video_shoot_page";
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene, X.AbstractC42651GoZ, X.AbstractC147255qD, X.WM7
    public void onDestroyView() {
        this.LJLLI = false;
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene
    public C6FB LLLFF() {
        if (AnonymousClass668.LIZ()) {
            return C157226Fa.LIZ;
        }
        return C157236Fb.LIZ;
    }

    @Override // X.InterfaceC42677Goz
    public final boolean isRecording() {
        return this.LJLLI;
    }

    @Override // X.AbstractC42651GoZ, X.WMH, X.WM7
    public void onCreate(Bundle bundle) {
        this.LJLLI = true;
        super.onCreate(bundle);
    }
}
