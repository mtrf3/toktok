package X;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import kotlin.jvm.internal.o;

/* renamed from: X.Is9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47969Is9 {
    public final C47966Is6 LIZ;

    public final String LIZ() {
        String str;
        C47966Is6 c47966Is6 = this.LIZ;
        if (Build.VERSION.SDK_INT < 24) {
            c47966Is6.getClass();
            return "NOT_SUPPORTED";
        }
        synchronized (c47966Is6.LJIIIIZZ) {
            str = c47966Is6.LIZJ;
        }
        return str;
    }

    public final int LIZIZ() {
        int i;
        Integer valueOf;
        C47966Is6 c47966Is6 = this.LIZ;
        synchronized (c47966Is6) {
            if ("WIFI".equals(c47966Is6.LIZLLL) && c47966Is6.LJI == -2) {
                try {
                    InterfaceC47972IsC interfaceC47972IsC = c47966Is6.LJIIZILJ;
                    if (interfaceC47972IsC != null) {
                        WifiManager receiver$0 = ((C47970IsA) interfaceC47972IsC).LIZ;
                        o.LJIIJ(receiver$0, "receiver$0");
                        WifiInfo LIZ = C47975IsF.LIZ(receiver$0);
                        if (LIZ != null && (valueOf = Integer.valueOf(LIZ.getFrequency())) != null) {
                            c47966Is6.LJI = valueOf.intValue();
                        }
                    }
                } catch (Throwable unused) {
                    return c47966Is6.LJI;
                }
            }
            i = c47966Is6.LJI;
        }
        return i;
    }

    public C47969Is9(Context context, C47970IsA c47970IsA) {
        this.LIZ = null;
        synchronized (C47966Is6.LJIJI) {
            if (C47966Is6.LJIJJ == null) {
                C47966Is6.LJIJJ = new C47966Is6(context);
            }
        }
        C47966Is6 c47966Is6 = C47966Is6.LJIJJ;
        this.LIZ = c47966Is6;
        c47966Is6.LJIIZILJ = c47970IsA;
    }
}
