package X;

import Y.ARunnableS30S0200000_11;
import Y.IDRunnableS6S0101000;
import android.os.Bundle;
import com.bytedance.lobby.vk.VkAuth;

/* loaded from: classes12.dex */
public final class QBX implements F6Y {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ Bundle LIZIZ;
    public final /* synthetic */ VkAuth LIZJ;

    @Override // X.F6Y
    public final void onSuccess(String str, boolean z) {
        ActivityC45651qj activityC45651qj = this.LIZ;
        activityC45651qj.runOnUiThread(new ARunnableS30S0200000_11(this, activityC45651qj, this.LIZIZ, 7));
    }

    public QBX(VkAuth vkAuth, ActivityC45651qj activityC45651qj, Bundle bundle) {
        this.LIZJ = vkAuth;
        this.LIZ = activityC45651qj;
        this.LIZIZ = bundle;
    }

    @Override // X.F6Y
    public final void onFailed(String str, boolean z, int i) {
        this.LIZ.runOnUiThread(new IDRunnableS6S0101000(3, this, 36));
    }
}
