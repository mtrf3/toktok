package X;

import com.bytedance.librarian.LibrarianMonitor;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FFF extends LibrarianMonitor {
    @Override // com.bytedance.librarian.LibrarianMonitor
    public final void LIZ(String libName) {
        o.LJIIIZ(libName, "libName");
        System.loadLibrary(libName);
    }
}
