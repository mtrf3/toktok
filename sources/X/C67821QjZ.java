package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.TelemetryData;

/* renamed from: X.QjZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67821QjZ implements InterfaceC67935QlP {
    public final Object LJLIL;

    public /* synthetic */ C67821QjZ(TelemetryData telemetryData) {
        this.LJLIL = telemetryData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC67935QlP
    public final void LIZ(InterfaceC67836Qjo interfaceC67836Qjo, Object obj) {
        TelemetryData telemetryData = (TelemetryData) this.LJLIL;
        C67649Qgn c67649Qgn = (C67649Qgn) obj;
        C67901Qkr c67901Qkr = (C67901Qkr) ((AbstractC67863QkF) interfaceC67836Qjo).LJJIIJ();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(c67901Qkr.LJLILLLLZI);
        if (telemetryData == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            telemetryData.writeToParcel(obtain, 0);
        }
        try {
            c67901Qkr.LJLIL.transact(1, obtain, null, 1);
            obtain.recycle();
            c67649Qgn.LIZIZ(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
