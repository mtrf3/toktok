package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shopprofile;

import X.C113554cx;
import X.C16880lQ;
import X.C1AH;
import X.C1EU;
import X.C221108m2;
import X.C26867AgZ;
import X.C27550Ara;
import X.C27551Arb;
import X.C27739Aud;
import X.C38350F3i;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70759Rpr;
import X.C70941Rsn;
import X.C72545SdZ;
import X.C76800UCe;
import X.C78685UuP;
import X.C78946Uyc;
import X.C7MY;
import X.OSZ;
import X.OUP;
import X.S3I;
import X.S3L;
import X.W5F;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import ujb.o;

/* loaded from: classes5.dex */
public final class UsShopProfileVH extends AbsFullSpanVH {
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

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return ((C27550Ara) getItem()).LJIIIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsShopProfileVH(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a4y, viewGroup, false));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 121));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(String str) {
        Object obj;
        Float f;
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
        String str2 = ((C27550Ara) getItem()).LJFF;
        if (str2 != null && !o.LJJJJJL(str2)) {
            String str3 = null;
            if (0 == 0) {
                PdpViewModel viewModel = getViewModel();
                Context context = this.itemView.getContext();
                String str4 = ((C27550Ara) getItem()).LIZJ;
                String str5 = ((C27550Ara) getItem()).LIZLLL;
                if (str5 != null) {
                    f = C38350F3i.LJJIJLIJ(str5);
                } else {
                    f = null;
                }
                StoreOfficialLabel storeOfficialLabel = ((C27550Ara) getItem()).LJI;
                if (storeOfficialLabel != null) {
                    str3 = storeOfficialLabel.labelTypeStr;
                }
                int aw0 = getViewModel().aw0();
                kotlin.jvm.internal.o.LJIIIIZZ(context, "context");
                PdpViewModel.nw0(viewModel, context, str2, str4, f, "showcase_detail", str3, aw0, null, null, "showcase_detail", null, str, null, null, 13696);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        String str6 = ((C27550Ara) getItem()).LJ;
        if (str6 == null || o.LJJJJJL(str6)) {
            return;
        }
        String uri = C26867AgZ.LIZJ(str6, C113554cx.LJJL(new OSZ("enter_from", getViewModel().bw0()), new OSZ("trackParams", C27739Aud.LJI(linkedHashMap)))).build().toString();
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

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int i;
        int i2;
        int i3;
        C27550Ara item = (C27550Ara) obj;
        kotlin.jvm.internal.o.LJIIIZ(item, "item");
        W5F LIZLLL = C70759Rpr.LIZLLL(item.LIZIZ);
        LIZLLL.LIZIZ("UsShopProfileVH");
        S3I s3i = new S3I();
        int LIZ = C1EU.LIZ(this.itemView, "itemView.context", R.attr.dv);
        float LIZIZ = C7MY.LIZIZ(1);
        s3i.LIZJ = LIZ;
        s3i.LIZIZ = LIZIZ;
        s3i.LIZLLL = C7MY.LIZIZ(48);
        LIZLLL.LJIJJLI = new S3L(s3i);
        LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.abh);
        C16880lQ.LLJJJ(LIZLLL);
        ((TextView) _$_findCachedViewById(R.id.mk8)).setText(item.LIZJ);
        StoreOfficialLabel storeOfficialLabel = item.LJI;
        int i4 = 0;
        if (storeOfficialLabel != null) {
            Context context = this.itemView.getContext();
            kotlin.jvm.internal.o.LJIIIIZZ(context, "itemView.context");
            Image LIZ2 = storeOfficialLabel.LIZ(context);
            if (LIZ2 != null) {
                ImageView official_label = (ImageView) _$_findCachedViewById(R.id.h9z);
                kotlin.jvm.internal.o.LJIIIIZZ(official_label, "official_label");
                official_label.setVisibility(0);
                Integer width = LIZ2.getWidth(12.0f);
                if (width != null) {
                    int intValue = width.intValue();
                    SmartImageView official_label2 = (SmartImageView) _$_findCachedViewById(R.id.h9z);
                    kotlin.jvm.internal.o.LJIIIIZZ(official_label2, "official_label");
                    OUP.LJJJIL(intValue, official_label2);
                }
                SmartImageView official_label3 = (SmartImageView) _$_findCachedViewById(R.id.h9z);
                kotlin.jvm.internal.o.LJIIIIZZ(official_label3, "official_label");
                OUP.LJJJI(official_label3, LIZ2);
            }
        }
        C1AH group_rating = (C1AH) _$_findCachedViewById(R.id.dz3);
        kotlin.jvm.internal.o.LJIIIIZZ(group_rating, "group_rating");
        if (C78685UuP.LJJJZ(item.LIZLLL)) {
            i = 0;
        } else {
            i = 8;
        }
        group_rating.setVisibility(i);
        ((TextView) _$_findCachedViewById(R.id.mgi)).setText(item.LIZLLL);
        View tv_shop_info = _$_findCachedViewById(R.id.mk7);
        kotlin.jvm.internal.o.LJIIIIZZ(tv_shop_info, "tv_shop_info");
        if (C78685UuP.LJJJZ(item.LJII)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tv_shop_info.setVisibility(i2);
        ((TextView) _$_findCachedViewById(R.id.mk7)).setText(item.LJII);
        View avatar = _$_findCachedViewById(R.id.abh);
        kotlin.jvm.internal.o.LJIIIIZZ(avatar, "avatar");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 115, 42), avatar);
        View tv_shop_name = _$_findCachedViewById(R.id.mk8);
        kotlin.jvm.internal.o.LJIIIIZZ(tv_shop_name, "tv_shop_name");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 116, 42), tv_shop_name);
        View itemView = this.itemView;
        kotlin.jvm.internal.o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJZLJL(itemView, new C70941Rsn(), C27551Arb.LJLIL, new AqS170S0100000_4(item, 1577));
        _$_findCachedViewById(R.id.ax9).getClass();
        _$_findCachedViewById(R.id.b0_).getClass();
        View red_dot = _$_findCachedViewById(R.id.isy);
        kotlin.jvm.internal.o.LJIIIIZZ(red_dot, "red_dot");
        if (!item.LJIIIIZZ) {
            i4 = 8;
        }
        red_dot.setVisibility(i4);
        TextView textView = (TextView) _$_findCachedViewById(R.id.ax9);
        Context context2 = this.itemView.getContext();
        if (item.LJIIIIZZ) {
            i3 = R.string.fc9;
        } else {
            i3 = R.string.fc8;
        }
        textView.setText(context2.getString(i3));
        View btn_msg = _$_findCachedViewById(R.id.ax9);
        kotlin.jvm.internal.o.LJIIIIZZ(btn_msg, "btn_msg");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 113, 42), btn_msg);
        View btn_view_shop = _$_findCachedViewById(R.id.b0_);
        kotlin.jvm.internal.o.LJIIIIZZ(btn_view_shop, "btn_view_shop");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 114, 42), btn_view_shop);
    }
}
