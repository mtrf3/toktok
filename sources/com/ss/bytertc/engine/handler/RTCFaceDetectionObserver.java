package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.InternalExpressDetectInfo;
import com.ss.bytertc.engine.InternalRectangle;
import com.ss.bytertc.engine.video.ExpressionDetectInfo;
import com.ss.bytertc.engine.video.ExpressionDetectResult;
import com.ss.bytertc.engine.video.FaceDetectionResult;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.RTCVideoEffect;
import com.ss.bytertc.engine.video.Rectangle;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class RTCFaceDetectionObserver {
    public WeakReference<RTCVideoEffect> mVideoEffect;

    public RTCFaceDetectionObserver(RTCVideoEffect rTCVideoEffect) {
        this.mVideoEffect = new WeakReference<>(rTCVideoEffect);
    }

    public void OnExpressionDetectResult(int i, int i2, InternalExpressDetectInfo[] internalExpressDetectInfoArr) {
        RTCVideoEffect rTCVideoEffect;
        IFaceDetectionObserver faceDetectionObserver;
        WeakReference<RTCVideoEffect> weakReference = this.mVideoEffect;
        if (weakReference == null || (rTCVideoEffect = weakReference.get()) == null || (faceDetectionObserver = rTCVideoEffect.getFaceDetectionObserver()) == null) {
            return;
        }
        ExpressionDetectResult expressionDetectResult = new ExpressionDetectResult();
        expressionDetectResult.detectResult = i;
        if (i == 0) {
            if (internalExpressDetectInfoArr != null && i2 > 0) {
                expressionDetectResult.detectInfo = new ExpressionDetectInfo[i2];
                expressionDetectResult.faceCount = i2;
                int i3 = 0;
                do {
                    InternalExpressDetectInfo internalExpressDetectInfo = internalExpressDetectInfoArr[i3];
                    expressionDetectResult.detectInfo[i3] = new ExpressionDetectInfo(internalExpressDetectInfo.age, internalExpressDetectInfo.boyProb, internalExpressDetectInfo.attractive, internalExpressDetectInfo.happyScore, internalExpressDetectInfo.sadScore, internalExpressDetectInfo.angryScore, internalExpressDetectInfo.surpriseScore, internalExpressDetectInfo.arousal, internalExpressDetectInfo.valence);
                    i3++;
                } while (i3 < i2);
            } else {
                expressionDetectResult.detectInfo = null;
            }
        } else {
            expressionDetectResult.detectInfo = null;
        }
        faceDetectionObserver.onExpressionDetectResult(expressionDetectResult);
    }

    public void OnFaceDetectResult(int i, int i2, int i3, int i4, InternalRectangle[] internalRectangleArr, long j) {
        RTCVideoEffect rTCVideoEffect;
        IFaceDetectionObserver faceDetectionObserver;
        WeakReference<RTCVideoEffect> weakReference = this.mVideoEffect;
        if (weakReference == null || (rTCVideoEffect = weakReference.get()) == null || (faceDetectionObserver = rTCVideoEffect.getFaceDetectionObserver()) == null) {
            return;
        }
        FaceDetectionResult faceDetectionResult = new FaceDetectionResult();
        faceDetectionResult.imageWidth = i2;
        faceDetectionResult.imageHeight = i3;
        faceDetectionResult.frameTimestampUs = j;
        faceDetectionResult.detectResult = i;
        if (internalRectangleArr != null && internalRectangleArr.length > 0) {
            faceDetectionResult.faces = new Rectangle[internalRectangleArr.length];
            for (int i5 = 0; i5 < i4; i5++) {
                Rectangle[] rectangleArr = faceDetectionResult.faces;
                InternalRectangle internalRectangle = internalRectangleArr[i5];
                rectangleArr[i5] = new Rectangle(internalRectangle.x, internalRectangle.y, internalRectangle.width, internalRectangle.height);
            }
        } else {
            faceDetectionResult.faces = null;
        }
        faceDetectionObserver.onFaceDetectResult(faceDetectionResult);
    }
}
