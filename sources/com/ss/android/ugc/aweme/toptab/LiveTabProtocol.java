package com.ss.android.ugc.aweme.toptab;

import X.C30033BqX;
import X.C31205CMn;
import X.EnumC53763L8d;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.toptab.ui.LiveDualFeedFragment;
import com.ss.android.ugc.aweme.toptab.ui.LiveSingleFeedFragment;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveTabProtocol extends TopTabProtocol {
    public final String LJLJJI;
    public final String LJLJJL;
    public final Class<? extends Fragment> LJLJJLL;
    public final EnumC53763L8d LJLJL;
    public final int LJLJLJ;
    public final String LJLJLLL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        if (o.LJ(this.LJLJJI, "live_tab_single") || o.LJ(this.LJLJJI, "live_tab_double")) {
            return true;
        }
        return false;
    }

    public LiveTabProtocol() {
        Class<? extends Fragment> cls;
        C30033BqX LIZ = C31205CMn.LIZ();
        String str = (LIZ == null || (str = LIZ.LJJIZ()) == null) ? "" : str;
        this.LJLJJI = str;
        this.LJLJJL = "Live";
        if (o.LJ(str, "live_tab_single")) {
            cls = LiveSingleFeedFragment.class;
        } else {
            cls = LiveDualFeedFragment.class;
        }
        this.LJLJJLL = cls;
        this.LJLJL = EnumC53763L8d.X_TAB;
        this.LJLJLJ = 37;
        this.LJLJLLL = "homepage_live";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIIJ() {
        return t1.LJI();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle bundle = new Bundle(2);
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", this.LJLJLJ);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_live");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Live");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.mx3);
        o.LJIIIIZZ(string, "context.getString(R.stri…pm_main_live_entry_final)");
        return string;
    }
}
