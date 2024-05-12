package com.ss.android.vesdk.faceinfo;

import X.C84127Wzz;
import X.X1D;
import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.medialib.model.Skeleton;
import com.ss.android.medialib.model.SkeletonInfo;
import java.util.Arrays;

/* loaded from: classes15.dex */
public class VESkeletonInfo {
    public VESkeleton[] info;
    public int orient;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VESkeletonInfo{orient=");
        LIZ.append(this.orient);
        LIZ.append(", info=");
        LIZ.append(Arrays.toString(this.info));
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public VESkeleton[] getInfo() {
        return this.info;
    }

    public int getOrient() {
        return this.orient;
    }

    public static VESkeletonInfo convert(byte[][] bArr) {
        VESkeleton[] vESkeletonArr = null;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        C84127Wzz c84127Wzz = new C84127Wzz(bArr[0]);
        VESkeletonInfo vESkeletonInfo = new VESkeletonInfo();
        vESkeletonInfo.setOrient(c84127Wzz.LIZJ());
        int LIZJ = c84127Wzz.LIZJ();
        if (LIZJ > 0) {
            vESkeletonArr = new VESkeleton[LIZJ];
            for (int i = 0; i < LIZJ; i++) {
                VESkeleton vESkeleton = new VESkeleton();
                vESkeleton.setID(c84127Wzz.LIZJ());
                vESkeleton.setRect(new RectF(c84127Wzz.LIZIZ(), c84127Wzz.LIZIZ(), c84127Wzz.LIZIZ(), c84127Wzz.LIZIZ()));
                int LIZJ2 = c84127Wzz.LIZJ();
                if (LIZJ2 > 0) {
                    PointF[] pointFArr = new PointF[LIZJ2];
                    int i2 = 0;
                    do {
                        pointFArr[i2] = new PointF(c84127Wzz.LIZJ(), c84127Wzz.LIZJ());
                        c84127Wzz.LIZ();
                        c84127Wzz.LIZIZ();
                        i2++;
                    } while (i2 < LIZJ2);
                    vESkeleton.setPoints(pointFArr);
                }
                vESkeletonArr[i] = vESkeleton;
            }
        }
        vESkeletonInfo.setInfo(vESkeletonArr);
        return vESkeletonInfo;
    }

    public void setInfo(VESkeleton[] vESkeletonArr) {
        this.info = vESkeletonArr;
    }

    public void setOrient(int i) {
        this.orient = i;
    }

    public static VESkeletonInfo convert(SkeletonInfo skeletonInfo) {
        if (skeletonInfo == null) {
            return null;
        }
        VESkeletonInfo vESkeletonInfo = new VESkeletonInfo();
        VESkeleton[] vESkeletonArr = new VESkeleton[skeletonInfo.getInfo().length];
        Skeleton[] info = skeletonInfo.getInfo();
        int length = info.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Skeleton skeleton = info[i];
            VESkeleton vESkeleton = new VESkeleton();
            vESkeleton.setID(skeleton.getID());
            vESkeleton.setRect(skeleton.getRect());
            vESkeleton.setPoints(skeleton.getPoints());
            vESkeletonArr[i2] = vESkeleton;
            i++;
            i2++;
        }
        vESkeletonInfo.setInfo(vESkeletonArr);
        return vESkeletonInfo;
    }
}
