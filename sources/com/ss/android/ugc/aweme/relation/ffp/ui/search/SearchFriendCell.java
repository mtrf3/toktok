package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.AbstractC13940gg;
import X.C113554cx;
import X.C13930gf;
import X.C16880lQ;
import X.C188627ak;
import X.C214298b3;
import X.C221108m2;
import X.C226668v0;
import X.C227128vk;
import X.C227158vn;
import X.C227168vo;
import X.C227178vp;
import X.C227188vq;
import X.C227198vr;
import X.C227208vs;
import X.C227218vt;
import X.C53691L5j;
import X.C57362MfG;
import X.C57738MlK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78939UyV;
import X.C8UA;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC227268vy;
import X.EnumC53695L5n;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.EnumC57853MnB;
import X.EnumC62195Ob1;
import X.InterfaceC100393wp;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.W5F;
import X.W5G;
import X.W5U;
import X.YE1;
import Y.ACListenerS25S1200000_3;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SearchFriendCell extends PowerCell<C227128vk> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ayg;
    }

    public SearchFriendCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchFriendListVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 845);
        C227188vq c227188vq = C227188vq.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C227168vo.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 846), new AqS153S0100000_3((InterfaceC93923mO) this, 847), C227208vs.INSTANCE, c227188vq, new AqS153S0100000_3((InterfaceC93923mO) this, 848), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C227178vp.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 849), new AqS153S0100000_3((InterfaceC93923mO) this, 840), C227198vr.INSTANCE, c227188vq, new AqS153S0100000_3((InterfaceC93923mO) this, 841), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C227158vn.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 842), new AqS153S0100000_3((InterfaceC93923mO) this, 843), new AqS153S0100000_3((InterfaceC93923mO) this, 844), c227188vq, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 839));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C13930gf.LIZ(itemView, new AbstractC13940gg(this) { // from class: X.8vm
            public InterfaceC65784Pro<String> LJ;
            public final C227138vl LJFF;

            @Override // X.AbstractC13940gg
            public final InterfaceC65784Pro<String> LIZJ() {
                return this.LJ;
            }

            @Override // X.AbstractC13940gg
            public final InterfaceC19530ph LJ() {
                return this.LJFF;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.8vl] */
            {
                this.LJ = new AqS153S0100000_3(this, 838);
                this.LJFF = new InterfaceC19530ph() { // from class: X.8vl
                    @Override // X.InterfaceC19530ph
                    public final void LIZ(View view, String itemID) {
                        java.util.Map LJJJLIIL;
                        o.LJIIIZ(itemID, "itemID");
                        C227128vk item = SearchFriendCell.this.getItem();
                        if (item == null || (LJJJLIIL = item.LJLILLLLZI) == null) {
                            LJJJLIIL = C113554cx.LJJJLIIL();
                        }
                        FMX.LJIIL("search_result_show", LJJJLIIL);
                        C227128vk item2 = SearchFriendCell.this.getItem();
                        if (item2 != null) {
                            SearchFriendCell searchFriendCell = SearchFriendCell.this;
                            EnumC57365MfJ enumC57365MfJ = EnumC57365MfJ.SHOW;
                            searchFriendCell.getClass();
                            SearchFriendCell.L(item2, enumC57365MfJ);
                        }
                    }
                };
            }

            @Override // X.AbstractC13940gg
            public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
                this.LJ = interfaceC65784Pro;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C227128vk c227128vk) {
        int i;
        boolean z;
        C227128vk item = c227128vk;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        List<C227128vk> list = ((C227218vt) this.LJLIL.getValue().getState()).LJLILLLLZI;
        if (list != null) {
            i = list.indexOf(item);
        } else {
            i = -1;
        }
        String valueOf = String.valueOf(i);
        item.LJLILLLLZI.put("rank", valueOf);
        UrlModel urlModel = item.LJLJI;
        if (urlModel == null) {
            ((W5G) this.itemView.findViewById(R.id.ad0)).setActualImageResource(R.drawable.b7n);
        } else {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.ad0);
            LJII.LJIILL = R.drawable.b7n;
            LJII.LJJIII = EnumC62195Ob1.SMALL;
            C16880lQ.LLJJJ(LJII);
        }
        ((C53691L5j) this.itemView.findViewById(R.id.dfe)).setMode(EnumC53695L5n.NONE);
        InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) this.LJLILLLLZI.getValue();
        if (interfaceC100393wp != null) {
            interfaceC100393wp.LJI(item.LJLIL);
        }
        ((TextView) this.itemView.findViewById(R.id.h1e)).setText(item.LJLJJI);
        ((TextView) this.itemView.findViewById(R.id.n1b)).setText(item.LJLJJL);
        MatchedFriendStruct matchedFriendStruct = item.LJLJLJ;
        boolean z2 = true;
        if (matchedFriendStruct != null) {
            MutualStruct mMutualStruct = matchedFriendStruct.getMMutualStruct();
            if (mMutualStruct != null && mMutualStruct.getTotal() > 0) {
                z = true;
                View findViewById = this.itemView.findViewById(R.id.gv1);
                o.LJIIIIZZ(findViewById, "itemView.mutualView");
                findViewById.setVisibility(0);
                View findViewById2 = this.itemView.findViewById(R.id.ipb);
                o.LJIIIIZZ(findViewById2, "itemView.reasonView");
                findViewById2.setVisibility(8);
                ((C188627ak) this.itemView.findViewById(R.id.gv1)).LIZ(mMutualStruct, 4);
            } else {
                z = false;
                View findViewById3 = this.itemView.findViewById(R.id.gv1);
                o.LJIIIIZZ(findViewById3, "itemView.mutualView");
                findViewById3.setVisibility(8);
                View findViewById4 = this.itemView.findViewById(R.id.ipb);
                o.LJIIIIZZ(findViewById4, "itemView.reasonView");
                findViewById4.setVisibility(0);
                C57738MlK c57738MlK = C57738MlK.LIZIZ;
                TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.ipb);
                o.LJIIIIZZ(tuxTextView, "itemView.reasonView");
                c57738MlK.LIZ.LJIIJ(tuxTextView, item.LJLIL, null);
            }
            if (((C188627ak) this.itemView.findViewById(R.id.gv1)).getTvDesc().getVisibility() == 0 && z) {
                ((C188627ak) this.itemView.findViewById(R.id.gv1)).getTvDesc().setMaxLines(3);
            }
            View findViewById5 = this.itemView.findViewById(R.id.he0);
            o.LJIIIIZZ(findViewById5, "itemView.otherTextView");
            findViewById5.setVisibility(8);
        } else {
            if (item.LJLJLLL == EnumC227268vy.MORE_FRIENDS) {
                StringBuilder sb = new StringBuilder();
                String str = item.LJLJJLL;
                if (str != null && str.length() != 0) {
                    sb.append(item.LJLJJLL);
                }
                String str2 = item.LJLJL;
                if (str2 != null && str2.length() != 0) {
                    sb.append(" · ");
                    sb.append(item.LJLJL);
                }
                if (sb.length() == 0) {
                    View findViewById6 = this.itemView.findViewById(R.id.he0);
                    o.LJIIIIZZ(findViewById6, "itemView.otherTextView");
                    findViewById6.setVisibility(8);
                } else {
                    ((TextView) this.itemView.findViewById(R.id.he0)).setText(sb);
                    View findViewById7 = this.itemView.findViewById(R.id.he0);
                    o.LJIIIIZZ(findViewById7, "itemView.otherTextView");
                    findViewById7.setVisibility(0);
                }
            } else {
                View findViewById8 = this.itemView.findViewById(R.id.he0);
                o.LJIIIIZZ(findViewById8, "itemView.otherTextView");
                findViewById8.setVisibility(8);
            }
            View findViewById9 = this.itemView.findViewById(R.id.gv1);
            o.LJIIIIZZ(findViewById9, "itemView.mutualView");
            findViewById9.setVisibility(8);
            View findViewById10 = this.itemView.findViewById(R.id.ipb);
            o.LJIIIIZZ(findViewById10, "itemView.reasonView");
            findViewById10.setVisibility(8);
        }
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.iua);
        C226668v0 c226668v0 = new C226668v0();
        c226668v0.LIZJ(EnumC57853MnB.TUX_NORMAL);
        c226668v0.LJIIIZ = getCurrentLifeCycleOwner();
        c226668v0.LIZ = item.LJLIL;
        if (item.LJLJLJ == null) {
            z2 = false;
        }
        c226668v0.LJIIIIZZ = z2;
        relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        ((RelationButton) this.itemView.findViewById(R.id.iua)).setTracker(new AqS153S0100000_3(item, 1471));
        ((RelationButton) this.itemView.findViewById(R.id.iua)).setFollowClickInterceptor(new C8UA(this, item, null));
        C16880lQ.LJIIJ(new ACListenerS25S1200000_3(item, this, valueOf, 3), this.itemView);
    }

    public static void L(C227128vk c227128vk, EnumC57365MfJ enumC57365MfJ) {
        if (c227128vk.LJLJLJ == null) {
            return;
        }
        Map LJJLIL = C113554cx.LJJLIL(c227128vk.LJLILLLLZI);
        LJJLIL.put("enter_from", "search_result");
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJJJIZL(c227128vk.LJLIL);
        c57362MfG.LJJJI("find_friends_page");
        c57362MfG.LJJLI = EnumC57366MfK.RELATION_LABEL;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        c57362MfG.LIZ(LJJLIL);
        c57362MfG.LJIILIIL();
    }
}
