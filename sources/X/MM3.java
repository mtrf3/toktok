package X;

import android.content.Intent;
import com.bytedance.router.AbsOpenResultCallback;
import kotlin.jvm.internal.AqS24S0010000_9;

/* loaded from: classes10.dex */
public final class MM3 extends AbsOpenResultCallback {
    @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
    public final void onFail(String str, String str2) {
    }

    @Override // com.bytedance.router.AbsOpenResultCallback, com.bytedance.router.OpenResultCallback
    public final void onSuccess(Intent intent) {
        MS5.LJ(new AqS24S0010000_9(false, 2));
    }
}
