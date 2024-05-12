package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion;

import X.AnonymousClass064;
import X.C16880lQ;
import X.C221108m2;
import X.C27448Apw;
import X.C27449Apx;
import X.C32151Nz;
import X.C44878HjO;
import X.C57396Mfo;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C72545SdZ;
import X.C78946Uyc;
import X.C79045V0n;
import X.EnumC72807Shn;
import X.OUP;
import X.S3I;
import X.S3L;
import X.W5F;
import Y.IDObjectS328S0100000_4;
import Y.IDObjectS3S0101000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceButtonInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpPromotionEntranceInfoViewHolder extends AbsFullSpanVH {
    public final Context LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public View LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpPromotionEntranceInfoViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a3t, viewGroup, false));
        this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLIL = this.itemView.getContext();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 57));
    }

    public final void M(View view) {
        if (view.getTag() == null) {
            return;
        }
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 42, 42), view);
        if (view instanceof ViewGroup) {
            Iterator it = new IDObjectS328S0100000_4((ViewGroup) view, 2).iterator();
            while (true) {
                IDObjectS3S0101000_4 iDObjectS3S0101000_4 = (IDObjectS3S0101000_4) it;
                if (iDObjectS3S0101000_4.hasNext()) {
                    M((View) iDObjectS3S0101000_4.next());
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        ViewGroup viewGroup;
        String str;
        int i;
        String str2;
        EntranceButtonInfo entranceButtonInfo;
        List<Image> list;
        int i2;
        int i3;
        C27448Apw item = (C27448Apw) obj;
        o.LJIIIZ(item, "item");
        this.LJLILLLLZI.getValue();
        View view = this.itemView;
        ConstraintLayout constraintLayout = null;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        int i4 = 8;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                o.LJIIIIZZ(childAt, "getChildAt(i)");
                childAt.setVisibility(8);
            }
        }
        Integer num = item.LIZ;
        if (num == null || num.intValue() != 6) {
            return;
        }
        View findViewById = this.itemView.findViewById(R.id.jnl);
        o.LJIIIIZZ(findViewById, "itemView.findViewById<Vi…eller_gift_with_purchase)");
        OUP.LJJLIIIJ(findViewById);
        View findViewById2 = this.itemView.findViewById(R.id.jnl);
        this.LJLJI = findViewById2;
        if (findViewById2 == null) {
            return;
        }
        Integer num2 = ((C27448Apw) getItem()).LIZ;
        if (num2 == null || num2.intValue() != 6) {
            str = "unKnown";
        } else {
            str = "promotion";
        }
        View view2 = this.itemView;
        C78946Uyc.LJJIIJZLJL(view2, C62850Ola.LJI(view2, "itemView"), C27449Apx.LJLIL, new AqS58S1100000_4(this, str, 20));
        View findViewById3 = findViewById2.findViewById(R.id.jnr);
        o.LJIIIIZZ(findViewById3, "cv.seller_gift_with_purchase_split_line");
        if (((C27448Apw) getItem()).LJ) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById3.setVisibility(i);
        TextView textView = (TextView) findViewById2.findViewById(R.id.jns);
        EntranceBannerInfo entranceBannerInfo = ((C27448Apw) getItem()).LIZJ;
        if (entranceBannerInfo != null) {
            str2 = entranceBannerInfo.title;
        } else {
            str2 = null;
        }
        textView.setText(str2);
        M(findViewById2);
        EntranceBannerInfo entranceBannerInfo2 = ((C27448Apw) getItem()).LIZJ;
        if (entranceBannerInfo2 == null || (entranceButtonInfo = entranceBannerInfo2.buttonInfo) == null || (list = entranceButtonInfo.buttonImgList) == null) {
            return;
        }
        if (findViewById2 instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) findViewById2;
        }
        if (constraintLayout != null) {
            AnonymousClass064 LIZ = C57396Mfo.LIZ(constraintLayout);
            if (list.size() >= 2) {
                i3 = R.id.jnq;
            } else {
                i3 = R.id.jnp;
            }
            LIZ.LJIIIIZZ(R.id.jnn, 6, i3, 7);
            LIZ.LIZIZ(constraintLayout);
        }
        ImageView imageView = (ImageView) findViewById2.findViewById(R.id.jnp);
        o.LJIIIIZZ(imageView, "cv.seller_gift_with_purchase_pic_left");
        if (!list.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.jnq);
        o.LJIIIIZZ(imageView2, "cv.seller_gift_with_purchase_pic_right");
        if (list.size() >= 2) {
            i4 = 0;
        }
        imageView2.setVisibility(i4);
        if (!(!list.isEmpty())) {
            return;
        }
        SmartImageView smartImageView = (SmartImageView) findViewById2.findViewById(R.id.jnp);
        o.LJIIIIZZ(smartImageView, "cv.seller_gift_with_purchase_pic_left");
        L(smartImageView, (Image) ListProtector.get(list, 0));
        if (list.size() < 2) {
            return;
        }
        SmartImageView smartImageView2 = (SmartImageView) findViewById2.findViewById(R.id.jnq);
        o.LJIIIIZZ(smartImageView2, "cv.seller_gift_with_purchase_pic_right");
        L(smartImageView2, (Image) ListProtector.get(list, 1));
    }

    public final void L(SmartImageView smartImageView, Image image) {
        int i;
        W5F LIZLLL = C70759Rpr.LIZLLL(image);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        Context context = this.LJLIL;
        o.LJIIIIZZ(context, "context");
        LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.e1, context);
        S3I s3i = new S3I();
        s3i.LIZLLL = C32151Nz.LJIIZILJ(2);
        Context context2 = this.LJLIL;
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.e1, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        float LJIIZILJ = C32151Nz.LJIIZILJ(Float.valueOf(0.5f));
        s3i.LIZJ = i;
        s3i.LIZIZ = LJIIZILJ;
        LIZLLL.LJIJJLI = new S3L(s3i);
        LIZLLL.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LIZLLL);
    }
}
