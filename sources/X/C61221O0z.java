package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.settings.IGeckoRegister;

/* renamed from: X.O0z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61221O0z {
    public static Pair<String, Boolean> LIZ(Context context, GeckoGlobalConfig.ENVType eNVType, IGeckoRegister iGeckoRegister) {
        boolean z;
        O10 o10 = (O10) iGeckoRegister.getClass().getAnnotation(O10.class);
        if (o10 == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("gecko register failed,reason:GeckoRegister is invalid.env is ");
            LIZ.append(eNVType.name());
            LIZ.append(",register class is ");
            LIZ.append(iGeckoRegister.getClass().getName());
            OC6.LIZLLL("gecko-debug-tag", X1D.LIZIZ(LIZ));
            return null;
        }
        String testAccessKey = o10.testAccessKey();
        String boeAccessKey = o10.boeAccessKey();
        String prodAccessKey = o10.prodAccessKey();
        int i = O11.LIZ[eNVType.ordinal()];
        if (i != 2) {
            if (i == 3) {
                testAccessKey = boeAccessKey;
            }
        } else {
            testAccessKey = prodAccessKey;
        }
        if (TextUtils.isEmpty(testAccessKey)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("gecko register failed,reason:access key is empty.env is ");
            LIZ2.append(eNVType.name());
            LIZ2.append(",register class is ");
            LIZ2.append(iGeckoRegister.getClass().getName());
            OC6.LIZLLL("gecko-debug-tag", X1D.LIZIZ(LIZ2));
            return null;
        }
        java.util.Map<String, OptionCheckUpdateParams.CustomValue> registerCustomParams = iGeckoRegister.registerCustomParams();
        if (registerCustomParams != null && !registerCustomParams.isEmpty()) {
            z = registerCustomParams.containsKey("business_version");
            EBC.LIZ.LJIIIZ(testAccessKey, registerCustomParams);
        } else {
            z = false;
        }
        String registerRootDir = iGeckoRegister.registerRootDir(context);
        if (TextUtils.isEmpty(registerRootDir)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("gecko register failed,reason:root dir is empty.env is ");
            LIZ3.append(eNVType.name());
            LIZ3.append(",register class is ");
            LIZ3.append(iGeckoRegister.getClass().getName());
            OC6.LIZLLL("gecko-debug-tag", X1D.LIZIZ(LIZ3));
        } else {
            C16880lQ.LJJLIL(EBC.LIZ, testAccessKey, registerRootDir);
        }
        return new Pair<>(testAccessKey, Boolean.valueOf(z));
    }
}
