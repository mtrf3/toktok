package com.ss.android.ugc.aweme.ecommerce.fashionmall;

import X.C221108m2;
import X.C53380KxE;
import X.C53968LGa;
import X.C56045Lz7;
import X.C62822Ol8;
import X.C72972SkS;
import X.C76542zS;
import X.EnumC53761L8b;
import X.LH6;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS2S1010000_9;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FashionMallBottomTabProtocol extends BottomTabProtocol {
    public Context LJLJI;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 96));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C53968LGa.LJLIL);
    public final Class<? extends Fragment> LJLJJLL = FashionMallFragment.class;
    public final String LJLJL = "FASHION_MALL";
    public final EnumC53761L8b LJLJLJ = EnumC53761L8b.TAB_2;
    public final String LJLJLLL = "fashion_mall";

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final LH6 LIZJ() {
        return (LH6) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final boolean enable() {
        return C53380KxE.LIZ();
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

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ff, code lost:
    
        if (r7 != null) goto L57;
     */
    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.content.Context r23) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallBottomTabProtocol.LJFF(android.content.Context):void");
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final void init(Context context) {
        String str;
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        String mob = this.LJLJLLL;
        c56045Lz7.getClass();
        o.LJIIIZ(mob, "mob");
        boolean LJ = o.LJ(mob, "fashion_mall");
        if (LJ) {
            str = "mall";
        } else {
            str = "homepage";
        }
        C76542zS.LIZJ("tiktokec_mall_entrance_show", new AqS2S1010000_9(str, LJ, 0));
        C76542zS.LIZJ("rd_tiktokec_mall_entrance_show", new AqS32S1000000_9(str, 8));
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol
    public final String w0(Context context) {
        return C72972SkS.LJ(context, "context", R.string.ffq, "context.resources.getStr…tring.ecom_shop_tab_name)");
    }
}
