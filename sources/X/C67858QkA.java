package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: X.QkA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67858QkA extends AbstractC67789Qj3<C67930QlK> {
    public final C67911Ql1 LLIIIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 203400000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIIZI() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        C67911Ql1 c67911Ql1 = this.LLIIIL;
        c67911Ql1.getClass();
        Bundle bundle = new Bundle();
        String str = c67911Ql1.LJLIL;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // X.AbstractC67863QkF
    public final Feature[] LJJ() {
        return C67933QlN.LIZIZ;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C67930QlK) {
            return queryLocalInterface;
        }
        return new C67930QlK(iBinder);
    }

    public C67858QkA(Context context, Looper looper, C67736QiC c67736QiC, C67911Ql1 c67911Ql1, InterfaceC67784Qiy interfaceC67784Qiy, InterfaceC67712Qho interfaceC67712Qho) {
        super(context, looper, 270, c67736QiC, interfaceC67784Qiy, interfaceC67712Qho);
        this.LLIIIL = c67911Ql1;
    }
}
