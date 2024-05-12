package X;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Fc0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39324Fc0 implements InstallReferrerStateListener {
    public final /* synthetic */ C39322Fby LIZ;
    public final /* synthetic */ InstallReferrerClient LIZIZ;
    public final /* synthetic */ C39316Fbs LIZJ;
    public final /* synthetic */ CountDownLatch LIZLLL;

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C39323Fbz(this, i, null), 2);
    }

    public C39324Fc0(C39322Fby c39322Fby, InstallReferrerClient installReferrerClient, C39316Fbs c39316Fbs, CountDownLatch countDownLatch) {
        this.LIZ = c39322Fby;
        this.LIZIZ = installReferrerClient;
        this.LIZJ = c39316Fbs;
        this.LIZLLL = countDownLatch;
    }
}
