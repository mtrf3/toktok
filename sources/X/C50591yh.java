package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50591yh extends QXX {
    public final C1OU LJLIL;
    public final String LJLILLLLZI;
    public final C0VS LJLJI;
    public final List<? extends AbstractC08550Vf> LJLJJI;
    public final List<String> LJLJJL;
    public final List<String> LJLJJLL;
    public final List<C50591yh> LJLJL;
    public boolean LJLJLJ;
    public C1OQ LJLJLLL;

    public C50591yh() {
        throw null;
    }

    static {
        C0VW.LIZIZ("WorkContinuationImpl");
    }

    public final C0VZ LLLLZ() {
        if (!this.LJLJLJ) {
            RunnableC20460rC runnableC20460rC = new RunnableC20460rC(this);
            ((C35591aV) this.LJLIL.LIZLLL).LIZ(runnableC20460rC);
            this.LJLJLLL = runnableC20460rC.LJLILLLLZI;
        } else {
            C0VW LIZ = C0VW.LIZ();
            C16880lQ.LLLZ("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.LJLJJL)});
            LIZ.getClass();
        }
        return this.LJLJLLL;
    }

    public static java.util.Set<String> LLLLZLLIL(C50591yh c50591yh) {
        HashSet hashSet = new HashSet();
        List<C50591yh> list = c50591yh.LJLJL;
        if (list != null && !list.isEmpty()) {
            Iterator<C50591yh> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().LJLJJL);
            }
        }
        return hashSet;
    }

    public static boolean LLLLZIL(C50591yh c50591yh, java.util.Set<String> set) {
        set.addAll(c50591yh.LJLJJL);
        java.util.Set<String> LLLLZLLIL = LLLLZLLIL(c50591yh);
        Iterator it = ((HashSet) set).iterator();
        while (it.hasNext()) {
            if (((HashSet) LLLLZLLIL).contains(it.next())) {
                return true;
            }
        }
        List<C50591yh> list = c50591yh.LJLJL;
        if (list != null && !list.isEmpty()) {
            Iterator<C50591yh> it2 = list.iterator();
            while (it2.hasNext()) {
                if (LLLLZIL(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(c50591yh.LJLJJL);
        return false;
    }

    public C50591yh(C1OU c1ou, String str, C0VS c0vs, List list) {
        super((Object) null);
        this.LJLIL = c1ou;
        this.LJLILLLLZI = str;
        this.LJLJI = c0vs;
        this.LJLJJI = list;
        this.LJLJL = null;
        this.LJLJJL = new ArrayList(list.size());
        this.LJLJJLL = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String uuid = ((AbstractC08550Vf) ListProtector.get(list, i)).LIZ.toString();
            ((ArrayList) this.LJLJJL).add(uuid);
            ((ArrayList) this.LJLJJLL).add(uuid);
        }
    }
}
