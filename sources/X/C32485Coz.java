package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftBoxInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.widgets.giftwidget.presenter.FEGiftSendPresenter$registerObserver$3$1", f = "FEGiftSendPresenter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Coz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32485Coz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C32172Cjw LJLIL;
    public final /* synthetic */ C32488Cp2 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32485Coz(C32172Cjw c32172Cjw, C32488Cp2 c32488Cp2, InterfaceC67352kd<? super C32485Coz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c32172Cjw;
        this.LJLILLLLZI = c32488Cp2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32485Coz(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Gift gift;
        Long l;
        String str;
        String str2;
        String str3;
        long j;
        Object obj2;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Integer num;
        String str4;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        User owner;
        Long l6;
        Long l7;
        Long l8;
        InterfaceC29405BgP LIZIZ2;
        InterfaceC05190Ih interfaceC05190Ih2;
        User owner2;
        Room room;
        Room room2;
        GiftBoxInfo giftBoxInfo;
        GiftBoxInfo giftBoxInfo2;
        C141335gf.LIZJ(obj);
        C32172Cjw c32172Cjw = this.LJLIL;
        C32488Cp2 c32488Cp2 = this.LJLILLLLZI;
        Gift gift2 = c32488Cp2.LIZ;
        List<Gift> list = c32488Cp2.LIZIZ;
        C32492Cp6 c32492Cp6 = c32488Cp2.LIZJ;
        List<GiftPage> list2 = c32488Cp2.LIZLLL;
        EnumC32491Cp5 enumC32491Cp5 = c32488Cp2.LJ;
        c32172Cjw.getClass();
        if (c32492Cp6 != null) {
            gift = c32492Cp6.LJLIL;
        } else {
            gift = null;
        }
        if (c32492Cp6 != null) {
            l = Long.valueOf(c32492Cp6.LJLILLLLZI);
        } else {
            l = null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<GiftPage> it = list2.iterator();
        while (it.hasNext()) {
            List<Gift> list3 = it.next().gifts;
            o.LJIIIIZZ(list3, "it.gifts");
            ORS.LJJLIIIJILLIZJL(list3, arrayList);
        }
        if (gift2 != null && (giftBoxInfo2 = gift2.giftBoxInfo) != null) {
            str = giftBoxInfo2.schemeUrl;
        } else {
            str = null;
        }
        if (C29306Beo.LJIJJLI(str)) {
            if (gift2 != null && (giftBoxInfo = gift2.giftBoxInfo) != null) {
                str3 = giftBoxInfo.schemeUrl;
            }
            str3 = null;
        } else {
            C32496CpA bannerBoxInfo = GiftManager.inst().getBannerBoxInfo();
            if (bannerBoxInfo != null) {
                str2 = bannerBoxInfo.LIZJ;
            } else {
                str2 = null;
            }
            if (C29306Beo.LJIJJLI(str2)) {
                C32496CpA bannerBoxInfo2 = GiftManager.inst().getBannerBoxInfo();
                if (bannerBoxInfo2 != null) {
                    str3 = bannerBoxInfo2.LIZJ;
                }
                str3 = null;
            } else {
                if (list != null) {
                    Iterator<Gift> it2 = list.iterator();
                    while (it2.hasNext()) {
                        GiftBoxInfo giftBoxInfo3 = it2.next().giftBoxInfo;
                        if (giftBoxInfo3 != null && (str3 = giftBoxInfo3.schemeUrl) != null) {
                            break;
                        }
                    }
                }
                str3 = null;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lynxUrl found: ");
        LIZ.append(str3);
        C0NB.LJ("FEGiftSendPresenter", X1D.LIZIZ(LIZ));
        if (str3 == null || str3.length() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("giftBox or url is null when open gift box page ");
            LIZ2.append(list);
            C0NB.LJ("FEGiftSendPresenter", X1D.LIZIZ(LIZ2));
        } else {
            DataChannel dataChannel = c32172Cjw.LIZJ;
            if (dataChannel != null && (room2 = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
                j = room2.getOwnerUserId();
            } else {
                j = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (C32483Cox.LIZ((Gift) next, j)) {
                    arrayList2.add(next);
                }
            }
            List LLJILJILJ = ORZ.LLJILJILJ(arrayList2);
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LLJILJILJ, 10));
            ArrayList arrayList4 = (ArrayList) LLJILJILJ;
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList3.add(Long.valueOf(((Gift) it4.next()).id));
            }
            if (list != null) {
                ArrayList arrayList5 = new ArrayList();
                for (Gift gift3 : list) {
                    if (!arrayList3.contains(Long.valueOf(gift3.id))) {
                        arrayList5.add(gift3);
                    }
                }
                arrayList4.addAll(arrayList5);
            }
            String label = enumC32491Cp5.getLabel();
            C32128CjE c32128CjE = C32129CjF.LIZ;
            if (c32128CjE.LJJIFFI && !C38354F3m.LJ(c32128CjE.LJ)) {
                label = c32128CjE.LJ;
                c32128CjE.LJJIFFI = false;
            }
            IInteractService iInteractService = C31120CJg.LIZ;
            String h00 = iInteractService.h00();
            User user = c32128CjE.LIZJ;
            if (user == null) {
                DataChannel dataChannel2 = c32172Cjw.LIZJ;
                if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                    user = room.getOwner();
                } else {
                    user = null;
                }
            }
            if (str3 != null) {
                C29682Bks LIZ3 = C29683Bkt.LIZ(str3);
                LIZ3.LJIIIZ("bottom");
                LIZ3.LJJI("enter_from", label);
                LIZ3.LJJI("enter_time", String.valueOf(System.currentTimeMillis()));
                String str5 = "";
                if (h00 == null) {
                    h00 = "";
                }
                LIZ3.LJJI("send_gift_scene", h00);
                if (!C38354F3m.LJ(BJM.LJII())) {
                    String LJII = BJM.LJII();
                    if (LJII != null) {
                        str5 = LJII;
                    }
                    LIZ3.LJJI("enter_url_source", str5);
                }
                LIZ3.LJIJJ("bottom");
                String uri = LIZ3.LIZ().toString();
                o.LJIIIIZZ(uri, "builder.build().toString()");
                ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(c32172Cjw.LIZ, uri, new C32486Cp0(str3, gift, l, LLJILJILJ, user, c32172Cjw));
                if (enumC32491Cp5 != EnumC32491Cp5.RETRY) {
                    String LJFF = BJM.LJFF();
                    String LJIIIIZZ = BJM.LJIIIIZZ();
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                    Room room3 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                    String valueOf = String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
                    java.util.Map map = (java.util.Map) dataChannelGlobal.mv0(C29824BnA.class);
                    if (map != null) {
                        obj2 = map.get("anchor_id");
                    } else {
                        obj2 = null;
                    }
                    boolean LJ = o.LJ(valueOf, obj2);
                    String str6 = "anchor";
                    if (enumC32491Cp5 == EnumC32491Cp5.GIFT) {
                        BZI LIZIZ3 = C0JU.LIZIZ("livesdk_gift_box_giftpanel_entry_click", LJFF, "enter_from_merge", LJIIIIZZ, "enter_method");
                        if (room3 != null) {
                            l6 = Long.valueOf(room3.getId());
                        } else {
                            l6 = null;
                        }
                        LIZIZ3.LJIJJ(l6, "room_id");
                        if (room3 != null && (owner2 = room3.getOwner()) != null) {
                            l7 = Long.valueOf(owner2.getId());
                        } else {
                            l7 = null;
                        }
                        LIZIZ3.LJIJJ(String.valueOf(l7), "anchor_id");
                        B83 LIZ4 = B83.LIZ();
                        if (LIZ4 != null && (LIZIZ2 = LIZ4.LIZIZ()) != null && (interfaceC05190Ih2 = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
                            l8 = Long.valueOf(interfaceC05190Ih2.getId());
                        } else {
                            l8 = null;
                        }
                        LIZIZ3.LJIJJ(l8, "user_id");
                        if (!LJ) {
                            str6 = "user";
                        }
                        LIZIZ3.LJIJJ(str6, "user_type");
                        LIZIZ3.LJIJJ(iInteractService.h00(), "send_gift_scene");
                        LIZIZ3.LJJIIJZLJL();
                    } else {
                        EnumC32491Cp5 enumC32491Cp52 = EnumC32491Cp5.BANNER_FIRST_TIME_GIFT_BOX;
                        if (enumC32491Cp5 == enumC32491Cp52 || enumC32491Cp5 == EnumC32491Cp5.BANNER) {
                            BZI LIZIZ4 = C0JU.LIZIZ("livesdk_gift_giftbox_top_entry_click", LJFF, "enter_from_merge", LJIIIIZZ, "enter_method");
                            if (room3 != null) {
                                l2 = Long.valueOf(room3.getId());
                            } else {
                                l2 = null;
                            }
                            LIZIZ4.LJIJJ(l2, "room_id");
                            if (room3 != null && (owner = room3.getOwner()) != null) {
                                l3 = Long.valueOf(owner.getId());
                            } else {
                                l3 = null;
                            }
                            LIZIZ4.LJIJJ(String.valueOf(l3), "anchor_id");
                            B83 LIZ5 = B83.LIZ();
                            if (LIZ5 != null && (LIZIZ = LIZ5.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                                l4 = Long.valueOf(interfaceC05190Ih.getId());
                            } else {
                                l4 = null;
                            }
                            LIZIZ4.LJIJJ(l4, "user_id");
                            if (gift != null) {
                                l5 = Long.valueOf(gift.id);
                            } else {
                                l5 = null;
                            }
                            LIZIZ4.LJIJJ(l5, "gift_id");
                            if (gift != null) {
                                num = Integer.valueOf(gift.diamondCount);
                            } else {
                                num = null;
                            }
                            LIZIZ4.LJIJJ(num, "gift_price");
                            if (enumC32491Cp5 == enumC32491Cp52) {
                                str4 = "top_entry_guide";
                            } else {
                                str4 = "top_entry";
                            }
                            LIZIZ4.LJIJJ(str4, "click_from");
                            if (!LJ) {
                                str6 = "user";
                            }
                            LIZIZ4.LJIJJ(str6, "user_type");
                            LIZIZ4.LJIJJ(iInteractService.h00(), "send_gift_scene");
                            LIZIZ4.LJJIIJZLJL();
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
