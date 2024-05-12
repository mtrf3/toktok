package com.ss.android.ugc.aweme.ui;

import X.AbstractC53958LFq;
import X.C29822Bn8;
import X.EnumC53763L8d;
import X.LCS;
import X.LCY;
import X.LQA;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyTabProtocol extends TopTabProtocol {
    public static String LJLJLLL;
    public final String LJLJJI = "Nearby";
    public final Class<? extends Fragment> LJLJJL = FeedNearbyFragment.class;
    public final EnumC53763L8d LJLJJLL = EnumC53763L8d.X_TAB;
    public final String LJLJL = "homepage_nearby";
    public final int LJLJLJ = 7;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LCY LIZJ() {
        return new LCS();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        if (LQA.LIZIZ.LJIJI() && !NearbyTabConfig.LIZIZ().showBottomTab) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        AbstractC53958LFq LIZIZ = LJFF().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZ();
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLJL;
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
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LJLJLJ);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_nearby");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Nearby");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String str = LJLJLLL;
        if (str == null) {
            return C29822Bn8.LIZ(context, R.string.il9, "context.resources.getStr…R.string.nearby_tab_name)");
        }
        return str;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJII(String str, String str2) {
        AbstractC53958LFq LIZIZ = LJFF().LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LIZJ();
        }
    }
}
