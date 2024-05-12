package com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16530kr;
import X.C16880lQ;
import X.C1A8;
import X.C27162AlK;
import X.C27570Aru;
import X.C29S;
import X.C3C5;
import X.C70759Rpr;
import X.C70921RsT;
import X.C70922RsU;
import X.C76800UCe;
import X.C78946Uyc;
import X.C78948Uye;
import X.C90903hW;
import X.W5F;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SizeGuideFragment extends ECBaseFragment {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "size_pic";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        if (ActivityStack.isAppBackGround()) {
            str = "close";
        } else {
            str = "return";
        }
        C78946Uyc.LJJII(this, new C70921RsT(), new AqS47S1200000_4(str, this, C78948Uye.LJIILJJIL(this, "lib_track_builtin_lane_business"), 42));
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View icon_close = _$_findCachedViewById(R.id.eb1);
        o.LJIIIIZZ(icon_close, "icon_close");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 117, 42), icon_close);
        SizeGuide sizeGuide = (SizeGuide) C1A8.LJIIZILJ(this, "size_guide");
        if (sizeGuide != null) {
            ((TextView) _$_findCachedViewById(R.id.mo6)).setText(sizeGuide.skuSizeGuideTitle);
            Image image = sizeGuide.originSizeGuideImage;
            if (image != null) {
                ImageView size_guide_image = (ImageView) _$_findCachedViewById(R.id.k1q);
                o.LJIIIIZZ(size_guide_image, "size_guide_image");
                int i2 = 0;
                size_guide_image.setVisibility(0);
                int i3 = C27162AlK.LIZ;
                View size_guide_image2 = _$_findCachedViewById(R.id.k1q);
                o.LJIIIIZZ(size_guide_image2, "size_guide_image");
                ViewGroup.LayoutParams layoutParams = size_guide_image2.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
                } else {
                    i = 0;
                }
                int i4 = i3 - i;
                View size_guide_image3 = _$_findCachedViewById(R.id.k1q);
                o.LJIIIIZZ(size_guide_image3, "size_guide_image");
                ViewGroup.LayoutParams layoutParams2 = size_guide_image3.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    i2 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
                }
                float radio = (i4 - i2) / image.getRadio();
                View size_guide_image4 = _$_findCachedViewById(R.id.k1q);
                o.LJIIIIZZ(size_guide_image4, "size_guide_image");
                C27570Aru.LJII((int) radio, size_guide_image4);
                View size_guide_image5 = _$_findCachedViewById(R.id.k1q);
                o.LJIIIIZZ(size_guide_image5, "size_guide_image");
                C16880lQ.LJIIJ(new Au2S15S0100000_4(image, 118, 42), size_guide_image5);
                W5F LIZLLL = C70759Rpr.LIZLLL(image);
                LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.k1q);
                C16880lQ.LLJJJ(LIZLLL);
            }
        }
        C78946Uyc.LJJII(this, new C70922RsU(), null);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a7s, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
