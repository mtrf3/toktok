package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.WLb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82127WLb {
    public static boolean LJ;
    public static boolean LJFF;
    public boolean LIZ = true;
    public final Context LIZIZ;
    public final InterfaceC83863Wvj LIZJ;
    public final InterfaceC82128WLc LIZLLL;

    public final boolean LIZIZ() {
        return this.LIZLLL.LIZ(this.LIZIZ, this.LIZJ);
    }

    public static boolean LIZ(Context context) {
        if (C82087WJn.LIZ(context).LIZ.getInt("key_camera_shake_mode", 0) == 0) {
            C82087WJn.LIZ(context).LIZ(2);
            LJ = false;
            LJFF = false;
            return false;
        }
        if (C82087WJn.LIZ(context).LIZ.getInt("key_camera_shake_mode", 0) != 1) {
            return false;
        }
        return true;
    }

    public final void LIZJ(boolean z) {
        if (this.LIZLLL.LIZJ() && LIZIZ() && Build.VERSION.SDK_INT >= 23) {
            if (z) {
                this.LIZJ.LJIIZILJ(false);
                C82891Wg3.LIZLLL().d("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(false)");
                return;
            } else {
                this.LIZJ.LJIIZILJ(true);
                C82891Wg3.LIZLLL().d("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(true)");
                return;
            }
        }
        if (LIZIZ() && Build.VERSION.SDK_INT >= 23) {
            if (z) {
                this.LIZJ.LJIIZILJ(false);
            } else {
                this.LIZJ.LJIIZILJ(LIZ(this.LIZIZ));
            }
        }
    }

    public C82127WLb(Context context, InterfaceC83863Wvj interfaceC83863Wvj, InterfaceC82128WLc interfaceC82128WLc) {
        this.LIZIZ = context;
        this.LIZJ = interfaceC83863Wvj;
        this.LIZLLL = interfaceC82128WLc;
    }
}
