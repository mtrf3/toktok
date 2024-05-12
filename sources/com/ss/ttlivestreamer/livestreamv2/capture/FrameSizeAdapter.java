package com.ss.ttlivestreamer.livestreamv2.capture;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.ttlivestreamer.livestreamv2.utils.MathUtils;
import java.util.List;

/* loaded from: classes12.dex */
public class FrameSizeAdapter {
    public static TEFrameSizei alignFrameSize(int i, int i2, int i3, int i4) {
        if (i3 <= i && i4 <= i2) {
            return new TEFrameSizei(i, i2);
        }
        return null;
    }

    public static TEFrameSizei getAdaptedFrameSize(List<TEFrameSizei> list, int i, int i2, boolean z) {
        TEFrameSizei alignFrameSize;
        TEFrameSizei alignFrameSize2;
        TEFrameSizei alignFrameSize3;
        int i3;
        if (z) {
            double d = (i2 * 1.0d) / i;
            for (int size = list.size() - 1; size >= 0; size--) {
                TEFrameSizei tEFrameSizei = (TEFrameSizei) ListProtector.get(list, size);
                int i4 = tEFrameSizei.width;
                if (i4 >= i && (i3 = tEFrameSizei.height) >= i2) {
                    if (i4 > i * 2) {
                        break;
                    }
                    if (MathUtils.equals(d, (i3 * 1.0d) / i4)) {
                        return tEFrameSizei;
                    }
                }
            }
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                TEFrameSizei tEFrameSizei2 = (TEFrameSizei) ListProtector.get(list, size2);
                if (tEFrameSizei2.width >= i && tEFrameSizei2.height >= i2) {
                    return tEFrameSizei2;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (TEFrameSizei tEFrameSizei3 : list) {
            int i5 = tEFrameSizei3.width;
            if (i5 == i && tEFrameSizei3.height == i2) {
                return tEFrameSizei3;
            }
            if (i5 == 960) {
                if (tEFrameSizei3.height == 540) {
                    z2 = true;
                }
            } else if (i5 == 1280) {
                if (tEFrameSizei3.height == 720) {
                    z3 = true;
                }
            } else if (i5 == 1920 && tEFrameSizei3.height == 1080) {
                z4 = true;
            }
        }
        if (z2 && (alignFrameSize3 = alignFrameSize(960, 540, i, i2)) != null) {
            return alignFrameSize3;
        }
        if (z3 && (alignFrameSize2 = alignFrameSize(1280, 720, i, i2)) != null) {
            return alignFrameSize2;
        }
        if (!z4 || (alignFrameSize = alignFrameSize(1920, 1080, i, i2)) == null) {
            return null;
        }
        return alignFrameSize;
    }
}
