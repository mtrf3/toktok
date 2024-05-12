package X;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.7XH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7XH implements LLE {
    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onTabChanged from ");
        LIZ.append(str2);
        LIZ.append(" to ");
        LIZ.append(str);
        LIZ.append(' ');
        LIZ.append(bundle);
        C7XD.LIZ("NowsAwemeFromReturnModel", X1D.LIZIZ(LIZ));
        if (o.LJ(str2, "FRIENDS_TAB")) {
            C7XI from = C7XI.CHANGE_TAB;
            o.LJIIIZ(from, "from");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("resetLastReturnAid ");
            LIZ2.append(from);
            C7XD.LIZ("NowsAwemeFromReturnModel", X1D.LIZIZ(LIZ2));
            ((ArrayList) C7XK.LIZ).clear();
        }
    }
}
