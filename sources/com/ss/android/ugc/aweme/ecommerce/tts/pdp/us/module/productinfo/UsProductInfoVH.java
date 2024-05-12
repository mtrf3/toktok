package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.productinfo;

import X.C47261Igj;
import X.C62822Ol8;
import X.C70607RnP;
import X.C70610RnS;
import X.C70656RoC;
import X.C70917RsP;
import X.C73156SnQ;
import X.C77125UOr;
import X.C78946Uyc;
import X.FT5;
import X.InterfaceC70614RnW;
import X.TBT;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS41S0210000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsProductInfoVH extends AbsFullSpanVH implements InterfaceC70614RnW {
    public static final ArrayList<String> LJLJLJ = C47261Igj.LJII("title", "price", "extra");
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final AqS178S0100000_12 LJLJJLL;
    public final Map<Integer, View> LJLJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final C70607RnP L() {
        return (C70607RnP) this.LJLJI.getValue();
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        L().setListener(this);
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.RnD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getShowFavoriteGuide();
            }
        }, new TBT() { // from class: X.RnQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new IDqS436S0100000_12(this, 12));
        if (!getViewModel().LLII) {
            getViewModel().Lv0(this.LJLJJLL);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        if (!getViewModel().LLII) {
            PdpViewModel viewModel = getViewModel();
            AqS178S0100000_12 listener = this.LJLJJLL;
            viewModel.getClass();
            o.LJIIIZ(listener, "listener");
            if (((ArrayList) viewModel.LJLLL).contains(listener)) {
                ((ArrayList) viewModel.LJLLL).remove(listener);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UsProductInfoVH(android.view.ViewGroup r12) {
        /*
            r11 = this;
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r12, r0)
            r11.LJLJL = r0
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r0 = r12.getContext()
            r5.<init>(r0)
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r4 = X.O6R.LJJIIZ(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r3 = X.O6R.LJJIIZ(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r2 = X.O6R.LJJIIZ(r0)
            r0 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r10 = 16
            X.C26338AVi.LJIIIZ(r5, r6, r7, r8, r9, r10)
            r0 = 2
            r5.setShowDividers(r0)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>()
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r1 = X.O6R.LJJIIZ(r0)
            r0 = 0
            r2.setBounds(r0, r1, r0, r0)
            r5.setDividerDrawable(r2)
            r0 = 1
            r5.setOrientation(r0)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0 = -2
            r2.<init>(r1, r0)
            r5.setLayoutParams(r2)
            r11.<init>(r5)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 116(0x74, float:1.63E-43)
            r1.<init>(r11, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r11.LJLIL = r0
            kotlin.jvm.internal.AqS162S0100000_12 r1 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 535(0x217, float:7.5E-43)
            r1.<init>(r11, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r11.LJLJI = r0
            kotlin.jvm.internal.AqS162S0100000_12 r1 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 534(0x216, float:7.48E-43)
            r1.<init>(r11, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r11.LJLJJI = r0
            kotlin.jvm.internal.AqS162S0100000_12 r1 = new kotlin.jvm.internal.AqS162S0100000_12
            r0 = 533(0x215, float:7.47E-43)
            r1.<init>(r11, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r11.LJLJJL = r0
            kotlin.jvm.internal.AqS178S0100000_12 r1 = new kotlin.jvm.internal.AqS178S0100000_12
            r0 = 188(0xbc, float:2.63E-43)
            r1.<init>(r11, r0)
            r11.LJLJJLL = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.productinfo.UsProductInfoVH.<init>(android.view.ViewGroup):void");
    }

    @Override // X.InterfaceC70614RnW
    public final void LLLLZIL(View shareView) {
        o.LJIIIZ(shareView, "shareView");
        Activity LIZ = FT5.LIZ(this.itemView, "itemView.context");
        if (LIZ != null) {
            getViewModel().Ow0(LIZ);
        }
        C78946Uyc.LJJIIJ(shareView, new C70917RsP(), C70610RnS.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031 A[SYNTHETIC] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.productinfo.UsProductInfoVH.onBind(java.lang.Object):void");
    }

    @Override // X.InterfaceC70614RnW
    public final void LJLJI(View favoriteView, boolean z) {
        o.LJIIIZ(favoriteView, "favoriteView");
        C70656RoC.LIZ(C77125UOr.LIZJ(this), new AqS41S0210000_12(this, favoriteView, z, 1));
    }
}
