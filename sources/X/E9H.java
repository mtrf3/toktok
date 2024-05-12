package X;

import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E9H {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 158));

    public final Keva LIZJ() {
        Object value = this.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        return (Keva) value;
    }

    public final List<C62990Onq> LIZ() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CACHED_CONSENT_RECORDS");
            LIZ.append('_');
            LIZ.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
            return ((E9I) GsonHolder.LIZLLL().LIZ().LJI(LIZJ().getString(X1D.LIZIZ(LIZ), ""), E9I.class)).LJLIL;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public final List<C62990Onq> LIZIZ() {
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CACHED_CONSENT_RECORDS");
            LIZ.append('_');
            LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
            return ((E9I) GsonHolder.LIZLLL().LIZ().LJI(LIZJ().getString(X1D.LIZIZ(LIZ), ""), E9I.class)).LJLIL;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }
}
