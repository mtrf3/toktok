package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.EZi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class HandlerC36634EZi extends Handler {
    public final boolean LIZ;

    public HandlerC36634EZi(Looper looper) {
        super(looper);
        this.LIZ = true;
        if (Build.VERSION.SDK_INT < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                this.LIZ = false;
            }
            obtain.recycle();
        }
    }
}
