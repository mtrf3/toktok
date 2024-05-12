package X;

import com.tiktok.ttm.TTMParamData;

/* loaded from: classes12.dex */
public class PTH {
    public static PTH LIZ() {
        if (!TTMParamData.DEBUG) {
            return null;
        }
        PTH pth = new PTH();
        System.nanoTime();
        return pth;
    }
}
