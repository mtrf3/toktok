package X;

import Y.AfS3S0100100_4;
import Y.AfS56S0100000_4;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.PaidContentLiveShoppingMessage;
import com.bytedance.android.livesdk.model.message.PopSeries;
import com.bytedance.android.livesdkapi.depend.model.live.PaidContentInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.service.PaidSeriesLiveApiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A6j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25689A6j extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> {
    public final boolean LJLJI;
    public Room LJLJJLL;
    public A69 LJLJL;
    public IFrameSlot.SlotViewModel LJLJLLL;
    public A72 LJLL;
    public CollectionDetailModel LJLLI;
    public boolean LJLLILLLL;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(A68.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C25690A6k.LJLIL);
    public final C73318Sq2 LJLJLJ = new C73318Sq2();

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "live_paid_series";
    }

    public final A69 LJIIIZ() {
        Long l;
        A69 a69 = this.LJLJL;
        if (a69 == null) {
            A6A a6a = new A6A(this);
            Room room = this.LJLJJLL;
            if (room != null) {
                l = Long.valueOf(room.getId());
            } else {
                l = null;
            }
            a69 = new A69(a6a, l);
            this.LJLJL = a69;
        }
        return a69;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJ(Integer.valueOf(EnumC31509CYf.PAID_CONTENT_LIVE_SHOPPING_MESSAGE.getIntType()));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        this.LJLJLJ.dispose();
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return LJIIIZ();
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
    }

    public C25689A6j(boolean z) {
        this.LJLJI = z;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof PaidContentLiveShoppingMessage) {
            PaidContentLiveShoppingMessage paidContentLiveShoppingMessage = (PaidContentLiveShoppingMessage) iMessage;
            int i = paidContentLiveShoppingMessage.actionType;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C2U8.LIZ(new C61272ap(false));
                LJIIJ(this.LJLLI, false);
                return;
            }
            C2U8.LIZ(new C61272ap(true));
            PopSeries popSeries = paidContentLiveShoppingMessage.popSeries;
            if (popSeries == null) {
                return;
            }
            long j = popSeries.collectionId;
            Room room = this.LJLJJLL;
            if (room == null) {
                return;
            }
            long id = room.getId();
            C78999UzT.LJFF(((PaidSeriesLiveApiService) this.LJLJJI.getValue()).LIZLLL().popSeries(id, j).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIILIIL(new AfS3S0100100_4(id, this, 7)).LJIILL(C78855Ux9.LJLL).LJJII(new AfS56S0100000_4(this, 112), new InterfaceC64592gB() { // from class: X.9FP
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }), this.LJLJLJ);
        }
    }

    public final void LJIIJ(CollectionDetailModel collectionDetailModel, boolean z) {
        Long l;
        Long l2;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        String str;
        Room room;
        User collectionCreator;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        CollectionDetailModel collectionDetailModel2 = this.LJLLI;
        String str2 = null;
        if (collectionDetailModel2 != null) {
            l = Long.valueOf(collectionDetailModel2.getCollectionId());
        } else {
            l = null;
        }
        if (collectionDetailModel != null) {
            l2 = Long.valueOf(collectionDetailModel.getCollectionId());
        } else {
            l2 = null;
        }
        if (o.LJ(l, l2) && (slotViewModel = this.LJLJLLL) != null && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
            IFrameSlot.SlotViewModel slotViewModel2 = this.LJLJLLL;
            if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LJLIL) != null) {
                mutableLiveData2.postValue(new Pair<>(Boolean.FALSE, "live_paid_series"));
            }
            this.LJLLILLLL = false;
            if (!this.LJLJI) {
                if (collectionDetailModel != null && (collectionCreator = collectionDetailModel.getCollectionCreator()) != null) {
                    str2 = collectionCreator.getUid();
                } else if (collectionDetailModel == null) {
                    str = null;
                    room = this.LJLJJLL;
                    if (room != null || (r0 = C17280m4.LIZ(room)) == null) {
                        String str3 = "";
                    }
                    A4N.LIZJ(z ? 1 : 0, str2, str, str3);
                }
                str = Long.valueOf(collectionDetailModel.getCollectionId()).toString();
                room = this.LJLJJLL;
                if (room != null) {
                }
                String str32 = "";
                A4N.LIZJ(z ? 1 : 0, str2, str, str32);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    /* renamed from: LJIIJJI, reason: merged with bridge method [inline-methods] */
    public final void LLJJJJ(IFrameSlot.SlotViewModel viewModel, A72 slotGate) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = slotGate;
        this.LJLJLLL = viewModel;
        this.LJLL = slotGate;
        viewModel.LJLIL.setValue(new Pair<>(Boolean.FALSE, "live_paid_series"));
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        Room room2;
        PaidContentInfo paidContentInfo;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LJLJJLL = room;
        boolean z = false;
        if (A53.LIZ() && (room2 = this.LJLJJLL) != null && (paidContentInfo = room2.paidContentInfo) != null && paidContentInfo.paidContentPermission) {
            z = true;
        }
        interfaceC25704A6y.LIZ(z);
    }
}
