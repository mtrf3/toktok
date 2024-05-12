package com.ss.android.ugc.aweme.bottom;

import X.C221108m2;
import X.C53986LGs;
import X.C54040LIu;
import X.C54041LIv;
import X.C54117LLt;
import X.C62822Ol8;
import X.EnumC53761L8b;
import X.LH6;
import X.LQA;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.ui.FeedNearbyFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyBottomTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 71));
    public final LH6 LJLJJL = new LH6(new C53986LGs(R.drawable.bt_, R.attr.go), new C53986LGs(R.drawable.bt8, R.attr.dj), new C53986LGs(R.drawable.bt9, R.attr.gv), new C53986LGs(R.drawable.bt7, R.attr.dl), Integer.valueOf(R.id.gc4));
    public final Class<? extends Fragment> LJLJJLL = FeedNearbyFragment.class;
    public final String LJLJL = "Nearby";
    public final EnumC53761L8b LJLJLJ = EnumC53761L8b.TAB_2;
    public final String LJLJLLL = "homepage_nearby";

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C54117LLt LIZ() {
        return new C54041LIv();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        if (NearbyTabConfig.LIZIZ().showBottomTab && LQA.LIZIZ.LJIJI()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC53761L8b LIZLLL() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String LJIIIZ() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJFF(Context context) {
        o.LJIIIZ(context, "context");
        ((View.OnClickListener) this.LJLJJI.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 7);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_nearby");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Nearby");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String defaultTabName = C54040LIu.LIZ;
        o.LJIIIIZZ(defaultTabName, "defaultTabName");
        return defaultTabName;
    }
}
