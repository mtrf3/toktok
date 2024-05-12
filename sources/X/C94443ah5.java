package X;

import android.graphics.Bitmap;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.log.ILog;
import kotlin.jvm.internal.o;

/* renamed from: X.ah5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94443ah5 extends AbstractC85293Wj {
    public final /* synthetic */ InterfaceC67352kd LJLIL;

    public C94443ah5(C84654XKg c84654XKg) {
        this.LJLIL = c84654XKg;
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        InterfaceC67352kd interfaceC67352kd = this.LJLIL;
        C3C5.m7constructorimpl(bitmap);
        interfaceC67352kd.resumeWith(bitmap);
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
        String str;
        if (th == null || (str = th.getMessage()) == null) {
            str = "";
        }
        ILog iLog = (ILog) C93892aYC.LIZ(ILog.class);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[CKE]::");
        LIZ.append("CKE-editor");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String stackTraceString = android.util.Log.getStackTraceString(new Throwable(str));
        o.LJIIIIZZ(stackTraceString, "Log.getStackTraceString(Throwable(msg))");
        iLog.d(LIZIZ, stackTraceString);
        InterfaceC67352kd interfaceC67352kd = this.LJLIL;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }
}
