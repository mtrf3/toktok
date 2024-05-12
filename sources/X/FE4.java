package X;

import android.app.Activity;
import android.content.Context;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FE4 {
    public final FE5 LIZ(int i, Context context, C38620FDs c38620FDs, FEH feh) {
        Integer valueOf;
        boolean z;
        boolean z2;
        String uuid = UUID.randomUUID().toString();
        o.LJFF(uuid, "UUID.randomUUID().toString()");
        Activity LIZJ = C109434Rf.LIZJ(context);
        String str = null;
        if (LIZJ != null) {
            valueOf = Integer.valueOf(LIZJ.hashCode());
        } else {
            Context LLLLL = C16880lQ.LLLLL(context);
            if (LLLLL != null) {
                valueOf = Integer.valueOf(LLLLL.hashCode());
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot get hashcode for context : ");
            LIZ.append(this);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (LIZJ != null) {
                z = true;
            } else {
                z = false;
            }
            String LJJIIJZLJL = C38891fp.LJJIIJZLJL(i);
            if (feh != null) {
                z2 = true;
                str = feh.getType();
            } else {
                z2 = false;
            }
            return new FE5(i, LJJIIJZLJL, uuid, c38620FDs, 1, intValue, z, z2, str);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Cannot get hashcode for context : ");
        LIZ2.append(this);
        throw new IllegalStateException(X1D.LIZIZ(LIZ2));
    }
}
