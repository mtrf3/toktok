package com.ss.bytertc.engine;

import com.ss.bytertc.engine.data.Quaternionf;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IPanoramicVideo;

/* loaded from: classes33.dex */
public class NativePanoramicVideo implements IPanoramicVideo {
    public long mNaiveInstance;

    public static native int nativeUpdateQuaternionf(long j, float f, float f2, float f3, float f4);

    public void release() {
        this.mNaiveInstance = 0L;
    }

    public NativePanoramicVideo(long j) {
        this.mNaiveInstance = j;
    }

    @Override // com.ss.bytertc.engine.video.IPanoramicVideo
    public int updateQuaternionf(Quaternionf quaternionf) {
        long j = this.mNaiveInstance;
        if (j == 0) {
            LogUtil.e("NativePanoramicVideo}", "native Panoramic is invalid, updateQuaternionf failed.");
            return -1;
        }
        return nativeUpdateQuaternionf(j, quaternionf.x, quaternionf.y, quaternionf.z, quaternionf.w);
    }
}
