package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C06490Nh;
import X.C16880lQ;
import X.C188727au;
import X.C78939UyV;
import X.C7B7;
import X.C88463da;
import X.EnumC1796673i;
import X.FMX;
import X.W5F;
import X.W5U;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TaggedPeopleAvatarCell extends PowerCell<C7B7> {
    public SmartImageView LJLIL;
    public C7B7 LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C7B7 c7b7 = this.LJLILLLLZI;
        if (c7b7 != null && !c7b7.LJLJI.contains(c7b7.LJLIL.getUid())) {
            Set<String> set = c7b7.LJLJI;
            String uid = c7b7.LJLIL.getUid();
            o.LJIIIIZZ(uid, "user.uid");
            set.add(uid);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", c7b7.LJLILLLLZI.enterFrom);
            String str = c7b7.LJLILLLLZI.awemeId;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            c188727au.LJIIIZ("group_id", str);
            String str3 = c7b7.LJLILLLLZI.authorUid;
            if (str3 == null) {
                str3 = "";
            }
            c188727au.LJIIIZ("author_id", str3);
            String uid2 = c7b7.LJLIL.getUid();
            if (uid2 != null) {
                str2 = uid2;
            }
            c188727au.LJIIIZ("to_user_id", str2);
            c188727au.LJIIIZ("anchor_type", "low_interest");
            FMX.LJIIL("show_tagged_user", c188727au.LIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7B7 c7b7) {
        C7B7 avatarItem = c7b7;
        o.LJIIIZ(avatarItem, "avatarItem");
        super.onBindItemView(avatarItem);
        W5F LJII = W5U.LJII(C78939UyV.LJ(avatarItem.LJLIL.getAvatarThumb()));
        LJII.LIZIZ("TaggedPeopleAvatarCell");
        LJII.LJJIIJ = this.LJLIL;
        LJII.LIZLLL = true;
        C16880lQ.LLJJJ(LJII);
        SmartImageView smartImageView = this.LJLIL;
        if (smartImageView != null) {
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS38S0200000_3(this, avatarItem, 100));
        }
        C88463da.LIZJ(C88463da.LIZ, this.LJLIL, EnumC1796673i.AVATAR, 0.0f, 12);
        this.LJLILLLLZI = avatarItem;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.r7, viewGroup, false);
        this.LJLIL = (SmartImageView) LIZIZ.findViewById(R.id.abk);
        return LIZIZ;
    }
}
