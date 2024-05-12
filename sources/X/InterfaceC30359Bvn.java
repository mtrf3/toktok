package X;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;

/* renamed from: X.Bvn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC30359Bvn extends YLK {
    void LIZ(String str);

    void LIZIZ(String[] strArr, String[] strArr2, float[] fArr);

    void LIZJ(String str);

    void LIZLLL(int i, int i2, String str, String str2);

    void LJ();

    void LJFF(String[] strArr, String[] strArr2);

    void LJII();

    void LJIIIIZZ(String[] strArr);

    void LJIIIZ(String[] strArr, String[] strArr2);

    void LJIIJ(C40 c40);

    void LJIIJJI(InterfaceC30516ByK interfaceC30516ByK);

    void LJIIL(int i, C78862UxG c78862UxG);

    void LJIILIIL();

    void LJIILJJIL(InterfaceC30516ByK interfaceC30516ByK);

    void LJIILL(LiveEffect liveEffect, String str);

    void LJIILLIIL();

    void LJIIZILJ(String[] strArr, String[] strArr2, String[] strArr3);

    void LJIJ(String[] strArr);

    void LJIJI(String[] strArr, String[] strArr2);

    void LJIJJ(Boolean bool);

    void LJIJJLI(FilterModel filterModel, float f);

    void LJIL();

    void LJJ();

    void LJJI(int i, int i2, MotionEvent motionEvent);

    void LJJIFFI(int i);

    void LJJII(C41 c41);

    void LJJIII(Bundle bundle);

    void LJJIIJ(LiveEffect liveEffect, String str);

    void LJJIIJZLJL(String[] strArr, String[] strArr2);

    void LJJIJL(int i, long j, long j2, String str);

    int LLIIIJ(String str, String str2);

    void closeCamera(Cert cert);

    void composerCheckNodeExclusion(String str, String str2, int[] iArr);

    void composerUpdateNode(String str, String str2, float f);

    int getCameraInfo();

    void openCamera(Cert cert);

    Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector);

    void setExposureCompensation(int i);

    void setFilter(String str, float f);

    void setRenderCacheString(String str, String str2);
}
