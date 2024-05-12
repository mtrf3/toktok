package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4qY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121984qY {
    public static final C121984qY LIZJ = new C121984qY();
    public static final List<String> LIZ = new ArrayList();
    public static final List<Integer> LIZIZ = new ArrayList();

    public final synchronized void LIZ(int i, String msg) {
        o.LJIIIZ(msg, "msg");
        ((ArrayList) LIZ).add(msg);
        ((ArrayList) LIZIZ).add(Integer.valueOf(i));
    }
}
