package X;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.QiC, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67736QiC {
    public final Account LIZ;
    public final java.util.Set<Scope> LIZIZ;
    public final java.util.Set<Scope> LIZJ;
    public final java.util.Map<C67718Qhu<?>, C89601ZEn> LIZLLL;
    public final View LJ;
    public final String LJFF;
    public final String LJI;
    public final C67725Qi1 LJII;
    public Integer LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Map] */
    public C67736QiC(Account account, java.util.Set set, C1HQ c1hq, String str, String str2, C67725Qi1 c67725Qi1) {
        java.util.Set<Scope> unmodifiableSet;
        this.LIZ = account;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.LIZIZ = unmodifiableSet;
        C1HQ emptyMap = c1hq == null ? Collections.emptyMap() : c1hq;
        this.LIZLLL = emptyMap;
        this.LJ = null;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = c67725Qi1 == null ? C67725Qi1.LJLIL : c67725Qi1;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = emptyMap.values().iterator();
        while (it.hasNext()) {
            it.next().getClass();
            hashSet.addAll(null);
        }
        this.LIZJ = Collections.unmodifiableSet(hashSet);
    }
}
