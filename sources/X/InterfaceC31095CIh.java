package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.CIh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31095CIh extends LifecycleObserver, InterfaceC68302mA, WeakHandler.IHandler, OnMessageListener {
    java.util.Map<String, Object> getDataContainer();

    InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> getSlotWidgetByBizType(String str);

    void load(ActivityC45651qj activityC45651qj, EnumC30736C4m enumC30736C4m);

    @Override // X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    /* synthetic */ void onCreate();

    @Override // X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    /* synthetic */ void onDestroy();

    @Override // X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    /* synthetic */ void onPause();

    @Override // X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    /* synthetic */ void onResume();

    @Override // X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    /* synthetic */ void onStart();

    @Override // X.InterfaceC68302mA
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    /* synthetic */ void onStop();

    void putData(String str, Object obj);

    InterfaceC31095CIh setDataChannel(DataChannel dataChannel);
}
