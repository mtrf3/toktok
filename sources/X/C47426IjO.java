package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.setting.model.MLModel;

/* renamed from: X.IjO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47426IjO implements InterfaceC47110IeI {
    @Override // X.InterfaceC47110IeI
    public final Integer LIZ() {
        int i;
        MLModel mLModel = C47436IjY.LIZIZ.LIZ;
        if (mLModel == null) {
            return null;
        }
        int[] iArr = mLModel.params;
        if (iArr != null && iArr.length > 0) {
            i = iArr[0];
        } else {
            i = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        }
        return Integer.valueOf(i);
    }
}
