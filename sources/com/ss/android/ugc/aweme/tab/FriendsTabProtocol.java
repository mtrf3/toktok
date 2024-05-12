package com.ss.android.ugc.aweme.tab;

import X.AbstractC38911fr;
import X.C16880lQ;
import X.C221108m2;
import X.C45804HyK;
import X.C53295Kvr;
import X.C53986LGs;
import X.C54011LHr;
import X.C62822Ol8;
import X.EnumC53761L8b;
import X.FMX;
import X.LGN;
import X.LH6;
import X.LHM;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.ui.FriendsTabContainerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 647));
    public final LH6 LJLJJL = new LH6(new C53986LGs(R.drawable.avs, R.attr.go), new C53986LGs(R.drawable.avs, R.attr.dj), new C53986LGs(R.drawable.avr, R.attr.gv), new C53986LGs(R.drawable.avt, R.attr.dl), Integer.valueOf(R.id.gbz));
    public final Class<? extends Fragment> LJLJJLL = FriendsTabContainerFragment.class;
    public final String LJLJL = "FRIENDS_TAB";
    public final EnumC53761L8b LJLJLJ = EnumC53761L8b.TAB_2;
    public final String LJLJLLL = "homepage_friends";
    public final LGN LJLL = new LGN();

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        if (LHM.LIZIZ.LIZ().shouldInitSocial2Tab() && !C53295Kvr.LIZ()) {
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
    public final AbstractC38911fr LJ() {
        return this.LJLL;
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
        Intent intent;
        Bundle LLJJIJI;
        o.LJIIIZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null || (intent = LJIJJ.getIntent()) == null || (LLJJIJI = C16880lQ.LLJJIJI(intent)) == null) {
            return new Bundle();
        }
        return LLJJIJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        FMX.LJIILL("friends_tab_show", C54011LHr.LIZ());
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.gop);
        o.LJIIIIZZ(string, "context.getString(R.stri…dstab_search_bar_friends)");
        return string;
    }
}
