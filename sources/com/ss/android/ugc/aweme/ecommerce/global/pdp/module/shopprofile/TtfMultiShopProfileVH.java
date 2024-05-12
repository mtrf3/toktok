package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shopprofile;

import X.AnonymousClass636;
import X.C06460Ne;
import X.C0F1;
import X.C110614Vt;
import X.C113554cx;
import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C26867AgZ;
import X.C27540ArQ;
import X.C27541ArR;
import X.C27542ArS;
import X.C27543ArT;
import X.C27544ArU;
import X.C27545ArV;
import X.C27546ArW;
import X.C27739Aud;
import X.C32151Nz;
import X.C38350F3i;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70759Rpr;
import X.C70919RsR;
import X.C70920RsS;
import X.C70941Rsn;
import X.C76800UCe;
import X.C78946Uyc;
import X.C7MY;
import X.KNV;
import X.OSZ;
import X.V8L;
import X.V92;
import X.VA9;
import X.ViewOnClickListenerC13880ga;
import X.W5F;
import X.X1D;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import ujb.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class TtfMultiShopProfileVH extends PdpHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final PdpViewModel getViewModel() {
        return (PdpViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSubShopClick() {
        Object obj;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        C27546ArW c27546ArW = ((C27540ArQ) getItem()).LIZ;
        if (c27546ArW == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
        if (pdpEnterParam != null && (trackParams2 = pdpEnterParam.getTrackParams()) != null) {
            linkedHashMap.putAll(trackParams2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = getViewModel().LJLJJLL;
        if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj = trackParams.get("source_page_type")) == null) {
            obj = "unknown";
        }
        linkedHashMap.put("show_window_source", obj);
        String str = c27546ArW.LJLJL;
        if (str != null && !o.LJJJJJL(str)) {
            String str2 = null;
            if (0 == 0) {
                PdpViewModel viewModel = getViewModel();
                Context context = this.itemView.getContext();
                kotlin.jvm.internal.o.LJIIIIZZ(context, "itemView.context");
                String str3 = c27546ArW.LJLIL;
                Float LJJIJLIJ = C38350F3i.LJJIJLIJ(c27546ArW.LJLJJL);
                StoreOfficialLabel storeOfficialLabel = c27546ArW.LJLJLJ;
                if (storeOfficialLabel != null) {
                    str2 = storeOfficialLabel.labelTypeStr;
                }
                PdpViewModel.nw0(viewModel, context, str, str3, LJJIJLIJ, "showcase_detail", str2, getViewModel().aw0(), null, null, null, c27546ArW.LJLL, "visit", null, null, 13184);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        String str4 = c27546ArW.LJLJJLL;
        if (str4 == null || o.LJJJJJL(str4)) {
            return;
        }
        String uri = C26867AgZ.LIZJ(str4, C113554cx.LJJL(new OSZ("enter_from", getViewModel().bw0()), new OSZ("trackParams", C27739Aud.LJI(linkedHashMap)))).build().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "RouterUtils.createUrl(\n …     ).build().toString()");
        C70414RkI c70414RkI = getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJIIL = true;
        }
        SmartRouter.buildRoute(this.itemView.getContext(), uri).open();
        C70414RkI c70414RkI2 = getViewModel().LLFII;
        if (c70414RkI2 == null) {
            return;
        }
        C70414RkI.LJJJIL(c70414RkI2, "showcase_detail", null, null, null, 30);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onTtfOperatedClick() {
        Object obj;
        String str;
        String str2;
        HashMap<String, Object> trackParams;
        HashMap<String, Object> trackParams2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IPdpStarter.PdpEnterParam pdpEnterParam = getViewModel().LJLJJLL;
        if (pdpEnterParam != null && (trackParams2 = pdpEnterParam.getTrackParams()) != null) {
            linkedHashMap.putAll(trackParams2);
        }
        linkedHashMap.remove("page_name");
        linkedHashMap.put("previous_page", "product_detail");
        IPdpStarter.PdpEnterParam pdpEnterParam2 = getViewModel().LJLJJLL;
        if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj = trackParams.get("source_page_type")) == null) {
            obj = "unknown";
        }
        linkedHashMap.put("show_window_source", obj);
        SelfOperatedSloganInfo selfOperatedSloganInfo = ((C27540ArQ) getItem()).LIZIZ;
        if (selfOperatedSloganInfo != null && (str2 = selfOperatedSloganInfo.schema) != null) {
            str = C26867AgZ.LIZJ(str2, C113554cx.LJJL(new OSZ("enter_from", getViewModel().bw0()), new OSZ("trackParams", C27739Aud.LJI(linkedHashMap)))).build().toString();
        } else {
            str = null;
        }
        SmartRouter.buildRoute(this.itemView.getContext(), str).open();
        View self_operated_view = _$_findCachedViewById(R.id.jnc);
        kotlin.jvm.internal.o.LJIIIIZZ(self_operated_view, "self_operated_view");
        C78946Uyc.LJJIIJ(self_operated_view, new C70919RsR(), C27543ArT.LJLIL);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfMultiShopProfileVH(View view) {
        super(view, R.layout.a4c);
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        this._$_findViewCache = new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 102));
    }

    private final void bindSelfOperatedView(SelfOperatedSloganInfo selfOperatedSloganInfo) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Image image;
        if (selfOperatedSloganInfo == null) {
            return;
        }
        C27541ArR c27541ArR = (C27541ArR) _$_findCachedViewById(R.id.jnc);
        Image image2 = selfOperatedSloganInfo.logoImage;
        LinkText linkText = selfOperatedSloganInfo.title;
        String str6 = "";
        if (linkText == null || (str = linkText.text) == null) {
            str = "";
        }
        LinkText linkText2 = selfOperatedSloganInfo.text;
        if (linkText2 == null || (str2 = linkText2.text) == null) {
            str2 = "";
        }
        String str7 = selfOperatedSloganInfo.schema;
        if (str7 != null) {
            str6 = str7;
        }
        c27541ArR.LIZIZ(new C27546ArW(null, image2, str, null, "", "", str6, null, false, null, null, null, null, str2, null));
        ((TuxTextView) ((C27541ArR) _$_findCachedViewById(R.id.jnc)).LIZ(R.id.jy8)).setTuxFont(33);
        TuxTextView tuxTextView = (TuxTextView) ((C27541ArR) _$_findCachedViewById(R.id.jnc)).LIZ(R.id.jy8);
        kotlin.jvm.internal.o.LJIIIIZZ(tuxTextView, "self_operated_view.shop_name");
        LinkText linkText3 = selfOperatedSloganInfo.title;
        String str8 = null;
        if (linkText3 != null) {
            str3 = linkText3.color;
        } else {
            str3 = null;
        }
        setViewTextColor(tuxTextView, str3);
        TuxTextView tuxTextView2 = (TuxTextView) ((C27541ArR) _$_findCachedViewById(R.id.jnc)).LIZ(R.id.l58);
        kotlin.jvm.internal.o.LJIIIIZZ(tuxTextView2, "self_operated_view.text_slogan");
        LinkText linkText4 = selfOperatedSloganInfo.text;
        if (linkText4 != null) {
            str4 = linkText4.color;
        } else {
            str4 = null;
        }
        setViewTextColor(tuxTextView2, str4);
        ((TuxTextView) ((C27541ArR) _$_findCachedViewById(R.id.jnc)).LIZ(R.id.l58)).setTuxFont(71);
        ((V92) ((VA9) ((C27541ArR) _$_findCachedViewById(R.id.jnc)).LIZ(R.id.jy5)).getHierarchy()).LJIL(V8L.LIZIZ(C32151Nz.LJIIZILJ(Float.valueOf(6.0f))));
        boolean LIZIZ = C0F1.LIZIZ(this.itemView, "itemView.context");
        Icon icon = selfOperatedSloganInfo.backgroundImage;
        if (icon != null) {
            if (LIZIZ) {
                image = icon.iconDark;
            } else {
                image = icon.icon;
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            LIZLLL.LJIILIIL = C7MY.LIZJ(this.itemView, "itemView.context", R.attr.i7);
            LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.jnd);
            C16880lQ.LLJJJ(LIZLLL);
        } else {
            CommonColor commonColor = selfOperatedSloganInfo.backgroundColor;
            if (commonColor != null) {
                if (LIZIZ) {
                    str5 = commonColor.darkColor;
                } else {
                    str5 = commonColor.color;
                }
                Integer processColor = processColor(str5);
                if (processColor != null) {
                    int intValue = processColor.intValue();
                    C110614Vt c110614Vt = new C110614Vt();
                    c110614Vt.LIZ = Integer.valueOf(intValue);
                    Drawable LIZ = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
                    W5F LIZLLL2 = C70759Rpr.LIZLLL(null);
                    LIZLLL2.LJIILIIL = LIZ;
                    LIZLLL2.LJIILLIIL = LIZ;
                    LIZLLL2.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.jnd);
                    C16880lQ.LLJJJ(LIZLLL2);
                }
            }
        }
        boolean LIZIZ2 = C0F1.LIZIZ(this.itemView, "itemView.context");
        CommonColor commonColor2 = selfOperatedSloganInfo.arrowColor;
        if (LIZIZ2) {
            if (commonColor2 != null) {
                str8 = commonColor2.darkColor;
            }
        } else if (commonColor2 != null) {
            str8 = commonColor2.color;
        }
        Integer processColor2 = processColor(str8);
        if (processColor2 != null) {
            int intValue2 = processColor2.intValue();
            i = R.id.jnc;
            ((TuxIconView) ((C27541ArR) _$_findCachedViewById(R.id.jnc)).LIZ(R.id.jxu)).setTintColor(intValue2);
        } else {
            i = R.id.jnc;
        }
        _$_findCachedViewById(i).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS24S0100000_4(this, 56)));
        View self_operated_view = _$_findCachedViewById(i);
        kotlin.jvm.internal.o.LJIIIIZZ(self_operated_view, "self_operated_view");
        C78946Uyc.LJJIIJZLJL(self_operated_view, new C70920RsS(), C27544ArU.LJLIL, C27542ArS.LJLIL);
    }

    private final void bindSubShopProfile(C27546ArW c27546ArW) {
        boolean z;
        if (c27546ArW == null) {
            return;
        }
        ((C27541ArR) _$_findCachedViewById(R.id.kp3)).LIZIZ(c27546ArW);
        ((TuxTextView) ((C27541ArR) _$_findCachedViewById(R.id.kp3)).LIZ(R.id.jy8)).setTuxFont(62);
        V92 v92 = (V92) ((VA9) ((C27541ArR) _$_findCachedViewById(R.id.kp3)).LIZ(R.id.jy5)).getHierarchy();
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJII = C7MY.LIZIZ(48);
        c110614Vt.LJI = C7MY.LIZIZ(48);
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
        c110614Vt.LIZLLL = KNV.LIZIZ(0.5d);
        Context context = this.itemView.getContext();
        kotlin.jvm.internal.o.LJIIIIZZ(context, "itemView.context");
        c110614Vt.LJ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.dz, context));
        Drawable LIZ = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
        if (6 < v92.LJ.LJLJI.length) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJFF("The given index does not correspond to an overlay image.", z);
        v92.LJIILL(LIZ, 6);
        View sub_shop_profile_view = _$_findCachedViewById(R.id.kp3);
        kotlin.jvm.internal.o.LJIIIIZZ(sub_shop_profile_view, "sub_shop_profile_view");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 53, 42), sub_shop_profile_view);
        View sub_shop_profile_view2 = _$_findCachedViewById(R.id.kp3);
        kotlin.jvm.internal.o.LJIIIIZZ(sub_shop_profile_view2, "sub_shop_profile_view");
        C78946Uyc.LJJIIJZLJL(sub_shop_profile_view2, new C70941Rsn(), C27545ArV.LJLIL, null);
    }

    private final Integer processColor(String str) {
        boolean z;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    z = false;
                    if (!z && str.charAt(0) != '#') {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('#');
                        LIZ.append(str);
                        str = X1D.LIZIZ(LIZ);
                    }
                    return Integer.valueOf(Color.parseColor(str));
                }
            } catch (Exception unused) {
                return null;
            }
        }
        z = true;
        if (!z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('#');
            LIZ2.append(str);
            str = X1D.LIZIZ(LIZ2);
        }
        return Integer.valueOf(Color.parseColor(str));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C27540ArQ item) {
        kotlin.jvm.internal.o.LJIIIZ(item, "item");
        bindSelfOperatedView(item.LIZIZ);
        bindSubShopProfile(item.LIZ);
    }

    private final void setViewTextColor(TuxTextView tuxTextView, String str) {
        Integer processColor;
        if (str != null && (processColor = processColor(str)) != null) {
            tuxTextView.setTextColor(processColor.intValue());
        }
    }
}
