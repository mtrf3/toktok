package com.ss.android.ugc.aweme.feed.cell;

import X.C16880lQ;
import X.C221108m2;
import X.C30746C4w;
import X.C53873LCj;
import X.C53887LCx;
import X.C56331M8x;
import X.C62822Ol8;
import X.C75792yF;
import X.C90193gN;
import X.LYM;
import X.LYU;
import X.LZB;
import X.TAR;
import X.W5G;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowLiveSkylightDoubleAvatarCell extends PowerCell<LZB> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 176));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 172));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 171));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 177));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 175));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 178));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 174));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 173));
    public C53887LCx LJLJLLL;
    public C53887LCx LJLL;
    public FollowingInterestUser LJLLI;
    public List<FollowingInterestUser> LJLLILLLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avt;
    }

    public final W5G L() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-coverBottom>(...)");
        return (W5G) value;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        TuxTextView tuxTextView;
        super.onItemViewCreated();
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-coverTop>(...)");
        Object value2 = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value2, "<get-coverTop>(...)");
        Object value3 = this.LJLJL.getValue();
        o.LJIIIIZZ(value3, "<get-liveCircleViewTop>(...)");
        this.LJLJLLL = new C53887LCx((View) value, (View) value2, (C53873LCj) value3);
        W5G L = L();
        W5G L2 = L();
        Object value4 = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value4, "<get-liveCircleViewBottom>(...)");
        this.LJLL = new C53887LCx(L, L2, (C53873LCj) value4);
        C53887LCx c53887LCx = this.LJLJLLL;
        if (c53887LCx != null) {
            c53887LCx.LJIIJ(false);
        }
        C53887LCx c53887LCx2 = this.LJLL;
        if (c53887LCx2 != null) {
            c53887LCx2.LJIIJ(false);
        }
        Object value5 = this.LJLJJI.getValue();
        o.LJIIIIZZ(value5, "<get-tvName>(...)");
        TextView textView = (TextView) value5;
        if ((textView instanceof TuxTextView) && (tuxTextView = (TuxTextView) textView) != null) {
            tuxTextView.setTuxFont(82);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0164  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightDoubleAvatarCell.onViewAttachedToWindow():void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C53887LCx c53887LCx = this.LJLJLLL;
        if (c53887LCx != null) {
            c53887LCx.LJII();
        }
        C53887LCx c53887LCx2 = this.LJLL;
        if (c53887LCx2 != null) {
            c53887LCx2.LJII();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LZB lzb) {
        SlimRoom slimRoom;
        User user;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user2;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user3;
        LZB t = lzb;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        FollowingInterestUser followingInterestUser = t.LJLIL;
        this.LJLLI = followingInterestUser;
        this.LJLLILLLL = t.LJLILLLLZI;
        SlimRoom LJIIIZ = LYU.LJIIIZ(followingInterestUser);
        if (LJIIIZ == null) {
            return;
        }
        this.itemView.setScaleX(1.0f);
        this.itemView.setScaleY(1.0f);
        int i = 0;
        if (LJIIIZ.getLinkMic().followedList.size() >= 2) {
            SlimRoom.LinkMic linkMic = LJIIIZ.getLinkMic();
            if (linkMic != null && (list2 = linkMic.followedList) != null && (user3 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 0)) != null) {
                TAR.LIZ(L(), user3.getAvatarThumb());
                Object value = this.LJLJJI.getValue();
                o.LJIIIIZZ(value, "<get-tvName>(...)");
                ((TextView) value).setText(C56331M8x.LIZJ(user3.getUsername(), user3.getNickName(), false, true));
            }
            SlimRoom.LinkMic linkMic2 = LJIIIZ.getLinkMic();
            if (linkMic2 != null && (list = linkMic2.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 1)) != null) {
                ImageModel avatarThumb = user2.getAvatarThumb();
                Object value2 = this.LJLILLLLZI.getValue();
                o.LJIIIIZZ(value2, "<get-coverTop>(...)");
                TAR.LIZ((W5G) value2, avatarThumb);
            }
        }
        Object value3 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value3, "<get-tvPlusNum>(...)");
        View view = (View) value3;
        if (LJIIIZ.getLinkMic().followedCount > 1) {
            if (C90193gN.LIZ()) {
                Object value4 = this.LJLJJLL.getValue();
                o.LJIIIIZZ(value4, "<get-tvPlusNum>(...)");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIIIZ.getLinkMic().followedCount - 1);
                LIZ.append('+');
                ((TextView) value4).setText(X1D.LIZIZ(LIZ));
            } else {
                Object value5 = this.LJLJJLL.getValue();
                o.LJIIIIZZ(value5, "<get-tvPlusNum>(...)");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('+');
                LIZ2.append(LJIIIZ.getLinkMic().followedCount - 1);
                ((TextView) value5).setText(X1D.LIZIZ(LIZ2));
            }
        } else {
            i = 8;
        }
        view.setVisibility(i);
        Object value6 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value6, "<get-liveTag>(...)");
        LYM.LJ((TextView) value6);
        Object value7 = this.LJLIL.getValue();
        o.LJIIIIZZ(value7, "<get-root>(...)");
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 170), (View) value7);
        C53887LCx c53887LCx = this.LJLJLLL;
        String str = null;
        if (c53887LCx != null) {
            c53887LCx.LJIIIIZZ(null, FollowLiveSkylightDoubleAvatarCell.class);
        }
        C53887LCx c53887LCx2 = this.LJLL;
        if (c53887LCx2 != null) {
            c53887LCx2.LJIIIIZZ(null, FollowLiveSkylightDoubleAvatarCell.class);
        }
        FollowingInterestUser followingInterestUser2 = this.LJLLI;
        if (followingInterestUser2 != null) {
            followingInterestUser2.getUser();
        }
        if (C30746C4w.LIZ()) {
            slimRoom = LYU.LJIIIZ(this.LJLLI);
        } else {
            FollowingInterestUser followingInterestUser3 = this.LJLLI;
            if (followingInterestUser3 != null && (user = followingInterestUser3.getUser()) != null) {
                str = user.roomData;
            }
            slimRoom = (SlimRoom) C75792yF.LIZ(str, SlimRoom.class);
        }
        LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom));
    }
}
