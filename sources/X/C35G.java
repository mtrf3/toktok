package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.35G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35G {
    public static final <T> String LIZ(List<? extends T> list) {
        boolean z;
        boolean z2;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String valueOf = String.valueOf(ListProtector.get(list, i));
                if (valueOf.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    sb.append(valueOf);
                    if (i != list.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "builder.toString()");
        return sb2;
    }
}
