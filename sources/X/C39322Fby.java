package X;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Fby, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39322Fby implements InterfaceC39320Fbw {
    public final Context LIZ;

    @Override // X.InterfaceC39320Fbw
    public final boolean LIZIZ() {
        return true;
    }

    public C39322Fby(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }

    @Override // X.InterfaceC39320Fbw
    public final C39316Fbs LIZ(C39316Fbs preInstallResult) {
        o.LJIIIZ(preInstallResult, "preInstallResult");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        InstallReferrerClient build = InstallReferrerClient.newBuilder(this.LIZ).build();
        build.startConnection(new C39324Fc0(this, build, preInstallResult, countDownLatch));
        countDownLatch.await();
        return preInstallResult;
    }
}
