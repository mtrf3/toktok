package X;

import android.content.ContentValues;
import android.content.Intent;
import com.bytedance.pumbaa.hybrid.monitor.HybridMonitorServiceImpl;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService;
import com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;

/* renamed from: X.Feu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39504Feu implements InterfaceC66203PyZ {
    @Override // X.InterfaceC66203PyZ
    public final void LIZIZ(android.net.Uri uri, ContentValues[] contentValuesArr, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LIZJ(android.net.Uri uri, ContentValues contentValues, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LIZLLL(Intent intent, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJ(Intent intent, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJFF(Intent intent, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJI(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJII(android.net.Uri uri, ContentValues contentValues, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJIIIIZZ(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final void LJIIIZ(Intent intent, Throwable th) {
    }

    @Override // X.InterfaceC66203PyZ
    public final String name() {
        return "ActivityListener";
    }

    @Override // X.InterfaceC66203PyZ
    public final boolean LIZ(Intent intent, Throwable th) {
        Boolean LIZ;
        IHybridMonitorService LJIIIIZZ = HybridMonitorServiceImpl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.LIZ(intent, th);
        }
        IRaspService LJIIIIZZ2 = RaspServiceImpl.LJIIIIZZ();
        if (LJIIIIZZ2 != null && (LIZ = LJIIIIZZ2.LIZ(intent, th)) != null) {
            return LIZ.booleanValue();
        }
        return false;
    }
}
