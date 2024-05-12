package X;

import com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.faceinfo.VEFaceDetectInfo;

/* renamed from: X.WyQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84030WyQ implements InterfaceC84042Wyc {
    public final /* synthetic */ C84092WzQ LIZ;

    public C84030WyQ(C84092WzQ c84092WzQ) {
        this.LIZ = c84092WzQ;
    }

    @Override // X.InterfaceC84042Wyc
    public final void LIZ(VEFaceAttributeInfo vEFaceAttributeInfo, VEFaceDetectInfo vEFaceDetectInfo) {
        C84092WzQ c84092WzQ = this.LIZ;
        if (!c84092WzQ.LJLIL) {
            return;
        }
        int i = c84092WzQ.LJLILLLLZI;
        if (i != 0) {
            c84092WzQ.LJLILLLLZI = i - 1;
            return;
        }
        if (vEFaceDetectInfo != null && vEFaceDetectInfo.getInfo() != null) {
            int centerX = vEFaceDetectInfo.getInfo()[0].LIZ.centerX();
            int centerY = vEFaceDetectInfo.getInfo()[0].LIZ.centerY();
            this.LIZ.mRenderView.getClass();
            float f = 0;
            double d = centerY * 1.0d;
            this.LIZ.mRenderView.getClass();
            this.LIZ.LJLJJI.setX((int) (((float) ((centerX * 1.0d) / r5.LJJLIIIJLJLI.width)) * f));
            this.LIZ.LJLJJI.setY((int) (((float) (d / r6.LJJLIIIJLJLI.height)) * f));
            this.LIZ.LJLJJI.setFromUser(false);
            C84092WzQ c84092WzQ2 = this.LIZ;
            c84092WzQ2.setFocus(c84092WzQ2.LJLJJI);
            this.LIZ.LJLJJI.getCameraFaceFocusPoint();
        } else {
            this.LIZ.mRenderView.getClass();
            this.LIZ.mRenderView.getClass();
            int i2 = (int) (0 / 2.0f);
            this.LIZ.LJLJJI.setX(i2);
            this.LIZ.LJLJJI.setY(i2);
            this.LIZ.LJLJJI.setFromUser(false);
            C84092WzQ c84092WzQ3 = this.LIZ;
            c84092WzQ3.setFocus(c84092WzQ3.LJLJJI);
            this.LIZ.LJLJJI.getCameraFaceFocusPoint();
        }
        this.LIZ.LJLIL = false;
    }
}
