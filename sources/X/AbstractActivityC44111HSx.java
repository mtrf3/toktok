package X;

import android.os.Bundle;

/* renamed from: X.HSx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractActivityC44111HSx extends AbstractActivityC162676Zz implements InterfaceC42677Goz {
    public boolean LJLJLLL;

    @Override // X.GBO
    public final String LLFZ() {
        return "video_shoot_page";
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity
    public void finish() {
        this.LJLJLLL = false;
        super.finish();
    }

    @Override // X.AbstractActivityC162676Zz, X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        this.LJLJLLL = false;
        super.onDestroy();
    }

    @Override // X.AbstractActivityC162676Zz
    public final C6FB LLIIIJ() {
        if (AnonymousClass668.LIZ()) {
            return C157226Fa.LIZ;
        }
        return C157236Fb.LIZ;
    }

    @Override // X.InterfaceC42677Goz
    public final boolean isRecording() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractActivityC162676Zz, X.GBO, X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJLLL = true;
    }
}
