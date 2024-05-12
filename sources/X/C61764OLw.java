package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.model.message.ext.BusinessLinksLiveMessage;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OLw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61764OLw extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public Room LJLJI;
    public A72 LJLJJI;
    public IIconSlot.SlotViewModel LJLJJL;
    public BusinessLinksCardList LJLJJLL;
    public long LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public Integer LJLL = 0;
    public final List<ActiveCard> LJLLI = new ArrayList();

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "business_links";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(20000);
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new C61767OLz(new C61763OLv(this));
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        BusinessLinksLiveMessage businessLinksLiveMessage;
        MutableLiveData<Boolean> mutableLiveData;
        IIconSlot.SlotViewModel slotViewModel;
        MutableLiveData<Boolean> mutableLiveData2;
        IIconSlot.SlotViewModel slotViewModel2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        if ((iMessage instanceof BusinessLinksLiveMessage) && (businessLinksLiveMessage = (BusinessLinksLiveMessage) iMessage) != null) {
            long j = businessLinksLiveMessage.opTime;
            if (j < this.LJLJL) {
                return;
            }
            this.LJLJL = j;
            int i = businessLinksLiveMessage.op;
            if (i == EnumC61766OLy.ADD.getValue()) {
                long j2 = businessLinksLiveMessage.id;
                String str = businessLinksLiveMessage.title;
                o.LJIIIIZZ(str, "cardMessage.title");
                String str2 = businessLinksLiveMessage.subtitle;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = businessLinksLiveMessage.url;
                o.LJIIIIZZ(str3, "cardMessage.url");
                String str4 = businessLinksLiveMessage.pic;
                o.LJIIIIZZ(str4, "cardMessage.pic");
                ListProtector.add(this.LJLLI, 0, new ActiveCard(j2, str, str2, str3, str4, businessLinksLiveMessage.cardType, businessLinksLiveMessage.gameUrl, false));
                IIconSlot.SlotViewModel slotViewModel3 = this.LJLJJL;
                if ((slotViewModel3 != null && (mutableLiveData4 = slotViewModel3.LJLILLLLZI) != null && o.LJ(mutableLiveData4.getValue(), Boolean.TRUE)) || (slotViewModel2 = this.LJLJJL) == null || (mutableLiveData3 = slotViewModel2.LJLILLLLZI) == null) {
                    return;
                }
                mutableLiveData3.setValue(Boolean.TRUE);
                return;
            }
            if (i != EnumC61766OLy.REMOVE.getValue()) {
                return;
            }
            Iterator it = ((ArrayList) this.LJLLI).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (businessLinksLiveMessage.id == ((ActiveCard) next).getId()) {
                    if (next != null) {
                        ((ArrayList) this.LJLLI).remove(next);
                    }
                }
            }
            IIconSlot.SlotViewModel slotViewModel4 = this.LJLJJL;
            if (slotViewModel4 == null || (mutableLiveData = slotViewModel4.LJLILLLLZI) == null || !o.LJ(mutableLiveData.getValue(), Boolean.TRUE) || (slotViewModel = this.LJLJJL) == null || (mutableLiveData2 = slotViewModel.LJLILLLLZI) == null) {
                return;
            }
            mutableLiveData2.setValue(Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        boolean z;
        List<ActiveCard> cardList;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJJI = slotGate;
        this.LJLJJL = viewModel2;
        BusinessLinksCardList businessLinksCardList = this.LJLJJLL;
        if (businessLinksCardList != null && (cardList = businessLinksCardList.getCardList()) != null) {
            z = !cardList.isEmpty();
        } else {
            z = false;
        }
        viewModel2.LJLILLLLZI.setValue(Boolean.valueOf(z));
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.axi));
        viewModel2.LJLJLJ.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.axj));
        viewModel2.LJLLI.setValue(slotGate.getContext().getString(R.string.o0));
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        String str;
        String str2;
        int i;
        BALinkStruct bALinkStruct;
        List<ActiveCard> cardList;
        Object obj;
        BALinkStruct bALinkStruct2;
        String str3;
        o.LJIIIZ(params, "params");
        Object obj2 = params.get("param_room");
        BusinessLinksCardList businessLinksCardList = null;
        if (obj2 instanceof Room) {
            room = (Room) obj2;
        } else {
            room = null;
        }
        this.LJLJI = room;
        Object obj3 = params.get("param_live_enter_from_merge");
        if (obj3 instanceof String) {
            str = (String) obj3;
        } else {
            str = null;
        }
        this.LJLJLJ = str;
        Object obj4 = params.get("param_live_enter_method_merge");
        if (obj4 instanceof String) {
            str2 = (String) obj4;
        } else {
            str2 = null;
        }
        this.LJLJLLL = str2;
        Object obj5 = params.get("param_enter_from_effect_ad_bool");
        if (!(obj5 instanceof Boolean)) {
            obj5 = null;
        }
        boolean z = false;
        if (o.LJ(obj5, Boolean.TRUE)) {
            i = 1;
        } else {
            i = 0;
        }
        this.LJLL = i;
        Room room2 = this.LJLJI;
        if (room2 != null && (bALinkStruct2 = room2.getBALinkStruct()) != null && (str3 = bALinkStruct2.baLinkData) != null) {
            try {
                businessLinksCardList = (BusinessLinksCardList) new Gson().LJI(str3, BusinessLinksCardList.class);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        this.LJLJJLL = businessLinksCardList;
        if (businessLinksCardList != null && (cardList = businessLinksCardList.getCardList()) != null && (obj = ListProtector.get(cardList, 0)) != null) {
            ((ArrayList) this.LJLLI).add(obj);
        }
        Room room3 = this.LJLJI;
        if (room3 != null && (bALinkStruct = room3.getBALinkStruct()) != null && bALinkStruct.baLinkPermission == 1) {
            z = true;
        }
        interfaceC25704A6y.LIZ(z);
    }
}
