package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review;

import X.C119774mz;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26798AfS;
import X.C26845AgD;
import X.C44878HjO;
import X.C47261Igj;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70445Rkn;
import X.C72545SdZ;
import Y.ARunnableS40S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpReviewImageViewHolder extends AbsFullSpanVH {
    public final C62822Ol8 LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        super.onResume();
        trackTag(new C70445Rkn(getItem()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpReviewImageViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a42, viewGroup, false));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 62));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26845AgD item = (C26845AgD) obj;
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ((TextView) itemView.findViewById(R.id.mo6)).setText(this.itemView.getContext().getString(R.string.fc0));
        ArrayList arrayList = new ArrayList();
        for (ReviewImageItem reviewImageItem : item.LJLIL) {
            if (reviewImageItem.media != null && (!r0.isEmpty())) {
                int i = 0;
                for (ReviewMedia reviewMedia : reviewImageItem.media) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ReviewMedia reviewMedia2 = reviewMedia;
                        arrayList.add(new C26798AfS(reviewMedia2.image, reviewImageItem.reviewId, i, o.LJ(reviewImageItem.isOwner, Boolean.TRUE), reviewImageItem.rating, reviewMedia2));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        C119774mz c119774mz = (C119774mz) itemView.findViewById(R.id.j16);
        c119774mz.setGravity(-1);
        if (arrayList.isEmpty() || arrayList.size() < 4) {
            this.itemView.setVisibility(8);
        } else {
            this.itemView.setVisibility(0);
            AqS93S0300000_4 aqS93S0300000_4 = new AqS93S0300000_4(c119774mz, (C119774mz) arrayList, (List<C26798AfS>) this, (PdpReviewImageViewHolder) 166);
            if (c119774mz.getWidth() == 0) {
                c119774mz.post(new ARunnableS40S0100000_4((Object) aqS93S0300000_4, 38));
            } else {
                aqS93S0300000_4.invoke();
            }
        }
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 67, 42), itemView2);
    }
}
