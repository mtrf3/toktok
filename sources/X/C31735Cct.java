package X;

import Y.AObserverS58S0101000_2;
import Y.AObserverS73S0100000_5;
import Y.IDComparatorS33S0000000_5;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetDialog;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: X.Cct, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31735Cct extends AbstractC31716Cca<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public IIconSlot.SlotViewModel LJLJI;
    public A72 LJLJJI;
    public Drawable LJLJJL;
    public C1Q4 LJLJJLL;
    public boolean LJLJL;
    public final EnumC30736C4m LJLJLJ;
    public InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> LJLJLLL;
    public final C31738Ccw LJLL;
    public final C31737Ccv LJLIL = new C31737Ccv();
    public final C31739Ccx LJLILLLLZI = new C31739Ccx(this);
    public final HashMap<InterfaceC31710CcU, IIconSlot.SlotViewModel> LJLLI = new HashMap<>();

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "LIVE_SDK_GroupBusiness";
    }

    @Override // X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return null;
    }

    @Override // X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
    }

    @Override // X.InterfaceC31710CcU
    public final void onDispose() {
    }

    @Override // X.AbstractC31716Cca, X.InterfaceC31715CcZ, X.InterfaceC31710CcU
    public void onEvent(Boolean bool) {
    }

    @Override // X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
    }

    @Override // X.InterfaceC31710CcU
    public final void onPause() {
    }

    @Override // X.InterfaceC31710CcU
    public final void onResume() {
    }

    @Override // X.InterfaceC31710CcU
    public final void onStart() {
    }

    @Override // X.InterfaceC31710CcU
    public final void onStop() {
    }

    public final void LIZLLL() {
        if (this.LJLLI.size() == 0) {
            LIZJ(false);
            A72 a72 = this.LJLJJI;
            if (a72 != null) {
                a72.LIZ(this, this.LJLJI);
                return;
            }
            return;
        }
        if (this.LJLLI.size() == 1) {
            Map.Entry<InterfaceC31710CcU, IIconSlot.SlotViewModel> next = this.LJLLI.entrySet().iterator().next();
            A72 a722 = this.LJLJJI;
            if (a722 == null) {
                return;
            }
            a722.LIZ(next.getKey(), next.getValue());
            return;
        }
        LIZJ(true);
        A72 a723 = this.LJLJJI;
        if (a723 == null) {
            return;
        }
        a723.LIZ(this, this.LJLJI);
    }

    @Override // X.InterfaceC31710CcU
    public final void onDestroy() {
        C31739Ccx c31739Ccx = this.LJLILLLLZI;
        SlotsBottomSheetDialog slotsBottomSheetDialog = c31739Ccx.LIZ;
        if (slotsBottomSheetDialog == null || !slotsBottomSheetDialog.isShowing()) {
            return;
        }
        c31739Ccx.LIZ.dismissAllowingStateLoss();
    }

    @Override // X.InterfaceC31710CcU
    public final /* bridge */ /* synthetic */ Object LLJJJIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    public C31735Cct(EnumC30736C4m enumC30736C4m) {
        this.LJLJLJ = enumC30736C4m;
        this.LJLL = new C31738Ccw(enumC30736C4m);
    }

    public final void LIZJ(boolean z) {
        String string;
        int LJFF;
        C1Q4 LIZLLL;
        Drawable LIZIZ;
        IIconSlot.SlotViewModel slotViewModel = this.LJLJI;
        if (slotViewModel == null) {
            return;
        }
        Boolean value = slotViewModel.LJLILLLLZI.getValue();
        if (value == null || z != value.booleanValue()) {
            this.LJLJI.LJLILLLLZI.setValue(Boolean.valueOf(z));
        }
        if (this.LJLJJL == null) {
            EnumC30736C4m enumC30736C4m = this.LJLJLJ;
            if (enumC30736C4m == EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
                LIZIZ = C04270Et.LIZIZ(this.LJLJJI.getContext(), R.drawable.cot);
            } else if (enumC30736C4m == EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR) {
                LIZIZ = C259910h.LIZLLL(R.attr.avi, this.LJLJJI.getContext());
            } else if (enumC30736C4m == EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR) {
                LIZIZ = C259910h.LIZLLL(R.attr.avi, this.LJLJJI.getContext());
            } else {
                LIZIZ = C04270Et.LIZIZ(this.LJLJJI.getContext(), R.drawable.cot);
            }
            this.LJLJJL = LIZIZ;
        }
        this.LJLJI.LJLJL.setValue(this.LJLJJL);
        String str = null;
        if (this.LJLJJLL == null) {
            EnumC30736C4m enumC30736C4m2 = this.LJLJLJ;
            if (enumC30736C4m2 != EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
                if (enumC30736C4m2 == EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR) {
                    LIZLLL = C259910h.LIZLLL(R.attr.avi, this.LJLJJI.getContext());
                } else if (enumC30736C4m2 == EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR) {
                    LIZLLL = C259910h.LIZLLL(R.attr.avi, this.LJLJJI.getContext());
                }
                this.LJLJJLL = LIZLLL;
            }
            LIZLLL = null;
            this.LJLJJLL = LIZLLL;
        }
        C1Q4 c1q4 = this.LJLJJLL;
        if (c1q4 != null) {
            this.LJLJI.LJLJLJ.setValue(c1q4);
        }
        MutableLiveData<String> mutableLiveData = this.LJLJI.LJLLI;
        ActivityC45651qj context = this.LJLJJI.getContext();
        EnumC30736C4m enumC30736C4m3 = this.LJLJLJ;
        if (enumC30736C4m3 == EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR) {
            string = context.getString(R.string.im);
        } else if (enumC30736C4m3 == EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR) {
            string = context.getString(R.string.im);
        } else if (enumC30736C4m3 == EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR) {
            string = context.getString(R.string.im);
        } else {
            string = context.getString(R.string.im);
        }
        mutableLiveData.setValue(string);
        C31737Ccv c31737Ccv = this.LJLIL;
        if (c31737Ccv != null) {
            Iterator it = ((ArrayList) c31737Ccv.LIZ).iterator();
            int i = Integer.MAX_VALUE;
            while (it.hasNext()) {
                InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) it.next();
                IIconSlot.SlotViewModel slotViewModel2 = (IIconSlot.SlotViewModel) ((HashMap) this.LJLIL.LIZIZ).get(interfaceC31710CcU);
                if (slotViewModel2.LJLJJI.getValue() != null) {
                    this.LJLJI.LJLJJI.setValue(slotViewModel2.LJLJJI.getValue());
                }
                slotViewModel2.LJLJJI.observe(this.LJLJJI.getContext(), new AObserverS73S0100000_5(this, 34));
                int LIZIZ2 = C31267COx.LIZIZ(interfaceC31710CcU.LIZ());
                if (slotViewModel2.LL != 0 && !V0N.LJJII(slotViewModel2.LJLLJ.getValue()) && LIZIZ2 < i) {
                    this.LJLJI.LL = slotViewModel2.LL;
                    str = slotViewModel2.LJLLJ.getValue();
                    i = LIZIZ2;
                }
            }
            if (str != null) {
                this.LJLJI.LJLLJ.postValue(str);
            }
            if (this.LJLJI.LJLJJI.getValue() == null && this.LJLJLJ == EnumC30736C4m.SLOT_BROADCAST_PREVIEW_TOOLBAR && (LJFF = C29889BoD.LIZIZ(this.LJLJJI.getContext()).LJFF("ttlive_broadcast_preview_business_icon_guide_count", 0)) < 5) {
                this.LJLJI.LJLJJL.postValue(Boolean.TRUE);
                this.LJLJL = true;
                C29889BoD LIZIZ3 = C29889BoD.LIZIZ(this.LJLJJI.getContext());
                LIZIZ3.LJII(Integer.valueOf(LJFF + 1), "ttlive_broadcast_preview_business_icon_guide_count");
                LIZIZ3.LIZ();
            }
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("anchor_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        c188727au.LJIIIZ("room_id", this.LJLL.LIZ());
        c188727au.LJIIIZ("live_status", this.LJLL.LIZLLL);
        c188727au.LJIIIZ("enter_from_merge", this.LJLL.LIZ);
        c188727au.LJIIIZ("enter_method", this.LJLL.LIZIZ);
        FMX.LJIIL("livesdk_business_icon_show_notify", c188727au.LIZ);
        C188727au c188727au2 = new C188727au();
        c188727au2.LJIIIZ("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
        c188727au2.LJIIIZ("room_id", this.LJLL.LIZ());
        c188727au2.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c188727au2.LJIIIZ("live_status", this.LJLL.LIZLLL);
        FMX.LJIIL("livesdk_tiktokec_business_icon_show", c188727au2.LIZ);
        for (InterfaceC31710CcU interfaceC31710CcU : this.LJLLI.keySet()) {
            if (interfaceC31710CcU instanceof AbsSlotWidget) {
                ((AbsSlotWidget) interfaceC31710CcU).onAggregateExposure(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJ(C31735Cct c31735Cct, Boolean bool) {
        if (bool != null) {
            if (c31735Cct.LJLLI == null) {
                return;
            }
            for (Map.Entry entry : ((HashMap) c31735Cct.LJLIL.LIZIZ).entrySet()) {
                IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) entry.getValue();
                if (Boolean.TRUE.equals(slotViewModel.LLIFFJFJJ)) {
                    slotViewModel.LJLILLLLZI.setValue(bool);
                    if (bool.booleanValue()) {
                        c31735Cct.LJLLI.put(entry.getKey(), slotViewModel);
                    } else {
                        c31735Cct.LJLLI.remove(entry.getKey());
                    }
                    c31735Cct.LIZLLL();
                }
            }
            return;
        }
        c31735Cct.getClass();
    }

    @Override // X.InterfaceC31715CcZ
    public final void LIZIZ(InterfaceC31710CcU interfaceC31710CcU, IIconSlot.SlotViewModel slotViewModel) {
        C31737Ccv c31737Ccv = this.LJLIL;
        synchronized (c31737Ccv) {
            Integer valueOf = Integer.valueOf(C31267COx.LIZIZ(interfaceC31710CcU.LIZ()));
            int size = ((ArrayList) c31737Ccv.LIZ).size();
            int i = 0;
            while (true) {
                if (i >= ((ArrayList) c31737Ccv.LIZ).size()) {
                    break;
                }
                if (valueOf.intValue() >= Integer.valueOf(C31267COx.LIZIZ(((InterfaceC31710CcU) ListProtector.get(c31737Ccv.LIZ, i)).LIZ())).intValue()) {
                    i++;
                } else {
                    size = i;
                    break;
                }
            }
            ListProtector.add(c31737Ccv.LIZ, size, interfaceC31710CcU);
            ((HashMap) c31737Ccv.LIZIZ).put(interfaceC31710CcU, slotViewModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 a72) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) viewModel;
        IIconSlot.SlotViewModel slotViewModel2 = this.LJLJI;
        this.LJLJI = slotViewModel;
        this.LJLJJI = a72;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(3, new IDComparatorS33S0000000_5(13));
        for (Map.Entry entry : ((HashMap) this.LJLIL.LIZIZ).entrySet()) {
            if (((IIconSlot.SlotViewModel) entry.getValue()).LLFFF != null && ((IIconSlot.SlotViewModel) entry.getValue()).LLFFF.intValue() != 0) {
                priorityBlockingQueue.add(new C31723Cch((InterfaceC31710CcU) entry.getKey(), C31267COx.LIZJ(this.LJLJLJ, ((InterfaceC31710CcU) entry.getKey()).LIZ())));
            }
        }
        boolean z = false;
        if (priorityBlockingQueue.size() > 0) {
            InterfaceC31710CcU<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> interfaceC31710CcU = ((C31723Cch) priorityBlockingQueue.peek()).LIZIZ;
            if (this.LJLJLLL != interfaceC31710CcU) {
                A72 a722 = this.LJLJJI;
                if (a722 != null) {
                    a722.LIZ(interfaceC31710CcU, (IIconSlot.SlotViewModel) ((HashMap) this.LJLIL.LIZIZ).get(interfaceC31710CcU));
                }
                this.LJLJLLL = interfaceC31710CcU;
                return;
            }
            return;
        }
        if (slotViewModel2 == slotViewModel) {
            return;
        }
        for (Map.Entry entry2 : ((HashMap) this.LJLIL.LIZIZ).entrySet()) {
            IIconSlot.SlotViewModel slotViewModel3 = (IIconSlot.SlotViewModel) entry2.getValue();
            if (Boolean.TRUE.equals(slotViewModel3.LJLILLLLZI.getValue())) {
                this.LJLLI.put(entry2.getKey(), slotViewModel3);
            }
        }
        LIZLLL();
        slotViewModel.LJZI.observe(this.LJLJJI.getContext(), new AObserverS58S0101000_2(3, this, 5));
        Iterator it = ((HashMap) this.LJLIL.LIZIZ).entrySet().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            IIconSlot.SlotViewModel slotViewModel4 = (IIconSlot.SlotViewModel) ((Map.Entry) it.next()).getValue();
            if (Boolean.TRUE.equals(slotViewModel4.LLIFFJFJJ)) {
                z = true;
            } else {
                z2 = true;
            }
            slotViewModel4.LJZI.observe(this.LJLJJI.getContext(), new AObserverS58S0101000_2(1, this, 16));
            if (z && z2) {
                return;
            }
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> map, InterfaceC25704A6y interfaceC25704A6y) {
        this.LJLL.LIZ = (String) map.get("param_live_enter_from_merge");
        this.LJLL.LIZIZ = (String) map.get("param_live_enter_method_merge");
        this.LJLL.LIZJ = (Room) map.get("param_room");
        interfaceC25704A6y.LIZ(true);
    }
}
