package X;

import android.os.Message;

/* renamed from: X.I6z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46089I6z implements InterfaceC133855Nd {
    public final /* synthetic */ C46074I6k LIZ;

    public C46089I6z(C46074I6k c46074I6k) {
        this.LIZ = c46074I6k;
    }

    @Override // X.InterfaceC133855Nd
    public final void onProgress(float f) {
        Message obtain = Message.obtain();
        obtain.what = 1002;
        obtain.obj = Float.valueOf(f);
        this.LIZ.LJIIL.sendMessage(obtain);
    }
}
