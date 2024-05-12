package Y;

import X.BCX;
import X.BJP;
import X.C15380j0;
import X.C29306Beo;
import X.C29701Eo;
import X.C31267COx;
import X.C31684Cc4;
import X.C31685Cc5;
import X.C31692CcC;
import X.C31696CcG;
import X.C31697CcH;
import X.C31698CcI;
import X.C31699CcJ;
import X.C31703CcN;
import X.C31723Cch;
import X.C31743Cd1;
import X.C71178Rwc;
import X.C72400SbE;
import X.C79045V0n;
import X.C79271V9f;
import X.C79273V9h;
import X.C79277V9l;
import X.InterfaceC31095CIh;
import X.InterfaceC31694CcE;
import X.InterfaceC31710CcU;
import X.V8L;
import X.X1D;
import android.animation.Animator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.slot.BottomLeftSlotVisibilityChannel;
import com.bytedance.android.live.slot.BottomLeftSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetDialog;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public class AObserverS66S0300000_5 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            case 3:
                onChanged$3(this, obj);
                return;
            case 4:
                onChanged$4(this, obj);
                return;
            case 5:
                onChanged$5(this, obj);
                return;
            case 6:
                onChanged$6(this, obj);
                return;
            case 7:
                onChanged$7(this, obj);
                return;
            case 8:
                onChanged$8(this, obj);
                return;
            case 9:
                onChanged$9(this, obj);
                return;
            case 10:
                onChanged$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onChanged$11(this, obj);
                return;
            case 12:
                onChanged$12(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(BottomLeftSlotVisibilityChannel.class, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        String str = "";
        if (bool2.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZ(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ, bool.booleanValue());
            if (bool2.equals(bool)) {
                ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LLJJL("during_live");
            }
            if (bool2.equals(bool)) {
                str = ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LIZ();
            }
            BJP.LIZJ(str);
            return;
        }
        Iterator it = ((PriorityBlockingQueue) ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJLL).iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((HashMap) ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJLLI).get(next);
                if (((C31723Cch) aObserverS66S0300000_5.l1) != next && Boolean.TRUE.equals(slotViewModel.LJLIL.getValue())) {
                    break;
                }
            } else {
                ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.setValue(Boolean.TRUE);
                break;
            }
        }
        Boolean bool3 = Boolean.TRUE;
        if (!bool3.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            return;
        }
        ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZ(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ, bool.booleanValue());
        if (bool3.equals(bool)) {
            ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LLJJL("during_live");
        }
        if (bool3.equals(bool)) {
            str = ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LIZ();
        }
        BJP.LIZJ(str);
    }

    public static final void onChanged$1(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(BottomLeftSlotVisibilityChannel.class, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        String str = "";
        if (bool2.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZ(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ, bool.booleanValue());
            if (bool2.equals(bool)) {
                ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LLJJL("during_live");
            }
            if (bool2.equals(bool)) {
                str = ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LIZ();
            }
            BJP.LIZJ(str);
            return;
        }
        Iterator it = ((PriorityBlockingQueue) ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJLL).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((HashMap) ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJLLI).get(next);
            if (((C31723Cch) aObserverS66S0300000_5.l1) != next && Boolean.TRUE.equals(slotViewModel.LJLIL.getValue())) {
                slotViewModel.LJLIL.postValue(Boolean.FALSE);
            }
        }
        MutableLiveData<Boolean> mutableLiveData = ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL;
        Boolean bool3 = Boolean.TRUE;
        mutableLiveData.setValue(bool3);
        ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZ(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ, bool.booleanValue());
        ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZL(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ, (IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0);
        if (bool3.equals(bool)) {
            ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LLJJL("during_live");
        }
        if (bool3.equals(bool)) {
            str = ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LIZ();
        }
        BJP.LIZJ(str);
    }

    public static final void onChanged$10(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        Object obj2;
        Map<String, Object> map;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (C29306Beo.LJIL(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            return;
        }
        DataChannel dataChannel = ((PreviewBaseSlotWidget) aObserverS66S0300000_5.l1).dataChannel;
        Map<String, Object> map2 = null;
        if (dataChannel != null) {
            obj2 = dataChannel.kv0(BCX.class);
        } else {
            obj2 = null;
        }
        if (C29306Beo.LJJIFFI(Boolean.valueOf(booleanValue)) && obj2 == LiveMode.THIRD_PARTY) {
            Boolean bool = ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LLIFFJFJJ;
            o.LJIIIIZZ(bool, "viewModel.gamePartnershipBusiness");
            if (bool.booleanValue()) {
                ((PreviewBaseSlotWidget) aObserverS66S0300000_5.l1).hide();
                return;
            }
        }
        if (C29306Beo.LJJIFFI(Boolean.valueOf(booleanValue))) {
            C31685Cc5 c31685Cc5 = ((PreviewBaseSlotWidget) aObserverS66S0300000_5.l1).LJLJJI;
            if (c31685Cc5 != null) {
                c31685Cc5.setVisibility(0);
            }
            ((InterfaceC31710CcU) aObserverS66S0300000_5.l2).LLJJL("before_live");
            HashMap hashMap = new HashMap();
            PreviewBaseSlotWidget previewBaseSlotWidget = (PreviewBaseSlotWidget) aObserverS66S0300000_5.l1;
            if (!previewBaseSlotWidget.LJLJJLL) {
                InterfaceC31095CIh interfaceC31095CIh = previewBaseSlotWidget.LJLJI;
                if (interfaceC31095CIh != null) {
                    map = interfaceC31095CIh.getDataContainer();
                } else {
                    map = null;
                }
                long LIZ = C31684Cc4.LIZ("param_live_slot_start_time_long", map);
                InterfaceC31095CIh interfaceC31095CIh2 = ((PreviewBaseSlotWidget) aObserverS66S0300000_5.l1).LJLJI;
                if (interfaceC31095CIh2 != null) {
                    map2 = interfaceC31095CIh2.getDataContainer();
                }
                long LIZ2 = C31684Cc4.LIZ("param_live_slot_api_end_time_long", map2);
                if (LIZ > 0 && LIZ2 > 0) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZ2 - LIZ);
                    LIZ3.append("");
                    hashMap.put("request_time", X1D.LIZIZ(LIZ3));
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(SystemClock.uptimeMillis() - LIZ);
                    LIZ4.append("");
                    hashMap.put("all_time", X1D.LIZIZ(LIZ4));
                }
                C31684Cc4.LJFF((InterfaceC31710CcU) aObserverS66S0300000_5.l2, hashMap);
            }
            C31684Cc4.LIZJ("PreviewBaseSlowWidget", (InterfaceC31710CcU) aObserverS66S0300000_5.l2, "slot visible change, visible: true", hashMap);
            PreviewBaseSlotWidget previewBaseSlotWidget2 = (PreviewBaseSlotWidget) aObserverS66S0300000_5.l1;
            previewBaseSlotWidget2.LJLJJLL = true;
            previewBaseSlotWidget2.show();
            return;
        }
        C31685Cc5 c31685Cc52 = ((PreviewBaseSlotWidget) aObserverS66S0300000_5.l1).LJLJJI;
        if (c31685Cc52 != null) {
            c31685Cc52.setVisibility(8);
        }
        C31684Cc4.LIZIZ("PreviewBaseSlowWidget", (InterfaceC31710CcU) aObserverS66S0300000_5.l2, "slot visible change, visible: false");
    }

    public static final void onChanged$11(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        C31692CcC c31692CcC = (C31692CcC) aObserverS66S0300000_5.l0;
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aObserverS66S0300000_5.l1;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS66S0300000_5.l2;
        C31697CcH c31697CcH = (C31697CcH) obj;
        c31692CcC.getClass();
        if (c31697CcH == null) {
            C31684Cc4.LIZIZ("ToolbarAudienceSlotBehavior", interfaceC31710CcU, "tips text or icon error");
            return;
        }
        List<String> list = c31697CcH.LIZ;
        ArrayList arrayList = new ArrayList();
        int size = ((ArrayList) C31692CcC.LJLZ).size();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ListProtector.get(list, i);
            int size2 = arrayList.size();
            if (size2 >= size) {
                break;
            }
            if (str != null) {
                V8L LIZIZ = V8L.LIZIZ(C15380j0.LIZ(4.0f));
                Context context = c31692CcC.LJLILLLLZI;
                if (context != null) {
                    Integer LJI = C79045V0n.LJI(R.attr.dj, context);
                    if (LJI != null) {
                        LIZIZ.LJFF = LJI.intValue();
                    }
                    LIZIZ.LIZLLL(C15380j0.LIZ(1.0f));
                }
                C31696CcG c31696CcG = (C31696CcG) ListProtector.get(C31692CcC.LJLZ, size2);
                arrayList.add(new C79277V9l(str, c31696CcG.LIZ, c31696CcG.LIZIZ, LIZIZ, c31696CcG.LIZJ, c31696CcG.LIZLLL));
            }
        }
        String str2 = c31697CcH.LIZIZ;
        long j = slotViewModel.LL;
        InterfaceC31694CcE interfaceC31694CcE = slotViewModel.LLFII;
        C71178Rwc c71178Rwc = slotViewModel.LLFZ;
        C72400SbE c72400SbE = new C72400SbE(slotViewModel);
        c31692CcC.LJLLLLLL = c72400SbE;
        c72400SbE.LIZIZ(arrayList, new C79271V9f(c31692CcC, arrayList, str2, interfaceC31694CcE, c71178Rwc, j));
    }

    public static final void onChanged$12(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        if (((SlotsBottomSheetDialog) aObserverS66S0300000_5.l2).isDetached()) {
            return;
        }
        if (Boolean.TRUE.equals(obj)) {
            C31743Cd1 c31743Cd1 = (C31743Cd1) aObserverS66S0300000_5.l0;
            InterfaceC31710CcU slotWidget = (InterfaceC31710CcU) ((Map.Entry) aObserverS66S0300000_5.l1).getKey();
            c31743Cd1.getClass();
            o.LJIIIZ(slotWidget, "slotWidget");
            if (!((ArrayList) c31743Cd1.LJLJJI).contains(slotWidget)) {
                int LIZIZ = C31267COx.LIZIZ(slotWidget.LIZ());
                int size = ((ArrayList) c31743Cd1.LJLJJI).size();
                int size2 = ((ArrayList) c31743Cd1.LJLJJI).size();
                int i = 0;
                while (true) {
                    if (i >= size2) {
                        break;
                    }
                    if (LIZIZ < C31267COx.LIZIZ(((InterfaceC31710CcU) ListProtector.get(c31743Cd1.LJLJJI, i)).LIZ())) {
                        size = i;
                        break;
                    }
                    i++;
                }
                ListProtector.add(c31743Cd1.LJLJJI, size, slotWidget);
                c31743Cd1.notifyDataSetChanged();
            }
            ((InterfaceC31710CcU) ((Map.Entry) aObserverS66S0300000_5.l1).getKey()).LLJJL("before_live_dialog_item");
            return;
        }
        C31743Cd1 c31743Cd12 = (C31743Cd1) aObserverS66S0300000_5.l0;
        Object slotWidget2 = ((Map.Entry) aObserverS66S0300000_5.l1).getKey();
        c31743Cd12.getClass();
        o.LJIIIZ(slotWidget2, "slotWidget");
        ((ArrayList) c31743Cd12.LJLJJI).remove(slotWidget2);
        c31743Cd12.notifyDataSetChanged();
    }

    public static final void onChanged$2(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        boolean z;
        String str;
        Boolean bool = (Boolean) obj;
        DataChannel dataChannel = ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(BottomLeftSlotVisibilityChannel.class, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        if (bool2.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZ(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ, bool.booleanValue());
            if (bool2.equals(bool)) {
                ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LLJJL("during_live");
            }
            if (bool2.equals(bool)) {
                str = ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LIZ();
            } else {
                str = "";
            }
            BJP.LIZJ(str);
        }
        boolean z2 = true;
        if (bool2.equals(bool) && !bool2.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            z = true;
        } else {
            z = false;
        }
        if (!bool2.equals(bool) && bool2.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.setValue(Boolean.FALSE);
        } else {
            z2 = false;
        }
        Iterator it = ((PriorityBlockingQueue) ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJLL).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C31723Cch c31723Cch = (C31723Cch) it.next();
            IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) ((HashMap) ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJLLI).get(c31723Cch);
            int i = c31723Cch.LIZ;
            C31723Cch c31723Cch2 = (C31723Cch) aObserverS66S0300000_5.l1;
            if (i <= c31723Cch2.LIZ && c31723Cch2 != c31723Cch) {
                if (z && Boolean.TRUE.equals(slotViewModel.LJLIL.getValue())) {
                    break;
                }
                if (z2) {
                    Boolean bool3 = Boolean.TRUE;
                    if (!bool3.equals(slotViewModel.LJLIL.getValue()) && bool3.equals(slotViewModel.LJLILLLLZI.getValue())) {
                        slotViewModel.LJLIL.setValue(bool3);
                        ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZI(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ);
                        ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZL(c31723Cch.LIZIZ, slotViewModel);
                        c31723Cch.LIZIZ.LLJJL("during_live");
                        BJP.LIZJ(c31723Cch.LIZIZ.LIZ());
                        break;
                    }
                } else {
                    continue;
                }
            } else if (c31723Cch2 == c31723Cch) {
                if (z) {
                    ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.setValue(Boolean.TRUE);
                }
            } else if (z && Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
                slotViewModel.LJLIL.setValue(Boolean.FALSE);
            } else if (z2) {
                Boolean bool4 = Boolean.TRUE;
                if (!bool4.equals(slotViewModel.LJLIL.getValue()) && bool4.equals(slotViewModel.LJLILLLLZI.getValue())) {
                    slotViewModel.LJLIL.setValue(bool4);
                    ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZI(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ);
                    ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZL(c31723Cch.LIZIZ, slotViewModel);
                    c31723Cch.LIZIZ.LLJJL("during_live");
                    BJP.LIZJ(c31723Cch.LIZIZ.LIZ());
                    break;
                }
            } else {
                continue;
            }
        }
        if (!z) {
            return;
        }
        if (Boolean.TRUE.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZI(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ);
            ((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LLJJL("during_live");
            BJP.LIZJ(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ.LIZ());
            ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZL(((C31723Cch) aObserverS66S0300000_5.l1).LIZIZ, (IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0);
        }
    }

    public static final void onChanged$3(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        String str;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = Boolean.TRUE;
        if (!bool2.equals(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue())) {
            return;
        }
        ((BottomLeftSlotWidget) aObserverS66S0300000_5.l2).LJZ((InterfaceC31710CcU) aObserverS66S0300000_5.l1, bool.booleanValue());
        if (bool2.equals(bool)) {
            ((InterfaceC31710CcU) aObserverS66S0300000_5.l1).LLJJL("during_live");
        }
        if (bool2.equals(bool)) {
            str = ((InterfaceC31710CcU) aObserverS66S0300000_5.l1).LIZ();
        } else {
            str = "";
        }
        BJP.LIZJ(str);
    }

    public static final void onChanged$4(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        List<String> list;
        BottomLeftSlotWidget bottomLeftSlotWidget = (BottomLeftSlotWidget) aObserverS66S0300000_5.l0;
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aObserverS66S0300000_5.l1;
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS66S0300000_5.l2;
        C31697CcH c31697CcH = (C31697CcH) obj;
        bottomLeftSlotWidget.getClass();
        if (c31697CcH == null || c31697CcH.LIZIZ == null || (list = c31697CcH.LIZ) == null) {
            C31684Cc4.LIZIZ("BottomLeftSlotWidget", interfaceC31710CcU, "tips text or icon error");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = ((ArrayList) BottomLeftSlotWidget.LLD).size();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) ListProtector.get(list, i);
            int size2 = arrayList.size();
            if (size2 >= size) {
                break;
            }
            if (str != null) {
                V8L LIZIZ = V8L.LIZIZ(C15380j0.LIZ(4.0f));
                Context context = bottomLeftSlotWidget.context;
                if (context != null) {
                    Integer LJI = C79045V0n.LJI(R.attr.dj, context);
                    if (LJI != null) {
                        LIZIZ.LJFF = LJI.intValue();
                    }
                    LIZIZ.LIZLLL(C15380j0.LIZ(1.0f));
                }
                C31698CcI c31698CcI = (C31698CcI) ListProtector.get(BottomLeftSlotWidget.LLD, size2);
                arrayList.add(new C79277V9l(str, c31698CcI.LIZ, c31698CcI.LIZIZ, LIZIZ, c31698CcI.LIZJ, c31698CcI.LIZLLL));
            }
        }
        String str2 = c31697CcH.LIZIZ;
        long j = slotViewModel.LL;
        InterfaceC31694CcE interfaceC31694CcE = slotViewModel.LLFII;
        C71178Rwc c71178Rwc = slotViewModel.LLFZ;
        C72400SbE c72400SbE = new C72400SbE(slotViewModel);
        bottomLeftSlotWidget.LJLZ = c72400SbE;
        c72400SbE.LIZIZ(arrayList, new C79273V9h(bottomLeftSlotWidget, arrayList, str2, interfaceC31694CcE, c71178Rwc, j));
    }

    public static final void onChanged$5(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU;
        String str;
        Boolean value = (Boolean) obj;
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l0).LJLIL.getValue(), Boolean.TRUE) || (interfaceC31710CcU = (InterfaceC31710CcU) aObserverS66S0300000_5.l1) == null) {
            return;
        }
        C31699CcJ c31699CcJ = (C31699CcJ) aObserverS66S0300000_5.l2;
        o.LJIIIIZZ(value, "value");
        c31699CcJ.LIZLLL(interfaceC31710CcU, value.booleanValue());
        if (value.booleanValue()) {
            interfaceC31710CcU.LLJJL("during_live");
        }
        if (value.booleanValue()) {
            str = interfaceC31710CcU.LIZ();
            o.LJIIIIZZ(str, "it.bizType()");
        } else {
            str = "";
        }
        BJP.LIZJ(str);
    }

    public static final void onChanged$6(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean visible = (Boolean) obj;
        DataChannel dataChannel = ((C31699CcJ) aObserverS66S0300000_5.l0).LJLJI;
        if (dataChannel != null) {
            o.LJIIIIZZ(visible, "visible");
            dataChannel.rv0(BottomLeftSlotVisibilityChannel.class, visible);
            String str = "";
            if (o.LJ(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LJLIL.getValue(), Boolean.TRUE)) {
                InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU2 = ((C31723Cch) aObserverS66S0300000_5.l2).LIZIZ;
                if (interfaceC31710CcU2 != null) {
                    ((C31699CcJ) aObserverS66S0300000_5.l0).LIZLLL(interfaceC31710CcU2, visible.booleanValue());
                    if (visible.booleanValue()) {
                        interfaceC31710CcU2.LLJJL("during_live");
                    }
                    if (visible.booleanValue()) {
                        str = interfaceC31710CcU2.LIZ();
                        str.toString();
                    }
                    BJP.LIZJ(str);
                    return;
                }
                return;
            }
            Iterator it = ((PriorityBlockingQueue) ((C31699CcJ) aObserverS66S0300000_5.l0).LJZL).iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (!o.LJ((C31723Cch) aObserverS66S0300000_5.l2, next) && (slotViewModel = (IIconSlot.SlotViewModel) ((LinkedHashMap) ((C31699CcJ) aObserverS66S0300000_5.l0).LL).get(next)) != null && (mutableLiveData = slotViewModel.LJLIL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
                        break;
                    }
                } else {
                    ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LJLIL.setValue(Boolean.TRUE);
                    break;
                }
            }
            if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LJLIL.getValue(), Boolean.TRUE) || (interfaceC31710CcU = ((C31723Cch) aObserverS66S0300000_5.l2).LIZIZ) == null) {
                return;
            }
            ((C31699CcJ) aObserverS66S0300000_5.l0).LIZLLL(interfaceC31710CcU, visible.booleanValue());
            if (visible.booleanValue()) {
                interfaceC31710CcU.LLJJL("during_live");
            }
            if (visible.booleanValue()) {
                str = interfaceC31710CcU.LIZ();
                str.toString();
            }
            BJP.LIZJ(str);
            return;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    public static final void onChanged$7(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        IIconSlot.SlotViewModel slotViewModel;
        Boolean visible = (Boolean) obj;
        DataChannel dataChannel = ((C31699CcJ) aObserverS66S0300000_5.l0).LJLJI;
        if (dataChannel != null) {
            o.LJIIIIZZ(visible, "visible");
            dataChannel.rv0(BottomLeftSlotVisibilityChannel.class, visible);
            String str = "";
            if (o.LJ(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LJLIL.getValue(), Boolean.TRUE)) {
                InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU = ((C31723Cch) aObserverS66S0300000_5.l2).LIZIZ;
                if (interfaceC31710CcU != null) {
                    ((C31699CcJ) aObserverS66S0300000_5.l0).LIZLLL(interfaceC31710CcU, visible.booleanValue());
                    if (visible.booleanValue()) {
                        interfaceC31710CcU.LLJJL("during_live");
                    }
                    if (visible.booleanValue()) {
                        str = interfaceC31710CcU.LIZ();
                        str.toString();
                    }
                    BJP.LIZJ(str);
                    return;
                }
                return;
            }
            Iterator it = ((PriorityBlockingQueue) ((C31699CcJ) aObserverS66S0300000_5.l0).LJZL).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!o.LJ((C31723Cch) aObserverS66S0300000_5.l2, next) && (slotViewModel = (IIconSlot.SlotViewModel) ((LinkedHashMap) ((C31699CcJ) aObserverS66S0300000_5.l0).LL).get(next)) != null && o.LJ(slotViewModel.LJLIL.getValue(), Boolean.TRUE)) {
                    slotViewModel.LJLIL.postValue(Boolean.FALSE);
                }
            }
            ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LJLIL.setValue(Boolean.TRUE);
            InterfaceC31710CcU<?, ?, ?> interfaceC31710CcU2 = ((C31723Cch) aObserverS66S0300000_5.l2).LIZIZ;
            if (interfaceC31710CcU2 == null) {
                return;
            }
            C31699CcJ c31699CcJ = (C31699CcJ) aObserverS66S0300000_5.l0;
            IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1;
            c31699CcJ.LIZLLL(interfaceC31710CcU2, visible.booleanValue());
            c31699CcJ.LJ(interfaceC31710CcU2, slotViewModel2);
            if (visible.booleanValue()) {
                interfaceC31710CcU2.LLJJL("during_live");
            }
            if (visible.booleanValue()) {
                str = interfaceC31710CcU2.LIZ();
                str.toString();
            }
            BJP.LIZJ(str);
            return;
        }
        o.LJIJI("dataChannel");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f8, code lost:
    
        if (r11 == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$8(Y.AObserverS66S0300000_5 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS66S0300000_5.onChanged$8(Y.AObserverS66S0300000_5, java.lang.Object):void");
    }

    public static final void onChanged$9(AObserverS66S0300000_5 aObserverS66S0300000_5, Object obj) {
        String animAssetName;
        C29701Eo c29701Eo;
        IIconSlot iIconSlot;
        Animator.AnimatorListener LIZIZ;
        C29701Eo c29701Eo2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (((Boolean) ((C31699CcJ) aObserverS66S0300000_5.l0).LJLJJL.getValue()).booleanValue() && !TextUtils.isEmpty(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LLFF)) {
            animAssetName = ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LLFF;
        } else {
            animAssetName = ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LLF;
        }
        if (!o.LJ(((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).LJLILLLLZI.getValue(), Boolean.TRUE) || TextUtils.isEmpty(animAssetName)) {
            C29701Eo c29701Eo3 = ((C31699CcJ) aObserverS66S0300000_5.l0).LJLLILLLL;
            if (c29701Eo3 != null) {
                c29701Eo3.cancelAnimation();
                c29701Eo3.setVisibility(8);
            }
            ImageView imageView = ((C31699CcJ) aObserverS66S0300000_5.l0).LJLLI;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            C31699CcJ c31699CcJ = (C31699CcJ) aObserverS66S0300000_5.l0;
            ViewGroup.LayoutParams layoutParams = c31699CcJ.LLFF;
            if (layoutParams != null && (c29701Eo = c31699CcJ.LJLLILLLL) != null) {
                c29701Eo.setLayoutParams(layoutParams);
            }
            c31699CcJ.LLFF = null;
            return;
        }
        if (!booleanValue) {
            C29701Eo c29701Eo4 = ((C31699CcJ) aObserverS66S0300000_5.l0).LJLLILLLL;
            if (c29701Eo4 != null) {
                c29701Eo4.cancelAnimation();
                c29701Eo4.setVisibility(8);
            }
            ImageView imageView2 = ((C31699CcJ) aObserverS66S0300000_5.l0).LJLLI;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            C31699CcJ c31699CcJ2 = (C31699CcJ) aObserverS66S0300000_5.l0;
            ViewGroup.LayoutParams layoutParams2 = c31699CcJ2.LLFF;
            if (layoutParams2 != null && (c29701Eo2 = c31699CcJ2.LJLLILLLL) != null) {
                c29701Eo2.setLayoutParams(layoutParams2);
            }
            c31699CcJ2.LLFF = null;
            return;
        }
        ((IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1).getClass();
        C31699CcJ c31699CcJ3 = (C31699CcJ) aObserverS66S0300000_5.l0;
        C29701Eo c29701Eo5 = c31699CcJ3.LJLLILLLL;
        if (c29701Eo5 == null) {
            return;
        }
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) aObserverS66S0300000_5.l1;
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aObserverS66S0300000_5.l2;
        if (c29701Eo5.isAnimating()) {
            c29701Eo5.cancelAnimation();
        }
        c29701Eo5.setVisibility(0);
        o.LJIIIIZZ(animAssetName, "animAssetName");
        if (s.LJJJLZIJ(animAssetName, "http", false) || s.LJJJLZIJ(animAssetName, "https", false)) {
            c29701Eo5.setAnimationFromUrl(animAssetName);
        } else {
            c29701Eo5.setImageAssetsFolder(slotViewModel.LLD);
            c29701Eo5.setAnimation(animAssetName);
        }
        c29701Eo5.addAnimatorListener(c31699CcJ3.LLFII);
        Object LLJJJIL = interfaceC31710CcU.LLJJJIL();
        if ((LLJJJIL instanceof IIconSlot) && (iIconSlot = (IIconSlot) LLJJJIL) != null && (LIZIZ = iIconSlot.LIZIZ()) != null) {
            c29701Eo5.addAnimatorListener(LIZIZ);
        }
        c29701Eo5.setFailureListener(new C31703CcN(c29701Eo5, c31699CcJ3));
        c29701Eo5.playAnimation();
    }

    public AObserverS66S0300000_5(BottomLeftSlotWidget bottomLeftSlotWidget, IIconSlot.SlotViewModel slotViewModel, InterfaceC31710CcU interfaceC31710CcU, int i) {
        this.$t = i;
        switch (i) {
            case 3:
                this.l2 = bottomLeftSlotWidget;
                this.l0 = slotViewModel;
                this.l1 = interfaceC31710CcU;
                return;
            default:
                this.l0 = bottomLeftSlotWidget;
                this.l1 = interfaceC31710CcU;
                this.l2 = slotViewModel;
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS66S0300000_5(com.bytedance.android.live.slot.IIconSlot.SlotViewModel r2, com.bytedance.android.live.slot.IIconSlot.SlotViewModel r3, X.InterfaceC31710CcU<?, ?, ?> r4, X.C31699CcJ r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 5: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS66S0300000_5.<init>(com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.CcU, X.CcJ, int):void");
    }

    public AObserverS66S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
    }
}
