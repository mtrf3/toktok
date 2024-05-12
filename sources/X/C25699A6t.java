package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.PaidContentLiveShoppingMessage;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.paidseries.consumer.fragment.PaidSeriesShopPanelFragment;
import com.ss.android.ugc.aweme.paidseries.consumer.model.PaidContentInitData;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A6t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25699A6t extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public A72 LJLJI;
    public IIconSlot.SlotViewModel LJLJJI;
    public Room LJLJJL;
    public TuxSheet LJLJJLL;
    public PaidSeriesShopPanelFragment LJLJL;

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "live_paid_series";
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new C25703A6x(new C25700A6u(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJ(Integer.valueOf(EnumC31509CYf.PAID_CONTENT_LIVE_SHOPPING_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        TuxSheet tuxSheet = this.LJLJJLL;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        boolean z;
        PaidSeriesShopPanelFragment paidSeriesShopPanelFragment;
        if (iMessage instanceof PaidContentLiveShoppingMessage) {
            PaidContentLiveShoppingMessage paidContentLiveShoppingMessage = (PaidContentLiveShoppingMessage) iMessage;
            int i = paidContentLiveShoppingMessage.actionType;
            if (i != 0) {
                if (i != 3 || (paidSeriesShopPanelFragment = this.LJLJL) == null) {
                    return;
                }
                paidSeriesShopPanelFragment.vl().gv0(paidSeriesShopPanelFragment.getRoomId());
                return;
            }
            IIconSlot.SlotViewModel slotViewModel2 = this.LJLJJI;
            if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LJLILLLLZI) != null) {
                if (paidContentLiveShoppingMessage.liveSeriesNumber > 0) {
                    z = true;
                } else {
                    z = false;
                }
                mutableLiveData2.setValue(Boolean.valueOf(z));
            }
            if (A53.LIZ() && (slotViewModel = this.LJLJJI) != null && (mutableLiveData = slotViewModel.LJLJJI) != null) {
                mutableLiveData.setValue(String.valueOf(paidContentLiveShoppingMessage.liveSeriesNumber));
            }
            PaidSeriesShopPanelFragment paidSeriesShopPanelFragment2 = this.LJLJL;
            if (paidSeriesShopPanelFragment2 == null) {
                return;
            }
            paidSeriesShopPanelFragment2.vl().gv0(paidSeriesShopPanelFragment2.getRoomId());
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        Boolean bool;
        boolean z;
        String str;
        PaidContentInfo paidContentInfo;
        String str2;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJI = slotGate;
        this.LJLJJI = viewModel2;
        Room room = this.LJLJJL;
        PaidContentInitData paidContentInitData = null;
        if (room != null && (paidContentInfo = room.paidContentInfo) != null && (str2 = paidContentInfo.paidContentLiveData) != null) {
            paidContentInitData = (PaidContentInitData) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str2, PaidContentInitData.class);
        }
        viewModel2.LJLILLLLZI.setValue(Boolean.TRUE);
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.b3v));
        viewModel2.LJLJLJ.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.b3t));
        viewModel2.LJLLI.setValue(slotGate.getContext().getString(R.string.qhu));
        if (A53.LIZ()) {
            MutableLiveData<String> mutableLiveData = viewModel2.LJLJJI;
            if (paidContentInitData == null || (str = Integer.valueOf(paidContentInitData.numSeries).toString()) == null) {
                str = "";
            }
            mutableLiveData.setValue(str);
        }
        MutableLiveData<Boolean> mutableLiveData2 = viewModel2.LJLILLLLZI;
        if (mutableLiveData2 == null) {
            return;
        }
        if (paidContentInitData != null) {
            if (paidContentInitData.numSeries > 0) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(Boolean.valueOf(z).booleanValue());
        } else {
            bool = Boolean.FALSE;
        }
        mutableLiveData2.setValue(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r1 == true) goto L11;
     */
    @Override // X.InterfaceC31710CcU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<java.lang.String, java.lang.Object> r3, X.InterfaceC25704A6y r4) {
        /*
            r2 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "param_room"
            java.lang.Object r1 = r3.get(r0)
            boolean r0 = r1 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            if (r0 == 0) goto L24
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        L11:
            r2.LJLJJL = r1
            if (r1 == 0) goto L22
            com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo r0 = r1.paidContentInfo
            if (r0 == 0) goto L22
            boolean r1 = r0.paidContentPermission
            r0 = 1
            if (r1 != r0) goto L22
        L1e:
            r4.LIZ(r0)
            return
        L22:
            r0 = 0
            goto L1e
        L24:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25699A6t.LLJJLIIIJLLLLLLLZ(java.util.Map, X.A6y):void");
    }
}
