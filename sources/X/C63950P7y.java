package X;

import com.ss.android.vesdk.runtime.VERuntime;

/* renamed from: X.P7y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C63950P7y implements P81 {
    public final /* synthetic */ VERuntime LIZ;

    public C63950P7y(VERuntime vERuntime) {
        this.LIZ = vERuntime;
    }

    @Override // X.P81
    public final void onException(Throwable th) {
        P85 p85 = this.LIZ.mVEExceptionMonitorListener;
        if (p85 != null) {
            p85.onException(th);
        }
    }
}
