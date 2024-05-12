package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuO, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91424ZuO<T, R> implements InterfaceC48038ItG {
    public static final C91424ZuO<T, R> LJLIL = new C91424ZuO<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        boolean z;
        o.LJIIIZ(it, "it");
        C91237ZrN.LIZJ(0L);
        File file = new File(C91237ZrN.LIZ());
        if (file.exists()) {
            z = C16880lQ.LLLZZIL(file);
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
