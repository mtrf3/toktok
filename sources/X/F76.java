package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F76 implements F3J {
    public final /* synthetic */ File LJLIL;

    @Override // X.F3J
    public final void LIZ(String msg) {
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.F3J
    public final void onSuccess() {
        C16880lQ.LLLZZIL(this.LJLIL);
    }

    public F76(File file) {
        this.LJLIL = file;
    }
}
