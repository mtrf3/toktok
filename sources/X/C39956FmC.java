package X;

import android.util.AndroidRuntimeException;
import com.ss.android.agilelogger.ALog;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.FmC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39956FmC extends AbstractC39951Fm7 {
    public static long LIZLLL;
    public final InterfaceC60276NlA LIZIZ;
    public final InterfaceC60323Nlv LIZJ;

    @Override // X.AbstractC39951Fm7
    public final int LIZLLL() {
        return 1;
    }

    public C39956FmC(InterfaceC60323Nlv serviceToken) {
        o.LJIIJ(serviceToken, "serviceToken");
        this.LIZJ = serviceToken;
        this.LIZIZ = (InterfaceC60276NlA) serviceToken.getService(InterfaceC60276NlA.class);
        try {
            LIZLLL = ALog.getALogSimpleWriteFuncAddr();
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
        this.LIZJ.printLog(a1.LJ(str, "_", str2), EnumC39958FmE.D, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void e(String str, String str2) {
        this.LIZJ.printLog(a1.LJ(str, "_", str2), EnumC39958FmE.E, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void i(String str, String str2) {
        this.LIZJ.printLog(a1.LJ(str, "_", str2), EnumC39958FmE.I, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void v(String str, String str2) {
        this.LIZJ.printLog(a1.LJ(str, "_", str2), EnumC39958FmE.V, "Lynx");
    }

    @Override // X.InterfaceC39968FmO
    public final void w(String str, String str2) {
        this.LIZJ.printLog(a1.LJ(str, "_", str2), EnumC39958FmE.W, "Lynx");
    }
}
