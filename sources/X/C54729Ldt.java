package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54729Ldt extends AbstractC31414CUo<LYQ, C54734Ldy> {
    public final InterfaceC54736Le0 LIZIZ;

    public C54729Ldt(LYT callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LIZIZ = callBack;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZLLL(C54734Ldy c54734Ldy) {
        Object obj;
        long j;
        User user;
        SlimRoom slimRoom;
        User user2;
        C54734Ldy holder = c54734Ldy;
        o.LJIIIZ(holder, "holder");
        FollowingInterestUser followingInterestUser = holder.LJLJJL;
        if (followingInterestUser == null || (user2 = followingInterestUser.getUser()) == null || (obj = user2.getUid()) == null) {
            obj = 0;
        }
        long parseLong = CastLongProtector.parseLong(obj.toString());
        FollowingInterestUser followingInterestUser2 = holder.LJLJJL;
        if (followingInterestUser2 != null && (slimRoom = followingInterestUser2.getSlimRoom()) != null) {
            j = slimRoom.getId();
        } else {
            j = 0;
        }
        FollowingInterestUser followingInterestUser3 = holder.LJLJJL;
        if (followingInterestUser3 != null) {
            user = followingInterestUser3.getUser();
        } else {
            user = null;
        }
        C73994T2g.LJJIJIIJI(C54740Le4.LIZIZ(user), parseLong, j, "live_cover", null);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C54734Ldy c54734Ldy, LYQ lyq) {
        String str;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user2;
        C54734Ldy holder = c54734Ldy;
        LYQ item = lyq;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        holder.LJLJLLL.setVisibility(8);
        holder.LJLJI.setVisibility(8);
        holder.LJLJLJ.setVisibility(8);
        SlimRoom slimRoom = item.LIZ.getSlimRoom();
        if (slimRoom == null) {
            return;
        }
        SlimRoom.LinkMic linkMic = slimRoom.getLinkMic();
        if (linkMic != null && (list2 = linkMic.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) != null) {
            TAR.LIZ(holder.LJLLLLLL, user2.getAvatarThumb());
            holder.LJLILLLLZI.setText(C56331M8x.LIZJ(user2.getUsername(), user2.getNickName(), false, true));
        }
        TuxTextView tuxTextView = holder.LJLLI;
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        tuxTextView.setText(AbstractViewOnClickListenerC54731Ldv.L(context));
        SlimRoom.LinkMic linkMic2 = slimRoom.getLinkMic();
        if (linkMic2 != null && (list = linkMic2.followedList) != null && (user = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 1)) != null) {
            TAR.LIZ(holder.LJLLLL, user.getAvatarThumb());
        }
        holder.LJLJJL = item.LIZ;
        holder.getPosition();
        if (item.LIZ.getInterestUserType() == holder.LJLLILLLL) {
            holder.LJLJL.setText(R.string.ohv);
            holder.LJLJJLL.setIconRes(R.raw.icon_star_ring_fill);
            holder.LJLJLLL.setVisibility(0);
        } else if (item.LIZ.getInterestUserType() == holder.LJLLJ) {
            holder.LJLJL.setText(R.string.mgt);
            holder.LJLJJLL.setIconRes(R.raw.icon_calendar_star_fill);
            holder.LJLJLLL.setVisibility(0);
        }
        if (!TextUtils.isEmpty(item.LIZ.getUser().getCustomVerify()) || !TextUtils.isEmpty(item.LIZ.getUser().getVerifyInfo())) {
            holder.LJLJLJ.setVisibility(0);
        }
        SlimRoom slimRoom2 = item.LIZ.getSlimRoom();
        if (slimRoom2 == null || (str = slimRoom2.title) == null) {
            return;
        }
        holder.LJLJI.setText(str);
        View itemView = holder.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (C26338AVi.LIZLLL(itemView)) {
            holder.LJLJI.setTextAlignment(6);
        } else {
            holder.LJLJI.setTextAlignment(5);
        }
        holder.LJLJI.setVisibility(0);
    }

    @Override // X.AbstractC31414CUo
    public final C54734Ldy LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d1x, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C54734Ldy(it, this.LIZIZ);
    }
}
