package com.ss.android.ugc.aweme.ecommerce.base.review.viewholder;

import X.C1FL;
import X.C221108m2;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70717RpB;
import X.C70748Rpg;
import X.C70749Rph;
import X.C70759Rpr;
import X.C78713Uur;
import X.C79077V1t;
import X.C81188Vtg;
import X.C81190Vti;
import X.EnumC72807Shn;
import X.GestureDetectorOnDoubleTapListenerC71051RuZ;
import X.InterfaceC78716Uuu;
import X.W5F;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewGalleryViewHolder extends ECJediViewHolder {
    public final float LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        C81188Vtg c81188Vtg = (C81188Vtg) this.itemView.findViewById(R.id.eh4);
        c81188Vtg.setOnDoubleTapListener(null);
        c81188Vtg.setOnPhotoTouchListener(null);
        c81188Vtg.setOnViewTapListener(null);
        c81188Vtg.LJLJLJ = null;
        super.onDestroy();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        this.LJLJJI.getValue();
        C81188Vtg c81188Vtg = (C81188Vtg) this.itemView.findViewById(R.id.eh4);
        Resources resources = c81188Vtg.getResources();
        C79077V1t c79077V1t = new C79077V1t(resources);
        C78713Uur c78713Uur = InterfaceC78716Uuu.LJJL;
        c79077V1t.LJIIJ = c78713Uur;
        c79077V1t.LIZJ = resources.getDrawable(R.drawable.adq);
        c79077V1t.LIZLLL = c78713Uur;
        c81188Vtg.setHierarchy(c79077V1t.LIZ());
        c81188Vtg.getLayoutParams().width = ((Number) this.LJLILLLLZI.getValue()).intValue();
        c81188Vtg.getLayoutParams().height = ((Number) this.LJLJI.getValue()).intValue();
        c81188Vtg.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC71051RuZ(c81188Vtg));
        c81188Vtg.setOnPhotoTouchListener(new C70748Rpg(this));
        c81188Vtg.setOnViewTapListener(new C70749Rph(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewGalleryViewHolder(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.z1, viewGroup, false, "from(parent.context).inf…iewholder, parent, false)"));
        this.LJLJJL = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLIL = 0.5625f;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(viewGroup, 302));
        this.LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 178));
        C65776Prg LIZ = C65352Pkq.LIZ(ReviewGalleryViewModel.class);
        this.LJLJJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 78));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        String str2;
        Image image;
        Image image2;
        C70717RpB item = (C70717RpB) obj;
        o.LJIIIZ(item, "item");
        C81188Vtg c81188Vtg = (C81188Vtg) this.itemView.findViewById(R.id.eh4);
        Object tag = c81188Vtg.getTag();
        ReviewMedia reviewMedia = item.LIZ;
        Image image3 = null;
        if (reviewMedia != null && (image2 = reviewMedia.image) != null) {
            str = image2.getUri();
        } else {
            str = null;
        }
        if (!o.LJ(tag, str)) {
            ReviewMedia reviewMedia2 = item.LIZ;
            if (reviewMedia2 != null && (image = reviewMedia2.image) != null) {
                str2 = image.getUri();
            } else {
                str2 = null;
            }
            c81188Vtg.setTag(str2);
            ReviewMedia reviewMedia3 = item.LIZ;
            if (reviewMedia3 != null) {
                image3 = reviewMedia3.image;
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(image3);
            LIZLLL.LJIJJ = EnumC72807Shn.FIT_CENTER;
            LIZLLL.LJJIIJ = c81188Vtg;
            LIZLLL.LIZLLL(new C81190Vti(c81188Vtg));
        }
    }
}
