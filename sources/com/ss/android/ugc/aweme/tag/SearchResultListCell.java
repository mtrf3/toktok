package com.ss.android.ugc.aweme.tag;

import X.C221108m2;
import X.C242479fP;
import X.C246879mV;
import X.C56331M8x;
import X.C62822Ol8;
import X.EnumC246869mU;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchResultListCell extends BaseFriendsListCell<C242479fP> {
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C246879mV.LJLIL);
    public final EnumC246869mU LJLJLJ = EnumC246869mU.SEARCH;

    @Override // com.ss.android.ugc.aweme.tag.BaseFriendsListCell
    public final EnumC246869mU L() {
        return this.LJLJLJ;
    }

    @Override // com.ss.android.ugc.aweme.tag.BaseFriendsListCell, com.bytedance.ies.powerlist.PowerCell
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C242479fP item) {
        o.LJIIIZ(item, "item");
        super.onBindItemView(item);
        IIMService iIMService = (IIMService) this.LJLJL.getValue();
        if (iIMService != null) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.gw7);
            o.LJIIIIZZ(textView, "itemView.name_tv");
            VideoTagFriendsListViewModel M = M();
            IMUser iMUser = item.LJLIL;
            M.getClass();
            iIMService.setHighlightText(textView, VideoTagFriendsListViewModel.hv0(iMUser), item.LJLJI);
        }
        IIMService iIMService2 = (IIMService) this.LJLJL.getValue();
        if (iIMService2 != null) {
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.c9f);
            o.LJIIIIZZ(textView2, "itemView.detail_tv");
            VideoTagFriendsListViewModel M2 = M();
            IMUser user = item.LJLIL;
            M2.getClass();
            o.LJIIIZ(user, "user");
            String nickName = user.getNickName();
            String uniqueId = user.getUniqueId();
            User user2 = new User();
            user2.setNickname(nickName);
            user2.setUniqueId(uniqueId);
            iIMService2.setHighlightText(textView2, C56331M8x.LIZ(user2, false, false), item.LJLJI);
        }
    }
}
