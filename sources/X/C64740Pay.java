package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import defpackage.s1;

/* renamed from: X.Pay, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64740Pay implements M2Y {
    @Override // X.M2Y
    public final boolean LIZJ() {
        return s1.LIZLLL("isFirstInstallAndFirstLaunch()");
    }

    @Override // X.M2Y
    public final int LIZIZ() {
        return C46538IOg.LIZJ;
    }

    @Override // X.M2Y
    public final void LIZ(int i) {
        EnumC64749Pb7 enumC64749Pb7;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    enumC64749Pb7 = EnumC64749Pb7.NormalStart;
                } else {
                    enumC64749Pb7 = EnumC64749Pb7.HotStart;
                }
            } else {
                enumC64749Pb7 = EnumC64749Pb7.WarmStart;
            }
        } else {
            enumC64749Pb7 = EnumC64749Pb7.ColdStart;
        }
        try {
            C64770PbS.LIZ = enumC64749Pb7;
            int value = enumC64749Pb7.getValue();
            C64758PbG.LIZJ.set(System.currentTimeMillis() / 1000);
            if (value != 0) {
                if (value != 1) {
                    if (value != 2) {
                        C64758PbG.LIZ = EnumC64750Pb8.NormalStart;
                    } else {
                        C64758PbG.LIZ = EnumC64750Pb8.WarmStart;
                    }
                } else {
                    C64758PbG.LIZ = EnumC64750Pb8.HotStart;
                }
            } else {
                C64758PbG.LIZ = EnumC64750Pb8.ColdStart;
            }
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null) {
                int i2 = enumC64749Pb7.LJLIL;
                Logger.debug();
                if (i2 >= 0 && i2 <= 2) {
                    Reflect.on(iCronetClient).call("setAppStartUpState", new Class[]{Integer.TYPE}, Integer.valueOf(i2)).get();
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
