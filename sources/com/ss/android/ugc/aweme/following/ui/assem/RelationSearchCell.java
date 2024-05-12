package com.ss.android.ugc.aweme.following.ui.assem;

import X.C06490Nh;
import X.C12460eI;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C226668v0;
import X.C57362MfG;
import X.C57806MmQ;
import X.C57807MmR;
import X.C57808MmS;
import X.C57809MmT;
import X.C57810MmU;
import X.C57811MmV;
import X.C57812MmW;
import X.C57813MmX;
import X.C58049MqL;
import X.C58050MqM;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C78939UyV;
import X.C78983UzD;
import X.C9AC;
import X.C9AE;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC112694bZ;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.HG3;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.RBX;
import X.YE1;
import Y.ACListenerS44S0200000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.following.vm.RelationSearchVM;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class RelationSearchCell<ITEM extends C57807MmR> extends PowerCell<C57807MmR> {
    public C71799SFv LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public C58049MqL LJLJJI;
    public RelationButton LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C62822Ol8 LJLJL;

    public final String getEnterFrom() {
        return (String) this.LJLJL.getValue();
    }

    public RelationSearchCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(RelationSearchVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 241);
        C57811MmV c57811MmV = C57811MmV.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C57809MmT.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 242), new AqS159S0100000_9((InterfaceC93923mO) this, 243), C57813MmX.INSTANCE, c57811MmV, new AqS159S0100000_9((InterfaceC93923mO) this, 244), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C57810MmU.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 245), new AqS159S0100000_9((InterfaceC93923mO) this, 236), C57812MmW.INSTANCE, c57811MmV, new AqS159S0100000_9((InterfaceC93923mO) this, 237), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C57808MmS.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 238), new AqS159S0100000_9((InterfaceC93923mO) this, 239), new AqS159S0100000_9((InterfaceC93923mO) this, 240), c57811MmV, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLJJLL = c214298b3;
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9((RelationSearchCell) this, 234));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C9AE.LIZ(this.itemView, C9AC.LIGHT_MASK, 0.0f);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LIZJ(itemView, new C57806MmQ(this));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(C57807MmR t) {
        String uniqueId;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        User user = t.LJLIL;
        C71799SFv c71799SFv = this.LJLIL;
        if (c71799SFv != null) {
            C71799SFv.LJIIJ(c71799SFv, C78939UyV.LJ(user.getAvatarThumb()), null, false, null, 126);
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        String str = "";
        if (tuxTextView != null) {
            if (C78983UzD.LJJJJ(user.getNickname())) {
                uniqueId = user.getNickname();
                o.LJIIIIZZ(uniqueId, "{\n            nickname\n        }");
            } else {
                uniqueId = user.getUniqueId();
                if (uniqueId == null) {
                    uniqueId = "";
                }
            }
            tuxTextView.setText(uniqueId);
        }
        TuxTextView tuxTextView2 = this.LJLJI;
        if (tuxTextView2 != null) {
            String uniqueId2 = user.getUniqueId();
            if (uniqueId2 != null) {
                str = uniqueId2;
            }
            tuxTextView2.setText(str);
        }
        boolean z = false;
        if (user.getMatchedFriendStruct() != null) {
            C58049MqL c58049MqL = this.LJLJJI;
            if (c58049MqL != null) {
                MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                o.LJIIIIZZ(matchedFriendStruct, "matchedFriendStruct");
                c58049MqL.LJJJJ(matchedFriendStruct, C58050MqM.LJI);
            }
            C58049MqL c58049MqL2 = this.LJLJJI;
            if (c58049MqL2 != null) {
                c58049MqL2.setVisibility(0);
            }
        } else {
            C58049MqL c58049MqL3 = this.LJLJJI;
            if (c58049MqL3 != null) {
                c58049MqL3.setVisibility(8);
            }
        }
        if (o.LJ(user.getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
            RelationButton relationButton = this.LJLJJL;
            if (relationButton != null) {
                relationButton.setVisibility(8);
            }
        } else {
            RelationButton relationButton2 = this.LJLJJL;
            if (relationButton2 != null) {
                relationButton2.setVisibility(0);
            }
            RelationButton relationButton3 = this.LJLJJL;
            if (relationButton3 != null) {
                C226668v0 c226668v0 = new C226668v0();
                c226668v0.LIZ = user;
                c226668v0.LIZIZ(EnumC112694bZ.MESSAGE);
                MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
                if (matchedFriendStruct2 != null && matchedFriendStruct2.getRecType() != null) {
                    z = true;
                }
                c226668v0.LJIIIIZZ = z;
                relationButton3.LLIIIJ.LJJJJJL(c226668v0.LIZ());
            }
            RelationButton relationButton4 = this.LJLJJL;
            if (relationButton4 != null) {
                relationButton4.setTracker(new AqS159S0100000_9((RelationSearchCell) this, 766));
            }
        }
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9(user, this, 11), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.c89, viewGroup, false);
        this.LJLIL = (C71799SFv) LIZIZ.findViewById(R.id.ad0);
        this.LJLILLLLZI = (TuxTextView) LIZIZ.findViewById(R.id.h1d);
        this.LJLJI = (TuxTextView) LIZIZ.findViewById(R.id.n1a);
        this.LJLJJI = (C58049MqL) LIZIZ.findViewById(R.id.iuj);
        this.LJLJJL = (RelationButton) LIZIZ.findViewById(R.id.iuh);
        return LIZIZ;
    }

    public final void L(EnumC57365MfJ enumC57365MfJ, User user) {
        if (user.getMatchedFriendStruct() == null) {
            return;
        }
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(getEnterFrom());
        c57362MfG.LJJJ("search_result");
        c57362MfG.LJJLI = EnumC57366MfK.RELATION_LABEL;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJIILIIL();
    }
}
