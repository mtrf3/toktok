package X;

import android.util.AndroidRuntimeException;
import com.ss.android.agilelogger.ALog;
import defpackage.a1;

/* renamed from: X.Fm6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39950Fm6 extends AbstractC39951Fm7 {
    public static long LIZIZ;

    @Override // X.AbstractC39951Fm7
    public final int LIZLLL() {
        return 1;
    }

    public C39950Fm6() {
        try {
            LIZIZ = ALog.getALogSimpleWriteFuncAddr();
        } catch (Throwable unused) {
            C16880lQ.LLLLIIL(new AndroidRuntimeException("Just warning log, No ALog dependency found"));
        }
    }

    @Override // X.InterfaceC39968FmO
    public final boolean LIZIZ(EnumC39953Fm9 enumC39953Fm9, int i) {
        if ((enumC39953Fm9 == EnumC39953Fm9.JAVA && i >= this.LIZ) || (enumC39953Fm9 == EnumC39953Fm9.Native && i == 8)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC39968FmO
    public final void d(String str, String str2) {
        C39048FUe.LIZIZ.LIZ(a1.LJ(str, "_", str2), EnumC39866Fkk.D, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void e(String str, String str2) {
        C39048FUe.LIZIZ.LIZ(a1.LJ(str, "_", str2), EnumC39866Fkk.E, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void i(String str, String str2) {
        C39048FUe.LIZIZ.LIZ(a1.LJ(str, "_", str2), EnumC39866Fkk.I, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void v(String str, String str2) {
        C39048FUe.LIZIZ.LIZ(a1.LJ(str, "_", str2), EnumC39866Fkk.V, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void w(String str, String str2) {
        C39048FUe.LIZIZ.LIZ(a1.LJ(str, "_", str2), EnumC39866Fkk.W, "Lynx");
    }
}
