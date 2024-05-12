package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopBottomTabProtocol;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopTopTabProtocol;

/* loaded from: classes10.dex */
public final class LE1 extends AbstractC53764L8e {
    @Override // X.AbstractC53764L8e
    public final BottomTabProtocol LIZ() {
        return new ShopBottomTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final TopTabProtocol LIZJ() {
        return new ShopTopTabProtocol();
    }

    @Override // X.AbstractC53764L8e
    public final EnumC53808L9w LIZIZ() {
        return EnumC53808L9w.MALL;
    }
}
