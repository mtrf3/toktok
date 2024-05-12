package X;

import Y.ACListenerS36S0200000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.AqS69S1100000_1;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* renamed from: X.429, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass429 extends AbstractC1041546x {
    public final C119624mk LLIIIILZ;
    public final TuxTextView LLIIIJ;
    public final LinearLayout LLIIIL;
    public final RelationButton LLIIIZ;

    public final void n0(User user) {
        String str;
        String str2;
        C80533Eb.LJIIJJI(user.getUid(), user.getSecUid(), true, new C42A(this, user));
        RelationButton relationButton = this.LLIIIZ;
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
            if (relationButton == null) {
                return;
            }
            relationButton.setVisibility(8);
            return;
        }
        if (relationButton != null) {
            if (relationButton.getVisibility() == 0) {
                return;
            }
            C226668v0 c226668v0 = new C226668v0();
            c226668v0.LIZ = user;
            c226668v0.LIZIZ(EnumC112694bZ.FRIENDS);
            c226668v0.LIZIZ = false;
            relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
        }
        if (user.getFollowerStatus() == 1) {
            str = "follow_back_button";
        } else {
            str = "follow_button";
        }
        if (relationButton != null) {
            relationButton.setTracker(new AqS69S1100000_1(user, str, 4));
            relationButton.setFollowClickInterceptor(new C794439w(relationButton, user, null));
            relationButton.setVisibility(0);
        }
        if (user.getFollowerStatus() == 1) {
            str2 = "follow_back";
        } else {
            str2 = "follow";
        }
        String LJIL = C227768wm.LJIL(user);
        String uid = user.getUid();
        if (uid == null) {
            uid = "";
        }
        String accurateRecType = user.getAccurateRecType();
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C111074Xn.LIZ(LIZ, "onEventV3", "enter_from", "chat", "to_user_id", uid);
        LIZ2.put("follow_type", str2);
        if (accurateRecType == null) {
            accurateRecType = "";
        }
        LIZ2.put("rec_type", accurateRecType);
        if (LJIL == null) {
            LJIL = "";
        }
        LIZ2.put("to_user_type", LJIL);
        LIZ.LIZIZ("show_follow_button", LIZ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass429(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIIILZ = (C119624mk) itemView.findViewById(R.id.i6u);
        this.LLIIIJ = (TuxTextView) itemView.findViewById(R.id.i9h);
        this.LLIIIL = (LinearLayout) itemView.findViewById(R.id.i_0);
        RelationButton relationButton = (RelationButton) itemView.findViewById(R.id.iu_);
        this.LLIIIZ = relationButton;
        if (C99W.LIZ) {
            relationButton.getClass();
        }
        if (((Boolean) C57469Mgz.LJI.getValue()).booleanValue()) {
            ViewGroup.LayoutParams layoutParams = relationButton.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C7MY.LIZIZ(164);
                relationButton.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static String o0(int i, int i2) {
        try {
            Locale locale = Locale.getDefault();
            String formatFollowing = C77123UOp.LJJIIJ(i);
            String formatFollower = C77123UOp.LJJIIJ(i2);
            String LLLZI = C16880lQ.LLLZI(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
            String LLLZI2 = C16880lQ.LLLZI(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            o.LJIIIIZZ(LLLZI2, "format(locale, format, *args)");
            String quantityString = C39849FkT.LIZ().getResources().getQuantityString(R.plurals.dc, i2, Integer.valueOf(i), Integer.valueOf(i2));
            o.LJIIIIZZ(quantityString, "context.resources.getQua…llowerCount\n            )");
            if (i > i2) {
                o.LJIIIIZZ(formatFollowing, "formatFollowing");
                String LJJJJZ = ujb.o.LJJJJZ(quantityString, LLLZI, formatFollowing, false);
                o.LJIIIIZZ(formatFollower, "formatFollower");
                return ujb.o.LJJJJZ(LJJJJZ, LLLZI2, formatFollower, false);
            }
            o.LJIIIIZZ(formatFollower, "formatFollower");
            String LJJJJZ2 = ujb.o.LJJJJZ(quantityString, LLLZI2, formatFollower, false);
            o.LJIIIIZZ(formatFollowing, "formatFollowing");
            return ujb.o.LJJJJZ(LJJJJZ2, LLLZI, formatFollowing, false);
        } catch (Exception unused) {
            return "";
        }
    }

    public final void m0(C98523to sessionInfo, IMUser iMUser) {
        C99033ud c99033ud;
        o.LJIIIZ(sessionInfo, "sessionInfo");
        if (iMUser != null || (iMUser = sessionInfo.getFromUser()) != null) {
            ArrayList arrayList = new ArrayList();
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(iMUser, sessionInfo, 75), this.itemView);
            h0.LJIJI(this.itemView, new IDaS88S0000000_1(10));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('@');
            LIZ.append(iMUser.getUniqueId());
            arrayList.add(X1D.LIZIZ(LIZ));
            arrayList.add(o0(iMUser.getFollowingCount(), iMUser.getFollowerCount()));
            if (iMUser.getAvatarMedium() != null) {
                UrlModel avatarMedium = iMUser.getAvatarMedium();
                o.LJIIIIZZ(avatarMedium, "updatedUser.avatarMedium");
                C1033743x.LIZ(avatarMedium, iMUser.getDisplayAvatar(), this.LLIIIILZ);
            } else if (iMUser.getDisplayAvatar() != null) {
                UrlModel displayAvatar = iMUser.getDisplayAvatar();
                o.LJIIIIZZ(displayAvatar, "updatedUser.displayAvatar");
                C1033743x.LIZ(displayAvatar, null, this.LLIIIILZ);
            }
            if (iMUser.getDisplayName() != null) {
                String displayName = iMUser.getDisplayName();
                o.LJIIIIZZ(displayName, "updatedUser.displayName");
                C1033743x.LIZIZ(displayName, arrayList, this.LLIIIJ, this.LLIIIL);
            }
            if ((C3UE.LIZIZ() && iMUser.getFollowStatus() == 0 && (c99033ud = this.LJLLL) != null && c99033ud.getChatType() == 0) || (C52454KiI.LIZ() && iMUser.getFollowerStatus() == 1 && iMUser.getFollowStatus() != 2)) {
                User user = IMUser.toUser(iMUser);
                o.LJIIIIZZ(user, "toUser(updatedUser)");
                n0(user);
            }
        }
    }

    @Override // X.AbstractC1041546x
    public final void P(C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2, int i) {
        o.LJIIIZ(msg, "msg");
        super.P(msg, c109544Rq, c109544Rq2, i);
        C99033ud c99033ud = this.LJLLL;
        if (c99033ud instanceof C98523to) {
            m0((C98523to) c99033ud, null);
        }
    }
}
