package com.bytedance.android.livesdk.toolbar;

import X.C15Y;
import X.C162476Zf;
import X.C16880lQ;
import X.C1TJ;
import X.C20780ri;
import X.C20880rs;
import X.C20910rv;
import X.C30225Btd;
import X.C30240Bts;
import X.C30242Btu;
import X.C30243Btv;
import X.C30248Bu0;
import X.C30249Bu1;
import X.C30252Bu4;
import X.C30258BuA;
import X.C30261BuD;
import X.EnumC30206BtK;
import X.EnumC30226Bte;
import X.InterfaceC30205BtJ;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.toolbarv2.view.AnchorToolbarWidget;
import com.bytedance.android.livesdk.toolbarv2.view.AudienceLandscapeToolbarWidget;
import com.bytedance.android.livesdk.toolbarv2.view.AudienceLeftToolbarWidget;
import com.bytedance.android.livesdk.toolbarv2.view.AudienceRightToolbarWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ToolbarService implements IToolbarService {
    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final Class<LiveBroadcastToolbarWidget> Uu0() {
        return LiveBroadcastToolbarWidget.class;
    }

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void d9() {
        C30249Bu1.LIZ.getClass();
        ((LinkedHashMap) C30249Bu1.LIZIZ).clear();
        C30249Bu1.LIZJ = null;
        C30249Bu1.LIZLLL = null;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void kb() {
        C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.dl8, C20880rs.LIZ("ttlive_view_live_toolbar_new_style"), null, false, 24);
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void Cm(Context context) {
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZLLL(R.layout.dl6, context);
        } else {
            C20910rv.LJIILIIL(C20910rv.LIZ, R.layout.dl6, C20880rs.LIZ("ttlive_view_live_toolbar_broadcast"), null, false, 24);
        }
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void N0(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        C30258BuA.LIZ.remove(dataChannel);
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final C30242Btu T00(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        LinkedHashMap linkedHashMap = (LinkedHashMap) C30258BuA.LIZ;
        Object obj = linkedHashMap.get(dataChannel);
        if (obj == null) {
            obj = new C30240Bts(new C30242Btu());
            linkedHashMap.put(dataChannel, obj);
        }
        return ((C30240Bts) obj).LIZ;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final InterfaceC30205BtJ pk(DataChannel dataChannel) {
        if (ToolBarRefactor.enable() && dataChannel != null) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) C30258BuA.LIZ;
            Object obj = linkedHashMap.get(dataChannel);
            if (obj == null) {
                obj = new C30240Bts(new C30242Btu());
                linkedHashMap.put(dataChannel, obj);
            }
            return (InterfaceC30205BtJ) obj;
        }
        return C30225Btd.LIZ;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final Class<? extends LiveAudienceToolbarWidget> zN(boolean z) {
        if (z) {
            return LiveAudienceToolbarWidget.class;
        }
        return LandscapeAudienceToolbarWidget.class;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final Class EA(EnumC30206BtK enumC30206BtK, DataChannel dataChannel) {
        C30261BuD LIZIZ = C30243Btv.LIZIZ(dataChannel);
        int i = C30248Bu0.LIZJ[LIZIZ.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AnchorToolbarWidget.class;
            }
            throw new C162476Zf();
        }
        int i2 = C30248Bu0.LIZIZ[LIZIZ.LIZIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return AudienceLandscapeToolbarWidget.class;
            }
            throw new C162476Zf();
        }
        if (enumC30206BtK != null) {
            int i3 = C30248Bu0.LIZ[enumC30206BtK.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return AudienceRightToolbarWidget.class;
                }
            } else {
                return AudienceLeftToolbarWidget.class;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void Gv(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(dataChannel, "dataChannel");
        C30261BuD LIZIZ = C30243Btv.LIZIZ(dataChannel);
        Map<DataChannel, C30240Bts> map = C30258BuA.LIZ;
        C30240Bts c30240Bts = (C30240Bts) ((LinkedHashMap) map).get(dataChannel);
        if (c30240Bts == null) {
            C30242Btu c30242Btu = new C30242Btu();
            c30242Btu.LJ = new C30252Bu4(context, lifecycleOwner, dataChannel, C30258BuA.LIZ(LIZIZ));
            map.put(dataChannel, new C30240Bts(c30242Btu));
        } else {
            C30242Btu c30242Btu2 = c30240Bts.LIZ;
            C30252Bu4 c30252Bu4 = new C30252Bu4(context, lifecycleOwner, dataChannel, C30258BuA.LIZ(LIZIZ));
            c30242Btu2.getClass();
            c30242Btu2.LJ = c30252Bu4;
        }
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarService
    public final void vh(Context context, int i, EnumC30226Bte style) {
        int i2;
        MutableContextWrapper mutableContextWrapper;
        o.LJIIIZ(style, "style");
        C30249Bu1 c30249Bu1 = C30249Bu1.LIZ;
        int layoutId = style.getLayoutId();
        c30249Bu1.getClass();
        if (!LiveLayoutPreloadSetting.INSTANCE.enable() || context == null) {
            return;
        }
        C30249Bu1.LIZJ = new C15Y(new MutableContextWrapper(context));
        C30249Bu1.LIZLLL = C16880lQ.LLZIL(new MutableContextWrapper(context));
        Stack stack = (Stack) ((LinkedHashMap) C30249Bu1.LIZIZ).get(Integer.valueOf(layoutId));
        if (stack != null) {
            Iterator it = stack.iterator();
            while (it.hasNext()) {
                Context context2 = ((View) it.next()).getContext();
                if ((context2 instanceof MutableContextWrapper) && (mutableContextWrapper = (MutableContextWrapper) context2) != null) {
                    mutableContextWrapper.setBaseContext(context);
                }
            }
        }
        Map<Integer, Stack<View>> map = C30249Bu1.LIZIZ;
        Vector vector = (Vector) ((LinkedHashMap) map).get(Integer.valueOf(layoutId));
        if (vector != null) {
            i2 = vector.size();
        } else {
            map.put(Integer.valueOf(layoutId), new Stack<>());
            i2 = 0;
        }
        int i3 = i - i2;
        for (int i4 = 0; i4 < i3; i4++) {
            C30249Bu1.LIZ.getClass();
            C15Y c15y = C30249Bu1.LIZJ;
            if (c15y != null) {
                c15y.LIZ(layoutId, null, new C1TJ(layoutId));
            }
        }
    }
}
