package X;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.EoO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37544EoO implements Runnable {
    public static final RunnableC37544EoO LJLIL = new RunnableC37544EoO();

    public static void LIZ() {
        C37545EoP c37545EoP = new C37545EoP();
        c37545EoP.LIZ = EF7.LJIIIZ;
        c37545EoP.LIZJ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        c37545EoP.LIZLLL = EF7.LIZ();
        c37545EoP.LJ = EF7.LJIILIIL;
        c37545EoP.LJFF = Build.PRODUCT;
        c37545EoP.LJII = EF7.LJII();
        c37545EoP.LIZIZ = -1L;
        if (c37545EoP.LIZ == 0 || TextUtils.isEmpty(c37545EoP.LIZJ)) {
            return;
        }
        Pattern pattern = C37543EoN.LJIIIIZZ;
        Matcher matcher = pattern.matcher(c37545EoP.LJII);
        if (!matcher.find() || matcher.group(0) == null) {
            return;
        }
        c37545EoP.LJII = matcher.group(0);
        if (c37545EoP.LIZIZ <= 0) {
            c37545EoP.LIZIZ = -1L;
        }
        Matcher matcher2 = pattern.matcher(c37545EoP.LJI);
        if (matcher2.find() && matcher2.group(0) != null) {
            c37545EoP.LJI = matcher2.group(0);
        }
        C37543EoN c37543EoN = new C37543EoN(c37545EoP.LIZJ, c37545EoP.LIZLLL, c37545EoP.LJ, c37545EoP.LJFF, c37545EoP.LJI, c37545EoP.LJII, c37545EoP.LIZ, c37545EoP.LIZIZ);
        InterfaceC37541EoL interfaceC37541EoL = (InterfaceC37541EoL) EXP.LIZIZ(InterfaceC37541EoL.class);
        if (interfaceC37541EoL == null) {
            return;
        }
        interfaceC37541EoL.LIZ(c37543EoN);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
