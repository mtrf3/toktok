package com.ss.android.ugc.aweme.merge;

import X.ActivityC45651qj;
import X.C188787b0;
import X.C45804HyK;
import X.C53295Kvr;
import X.C55096Ljo;
import X.C55230Lly;
import X.C72972SkS;
import X.EnumC36206EIw;
import X.EnumC53981LGn;
import X.LGQ;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.friendstab.model.SocialFeedRedDotResponse;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowingFeedProtocol implements ISocialTabProtocol {
    public final Class<? extends Fragment> LJLIL = FeedFollowFragment.class;
    public final String LJLILLLLZI = "Following";
    public Context LJLJI;

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String LJIIIZ() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final LGQ LLILIL() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void LLJL() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void Y() {
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean isLoading() {
        ActivityC45651qj LJJIFFI;
        IFeedFetchDataAbility iFeedFetchDataAbility;
        C188787b0 c188787b0 = Hox.LJLLI;
        Context context = this.LJLJI;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            Fragment Ja = c188787b0.LIZ(LJJIFFI).Ja("Following");
            if ((Ja instanceof FeedFragment) && Ja != null && (iFeedFetchDataAbility = (IFeedFetchDataAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(Ja, null), IFeedFetchDataAbility.class, null)) != null) {
                return iFeedFetchDataAbility.isLoading();
            }
            return false;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final boolean enable() {
        return C53295Kvr.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String getTag() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void K(EnumC53981LGn method) {
        o.LJIIIZ(method, "method");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        return new Bundle();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void f(String fromTag) {
        o.LJIIIZ(fromTag, "fromTag");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.sfq, "context.resources.getStr…R.string.top_tabs_follow)");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol
    public final void a0(SocialFeedRedDotResponse response, EnumC36206EIw source) {
        o.LJIIIZ(response, "response");
        o.LJIIIZ(source, "source");
    }
}
