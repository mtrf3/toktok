package X;

import Y.AObserverS65S0200000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.ExtraHeightSessionListViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97463s6 extends C8HS<Object> {
    public static final int LJLLILLLL = (int) KL2.LIZJ(EF7.LIZIZ(), 8.0f);
    public static final int LJLLJ = (int) KL2.LIZJ(EF7.LIZIZ(), 72.0f);
    public final InterfaceC83713Qh LJLIL;
    public final SessionListTopNoticeViewModel LJLILLLLZI;
    public boolean LJLJI;
    public List<C3L4> LJLJJI;
    public AqS148S0200000_1 LJLJJL;
    public EnumC97613sL LJLJJLL;
    public final List<SessionListViewHolder> LJLJL;
    public final java.util.Map<String, LiveData<ActivityStatus>> LJLJLJ;
    public RecyclerView LJLJLLL;
    public int LJLL;
    public final C97483s8 LJLLI;

    public final void LJLLLLLL() {
        LifecycleOwner lifecycleOwner;
        C3L3 c3l3;
        IMUser LJIJI;
        String uid;
        boolean z;
        C3L3 c3l32;
        IMUser LJIJI2;
        String uid2;
        ArrayList arrayList = new ArrayList();
        List<C3L4> list = this.LJLJJI;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        for (Object obj : list) {
            if ((obj instanceof C3L3) && !(obj instanceof C3LK) && (LJIJI2 = (c3l32 = (C3L3) obj).LJIJI()) != null && (uid2 = LJIJI2.getUid()) != null) {
                obj = C3KN.LIZIZ(c3l32, IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().LJIIJ(uid2));
            }
            arrayList2.add(obj);
        }
        List<C3L4> LLJILJILJ = ORZ.LLJILJILJ(ORZ.LLJI(arrayList2));
        this.LJLJJI = LLJILJILJ;
        arrayList.addAll(LLJILJILJ);
        if (!this.LJLJI) {
            AqS148S0200000_1 aqS148S0200000_1 = this.LJLJJL;
            if (aqS148S0200000_1 != null) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJLJJI.isEmpty() && z) {
                ListProtector.add(arrayList, 0, C97393rz.LLIIIILZ);
            }
            if (aqS148S0200000_1 != null) {
                aqS148S0200000_1.invoke();
            }
        }
        if (this.LJLJJLL.getConfig() instanceof AbstractC97583sI) {
            ListProtector.add(arrayList, 0, this.LJLJJLL);
        }
        setData(arrayList);
        RecyclerView recyclerView = this.LJLJLLL;
        if (recyclerView != null && (lifecycleOwner = ViewTreeLifecycleOwner.get(recyclerView)) != null) {
            Iterator it = ((LinkedHashMap) this.LJLJLJ).values().iterator();
            while (it.hasNext()) {
                ((LiveData) it.next()).removeObservers(lifecycleOwner);
            }
            ((LinkedHashMap) this.LJLJLJ).clear();
            if (IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF()) {
                Iterator it2 = arrayList.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        if ((next instanceof C3L3) && !(next instanceof C3LK) && (LJIJI = (c3l3 = (C3L3) next).LJIJI()) != null && (uid = LJIJI.getUid()) != null && !AV1.LJIJI(uid)) {
                            LiveData<ActivityStatus> LIZ = C3B3.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel(), uid, C3BA.INBOX, EnumC112364b2.CHAT_CELL.getValue(), 2);
                            LIZ.observe(lifecycleOwner, new AObserverS65S0200000_1(next, this, 0));
                            java.util.Map<String, LiveData<ActivityStatus>> map = this.LJLJLJ;
                            String LJFF = c3l3.LJFF();
                            o.LJIIIIZZ(LJFF, "session.sessionID");
                            map.put(LJFF, LIZ);
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        LJZ();
    }

    public final boolean LJLZ() {
        List<T> list = this.mmItems;
        if (list == 0 || list.isEmpty()) {
            return true;
        }
        if (list.size() == 1 && (ListProtector.get(list, 0) instanceof C97393rz)) {
            return true;
        }
        return false;
    }

    public final void LJZ() {
        InterfaceC97983sw LIZ = LFH.LIZIZ.LIZLLL().LJIIIIZZ().LIZ();
        int i = 0;
        if (LIZ != null && LIZ.LIZLLL() && !LIZ.LJIIIIZZ()) {
            List<Object> data = getData();
            if (data != null) {
                for (Object obj : data) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.session.BaseSession");
                        if (LIZ.LIZJ(((C3L4) obj).LJFF())) {
                            LJZI(i);
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        LJZI(-1);
    }

    public final void LJZI(int i) {
        int i2 = this.LJLL;
        if (i2 != i) {
            this.LJLL = i;
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            if (i != -1) {
                notifyItemChanged(i);
            }
        }
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        Object obj;
        List<T> list = this.mmItems;
        if (list != 0) {
            obj = ListProtector.get(list, i);
        } else {
            obj = null;
        }
        if (obj instanceof EnumC97613sL) {
            return 10001;
        }
        if (obj instanceof C97393rz) {
            return 10005;
        }
        if (obj instanceof C3L4) {
            return 10002;
        }
        return -1;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJLLL = recyclerView;
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (!(holder instanceof SessionListViewHolder)) {
            return;
        }
        ((SessionListViewHolder) holder).N();
        ((ArrayList) this.LJLJL).add(holder);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (!(holder instanceof SessionListViewHolder)) {
            return;
        }
        ((SessionListViewHolder) holder).U();
        ((ArrayList) this.LJLJL).remove(holder);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.3s8] */
    public C97463s6(C3OA c3oa, SessionListTopNoticeViewModel topNoticeViewModel) {
        super(false, 1, null);
        o.LJIIIZ(topNoticeViewModel, "topNoticeViewModel");
        this.LJLIL = c3oa;
        this.LJLILLLLZI = topNoticeViewModel;
        this.LJLJI = true;
        this.LJLJJI = new ArrayList();
        this.LJLJJLL = EnumC97613sL.EmptyTopNoticeView;
        this.LJLJL = new ArrayList();
        this.LJLJLJ = new LinkedHashMap();
        this.LJLL = -1;
        this.LJLLI = new InterfaceC96843r6() { // from class: X.3s8
            @Override // X.InterfaceC96843r6
            public final void onItemClick(int i) {
                C97463s6.this.LJZI(i);
            }
        };
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        C97533sD c97533sD;
        boolean z;
        int i2;
        o.LJIIIZ(holder, "holder");
        int basicItemViewType = getBasicItemViewType(i);
        int i3 = 0;
        Object obj = null;
        if (basicItemViewType != 10001) {
            if (basicItemViewType == 10002 && (holder instanceof SessionListViewHolder)) {
                SessionListViewHolder sessionListViewHolder = (SessionListViewHolder) holder;
                List<T> list = this.mmItems;
                if (list != 0) {
                    obj = ListProtector.get(list, i);
                }
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.session.BaseSession");
                sessionListViewHolder.P((C3L4) obj, i);
                sessionListViewHolder.LLIIIZ = this.LJLLI;
                sessionListViewHolder.LLIIJI = i;
                if (i == this.LJLL) {
                    z = true;
                } else {
                    z = false;
                }
                View view = sessionListViewHolder.itemView;
                Context context = view.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                int i4 = R.attr.cl;
                if (z) {
                    i2 = R.attr.cv;
                } else {
                    i2 = R.attr.cl;
                }
                Integer LJI = C79045V0n.LJI(i2, context);
                if (LJI != null) {
                    i4 = LJI.intValue();
                }
                view.setBackgroundColor(i4);
            }
        } else if (holder instanceof C97523sC) {
            List<T> list2 = this.mmItems;
            if (list2 != 0) {
                obj = ListProtector.get(list2, i);
            }
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.TopNoticeItem");
            InterfaceC97753sZ config = ((EnumC97613sL) obj).getConfig();
            if ((config instanceof C97533sD) && (c97533sD = (C97533sD) config) != null) {
                ((C97523sC) holder).L("inbox", c97533sD, this.LJLILLLLZI);
            }
        }
        if (!(holder instanceof SessionListViewHolder)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        int i5 = LJLLJ;
        if (i == 0) {
            int i6 = LJLLILLLL;
            i5 += i6;
            i3 = 0 + i6;
        }
        layoutParams.height = i5;
        View view2 = holder.itemView;
        if (view2.getPaddingTop() == i3) {
            return;
        }
        view2.setPadding(view2.getPaddingLeft(), i3, view2.getPaddingRight(), view2.getPaddingBottom());
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        switch (i) {
            case 10001:
                return C97473s7.LIZ(parent);
            case 10002:
                View view = C28289B8j.LIZ(parent, R.layout.b5z, parent, false);
                o.LJIIIIZZ(view, "view");
                return new SessionListViewHolder(view, this.LJLIL);
            case 10003:
                InterfaceC83713Qh callback = this.LJLIL;
                o.LJIIIZ(callback, "callback");
                View view2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.b60, parent, false);
                o.LJIIIIZZ(view2, "view");
                return new ExtraHeightSessionListViewHolder(view2, callback);
            case 10004:
            default:
                final View LIZIZ = C1FL.LIZIZ(parent, R.layout.b5x, parent, false, "from(parent.context)\n   …ty_status, parent, false)");
                return new RecyclerView.ViewHolder(LIZIZ) { // from class: X.3s9
                };
            case 10005:
                final View LIZIZ2 = C1FL.LIZIZ(parent, R.layout.b5x, parent, false, "from(parent.context)\n   …ty_status, parent, false)");
                return new RecyclerView.ViewHolder(LIZIZ2) { // from class: X.3s9
                };
        }
    }
}
