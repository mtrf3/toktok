package com.bytedance.android.live.slot;

import X.A76;
import X.AbstractC62607Ohf;
import X.ActivityC45651qj;
import X.C31726Cck;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.EnumC31730Cco;
import X.InterfaceC06390Mx;
import X.InterfaceC30435Bx1;
import X.InterfaceC30436Bx2;
import X.InterfaceC31095CIh;
import X.InterfaceC31718Ccc;
import X.InterfaceC31722Ccg;
import android.content.Context;
import android.graphics.Rect;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public interface ISlotService extends InterfaceC06390Mx {
    InterfaceC30436Bx2 createGiftDebugService(Context context, DataChannel dataChannel);

    InterfaceC31095CIh createIconSlotController(ActivityC45651qj activityC45651qj, InterfaceC31718Ccc interfaceC31718Ccc, EnumC30736C4m enumC30736C4m, EnumC31700CcK enumC31700CcK);

    void dispatchMessage(IMessage iMessage);

    InterfaceC31722Ccg getAggregateProviderByID(EnumC30736C4m enumC30736C4m);

    Class<? extends LiveRecyclableWidget> getBarrageWidget();

    Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameEcBarrageSlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget();

    Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget();

    Rect getFrameSlotLocation(Context context, EnumC31730Cco enumC31730Cco);

    Class<? extends LiveRecyclableWidget> getFrameSlotWidget();

    Class<? extends LiveRecyclableWidget> getFreeFrameSlotWidget();

    Rect getIconSlotLocation(Context context, EnumC30736C4m enumC30736C4m);

    List<AbstractC62607Ohf> getLiveShareSheetAction(Map<String, Object> map, EnumC30736C4m enumC30736C4m);

    List<C31726Cck> getProviderWrappersByID(EnumC30736C4m enumC30736C4m);

    List<C31726Cck> getProviderWrappersByID(EnumC31730Cco enumC31730Cco);

    InterfaceC30435Bx1 getSlotMessagerByBiz(String str);

    boolean isBizTypeRegistered(String str);

    void loadToolbarIconSlotBehavior(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void registerAggregateSlot(InterfaceC31722Ccg interfaceC31722Ccg);

    void registerSlot(A76 a76);
}
