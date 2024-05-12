package X;

import com.ss.android.videoshop.controller.RefactorVideoController;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes16.dex */
public final class YSJ extends C47575Iln {
    public final /* synthetic */ C48157IvB LJLIL;

    public YSJ(C48157IvB c48157IvB) {
        this.LJLIL = c48157IvB;
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        super.onCompletion(tTVideoEngine);
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseCompleted();
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onError(C47789IpF c47789IpF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError:");
        LIZ.append(c47789IpF.LIZLLL);
        LIZ.append(" errorCode:");
        LIZ.append(c47789IpF.LIZ);
        LIZ.append(" internalCode:");
        LIZ.append(c47789IpF.LIZIZ);
        X1D.LIZIZ(LIZ);
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseError(c47789IpF);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responsePrepare();
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        String str;
        YSU videoSourceInfo;
        YSU videoSourceInfo2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPrepared:");
        C48157IvB c48157IvB = this.LJLIL;
        RefactorVideoController refactorVideoController = c48157IvB.LJI;
        String str2 = null;
        if (refactorVideoController == null || refactorVideoController.getVideoSourceInfo() == null || (videoSourceInfo2 = c48157IvB.LJI.getVideoSourceInfo()) == null) {
            str = null;
        } else {
            str = videoSourceInfo2.LIZIZ;
        }
        LIZ.append(str);
        LIZ.append(" title:");
        C48157IvB c48157IvB2 = this.LJLIL;
        RefactorVideoController refactorVideoController2 = c48157IvB2.LJI;
        if (refactorVideoController2 != null && refactorVideoController2.getVideoSourceInfo() != null && (videoSourceInfo = c48157IvB2.LJI.getVideoSourceInfo()) != null) {
            str2 = videoSourceInfo.LJI;
        }
        LIZ.append(str2);
        LIZ.append(" hashCode:");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
        RefactorVideoController refactorVideoController3 = this.LJLIL.LJI;
        if (refactorVideoController3 != null) {
            refactorVideoController3.responsePrepared();
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        String str;
        YSU videoSourceInfo;
        YSU videoSourceInfo2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRenderStart:");
        C48157IvB c48157IvB = this.LJLIL;
        RefactorVideoController refactorVideoController = c48157IvB.LJI;
        String str2 = null;
        if (refactorVideoController == null || refactorVideoController.getVideoSourceInfo() == null || (videoSourceInfo2 = c48157IvB.LJI.getVideoSourceInfo()) == null) {
            str = null;
        } else {
            str = videoSourceInfo2.LIZIZ;
        }
        LIZ.append(str);
        LIZ.append(" title:");
        C48157IvB c48157IvB2 = this.LJLIL;
        RefactorVideoController refactorVideoController2 = c48157IvB2.LJI;
        if (refactorVideoController2 != null && refactorVideoController2.getVideoSourceInfo() != null && (videoSourceInfo = c48157IvB2.LJI.getVideoSourceInfo()) != null) {
            str2 = videoSourceInfo.LJI;
        }
        LIZ.append(str2);
        LIZ.append(" hashCode:");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
        RefactorVideoController refactorVideoController3 = this.LJLIL.LJI;
        if (refactorVideoController3 != null) {
            refactorVideoController3.responseRenderStart();
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onVideoStatusException(int i) {
        UC7.LIZLLL("onVideoStatusException:", i);
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseVideoStatusException(i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseBufferingUpdate(i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onFrameDraw(int i, java.util.Map map) {
        this.LJLIL.LIZJ(1001, i, map, null);
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseLoadStateChanged(i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        RefactorVideoController refactorVideoController;
        if (i != 1) {
            if (i == 2 && (refactorVideoController = this.LJLIL.LJI) != null) {
                refactorVideoController.responseOnVideoPause();
            }
        } else {
            RefactorVideoController refactorVideoController2 = this.LJLIL.LJI;
            if (refactorVideoController2 != null) {
                refactorVideoController2.responseOnVideoPlay();
            }
        }
        RefactorVideoController refactorVideoController3 = this.LJLIL.LJI;
        if (refactorVideoController3 != null) {
            refactorVideoController3.responsePlaybackStateChanged(i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        UC7.LIZLLL("onStreamChanged type:", i);
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseStreamChanged(i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoStreamBitrateChanged resolution:");
        LIZ.append(enumC47176IfM.toString());
        X1D.LIZIZ(LIZ);
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseVideoStreamBitrateChanged(enumC47176IfM, i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        RefactorVideoController refactorVideoController = this.LJLIL.LJI;
        if (refactorVideoController != null) {
            refactorVideoController.responseVideoSizeChanged(i, i2);
        }
    }
}
