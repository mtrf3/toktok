package X;

import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.faceinfo.VEFaceDetectInfo;

/* renamed from: X.WyO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84028WyO implements InterfaceC84042Wyc {
    public final /* synthetic */ int[] LIZ;
    public final /* synthetic */ C84092WzQ LIZIZ;

    public C84028WyO(C84092WzQ c84092WzQ, int[] iArr) {
        this.LIZIZ = c84092WzQ;
        this.LIZ = iArr;
    }

    @Override // X.InterfaceC84042Wyc
    public final void LIZ(VEFaceAttributeInfo vEFaceAttributeInfo, VEFaceDetectInfo vEFaceDetectInfo) {
        int[] iArr = this.LIZ;
        int i = iArr[0];
        if (i != 0) {
            iArr[0] = i - 1;
            return;
        }
        if (vEFaceDetectInfo != null && vEFaceDetectInfo.getInfo() != null) {
            int centerX = vEFaceDetectInfo.getInfo()[0].LIZ.centerX();
            int centerY = vEFaceDetectInfo.getInfo()[0].LIZ.centerY();
            float f = (float) ((centerX * 1.0d) / r4.LJJLIIIJLJLI.width);
            this.LIZIZ.mRenderView.getClass();
            float f2 = 0;
            this.LIZIZ.mRenderView.getClass();
            VEFocusSettings vEFocusSettings = new C84040Wya((int) (f * f2), (int) (((float) ((centerY * 1.0d) / r4.LJJLIIIJLJLI.height)) * f2), 0, 0, this.LIZIZ.mContext.getResources().getDisplayMetrics().density).LIZ;
            vEFocusSettings.setFromUser(false);
            this.LIZIZ.setFocus(vEFocusSettings);
        } else {
            C84092WzQ c84092WzQ = this.LIZIZ;
            c84092WzQ.mRenderView.getClass();
            float f3 = 0 / 2.0f;
            this.LIZIZ.mRenderView.getClass();
            c84092WzQ.setFocus(f3, f3);
        }
        this.LIZIZ.removeFaceInfoCallback(this);
    }
}
