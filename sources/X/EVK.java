package X;

import android.content.Context;
import android.os.Build;

/* loaded from: classes7.dex */
public final class EVK {
    public static EVK LIZJ;
    public final InterfaceC36130EFy LIZ;
    public final EVL LIZIZ;

    public static synchronized EVK LIZJ() {
        EVK evk;
        synchronized (EVK.class) {
            evk = LIZJ;
        }
        return evk;
    }

    public final void LIZ(String str) {
        InterfaceC36130EFy interfaceC36130EFy = this.LIZ;
        if (interfaceC36130EFy != null) {
            interfaceC36130EFy.LIZ();
        }
    }

    public final void LIZIZ(String str) {
        InterfaceC36130EFy interfaceC36130EFy = this.LIZ;
        if (interfaceC36130EFy != null) {
            interfaceC36130EFy.LIZ();
        }
    }

    public EVK(Context context, InterfaceC36130EFy interfaceC36130EFy) {
        EVL evh;
        this.LIZ = interfaceC36130EFy;
        String str = Build.HARDWARE;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cpuboost hardware: ");
        LIZ.append(str);
        LIZ(X1D.LIZIZ(LIZ));
        if (str.startsWith("qcom") || str.startsWith("msm") || str.startsWith("qsc") || str.startsWith("sdm")) {
            LIZ("cpuboost qcm boost");
            evh = new EVH();
        } else if (str.startsWith("mt")) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 28) {
                LIZ("cpuboost mtk boost");
                evh = new EVJ();
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("cpuboost unsupport for MTK Android9: ");
                LIZ2.append(str);
                LIZ2.append(i);
                LIZ(X1D.LIZIZ(LIZ2));
                evh = new C1MA();
            }
        } else if (str.startsWith("kirin") || str.startsWith("hi")) {
            LIZ("cpuboost hisilicon boost");
            evh = new EVI();
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("cpuboost not found boost for: ");
            LIZ3.append(str);
            LIZ(X1D.LIZIZ(LIZ3));
            evh = new C1MA();
        }
        this.LIZIZ = evh;
        evh.LIZIZ(this, context);
    }

    public static synchronized void LIZLLL(Context context, InterfaceC36130EFy interfaceC36130EFy) {
        synchronized (EVK.class) {
            if (LIZJ == null) {
                synchronized (EVK.class) {
                    LIZJ = new EVK(context, interfaceC36130EFy);
                }
            }
        }
    }
}
