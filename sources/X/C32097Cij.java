package X;

import android.os.Handler;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Cij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32097Cij {
    public static final HashSet<EnumC32096Cii> LIZ = new HashSet<>();
    public static final Handler LIZIZ = new Handler(C16880lQ.LLJJJJ());

    public static boolean LIZ(EnumC32096Cii type) {
        o.LJIIIZ(type, "type");
        HashSet<EnumC32096Cii> hashSet = LIZ;
        if (hashSet.contains(type)) {
            return false;
        }
        hashSet.add(type);
        LIZIZ.postDelayed(new RunnableC32098Cik(type), 1000L);
        return true;
    }
}
