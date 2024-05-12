package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.Feature;

/* renamed from: X.Zm6, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90910Zm6 extends AbstractC67789Qj3<C90821Zkf> {
    public static final C90469Zez LLIIL = new C90469Zez("CastClientImplCxless");
    public final CastDevice LLIIIL;
    public final long LLIIIZ;
    public final Bundle LLIIJI;
    public final String LLIIJLIL;

    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final int LJIILJJIL() {
        return 19390000;
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIJZLJL() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // X.AbstractC67863QkF
    public final String LJJIIZ() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // X.AbstractC67863QkF
    public final boolean LJJIJIIJIL() {
        return true;
    }

    @Override // X.AbstractC67863QkF
    public final Bundle LJJII() {
        Bundle bundle = new Bundle();
        LLIIL.getClass();
        CastDevice castDevice = this.LLIIIL;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.LLIIIZ);
        bundle.putString("connectionless_client_record_id", this.LLIIJLIL);
        Bundle bundle2 = this.LLIIJI;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC67863QkF, X.InterfaceC67836Qjo
    public final void LIZLLL() {
        try {
            ((C90821Zkf) LJJIIJ()).j();
        } catch (RemoteException | IllegalStateException unused) {
            LLIIL.getClass();
        } finally {
            super.LIZLLL();
        }
    }

    @Override // X.AbstractC67863QkF
    public final Feature[] LJJ() {
        return C90069ZWn.LJ;
    }

    @Override // X.AbstractC67863QkF
    public final /* synthetic */ IInterface LJIJJLI(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof C90821Zkf) {
            return queryLocalInterface;
        }
        return new C90821Zkf(iBinder);
    }

    public C90910Zm6(Context context, Looper looper, C67736QiC c67736QiC, CastDevice castDevice, long j, Bundle bundle, String str, InterfaceC67706Qhi interfaceC67706Qhi, InterfaceC67707Qhj interfaceC67707Qhj) {
        super(context, looper, 10, c67736QiC, interfaceC67706Qhi, interfaceC67707Qhj);
        this.LLIIIL = castDevice;
        this.LLIIIZ = j;
        this.LLIIJI = bundle;
        this.LLIIJLIL = str;
    }
}
