package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import java.util.Collections;
import java.util.HashSet;
import m43.u;

/* loaded from: classes12.dex */
public final /* synthetic */ class Q4K implements InterfaceC43240Gy4, InterfaceC65843Psl {
    @Override // X.InterfaceC43240Gy4
    public void LIZIZ() {
    }

    public static java.util.Set LIZLLL() {
        return Collections.synchronizedSet(new HashSet());
    }

    public static String LIZJ(FollowInfo followInfo) {
        return Long.valueOf(followInfo.getFollowStatus()).toString();
    }

    @Override // X.InterfaceC65843Psl
    public void LIZ(boolean z) {
        if (z) {
            u.LJIILIIL = true;
        }
    }

    public static void LJ(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        P4Q.LJFF(str2, X1D.LIZIZ(LIZ));
    }
}
