package com.ss.android.ugc.aweme.legacy.select;

import X.C16880lQ;
import X.C188627ak;
import X.C1JX;
import X.C221108m2;
import X.C57582Mio;
import X.C57820Mme;
import X.C62822Ol8;
import X.C71897SJp;
import X.C80663Eo;
import X.W5F;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.IDCListenerS141S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecUserSelectCell extends PowerCell<C80663Eo> {
    public SmartAvatarImageView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public C188627ak LJLJJI;
    public C71897SJp LJLJJL;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 678));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.cn4;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        SelectedCardVM selectedCardVM = (SelectedCardVM) this.LJLJJLL.getValue();
        C80663Eo item = getItem();
        o.LJI(item);
        selectedCardVM.getClass();
        String uid = item.LJLIL.getUid();
        if (selectedCardVM.LJLLLL.contains(uid)) {
            return;
        }
        Set<String> set = selectedCardVM.LJLLLL;
        o.LJIIIIZZ(uid, "uid");
        set.add(uid);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C80663Eo c80663Eo) {
        MutualStruct mutualStruct;
        boolean z;
        C80663Eo item = c80663Eo;
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        User user = item.LJLIL;
        TuxTextView tuxTextView = this.LJLILLLLZI;
        if (tuxTextView != null) {
            C57820Mme.LIZIZ(user, tuxTextView);
            SmartAvatarImageView smartAvatarImageView = this.LJLIL;
            if (smartAvatarImageView != null) {
                W5F LJI = C1JX.LJI(user);
                LJI.LJJIIJ = smartAvatarImageView;
                LJI.LIZIZ("RecUser");
                C16880lQ.LLJJJ(LJI);
                TuxTextView tuxTextView2 = this.LJLJI;
                if (tuxTextView2 != null) {
                    C188627ak c188627ak = this.LJLJJI;
                    if (c188627ak != null) {
                        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                        if (matchedFriendStruct == null || (mutualStruct = matchedFriendStruct.getMMutualStruct()) == null) {
                            mutualStruct = user.getMutualStruct();
                        }
                        if (mutualStruct != null && mutualStruct.getTotal() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            tuxTextView2.setVisibility(8);
                            c188627ak.setVisibility(0);
                            c188627ak.LIZ(mutualStruct, 4);
                        } else {
                            c188627ak.setVisibility(8);
                            tuxTextView2.setVisibility(0);
                            C57582Mio.LIZLLL(tuxTextView2, user, null, 6);
                        }
                        C71897SJp c71897SJp = this.LJLJJL;
                        if (c71897SJp != null) {
                            c71897SJp.setChecked(item.LJLILLLLZI);
                            SmartAvatarImageView smartAvatarImageView2 = this.LJLIL;
                            if (smartAvatarImageView2 != null) {
                                C16880lQ.LJJJJL(smartAvatarImageView2, new ACListenerS36S0200000_1(this, user, 31));
                                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 153), this.itemView);
                                C71897SJp c71897SJp2 = this.LJLJJL;
                                if (c71897SJp2 != null) {
                                    c71897SJp2.setOnCheckedChangeListener(new IDCListenerS141S0200000_1(this, item, 1));
                                    return;
                                } else {
                                    o.LJIJI("selectView");
                                    throw null;
                                }
                            }
                            o.LJIJI("avatarView");
                            throw null;
                        }
                        o.LJIJI("selectView");
                        throw null;
                    }
                    o.LJIJI("mutualView");
                    throw null;
                }
                o.LJIJI("reasonView");
                throw null;
            }
            o.LJIJI("avatarView");
            throw null;
        }
        o.LJIJI("nicknameView");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View onCreateItemView = super.onCreateItemView(parent);
        View findViewById = onCreateItemView.findViewById(R.id.abl);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.avatarView)");
        this.LJLIL = (SmartAvatarImageView) findViewById;
        View findViewById2 = onCreateItemView.findViewById(R.id.h19);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.nickNameView)");
        this.LJLILLLLZI = (TuxTextView) findViewById2;
        View findViewById3 = onCreateItemView.findViewById(R.id.ipb);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.reasonView)");
        this.LJLJI = (TuxTextView) findViewById3;
        View findViewById4 = onCreateItemView.findViewById(R.id.gv1);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.mutualView)");
        this.LJLJJI = (C188627ak) findViewById4;
        View findViewById5 = onCreateItemView.findViewById(R.id.jkv);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.selectView)");
        this.LJLJJL = (C71897SJp) findViewById5;
        return onCreateItemView;
    }
}
