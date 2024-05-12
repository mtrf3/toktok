package com.ss.android.ugc.aweme.explore.entrance;

import X.C206928Ae;
import X.C221108m2;
import X.C53986LGs;
import X.C62822Ol8;
import X.EnumC53761L8b;
import X.LH6;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.ss.android.ugc.aweme.explore.ui.Explore2TabFeedFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ExploreBottomTabProtocol extends BottomTabProtocol {
    public Context LJLJJI;
    public final String LJLJI = "homepage_explore";
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 147));
    public final LH6 LJLJJLL = new LH6(new C53986LGs(R.drawable.atc, R.attr.go), new C53986LGs(R.drawable.ata, R.attr.dj), new C53986LGs(R.drawable.atd, R.attr.gv), new C53986LGs(R.drawable.atb, R.attr.dl), Integer.valueOf(R.id.gbz));
    public final Class<? extends Fragment> LJLJL = Explore2TabFeedFragment.class;
    public final EnumC53761L8b LJLJLJ = EnumC53761L8b.TAB_2;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return C206928Ae.LIZ();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC53761L8b LIZLLL() {
        return this.LJLJLJ;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LJLJI;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJFF(Context context) {
        o.LJIIIZ(context, "context");
        ((View.OnClickListener) this.LJLJJL.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJJI = context;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.g7v);
        o.LJIIIIZZ(string, "context.getString(R.stri…ploretab_tabname_explore)");
        return string;
    }
}
