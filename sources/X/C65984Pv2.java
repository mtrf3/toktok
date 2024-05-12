package X;

import android.text.Editable;
import android.util.Pair;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.sdk.HeliosEnvImpl;

/* renamed from: X.Pv2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65984Pv2 implements InterfaceC39518Ff8 {
    @Override // X.InterfaceC39518Ff8
    public final C39519Ff9 preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C65300Pk0 c65300Pk0) {
        int i2;
        SettingsModel settingsModel = HeliosEnvImpl.get().LJIIJ;
        if (settingsModel.ignoreApiIds.contains(Integer.valueOf(i)) || settingsModel.apiWhiteList.contains(c65300Pk0.LIZLLL) || settingsModel.ignoreClasses.contains(c65300Pk0.LIZLLL)) {
            return new C39519Ff9(null, false);
        }
        C65955PuZ LIZ = C65986Pv4.LIZ(i);
        if (LIZ != null && "around".equals(LIZ.LJIIIIZZ)) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        Pair<Boolean, Object> LIZ2 = C66117PxB.LIZ(null, obj, objArr, i, str3, c65300Pk0, i2, str, str2);
        return new C39519Ff9(LIZ2.second, ((Boolean) LIZ2.first).booleanValue());
    }

    @Override // X.InterfaceC39518Ff8
    public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C65300Pk0 c65300Pk0, boolean z) {
        int i2 = i;
        Object obj3 = obj2;
        SettingsModel settingsModel = HeliosEnvImpl.get().LJIIJ;
        if (settingsModel.ignoreApiIds.contains(Integer.valueOf(i2)) || settingsModel.apiWhiteList.contains(c65300Pk0.LIZLLL) || settingsModel.ignoreClasses.contains(c65300Pk0.LIZLLL)) {
            return;
        }
        if (i2 == 104000 && (obj3 instanceof Editable)) {
            obj3 = obj3.toString();
        }
        switch (i2) {
            case 100101:
                i2 = 100106;
                break;
            case 100201:
                i2 = 100205;
                break;
            case 100401:
                i2 = 100404;
                break;
            case 100403:
                i2 = 100405;
                break;
        }
        C66117PxB.LIZ(obj3, obj, objArr, i2, "", c65300Pk0, 3, str, str2);
    }
}
