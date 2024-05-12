package com.ss.android.vesdk.faceinfo;

import X.C84127Wzz;
import X.P4Q;
import X.X1D;
import X.Z91;
import X.Z92;
import android.graphics.Rect;
import com.ss.android.medialib.model.FaceDetect;
import com.ss.android.medialib.model.FaceDetectInfo;

/* loaded from: classes17.dex */
public class VEFaceDetectInfo {
    public int faceCount;
    public Z92[] info;
    public C84127Wzz parcelWrapper;

    public void readFromParcel() {
        this.faceCount = this.parcelWrapper.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("face count = ");
        LIZ.append(this.faceCount);
        P4Q.LIZ("VEFaceDetectInfo", X1D.LIZIZ(LIZ));
        this.info = new Z92[this.faceCount];
        for (int i = 0; i < this.faceCount; i++) {
            Z92 z92 = new Z92();
            C84127Wzz c84127Wzz = this.parcelWrapper;
            z92.LIZIZ = c84127Wzz;
            if (c84127Wzz != null) {
                z92.LIZ = new Rect(c84127Wzz.LIZJ(), c84127Wzz.LIZJ(), c84127Wzz.LIZJ(), c84127Wzz.LIZJ());
                z92.LIZIZ.LIZIZ();
                z92.LIZIZ.LJI(106);
                C84127Wzz c84127Wzz2 = z92.LIZIZ;
                c84127Wzz2.getClass();
                int i2 = 0;
                do {
                    c84127Wzz2.LIZIZ();
                    i2++;
                } while (i2 < 106);
                z92.LIZIZ.LIZIZ();
                z92.LIZIZ.LIZIZ();
                z92.LIZIZ.LIZIZ();
                z92.LIZIZ.LIZIZ();
                z92.LIZIZ.LIZJ();
                z92.LIZIZ.LIZJ();
                z92.LIZIZ.LIZJ();
            }
            this.info[i] = z92;
        }
        int LIZJ = this.parcelWrapper.LIZJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("faceExtFlag = ");
        LIZ2.append(LIZJ);
        P4Q.LIZ("VEFaceDetectInfo", X1D.LIZIZ(LIZ2));
        if (LIZJ == 0) {
            return;
        }
        for (int i3 = 0; i3 < this.faceCount; i3++) {
            Z91 z91 = new Z91();
            C84127Wzz c84127Wzz3 = this.parcelWrapper;
            z91.LJ = c84127Wzz3;
            z91.LJFF = LIZJ;
            if (c84127Wzz3 != null) {
                if ((LIZJ & 1) != 0) {
                    c84127Wzz3.LIZJ();
                    z91.LIZ = z91.LJ.LJI(22);
                    z91.LJ.LJI(22);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("first left eye point = ");
                    LIZ3.append(z91.LIZ[0].x);
                    LIZ3.append(" X ");
                    LIZ3.append(z91.LIZ[0].y);
                    P4Q.LIZ("FaceExtInfo", X1D.LIZIZ(LIZ3));
                }
                if ((z91.LJFF & 2) != 0) {
                    z91.LJ.LIZJ();
                    z91.LIZIZ = z91.LJ.LJI(13);
                    z91.LJ.LJI(13);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("first left eyebrow point = ");
                    LIZ4.append(z91.LIZIZ[0].x);
                    LIZ4.append(" X ");
                    LIZ4.append(z91.LIZIZ[0].y);
                    P4Q.LIZ("FaceExtInfo", X1D.LIZIZ(LIZ4));
                }
                if ((z91.LJFF & 4) != 0) {
                    z91.LJ.LIZJ();
                    z91.LIZJ = z91.LJ.LJI(64);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("first lip point = ");
                    LIZ5.append(z91.LIZJ[0].x);
                    LIZ5.append(" X ");
                    LIZ5.append(z91.LIZJ[0].y);
                    P4Q.LIZ("FaceExtInfo", X1D.LIZIZ(LIZ5));
                }
                if ((z91.LJFF & 8) != 0) {
                    z91.LJ.LIZJ();
                    z91.LIZLLL = z91.LJ.LJI(20);
                    z91.LJ.LJI(20);
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("first left iris point = ");
                    LIZ6.append(z91.LIZLLL[0].x);
                    LIZ6.append(" X ");
                    LIZ6.append(z91.LIZLLL[0].y);
                    P4Q.LIZ("FaceExtInfo", X1D.LIZIZ(LIZ6));
                }
            }
            this.info[i3].getClass();
        }
    }

    public Z92[] getInfo() {
        return this.info;
    }

    public static VEFaceDetectInfo covert(FaceDetectInfo faceDetectInfo) {
        if (faceDetectInfo == null || faceDetectInfo.getInfo() == null) {
            return null;
        }
        VEFaceDetectInfo vEFaceDetectInfo = new VEFaceDetectInfo();
        Z92[] z92Arr = new Z92[faceDetectInfo.getInfo().length];
        FaceDetect[] info = faceDetectInfo.getInfo();
        int length = info.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            FaceDetect faceDetect = info[i];
            Z92 z92 = new Z92();
            z92.LIZ = faceDetect.getRect();
            faceDetect.getPoints();
            faceDetect.getAction();
            faceDetect.getEyeDistance();
            if (faceDetect.getFaceExtInfo() != null) {
                new Z91();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
                faceDetect.getFaceExtInfo();
            }
            faceDetect.getFaceID();
            faceDetect.getPitch();
            faceDetect.getPointVisibility();
            faceDetect.getRoll();
            faceDetect.getYaw();
            faceDetect.getScore();
            faceDetect.getTrackCount();
            z92Arr[i2] = z92;
            i++;
            i2++;
        }
        vEFaceDetectInfo.setInfo(z92Arr);
        return vEFaceDetectInfo;
    }

    public void setInfo(Z92[] z92Arr) {
        this.info = z92Arr;
    }

    public void setParcelWrapper(C84127Wzz c84127Wzz) {
        this.parcelWrapper = c84127Wzz;
    }
}
