package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0n7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17930n7 {
    public final String LIZ;
    public C17930n7 LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        for (C17930n7 c17930n7 = this.LIZIZ; c17930n7 != null; c17930n7 = c17930n7.LIZIZ) {
            sb.append("/");
            sb.append(c17930n7.LIZ);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "path.toString()");
        return sb2;
    }

    public C17930n7(String path) {
        o.LJIIIZ(path, "path");
        this.LIZ = path;
    }
}
