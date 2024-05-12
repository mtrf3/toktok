package X;

import Y.IDCallbackS369S0100000_15;
import android.hardware.Camera;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Y5z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86831Y5z {
    public static final Collection<String> LJI;
    public boolean LIZ;
    public volatile boolean LIZIZ;
    public final boolean LIZJ;
    public final Camera LIZLLL;
    public final Handler LJ;
    public final Y6F LJFF;

    public final synchronized void LIZ() {
        if (!this.LIZ && !this.LJ.hasMessages(1)) {
            Handler handler = this.LJ;
            handler.sendMessageDelayed(handler.obtainMessage(1), 5000L);
        }
    }

    public final void LIZIZ() {
        this.LIZ = true;
        this.LIZIZ = false;
        this.LJ.removeMessages(1);
        if (this.LIZJ) {
            try {
                this.LIZLLL.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        LJI = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C86831Y5z(Camera camera, VK2 vk2) {
        new ArrayList(1);
        IDCallbackS369S0100000_15 iDCallbackS369S0100000_15 = new IDCallbackS369S0100000_15(this, 3);
        Y6F y6f = new Y6F(this);
        this.LJFF = y6f;
        this.LJ = new Handler(iDCallbackS369S0100000_15);
        this.LIZLLL = camera;
        String focusMode = camera.getParameters().getFocusMode();
        vk2.getClass();
        boolean contains = ((ArrayList) LJI).contains(focusMode);
        this.LIZJ = contains;
        this.LIZ = false;
        if (contains && !this.LIZIZ) {
            try {
                camera.autoFocus(y6f);
                this.LIZIZ = true;
            } catch (RuntimeException unused) {
                LIZ();
            }
        }
    }
}
