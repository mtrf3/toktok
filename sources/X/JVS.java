package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JVS extends JVO {
    public final Fragment LJZ;
    public final JIB LJZI;
    public final InterfaceC191547fS LJZL;
    public final C8YF<InterfaceC212998Xn<?, ?>, C8RL> LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;

    @Override // X.JVO, X.C4II
    public final int getBasicItemViewType(int i) {
        SearchMixFeedBase searchMixFeedBase;
        Object obj;
        Integer valueOf;
        List<T> list = this.mmItems;
        if (list != 0 && (searchMixFeedBase = (SearchMixFeedBase) ORZ.LJLLLLLL(i, list)) != null) {
            Iterator it = ((List) this.LLD.getValue()).iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
            } while (!((InterfaceC49264JVc) obj).LJJLIL(searchMixFeedBase));
            InterfaceC49264JVc interfaceC49264JVc = (InterfaceC49264JVc) obj;
            if (interfaceC49264JVc != null && (valueOf = Integer.valueOf(interfaceC49264JVc.LIZ())) != null) {
                return valueOf.intValue();
            }
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.JVO, X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof SearchCardViewHolder) {
            ((SearchCardViewHolder) holder).LJJJJIZL();
        }
    }

    @Override // X.JVO, X.JWN
    public final void LJIJJ(RecyclerView.ViewHolder holder, int i) {
        List<T> list;
        SearchMixFeedBase searchMixFeedBase;
        o.LJIIIZ(holder, "holder");
        super.LJIJJ(holder, i);
        if (!(holder instanceof SearchCardViewHolder) || (list = this.mmItems) == 0 || (searchMixFeedBase = (SearchMixFeedBase) ORZ.LJLLLLLL(i, list)) == null) {
            return;
        }
        ((SearchCardViewHolder) holder).L(i, searchMixFeedBase);
    }

    @Override // X.JVO, X.JWN
    public final RecyclerView.ViewHolder LJJJJL(int i, ViewGroup parent) {
        SearchCardViewHolder LIZIZ;
        o.LJIIIZ(parent, "parent");
        InterfaceC49264JVc interfaceC49264JVc = (InterfaceC49264JVc) ((HashMap) this.LLF.getValue()).get(Integer.valueOf(i));
        if (interfaceC49264JVc == null || (LIZIZ = interfaceC49264JVc.LIZIZ(parent)) == null) {
            return super.LJJJJL(i, parent);
        }
        return LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JVS(Fragment fragment, RecyclerView recyclerView, JW7 container, JV4 jv4, InterfaceC191547fS loadMoreFunction) {
        super(recyclerView, container, jv4, loadMoreFunction);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(loadMoreFunction, "loadMoreFunction");
        this.LJZ = fragment;
        this.LJZI = container;
        this.LJZL = loadMoreFunction;
        this.LL = new C8YF<>(this);
        this.LLD = C221108m2.LIZIZ(new AqS158S0100000_8(this, 696));
        this.LLF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 697));
    }
}
