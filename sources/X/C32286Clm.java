package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Clm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32286Clm implements InterfaceC32418Cnu {
    public final String LIZ;
    public final String LIZIZ;

    @Override // X.InterfaceC32418Cnu
    public final String LIZ() {
        return this.LIZ;
    }

    public C32286Clm(Context context) {
        o.LJIIIZ(context, "context");
        String absolutePath = context.getDir("assets", 0).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "context.getDir(\"assets\",…ODE_PRIVATE).absolutePath");
        this.LIZ = absolutePath;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIIL(context).getAbsolutePath());
        this.LIZIZ = JBR.LJFF(LIZ, File.separator, "gift_assets", LIZ);
    }

    @Override // X.InterfaceC32418Cnu
    public final String LIZIZ(C32420Cnw request) {
        o.LJIIIZ(request, "request");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        String str = File.separator;
        LIZ.append(str);
        return JBR.LJFF(LIZ, request.LJ, str, LIZ);
    }
}
