package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C1799274i;
import X.C1811278y;
import X.C79X;
import X.C98593tv;
import X.InterfaceC98813uH;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReactionBubbleDmReplyCell extends ReactionBubbleContentCell<C79X> {
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String V() {
        return "dm";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final C1811278y M() {
        C79X c79x = (C79X) getItem();
        if (c79x != null) {
            return c79x.LJLJJLL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final User getUser() {
        C79X c79x = (C79X) getItem();
        if (c79x != null) {
            return c79x.LJLILLLLZI;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String L(C79X c79x) {
        C79X item = c79x;
        o.LJIIIZ(item, "item");
        return item.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String N(C79X c79x) {
        String str;
        C79X item = c79x;
        o.LJIIIZ(item, "item");
        User user = item.LJLILLLLZI;
        C1811278y c1811278y = item.LJLJJLL;
        if (c1811278y != null) {
            str = c1811278y.LIZIZ;
        } else {
            str = null;
        }
        return C1799274i.LJ(user, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String P(C79X item) {
        o.LJIIIZ(item, "item");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final boolean T(C79X item) {
        o.LJIIIZ(item, "item");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final void X(View view) {
        String str;
        String str2;
        String str3;
        Aweme aweme;
        C1811278y c1811278y;
        Aweme aweme2;
        o.LJIIIZ(view, "view");
        InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
        C98593tv c98593tv = new C98593tv(view.getContext(), IMUser.fromUser(getUser()));
        C1811278y M = M();
        Long l = null;
        if (M != null) {
            str = M.LIZIZ;
        } else {
            str = null;
        }
        c98593tv.setEnterFromForMob(str);
        c98593tv.setEnterMethodForMob("click_story_dm_bullet");
        c98593tv.setEnterFrom(0);
        C79X c79x = (C79X) getItem();
        if (c79x == null || (c1811278y = c79x.LJLJJLL) == null || (aweme2 = c1811278y.LIZ) == null || (str2 = aweme2.getAuthorUid()) == null) {
            str2 = "";
        }
        c98593tv.setAuthorId(str2);
        C1811278y M2 = M();
        if (M2 != null && (aweme = M2.LIZ) != null) {
            str3 = aweme.getAid();
        } else {
            str3 = null;
        }
        c98593tv.setGroupId(str3);
        c98593tv.setQuickChat(true);
        C79X c79x2 = (C79X) getItem();
        if (c79x2 != null) {
            l = Long.valueOf(c79x2.LJLJJI);
        }
        c98593tv.setScrollToMsgId(l);
        imChatService.LJFF(c98593tv);
    }
}
