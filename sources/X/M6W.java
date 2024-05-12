package X;

import Y.ARunnableS9S0301000_9;
import android.os.Bundle;
import com.bytedance.lobby.vk.VkAuth;

/* loaded from: classes10.dex */
public final class M6W implements F6Y {
    public final /* synthetic */ ActivityC45651qj LIZ;
    public final /* synthetic */ Bundle LIZIZ;
    public final /* synthetic */ VkAuth LIZJ;

    @Override // X.F6Y
    public final void onSuccess(String str, boolean z) {
        ActivityC45651qj activityC45651qj = this.LIZ;
        activityC45651qj.runOnUiThread(new ARunnableS9S0301000_9(0, this.LIZIZ, this, activityC45651qj, 0));
    }

    public M6W(VkAuth vkAuth, ActivityC45651qj activityC45651qj, Bundle bundle) {
        this.LIZJ = vkAuth;
        this.LIZ = activityC45651qj;
        this.LIZIZ = bundle;
    }

    @Override // X.F6Y
    public final void onFailed(String str, boolean z, int i) {
        this.LIZ.runOnUiThread(new RunnableC23230vf(3, this));
    }
}
