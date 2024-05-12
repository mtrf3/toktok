package X;

import android.graphics.Picture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public final class TC2 extends Handler {
    public final Picture LIZ;

    public TC2(Looper looper) {
        super(looper);
        Picture picture;
        try {
            picture = new Picture();
        } catch (RuntimeException unused) {
            picture = null;
        }
        this.LIZ = picture;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Layout layout;
        if (this.LIZ == null) {
            return;
        }
        try {
            if (message.what != 0 || (layout = (Layout) ((WeakReference) message.obj).get()) == null) {
                return;
            }
            layout.draw(this.LIZ.beginRecording(layout.getWidth(), layout.getHeight()));
            this.LIZ.endRecording();
        } catch (Exception unused) {
        }
    }
}
