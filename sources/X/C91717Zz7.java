package X;

import android.content.Intent;
import kotlin.jvm.internal.o;

/* renamed from: X.Zz7, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91717Zz7 {
    public final android.net.Uri LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        if (this.LIZ != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(this.LIZ));
        }
        if (this.LIZIZ != null) {
            sb.append(" action=");
            sb.append(this.LIZIZ);
        }
        if (this.LIZJ != null) {
            sb.append(" mimetype=");
            sb.append(this.LIZJ);
        }
        sb.append(" }");
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public C91717Zz7(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public C91717Zz7(android.net.Uri uri, String str, String str2) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
