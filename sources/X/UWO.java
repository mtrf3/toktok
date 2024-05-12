package X;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UWO implements InterfaceC32418Cnu {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(UWB.LJLIL);
    public final String LIZIZ;

    @Override // X.InterfaceC32418Cnu
    public final String LIZ() {
        return this.LIZIZ;
    }

    public UWO(Context context) {
        String absolutePath = context.getDir("assets", 0).getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "context.getDir(STORAGE_D…ODE_PRIVATE).absolutePath");
        this.LIZIZ = absolutePath;
    }

    @Override // X.InterfaceC32418Cnu
    public final String LIZIZ(C32420Cnw request) {
        o.LJIIIZ(request, "request");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZIZ);
        String str = File.separator;
        C1DI.LIZIZ(LIZ, str, "gift_list", str);
        return JBR.LJFF(LIZ, request.LIZ, ".json", LIZ);
    }
}
