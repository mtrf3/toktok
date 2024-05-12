package X;

import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import defpackage.s1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class AVE<I, O> implements C14Q {
    public static final AVE<I, O> LJLIL = new AVE<>();

    @Override // X.C14Q
    public final Object apply(Object obj) {
        List<String> list = (List) obj;
        ArrayList LIZIZ = s1.LIZIZ(list, "uids");
        for (String str : list) {
            RBW.LJLLI.getClass();
            SignificantUserInfo LJIIJ = RBW.LJIIJ(str);
            if (LJIIJ != null) {
                LIZIZ.add(LJIIJ);
            }
        }
        return LIZIZ;
    }
}
