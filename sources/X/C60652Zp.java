package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.openauthorize.entity.AuthorizedScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.2Zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60652Zp {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i, String str, List authorizedScopes) {
        String LIZIZ;
        o.LJIIIZ(authorizedScopes, "authorizedScopes");
        if (str == null) {
            LIZIZ = ((AuthorizedScope) ListProtector.get(authorizedScopes, i)).getScopeName();
        } else {
            StringBuilder LJFF = C72972SkS.LJFF(str, ',');
            LJFF.append(((AuthorizedScope) ListProtector.get(authorizedScopes, i)).getScopeName());
            LIZIZ = X1D.LIZIZ(LJFF);
        }
        List LJLJJL = s.LJLJJL(LIZIZ, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
        Iterator it = LJLJJL.iterator();
        while (it.hasNext()) {
            arrayList.add(s.LJZI((String) it.next()).toString());
        }
        return ORZ.LLD(ORZ.LLJJ(arrayList), ",", null, null, null, 62);
    }
}
