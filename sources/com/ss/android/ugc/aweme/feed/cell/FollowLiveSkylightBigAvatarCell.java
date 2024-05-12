package com.ss.android.ugc.aweme.feed.cell;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C30746C4w;
import X.C38350F3i;
import X.C51588KMm;
import X.C53873LCj;
import X.C53882LCs;
import X.C53884LCu;
import X.C53887LCx;
import X.C54700LdQ;
import X.C54706LdW;
import X.C54707LdX;
import X.C54747LeB;
import X.C54748LeC;
import X.C56282M7a;
import X.C56283M7b;
import X.C56284M7c;
import X.C56331M8x;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C75792yF;
import X.C76800UCe;
import X.C77339UWx;
import X.C78765Uvh;
import X.C7MY;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC53720L6m;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.LYM;
import X.LYU;
import X.LZD;
import X.OSZ;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS0S1201200_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.vm.FollowLiveSkyLightRelatedVM;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowLiveSkylightBigAvatarCell extends PowerCell<LZD> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 154));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 149));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 165));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 151));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 150));
    public final C214298b3 LJLJJLL;
    public FollowingInterestUser LJLJL;
    public List<FollowingInterestUser> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public C53887LCx LJLLI;
    public C53884LCu LJLLILLLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avx;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        User user;
        long j;
        String str;
        int i;
        User user2;
        LogPbBean logPbBean;
        User user3;
        String uid;
        Long LJJIZ;
        super.onViewAttachedToWindow();
        if (N()) {
            C53884LCu c53884LCu = this.LJLLILLLL;
            if (c53884LCu != null) {
                c53884LCu.LIZ();
            }
        } else {
            C53887LCx c53887LCx = this.LJLLI;
            if (c53887LCx != null) {
                c53887LCx.LIZ();
            }
        }
        FollowingInterestUser followingInterestUser = this.LJLJL;
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            long j2 = user.roomId;
            FollowingInterestUser followingInterestUser2 = this.LJLJL;
            if (followingInterestUser2 != null && (user3 = followingInterestUser2.getUser()) != null && (uid = user3.getUid()) != null && (LJJIZ = C38350F3i.LJJIZ(uid)) != null) {
                j = LJJIZ.longValue();
            } else {
                j = 0;
            }
            FollowingInterestUser followingInterestUser3 = this.LJLJL;
            SlimRoom slimRoom = null;
            if (followingInterestUser3 != null && (logPbBean = followingInterestUser3.getLogPbBean()) != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            FollowingInterestUser followingInterestUser4 = this.LJLJL;
            if (followingInterestUser4 != null) {
                slimRoom = followingInterestUser4.getSlimRoom();
            }
            FollowingInterestUser followingInterestUser5 = this.LJLJL;
            if (followingInterestUser5 != null && (user2 = followingInterestUser5.getUser()) != null) {
                i = 1;
                if (user2.getFollowStatus() != -1 && user2.getFollowStatus() != 0 && user2.getFollowStatus() != 1) {
                    i = user2.getFollowStatus();
                } else if (user2.getFollowerStatus() == 1 && user2.getFollowStatus() == 1) {
                    i = 2;
                } else if (user2.getFollowerStatus() == 1) {
                    i = 3;
                } else if (user2.getFollowStatus() != 1) {
                    i = user2.getFollowStatus();
                }
            } else {
                i = -1;
            }
            M().post(new ARunnableS0S1201200_9(j, j2, str, this, i, slimRoom, 2));
        }
    }

    public final C51588KMm L() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-cover>(...)");
        return (C51588KMm) value;
    }

    public final TuxTextView M() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-tvName>(...)");
        return (TuxTextView) value;
    }

    public final boolean N() {
        return ((Boolean) this.LJLL.getValue()).booleanValue();
    }

    public FollowLiveSkylightBigAvatarCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FollowLiveSkyLightRelatedVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 160);
        C54707LdX c54707LdX = C54707LdX.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56283M7b.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 161), new AqS159S0100000_9((InterfaceC93923mO) this, 162), C54748LeC.INSTANCE, c54707LdX, new AqS159S0100000_9((InterfaceC93923mO) this, 163), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56284M7c.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 164), new AqS159S0100000_9((InterfaceC93923mO) this, 155), C54747LeB.INSTANCE, c54707LdX, new AqS159S0100000_9((InterfaceC93923mO) this, 156), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56282M7a.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 157), new AqS159S0100000_9((InterfaceC93923mO) this, 158), new AqS159S0100000_9((InterfaceC93923mO) this, 159), c54707LdX, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLJJLL = c214298b3;
        this.LJLJLLL = C221108m2.LIZIZ(C54700LdQ.LJLIL);
        this.LJLL = C221108m2.LIZIZ(C54706LdW.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLJJLL.getValue().setState(new AqS175S0100000_9(new OSZ(new AqS159S0100000_9(this, 152), new AqS159S0100000_9(this, 153)), (OSZ<? extends InterfaceC65784Pro<C76800UCe>, ? extends InterfaceC65784Pro<C76800UCe>>) 577));
        if (!N()) {
            EnumC53720L6m enumC53720L6m = EnumC53720L6m.INBOX;
            C51588KMm L = L();
            C51588KMm L2 = L();
            Object value = this.LJLJJL.getValue();
            o.LJIIIIZZ(value, "<get-liveCircleView>(...)");
            C53887LCx c53887LCx = new C53887LCx(enumC53720L6m, L, L2, (C53873LCj) value);
            this.LJLLI = c53887LCx;
            c53887LCx.LJIIJ(false);
        } else {
            C53882LCs LIZJ = LYM.LIZJ();
            if (LIZJ != null) {
                C51588KMm L3 = L();
                C51588KMm L4 = L();
                Object value2 = this.LJLJJL.getValue();
                o.LJIIIIZZ(value2, "<get-liveCircleView>(...)");
                C53884LCu c53884LCu = new C53884LCu(LIZJ, L3, L4, (C53873LCj) value2);
                this.LJLLILLLL = c53884LCu;
                c53884LCu.LJFF = false;
            }
        }
        M().setTuxFont(82);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        if (N()) {
            C53884LCu c53884LCu = this.LJLLILLLL;
            if (c53884LCu != null) {
                c53884LCu.LJII();
                return;
            }
            return;
        }
        C53887LCx c53887LCx = this.LJLLI;
        if (c53887LCx == null) {
            return;
        }
        c53887LCx.LJII();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LZD lzd) {
        SlimRoom slimRoom;
        User user;
        User user2;
        LZD t = lzd;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.itemView.setScaleX(1.0f);
        this.itemView.setScaleY(1.0f);
        FollowingInterestUser followingInterestUser = t.LJLIL;
        this.LJLJL = followingInterestUser;
        this.LJLJLJ = t.LJLILLLLZI;
        if (followingInterestUser != null && (user2 = followingInterestUser.getUser()) != null) {
            C78765Uvh.LJFF(L(), user2.getAvatarThumb());
            M().setText(C56331M8x.LIZIZ(user2, false, true));
            boolean LJ = LYU.LJ();
            ViewGroup.LayoutParams layoutParams = M().getLayoutParams();
            if (LJ) {
                layoutParams.width = C7MY.LIZIZ(80);
            } else {
                layoutParams.width = C7MY.LIZIZ(72);
            }
            M().setLayoutParams(layoutParams);
            if (LYU.LJFF()) {
                M().setTuxFont(71);
            } else {
                M().setTuxFont(72);
            }
        }
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-liveTag>(...)");
        LYM.LJ((TextView) value);
        Object value2 = this.LJLJJL.getValue();
        o.LJIIIIZZ(value2, "<get-liveCircleView>(...)");
        ((View) value2).setVisibility(0);
        String str = null;
        if (N()) {
            C53884LCu c53884LCu = this.LJLLILLLL;
            if (c53884LCu != null) {
                c53884LCu.LIZIZ(null, FollowLiveSkylightBigAvatarCell.class, null, null);
            }
        } else {
            C53887LCx c53887LCx = this.LJLLI;
            if (c53887LCx != null) {
                c53887LCx.LJIIIIZZ(null, FollowLiveSkylightBigAvatarCell.class);
            }
        }
        Object value3 = this.LJLIL.getValue();
        o.LJIIIIZZ(value3, "<get-root>(...)");
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 168), (View) value3);
        FollowingInterestUser followingInterestUser2 = this.LJLJL;
        if (followingInterestUser2 != null) {
            followingInterestUser2.getUser();
        }
        try {
            if (C30746C4w.LIZ()) {
                slimRoom = LYU.LJIIIZ(this.LJLJL);
            } else {
                FollowingInterestUser followingInterestUser3 = this.LJLJL;
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
