package X;

import Y.AfS62S0200000_13;
import Y.AfS65S0100000_13;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Tpz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75863Tpz implements TZR {
    public final TZU LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final List<User> LIZLLL;
    public final java.util.Map<User, InterfaceC92693kP> LJ;
    public int LJFF;
    public C73411SrX LJI;

    @Override // X.TZR
    public final void LIZIZ() {
        this.LJFF = 0;
        ((LinkedList) this.LIZLLL).clear();
    }

    public final User LJFF() {
        User user = null;
        if (!this.LIZLLL.isEmpty()) {
            Iterator<User> it = this.LIZLLL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                User next = it.next();
                if (!((HashMap) this.LJ).keySet().contains(next)) {
                    user = next;
                    break;
                }
            }
            user = user;
            if (user != null) {
                ((LinkedList) this.LIZLLL).remove(user);
                if (LJ(user)) {
                    this.LJFF--;
                }
            }
        }
        return user;
    }

    public C75863Tpz(TZU mListener) {
        o.LJIIIZ(mListener, "mListener");
        this.LIZ = mListener;
        this.LIZLLL = new LinkedList();
        this.LJ = new HashMap();
        this.LIZIZ = 300;
        this.LIZJ = 60;
    }

    public static boolean LJ(User user) {
        if (((int) user.getFollowInfo().getFollowStatus()) == 2) {
            return true;
        }
        return false;
    }

    @Override // X.TZR
    public final void LIZ(User user) {
        if (!LJ(user)) {
            return;
        }
        if (LJ(user)) {
            ListProtector.add(this.LIZLLL, this.LJFF, user);
            this.LJFF++;
        } else {
            ((LinkedList) this.LIZLLL).add(user);
        }
        if (this.LJI == null) {
            if (LJFF() != null) {
                LIZLLL(user);
            }
            this.LJI = (C73411SrX) AbstractC73672Svk.LJJIJIIJI(this.LIZJ, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS65S0100000_13(this, 172));
        }
    }

    @Override // X.TZR
    public final void LIZJ(User user) {
        if (((LinkedList) this.LIZLLL).contains(user)) {
            ((LinkedList) this.LIZLLL).remove(user);
            if (LJ(user)) {
                this.LJFF--;
            }
        }
    }

    public final void LIZLLL(User user) {
        this.LIZ.LJJJ(user);
        ((HashMap) this.LJ).put(user, AbstractC73672Svk.LJJLIIIJLJLI(this.LIZIZ, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS62S0200000_13(this, user, 53)));
    }
}
