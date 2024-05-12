package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import X.AbstractC78073UkX;
import X.C16880lQ;
import X.C73318Sq2;
import X.C73943T0h;
import X.C78093Ukr;
import X.C78114UlC;
import Y.AfS65S0100000_13;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class LiveGiftRemoteTrayDisplayWidget extends LiveRecyclableWidget {
    public final ArrayList<C78093Ukr> LJLIL = new ArrayList<>(2);
    public final C73318Sq2 LJLILLLLZI = new C73318Sq2();

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.dou;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public C78093Ukr LJLZ() {
        Context context = this.context;
        o.LJIIIIZZ(context, "this.context");
        return new C78093Ukr(context);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Iterator<C78093Ukr> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C78093Ukr next = it.next();
            AnimatorSet animatorSet = next.LJLL;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = next.LJLL;
                if (animatorSet2 != null) {
                    C16880lQ.LJLJJL(animatorSet2);
                }
                AnimatorSet animatorSet3 = next.LJLL;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                next.LJLL = null;
            }
            if (WatchMemoryLeakOpt.INSTANCE.settingValue()) {
                next.LJLLILLLL = null;
            }
            AbstractC78073UkX.LJIIIIZZ(next);
        }
        this.LJLILLLLZI.LIZLLL();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C78093Ukr LJLZ = LJLZ();
        LJLZ.setVisibility(4);
        LJLZ.LJ(this.dataChannel, false);
        LJLZ.setTrackNum(0);
        View view = this.contentView;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        LJLZ.setViewGroup((ViewGroup) view);
        this.LJLIL.add(LJLZ);
        View view2 = this.contentView;
        if ((view2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view2) != null) {
            viewGroup2.addView(LJLZ);
        }
        C78093Ukr LJLZ2 = LJLZ();
        LJLZ2.setVisibility(4);
        LJLZ2.LJ(this.dataChannel, false);
        LJLZ2.setTrackNum(1);
        View view3 = this.contentView;
        o.LJII(view3, "null cannot be cast to non-null type android.view.ViewGroup");
        LJLZ2.setViewGroup((ViewGroup) view3);
        this.LJLIL.add(LJLZ2);
        View view4 = this.contentView;
        if ((view4 instanceof ViewGroup) && (viewGroup = (ViewGroup) view4) != null) {
            viewGroup.addView(LJLZ2);
        }
        this.LJLILLLLZI.LIZ(C73943T0h.LIZ().LJ(C78114UlC.class).LJJJJZI(new AfS65S0100000_13(this, 82)));
    }
}
