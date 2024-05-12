package X;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.broadcast.preview.virtual.StartLivePreviewFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;

/* renamed from: X.C3f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C30703C3f implements InterfaceC30359Bvn {
    public final /* synthetic */ StartLivePreviewFragment LIZ;

    @Override // X.InterfaceC30359Bvn
    public final void LIZ(String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZJ(String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZLLL(int i, int i2, String str, String str2) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJ() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJII() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIJ(C40 c40) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIJJI(InterfaceC30516ByK interfaceC30516ByK) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILJJIL(InterfaceC30516ByK interfaceC30516ByK) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILL(LiveEffect liveEffect, String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJJ(Boolean bool) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJJLI(FilterModel filterModel, float f) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIL() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJ() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJI(int i, int i2, MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJII(C41 c41) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIII(Bundle bundle) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIIJ(LiveEffect liveEffect, String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIJL(int i, long j, long j2, String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final int LLIIIJ(String str, String str2) {
        return 0;
    }

    @Override // X.InterfaceC30359Bvn
    public final void closeCamera(Cert cert) {
    }

    @Override // X.InterfaceC30359Bvn
    public final int getCameraInfo() {
        return 0;
    }

    @Override // X.InterfaceC30359Bvn
    public final void openCamera(Cert cert) {
    }

    @Override // X.YLK
    public final void processLongPressEvent(float f, float f2) {
    }

    @Override // X.YLK
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
    }

    @Override // X.YLK
    public final void processRotationEvent(float f, float f2) {
    }

    @Override // X.YLK
    public final void processScaleEvent(float f, float f2) {
    }

    @Override // X.YLK
    public final void processTouchDownEvent(float f, float f2, int i) {
    }

    @Override // X.YLK
    public final void processTouchEvent(float f, float f2) {
    }

    @Override // X.YLK
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
    }

    @Override // X.YLK
    public final void processTouchUpEvent(float f, float f2, int i) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void setExposureCompensation(int i) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void setFilter(String str, float f) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void setRenderCacheString(String str, String str2) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILIIL() {
        this.LIZ.mo49getActivity().finish();
    }

    public C30703C3f(StartLivePreviewFragment startLivePreviewFragment) {
        this.LIZ = startLivePreviewFragment;
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIIIZZ(String[] strArr) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerRemoveNodes(strArr, strArr.length);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJ(String[] strArr) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerSetNodes(strArr, strArr.length);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIFFI(int i) {
        C1MZ c1mz;
        boolean z;
        StartLivePreviewFragment startLivePreviewFragment = this.LIZ;
        if (startLivePreviewFragment.mLiveBeautyHelper == null || (c1mz = startLivePreviewFragment.mLiveFilterHelper) == null) {
            return;
        }
        int LJIIIZ = c1mz.LJIIIZ();
        this.LIZ.mLiveFilterHelper.LJI(i);
        StartLivePreviewFragment startLivePreviewFragment2 = this.LIZ;
        if (i < LJIIIZ) {
            z = true;
        } else {
            z = false;
        }
        startLivePreviewFragment2.showFilterName(z);
    }

    @Override // X.InterfaceC30359Bvn
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJFF(String[] strArr, String[] strArr2) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerAppendNodesWithTags(strArr, strArr.length, strArr2, true, false, false);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIIZ(String[] strArr, String[] strArr2) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerAppendNodesWithTags(strArr, strArr.length, strArr2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIL(int i, C78862UxG c78862UxG) {
        StartLivePreviewFragment startLivePreviewFragment = this.LIZ;
        if (i == startLivePreviewFragment.mCameraType) {
            return;
        }
        startLivePreviewFragment.mCameraType = i;
        AbstractC30473Bxd abstractC30473Bxd = startLivePreviewFragment.mCameraCapture;
        if (abstractC30473Bxd != null) {
            ((C30514ByI) abstractC30473Bxd).LJIIZILJ(c78862UxG);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJI(String[] strArr, String[] strArr2) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerSetNodesWithTags(strArr, strArr.length, strArr2, true, false, false);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIIJZLJL(String[] strArr, String[] strArr2) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerSetNodesWithTags(strArr, strArr.length, strArr2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZIZ(String[] strArr, String[] strArr2, float[] fArr) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerUpdateMultipleNodes(strArr.length, strArr, strArr2, fArr);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIZILJ(String[] strArr, String[] strArr2, String[] strArr3) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerReplaceNodesWithTags(strArr, strArr.length, strArr2, strArr2.length, strArr3);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerCheckNodeExclusion(str, str2, iArr);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void composerUpdateNode(String str, String str2, float f) {
        IFilterManager iFilterManager = this.LIZ.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerUpdateNode(str, str2, f);
        }
    }
}
