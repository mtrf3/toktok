package X;

import com.ss.android.ttve.nativePort.TEImageALGCallbackInterface;
import com.ss.android.vesdk.algorithm.model.FAttribute;
import com.ss.android.vesdk.algorithm.model.FAttributeInfo;
import com.ss.android.vesdk.algorithm.model.FDetect;
import com.ss.android.vesdk.algorithm.model.FDetectInfo;

/* loaded from: classes17.dex */
public final class Z90 implements TEImageALGCallbackInterface.FInfoCallback {
    @Override // com.ss.android.ttve.nativePort.TEImageALGCallbackInterface.FInfoCallback
    public final void onResult(FAttributeInfo fAttributeInfo, FDetectInfo fDetectInfo) {
        if (fAttributeInfo != null) {
            new C47631Imh(1);
            FAttribute[] info = fAttributeInfo.getInfo();
            if (info != null) {
                C78857UxB[] c78857UxBArr = new C78857UxB[info.length];
                int length = info.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    FAttribute fAttribute = info[i];
                    int i3 = i2 + 1;
                    c78857UxBArr[i2] = new C78857UxB();
                    if (fAttribute != null) {
                        fAttribute.getAge();
                        fAttribute.getAngryScore();
                        fAttribute.getArousal();
                        fAttribute.getAngryScore();
                        fAttribute.getAttractive();
                        fAttribute.getBlurScore();
                        fAttribute.getBoyProb();
                        fAttribute.getExpProbs();
                        fAttribute.getExpType();
                        fAttribute.getHappyScore();
                        fAttribute.getIllumination();
                        fAttribute.getLipstickProb();
                        fAttribute.getMaskProb();
                        fAttribute.getMustacheProb();
                        fAttribute.getQuality();
                        fAttribute.getRealFaceProb();
                        fAttribute.getSadScore();
                        fAttribute.getSurpriseScore();
                        fAttribute.getValence();
                        fAttribute.getWearGlassProb();
                        fAttribute.getWearHatProb();
                        fAttribute.getWearSunglassProb();
                    }
                    i++;
                    i2 = i3;
                }
            }
        }
        if (fDetectInfo != null && fDetectInfo.getInfo() != null) {
            fDetectInfo.getInfo();
            for (FDetect fDetect : fDetectInfo.getInfo()) {
                new C88551Yp9();
                fDetect.getRect();
                fDetect.getPoints();
                fDetect.getAction();
                fDetect.getED();
                if (fDetect.getFaceExtInfo() != null) {
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                    fDetect.getFaceExtInfo();
                }
                fDetect.getFID();
                fDetect.getPitch();
                fDetect.getPointVisibility();
                fDetect.getRoll();
                fDetect.getYaw();
                fDetect.getScore();
                fDetect.getTrackCount();
            }
        }
        throw null;
    }
}
