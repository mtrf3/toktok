package com.ss.android.ugc.aweme.friendstab.tab;

import X.C221108m2;
import X.C53295Kvr;
import X.C54011LHr;
import X.C54029LIj;
import X.C62822Ol8;
import X.EnumC53763L8d;
import X.FMX;
import X.HG3;
import X.LCN;
import X.LCY;
import X.LGE;
import X.LGL;
import X.LHM;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.friendstab.ui.SocialFriendsFeedFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendTopTabProtocol extends TopTabProtocol {
    public Context LJLJJI;
    public boolean LJLJJL;
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 251));
    public final String LJLJL = "FRIENDS_FEED";
    public final Class<? extends Fragment> LJLJLJ = SocialFriendsFeedFragment.class;
    public final String LJLJLLL = "homepage_friends";
    public final int LJLL = 31;
    public final LGE LJLLI = LGE.FRIENDS;
    public final EnumC53763L8d LJLLILLLL = EnumC53763L8d.X_TAB;

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LIZIZ() {
        ((LGL) this.LJLJJLL.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LCY LIZJ() {
        return new LCN();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean LJIIJ() {
        return HG3.LJIILL().isLogin();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final boolean enable() {
        if (C53295Kvr.LIZ() || !C54029LIj.LIZIZ.LJJIJL()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final EnumC53763L8d LIZLLL() {
        return this.LJLLILLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final LGE LJ() {
        return this.LJLLI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final int LJI() {
        return this.LJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String LJIIIZ() {
        return this.LJLJLLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String getTag() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final Bundle d(Context context) {
        o.LJIIIZ(context, "context");
        Bundle d = super.d(context);
        d.putString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "Friends");
        return d;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJI = context;
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            FMX.LJIILL("friends_tab_show", C54011LHr.LIZ());
        }
        C54029LIj.LIZIZ.LJIJJLI();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.gop);
        o.LJIIIIZZ(string, "context.getString(R.stri…dstab_search_bar_friends)");
        return string;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol
    public final void LJII(String str, String str2) {
        LHM.LIZIZ.LIZIZ().visitSocial2Tab("FRIENDS_FEED");
    }
}
