package X;

import android.graphics.Bitmap;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;

/* renamed from: X.P8n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63965P8n {
    public VESize LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public Bitmap.CompressFormat LIZLLL;
    public boolean LJ;
    public final String LJFF = "";
    public InterfaceC63961P8j LJI;
    public InterfaceC63955P8d LJII;
    public VERecorder.IVEFrameShotScreenCallback LJIIIIZZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEShotScreenSettings{mTargetResolution=");
        LIZ.append(this.LIZ);
        LIZ.append(", mNeedEffect=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mFileName='");
        LIZ.append(this.LIZJ);
        LIZ.append('\'');
        LIZ.append(", mNeedPreviewAfterShotScreen=");
        LIZ.append(false);
        LIZ.append(", mFormat=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", mNeedOriginPic=");
        LIZ.append(false);
        LIZ.append(", mShotScreenInHD=");
        C76965UIn.LIZJ(LIZ, false, ", mIsTakePicture=", false, ", mNeedDelay=");
        C76965UIn.LIZJ(LIZ, this.LJ, ", mGetFrameWithTexture=", false, ", mPathOfTexture=");
        LIZ.append(this.LJFF);
        LIZ.append(", mEnableUpscaleShot=");
        LIZ.append(false);
        LIZ.append(", mRequestTwoFrame=");
        LIZ.append(false);
        LIZ.append(", mScreenCallback=");
        LIZ.append(this.LJI);
        LIZ.append(", mOnInfoCallback=");
        LIZ.append((Object) null);
        LIZ.append(", mBitmapCallback=");
        LIZ.append(this.LJII);
        LIZ.append(", mFrameCallback=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C63965P8n)) {
            return false;
        }
        C63965P8n c63965P8n = (C63965P8n) obj;
        if (this.LIZIZ != c63965P8n.LIZIZ || !this.LIZJ.equals(c63965P8n.LIZJ) || this.LIZLLL != c63965P8n.LIZLLL || !this.LIZ.equals(c63965P8n.LIZ) || this.LJ != c63965P8n.LJ || !this.LJFF.equals(c63965P8n.LJFF)) {
            return false;
        }
        return true;
    }
}
