package X;

import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.44f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034544f implements Observer<C1034944j> {
    public final Handler LJLIL = new Handler(C16880lQ.LLJJJJ());
    public final String LJLILLLLZI;
    public int LJLJI;
    public final List<Long> LJLJJI;
    public final int LJLJJL;
    public long LJLJJLL;

    public C1034544f(C99033ud c99033ud) {
        this.LJLILLLLZI = c99033ud.getConversationId();
        List<Long> list = C1036144v.LIZ().typingManualPullTimeList;
        this.LJLJJI = list == null ? C61878OQg.INSTANCE : list;
        this.LJLJJL = r0.size() - 1;
    }

    public final void LIZ(EnumC1035444o enumC1035444o) {
        String str;
        Intent intent;
        android.net.Uri data;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && (intent = topActivity.getIntent()) != null && (data = intent.getData()) != null) {
            str = C39927Flj.LIZJ(data);
        } else {
            str = "";
        }
        if (s.LJJJLZIJ(str, "//im/chat/room", false)) {
            C3AB LIZ = C96423qQ.LIZ();
            C96963rI.LJII().getClass();
            ((C4Z2) LIZ).LJIJI();
            this.LJLJJLL = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fetch by http: ");
            LIZ2.append(enumC1035444o);
            V1B.LJIIZILJ(X1D.LIZIZ(LIZ2));
        }
    }

    public final void LIZIZ(Long l) {
        long currentTimeMillis;
        long currentTimeMillis2;
        Long l2 = (Long) ORZ.LJLLLLLL(this.LJLJI, this.LJLJJI);
        if (l2 != null) {
            long longValue = l2.longValue();
            if (l != null) {
                currentTimeMillis2 = l.longValue();
            } else {
                Long l3 = AnonymousClass449.LJI;
                if (l3 != null) {
                    currentTimeMillis = l3.longValue();
                } else {
                    currentTimeMillis = System.currentTimeMillis();
                }
                currentTimeMillis2 = longValue - (System.currentTimeMillis() - currentTimeMillis);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("delay ");
            LIZ.append(currentTimeMillis2);
            LIZ.append(" to pull");
            V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
            if (currentTimeMillis2 < 0) {
                return;
            }
            Handler handler = this.LJLIL;
            ARunnableS37S0100000_1 aRunnableS37S0100000_1 = new ARunnableS37S0100000_1(this, 143);
            o.LJIIIZ(handler, "<this>");
            handler.postDelayed(aRunnableS37S0100000_1, currentTimeMillis2);
            this.LJLJI++;
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C1034944j c1034944j) {
        long j;
        long j2;
        C1034944j c1034944j2 = c1034944j;
        if (c1034944j2 == null || !o.LJ(c1034944j2.LIZ, this.LJLILLLLZI)) {
            return;
        }
        Object obj = null;
        if (c1034944j2.LIZIZ) {
            if (c1034944j2.LIZLLL) {
                Long l = C1036144v.LIZ().typingExceedTime;
                long j3 = 0;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                Long l2 = c1034944j2.LJ;
                if (l2 != null) {
                    j3 = l2.longValue();
                }
                long j4 = j - j3;
                List list = C1036144v.LIZ().typingManualPullTimeList;
                if (list == null) {
                    list = C61878OQg.INSTANCE;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Number) next).longValue() > j4) {
                        obj = next;
                        break;
                    }
                }
                Long l3 = (Long) obj;
                if (l3 != null) {
                    j2 = l3.longValue();
                } else {
                    j2 = -1;
                }
                List list2 = C1036144v.LIZ().typingManualPullTimeList;
                if (list2 == null) {
                    list2 = C61878OQg.INSTANCE;
                }
                int indexOf = list2.indexOf(Long.valueOf(j2));
                if (indexOf < 0) {
                    return;
                }
                this.LJLJI = indexOf;
                LIZIZ(Long.valueOf(j2 - j4));
                return;
            }
            LIZIZ(null);
            return;
        }
        V1B.LJIIZILJ("remove msg fetcher delay task");
        this.LJLIL.removeCallbacksAndMessages(null);
        this.LJLJI = 0;
    }
}
