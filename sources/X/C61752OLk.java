package X;

import Y.AfS59S0200000_10;
import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.OLk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61752OLk extends AbsSlotWidget<IIconSlot, IIconSlot.SlotViewModel, EnumC30736C4m> {
    public Room LJLJJI;
    public BusinessLinksCardList LJLJJL;
    public AbstractC40333FsH LJLJJLL;
    public A72 LJLJL;
    public IIconSlot.SlotViewModel LJLJLJ;
    public boolean LJLL;
    public boolean LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public C188727au LJLLL;
    public final Keva LJLJI = Keva.getRepo("commercialize_live_business_links_keva_name");
    public final C73318Sq2 LJLJLLL = new C73318Sq2();

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "business_links";
    }

    public final void LJIIIZ() {
        this.LJLLI = true;
        IIconSlot.SlotViewModel slotViewModel = this.LJLJLJ;
        if (slotViewModel != null) {
            C78999UzT.LJFF(AbstractC73672Svk.LJJLIIIJLJLI(1000L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0200000_10(slotViewModel, this, 7), C61757OLp.LJLIL), this.LJLJLLL);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(20000);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return new C61759OLr(new C61754OLm(this));
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        AbstractC40333FsH abstractC40333FsH;
        A72 a72 = this.LJLJL;
        if (a72 != null && (abstractC40333FsH = this.LJLJJLL) != null) {
            ActivityC45651qj context = a72.getContext();
            o.LJIIIIZZ(context, "it.context");
            abstractC40333FsH.LIZ(context);
        }
        this.LJLJLLL.dispose();
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC30736C4m.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJL(String str) {
        Long l;
        String str2;
        C188727au c188727au = new C188727au();
        Room room = this.LJLJJI;
        java.util.Map<String, String> map = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        c188727au.LJIIIZ("anchor_id", String.valueOf(l));
        Room room2 = this.LJLJJI;
        if (room2 != null) {
            str2 = C17280m4.LIZ(room2);
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("room_id", str2);
        c188727au.LJIIIZ("live_status", "during_live");
        c188727au.LJIIIZ("enter_from_merge", this.LJLLILLLL);
        c188727au.LJIIIZ("enter_method", this.LJLLJ);
        this.LJLLL = c188727au;
        if (o.LJ(str, "during_live")) {
            C188727au c188727au2 = this.LJLLL;
            if (c188727au2 != null) {
                c188727au2.LJIIIZ("type", "toolbar");
                map = c188727au2.LIZ;
            }
            FMX.LJIIL("livesdk_add_links_show", map);
            return;
        }
        if (!o.LJ(str, "during_live_dialog_item")) {
            return;
        }
        C188727au c188727au3 = this.LJLLL;
        if (c188727au3 != null) {
            c188727au3.LJIIIZ("type", "subpage");
            map = c188727au3.LIZ;
        }
        FMX.LJIIL("livesdk_add_links_show", map);
    }

    @QD3
    public final void listenToLinksLiveEvent(C59416NTo event) {
        o.LJIIIZ(event, "event");
        BusinessLinksLiveLinkPin businessLinksLiveLinkPin = event.LJLIL;
        if (businessLinksLiveLinkPin != null && o.LJ(businessLinksLiveLinkPin.liveStatus, EnumC61755OLn.DURING_LIVE.getValue())) {
            String str = businessLinksLiveLinkPin.actionType;
            if (o.LJ(str, EnumC61765OLx.CLOSE.getValue())) {
                A72 a72 = this.LJLJL;
                if (a72 != null) {
                    AbstractC40333FsH abstractC40333FsH = this.LJLJJLL;
                    if (abstractC40333FsH != null) {
                        ActivityC45651qj context = a72.getContext();
                        o.LJIIIIZZ(context, "it.context");
                        abstractC40333FsH.LIZ(context);
                    }
                    if (this.LJLL) {
                        LJIIIZ();
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z = true;
            if (o.LJ(str, EnumC61765OLx.COUNT.getValue())) {
                boolean z2 = this.LJLJI.getBoolean("business_links_during_live_tips_has_displayed", false);
                if (businessLinksLiveLinkPin.count <= 0 || z2 || this.LJLLI) {
                    z = false;
                }
                this.LJLL = z;
                return;
            }
            if (!o.LJ(str, EnumC61765OLx.PIN.getValue())) {
                return;
            }
            this.LJLJI.storeBoolean("business_links_during_live_tips_has_displayed", true);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        Integer num;
        List<ActiveCard> cardList;
        List<ActiveCard> cardList2;
        IIconSlot.SlotViewModel viewModel2 = (IIconSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJL = slotGate;
        this.LJLJLJ = viewModel2;
        viewModel2.LJLILLLLZI.setValue(Boolean.TRUE);
        viewModel2.LJLJL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.axl));
        viewModel2.LJLJLJ.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.axm));
        viewModel2.LJLLI.setValue(slotGate.getContext().getString(R.string.o0));
        viewModel2.LJLJLLL.setValue(C04270Et.LIZIZ(slotGate.getContext(), R.drawable.axh));
        viewModel2.LJLLILLLL.setValue(slotGate.getContext().getString(R.string.i3));
        BusinessLinksCardList businessLinksCardList = this.LJLJJL;
        if (businessLinksCardList != null && (cardList2 = businessLinksCardList.getCardList()) != null) {
            num = Integer.valueOf(cardList2.size());
        } else {
            num = null;
        }
        viewModel2.LLFFF = num;
        boolean z = false;
        boolean z2 = this.LJLJI.getBoolean("business_links_during_live_tips_has_displayed", false);
        BusinessLinksCardList businessLinksCardList2 = this.LJLJJL;
        if (businessLinksCardList2 != null && (cardList = businessLinksCardList2.getCardList()) != null) {
            z = !cardList.isEmpty();
        }
        if (!z2 && z && !this.LJLLI) {
            LJIIIZ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == 1) goto L30;
     */
    @Override // X.InterfaceC31710CcU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<java.lang.String, java.lang.Object> r5, X.InterfaceC25704A6y r6) {
        /*
            r4 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "param_room"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof com.bytedance.android.livesdkapi.depend.model.live.Room
            r3 = 0
            if (r0 == 0) goto L43
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r1
        L12:
            r4.LJLJJI = r1
            java.lang.String r0 = "param_live_enter_from_merge"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L41
            java.lang.String r1 = (java.lang.String) r1
        L20:
            r4.LJLLILLLL = r1
            java.lang.String r0 = "param_live_enter_method_merge"
            java.lang.Object r1 = r5.get(r0)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L3f
            java.lang.String r1 = (java.lang.String) r1
        L2e:
            r4.LJLLJ = r1
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LJLJJI
            if (r0 == 0) goto L58
            com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct r0 = r0.getBALinkStruct()
            if (r0 == 0) goto L58
            java.lang.String r2 = r0.baLinkData
            if (r2 == 0) goto L58
            goto L45
        L3f:
            r1 = r3
            goto L2e
        L41:
            r1 = r3
            goto L20
        L43:
            r1 = r3
            goto L12
        L45:
            com.google.gson.Gson r1 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L54
            r1.<init>()     // Catch: java.lang.Exception -> L54
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList> r0 = com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList.class
            java.lang.Object r0 = r1.LJI(r2, r0)     // Catch: java.lang.Exception -> L54
            com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList r0 = (com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList) r0     // Catch: java.lang.Exception -> L54
            r3 = r0
            goto L58
        L54:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L58:
            r4.LJLJJL = r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r4.LJLJJI
            if (r0 == 0) goto L6d
            com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct r0 = r0.getBALinkStruct()
            if (r0 == 0) goto L6d
            int r1 = r0.baLinkPermission
            r0 = 1
            if (r1 != r0) goto L6d
        L69:
            r6.LIZ(r0)
            return
        L6d:
            r0 = 0
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61752OLk.LLJJLIIIJLLLLLLLZ(java.util.Map, X.A6y):void");
    }
}
