package com.bytedance.android.livesdk.liveevent;

import X.C16880lQ;
import X.C17390mF;
import X.C1B;
import X.C221108m2;
import X.C30628C0i;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C78996UzQ;
import X.CV7;
import X.InterfaceC17380mE;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import Y.ARunnableS41S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.util.LongSparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.LiveEventCardVisibility;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveEventDescCardWidget extends LiveRecyclableWidget {
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLJI;
    public boolean LJLJJL;
    public C17390mF LJLJJLL;
    public final ValueAnimator LJLJLLL;
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 242));
    public final C1B LJLJL = new C1B(this);
    public final ARunnableS41S0100000_5 LJLJLJ = new ARunnableS41S0100000_5(this, 162);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dp_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final CV7 LJZ() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-liveEventLynxCard>(...)");
        return (CV7) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        if (this.LJLJJL) {
            CV7 LJZ = LJZ();
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LJLJI;
            if (C78996UzQ.LJJIIJZLJL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS)) {
                C78996UzQ.LJI();
            }
            LJZ.removeView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = this.LJLJI;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2);
            }
            this.LJLJI = null;
            this.LJLJJL = false;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveEventCardVisibility.class, Boolean.FALSE);
            }
            this.LJLILLLLZI.removeCallbacks(this.LJLJLJ);
            this.LJLJLLL.setStartDelay(0L);
            this.LJLJLLL.setFloatValues(1.0f, 0.0f);
            this.LJLJLLL.setDuration(400L);
            this.LJLJLLL.start();
            LJZ().setAnimationDuration(400L);
            LJZ().LIZLLL();
            this.LJLILLLLZI.postDelayed(new ARunnableS41S0100000_5(this, 163), 300L);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            long id = room.getId();
            C1B pollCallback = this.LJLJL;
            o.LJIIIZ(pollCallback, "pollCallback");
            CopyOnWriteArrayList<InterfaceC17380mE> copyOnWriteArrayList = C30628C0i.LJLJJL.get(id);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(pollCallback);
            }
        }
        this.LJLIL.dispose();
        this.LJLILLLLZI.removeCallbacksAndMessages(null);
        C16880lQ.LJLJL(this.LJLJLLL);
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(LiveEventCardVisibility.class, Boolean.FALSE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.liveevent.LiveEventDescCardWidget.show():void");
    }

    public LiveEventDescCardWidget() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 21));
        this.LJLJLLL = ofFloat;
    }

    public static final /* synthetic */ void LJLZ(LiveEventDescCardWidget liveEventDescCardWidget) {
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            bool.booleanValue();
        }
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            long id = room.getId();
            C1B pollCallback = this.LJLJL;
            o.LJIIIZ(pollCallback, "pollCallback");
            LongSparseArray<CopyOnWriteArrayList<InterfaceC17380mE>> longSparseArray = C30628C0i.LJLJJL;
            CopyOnWriteArrayList<InterfaceC17380mE> copyOnWriteArrayList = longSparseArray.get(id);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                longSparseArray.put(id, copyOnWriteArrayList);
            }
            if (!copyOnWriteArrayList.contains(pollCallback)) {
                copyOnWriteArrayList.add(pollCallback);
            }
            long id2 = room.getId();
            LongSparseArray<C17390mF> longSparseArray2 = C30628C0i.LJLJLLL;
            C17390mF c17390mF = longSparseArray2.get(id2);
            longSparseArray2.remove(id2);
            if (c17390mF != null) {
                Integer num = C30628C0i.LJLJJI.get(room.getId());
                if (num == null || num.intValue() != 0) {
                    return;
                }
                this.LJLJJLL = c17390mF;
                show();
            }
        }
    }
}
