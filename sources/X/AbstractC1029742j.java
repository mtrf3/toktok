package X;

import Y.ARunnableS12S0300000_1;
import android.os.Handler;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.42j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1029742j extends AbstractC28801Bc<IMMessage, AbstractC1041546x> {
    public RecyclerView LJLIL;
    public final MutableLiveData<java.util.Set<C109544Rq>> LJLILLLLZI;
    public final java.util.Set<AbstractC1041546x> LJLJI;
    public final CopyOnWriteArrayList<InterfaceC1029942l> LJLJJI;
    public final C64962gm LJLJJL;
    public XKQ LJLJJLL;
    public XKQ LJLJL;
    public final AqS167S0100000_1 LJLJLJ;

    public AbstractC1029742j() {
        super(new C56688MMq(0));
        this.LJLILLLLZI = new MutableLiveData<>(OQY.INSTANCE);
        this.LJLJI = new LinkedHashSet();
        this.LJLJJI = new CopyOnWriteArrayList<>();
        this.LJLJJL = C48841JEv.LIZ(C78613UtF.LIZ.plus(T2R.LJIIJJI()));
        this.LJLJLJ = new AqS167S0100000_1(this, 480);
    }

    public final void onPause() {
        Iterator<AbstractC1041546x> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().getClass();
            new Handler(C16880lQ.LLJJJJ()).removeCallbacksAndMessages(null);
        }
    }

    public final void LJLLLLLL(InterfaceC1029942l callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJI.add(callback);
    }

    public final C109544Rq LJLZ(int i) {
        return ((IMMessage) ListProtector.get(getCurrentList(), i)).getMessage();
    }

    public final boolean LJZ(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        List<IMMessage> currentList = getCurrentList();
        o.LJIIIIZZ(currentList, "currentList");
        for (IMMessage iMMessage : currentList) {
            if (iMMessage.getMessage().getMsgId() == msg.getMsgId()) {
                if (iMMessage == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC029409q
    /* renamed from: LJZI, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(AbstractC1041546x holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        this.LJLJI.add(holder);
        holder.onAttachedToWindow();
        if (holder.LJLJJL == 0) {
            Iterator<InterfaceC1029942l> it = this.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().Hp();
            }
        }
        if (holder.LJLJJL == getCurrentList().size() - 1) {
            Iterator<InterfaceC1029942l> it2 = this.LJLJJI.iterator();
            while (it2.hasNext()) {
                it2.next().Og();
            }
        }
        Iterator<InterfaceC1029942l> it3 = this.LJLJJI.iterator();
        while (it3.hasNext()) {
            it3.next().IP(holder);
        }
    }

    public final void LJZL(Collection<? extends C109544Rq> newSelection) {
        o.LJIIIZ(newSelection, "newSelection");
        this.LJLILLLLZI.setValue(ORZ.LLJILLL(newSelection));
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        C109544Rq LJLZ = LJLZ(i);
        EnumC110124Tw.Companion.getClass();
        return C110134Tx.LJFF(LJLZ).getViewType();
    }

    @Override // X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Iterator<InterfaceC1029942l> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().zG(recyclerView);
        }
        this.LJLIL = recyclerView;
    }

    @Override // X.AbstractC029409q
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.LJLIL = null;
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC1041546x holder = (AbstractC1041546x) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        this.LJLJI.remove(holder);
        holder.onDetachedFromWindow();
        Iterator<InterfaceC1029942l> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().QG(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        AbstractC1041546x holder = (AbstractC1041546x) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        holder.LJJJJIZL();
    }

    @Override // X.AbstractC28801Bc
    public final void submitList(List<IMMessage> list) {
        super.submitList(list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.42l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // X.AbstractC28801Bc
    public final void submitList(List<IMMessage> list, Runnable runnable) {
        ?? r2;
        if (list != null) {
            r2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<IMMessage> it = list.iterator();
            while (it.hasNext()) {
                r2.add(it.next().getMessage());
            }
        } else {
            r2 = C61878OQg.INSTANCE;
        }
        Iterator<InterfaceC1029942l> it2 = this.LJLJJI.iterator();
        while (it2.hasNext()) {
            it2.next().ik0(r2);
        }
        super.submitList(list, new ARunnableS12S0300000_1(runnable, this, r2, 18));
    }

    public final void LL(List<? extends C109544Rq> orginalList, boolean z, Runnable runnable) {
        o.LJIIIZ(orginalList, "orginalList");
        XKQ xkq = this.LJLJL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJL = XKX.LIZLLL(this.LJLJJL, null, null, new C1032243i(this, orginalList, null), 3);
        XKQ xkq2 = this.LJLJJLL;
        if (xkq2 != null) {
            xkq2.LIZIZ(null);
        }
        XKQ LIZLLL = XKX.LIZLLL(this.LJLJJL, null, null, new C1029442g(this, orginalList, runnable, null), 3);
        if (z) {
            this.LJLJJLL = LIZLLL;
        }
    }
}
