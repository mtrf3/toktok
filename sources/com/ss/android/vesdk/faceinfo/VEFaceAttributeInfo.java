package com.ss.android.vesdk.faceinfo;

import X.C84127Wzz;
import X.P4Q;
import X.X1D;
import com.ss.android.medialib.model.FaceAttribute;
import com.ss.android.medialib.model.FaceAttributeInfo;

/* loaded from: classes17.dex */
public class VEFaceAttributeInfo {
    public int faceCount;
    public VEFaceAttribute[] info;
    public C84127Wzz parcelWrapper;

    public void readFromParcel() {
        C84127Wzz c84127Wzz = this.parcelWrapper;
        if (c84127Wzz == null) {
            return;
        }
        this.faceCount = c84127Wzz.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("face count = ");
        LIZ.append(this.faceCount);
        P4Q.LIZ("VEFaceAttributeInfo", X1D.LIZIZ(LIZ));
        int i = this.faceCount;
        if (i == 0) {
            return;
        }
        this.info = new VEFaceAttribute[i];
        for (int i2 = 0; i2 < this.faceCount; i2++) {
            VEFaceAttribute vEFaceAttribute = new VEFaceAttribute();
            vEFaceAttribute.setParcelWrapper(this.parcelWrapper);
            vEFaceAttribute.readFromParcel();
            this.info[i2] = vEFaceAttribute;
        }
    }

    public VEFaceAttribute[] getInfo() {
        return this.info;
    }

    public static VEFaceAttributeInfo convert(FaceAttributeInfo faceAttributeInfo) {
        if (faceAttributeInfo == null) {
            return null;
        }
        VEFaceAttributeInfo vEFaceAttributeInfo = new VEFaceAttributeInfo();
        FaceAttribute[] info = faceAttributeInfo.getInfo();
        int i = 0;
        if (info == null) {
            vEFaceAttributeInfo.setInfo(new VEFaceAttribute[0]);
        } else {
            VEFaceAttribute[] vEFaceAttributeArr = new VEFaceAttribute[info.length];
            vEFaceAttributeInfo.setInfo(vEFaceAttributeArr);
            int length = info.length;
            int i2 = 0;
            while (i < length) {
                FaceAttribute faceAttribute = info[i];
                VEFaceAttribute vEFaceAttribute = new VEFaceAttribute();
                int i3 = i2 + 1;
                vEFaceAttributeArr[i2] = vEFaceAttribute;
                if (faceAttribute != null) {
                    vEFaceAttribute.setAge(faceAttribute.getAge());
                    vEFaceAttribute.setAngryScore(faceAttribute.getAngryScore());
                    vEFaceAttribute.setArousal(faceAttribute.getArousal());
                    vEFaceAttribute.setAngryScore(faceAttribute.getAngryScore());
                    vEFaceAttribute.setAttractive(faceAttribute.getAttractive());
                    vEFaceAttribute.setBlurScore(faceAttribute.getBlurScore());
                    vEFaceAttribute.setBoyProb(faceAttribute.getBoyProb());
                    vEFaceAttribute.setExpProbs(faceAttribute.getExpProbs());
                    vEFaceAttribute.setExpType(faceAttribute.getExpType());
                    vEFaceAttribute.setHappyScore(faceAttribute.getHappyScore());
                    vEFaceAttribute.setIllumination(faceAttribute.getIllumination());
                    vEFaceAttribute.setLipstickProb(faceAttribute.getLipstickProb());
                    vEFaceAttribute.setMaskProb(faceAttribute.getMaskProb());
                    vEFaceAttribute.setMustacheProb(faceAttribute.getMustacheProb());
                    vEFaceAttribute.setQuality(faceAttribute.getQuality());
                    vEFaceAttribute.setRealFaceProb(faceAttribute.getRealFaceProb());
                    vEFaceAttribute.setSadScore(faceAttribute.getSadScore());
                    vEFaceAttribute.setSurpriseScore(faceAttribute.getSurpriseScore());
                    vEFaceAttribute.setValence(faceAttribute.getValence());
                    vEFaceAttribute.setWearGlassProb(faceAttribute.getWearGlassProb());
                    vEFaceAttribute.setWearHatProb(faceAttribute.getWearHatProb());
                    vEFaceAttribute.setWearSunglassProb(faceAttribute.getWearSunglassProb());
                }
                i++;
                i2 = i3;
            }
        }
        return vEFaceAttributeInfo;
    }

    public void setInfo(VEFaceAttribute[] vEFaceAttributeArr) {
        this.info = vEFaceAttributeArr;
    }

    public void setParcelWrapper(C84127Wzz c84127Wzz) {
        this.parcelWrapper = c84127Wzz;
    }
}
