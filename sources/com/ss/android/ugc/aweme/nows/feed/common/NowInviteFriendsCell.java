package com.ss.android.ugc.aweme.nows.feed.common;

import X.C184077Kh;
import X.C214378bB;
import X.C214528bQ;
import X.C41310GJe;
import X.C58449Mwn;
import X.C59062Tm;
import X.C62725OjZ;
import X.C65352Pkq;
import X.C78926UyI;
import X.EnumC41309GJd;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.friendlist.InviteFriendVM;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NowInviteFriendsCell extends PowerCell<C59062Tm> {
    public final C214378bB LJLIL = new C214378bB(C65352Pkq.LIZ(InviteFriendVM.class), null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C58449Mwn.INSTANCE, null, null);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.by4;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        if (((Set) ((InviteFriendVM) this.LJLIL.getValue()).LJLILLLLZI.getValue()).add(Integer.valueOf(hashCode()))) {
            C41310GJe.LIZ(EnumC41309GJd.SHOW);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C59062Tm t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        ((C62725OjZ) this.itemView.findViewById(R.id.ers)).setupListView(null);
    }
}
