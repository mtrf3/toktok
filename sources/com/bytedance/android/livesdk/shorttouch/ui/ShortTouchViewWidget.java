package com.bytedance.android.livesdk.shorttouch.ui;

import X.B83;
import X.C259710f;
import X.C29374Bfu;
import X.C29726Bla;
import X.C77111UOd;
import X.UOH;
import X.UOJ;
import X.UOX;
import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.SystemClock;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCustomPollMigrateShortTouchSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShortTouchWidgetRecycleSetting;
import com.bytedance.android.livesdk.shorttouch.ShortTouchMessageEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;

/* loaded from: classes14.dex */
public abstract class ShortTouchViewWidget extends LiveRecyclableWidget {
    public ViewGroup LJLIL;
    public List<UOX> LJLILLLLZI;
    public boolean LJLJI;
    public final ArrayList<Animator> LJLJJI = new ArrayList<>();

    public abstract int LJLZ(UOX uox);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return LiveShortTouchWidgetRecycleSetting.INSTANCE.getViewWidgetRecycle();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.LJLILLLLZI = null;
        this.LJLJI = false;
        Iterator<Animator> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        C77111UOd.LIZ.LJ = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (ViewGroup) findViewById(R.id.bs8);
        float LIZIZ = 1 / C259710f.LIZ.LIZIZ();
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            viewGroup.setScaleX(LIZIZ);
        }
        ViewGroup viewGroup2 = this.LJLIL;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setScaleY(LIZIZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long l;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        linkedHashMap.put("room_id", l);
        linkedHashMap.put("user_id", Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getId()));
        linkedHashMap.put("is_anchor", this.dataChannel.kv0(UserIsAnchorChannel.class));
        Map<String, Object> map = UOH.LIZ;
        ((LinkedHashMap) map).clear();
        map.putAll(linkedHashMap);
        this.LJLILLLLZI = new ArrayList();
        ViewGroup viewGroup = this.LJLIL;
        if (viewGroup != null) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setAnimator(2, ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 0.0f, 1.0f)));
            if (LiveCustomPollMigrateShortTouchSetting.enableMigrate()) {
                layoutTransition.disableTransitionType(3);
            } else {
                layoutTransition.setAnimator(3, ObjectAnimator.ofPropertyValuesHolder(this.LJLIL, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.0f)));
            }
            viewGroup.setLayoutTransition(layoutTransition);
        }
        this.dataChannel.lv0(this, ShortTouchMessageEvent.class, new AqS179S0100000_13(this, 336));
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof C29726Bla) {
                    UOH.LIZIZ = ((C29726Bla) obj).LIZ;
                }
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_short_touch_view_widget_load_finished")) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            long j = UOH.LIZIZ;
            long j2 = -1;
            if (j != -1) {
                j2 = elapsedRealtime - j;
            }
            linkedHashMap2.put("duration", Long.valueOf(j2));
            UOH.LIZ("ttlive_short_touch_view_widget_load_finished", linkedHashMap2);
        }
        UOJ uoj = C77111UOd.LIZ;
        uoj.LJ = true;
        uoj.LIZJ();
    }
}
