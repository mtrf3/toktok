package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.lynxcard;

import X.C27627Asp;
import X.C2SH;
import X.C60726NsQ;
import X.C60737Nsb;
import X.C61636OGy;
import X.C61637OGz;
import X.C62822Ol8;
import X.InterfaceC60710NsA;
import X.InterfaceC60761Nsz;
import X.O9B;
import X.O9C;
import X.O9V;
import X.OH0;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PdpLynxCardVH extends AbsBrickFullSpanVH {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.AbstractC73265SpB
    public final void attachToWindow() {
        C61637OGz c61637OGz = new C61637OGz(((PdpViewModel) this.LJLJJL.getValue()).jw0());
        ((Map) c61637OGz.LJLILLLLZI).put("brick_name", Integer.valueOf(this.LJLJI));
        c61637OGz.LJIIJ();
        O9B o9b = ((PdpViewModel) this.LJLJJL.getValue()).LLJLIL;
        int i = this.LJLJI;
        if (!o9b.LJLJJL.contains(Integer.valueOf(i))) {
            o9b.LJLJJL.put(Integer.valueOf(i), Long.valueOf(SystemClock.elapsedRealtime()));
        }
        super.attachToWindow();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.AbstractC73265SpB
    public final void detachFromWindow() {
        OH0 oh0 = new OH0(((PdpViewModel) this.LJLJJL.getValue()).jw0());
        ((Map) oh0.LJLILLLLZI).put("brick_name", Integer.valueOf(this.LJLJI));
        oh0.LJIIJ();
        super.detachFromWindow();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLILLLLZI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLILLLLZI = null;
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void onBind(C27627Asp item) {
        int i;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        ViewGroup.LayoutParams layoutParams;
        C61636OGy c61636OGy;
        InterfaceC60761Nsz interfaceC60761Nsz;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3;
        C60726NsQ c60726NsQ;
        C60737Nsb hybridContext;
        InterfaceC60710NsA interfaceC60710NsA;
        Map<String, Object> LJ;
        SparkContext sparkContext;
        O9V o9v;
        o.LJIIIZ(item, "item");
        super.onBind(item);
        int i2 = item.LJLJJL;
        if (i2 != 2) {
            if (i2 != 3) {
                i = 0;
            } else {
                i = -1;
            }
        } else {
            i = -2;
        }
        this.LJLJJI = i;
        this.itemView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.LJLJJI));
        this.LJLJI = item.LJLIL;
        Object obj = null;
        if (this.LJLILLLLZI == null) {
            View view = this.itemView;
            if ((view instanceof C61636OGy) && (c61636OGy = (C61636OGy) view) != null) {
                int i3 = this.LJLJJI;
                String biz = ((PdpViewModel) this.LJLJJL.getValue()).LLJLIL.LJLJLJ;
                o.LJIIIZ(biz, "biz");
                c61636OGy.LJLJI = item.LJLJI;
                c61636OGy.LJLJJI = item.LJLJJI;
                c61636OGy.LJLJJL = biz;
                if (c61636OGy.LJLILLLLZI == null) {
                    Context context = c61636OGy.getContext();
                    o.LJIIIIZZ(context, "context");
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = O9C.LIZIZ(context, c61636OGy.LJLJJL, item.LJLJJI, TemplateData.LJFF(c61636OGy.LJLJI));
                    if (C2SH.LIZ() && (sparkContext = LIZIZ.getSparkContext()) != null && (o9v = (O9V) sparkContext.LIZIZ(O9V.class)) != null) {
                        o9v.LJLJI = new WeakReference<>(LIZIZ);
                    }
                    c61636OGy.LJLILLLLZI = LIZIZ;
                }
                if (c61636OGy.getChildCount() == 0) {
                    c61636OGy.addView(c61636OGy.LJLILLLLZI, new FrameLayout.LayoutParams(-1, i3));
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = c61636OGy.LJLILLLLZI;
                this.LJLILLLLZI = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
                    interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.getKitView();
                } else {
                    interfaceC60761Nsz = null;
                }
                if ((interfaceC60761Nsz instanceof C60726NsQ) && (c60726NsQ = (C60726NsQ) interfaceC60761Nsz) != null && (hybridContext = c60726NsQ.getHybridContext()) != null && (interfaceC60710NsA = hybridContext.hybridParams) != null && (LJ = interfaceC60710NsA.LJ()) != null) {
                    obj = LJ.get("usePreload");
                }
                if (!o.LJ(obj, "1") && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = c61636OGy.LJLILLLLZI) != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.LIZIZ();
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.itemView;
        o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.core.view.LynxCardView");
        C61636OGy c61636OGy2 = (C61636OGy) view2;
        int i4 = this.LJLJJI;
        TemplateData LJFF = TemplateData.LJFF(item.LJLJI);
        if (!o.LJ(item.LJLJI, c61636OGy2.LJLJI) && o.LJ(item.LJLJJI, c61636OGy2.LJLJJI)) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 = c61636OGy2.LJLILLLLZI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 != null) {
                obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5.getKitView();
            }
            if (obj instanceof VNS) {
                ((VNS) obj).updateData(LJFF);
            }
        } else if (!o.LJ(item.LJLJJI, c61636OGy2.LJLJJI) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c61636OGy2.LJLILLLLZI) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILL(item.LJLJJI, LJFF);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6 = c61636OGy2.LJLILLLLZI;
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6 == null || (layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6.getLayoutParams()) == null || i4 != layoutParams.height) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c61636OGy2.LJLILLLLZI) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.setLayoutParams(new FrameLayout.LayoutParams(-1, i4));
        }
        c61636OGy2.LJLJI = item.LJLJI;
        c61636OGy2.LJLJJI = item.LJLJJI;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PdpLynxCardVH(android.view.ViewGroup r4, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r3.LJLJJLL = r0
            X.OGy r2 = new X.OGy
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1, r5)
            r3.<init>(r2)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            kotlin.jvm.internal.AqS93S0300000_4 r1 = new kotlin.jvm.internal.AqS93S0300000_4
            r0 = 205(0xcd, float:2.87E-43)
            r1.<init>(r3, r2, r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r3.LJLJJL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.lynxcard.PdpLynxCardVH.<init>(android.view.ViewGroup, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment):void");
    }
}
