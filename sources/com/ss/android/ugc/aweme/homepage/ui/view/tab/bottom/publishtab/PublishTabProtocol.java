package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab;

import X.C221108m2;
import X.C53986LGs;
import X.C54117LLt;
import X.C62822Ol8;
import X.EnumC53761L8b;
import X.LH6;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PublishTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 257));
    public final LH6 LJLJJL;
    public final String LJLJJLL;
    public final EnumC53761L8b LJLJL;

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final Class<? extends Fragment> LJJJJZI() {
        return null;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        o.LJIIIZ(context, "context");
        return "";
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final C54117LLt LIZ() {
        return new PublishBottomTabViewFactory();
    }

    public PublishTabProtocol() {
        C53986LGs c53986LGs = new C53986LGs(R.id.gbx, R.attr.go);
        C53986LGs c53986LGs2 = new C53986LGs(R.id.gbx, R.attr.dl);
        C53986LGs c53986LGs3 = new C53986LGs(R.id.gbx, R.attr.go);
        this.LJLJJL = new LH6(c53986LGs3, c53986LGs3, c53986LGs, c53986LGs2, Integer.valueOf(R.id.gbx));
        this.LJLJJLL = "PUBLISH";
        this.LJLJL = EnumC53761L8b.TAB_3;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final EnumC53761L8b LIZLLL() {
        return this.LJLJL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String getTag() {
        return this.LJLJJLL;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJFF(Context context) {
        o.LJIIIZ(context, "context");
        ((View.OnClickListener) this.LJLJJI.getValue()).onClick(null);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
    }
}
