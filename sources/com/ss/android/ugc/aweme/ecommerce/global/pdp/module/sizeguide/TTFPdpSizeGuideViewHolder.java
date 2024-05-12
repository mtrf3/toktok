package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sizeguide;

import X.C16530kr;
import X.C16880lQ;
import X.C221108m2;
import X.C26867AgZ;
import X.C27162AlK;
import X.C27504Aqq;
import X.C27505Aqr;
import X.C27506Aqs;
import X.C27507Aqt;
import X.C27510Aqw;
import X.C27511Aqx;
import X.C32151Nz;
import X.C32I;
import X.C45804HyK;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70759Rpr;
import X.C70920RsS;
import X.C72545SdZ;
import X.C78946Uyc;
import X.C79234V7u;
import X.EF7;
import X.O6R;
import X.ORZ;
import X.OSZ;
import X.OUR;
import X.W5F;
import X.X1D;
import Y.IDComparatorS29S0000000_1;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelFigure;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TTFPdpSizeGuideViewHolder extends AbsFullSpanVH {
    public final ECBaseFragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        List<ModelInfo> list;
        Image image;
        String str;
        int i;
        List<ModelFigure> list2;
        C27505Aqr item = (C27505Aqr) obj;
        o.LJIIIZ(item, "item");
        ((ViewGroup) _$_findCachedViewById(R.id.foq)).removeAllViews();
        ((ViewGroup) _$_findCachedViewById(R.id.j29)).removeAllViews();
        int i2 = 0;
        if (item.LIZIZ != null || item.LIZLLL != null) {
            View layout_head = _$_findCachedViewById(R.id.fiu);
            o.LJIIIIZZ(layout_head, "layout_head");
            layout_head.setVisibility(0);
            ((TextView) this.itemView.findViewById(R.id.title)).setText(item.LIZJ);
        }
        ModelCard modelCard = item.LIZ;
        if (modelCard != null) {
            list = modelCard.modelInfos;
        } else {
            list = null;
        }
        if (list != null) {
            View model = _$_findCachedViewById(R.id.gl8);
            o.LJIIIIZZ(model, "model");
            model.setVisibility(0);
            if (item.LIZIZ == null && item.LIZLLL == null) {
                C45804HyK.LJJLIIIJ(C27162AlK.LJIIIIZZ, _$_findCachedViewById(R.id.gl8));
            }
            ModelInfo modelInfo = (ModelInfo) ORZ.LJLLLL(item.LIZ.modelInfos);
            if (modelInfo != null) {
                image = modelInfo.avatar;
            } else {
                image = null;
            }
            W5F LJ = C70759Rpr.LJ(image);
            LJ.LJIIJJI = R.drawable.aly;
            LJ.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.abh);
            C16880lQ.LLJJJ(LJ);
            TextView textView = (TextView) _$_findCachedViewById(R.id.nhn);
            ModelInfo modelInfo2 = (ModelInfo) ORZ.LJLLLL(item.LIZ.modelInfos);
            if (modelInfo2 != null) {
                str = modelInfo2.wearsSize;
            } else {
                str = null;
            }
            textView.setText(str);
            ArrayList arrayList = new ArrayList();
            ModelInfo modelInfo3 = (ModelInfo) ORZ.LJLLLL(item.LIZ.modelInfos);
            if (modelInfo3 != null && (list2 = modelInfo3.modelFigures) != null) {
                for (ModelFigure modelFigure : list2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(modelFigure.name);
                    LIZ.append(": ");
                    LIZ.append(modelFigure.value);
                    arrayList.add(X1D.LIZIZ(LIZ));
                }
            }
            TuxTextView tuxTextView = new TuxTextView(EF7.LIZIZ(), null, 6, 0);
            tuxTextView.setTuxFont(71);
            tuxTextView.setTextColorRes(R.attr.gv);
            tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i3 = Math.max(i3, (int) tuxTextView.getPaint().measureText(str2));
                linkedHashMap.put(str2, Integer.valueOf((int) tuxTextView.getPaint().measureText(str2)));
            }
            List<Map.Entry> LLILII = ORZ.LLILII(new IDComparatorS29S0000000_1(19), linkedHashMap.entrySet());
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(LLILII, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(LJJIIZ);
            for (Map.Entry entry : LLILII) {
                linkedHashMap2.put(entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
            }
            int paddingStart = ((C27162AlK.LIZ - _$_findCachedViewById(R.id.gl8).getPaddingStart()) - _$_findCachedViewById(R.id.gl8).getPaddingEnd()) - _$_findCachedViewById(R.id.abh).getWidth();
            View model_figures = _$_findCachedViewById(R.id.gl9);
            o.LJIIIIZZ(model_figures, "model_figures");
            ViewGroup.LayoutParams layoutParams = model_figures.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                i = 0;
            }
            int i4 = paddingStart - i;
            int i5 = 0;
            int i6 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, i2);
                tuxTextView2.setTuxFont(71);
                tuxTextView2.setTextColorRes(R.attr.gv);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.bottomMargin = C27162AlK.LJIILJJIL;
                tuxTextView2.setLayoutParams(marginLayoutParams);
                tuxTextView2.setMaxLines(1);
                tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                tuxTextView2.setText((CharSequence) entry2.getKey());
                if (i5 > i6) {
                    if (((Number) entry2.getValue()).intValue() < i4 - i3) {
                        ((ViewGroup) _$_findCachedViewById(R.id.j29)).addView(tuxTextView2);
                        i6++;
                        i2 = 0;
                    } else {
                        ((ViewGroup) _$_findCachedViewById(R.id.foq)).addView(tuxTextView2);
                    }
                } else {
                    ((ViewGroup) _$_findCachedViewById(R.id.foq)).addView(tuxTextView2);
                }
                i5++;
                i2 = 0;
            }
            if (i5 == 1) {
                C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), _$_findCachedViewById(R.id.nhn));
            }
        }
        View model2 = _$_findCachedViewById(R.id.gl8);
        o.LJIIIIZZ(model2, "model");
        C78946Uyc.LJJIIJZLJL(model2, new C70920RsS(), C27510Aqw.LJLIL, C27506Aqs.LJLIL);
        View layout_head2 = _$_findCachedViewById(R.id.fiu);
        o.LJIIIIZZ(layout_head2, "layout_head");
        C78946Uyc.LJJIIJZLJL(layout_head2, new C70920RsS(), C27511Aqx.LJLIL, C27507Aqt.LJLIL);
        View layout_head3 = _$_findCachedViewById(R.id.fiu);
        o.LJIIIIZZ(layout_head3, "layout_head");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 77, 42), layout_head3);
        View model3 = _$_findCachedViewById(R.id.gl8);
        o.LJIIIIZZ(model3, "model");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 78, 42), model3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTFPdpSizeGuideViewHolder(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a4h, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLJI = new LinkedHashMap();
        this.LJLIL = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 103));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(String str, boolean z) {
        IPdpStarter.PdpEnterParam pdpEnterParam;
        HashMap<String, Object> trackParams;
        if (z) {
            String str2 = ((C27505Aqr) getItem()).LIZIZ;
            if (str2 == null || str2.length() == 0) {
                String LJJIIZI = C79234V7u.LJJIIZI(this.LJLIL, null);
                FragmentManager fragmentManager = this.LJLIL.getFragmentManager();
                if (fragmentManager != null) {
                    C27504Aqq.LIZ(fragmentManager, LJJIIZI, new SizeGuide(null, ((C27505Aqr) getItem()).LIZLLL, null, null, null, ((C27505Aqr) getItem()).LIZJ, null, null, ((C27505Aqr) getItem()).LIZIZ, null, 733, null));
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C70414RkI c70414RkI = ((PdpViewModel) this.LJLILLLLZI.getValue()).LLFII;
                if (c70414RkI != null && (pdpEnterParam = c70414RkI.LIZ) != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                    linkedHashMap.putAll(trackParams);
                }
                linkedHashMap.put("previous_page", "product_detail");
                String str3 = ((C27505Aqr) getItem()).LIZIZ;
                if (str3 != null) {
                    Context context = this.itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    C26867AgZ.LIZIZ(context, str3, C51029K0z.LJJIIZI(new OSZ("track_params", linkedHashMap)), false).open();
                }
            }
        }
        View view = this.itemView;
        C78946Uyc.LJJIIJ(view, OUR.LIZLLL(view, "itemView"), new AqS29S1000000_4(str, 12));
    }
}
