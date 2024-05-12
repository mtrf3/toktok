package com.ss.android.ugc.aweme.friendstab.tab;

import X.ActivityC45651qj;
import X.C188787b0;
import X.C234279Hj;
import X.C234289Hk;
import X.C2U8;
import X.C35906E7i;
import X.C45804HyK;
import X.C52287Kfb;
import X.C53976LGi;
import X.C54029LIj;
import X.C54423LXn;
import X.C55096Ljo;
import X.C55230Lly;
import X.EnumC36206EIw;
import X.EnumC53733L6z;
import X.EnumC53981LGn;
import X.LGG;
import X.LGQ;
import X.LHM;
import X.LJK;
import X.LXS;
import X.LXU;
import X.ORZ;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.model.NewContentResponse;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.model.ToolBarIconModel;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IFriendsTabDebugService;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsFeedProtocol implements ISocialTabProtocol {
    public Context LJLJJI;
    public final LGG LJLIL = new LGG(this);
    public final ToolBarIconModel LJLILLLLZI = new ToolBarIconModel(false, R.raw.icon_person_plus, R.attr.dj, null, C234279Hj.LJLIL, 8, null);
    public final ToolBarIconModel LJLJI = new ToolBarIconModel(false, R.raw.icon_magnifying_glass_offset, R.attr.dj, EnumC53733L6z.SEARCH, C234289Hk.LJLIL);
    public final String LJLJJL = "FRIENDS_FEED";
    public final Class<SocialFriendsFeedFragment> LJLJJLL = SocialFriendsFeedFragment.class;

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String LJIIIZ() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void LLJL() {
    }

    public final FeedFragment LIZ() {
        ActivityC45651qj LJJIFFI;
        C188787b0 c188787b0 = Hox.LJLLI;
        Context context = this.LJLJJI;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            Fragment Ja = c188787b0.LIZ(LJJIFFI).Ja("FRIENDS_FEED");
            if (!(Ja instanceof FeedFragment)) {
                return null;
            }
            return (FeedFragment) Ja;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void Y() {
        LHM.LIZIZ.LIZIZ().visitSocial2Tab("FRIENDS_FEED");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean enable() {
        LHM lhm = LHM.LIZIZ;
        if (lhm.LIZ().shouldShowFriendsTab() && o.LJ(lhm.LIZ().getSocial2TabTabName(), this.LJLJJL) && !C54029LIj.LIZIZ.LJJIJL()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean isLoading() {
        IFeedFetchDataAbility iFeedFetchDataAbility;
        FeedFragment LIZ = LIZ();
        if (LIZ != null && (iFeedFetchDataAbility = (IFeedFetchDataAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZ, null), IFeedFetchDataAbility.class, null)) != null) {
            return iFeedFetchDataAbility.isLoading();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Class<SocialFriendsFeedFragment> LJJJJZI() {
        return this.LJLJJLL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final LGQ LLILIL() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String getTag() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void K(EnumC53981LGn method) {
        LXS LIZ;
        o.LJIIIZ(method, "method");
        FeedFragment LIZ2 = LIZ();
        if (LIZ2 != null) {
            ActivityC45651qj mo49getActivity = LIZ2.mo49getActivity();
            if (mo49getActivity != null && !C54423LXn.LIZIZ.LIZ().LJ(mo49getActivity) && (LIZ = LXU.LIZ()) != null) {
                LIZ.LIZLLL(false);
            }
            LIZ2.ub(true);
            C2U8.LIZ(new LJK(3));
            LHM.LIZIZ.LIZIZ().visitSocial2Tab("FRIENDS_FEED");
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Friends");
        return bundle;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void f(String fromTag) {
        o.LJIIIZ(fromTag, "fromTag");
        if (fromTag.length() == 0 && C52287Kfb.LIZ()) {
            return;
        }
        LHM.LIZIZ.LIZIZ().visitSocial2Tab("FRIENDS_FEED");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJI = context;
        C54029LIj.LIZIZ.LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.gop);
        o.LJIIIIZZ(string, "context.getString(R.stri…dstab_search_bar_friends)");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void a0(SocialFeedRedDotResponse response, EnumC36206EIw source) {
        boolean z;
        Context context;
        IBottomFriendsTabAvatarAbility LJIIIZ;
        UserNewContent userNewContent;
        User user;
        IBottomTabLayoutAbility LJI;
        o.LJIIIZ(response, "response");
        o.LJIIIZ(source, "source");
        UrlModel urlModel = null;
        if ((response instanceof NewContentResponse.FriendsFeedRedDotResponse) && response != null) {
            IFriendsTabDebugService iFriendsTabDebugService = (IFriendsTabDebugService) ServiceManager.get().getService(IFriendsTabDebugService.class);
            if (iFriendsTabDebugService != null) {
                response.getRedDotCount();
                iFriendsTabDebugService.LJ();
                iFriendsTabDebugService.LIZ(response.getRedDotList());
            }
            boolean LIZ = C35906E7i.LIZ();
            Context context2 = this.LJLJJI;
            if (context2 != null && (LJI = C53976LGi.LJI(context2)) != null) {
                z = LJI.wY();
            } else {
                z = false;
            }
            ArrayList<UserNewContent> avatarList = response.getAvatarList();
            if (avatarList != null && (userNewContent = (UserNewContent) ORZ.LJLLLL(avatarList)) != null && (user = userNewContent.getUser()) != null) {
                urlModel = user.getAvatarThumb();
            }
            if (LIZ && !z && urlModel != null && (context = this.LJLJJI) != null && (LJIIIZ = C53976LGi.LJIIIZ(context)) != null) {
                LJIIIZ.hf0(response, urlModel);
            }
        }
    }
}
