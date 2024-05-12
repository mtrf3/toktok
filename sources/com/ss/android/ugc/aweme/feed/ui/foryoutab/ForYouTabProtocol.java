package com.ss.android.ugc.aweme.feed.ui.foryoutab;

import X.C29822Bn8;
import X.C90383gg;
import X.EnumC53763L8d;
import X.InterfaceC53908LDs;
import X.InterfaceC53911LDv;
import X.InterfaceC53912LDw;
import X.LGE;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ForYouTabProtocol extends TopTabProtocol implements InterfaceC53912LDw {
    public final String LJLJJI = "homepage_hot";
    public final String LJLJJL = "For You";
    public final Class<? extends Fragment> LJLJJLL = FeedRecommendFragment.class;
    public final LGE LJLJL = LGE.FOR_YOU;
    public final EnumC53763L8d LJLJLJ = EnumC53763L8d.RIGHT;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return 0;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC53912LDw
    public final void LIZ() {
        InterfaceC53908LDs interfaceC53908LDs = LJFF().LIZ;
        if (interfaceC53908LDs == null) {
            return;
        }
        Context context = interfaceC53908LDs.getView().getContext();
        o.LJIIIIZZ(context, "getView().context");
        interfaceC53908LDs.setText(w0(context));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LGE LJ() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLJJI;
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
        bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot");
        bundle.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "For You");
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        if (C90383gg.LIZ()) {
            return C29822Bn8.LIZ(context, R.string.p4i, "context.resources.getStr….popularfeed_entry_title)");
        }
        if (e1.LIZ(31744, "for_you_new_translations", true, false)) {
            return C29822Bn8.LIZ(context, R.string.sft, "{\n            context.re…_tabs_recomend)\n        }");
        }
        return C29822Bn8.LIZ(context, R.string.gl6, "{\n            context.re…string.for_you)\n        }");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJII(String str, String str2) {
        InterfaceC53908LDs interfaceC53908LDs = LJFF().LIZ;
        if (interfaceC53908LDs == null) {
            interfaceC53908LDs = null;
        }
        InterfaceC53911LDv interfaceC53911LDv = (InterfaceC53911LDv) interfaceC53908LDs;
        if (interfaceC53911LDv != null) {
            interfaceC53911LDv.LIZ();
        }
    }
}
