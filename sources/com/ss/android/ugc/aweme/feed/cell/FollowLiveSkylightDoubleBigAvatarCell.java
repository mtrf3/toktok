package com.ss.android.ugc.aweme.feed.cell;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C30746C4w;
import X.C53873LCj;
import X.C53882LCs;
import X.C53884LCu;
import X.C53887LCx;
import X.C54701LdR;
import X.C54708LdY;
import X.C54709LdZ;
import X.C54749LeD;
import X.C54750LeE;
import X.C56285M7d;
import X.C56286M7e;
import X.C56287M7f;
import X.C56331M8x;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C75792yF;
import X.C76800UCe;
import X.C77339UWx;
import X.C7MY;
import X.C90193gN;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC53720L6m;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.LYM;
import X.LYU;
import X.LZE;
import X.OSZ;
import X.TAR;
import X.W5G;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
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
public final class FollowLiveSkylightDoubleBigAvatarCell extends PowerCell<LZE> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 189));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 182));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 180));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 179));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 186));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 185));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 181));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 184));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 183));
    public final C214298b3 LJLL;
    public final C62822Ol8 LJLLI;
    public C53887LCx LJLLILLLL;
    public C53887LCx LJLLJ;
    public C53884LCu LJLLL;
    public C53884LCu LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public FollowingInterestUser LJLZ;
    public List<FollowingInterestUser> LJZ;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.avu;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.cell.FollowLiveSkylightDoubleBigAvatarCell.onViewAttachedToWindow():void");
    }

    public final W5G L() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-coverBottom>(...)");
        return (W5G) value;
    }

    public final W5G M() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-coverTop>(...)");
        return (W5G) value;
    }

    public final int N() {
        User user;
        FollowingInterestUser followingInterestUser = this.LJLZ;
        if (followingInterestUser != null && (user = followingInterestUser.getUser()) != null) {
            int followStatus = user.getFollowStatus();
            if (followStatus != 0 && followStatus != 1 && followStatus != 2) {
                if (user.getFollowerStatus() == 0) {
                    return 0;
                }
                return 3;
            }
            return followStatus;
        }
        return -1;
    }

    public final TuxTextView P() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-tvName>(...)");
        return (TuxTextView) value;
    }

    public final TuxTextView Q() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-tvPlusNum>(...)");
        return (TuxTextView) value;
    }

    public final boolean T() {
        return ((Boolean) this.LJLLI.getValue()).booleanValue();
    }

    public FollowLiveSkylightDoubleBigAvatarCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FollowLiveSkyLightRelatedVM.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 195);
        C54709LdZ c54709LdZ = C54709LdZ.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56286M7e.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 196), new AqS159S0100000_9((InterfaceC93923mO) this, 197), C54750LeE.INSTANCE, c54709LdZ, new AqS159S0100000_9((InterfaceC93923mO) this, 198), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56287M7f.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 199), new AqS159S0100000_9((InterfaceC93923mO) this, 190), C54749LeD.INSTANCE, c54709LdZ, new AqS159S0100000_9((InterfaceC93923mO) this, 191), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C56285M7d.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 192), new AqS159S0100000_9((InterfaceC93923mO) this, 193), new AqS159S0100000_9((InterfaceC93923mO) this, 194), c54709LdZ, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLL = c214298b3;
        this.LJLLI = C221108m2.LIZIZ(C54708LdY.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C54701LdR.LJLIL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LJLL.getValue().setState(new AqS175S0100000_9(new OSZ(new AqS159S0100000_9(this, 187), new AqS159S0100000_9(this, 188)), (OSZ<? extends InterfaceC65784Pro<C76800UCe>, ? extends InterfaceC65784Pro<C76800UCe>>) 577));
        if (!T()) {
            EnumC53720L6m enumC53720L6m = EnumC53720L6m.INBOX;
            W5G M = M();
            W5G M2 = M();
            Object value = this.LJLJLJ.getValue();
            o.LJIIIIZZ(value, "<get-liveCircleViewTop>(...)");
            this.LJLLILLLL = new C53887LCx(enumC53720L6m, M, M2, (C53873LCj) value);
            W5G L = L();
            W5G L2 = L();
            Object value2 = this.LJLJLLL.getValue();
            o.LJIIIIZZ(value2, "<get-liveCircleViewBottom>(...)");
            this.LJLLJ = new C53887LCx(enumC53720L6m, L, L2, (C53873LCj) value2);
            C53887LCx c53887LCx = this.LJLLILLLL;
            if (c53887LCx != null) {
                c53887LCx.LJIIJ(false);
            }
            C53887LCx c53887LCx2 = this.LJLLJ;
            if (c53887LCx2 != null) {
                c53887LCx2.LJIIJ(false);
            }
        } else {
            C53882LCs LIZJ = LYM.LIZJ();
            if (LIZJ != null) {
                W5G M3 = M();
                W5G M4 = M();
                Object value3 = this.LJLJLJ.getValue();
                o.LJIIIIZZ(value3, "<get-liveCircleViewTop>(...)");
                this.LJLLL = new C53884LCu(LIZJ, M3, M4, (C53873LCj) value3);
                W5G L3 = L();
                W5G L4 = L();
                Object value4 = this.LJLJLLL.getValue();
                o.LJIIIIZZ(value4, "<get-liveCircleViewBottom>(...)");
                C53884LCu c53884LCu = new C53884LCu(LIZJ, L3, L4, (C53873LCj) value4);
                this.LJLLLL = c53884LCu;
                C53884LCu c53884LCu2 = this.LJLLL;
                if (c53884LCu2 != null) {
                    c53884LCu2.LJFF = false;
                }
                c53884LCu.LJFF = false;
            }
        }
        P().setTuxFont(82);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        if (T()) {
            C53884LCu c53884LCu = this.LJLLL;
            if (c53884LCu != null) {
                c53884LCu.LJII();
            }
            C53884LCu c53884LCu2 = this.LJLLLL;
            if (c53884LCu2 != null) {
                c53884LCu2.LJII();
                return;
            }
            return;
        }
        C53887LCx c53887LCx = this.LJLLILLLL;
        if (c53887LCx != null) {
            c53887LCx.LJII();
        }
        C53887LCx c53887LCx2 = this.LJLLJ;
        if (c53887LCx2 == null) {
            return;
        }
        c53887LCx2.LJII();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LZE lze) {
        SlimRoom slimRoom;
        User user;
        List<com.bytedance.android.live.base.model.user.User> list;
        com.bytedance.android.live.base.model.user.User user2;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user3;
        LZE t = lze;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        FollowingInterestUser followingInterestUser = t.LJLIL;
        this.LJLZ = followingInterestUser;
        this.LJZ = t.LJLILLLLZI;
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
                P().setText(C56331M8x.LIZJ(user3.getUsername(), user3.getNickName(), false, true));
                boolean LJ = LYU.LJ();
                Object value = this.LJLJJL.getValue();
                o.LJIIIIZZ(value, "<get-nameContainer>(...)");
                ViewGroup.LayoutParams layoutParams = ((View) value).getLayoutParams();
                if (LJ) {
                    layoutParams.width = C7MY.LIZIZ(80);
                } else {
                    layoutParams.width = C7MY.LIZIZ(72);
                }
                Object value2 = this.LJLJJL.getValue();
                o.LJIIIIZZ(value2, "<get-nameContainer>(...)");
                ((View) value2).setLayoutParams(layoutParams);
                if (LYU.LJFF()) {
                    P().setTuxFont(71);
                    Q().setTuxFont(71);
                } else {
                    P().setTuxFont(72);
                    Q().setTuxFont(72);
                }
            }
            SlimRoom.LinkMic linkMic2 = LJIIIZ.getLinkMic();
            if (linkMic2 != null && (list = linkMic2.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list, 1)) != null) {
                TAR.LIZ(M(), user2.getAvatarThumb());
            }
        }
        TuxTextView Q = Q();
        if (LJIIIZ.getLinkMic().followedCount > 1) {
            if (C90193gN.LIZ()) {
                TuxTextView Q2 = Q();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIIIZ.getLinkMic().followedCount - 1);
                LIZ.append('+');
                Q2.setText(X1D.LIZIZ(LIZ));
            } else {
                TuxTextView Q3 = Q();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('+');
                LIZ2.append(LJIIIZ.getLinkMic().followedCount - 1);
                Q3.setText(X1D.LIZIZ(LIZ2));
            }
        } else {
            i = 8;
        }
        Q.setVisibility(i);
        Object value3 = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value3, "<get-liveTag>(...)");
        LYM.LJ((TextView) value3);
        Object value4 = this.LJLIL.getValue();
        o.LJIIIIZZ(value4, "<get-root>(...)");
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 171), (View) value4);
        String str = null;
        if (T()) {
            C53884LCu c53884LCu = this.LJLLL;
            if (c53884LCu != null) {
                c53884LCu.LIZIZ(null, FollowLiveSkylightDoubleBigAvatarCell.class, null, null);
            }
            C53884LCu c53884LCu2 = this.LJLLLL;
            if (c53884LCu2 != null) {
                c53884LCu2.LIZIZ(null, FollowLiveSkylightDoubleBigAvatarCell.class, null, null);
            }
        } else {
            C53887LCx c53887LCx = this.LJLLILLLL;
            if (c53887LCx != null) {
                c53887LCx.LJIIIIZZ(null, FollowLiveSkylightDoubleBigAvatarCell.class);
            }
            C53887LCx c53887LCx2 = this.LJLLJ;
            if (c53887LCx2 != null) {
                c53887LCx2.LJIIIIZZ(null, FollowLiveSkylightDoubleBigAvatarCell.class);
            }
        }
        FollowingInterestUser followingInterestUser2 = this.LJLZ;
        if (followingInterestUser2 != null) {
            followingInterestUser2.getUser();
        }
        try {
            if (C30746C4w.LIZ()) {
                slimRoom = LYU.LJIIIZ(this.LJLZ);
            } else {
                FollowingInterestUser followingInterestUser3 = this.LJLZ;
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
