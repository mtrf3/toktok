package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6Pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159866Pe {
    public final List<C6PN<?>> LIZ;
    public final C159816Oz LIZIZ;

    public final C6PN<?> LIZ(EnumC157656Gr type) {
        C6PN<?> c6pn;
        o.LJIIIZ(type, "type");
        Iterator<C6PN<?>> it = this.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                c6pn = it.next();
                if (c6pn.LIZLLL() == type) {
                    break;
                }
            } else {
                c6pn = null;
                break;
            }
        }
        C6PN<?> c6pn2 = c6pn;
        if (c6pn2 != null) {
            return c6pn2;
        }
        throw new Exception("component not find");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C159866Pe(List<? extends C6PN<?>> stickerComponents, C159816Oz stickerConfig) {
        o.LJIIIZ(stickerComponents, "stickerComponents");
        o.LJIIIZ(stickerConfig, "stickerConfig");
        this.LIZ = stickerComponents;
        this.LIZIZ = stickerConfig;
    }
}
