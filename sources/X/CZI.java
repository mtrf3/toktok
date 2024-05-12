package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.ExclusiveGiftUnlockEvent;
import com.bytedance.android.livesdk.ExclusiveShowRedDotEvent;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.GiftUnlockExperiment;
import com.bytedance.android.livesdk.livesetting.gift.LiveGuideWattingDurationSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.message.GiftUnlockMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZI implements OnMessageListener {
    public long LJLIL;
    public DataChannel LJLILLLLZI;
    public IMessageManager LJLJI;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Object obj;
        Long l;
        ImageModel imageModel;
        long j;
        Boolean bool;
        Room room;
        long j2;
        boolean z;
        Boolean bool2;
        Room room2;
        Object obj2;
        Long l2;
        ImageModel imageModel2;
        Integer num;
        GiftLockInfo giftLockInfo;
        if (iMessage instanceof GiftUnlockMessage) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            GiftUnlockMessage giftUnlockMessage = (GiftUnlockMessage) iMessage;
            for (Gift gift : giftUnlockMessage.gifts) {
                if (gift != null && (giftLockInfo = gift.giftSubInfo) != null) {
                    num = Integer.valueOf(giftLockInfo.mLockType);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (num.intValue() == 2) {
                        o.LJIIIIZZ(gift, "gift");
                        arrayList.add(gift);
                    } else if (num.intValue() == 3) {
                        o.LJIIIIZZ(gift, "gift");
                        arrayList2.add(gift);
                    } else if (num.intValue() == 4) {
                        o.LJIIIIZZ(gift, "gift");
                        arrayList3.add(gift);
                    }
                }
            }
            boolean z2 = false;
            if (arrayList.size() != 0) {
                java.util.Map<Integer, java.util.Set<Long>> map = GiftManager.inst().lockedGiftsMap;
                o.LJIIIIZZ(map, "inst().lockedGiftsMap");
                ArrayList arrayList4 = new ArrayList();
                Iterator<Map.Entry<Integer, java.util.Set<Long>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Set<Long> value = it.next().getValue();
                    o.LJIIIIZZ(value, "it.value");
                    ORS.LJJLIIIJILLIZJL(value, arrayList4);
                }
                C0NB.LIZIZ("LiveUnlockGiftPopupPresenter", "update gift list");
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Gift gift2 = (Gift) it2.next();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("update gift list in overrideGift ");
                    LIZ.append(gift2.id);
                    C0NB.LIZIZ("LiveUnlockGiftPopupPresenter", X1D.LIZIZ(LIZ));
                    if (arrayList4.contains(Long.valueOf(gift2.id))) {
                        C0NB.LIZIZ("LiveUnlockGiftPopupPresenter", "override locked ");
                        Gift findGiftById = GiftManager.inst().findGiftById(gift2.id);
                        if (gift2.giftSubInfo == null) {
                            gift2.giftSubInfo = new GiftLockInfo();
                        }
                        GiftLockInfo giftLockInfo2 = gift2.giftSubInfo;
                        if (giftLockInfo2 != null) {
                            giftLockInfo2.mLockType = 2;
                            giftLockInfo2.mLock = false;
                            if (findGiftById != null) {
                                findGiftById.giftSubInfo = giftLockInfo2;
                                findGiftById.giftPanelBanner = gift2.giftPanelBanner;
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }
                Text text = giftUnlockMessage.bubbleText;
                C0NB.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble");
                if (GiftUnlockExperiment.showLock() && (this.LJLIL + (LiveGuideWattingDurationSetting.INSTANCE.getValue() * 1000)) - System.currentTimeMillis() <= 0) {
                    C0NB.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble directly");
                    ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(Long.valueOf(((Gift) it3.next()).id));
                    }
                    List<GiftPage> giftPageList = GiftManager.inst().getGiftPageList();
                    o.LJIIIIZZ(giftPageList, "inst().giftPageList");
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<GiftPage> it4 = giftPageList.iterator();
                    while (it4.hasNext()) {
                        List<Gift> list = it4.next().gifts;
                        o.LJIIIIZZ(list, "it.gifts");
                        ORS.LJJLIIIJILLIZJL(list, arrayList6);
                    }
                    Iterator it5 = arrayList6.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj2 = it5.next();
                            if (arrayList5.contains(Long.valueOf(((Gift) obj2).id))) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    Gift gift3 = (Gift) obj2;
                    if (gift3 == null) {
                        gift3 = (Gift) ORZ.LJLLLL(arrayList);
                    }
                    C0NB.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble before post event");
                    C73943T0h LIZ2 = C73943T0h.LIZ();
                    if (gift3 != null) {
                        l2 = Long.valueOf(gift3.id);
                        imageModel2 = gift3.image;
                    } else {
                        l2 = null;
                        imageModel2 = null;
                    }
                    LIZ2.LIZIZ(new C15810jh(l2, imageModel2, text));
                    C0NB.LIZIZ("LiveUnlockGiftPopupPresenter", "try show bubble after post event");
                    this.LJLIL = System.currentTimeMillis();
                }
            }
            if (arrayList2.size() != 0) {
                C28273B7t.LIZIZ(Integer.valueOf(arrayList2.size()));
                DataChannel dataChannel = this.LJLILLLLZI;
                if (dataChannel != null) {
                    dataChannel.pv0(ExclusiveShowRedDotEvent.class);
                }
                if (C32129CjF.LIZ.LJIIIIZZ != 15) {
                    InterfaceC30442Bx8.l0.LIZ(Boolean.TRUE);
                }
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    Gift gift4 = (Gift) it6.next();
                    Gift findGiftById2 = GiftManager.inst().findGiftById(gift4.id);
                    if (findGiftById2 != null) {
                        findGiftById2.giftSubInfo = gift4.giftSubInfo;
                    }
                }
                UW7 uw7 = GiftManager.inst().giftRepository;
                DataChannel dataChannel2 = this.LJLILLLLZI;
                if (dataChannel2 != null && (room2 = (Room) dataChannel2.kv0(RoomChannel.class)) != null) {
                    j2 = room2.getId();
                } else {
                    j2 = 0;
                }
                DataChannel dataChannel3 = this.LJLILLLLZI;
                if (dataChannel3 != null && (bool2 = (Boolean) dataChannel3.kv0(UserIsAnchorChannel.class)) != null) {
                    z = bool2.booleanValue();
                } else {
                    z = false;
                }
                uw7.LIZ(10, j2, new CZK(), "", z);
                Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    Gift gift5 = (Gift) it7.next();
                    ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Un(gift5.id);
                    DataChannel dataChannel4 = this.LJLILLLLZI;
                    if (dataChannel4 != null) {
                        dataChannel4.qv0(ExclusiveGiftUnlockEvent.class, gift5);
                    }
                }
            }
            if (arrayList3.size() != 0) {
                C28273B7t.LIZIZ(Integer.valueOf(arrayList3.size()));
                DataChannel dataChannel5 = this.LJLILLLLZI;
                if (dataChannel5 != null) {
                    dataChannel5.pv0(ExclusiveShowRedDotEvent.class);
                }
                ArrayList arrayList7 = new ArrayList(C32I.LJJL(arrayList3, 10));
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    arrayList7.add(Long.valueOf(((Gift) it8.next()).id));
                }
                List<GiftPage> giftPageList2 = GiftManager.inst().getGiftPageList();
                o.LJIIIIZZ(giftPageList2, "inst().giftPageList");
                ArrayList arrayList8 = new ArrayList();
                Iterator<GiftPage> it9 = giftPageList2.iterator();
                while (it9.hasNext()) {
                    List<Gift> list2 = it9.next().gifts;
                    o.LJIIIIZZ(list2, "it.gifts");
                    ORS.LJJLIIIJILLIZJL(list2, arrayList8);
                }
                Iterator it10 = arrayList8.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        obj = it10.next();
                        if (arrayList7.contains(Long.valueOf(((Gift) obj).id))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Gift gift6 = (Gift) obj;
                if (gift6 == null) {
                    gift6 = (Gift) ORZ.LJLLLL(arrayList3);
                }
                C73943T0h LIZ3 = C73943T0h.LIZ();
                if (gift6 != null) {
                    l = Long.valueOf(gift6.id);
                    imageModel = gift6.image;
                } else {
                    l = null;
                    imageModel = null;
                }
                LIZ3.LIZIZ(new C15930jt(l, imageModel, giftUnlockMessage.bubbleText));
                if (C32129CjF.LIZ.LJIIIIZZ != 15) {
                    ((IFansClubService) CN1.LIZ(IFansClubService.class)).Mh();
                }
                Iterator it11 = arrayList3.iterator();
                while (it11.hasNext()) {
                    Gift gift7 = (Gift) it11.next();
                    Gift findGiftById3 = GiftManager.inst().findGiftById(gift7.id);
                    if (findGiftById3 != null) {
                        findGiftById3.giftSubInfo = gift7.giftSubInfo;
                        findGiftById3.giftPanelBanner = gift7.giftPanelBanner;
                    }
                }
                UW7 uw72 = GiftManager.inst().giftRepository;
                DataChannel dataChannel6 = this.LJLILLLLZI;
                if (dataChannel6 != null && (room = (Room) dataChannel6.kv0(RoomChannel.class)) != null) {
                    j = room.getId();
                } else {
                    j = 0;
                }
                DataChannel dataChannel7 = this.LJLILLLLZI;
                if (dataChannel7 != null && (bool = (Boolean) dataChannel7.kv0(UserIsAnchorChannel.class)) != null) {
                    z2 = bool.booleanValue();
                }
                uw72.LIZ(10, j, new CZJ(this), "", z2);
                Iterator it12 = arrayList3.iterator();
                while (it12.hasNext()) {
                    Gift gift8 = (Gift) it12.next();
                    ((IFansClubService) CN1.LIZ(IFansClubService.class)).Ij(gift8.id);
                    DataChannel dataChannel8 = this.LJLILLLLZI;
                    if (dataChannel8 != null) {
                        dataChannel8.qv0(ExclusiveGiftUnlockEvent.class, gift8);
                    }
                }
            }
        }
    }
}
