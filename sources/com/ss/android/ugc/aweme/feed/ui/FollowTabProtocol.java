package com.ss.android.ugc.aweme.feed.ui;

import X.AbstractC53958LFq;
import X.C10K;
import X.C116484hg;
import X.C52234Kek;
import X.C53295Kvr;
import X.C72972SkS;
import X.C8BU;
import X.EnumC53763L8d;
import X.IDX;
import X.InterfaceC53995LHb;
import X.LCO;
import X.LCY;
import X.LGE;
import X.LHM;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.services.NetworkStateServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FollowTabProtocol extends TopTabProtocol {
    public boolean LJLJJI;
    public final String LJLJJL = "homepage_follow";
    public final String LJLJJLL = "Following";
    public final Class<? extends Fragment> LJLJL = FeedFollowFragment.class;
    public final EnumC53763L8d LJLJLJ = EnumC53763L8d.SECOND_RIGHT;
    public final int LJLJLLL = 1;
    public final LGE LJLL = LGE.FOLLOW;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LCY LIZJ() {
        return new LCO();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        AbstractC53958LFq LIZIZ = LJFF().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZ();
        }
        C116484hg.LIZ("network_status", String.valueOf(NetworkStateServiceImpl.createINetworkStateServicebyMonsterPlugin(false).getEffectiveConnectionType()), "homepage_follow_click");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        if (!C53295Kvr.LIZIZ() && !C52234Kek.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LGE LJ() {
        return this.LJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LJLJLLL);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_follow");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Following");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        if (!this.LJLJJI) {
            this.LJLJJI = true;
            C10K.LIZJ(new C8BU(true));
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.sfq, "context.resources.getStr…R.string.top_tabs_follow)");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJII(String str, String str2) {
        AbstractC53958LFq LIZIZ = LJFF().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZJ();
        }
        IDX.LIZIZ = true;
        if (C53295Kvr.LIZJ()) {
            InterfaceC53995LHb redDotLogic = LHM.LIZIZ.LIZIZ().redDotLogic();
            if (str == null) {
                str = "";
            }
            redDotLogic.Zk(str, str2);
        }
    }
}
