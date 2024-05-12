package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc;

import X.C16880lQ;
import X.C27162AlK;
import X.C27647At9;
import X.C45804HyK;
import X.C70759Rpr;
import X.C78565UsT;
import X.EnumC72807Shn;
import X.W5F;
import Y.ACListenerS39S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ProductDescImageBrickVO;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDescImageBrickVH extends BaseBrickVH<ProductDescImageBrickVO> {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final boolean Q() {
        return false;
    }

    public ProductDescImageBrickVH() {
        super(R.layout.a35);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(ProductDescImageBrickVO productDescImageBrickVO) {
        int i;
        Integer height;
        Integer width;
        ProductDescImageBrickVO item = productDescImageBrickVO;
        o.LJIIIZ(item, "item");
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.bn5);
        W5F LIZLLL = C70759Rpr.LIZLLL(item.image);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        EnumC72807Shn enumC72807Shn = EnumC72807Shn.CENTER;
        LIZLLL.LJIIJJI = R.drawable.adv;
        LIZLLL.LJIILJJIL = enumC72807Shn;
        LIZLLL.LIZIZ("CommerceHeadVH");
        LIZLLL.LJJIIJ = smartImageView;
        Image image = item.image;
        LifecycleCoroutineScope scope = LifecycleOwnerKt.getLifecycleScope(this);
        o.LJIIIZ(image, "image");
        o.LJIIIZ(scope, "scope");
        C16880lQ.LLJJJ(LIZLLL);
        if (item.needShowViewMore) {
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.nav));
            View findViewById = this.itemView.findViewById(R.id.nav);
            o.LJIIIIZZ(findViewById, "itemView.view_more");
            C78565UsT.LJJIZ(findViewById, null, new C27647At9(this, null), 3);
        } else {
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.nav));
        }
        Float f = item.realHeight;
        if (f != null) {
            float floatValue = (int) f.floatValue();
            float f2 = LiveTryModeCountDownThresholdSetting.DEFAULT;
            if (floatValue < C45804HyK.LJJ(f2)) {
                C45804HyK.LJJ(f2);
            }
        }
        Image image2 = item.image;
        Integer width2 = image2.getWidth();
        int i2 = 100;
        if ((width2 != null && width2.intValue() == 0) || image2.getWidth() == null || (width = image2.getWidth()) == null) {
            i = 100;
        } else {
            i = width.intValue();
        }
        Integer height2 = image2.getHeight();
        if ((height2 == null || height2.intValue() != 0) && image2.getHeight() != null && (height = image2.getHeight()) != null) {
            i2 = height.intValue();
        }
        int i3 = (C27162AlK.LIZ * i2) / i;
        if (smartImageView.getLayoutParams() == null) {
            new ViewGroup.LayoutParams(-1, i3);
        } else {
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = i3;
            smartImageView.setLayoutParams(layoutParams);
        }
        if (item.LJIIL() != 4) {
            C16880lQ.LJIIJ(new ACListenerS39S0200000_4(item, this, 83), this.itemView);
        }
    }
}
