package com.ss.android.ugc.aweme.popularfeed.ui.tab;

import X.C00F;
import X.C72972SkS;
import X.EnumC53763L8d;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.popularfeed.ui.FeedPopularFragment;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PopularTabProtocol extends TopTabProtocol {
    public final String LJLJJI = "Popular";
    public final Class<? extends Fragment> LJLJJL = FeedPopularFragment.class;
    public final EnumC53763L8d LJLJJLL = EnumC53763L8d.X_TAB;
    public final int LJLJL = 33;
    public final String LJLJLJ = "homepage_popular";

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        if (C00F.LIZ(31744, 0, "enable_popular_feed", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIIJ() {
        return t1.LJI();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LJLJL);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_popular");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Popular");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.p4i, "context.resources.getStr….popularfeed_entry_title)");
    }
}
