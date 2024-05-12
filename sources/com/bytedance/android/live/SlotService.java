package com.bytedance.android.live;

import X.A75;
import X.A76;
import X.AbstractC62607Ohf;
import X.ActivityC45651qj;
import X.BTD;
import X.C09690Zp;
import X.C09700Zq;
import X.C0IR;
import X.C0NB;
import X.C29306Beo;
import X.C31699CcJ;
import X.C31726Cck;
import X.C73994T2g;
import X.EnumC30241Btt;
import X.EnumC30736C4m;
import X.EnumC31700CcK;
import X.EnumC31730Cco;
import X.InterfaceC30435Bx1;
import X.InterfaceC30436Bx2;
import X.InterfaceC31095CIh;
import X.InterfaceC31718Ccc;
import X.InterfaceC31722Ccg;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.EcSlotBarrageWidget;
import com.bytedance.android.live.slot.FrameL2SlotWidget;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.android.live.slot.FreeFrameSlotWidget;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.slot.IconSlotController;
import com.bytedance.android.live.slot.SlotBarrageWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlotExperiment;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class SlotService implements ISlotService {
    @Override // com.bytedance.android.live.slot.ISlotService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        BTD.LIZ(this);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getBarrageWidget() {
        return SlotBarrageWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getBottomLeftSlotWidget() {
        return BottomLeftSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFrameEcBarrageSlotWidget() {
        return EcSlotBarrageWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFrameL2SlotWidget() {
        return FrameL2SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFrameL3SlotWidget() {
        return FrameL3SlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFrameSlotWidget() {
        return FrameSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Class<? extends LiveRecyclableWidget> getFreeFrameSlotWidget() {
        return FreeFrameSlotWidget.class;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void dispatchMessage(IMessage iMessage) {
        Iterator it = ((HashMap) C09700Zq.LIZ().LIZ.LIZLLL).values().iterator();
        while (it.hasNext()) {
            ((A76) it.next()).LJ();
        }
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC31722Ccg getAggregateProviderByID(EnumC30736C4m enumC30736C4m) {
        C09690Zp c09690Zp = C09700Zq.LIZ().LIZ;
        c09690Zp.LIZ();
        return (InterfaceC31722Ccg) ((HashMap) c09690Zp.LIZJ).get(enumC30736C4m);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final List<C31726Cck> getProviderWrappersByID(EnumC30736C4m enumC30736C4m) {
        return C09700Zq.LIZ().LIZJ(enumC30736C4m);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC30435Bx1 getSlotMessagerByBiz(String str) {
        C09700Zq LIZ = C09700Zq.LIZ();
        if (((HashMap) LIZ.LIZ.LIZLLL).containsKey(str)) {
            C09690Zp c09690Zp = LIZ.LIZ;
            c09690Zp.LIZ();
            if (((HashMap) c09690Zp.LIZLLL).get(str) == null) {
                return null;
            }
            C09690Zp c09690Zp2 = LIZ.LIZ;
            c09690Zp2.LIZ();
            ((A76) ((HashMap) c09690Zp2.LIZLLL).get(str)).LJ();
            return null;
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final boolean isBizTypeRegistered(String str) {
        return ((HashMap) C09700Zq.LIZ().LIZ.LIZLLL).containsKey(str);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void registerAggregateSlot(InterfaceC31722Ccg interfaceC31722Ccg) {
        C09700Zq LIZ = C09700Zq.LIZ();
        LIZ.getClass();
        interfaceC31722Ccg.LIZ();
        if (!TextUtils.isEmpty("aggregate_live_business")) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get("aggregate_live_business");
            if (slotBizTypeDisallow != null && slotBizTypeDisallow.getDisallowAll()) {
                return;
            }
            C09690Zp c09690Zp = LIZ.LIZ;
            interfaceC31722Ccg.LIZ();
            ((HashMap) c09690Zp.LJ).put("aggregate_live_business", interfaceC31722Ccg);
            List<EnumC30736C4m> LIZIZ = interfaceC31722Ccg.LIZIZ();
            if (LIZIZ == null) {
                return;
            }
            for (EnumC30736C4m enumC30736C4m : LIZIZ) {
                if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(enumC30736C4m.name())) {
                    ((HashMap) LIZ.LIZ.LIZJ).put(enumC30736C4m, interfaceC31722Ccg);
                }
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void registerSlot(A76 a76) {
        C09700Zq LIZ = C09700Zq.LIZ();
        LIZ.getClass();
        String LIZ2 = a76.LIZ();
        if (!TextUtils.isEmpty(LIZ2)) {
            SlotBizTypeDisallow slotBizTypeDisallow = LiveSlotExperiment.INSTANCE.getBizTypeDisallow().get(LIZ2);
            if (slotBizTypeDisallow != null && slotBizTypeDisallow.getDisallowAll()) {
                return;
            }
            C09690Zp c09690Zp = LIZ.LIZ;
            ((HashMap) c09690Zp.LIZLLL).put(a76.LIZ(), a76);
            List<EnumC30736C4m> LIZIZ = a76.LIZIZ();
            if (LIZIZ != null) {
                for (EnumC30736C4m enumC30736C4m : LIZIZ) {
                    if (slotBizTypeDisallow == null || slotBizTypeDisallow.getIconSlotDisallowList() == null || !slotBizTypeDisallow.getIconSlotDisallowList().contains(enumC30736C4m.name())) {
                        C09690Zp c09690Zp2 = LIZ.LIZ;
                        List list = (List) ((HashMap) c09690Zp2.LIZ).get(enumC30736C4m);
                        if (list == null) {
                            list = new ArrayList();
                            ((HashMap) c09690Zp2.LIZ).put(enumC30736C4m, list);
                        }
                        list.add(a76);
                    }
                }
            }
            List<EnumC31730Cco> LIZJ = a76.LIZJ();
            if (LIZJ == null) {
                return;
            }
            for (EnumC31730Cco enumC31730Cco : LIZJ) {
                if (slotBizTypeDisallow == null || slotBizTypeDisallow.getFrameSlotDisallowList() == null || !slotBizTypeDisallow.getFrameSlotDisallowList().contains(enumC31730Cco.name())) {
                    C09690Zp c09690Zp3 = LIZ.LIZ;
                    List list2 = (List) ((HashMap) c09690Zp3.LIZIZ).get(enumC31730Cco);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        ((HashMap) c09690Zp3.LIZIZ).put(enumC31730Cco, list2);
                    }
                    list2.add(a76);
                }
            }
            return;
        }
        throw new IllegalArgumentException("SlotWidgetProvider must return valid bizType");
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final List<C31726Cck> getProviderWrappersByID(EnumC31730Cco enumC31730Cco) {
        return C09700Zq.LIZ().LIZIZ(enumC31730Cco);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC30436Bx2 createGiftDebugService(Context context, DataChannel dataChannel) {
        return new C73994T2g();
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Rect getFrameSlotLocation(Context context, EnumC31730Cco enumC31730Cco) {
        View findViewById;
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
        if (LIZIZ != null) {
            int i = C0IR.LIZIZ[enumC31730Cco.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            findViewById = LIZIZ.findViewById(R.id.dno);
                        }
                    } else {
                        findViewById = LIZIZ.findViewById(R.id.ar1);
                    }
                } else {
                    findViewById = LIZIZ.findViewById(R.id.dn0);
                }
            } else {
                findViewById = LIZIZ.findViewById(R.id.k58);
            }
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                int i2 = iArr[0];
                return new Rect(i2, iArr[1], findViewById.getWidth() + i2, findViewById.getHeight() + iArr[1]);
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final Rect getIconSlotLocation(Context context, EnumC30736C4m enumC30736C4m) {
        View findViewById;
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context);
        if (LIZIZ != null) {
            int i = C0IR.LIZ[enumC30736C4m.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        findViewById = LIZIZ.findViewById(R.id.ls_);
                    }
                } else {
                    findViewById = LIZIZ.findViewById(R.id.aq_);
                }
            } else {
                findViewById = LIZIZ.findViewById(R.id.lsb);
            }
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                int i2 = iArr[0];
                return new Rect(i2, iArr[1], findViewById.getWidth() + i2, findViewById.getHeight() + iArr[1]);
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final List<AbstractC62607Ohf> getLiveShareSheetAction(Map<String, Object> map, EnumC30736C4m enumC30736C4m) {
        A75 a75;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C09700Zq.LIZ().LIZJ(enumC30736C4m)).iterator();
        while (it.hasNext()) {
            A76 a76 = ((C31726Cck) it.next()).LIZ;
            List list = null;
            if (a76 instanceof A75) {
                a75 = (A75) a76;
            } else {
                a75 = null;
            }
            if (a75 != null) {
                try {
                    list = (List) a75.LJI(map, enumC30736C4m).get("param_live_broadcast_share_sheet_list");
                } catch (Exception unused) {
                    C0NB.LJIIIZ("TAG", "getLiveShareSheetAction responseParams get param_live_broadcast_share_sheet_list, error");
                }
                if (list != null && list.size() > 0) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final void loadToolbarIconSlotBehavior(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        EnumC30241Btt.ICON_SLOT.load(dataChannel, new C31699CcJ(), null);
    }

    @Override // com.bytedance.android.live.slot.ISlotService
    public final InterfaceC31095CIh createIconSlotController(ActivityC45651qj activityC45651qj, InterfaceC31718Ccc interfaceC31718Ccc, EnumC30736C4m enumC30736C4m, EnumC31700CcK enumC31700CcK) {
        return new IconSlotController(activityC45651qj, interfaceC31718Ccc, enumC30736C4m, enumC31700CcK);
    }
}
