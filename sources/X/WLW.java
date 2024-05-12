package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class WLW extends WMH implements IRecordingOperationPanel {
    public ShortVideoContextViewModel LJLIL;
    public Runnable LJLILLLLZI;
    public WUA LJLJI;

    public abstract C82622Wbi LLJILJIL();

    public abstract C82622Wbi getDiContainer();

    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getSurfaceSizeLayoutId() {
        return R.id.fmm;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int[] getVideoSize() {
        int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
        if (LJIIIZ == null) {
            return new int[]{0, 0};
        }
        return LJIIIZ;
    }

    static {
        C16880lQ.LJLLJ(WLW.class);
    }

    public final ShortVideoContextViewModel LLJILJILJ() {
        if (this.LJLIL == null) {
            this.LJLIL = (ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class);
        }
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final W5G backgroundView() {
        View view = this.mView;
        if (view != null) {
            return (W5G) view.findViewById(R.id.is3);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void closeRecording() {
        if (this.mActivity == null) {
            return;
        }
        ((I3X) LLJILJIL().LJ(I3X.class, null)).Ti0(false);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final WLZ filterModule() {
        if (this.LJLJI == null && this.mActivity != null) {
            this.LJLJI = new WUA((WRP) LLJILJIL().LJ(WRP.class, null));
        }
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final FragmentManager fragmentManager() {
        return ((ActivityC45651qj) this.mActivity).getSupportFragmentManager();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void updateLiveBackgroundView() {
        View view;
        View view2 = this.mView;
        FrameLayout.LayoutParams layoutParams = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.is3);
        } else {
            view = null;
        }
        InterfaceC44086HRy LIZ = HRQ.LIZ(this);
        if (LIZ != null) {
            layoutParams = LIZ.LJJJJ();
        }
        if (view == null || layoutParams == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams2.width = layoutParams.width;
        layoutParams2.height = layoutParams.height;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        view.setLayoutParams(layoutParams2);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraInfo() {
        C63824P3c cameraECInfo = ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).rX().getCameraController().getCameraECInfo();
        if (cameraECInfo != null) {
            int i = cameraECInfo.LIZJ;
            int i2 = cameraECInfo.LIZ;
            return Math.abs(i2) + Math.abs(i);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraPos() {
        return ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).getCameraFacing();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LiveData<Float> getZoomEvent() {
        return ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).Au();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final boolean isSupportedExposureCompensation() {
        return ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).rX().getCameraController().isSupportedExposureCompensation();
    }

    @Override // X.WMH
    public final void onPostActivityCreated() {
        super.onPostActivityCreated();
        Runnable runnable = this.LJLILLLLZI;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final InterfaceC83586WrG videoRecorder() {
        InterfaceC36571c5 LJIJ = C86793Y4n.LJIJ(this);
        if (LJIJ instanceof WLY) {
            return ((WLY) LJIJ).LJJJJJL();
        }
        return null;
    }

    public static boolean LLJJ(String str) {
        if ("xssticker".equals(str) || "xsbeauty".equals(str) || "livestreaming".equals(str) || "beauty".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void closeCamera(Cert cert) {
        ((InterfaceC82086WJm) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).C7(true, cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void detectDirtyLens(InterfaceC88471Ynr<Float, Integer, C76800UCe> interfaceC88471Ynr) {
        ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).detectDirtyLens(interfaceC88471Ynr);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onHidePanel(String str) {
        if (LLJJ(str)) {
            C78928UyK.LIZIZ(true, false, true, (InterfaceC82086WJm) LLJILJIL().LJ(InterfaceC82086WJm.class, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onShowPanel(String str) {
        if (LLJJ(str)) {
            C78928UyK.LIZIZ(false, false, true, (InterfaceC82086WJm) LLJILJIL().LJ(InterfaceC82086WJm.class, null));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void openCamera(Cert cert) {
        ((InterfaceC82086WJm) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).openCamera(cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        return Boolean.valueOf(((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).scaleCamera(scaleGestureDetector));
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setExposureCompensation(int i) {
        ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).rX().getCameraController().setExposureCompensation(i);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.mActivity != null) {
            ((InterfaceC82353WTt) getDiContainer().LJ(InterfaceC82353WTt.class, null)).Ef0(new W15());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        if (this.mActivity != null) {
            ((InterfaceC82353WTt) getDiContainer().LJ(InterfaceC82353WTt.class, null)).Ef0(new W15());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        boolean z;
        boolean z2;
        if (this.mActivity != null && "livestreaming".equals(str)) {
            InterfaceC82353WTt interfaceC82353WTt = (InterfaceC82353WTt) getDiContainer().LJ(InterfaceC82353WTt.class, null);
            if (!C77413UZt.LJIILL(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                interfaceC82353WTt.Ef0(new W19(this.mActivity, videoRecorder()));
                return;
            }
            List<String> list = faceSticker.types;
            if (list != null && list.contains("AR")) {
                z = true;
            } else {
                z = false;
            }
            List<String> list2 = faceSticker.requirements;
            if (list2 != null && list2.contains("AR")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                interfaceC82353WTt.Ef0(new W18(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) HK4.LIZ(this.mActivity).LLLIIIL().sm0().getLayoutParams())));
            } else if (!C77413UZt.LJIILL(faceSticker.types) && faceSticker.types.contains("TouchGes")) {
                interfaceC82353WTt.Ef0(new W18(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) HK4.LIZ(this.mActivity).LLLIIIL().sm0().getLayoutParams())));
            } else {
                interfaceC82353WTt.Ef0(new W15());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setCameraPos(int i, Cert cert) {
        C82085WJl LIZIZ;
        if (this.mActivity == null) {
            return;
        }
        if (i == 1) {
            LIZIZ = C82085WJl.LIZ();
        } else {
            LIZIZ = C82085WJl.LIZIZ();
        }
        ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).Yo0(LIZIZ, cert, null);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setFilter(String str, float f) {
        ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).setFilter(str, f);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void cameraFocus(int i, int i2, float[] fArr) {
        ((WLT) LLJILJIL().LJ(InterfaceC82086WJm.class, null)).rX().getCameraController().LJIILJJIL(i, 0.15f, fArr, i2);
    }

    @Override // X.WMH, X.WM7
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
