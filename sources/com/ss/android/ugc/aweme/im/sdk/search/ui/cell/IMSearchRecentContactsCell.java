package com.ss.android.ugc.aweme.im.sdk.search.ui.cell;

import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C33I;
import X.C34B;
import X.C65352Pkq;
import X.C65776Prg;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.SYL;
import X.X1D;
import X.Y9I;
import X.Y9J;
import X.Y9K;
import X.Y9L;
import X.Y9M;
import X.Y9N;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.search.viewmodel.IMSearchDefaultVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IMSearchRecentContactsCell extends PowerCell<C33I> {
    public final C214298b3 LJLIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        View view = this.itemView;
        ((TextView) view.findViewById(R.id.lao)).setText(view.getContext().getString(R.string.hfa));
        ((TextView) view.findViewById(R.id.beb)).setText(view.getContext().getString(R.string.hf6));
        C16880lQ.LJJJJI((TuxTextView) view.findViewById(R.id.beb), new ACListenerS21S0100000_1(this, 102));
        ((SYL) view.findViewById(R.id.ipn)).LLLF.LJZL(IMSearchSimpleCommonCell.class);
        ((SYL) view.findViewById(R.id.ipn)).setOrientation(0);
        ((RecyclerView) view.findViewById(R.id.ipn)).setItemAnimator(null);
        C34B.LJI("IMSearchRecentContactsCell", "onItemViewCreated");
    }

    public IMSearchRecentContactsCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(IMSearchDefaultVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 432);
        Y9L y9l = Y9L.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9J.INSTANCE, new AqS165S0100000_15(this, 433), new AqS165S0100000_15(this, 434), Y9N.INSTANCE, y9l, new AqS165S0100000_15(this, 435), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9K.INSTANCE, new AqS165S0100000_15(this, 436), new AqS165S0100000_15(this, 427), Y9M.INSTANCE, y9l, new AqS165S0100000_15(this, 428), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, Y9I.INSTANCE, new AqS165S0100000_15(this, 429), new AqS165S0100000_15(this, 430), new AqS165S0100000_15(this, 431), y9l, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C34B.LJI("IMSearchRecentContactsCell", "unBind");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C33I c33i) {
        C33I t = c33i;
        o.LJIIIZ(t, "t");
        View view = this.itemView;
        ((SYL) view.findViewById(R.id.ipn)).getState().LJIIJJI(t.LJLIL);
        ((RecyclerView) view.findViewById(R.id.ipn)).LJLI(0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBindItemView list size ");
        LIZ.append(t.LJLIL.size());
        C34B.LJI("IMSearchRecentContactsCell", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5m, viewGroup, false, "from(parent.context).inf…_contacts, parent, false)");
    }
}
