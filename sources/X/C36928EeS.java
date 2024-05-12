package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;

/* renamed from: X.EeS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36928EeS {
    public static boolean LIZ;

    public static void LIZ(Context context) {
        if (LIZ) {
            return;
        }
        C263111n c263111n = C263011m.LIZ;
        C36927EeR c36927EeR = new C36927EeR(context);
        if (!((LinkedList) c263111n.LIZ).contains(c36927EeR)) {
            ListProtector.add(c263111n.LIZ, 0, c36927EeR);
        }
        LIZ = true;
    }
}
