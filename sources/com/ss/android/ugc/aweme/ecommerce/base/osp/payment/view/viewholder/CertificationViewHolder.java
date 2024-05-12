package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.AbstractC85293Wj;
import X.C1FL;
import X.C44878HjO;
import X.ORZ;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CertificationIcon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentCertification;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CertificationViewHolder extends ECJediViewHolder {
    public final ViewGroup LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CertificationViewHolder(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a1r, viewGroup, false, "from(parent.context)\n   …ification, parent, false)"));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLIL = viewGroup;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        PaymentCertification item = (PaymentCertification) obj;
        o.LJIIIZ(item, "item");
        String str2 = item.title;
        if (str2 != null) {
            ((TextView) this.itemView.findViewById(R.id.lvr)).setText(str2);
        }
        final float textSize = ((TextView) this.itemView.findViewById(R.id.lvr)).getTextSize();
        final Context context = this.LJLIL.getContext();
        ((ViewGroup) this.itemView.findViewById(R.id.dbr)).removeAllViews();
        List<CertificationIcon> list = item.icons;
        if (list != null) {
            for (final CertificationIcon certificationIcon : list) {
                List<String> list2 = certificationIcon.urlList;
                if (list2 != null && (str = (String) ORZ.LJLLLL(list2)) != null) {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LIZJ = context;
                    LJIIIIZZ.LJIIIZ(new AbstractC85293Wj() { // from class: X.4gk
                        @Override // X.InterfaceC78660Uu0
                        public final void onFailed(Throwable th) {
                        }

                        @Override // X.InterfaceC78660Uu0
                        public final void LIZIZ(Bitmap bitmap) {
                            int intrinsicWidth;
                            int intrinsicHeight;
                            if (bitmap == null) {
                                return;
                            }
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                            Integer num = certificationIcon.width;
                            if (num == null || num.intValue() <= 0) {
                                intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
                            } else {
                                intrinsicWidth = certificationIcon.width.intValue();
                            }
                            Integer num2 = certificationIcon.height;
                            if (num2 == null || num2.intValue() <= 0) {
                                intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
                            } else {
                                intrinsicHeight = certificationIcon.height.intValue();
                            }
                            float f = (intrinsicWidth * 1.0f) / (intrinsicHeight * 1.0f);
                            float f2 = textSize;
                            bitmapDrawable.setBounds(0, 0, (int) (f2 * f), (int) f2);
                            ImageView imageView = new ImageView(context);
                            float f3 = textSize;
                            imageView.setImageDrawable(bitmapDrawable);
                            imageView.setLayoutParams(new LinearLayout.LayoutParams((int) (((f * f3) + C45804HyK.LJJI(2)) * 1.2d), (int) ((f3 + C45804HyK.LJJI(5)) * 1.2d)));
                            imageView.setPadding(C45804HyK.LJJI(2), C79081V1x.LJII(1), C45804HyK.LJJI(2), C79081V1x.LJII(1));
                            ((ViewGroup) this.itemView.findViewById(R.id.dbr)).addView(imageView);
                        }
                    });
                }
            }
        }
    }
}
