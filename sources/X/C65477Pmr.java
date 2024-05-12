package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.Pmr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65477Pmr {
    public final String LIZ;

    public C65477Pmr(String str) {
        str.getClass();
        this.LIZ = str;
    }

    public final String LIZ(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(LIZIZ(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.LIZ);
                    sb.append(LIZIZ(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public CharSequence LIZIZ(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public C65477Pmr(C65477Pmr c65477Pmr) {
        this.LIZ = c65477Pmr.LIZ;
    }
}
