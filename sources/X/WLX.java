package X;

import Y.ARunnableS11S0101000_7;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.zhiliaoapp.musically.R;

/* loaded from: classes15.dex */
public abstract class WLX extends WMH implements IRecordingOperationPanel {
    public ShortVideoContextViewModel LJLIL;
    public ARunnableS11S0101000_7 LJLILLLLZI;
    public WUA LJLJI;

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

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onHidePanel(String str) {
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onShowPanel(String str) {
    }

    static {
        C16880lQ.LJLLJ(WLX.class);
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
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJLIL.Ti0(false);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final WLZ filterModule() {
        if (this.LJLJI == null && (requireActivity() instanceof FTCVideoRecordNewActivity)) {
            this.LJLJI = new WUA((WRP) ((FTCVideoRecordNewActivity) requireActivity()).LJLLI.LJ(WRP.class, null));
        }
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final FragmentManager fragmentManager() {
        return ((ActivityC45651qj) this.mActivity).getSupportFragmentManager();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraPos() {
        TikTokCameraBaseGroupScene LIZ = HK4.LIZ(this.mActivity);
        if (LIZ != null && LIZ.LLLIIIL() != null) {
            return LIZ.LLLIIIL().getCameraFacing();
        }
        return 0;
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
        View view3 = ((FTCVideoRecordNewActivity) this.mActivity).LJZI;
        if (view3 != null) {
            layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
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
    public final InterfaceC83586WrG videoRecorder() {
        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
        if (componentCallbacks2 instanceof WLY) {
            return ((WLY) componentCallbacks2).LJJJJJL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraInfo() {
        C63824P3c cameraECInfo = ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.rX().getCameraController().getCameraECInfo();
        int i = cameraECInfo.LIZJ;
        int i2 = cameraECInfo.LIZ;
        return Math.abs(i2) + Math.abs(i);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final boolean isSupportedExposureCompensation() {
        return ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.rX().getCameraController().isSupportedExposureCompensation();
    }

    @Override // X.WMH
    public final void onPostActivityCreated() {
        super.onPostActivityCreated();
        ARunnableS11S0101000_7 aRunnableS11S0101000_7 = this.LJLILLLLZI;
        if (aRunnableS11S0101000_7 != null) {
            aRunnableS11S0101000_7.run();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void closeCamera(Cert cert) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.C7(true, cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void detectDirtyLens(InterfaceC88471Ynr<Float, Integer, C76800UCe> interfaceC88471Ynr) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.detectDirtyLens(interfaceC88471Ynr);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void openCamera(Cert cert) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.openCamera(cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        return Boolean.valueOf(((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.scaleCamera(scaleGestureDetector));
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setExposureCompensation(int i) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.rX().getCameraController().setExposureCompensation(i);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        Activity activity = this.mActivity;
        if (activity != null && (activity instanceof FTCVideoRecordNewActivity)) {
            ((InterfaceC82353WTt) getDiContainer().LJ(InterfaceC82353WTt.class, null)).Ef0(new W15());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        Activity activity = this.mActivity;
        if (activity != null && (activity instanceof FTCVideoRecordNewActivity)) {
            ((InterfaceC82353WTt) getDiContainer().LJ(InterfaceC82353WTt.class, null)).Ef0(new W15());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        Activity activity = this.mActivity;
        if (activity != null && (activity instanceof FTCVideoRecordNewActivity) && "livestreaming".equals(str)) {
            InterfaceC82353WTt interfaceC82353WTt = (InterfaceC82353WTt) getDiContainer().LJ(InterfaceC82353WTt.class, null);
            if (!C77413UZt.LJIILL(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                interfaceC82353WTt.Ef0(new W19(this.mActivity, videoRecorder()));
                return;
            }
            if (!C77413UZt.LJIILL(faceSticker.types) && faceSticker.types.contains("AR")) {
                interfaceC82353WTt.Ef0(new W18(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.mActivity).LLIIJI.sm0().getLayoutParams())));
            } else if (!C77413UZt.LJIILL(faceSticker.types) && faceSticker.types.contains("TouchGes")) {
                interfaceC82353WTt.Ef0(new W18(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.mActivity).LLIIJI.sm0().getLayoutParams())));
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
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.Yo0(LIZIZ, cert, null);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setFilter(String str, float f) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.setFilter(str, f);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void cameraFocus(int i, int i2, float[] fArr) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLIIJI.rX().getCameraController().LJIILJJIL(i, 0.15f, fArr, i2);
    }

    @Override // X.WMH, X.WM7
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
