package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.C27665AtR;
import X.C2SH;
import X.C60726NsQ;
import X.C60737Nsb;
import X.C61637OGz;
import X.InterfaceC60710NsA;
import X.InterfaceC60761Nsz;
import X.O9B;
import X.O9C;
import X.O9V;
import X.OH0;
import X.OH1;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VNS;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LynxBrickVH extends BaseBrickVH<C27665AtR> {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJLLL;
    public int LJLL;
    public int LJLLI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final boolean Q() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void U() {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJLLL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
        }
        this.LJLJLLL = null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        C61637OGz c61637OGz = new C61637OGz(N().LIZIZ());
        ((Map) c61637OGz.LJLILLLLZI).put("brick_name", Integer.valueOf(this.LJLL));
        c61637OGz.LJIIJ();
        super.onViewAttachedToWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        OH0 oh0 = new OH0(N().LIZIZ());
        ((Map) oh0.LJLILLLLZI).put("brick_name", Integer.valueOf(this.LJLL));
        oh0.LJIIJ();
        super.onViewDetachedFromWindow();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final View P(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new OH1(context);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(C27665AtR c27665AtR) {
        int i;
        int i2;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2;
        ViewGroup.LayoutParams layoutParams;
        OH1 oh1;
        InterfaceC60761Nsz interfaceC60761Nsz;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3;
        C60726NsQ c60726NsQ;
        C60737Nsb hybridContext;
        InterfaceC60710NsA interfaceC60710NsA;
        Map<String, Object> LJ;
        SparkContext sparkContext;
        O9V o9v;
        C27665AtR item = c27665AtR;
        o.LJIIIZ(item, "item");
        Integer num = item.LJLIL.brickType;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i != 2) {
            if (i != 3) {
                i2 = 0;
            } else {
                i2 = -1;
            }
        } else {
            i2 = -2;
        }
        this.LJLLI = i2;
        this.itemView.setLayoutParams(new FrameLayout.LayoutParams(-1, this.LJLLI));
        this.LJLL = item.LJI();
        Object obj = null;
        if (this.LJLJLLL == null) {
            View view = this.itemView;
            if ((view instanceof OH1) && (oh1 = (OH1) view) != null) {
                int i3 = this.LJLLI;
                String biz = ((O9B) L().LJLJJI.getValue()).LJLJLJ;
                o.LJIIIZ(biz, "biz");
                oh1.LJLILLLLZI = item.LIZ();
                item.LJI();
                oh1.LJLJI = item.LJIIL();
                oh1.LJLJJI = biz;
                if (oh1.LJLIL == null) {
                    Context context = oh1.getContext();
                    o.LJIIIIZZ(context, "context");
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZIZ = O9C.LIZIZ(context, oh1.LJLJJI, item.LJIIL(), TemplateData.LJFF(item.LIZ()));
                    if (C2SH.LIZ() && (sparkContext = LIZIZ.getSparkContext()) != null && (o9v = (O9V) sparkContext.LIZIZ(O9V.class)) != null) {
                        o9v.LJLJI = new WeakReference<>(LIZIZ);
                    }
                    oh1.LJLIL = LIZIZ;
                }
                if (oh1.getChildCount() == 0) {
                    oh1.addView(oh1.LJLIL, new FrameLayout.LayoutParams(-1, i3));
                }
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 = oh1.LJLIL;
                this.LJLJLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4 != null) {
                    interfaceC60761Nsz = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS4.getKitView();
                } else {
                    interfaceC60761Nsz = null;
                }
                if ((interfaceC60761Nsz instanceof C60726NsQ) && (c60726NsQ = (C60726NsQ) interfaceC60761Nsz) != null && (hybridContext = c60726NsQ.getHybridContext()) != null && (interfaceC60710NsA = hybridContext.hybridParams) != null && (LJ = interfaceC60710NsA.LJ()) != null) {
                    obj = LJ.get("usePreload");
                }
                if (!o.LJ(obj, "1") && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3 = oh1.LJLIL) != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS3.LIZIZ();
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.itemView;
        o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.pdpv2.view.LynxBrickView");
        OH1 oh12 = (OH1) view2;
        int i4 = this.LJLLI;
        TemplateData LJFF = TemplateData.LJFF(item.LIZ());
        if (!o.LJ(item.LIZ(), oh12.LJLILLLLZI) && o.LJ(item.LJIIL(), oh12.LJLJI)) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 = oh12.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5 != null) {
                obj = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS5.getKitView();
            }
            if (obj instanceof VNS) {
                ((VNS) obj).updateData(LJFF);
            }
        } else if (!o.LJ(item.LJIIL(), oh12.LJLJI) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = oh12.LJLIL) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJIILL(item.LJIIL(), LJFF);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6 = oh12.LJLIL;
        if ((sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6 == null || (layoutParams = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS6.getLayoutParams()) == null || i4 != layoutParams.height) && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = oh12.LJLIL) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.setLayoutParams(new FrameLayout.LayoutParams(-1, i4));
        }
        oh12.LJLILLLLZI = item.LIZ();
        item.LJI();
        oh12.LJLJI = item.LJIIL();
    }
}
