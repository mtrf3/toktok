package com.ss.android.ugc.aweme.newfollow.ui;

import X.C221108m2;
import X.C53993LGz;
import X.C62822Ol8;
import X.C72972SkS;
import X.EnumC53761L8b;
import X.LH0;
import X.LH1;
import X.LH6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiscoverCompassTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI;
    public final LH6 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final String LJLJL;
    public final EnumC53761L8b LJLJLJ;
    public final String LJLJLLL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return (Class) this.LJLJJLL.getValue();
    }

    public DiscoverCompassTabProtocol() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C53993LGz.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 332));
        this.LJLJJL = ((LH0) LIZIZ.getValue()).LIZ();
        this.LJLJJLL = C221108m2.LIZIZ(LH1.LJLIL);
        this.LJLJL = "DISCOVER";
        this.LJLJLJ = EnumC53761L8b.TAB_2;
        this.LJLJLLL = "discovery";
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
        Bundle bundle = new Bundle();
        bundle.putSerializable("i18n_tab_mode", Boolean.TRUE);
        return bundle;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.hza, "context.resources.getStr…string.main_tab_discover)");
    }
}
