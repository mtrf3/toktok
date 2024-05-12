package X;

import Y.ACallableS108S0100000_5;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.lang.ref.WeakReference;

/* renamed from: X.CdB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31753CdB implements InterfaceC31143CKd {
    public static String LIZIZ;
    public WeakReference<InterfaceC31146CKg> LIZ;

    @Override // X.InterfaceC31143CKd
    public final String get() {
        String str = LIZIZ;
        if (str != null) {
            return str;
        }
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        if (context != null) {
            LIZIZ = (String) C29889BoD.LIZIZ(context).LIZLLL("hardware_info_cpu_soc", EnumC29921Boj.STRING, null);
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC31143CKd
    public final void LIZ(InterfaceC31146CKg interfaceC31146CKg) {
        this.LIZ = new WeakReference<>(interfaceC31146CKg);
        C78583Usl.LJI().LIZ(new ACallableS108S0100000_5(this, 5));
    }
}
