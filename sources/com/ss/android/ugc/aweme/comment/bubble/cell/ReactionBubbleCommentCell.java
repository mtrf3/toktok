package com.ss.android.ugc.aweme.comment.bubble.cell;

import X.C178406zM;
import X.C1799274i;
import X.C1809778j;
import X.C1811278y;
import X.C2U8;
import X.C57072Lv;
import X.FMX;
import X.OSZ;
import X.X1D;
import android.view.View;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ReactionBubbleCommentCell extends ReactionBubbleContentCell<C1809778j> {
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String V() {
        return "comment";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final C1811278y M() {
        C1809778j c1809778j = (C1809778j) getItem();
        if (c1809778j != null) {
            return c1809778j.LJLJJI;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String Y() {
        C1809778j c1809778j = (C1809778j) getItem();
        if (c1809778j != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c1809778j.LJLIL);
            LIZ.append('_');
            LIZ.append(c1809778j.LJLILLLLZI.getCid());
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final User getUser() {
        Comment comment;
        C1809778j c1809778j = (C1809778j) getItem();
        if (c1809778j != null && (comment = c1809778j.LJLILLLLZI) != null) {
            return comment.getUser();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C1811278y c1811278y;
        Set<String> set;
        String str;
        super.onViewAttachedToWindow();
        C1809778j c1809778j = (C1809778j) getItem();
        if (c1809778j != null && (c1811278y = c1809778j.LJLJJI) != null && (set = c1811278y.LJI) != null && !set.contains(Y())) {
            set.add(Y());
            C1809778j c1809778j2 = (C1809778j) getItem();
            if (c1809778j2 != null) {
                OSZ[] oszArr = new OSZ[4];
                C1811278y c1811278y2 = c1809778j2.LJLJJI;
                String str2 = null;
                if (c1811278y2 != null) {
                    str = c1811278y2.LJ;
                } else {
                    str = null;
                }
                oszArr[0] = new OSZ(str, "story_type");
                C1811278y c1811278y3 = c1809778j2.LJLJJI;
                if (c1811278y3 != null) {
                    str2 = c1811278y3.LIZIZ;
                }
                oszArr[1] = new OSZ(str2, "enter_from");
                oszArr[2] = new OSZ("comment", "notice_type");
                oszArr[3] = new OSZ(c1809778j2.LJLILLLLZI.getUser().getUid(), "from_user_id");
                FMX.LJIILL("interaction_bullet_show", oszArr);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String L(C1809778j c1809778j) {
        String str;
        C1809778j item = c1809778j;
        o.LJIIIZ(item, "item");
        if (item.LJLILLLLZI.getAliasAweme() != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('[');
            LIZ.append(this.itemView.getContext().getString(R.string.g43));
            LIZ.append(']');
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(item.LJLILLLLZI.getText());
        if (item.LJLILLLLZI.getImageList() != null) {
            str = this.itemView.getContext().getString(R.string.dih);
        } else {
            str = "";
        }
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String N(C1809778j c1809778j) {
        String str;
        C1809778j item = c1809778j;
        o.LJIIIZ(item, "item");
        User user = item.LJLILLLLZI.getUser();
        C1811278y c1811278y = item.LJLJJI;
        if (c1811278y != null) {
            str = c1811278y.LIZIZ;
        } else {
            str = null;
        }
        return C1799274i.LJ(user, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final String P(C1809778j c1809778j) {
        String str;
        C1809778j item = c1809778j;
        o.LJIIIZ(item, "item");
        String replyToNickName = item.LJLILLLLZI.getReplyToNickName();
        String replyToUserName = item.LJLILLLLZI.getReplyToUserName();
        C1811278y c1811278y = item.LJLJJI;
        if (c1811278y != null) {
            str = c1811278y.LIZIZ;
        } else {
            str = null;
        }
        return C178406zM.LJIIIIZZ(replyToNickName, replyToUserName, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final boolean T(C1809778j c1809778j) {
        C1809778j item = c1809778j;
        o.LJIIIZ(item, "item");
        return item.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleContentCell
    public final void X(View view) {
        Comment comment;
        o.LJIIIZ(view, "view");
        C1809778j c1809778j = (C1809778j) getItem();
        if (c1809778j == null || (comment = c1809778j.LJLILLLLZI) == null) {
            return;
        }
        String cid = comment.getCid();
        if (cid != null) {
            C2U8.LIZ(new C57072Lv(cid));
            return;
        }
        String fakeId = comment.getFakeId();
        o.LJIIIIZZ(fakeId, "comment.fakeId");
        C2U8.LIZ(new C57072Lv(fakeId));
    }
}
