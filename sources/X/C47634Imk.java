package X;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Imk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47634Imk {
    public static C47634Imk LJI;
    public final Context LIZ;
    public C31426CVa LIZLLL;
    public volatile boolean LJFF;
    public final List<InterfaceC47635Iml> LIZJ = new ArrayList();
    public volatile int LJ = 65280;
    public final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());

    public final boolean LIZIZ() {
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        if ((this.LJ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        if ((this.LJ & 2) != 0) {
            return true;
        }
        return false;
    }

    public C47634Imk(Context context) {
        this.LIZ = C16880lQ.LLLLL(context);
    }

    public final int LIZ(Context context) {
        if (C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 4L) && !this.LJFF) {
            return 1;
        }
        try {
            AudioManager audioManager = (AudioManager) C16880lQ.LLILL(context, "audio");
            if (audioManager == null) {
                C78253UnR.LIZLLL("HeadsetStateMonitor", "AudioManager is null");
                return 65280;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && i != 25) {
                AudioDeviceInfo[] devices = audioManager.getDevices(2);
                int i2 = 0;
                for (AudioDeviceInfo audioDeviceInfo : devices) {
                    if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 4) {
                        i2 |= 1;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("wired device: ");
                        LIZ.append((Object) audioDeviceInfo.getProductName());
                        TTVideoEngineLog.d("HeadsetStateMonitor", X1D.LIZIZ(LIZ));
                    }
                    if (audioDeviceInfo.getType() == 8 || audioDeviceInfo.getType() == 7) {
                        i2 |= 2;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("bluetooth device: ");
                        LIZ2.append((Object) audioDeviceInfo.getProductName());
                        TTVideoEngineLog.d("HeadsetStateMonitor", X1D.LIZIZ(LIZ2));
                    }
                }
                return i2;
            }
            boolean isWiredHeadsetOn = audioManager.isWiredHeadsetOn();
            if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
                return (isWiredHeadsetOn ? 1 : 0) | 2;
            }
            return isWiredHeadsetOn ? 1 : 0;
        } catch (Throwable unused) {
            return 65280;
        }
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        if (((ArrayList) this.LIZJ).isEmpty()) {
            return;
        }
        for (int i = 0; i < ((ArrayList) this.LIZJ).size(); i++) {
            try {
                InterfaceC47635Iml interfaceC47635Iml = (InterfaceC47635Iml) ListProtector.get(this.LIZJ, i);
                if (interfaceC47635Iml != null) {
                    if (!LIZIZ() && !LIZJ()) {
                        z2 = false;
                        interfaceC47635Iml.LIZ(z2, z);
                    }
                    z2 = true;
                    interfaceC47635Iml.LIZ(z2, z);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
    }

    public final void LJ(int i) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnected, ");
        LIZ.append(i);
        TTVideoEngineLog.d("HeadsetStateMonitor", X1D.LIZIZ(LIZ));
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        int i2 = this.LJ | i;
        if (i2 == this.LJ) {
            return;
        }
        this.LJ = i2;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL(z);
    }

    public final void LJFF(int i) {
        TTVideoEngineLog.d("HeadsetStateMonitor", "onDisconnected");
        if (this.LJ == 65280) {
            this.LJ = LIZ(this.LIZ);
        }
        int i2 = (~i) & this.LJ;
        if (i2 == this.LJ) {
            return;
        }
        this.LJ = i2;
        LIZLLL(LIZJ());
    }

    public static void LJI(Handler handler, Runnable runnable) {
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
