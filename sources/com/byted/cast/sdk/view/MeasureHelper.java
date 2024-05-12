package com.byted.cast.sdk.view;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes29.dex */
public class MeasureHelper {
    public int mCurrentAspectRatio;
    public int mMeasuredHeight;
    public int mMeasuredWidth;
    public int mVideoHeight;
    public int mVideoRotationDegree;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    public WeakReference<View> mWeakView;

    public static String getAspectRatioText(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "N/A" : "4:3 / Fit parent" : "16:9 / Fit parent" : "Free / Fill parent" : "Aspect / Wrap content" : "Aspect / Fill parent" : "Aspect / Fit parent";
    }

    public View getView() {
        WeakReference<View> weakReference = this.mWeakView;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public int getMeasuredHeight() {
        return this.mMeasuredHeight;
    }

    public int getMeasuredWidth() {
        return this.mMeasuredWidth;
    }

    public MeasureHelper(View view) {
        this.mWeakView = new WeakReference<>(view);
    }

    public void setAspectRatio(int i) {
        this.mCurrentAspectRatio = i;
    }

    public void setVideoRotation(int i) {
        this.mVideoRotationDegree = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r0 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r11 = (int) (r7 / r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        r10 = (int) (r6 * r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r0 != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sdk.view.MeasureHelper.doMeasure(int, int):void");
    }

    public void setVideoSampleAspectRatio(int i, int i2) {
        this.mVideoSarNum = i;
        this.mVideoSarDen = i2;
    }

    public void setVideoSize(int i, int i2) {
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
    }
}
