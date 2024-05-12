package com.ss.android.ugc.aweme.ecommerce.mall;

import X.AbstractC56099Lzz;
import X.C221108m2;
import X.C56092Lzs;
import X.C62822Ol8;
import X.C72972SkS;
import X.EnumC53761L8b;
import X.LG9;
import X.LH6;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ShopBottomTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 112));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(LG9.LJLIL);
    public final Class<? extends Fragment> LJLJJLL = ShopMainFragment.class;
    public final String LJLJL = "SHOP_MALL";
    public final EnumC53761L8b LJLJLJ = EnumC53761L8b.TAB_2;
    public final String LJLJLLL = "homepage_shop_mall";

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return (LH6) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return ECommerceMallService.v3().LJJLI();
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
        ((AbstractC56099Lzz) this.LJLJJI.getValue()).LIZJ(null, false, false);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void LJI(Context context) {
        o.LJIIIZ(context, "context");
        ((AbstractC56099Lzz) this.LJLJJI.getValue()).LIZJ(null, false, true);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        C56092Lzs c56092Lzs = C56092Lzs.LIZ;
        String str = this.LJLJLLL;
        c56092Lzs.getClass();
        C56092Lzs.LJIJJ(context, str);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.ffq, "context.resources.getStr…tring.ecom_shop_tab_name)");
    }
}
