package X;

import com.bytedance.lobby.vk.VkProvider;

/* loaded from: classes12.dex */
public final class QBW implements F6Y {
    public final /* synthetic */ QBY LIZ;
    public final /* synthetic */ F6Y LIZIZ;
    public final /* synthetic */ VkProvider LIZJ;

    @Override // X.F6Y
    public final void onSuccess(String str, boolean z) {
        this.LIZ.splitCompatInstall(this.LIZJ.getApplication());
        this.LIZIZ.onSuccess(str, z);
    }

    public QBW(VkProvider vkProvider, QBY qby, F6Y f6y) {
        this.LIZJ = vkProvider;
        this.LIZ = qby;
        this.LIZIZ = f6y;
    }

    @Override // X.F6Y
    public final void onFailed(String str, boolean z, int i) {
        this.LIZIZ.onFailed(str, z, i);
    }
}
