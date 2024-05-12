package X;

import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi;
import com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Fn1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40007Fn1 implements ICrashSdkApi {
    public static final C40007Fn1 LIZIZ = new C40007Fn1();
    public final /* synthetic */ ICrashSdkApi LIZ = CrashSdkImpl.LJ();

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final Application.ActivityLifecycleCallbacks LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZLLL(context);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi
    public final void ensureNotReachHere(Throwable throwable, String str) {
        o.LJIIIZ(throwable, "throwable");
        this.LIZ.ensureNotReachHere(throwable, str);
    }
}
