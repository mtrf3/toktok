package com.ss.android.ugc.aweme.stemfeed.ui.tab;

import X.AV1;
import X.C52240Keq;
import X.C72972SkS;
import X.EnumC53763L8d;
import X.LGE;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedFragment;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes10.dex */
public final class StemTabProtocol extends TopTabProtocol {
    public final String LJLJJI = "Stem";
    public final Class<? extends Fragment> LJLJJL = StemFeedFragment.class;
    public final LGE LJLJJLL = LGE.STEM;
    public final EnumC53763L8d LJLJL = EnumC53763L8d.X_TAB;
    public final int LJLJLJ = 36;
    public final String LJLJLLL = "homepage_topic_stem";

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIIJ() {
        if (a.LJIIZILJ().LJIL().isOn() && t1.LJI() && !AV1.LJIILLIIL()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return C52240Keq.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LGE LJ() {
        return this.LJLJJLL;
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
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_topic_stem");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Stem");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.rm6, "context.resources.getStr…Feed_feedScreen_feedName)");
    }
}
