package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.ElF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37349ElF {
    public final java.util.Set<String> LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C37349ElF(Collection collection) {
        HashSet hashSet;
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        int LJIJ = C78842Uww.LJIJ(V0Q.Default, new C40517FvF(43, 128));
        List LLIIJI = ORZ.LLIIJI('~', ORZ.LLIIJI('_', ORZ.LLIIJI('.', ORZ.LLIIJI('-', ORZ.LLIIIZ(new C36960Eey('0', '9'), ORZ.LLIIIL(new C36960Eey('a', 'z'), new C36960Eey('A', 'Z')))))));
        ArrayList arrayList = new ArrayList(LJIJ);
        for (int i = 0; i < LJIJ; i++) {
            arrayList.add(Character.valueOf(((Character) ORZ.LLIIJLIL(LLIIJI, V0Q.Default)).charValue()));
        }
        String LLD = ORZ.LLD(arrayList, "", null, null, null, 62);
        if (LIZ.length() == 0 || s.LJJLIIIJJIZ(LIZ, ' ', 0, false, 6) >= 0 || !C65838Psg.LIZIZ(LLD)) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (collection != null) {
            hashSet = new HashSet(collection);
        } else {
            hashSet = new HashSet();
        }
        hashSet.add("openid");
        java.util.Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        o.LJIIIIZZ(unmodifiableSet, "unmodifiableSet(permissions)");
        this.LIZ = unmodifiableSet;
        this.LIZIZ = LIZ;
        this.LIZJ = LLD;
    }
}
