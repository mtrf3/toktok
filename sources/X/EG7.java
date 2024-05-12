package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EG7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final EG7 LJLIL = new EG7();

    public EG7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        PackageInfo LLLLLLZ;
        Boolean isFirstLaunch = C38987FRv.LIZLLL();
        o.LJIIIIZZ(isFirstLaunch, "isFirstLaunch");
        if (isFirstLaunch.booleanValue()) {
            try {
                Context LIZIZ = EF7.LIZIZ();
                PackageManager packageManager = LIZIZ.getPackageManager();
                if (packageManager != null && (LLLLLLZ = C16880lQ.LLLLLLZ(packageManager, LIZIZ.getPackageName(), 0)) != null) {
                    C62822Ol8 c62822Ol8 = EG9.LIZLLL;
                    Keva keva = (Keva) c62822Ol8.getValue();
                    String str = EG9.LJ;
                    if (str != null) {
                        if (!keva.contains(str)) {
                            Keva keva2 = (Keva) c62822Ol8.getValue();
                            String str2 = EG9.LJ;
                            if (str2 != null) {
                                keva2.storeLong(str2, LLLLLLZ.firstInstallTime);
                            } else {
                                o.LJIJI("kvKey");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("kvKey");
                        throw null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return Boolean.valueOf(isFirstLaunch.booleanValue());
    }
}
