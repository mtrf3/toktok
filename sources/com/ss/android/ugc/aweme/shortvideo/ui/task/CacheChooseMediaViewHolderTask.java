package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractC51620KNs;
import X.C00F;
import X.C16880lQ;
import X.C208108Es;
import X.C42617Go1;
import X.C42620Go4;
import X.C45507HtX;
import X.C45557HuL;
import X.C45652Hvs;
import X.C45866HzK;
import X.C79012Uzg;
import X.EnumC45752HxU;
import X.IJJ;
import X.InterfaceC45601Hv3;
import X.InterfaceC45863HzH;
import X.InterfaceC51123K4p;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CacheChooseMediaViewHolderTask implements GenericLifecycleObserver, InterfaceC45863HzH {
    public final Context LJLIL;
    public final Lifecycle LJLILLLLZI;
    public final InterfaceC45601Hv3 LJLJI;

    @Override // X.InterfaceC45863HzH
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C45557HuL.LIZ.clear();
    }

    @Override // X.InterfaceC45863HzH
    public final EnumC45752HxU LIZIZ() {
        int LIZ = C45866HzK.LIZ();
        if (LIZ != 1) {
            if (LIZ != 2) {
                EnumC45752HxU enumC45752HxU = EnumC45752HxU.P1;
                o.LJIIIIZZ(enumC45752HxU, "super.getTaskPriority()");
                return enumC45752HxU;
            }
            return EnumC45752HxU.P3;
        }
        return EnumC45752HxU.P1;
    }

    @Override // X.InterfaceC45863HzH
    public final void run() {
        int i;
        InterfaceC45601Hv3 interfaceC45601Hv3;
        System.currentTimeMillis();
        if (!((Boolean) C42620Go4.LIZ.getValue()).booleanValue()) {
            i = C00F.LIZ(31744, 0, "creative_tools_mt_album_optimization_v2_cache_viewholder", true);
        } else if (IJJ.LIZ()) {
            i = C00F.LIZ(31744, 0, "creative_tools_mt_album_optimization_v2_cache_viewholder", true);
        } else {
            i = 0;
        }
        if (i != 0) {
            Context context = this.LJLIL;
            o.LJIIIZ(context, "context");
            C45557HuL.LIZIZ = i;
            LayoutInflater LLZIL = C16880lQ.LLZIL(context);
            for (int i2 = 0; i2 < i; i2++) {
                System.currentTimeMillis();
                C45557HuL.LIZ.add(new C45507HtX(C16880lQ.LLLZIIL(R.layout.b_r, LLZIL, null)));
            }
        }
        if (this.LJLILLLLZI.getCurrentState() != Lifecycle.State.DESTROYED && C42617Go1.LIZ() && (interfaceC45601Hv3 = this.LJLJI) != null) {
            InterfaceC51123K4p inflater = interfaceC45601Hv3.getInflater();
            o.LJII(inflater, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.BaseAsyncInflater");
            AbstractC51620KNs abstractC51620KNs = (AbstractC51620KNs) inflater;
            C208108Es c208108Es = new C208108Es(abstractC51620KNs);
            c208108Es.LIZ(R.layout.cdn, 1);
            c208108Es.LIZ(R.layout.dro, 2);
            c208108Es.LIZ(R.layout.b_q, 1);
            c208108Es.LIZ(R.layout.dsw, 3);
            c208108Es.LIZ(R.layout.bl8, 1);
            if (((Boolean) C45652Hvs.LIZ.getValue()).booleanValue()) {
                c208108Es.LIZ(R.layout.b_r, 1);
                abstractC51620KNs.LIZJ(c208108Es, 0L);
                C79012Uzg.LJFF(new AqS154S0200000_7(abstractC51620KNs, this, 48));
                return;
            }
            abstractC51620KNs.LIZJ(c208108Es, 0L);
        }
    }

    public CacheChooseMediaViewHolderTask(Context context, Lifecycle lifecycle, InterfaceC45601Hv3 interfaceC45601Hv3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycle, "lifecycle");
        this.LJLIL = context;
        this.LJLILLLLZI = lifecycle;
        this.LJLJI = interfaceC45601Hv3;
        lifecycle.addObserver(this);
    }
}
