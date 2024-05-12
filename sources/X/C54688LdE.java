package X;

import Y.ACListenerS20S0301000_9;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LdE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54688LdE extends AbstractC54684LdA {
    public final String LJLJJI;
    public final View LJLJJL;
    public final W5G LJLJJLL;
    public final W5G LJLJL;
    public final TuxTextView LJLJLJ;
    public final View LJLJLLL;
    public final TuxTextView LJLL;
    public final C53873LCj LJLLI;
    public final C53873LCj LJLLILLLL;
    public FollowingInterestUser LJLLJ;
    public List<FollowingInterestUser> LJLLL;

    public final int Y() {
        User user;
        FollowingInterestUser followingInterestUser = this.LJLLJ;
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

    public C54688LdE(View view) {
        super(view);
        this.LJLJJI = "FollowLiveSkyLightDoubleNewAnimViewHolder";
        View findViewById = view.findViewById(R.id.f__);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_root)");
        this.LJLJJL = findViewById;
        View findViewById2 = view.findViewById(R.id.f1_);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.iv_cover_top)");
        this.LJLJJLL = (W5G) findViewById2;
        View findViewById3 = view.findViewById(R.id.f17);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.iv_cover_bottom)");
        this.LJLJL = (W5G) findViewById3;
        View findViewById4 = view.findViewById(R.id.mby);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById4;
        this.LJLJLJ = tuxTextView;
        View findViewById5 = view.findViewById(R.id.gvz);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.name_container)");
        this.LJLJLLL = findViewById5;
        View findViewById6 = view.findViewById(R.id.me9);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.tv_plus)");
        this.LJLL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.fv2);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.live_anim)");
        this.LJLLI = (C53873LCj) findViewById7;
        View findViewById8 = view.findViewById(R.id.fv4);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.live_anim_stroke)");
        this.LJLLILLLL = (C53873LCj) findViewById8;
        AbstractC54684LdA.M(tuxTextView);
    }

    public final void X(FollowingInterestUser interestUser, List<FollowingInterestUser> list, int i) {
        int i2;
        String str;
        SlimRoom slimRoom;
        User user;
        List<com.bytedance.android.live.base.model.user.User> list2;
        com.bytedance.android.live.base.model.user.User user2;
        List<com.bytedance.android.live.base.model.user.User> list3;
        com.bytedance.android.live.base.model.user.User user3;
        o.LJIIIZ(interestUser, "interestUser");
        this.LJLIL = i;
        this.LJLLJ = interestUser;
        this.LJLLL = list;
        SlimRoom LJIIIZ = LYU.LJIIIZ(interestUser);
        if (LJIIIZ == null) {
            return;
        }
        this.itemView.setScaleX(1.0f);
        this.itemView.setScaleY(1.0f);
        if (LJIIIZ.getLinkMic().followedList.size() >= 2) {
            SlimRoom.LinkMic linkMic = LJIIIZ.getLinkMic();
            if (linkMic != null && (list3 = linkMic.followedList) != null && (user3 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list3, 0)) != null) {
                TAR.LIZ(this.LJLJL, user3.getAvatarThumb());
                this.LJLJLJ.setText(C56331M8x.LIZJ(user3.getUsername(), user3.getNickName(), false, true));
                boolean LJ = LYU.LJ();
                ViewGroup.LayoutParams layoutParams = this.LJLJLLL.getLayoutParams();
                if (LJ) {
                    layoutParams.width = C17N.LJIILL(80);
                } else {
                    layoutParams.width = C17N.LJIILL(72);
                }
                this.LJLJLLL.setLayoutParams(layoutParams);
                if (LYU.LJFF()) {
                    this.LJLJLJ.setTuxFont(71);
                    this.LJLL.setTuxFont(71);
                } else {
                    this.LJLJLJ.setTuxFont(72);
                    this.LJLL.setTuxFont(72);
                }
            }
            SlimRoom.LinkMic linkMic2 = LJIIIZ.getLinkMic();
            if (linkMic2 != null && (list2 = linkMic2.followedList) != null && (user2 = (com.bytedance.android.live.base.model.user.User) ListProtector.get(list2, 1)) != null) {
                TAR.LIZ(this.LJLJJLL, user2.getAvatarThumb());
            }
        }
        TuxTextView tuxTextView = this.LJLL;
        if (LJIIIZ.getLinkMic().followedCount > 1) {
            if (C90193gN.LIZ()) {
                TuxTextView tuxTextView2 = this.LJLL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIIIZ.getLinkMic().followedCount - 1);
                LIZ.append('+');
                tuxTextView2.setText(X1D.LIZIZ(LIZ));
            } else {
                TuxTextView tuxTextView3 = this.LJLL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('+');
                LIZ2.append(LJIIIZ.getLinkMic().followedCount - 1);
                tuxTextView3.setText(X1D.LIZIZ(LIZ2));
            }
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextView.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams2 = this.LJLJJL.getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.leftMargin = 0;
        marginLayoutParams.setMarginStart(0);
        marginLayoutParams.height = C17N.LJIILL(130);
        if (i == 0) {
            marginLayoutParams.width = C17N.LJIILL(96);
            this.LJLJJL.setPaddingRelative(C17N.LJIILL(16), 0, C17N.LJIILL(8), 0);
        } else {
            marginLayoutParams.width = C17N.LJIILL(88);
            double d = 8;
            this.LJLJJL.setPaddingRelative(C17N.LJIILL(d), 0, C17N.LJIILL(d), 0);
        }
        this.LJLJJL.setLayoutParams(marginLayoutParams);
        C16880lQ.LJIIJ(new ACListenerS20S0301000_9((Object) this, (C54690LdG) i, (int) interestUser, (FollowingInterestUser) list, (List<FollowingInterestUser>) 4), this.LJLJJL);
        this.LJLLI.post(new ARunnableS45S0100000_9(this, 197));
        FollowingInterestUser followingInterestUser = this.LJLLJ;
        if (followingInterestUser != null) {
            followingInterestUser.getUser();
        }
        try {
            if (C30746C4w.LIZ()) {
                slimRoom = LYU.LJIIIZ(this.LJLLJ);
            } else {
                FollowingInterestUser followingInterestUser2 = this.LJLLJ;
                if (followingInterestUser2 != null && (user = followingInterestUser2.getUser()) != null) {
                    str = user.roomData;
                } else {
                    str = null;
                }
                slimRoom = (SlimRoom) C75792yF.LIZ(str, SlimRoom.class);
            }
            LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom));
        } catch (Exception e) {
            ALog.e(this.LJLJJI, e);
        }
        this.LJLLILLLL.LIZ(-16777216, -16777216);
        LiveOuterService.LJJJLL().LJIIJJI();
        C55661Lsv.LJIILIIL(this.LJLLI, (String) AbstractC54684LdA.LJLJI.getValue());
    }
}
