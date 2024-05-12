package X;

import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.44d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1034344d implements InterfaceC1029942l, InterfaceC1032043g {
    public final C99033ud LJLIL;
    public final C1034144b LJLILLLLZI;
    public final C1034444e LJLJI;
    public final C1034744h LJLJJI = new C1034744h(this);
    public final C1036444y LJLJJL;
    public final C1034244c LJLJJLL;
    public final C1034844i LJLJL;
    public final List<AnonymousClass456> LJLJLJ;
    public RecyclerView LJLJLLL;

    @Override // X.InterfaceC1029942l
    public final void Hp() {
    }

    @Override // X.InterfaceC1029942l
    public final void Og() {
    }

    public final java.util.Map<String, Integer> LIZIZ() {
        return this.LJLJI.LIZIZ();
    }

    public final int LIZJ() {
        int i;
        RecyclerView recyclerView = this.LJLJLLL;
        int i2 = 0;
        if (recyclerView != null) {
            i = recyclerView.getHeight();
        } else {
            i = 0;
        }
        RecyclerView recyclerView2 = this.LJLJLLL;
        if (recyclerView2 != null) {
            i2 = recyclerView2.getPaddingBottom();
        }
        return i - i2;
    }

    @Override // X.InterfaceC1029942l
    public final void Ah(AbstractC89473fD event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC1029942l
    public final void IP(AbstractC1041546x viewHolder) {
        String str;
        o.LJIIIZ(viewHolder, "viewHolder");
        C1034244c c1034244c = this.LJLJJLL;
        C109544Rq c109544Rq = viewHolder.LJZI;
        c1034244c.getClass();
        if (C93793mB.LJIILLIIL(c109544Rq)) {
            c1034244c.LIZIZ = true;
        }
        C1036444y c1036444y = this.LJLJJL;
        C109544Rq c109544Rq2 = viewHolder.LJZI;
        c1036444y.getClass();
        if (c109544Rq2 != null) {
            C96963rI.LIZ().getClass();
            if (C89163ei.LIZLLL(c109544Rq2) && c1036444y.LIZJ) {
                c1036444y.LIZJ = false;
                List LJIJJLI = C78555UsJ.LJIJJLI(c1036444y.LIZ);
                if (LJIJJLI != null) {
                    C1034344d c1034344d = c1036444y.LIZIZ;
                    c1034344d.getClass();
                    C1034744h c1034744h = c1034344d.LJLJJI;
                    c1034744h.getClass();
                    C1DH.LJJIJIIJIL(50L, new ARunnableS20S0200000_1(c1034744h, LJIJJLI, 51));
                }
            }
        }
        C1034144b c1034144b = this.LJLILLLLZI;
        c1034144b.getClass();
        C109544Rq c109544Rq3 = viewHolder.LJZI;
        if (c109544Rq3 != null) {
            if (C93793mB.LJIIJJI(c109544Rq3) && C93793mB.LJIILIIL(c109544Rq3) && c1034144b.LIZJ.LJLJL.LIZJ) {
                C109544Rq LJIJJ = C78555UsJ.LJIJJ(c1034144b.LIZ);
                if (LJIJJ != null) {
                    str = LJIJJ.getUuid();
                } else {
                    str = null;
                }
                if (o.LJ(str, c109544Rq3.getUuid())) {
                    c1034144b.LIZIZ(Long.valueOf(c109544Rq3.getOrderIndex()), false);
                }
            }
            Long l = c1034144b.LIZLLL;
            if (l != null && l.longValue() == 1000 && o.LJ(C78555UsJ.LJIJJ(c1034144b.LIZ), c109544Rq3)) {
                c1034144b.LIZIZ(Long.valueOf(c109544Rq3.getOrderIndex()), true);
            }
        }
        this.LJLJI.LJI(viewHolder.itemView, viewHolder.LJZI, false);
        if ((viewHolder instanceof C97083rU) || (C93793mB.LJIILIIL(viewHolder.LJZI) && this.LJLJL.LIZJ)) {
            C1034744h c1034744h2 = this.LJLJJI;
            C99033ud sessionInfo = this.LJLIL;
            c1034744h2.getClass();
            o.LJIIIZ(sessionInfo, "sessionInfo");
            if (!c1034744h2.LIZLLL && sessionInfo.getDisableLocateMsgWhenEnter()) {
                c1034744h2.LIZLLL = true;
                C1DH.LJJIJIIJIL(50L, new ARunnableS37S0100000_1(c1034744h2, 107));
            }
        }
    }

    public final void LJ(EnumC1035144l type) {
        o.LJIIIZ(type, "type");
        this.LJLJJI.LIZIZ(type);
    }

    @Override // X.InterfaceC1029942l
    public final void QG(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
        C1034244c c1034244c = this.LJLJJLL;
        C109544Rq c109544Rq = viewHolder.LJZI;
        c1034244c.getClass();
        if (C93793mB.LJIILLIIL(c109544Rq)) {
            c1034244c.LIZIZ = false;
        }
    }

    @Override // X.InterfaceC1029942l
    public final void Vj(List<? extends C109544Rq> list) {
        Integer num;
        o.LJIIIZ(list, "list");
        C1034744h c1034744h = this.LJLJJI;
        c1034744h.getClass();
        if (!c1034744h.LIZJ) {
            c1034744h.LIZJ = true;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("scrollMsgAfterSubmitList: lastMsgType:");
            C109544Rq c109544Rq = (C109544Rq) ORZ.LJLLLL(list);
            if (c109544Rq != null) {
                num = Integer.valueOf(c109544Rq.getMsgType());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(" size:");
            LIZ.append(list.size());
            V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
            LIZLLL(c1034744h.LIZ, EnumC1035144l.TO_BOTTOM_WHEN_INIT, 3);
            C1DH.LJJIJIIJIL(50L, new ARunnableS20S0200000_1(c1034744h, list, 51));
        }
    }

    @Override // X.InterfaceC1029942l
    public final void ik0(List<? extends C109544Rq> list) {
        o.LJIIIZ(list, "list");
    }

    @Override // X.InterfaceC1029942l
    public final void rD(AbstractC1041546x viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
    }

    @Override // X.InterfaceC1029942l
    public final void zG(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJLLL = recyclerView;
    }

    public C1034344d(C99033ud c99033ud, ChatRoomViewModel chatRoomViewModel) {
        LifecycleOwner LIZIZ;
        this.LJLIL = c99033ud;
        this.LJLILLLLZI = new C1034144b(chatRoomViewModel, c99033ud, this);
        this.LJLJI = new C1034444e(chatRoomViewModel, this);
        this.LJLJJL = new C1036444y(chatRoomViewModel, this);
        C1034244c c1034244c = new C1034244c(this);
        this.LJLJJLL = c1034244c;
        C1034844i c1034844i = new C1034844i(this);
        this.LJLJL = c1034844i;
        List<AnonymousClass456> LJJIJIIJI = C47261Igj.LJJIJIIJI(c1034244c, c1034844i, new C1035244m(this), new C1035044k(chatRoomViewModel, this));
        this.LJLJLJ = LJJIJIIJI;
        for (AnonymousClass456 anonymousClass456 : LJJIJIIJI) {
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null && (LIZIZ = C57434MgQ.LIZIZ(topActivity)) != null) {
                anonymousClass456.LIZ(LIZIZ);
            }
        }
    }

    @Override // X.InterfaceC1029942l
    public final void s50(AbstractC1041546x holder, C109544Rq c109544Rq) {
        o.LJIIIZ(holder, "holder");
        this.LJLJI.getClass();
        if (holder instanceof C45J) {
            C45J c45j = (C45J) holder;
            C97343ru.LIZJ(c45j.LLIIIJ, null, 0, 7);
            C97343ru.LIZJ(c45j.LLIIIL, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), null, 13);
        }
    }

    public static void LIZLLL(C1034344d c1034344d, EnumC1035144l type, int i) {
        c1034344d.getClass();
        o.LJIIIZ(type, "type");
        c1034344d.LJLJJI.LIZ(0, 0, type);
    }

    @Override // X.InterfaceC1032043g
    public final void LIZ(int i, int i2, String str) {
        C1034444e c1034444e = this.LJLJI;
        int i3 = c1034444e.LIZLLL;
        c1034444e.LIZLLL = i2;
        if (i != 0 && i3 != i2) {
            C97343ru.LIZIZ(c1034444e.LIZIZ.LJLJLLL, new AqS167S0100000_1(c1034444e, SubscriptionIconHideTextMinimumDimensionSetting.DEFAULT));
            if (c1034444e.LIZLLL > i3) {
                C1DH.LJJIJIIJIL(0L, new ARunnableS37S0100000_1(c1034444e, 108));
            }
        }
    }
}
