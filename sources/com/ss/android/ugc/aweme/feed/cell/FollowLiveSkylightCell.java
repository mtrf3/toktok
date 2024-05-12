package com.ss.android.ugc.aweme.feed.cell;

import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C30746C4w;
import X.C38350F3i;
import X.C51588KMm;
import X.C53873LCj;
import X.C53887LCx;
import X.C54740Le4;
import X.C56331M8x;
import X.C62822Ol8;
import X.C75792yF;
import X.C78688UuS;
import X.C78765Uvh;
import X.LYM;
import X.LYU;
import X.LZC;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowLiveSkylightCell extends PowerCell<LZC> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 169));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 166));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 170));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 168));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 167));
    public FollowingInterestUser LJLJJLL;
    public List<FollowingInterestUser> LJLJL;
    public C53887LCx LJLJLJ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avw;
    }

    public final C51588KMm L() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-cover>(...)");
        return (C51588KMm) value;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C51588KMm L = L();
        C51588KMm L2 = L();
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-liveCircleView>(...)");
        C53887LCx c53887LCx = new C53887LCx(L, L2, (C53873LCj) value);
        this.LJLJLJ = c53887LCx;
        c53887LCx.LJIIJ(false);
        Object value2 = this.LJLJI.getValue();
        o.LJIIIIZZ(value2, "<get-tvName>(...)");
        ((TuxTextView) value2).setTuxFont(82);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        long j;
        String str;
        SlimRoom slimRoom;
        User user;
        User user2;
        String str2;
        LogPbBean logPbBean;
        User user3;
        String uid;
        Long LJJIZ;
        super.onViewAttachedToWindow();
        FollowingInterestUser followingInterestUser = this.LJLJJLL;
        if (followingInterestUser != null && followingInterestUser.getUser() != null) {
            FollowingInterestUser followingInterestUser2 = this.LJLJJLL;
            if (followingInterestUser2 != null && (user3 = followingInterestUser2.getUser()) != null && (uid = user3.getUid()) != null && (LJJIZ = C38350F3i.LJJIZ(uid)) != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            FollowingInterestUser followingInterestUser3 = this.LJLJJLL;
            Integer num = null;
            if (followingInterestUser3 != null && (logPbBean = followingInterestUser3.getLogPbBean()) != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            FollowingInterestUser followingInterestUser4 = this.LJLJJLL;
            if (followingInterestUser4 != null) {
                slimRoom = followingInterestUser4.getSlimRoom();
            } else {
                slimRoom = null;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", "homepage_follow");
            c188727au.LJIIIZ("enter_method", "live_cover");
            c188727au.LJIIIZ("action_type", "click");
            c188727au.LJ(j, "anchor_id");
            c188727au.LJIIIZ("request_id", str);
            c188727au.LIZLLL(0, "is_from_list");
            FollowingInterestUser followingInterestUser5 = this.LJLJJLL;
            if (followingInterestUser5 != null) {
                user = followingInterestUser5.getUser();
            } else {
                user = null;
            }
            c188727au.LIZLLL(C54740Le4.LIZIZ(user), "follow_status");
            FollowingInterestUser followingInterestUser6 = this.LJLJJLL;
            if (followingInterestUser6 != null) {
                user2 = followingInterestUser6.getUser();
            } else {
                user2 = null;
            }
            c188727au.LIZLLL(C54740Le4.LIZIZ(user2), "initial_follow_status");
            LZC item = getItem();
            if (item != null) {
                num = Integer.valueOf(item.LJLJI);
            }
            c188727au.LJFF(num, "room_position");
            c188727au.LIZLLL(0, "is_from_draw_req");
            if (slimRoom != null) {
                if (slimRoom.hasCommerceGoods) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJI("is_ecom", str2);
                SlimRoom.RoomAuthStatus roomAuthStatus = slimRoom.roomAuthStatus;
                if (roomAuthStatus != null) {
                    c188727au.LIZLLL(roomAuthStatus.commercePermission, "commerce_permission");
                }
            }
            C78688UuS.LJJJJZ(c188727au.LIZ);
        }
        C53887LCx c53887LCx = this.LJLJLJ;
        if (c53887LCx != null) {
            c53887LCx.LIZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C53887LCx c53887LCx = this.LJLJLJ;
        if (c53887LCx != null) {
            c53887LCx.LJII();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LZC lzc) {
        SlimRoom slimRoom;
        User user;
        User user2;
        LZC t = lzc;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.itemView.setScaleX(1.0f);
        this.itemView.setScaleY(1.0f);
        FollowingInterestUser followingInterestUser = t.LJLIL;
        this.LJLJJLL = followingInterestUser;
        this.LJLJL = t.LJLILLLLZI;
        if (followingInterestUser != null && (user2 = followingInterestUser.getUser()) != null) {
            C78765Uvh.LJFF(L(), user2.getAvatarThumb());
            Object value = this.LJLJI.getValue();
            o.LJIIIIZZ(value, "<get-tvName>(...)");
            ((TextView) value).setText(C56331M8x.LIZIZ(user2, false, true));
        }
        Object value2 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value2, "<get-liveTag>(...)");
        LYM.LJ((TextView) value2);
        Object value3 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value3, "<get-liveCircleView>(...)");
        ((View) value3).setVisibility(0);
        C53887LCx c53887LCx = this.LJLJLJ;
        String str = null;
        if (c53887LCx != null) {
            c53887LCx.LJIIIIZZ(null, FollowLiveSkylightCell.class);
        }
        Object value4 = this.LJLIL.getValue();
        o.LJIIIIZZ(value4, "<get-root>(...)");
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 169), (View) value4);
        FollowingInterestUser followingInterestUser2 = this.LJLJJLL;
        if (followingInterestUser2 != null) {
            followingInterestUser2.getUser();
        }
        try {
            if (C30746C4w.LIZ()) {
                slimRoom = LYU.LJIIIZ(this.LJLJJLL);
            } else {
                FollowingInterestUser followingInterestUser3 = this.LJLJJLL;
                if (followingInterestUser3 != null && (user = followingInterestUser3.getUser()) != null) {
                    str = user.roomData;
                }
                slimRoom = (SlimRoom) C75792yF.LIZ(str, SlimRoom.class);
            }
            LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom));
        } catch (Exception unused) {
        }
    }
}
