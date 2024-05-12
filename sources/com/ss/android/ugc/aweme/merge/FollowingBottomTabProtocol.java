package com.ss.android.ugc.aweme.merge;

import X.ActivityC45651qj;
import X.C10K;
import X.C116694i1;
import X.C188787b0;
import X.C221108m2;
import X.C35906E7i;
import X.C45804HyK;
import X.C53295Kvr;
import X.C53976LGi;
import X.C53986LGs;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62822Ol8;
import X.C72972SkS;
import X.C8BU;
import X.EF7;
import X.EnumC53761L8b;
import X.LH6;
import X.LXS;
import X.LXU;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.feed.platform.panel.presenter.IFeedFetchDataAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowingBottomTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 323));
    public final String LJLJJL = "homepage_follow";
    public final String LJLJJLL = "Following";
    public final LH6 LJLJL = new LH6(new C53986LGs(R.drawable.avs, R.attr.go), new C53986LGs(R.drawable.avs, R.attr.dj), new C53986LGs(R.drawable.avr, R.attr.gv), new C53986LGs(R.drawable.avt, R.attr.dl), Integer.valueOf(R.id.gbz));
    public final Class<? extends Fragment> LJLJLJ = FeedFollowFragment.class;
    public final EnumC53761L8b LJLJLLL = EnumC53761L8b.TAB_2;

    public final FeedFragment LJII() {
        ActivityC45651qj LJJIFFI;
        C188787b0 c188787b0 = Hox.LJLLI;
        Context context = this.LJLJI;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            Fragment Ja = c188787b0.LIZ(LJJIFFI).Ja("Following");
            if (!(Ja instanceof FeedFragment)) {
                return null;
            }
            return (FeedFragment) Ja;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        if (C53295Kvr.LIZIZ() && !MSAdaptionService.LJIIL().LIZLLL(EF7.LIZIZ())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC53761L8b LIZLLL() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String LJIIIZ() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJFF(Context context) {
        boolean z;
        IBottomFriendsTabAvatarAbility LJIIIZ;
        IBottomFriendsTabAvatarAbility LJIIIZ2;
        FeedFragment LJII;
        IFeedFetchDataAbility iFeedFetchDataAbility;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI == null) {
            return;
        }
        if (o.LJ(C116694i1.LIZ(LJJIFFI).nv0(), "Following") && (LJII = LJII()) != null && (iFeedFetchDataAbility = (IFeedFetchDataAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LJII, null), IFeedFetchDataAbility.class, null)) != null && iFeedFetchDataAbility.isLoading()) {
            return;
        }
        if (C35906E7i.LIZ()) {
            Context context2 = this.LJLJI;
            if (context2 != null && (LJIIIZ2 = C53976LGi.LJIIIZ(context2)) != null) {
                LJII();
                LJIIIZ2.sA();
            }
            Context context3 = this.LJLJI;
            if (context3 != null && (LJIIIZ = C53976LGi.LJIIIZ(context3)) != null) {
                z = LJIIIZ.isShowing();
            } else {
                z = false;
            }
            FeedFragment LJII2 = LJII();
            if (z && LJII2 != null) {
                LXS LIZ = LXU.LIZ();
                if (LIZ != null) {
                    LIZ.LIZJ(false);
                }
                LJII2.ub(true);
            }
        }
        ((View.OnClickListener) this.LJLJJI.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 1);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Following");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        C10K.LIZJ(new C8BU(false));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.sfq, "context.resources.getStr…R.string.top_tabs_follow)");
    }
}
