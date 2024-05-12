package com.ss.android.ugc.aweme.paidcontent.ui;

import X.C04270Et;
import X.C16880lQ;
import X.C184077Kh;
import X.C19N;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C254149yE;
import X.C254559yt;
import X.C254579yv;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C71897SJp;
import X.C78926UyI;
import X.FKM;
import X.ORZ;
import X.W5F;
import X.W5U;
import Y.ACListenerS39S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentCollectionListAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PromoteCollectionItemCell extends PowerCell<C254559yt> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 618));
    public final C214378bB LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;

    public PromoteCollectionItemCell() {
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 619);
        this.LJLILLLLZI = new C214378bB(C65352Pkq.LIZ(PaidContentCollectionListAssemViewModel.class), aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C254579yv.INSTANCE, null, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.ibj);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.….promote_item_cell_title)");
        this.LJLJI = (TuxTextView) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.ibn);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.promote_item_status)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.ibm);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.….promote_item_sold_count)");
        this.LJLJJL = (TuxTextView) findViewById3;
    }

    public final void L(CollectionDetailModel collectionDetailModel) {
        View findViewById = this.itemView.findViewById(R.id.ibc);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…_anchor_selection_button)");
        C71897SJp c71897SJp = (C71897SJp) findViewById;
        c71897SJp.setVisibility(0);
        c71897SJp.setClickable(false);
        c71897SJp.setChecked(((C254149yE) ((AssemViewModel) this.LJLILLLLZI.getValue()).getState()).LJLJI.containsKey(Long.valueOf(collectionDetailModel.getCollectionId())));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C254559yt c254559yt) {
        String str;
        int i;
        List<String> urlList;
        C254559yt paidContentCollectionItem = c254559yt;
        o.LJIIIZ(paidContentCollectionItem, "paidContentCollectionItem");
        CollectionDetailModel collectionDetailModel = paidContentCollectionItem.LJLIL;
        L(collectionDetailModel);
        View findViewById = this.itemView.findViewById(R.id.ibl);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.promote_item_image)");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        UrlModel collectionCover = collectionDetailModel.getCollectionCover();
        if (collectionCover == null || (urlList = collectionCover.getUrlList()) == null || (str = (String) ORZ.LJLLLLLL(0, urlList)) == null) {
            str = "";
        }
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            tuxTextView.setText(collectionDetailModel.getCollectionName());
            TuxTextView tuxTextView2 = this.LJLJJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(tuxTextView2.getResources().getString(R.string.qlw));
                Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.e9);
                if (LIZIZ != null) {
                    i = LIZIZ.intValue();
                } else {
                    i = 0;
                }
                tuxTextView2.setTextColor(i);
                tuxTextView2.setBackground(C04270Et.LIZIZ(this.itemView.getContext(), R.drawable.al8));
                tuxTextView2.setTuxFont(62);
                TuxTextView tuxTextView3 = this.LJLJJL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(FKM.LIZJ().getString(R.string.qlv, Integer.valueOf((int) collectionDetailModel.getCollectionSalesNum())));
                    C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, paidContentCollectionItem, 42), this.itemView);
                    return;
                } else {
                    o.LJIJI("collectionItemSoldCount");
                    throw null;
                }
            }
            o.LJIJI("collectionItemStatus");
            throw null;
        }
        o.LJIJI("collectionItemTitle");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), R.layout.aiw, parent, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.view.ViewGroup");
        return LLLLIILL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C254559yt c254559yt, List payloads) {
        C254559yt paidContentCollectionItem = c254559yt;
        o.LJIIIZ(paidContentCollectionItem, "paidContentCollectionItem");
        o.LJIIIZ(payloads, "payloads");
        L(paidContentCollectionItem.LJLIL);
        super.onBindItemView(paidContentCollectionItem, payloads);
    }
}
