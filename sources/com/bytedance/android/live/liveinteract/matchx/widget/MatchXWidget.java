package com.bytedance.android.live.liveinteract.matchx.widget;

import X.C05590Jv;
import X.C16880lQ;
import X.C72818Shy;
import X.CN1;
import X.InterfaceC06390Mx;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.UH3;
import X.UH5;
import X.UH7;
import X.UH8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXCreateEvent;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXDestroyEvent;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXHideEvent;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXReuseEvent;
import com.bytedance.android.live.liveinteract.matchx.event.MatchXShowEvent;
import com.bytedance.android.live.liveinteract.multimatch.event.EndAnimStartEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS66S1100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchXWidget extends LiveRecyclableWidget implements UH8 {
    public ViewGroup LJLIL;
    public final UH3 LJLILLLLZI = new UH3();
    public final HashMap<String, UH7> LJLJI = new HashMap<>();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpd;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.LJLJI.clear();
        UH3 uh3 = this.LJLILLLLZI;
        uh3.LIZ = null;
        uh3.LIZIZ = null;
        uh3.LIZJ = null;
        C72818Shy.LIZLLL("Lynx_XPanelReadyMessage", uh3.LJII);
    }

    @Override // X.UH8
    public final UH7 LJIIZILJ(String str) {
        return this.LJLJI.get(str);
    }

    @Override // X.UH8
    public final void LJJIIJZLJL(String str) {
        UH7 uh7 = this.LJLJI.get(str);
        if (uh7 != null) {
            uh7.LIZ.setVisibility(8);
        }
    }

    @Override // X.UH8
    public final void LJJJJZI(String str) {
        UH7 uh7 = this.LJLJI.get(str);
        if (uh7 != null) {
            uh7.LIZ.setVisibility(0);
        }
    }

    @Override // X.UH8
    public final void LJJLIIIIJ(String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        UH7 uh7 = this.LJLJI.get(str);
        this.LJLJI.remove(str);
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            if (uh7 != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = uh7.LIZ;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
            }
            C16880lQ.LJLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, viewGroup);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ViewGroup viewGroup;
        View view = getView();
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LJLIL = viewGroup;
        UH3 uh3 = this.LJLILLLLZI;
        DataChannel dataChannel = this.dataChannel;
        uh3.getClass();
        uh3.LIZIZ = dataChannel;
        uh3.LIZ = this;
        uh3.LIZJ = this;
        C72818Shy.LIZLLL("Lynx_XPanelReadyMessage", uh3.LJII);
        C72818Shy.LIZLLL("Lynx_XPanelEventMessage", uh3.LJII);
        DataChannel dataChannel2 = uh3.LIZIZ;
        if (dataChannel2 != null) {
            dataChannel2.lv0(uh3.LIZJ, MatchXCreateEvent.class, new AqS179S0100000_13(uh3, 381));
            dataChannel2.lv0(uh3.LIZJ, MatchXDestroyEvent.class, new AqS179S0100000_13(uh3, 382));
            dataChannel2.lv0(uh3.LIZJ, MatchXHideEvent.class, new AqS179S0100000_13(uh3, 383));
            dataChannel2.lv0(uh3.LIZJ, MatchXShowEvent.class, new AqS179S0100000_13(uh3, 384));
            dataChannel2.lv0(uh3.LIZJ, MatchXReuseEvent.class, new AqS179S0100000_13(uh3, 385));
        }
        DataChannel dataChannel3 = uh3.LIZIZ;
        if (dataChannel3 != null) {
            dataChannel3.lv0(uh3.LIZJ, EndAnimStartEvent.class, new AqS179S0100000_13(uh3, 380));
        }
    }

    @Override // X.UH8
    public final boolean LJJLIIIJILLIZJL(String str, String viewId, UH5 uh5) {
        o.LJIIIZ(viewId, "viewId");
        InterfaceC06390Mx LIZ = CN1.LIZ(IHybridContainerService.class);
        o.LJIIIIZZ(LIZ, "getService(IHybridContainerService::class.java)");
        Context context = this.context;
        o.LJIIIIZZ(context, "context");
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ2 = C05590Jv.LIZ((IHybridContainerService) LIZ, context, str, new AqS66S1100000_13(uh5, str, 2), 28);
        UH7 uh7 = new UH7(LIZ2, viewId);
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup == null || viewGroup.indexOfChild(LIZ2) != -1) {
            return false;
        }
        this.LJLJI.put(viewId, uh7);
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 != null) {
            viewGroup2.addView(LIZ2, -1, -1);
        }
        return true;
    }
}
