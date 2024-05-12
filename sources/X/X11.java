package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class X11 implements Handler.Callback {
    public final WeakReference<EnumC84152X0y> LJLIL;

    public X11(EnumC84152X0y enumC84152X0y) {
        this.LJLIL = new WeakReference<>(enumC84152X0y);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        EnumC84152X0y enumC84152X0y = this.LJLIL.get();
        if (i == 1) {
            C63922P6w.LIZ("TECameraServer", "startZoom...");
            synchronized (enumC84152X0y.mStateLock) {
                if (enumC84152X0y.mCameraInstance != null) {
                    enumC84152X0y.mCameraInstance.LLJZIJLIL(message.arg1 / 100.0f, (InterfaceC87361YQj) obj);
                }
                if (enumC84152X0y.mFirstZoom) {
                    enumC84152X0y.mCameraEvent.LJIIIIZZ(114, 0, "startzoom");
                    enumC84152X0y.mFirstZoom = false;
                }
            }
        }
        return false;
    }
}
