package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.17U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17U implements InterfaceC06370Mv {
    public static C24000wu LIZIZ(C23990wt c23990wt) {
        C24000wu c24000wu = new C24000wu();
        c24000wu.LIZ = true;
        if (c23990wt.LIZLLL == null) {
            c23990wt.LIZLLL = new ArrayList();
        }
        Iterator it = ((ArrayList) c23990wt.LIZLLL).iterator();
        if (!it.hasNext()) {
            if (TextUtils.equals(c23990wt.LJ, "R") && TextUtils.isEmpty(c23990wt.LJI)) {
                c24000wu.LIZ = false;
                c24000wu.LIZIZ("empty_content", new String[0]);
            }
            return c24000wu;
        }
        Object next = it.next();
        new C24000wu();
        next.getClass();
        throw null;
    }

    @Override // X.InterfaceC06370Mv
    public final C24000wu LIZ(C23990wt... c23990wtArr) {
        C24000wu LIZIZ = LIZIZ(c23990wtArr[0]);
        if (c23990wtArr.length > 1) {
            for (C23990wt c23990wt : c23990wtArr) {
                C24000wu LIZIZ2 = LIZIZ(c23990wt);
                if (LIZIZ.LIZLLL == null) {
                    LIZIZ.LIZLLL = new ArrayList();
                }
                ((ArrayList) LIZIZ.LIZLLL).add(LIZIZ2);
            }
        }
        return LIZIZ;
    }
}
