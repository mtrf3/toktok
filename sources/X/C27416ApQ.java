package X;

import Y.IDObjectS326S0100000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.ApQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27416ApQ extends AbstractC27419ApT<C27420ApU> {
    public RecyclerView LJLJJLL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJL;
    public int LJLJLJ;

    public C27416ApQ() {
        super((InterfaceC88471Ynr) null, 3);
        this.LJLJLJ = -1;
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return R.layout.yr;
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    public final void LJZI(String indexName) {
        o.LJIIIZ(indexName, "indexName");
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (C27420ApU c27420ApU : getCurrentList()) {
            if (o.LJ(c27420ApU.LJLIL, indexName)) {
                String index = c27420ApU.LJLIL;
                o.LJIIIZ(index, "index");
                arrayList.add(new C27420ApU(index, true));
                i = arrayList.size() - 1;
            } else {
                String index2 = c27420ApU.LJLIL;
                o.LJIIIZ(index2, "index");
                arrayList.add(new C27420ApU(index2, false));
            }
        }
        submitList(arrayList);
        if (this.LJLJLJ != i && i >= 0) {
            RecyclerView recyclerView = this.LJLJJLL;
            if (recyclerView != null) {
                if (i == 0) {
                    recyclerView.LJLIIIL(0, 0);
                } else {
                    recyclerView.LJLIL(i);
                }
            }
            this.LJLJLJ = i;
        }
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ViewParent parent = recyclerView.getParent();
        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLJJLL = recyclerView;
        Iterator it = new IDObjectS326S0100000_1((ViewGroup) parent, 11).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof RecyclerView) && !o.LJ(next, recyclerView)) {
                return;
            }
        }
    }

    @Override // X.AbstractC27419ApT
    /* renamed from: LJLZ */
    public final void onBindViewHolder(C27422ApW holder, int i) {
        o.LJIIIZ(holder, "holder");
        C27420ApU item = getItem(i);
        ((TextView) holder.itemView.findViewById(R.id.ekz)).setText(item.LJLIL);
        if (item.LJLILLLLZI) {
            holder.itemView.setBackgroundResource(R.drawable.aaq);
            TextView textView = (TextView) holder.itemView.findViewById(R.id.ekz);
            Context context = holder.itemView.getContext();
            o.LJIIIIZZ(context, "holder.itemView.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context));
        } else {
            holder.itemView.setBackgroundResource(0);
            TextView textView2 = (TextView) holder.itemView.findViewById(R.id.ekz);
            Context context2 = holder.itemView.getContext();
            o.LJIIIIZZ(context2, "holder.itemView.context");
            textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context2));
        }
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 38), view);
    }

    @Override // X.AbstractC27419ApT, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        onBindViewHolder((C27422ApW) viewHolder, i);
    }
}
