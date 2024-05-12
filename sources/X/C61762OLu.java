package X;

import Y.IDCallbackS367S0100000_5;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.ext.BusinessLinksLiveMessage;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCardList;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkCard;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksLiveLinkPin;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.CardData;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.OLu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61762OLu extends AbsSlotWidget<IFrameSlot, IFrameSlot.SlotViewModel, EnumC31730Cco> {
    public Room LJLJI;
    public IFrameSlot.SlotViewModel LJLJJI;
    public A72 LJLJJL;
    public BusinessLinksCardList LJLJJLL;
    public ActiveCard LJLJLJ;
    public long LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public final C61172Nzc LJLJL = new C61172Nzc();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 434));
    public Integer LJLLJ = 0;
    public final Handler LJLLL = new Handler(new IDCallbackS367S0100000_5(this, 8));

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "business_links";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(20000);
    }

    public final void LJIIIZ() {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData2;
        IFrameSlot.SlotViewModel slotViewModel2 = this.LJLJJI;
        if (slotViewModel2 != null && (mutableLiveData = slotViewModel2.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE) && (slotViewModel = this.LJLJJI) != null && (mutableLiveData2 = slotViewModel.LJLIL) != null) {
            mutableLiveData2.setValue(new Pair<>(Boolean.FALSE, "business_links"));
        }
        this.LJLLL.removeMessages(0);
    }

    public final boolean LJIIJ() {
        return ((Boolean) this.LJLJLLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        LJIIIZ();
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        return EnumC31730Cco.SLOT_LIVE_BOTTOM_POP;
    }

    public final void LJIIJJI(ActiveCard activeCard) {
        Long l;
        Long l2;
        String str;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        ActivityC45651qj context;
        ActivityC45651qj context2;
        C61172Nzc c61172Nzc = this.LJLJL;
        String LIZ = ((BASchemaConfig.BASchemaConfigData) BASchemaConfig.LIZJ.getValue()).liveLinkPreview.LIZ();
        c61172Nzc.getClass();
        c61172Nzc.LJLIL = LIZ;
        C61172Nzc c61172Nzc2 = this.LJLJL;
        Bundle bundle = new Bundle();
        Room room = this.LJLJI;
        String str2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        bundle.putString("room_id", String.valueOf(l));
        Room room2 = this.LJLJI;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        bundle.putString("anchor_id", String.valueOf(l2));
        bundle.putString("enter_from_merge", this.LJLLI);
        bundle.putString("enter_method", this.LJLLILLLL);
        bundle.putString("title", activeCard.getTitle());
        bundle.putString("subtitle", activeCard.getSubtitle());
        bundle.putString("pic_url", activeCard.getPic());
        A72 a72 = this.LJLJJL;
        if (a72 != null && (context2 = a72.getContext()) != null) {
            str = context2.getString(R.string.qj);
        } else {
            str = null;
        }
        bundle.putString("pin_text", str);
        A72 a722 = this.LJLJJL;
        if (a722 != null && (context = a722.getContext()) != null) {
            str2 = context.getString(R.string.nz);
        }
        bundle.putString("more_text", str2);
        bundle.putString("link_id", String.valueOf(activeCard.getId()));
        c61172Nzc2.LJLILLLLZI = bundle;
        IFrameSlot.SlotViewModel slotViewModel = this.LJLJJI;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null) {
            mutableLiveData.setValue(new Pair<>(Boolean.TRUE, "business_links"));
        }
        this.LJLLL.sendEmptyMessageDelayed(0, 10000L);
    }

    @QD3
    public final void listenToLinksLiveEvent(C59416NTo event) {
        BusinessLinksLiveLinkPin businessLinksLiveLinkPin;
        A72 a72;
        ActivityC45651qj context;
        Long l;
        String str;
        String str2;
        Long l2;
        String str3;
        String str4;
        o.LJIIIZ(event, "event");
        BusinessLinksLiveLinkCard businessLinksLiveLinkCard = event.LJLILLLLZI;
        if (businessLinksLiveLinkCard != null) {
            String str5 = businessLinksLiveLinkCard.actionType;
            if (o.LJ(str5, EnumC61765OLx.CLOSE.getValue())) {
                LJIIIZ();
            } else if (o.LJ(str5, EnumC61765OLx.LEARN_MORE.getValue()) && this.LJLJLJ != null && (a72 = this.LJLJJL) != null && (context = a72.getContext()) != null) {
                ActiveCard activeCard = this.LJLJLJ;
                if (activeCard != null) {
                    if (activeCard.getCardType() == 2 && activeCard.getGameUrl() != null) {
                        String gameUrl = activeCard.getGameUrl();
                        if (gameUrl != null) {
                            SmartRouter.buildRoute(context, gameUrl).open();
                        }
                    } else {
                        Activity LIZJ = KR3.LIZJ(context);
                        if (LIZJ != null || (LIZJ = C84763XOl.LJIIIIZZ()) != null) {
                            Uri.Builder appendQueryParameter = UriProtector.parse("sslocal://webcast_webview").buildUpon().appendQueryParameter("url", activeCard.getUrl()).appendQueryParameter("type", "popup").appendQueryParameter("title", activeCard.getTitle()).appendQueryParameter("height", String.valueOf((int) (C45804HyK.LJJJLIIL(LIZJ, Integer.valueOf(C60605NqT.LJIIJ(C60605NqT.LJI(LIZJ), LIZJ))) * 0.9d))).appendQueryParameter("show_title_bar", "true").appendQueryParameter("show_title_share", "true").appendQueryParameter("show_title_close", "true").appendQueryParameter("title_bar_share_add_report_action", "true");
                            String str6 = "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1";
                            String LIZJ2 = C31461Li.LIZJ("live_links_report_schema", "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1", "getInstance().getStringV…eportSetting::class.java)");
                            if (!TextUtils.isEmpty(LIZJ2)) {
                                str6 = LIZJ2;
                            }
                            Uri.Builder buildUpon = UriProtector.parse(str6).buildUpon();
                            Room room = this.LJLJI;
                            if (room != null) {
                                l2 = Long.valueOf(room.getOwnerUserId());
                            } else {
                                l2 = null;
                            }
                            Uri.Builder appendQueryParameter2 = buildUpon.appendQueryParameter("anchor_id", String.valueOf(l2));
                            Room room2 = this.LJLJI;
                            if (room2 != null) {
                                str3 = C17280m4.LIZ(room2);
                            } else {
                                str3 = null;
                            }
                            Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str3);
                            ActiveCard activeCard2 = this.LJLJLJ;
                            if (activeCard2 != null) {
                                str4 = Long.valueOf(activeCard2.getId()).toString();
                            } else {
                                str4 = null;
                            }
                            String builder = appendQueryParameter3.appendQueryParameter("link_id", str4).appendQueryParameter("enter_from_merge", this.LJLLI).appendQueryParameter("enter_method", this.LJLLILLLL).toString();
                            o.LJIIIIZZ(builder, "uriBuilder.appendQueryPa…)\n            .toString()");
                            String builder2 = UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", builder).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_bdx", "1").appendQueryParameter("trans_status_bar", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("hybrid_sdk_version", "bullet").appendQueryParameter("webview_clear_color", "1").appendQueryParameter("container_bg_color", "00000000").appendQueryParameter("keyboard_adjust", CardStruct.IStatusCode.DEFAULT).toString();
                            o.LJIIIIZZ(builder2, "parse(\"aweme://webview_p…              .toString()");
                            LiveOuterService.LJJJLL().LJJIJIL().LJJJIL(context, appendQueryParameter.appendQueryParameter("report_schema", builder2).appendQueryParameter("gravity", "bottom").build());
                        }
                    }
                }
                if (!LJIIJ()) {
                    C188727au c188727au = new C188727au();
                    Room room3 = this.LJLJI;
                    if (room3 != null) {
                        l = Long.valueOf(room3.getOwnerUserId());
                    } else {
                        l = null;
                    }
                    c188727au.LJIIIZ("anchor_id", String.valueOf(l));
                    Room room4 = this.LJLJI;
                    if (room4 != null) {
                        str = C17280m4.LIZ(room4);
                    } else {
                        str = null;
                    }
                    c188727au.LJIIIZ("room_id", str);
                    ActiveCard activeCard3 = this.LJLJLJ;
                    if (activeCard3 != null) {
                        str2 = Long.valueOf(activeCard3.getId()).toString();
                    } else {
                        str2 = null;
                    }
                    c188727au.LJIIIZ("link_id", str2);
                    c188727au.LJIIIZ("enter_from_merge", this.LJLLI);
                    c188727au.LJIIIZ("enter_method", this.LJLLILLLL);
                    c188727au.LJFF(this.LJLLJ, "is_ad");
                    FMX.LJIIL("livesdk_links_click", c188727au.LIZ);
                }
            }
        }
        if (LJIIJ() && (businessLinksLiveLinkPin = event.LJLIL) != null) {
            String str7 = businessLinksLiveLinkPin.actionType;
            if (o.LJ(str7, EnumC61765OLx.PIN.getValue())) {
                CardData cardData = businessLinksLiveLinkPin.cardData;
                ActiveCard activeCard4 = new ActiveCard(cardData.linkId, cardData.title, cardData.subtitle, cardData.linkUrl, cardData.picUrl, cardData.cardType, cardData.gameUrl, true);
                this.LJLJLJ = activeCard4;
                LJIIJJI(activeCard4);
                return;
            }
            if (!o.LJ(str7, EnumC61765OLx.UNPIN.getValue()) && !o.LJ(str7, EnumC61765OLx.REMOVE_CARD.getValue())) {
                return;
            }
            this.LJLJLJ = null;
            LJIIIZ();
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof BusinessLinksLiveMessage) || LJIIJ()) {
            return;
        }
        BusinessLinksLiveMessage businessLinksLiveMessage = (BusinessLinksLiveMessage) iMessage;
        long j = businessLinksLiveMessage.opTime;
        if (j < this.LJLL) {
            return;
        }
        this.LJLL = j;
        int i = businessLinksLiveMessage.op;
        if (i == EnumC61766OLy.PIN.getValue()) {
            long j2 = businessLinksLiveMessage.id;
            String str = businessLinksLiveMessage.title;
            o.LJIIIIZZ(str, "message.title");
            String str2 = businessLinksLiveMessage.subtitle;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = businessLinksLiveMessage.url;
            o.LJIIIIZZ(str3, "message.url");
            String str4 = businessLinksLiveMessage.pic;
            o.LJIIIIZZ(str4, "message.pic");
            ActiveCard activeCard = new ActiveCard(j2, str, str2, str3, str4, businessLinksLiveMessage.cardType, businessLinksLiveMessage.gameUrl, true);
            this.LJLJLJ = activeCard;
            LJIIJJI(activeCard);
            return;
        }
        if (i != EnumC61766OLy.UNPIN.getValue()) {
            return;
        }
        this.LJLJLJ = null;
        LJIIIZ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void LLJJJJ(ViewModel viewModel, A72 slotGate) {
        ActiveCard activeCard;
        List<ActiveCard> cardList;
        ActiveCard activeCard2;
        IFrameSlot.SlotViewModel viewModel2 = (IFrameSlot.SlotViewModel) viewModel;
        o.LJIIIZ(viewModel2, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        this.LJLIL = viewModel2;
        this.LJLILLLLZI = slotGate;
        this.LJLJJI = viewModel2;
        this.LJLJJL = slotGate;
        if (!LJIIJ()) {
            BusinessLinksCardList businessLinksCardList = this.LJLJJLL;
            if (businessLinksCardList != null && (cardList = businessLinksCardList.getCardList()) != null) {
                Iterator<ActiveCard> it = cardList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        activeCard2 = it.next();
                        if (activeCard2.isPinned()) {
                            break;
                        }
                    } else {
                        activeCard2 = null;
                        break;
                    }
                }
                activeCard = activeCard2;
            } else {
                activeCard = null;
            }
            this.LJLJLJ = activeCard;
            if (activeCard != null) {
                LJIIJJI(activeCard);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            LJIIIZ();
        }
    }

    @Override // X.InterfaceC31710CcU
    public final void LLJJLIIIJLLLLLLLZ(java.util.Map<String, Object> params, InterfaceC25704A6y interfaceC25704A6y) {
        Room room;
        String str;
        String str2;
        int i;
        BALinkStruct bALinkStruct;
        BALinkStruct bALinkStruct2;
        String str3;
        o.LJIIIZ(params, "params");
        Object obj = params.get("param_room");
        BusinessLinksCardList businessLinksCardList = null;
        if (obj instanceof Room) {
            room = (Room) obj;
        } else {
            room = null;
        }
        this.LJLJI = room;
        Object obj2 = params.get("param_live_enter_from_merge");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        this.LJLLI = str;
        Object obj3 = params.get("param_live_enter_method_merge");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        } else {
            str2 = null;
        }
        this.LJLLILLLL = str2;
        Object obj4 = params.get("param_enter_from_effect_ad_bool");
        if (!(obj4 instanceof Boolean)) {
            obj4 = null;
        }
        boolean z = false;
        if (o.LJ(obj4, Boolean.TRUE)) {
            i = 1;
        } else {
            i = 0;
        }
        this.LJLLJ = i;
        Room room2 = this.LJLJI;
        if (room2 != null && (bALinkStruct2 = room2.getBALinkStruct()) != null && (str3 = bALinkStruct2.baLinkData) != null) {
            try {
                businessLinksCardList = (BusinessLinksCardList) new Gson().LJI(str3, BusinessLinksCardList.class);
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        this.LJLJJLL = businessLinksCardList;
        Room room3 = this.LJLJI;
        if (room3 != null && (bALinkStruct = room3.getBALinkStruct()) != null && bALinkStruct.baLinkPermission == 1) {
            z = true;
        }
        interfaceC25704A6y.LIZ(z);
    }
}
