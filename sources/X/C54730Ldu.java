package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ldu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54730Ldu extends AbstractC31414CUo<LYP, C54735Ldz> {
    public final InterfaceC54736Le0 LIZIZ;

    public C54730Ldu(LYT callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LIZIZ = callBack;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZLLL(C54735Ldz c54735Ldz) {
        Object obj;
        long j;
        User user;
        SlimRoom slimRoom;
        User user2;
        C54735Ldz holder = c54735Ldz;
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
    public final void LIZ(C54735Ldz c54735Ldz, LYP lyp) {
        String str;
        C54735Ldz holder = c54735Ldz;
        LYP item = lyp;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        holder.LJLJLLL.setVisibility(8);
        holder.LJLJI.setVisibility(8);
        holder.LJLJLJ.setVisibility(8);
        User user = item.LJLIL.getUser();
        C78765Uvh.LJFF(holder.LJLLLL, user.getAvatarThumb());
        holder.LJLILLLLZI.setText(C56331M8x.LIZIZ(user, false, true));
        holder.LJLJJL = item.LJLIL;
        holder.getPosition();
        SlimRoom slimRoom = item.LJLIL.getSlimRoom();
        if (slimRoom != null && (str = slimRoom.title) != null) {
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
        TuxTextView tuxTextView = holder.LJLLI;
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        tuxTextView.setText(AbstractViewOnClickListenerC54731Ldv.L(context));
        if (item.LJLIL.getInterestUserType() == holder.LJLLILLLL) {
            holder.LJLJL.setText(R.string.ohv);
            holder.LJLJJLL.setIconRes(R.raw.icon_star_ring_fill);
            holder.LJLJLLL.setVisibility(0);
        } else if (item.LJLIL.getInterestUserType() == holder.LJLLJ) {
            holder.LJLJL.setText(R.string.mgt);
            holder.LJLJJLL.setIconRes(R.raw.icon_calendar_star_fill);
            holder.LJLJLLL.setVisibility(0);
        }
        if (!TextUtils.isEmpty(user.getCustomVerify()) || !TextUtils.isEmpty(user.getVerifyInfo())) {
            holder.LJLJLJ.setVisibility(0);
        }
    }

    @Override // X.AbstractC31414CUo
    public final C54735Ldz LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.dii, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C54735Ldz(it, this.LIZIZ);
    }
}
