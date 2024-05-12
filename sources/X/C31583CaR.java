package X;

import Y.ARunnableS16S0300000_5;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdk.game.model.AccessRecallMessage;
import com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.event.LiveGiftSuspensionEvent;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.EffectPreloadingMessage;
import com.bytedance.android.livesdk.model.message.GiftGlobalMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceGift;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdkapi.depend.model.live.FilterMsgRuleParamRandom;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.LiveFilterMsgRule;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.CaR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31583CaR implements OnMessageListener {
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public InterfaceC31587CaV LJLJJI;
    public DataChannel LJLJJL;
    public final C73318Sq2 LJLIL = new C73318Sq2();
    public final C31592Caa LJLJJLL = new C31592Caa();

    public final void onEvent(B3N event) {
        o.LJIIIZ(event, "event");
        int i = event.LIZIZ;
        if (i == 3) {
            this.LJLILLLLZI = true;
        } else {
            if (i != 4) {
                return;
            }
            this.LJLILLLLZI = false;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension, O] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        GiftSuspension giftSuspension;
        long j;
        InterfaceC65784Pro interfaceC65784Pro;
        boolean z;
        long j2;
        IMessageManager iMessageManager;
        String str;
        String str2;
        String str3;
        String str4;
        CommonMessageData commonMessageData;
        Text text;
        RoomNotifyMessage roomNotifyMessage;
        List<LiveFilterMsgRule> arrayList;
        List arrayList2;
        int i;
        CommonMessageData commonMessageData2;
        Text text2;
        Boolean bool;
        ImageModel imageModel;
        o.LJIIIZ(message, "message");
        InterfaceC31587CaV interfaceC31587CaV = this.LJLJJI;
        if (interfaceC31587CaV == null) {
            return;
        }
        if (message instanceof GiftMessage) {
            GiftMessage giftMessage = (GiftMessage) message;
            GiftTrayInfo giftTrayInfo = giftMessage.mTrayInfo;
            if (giftTrayInfo != null && (imageModel = giftTrayInfo.mDynamicImg) != null) {
                C30760C5k.LJFF(imageModel);
            }
            if (GiftHighTrafficDropMessageSetting.INSTANCE.getEnabled()) {
                C31592Caa c31592Caa = this.LJLJJLL;
                AqS136S0200000_5 aqS136S0200000_5 = new AqS136S0200000_5(interfaceC31587CaV, this, 27);
                c31592Caa.getClass();
                GiftReceiveMsgThreadSetting.INSTANCE.postToThread(new ARunnableS16S0300000_5(c31592Caa, giftMessage, aqS136S0200000_5, 7));
                return;
            }
            GiftReceiveMsgThreadSetting.INSTANCE.postToThread(new ARunnableS16S0300000_5(interfaceC31587CaV, message, this, 8));
            return;
        }
        if (message instanceof LiveTrayMessage) {
            LiveTrayMessage liveTrayMessage = (LiveTrayMessage) message;
            AbsNormalGiftAnimWidget absNormalGiftAnimWidget = ((GiftWidget) interfaceC31587CaV).LJLILLLLZI;
            if (absNormalGiftAnimWidget == null) {
                return;
            }
            absNormalGiftAnimWidget.LL(liveTrayMessage);
            return;
        }
        Integer num = null;
        String str5 = null;
        num = null;
        if (message instanceof GiftGlobalMessage) {
            GiftGlobalMessage giftGlobalMessage = (GiftGlobalMessage) message;
            C0TS c0ts = ((GiftWidget) interfaceC31587CaV).LJLLLLLL;
            if (c0ts == null) {
                return;
            }
            DataChannel dataChannel = (DataChannel) c0ts.LIZ;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            RoomNotifyMessage roomNotifyMessage2 = giftGlobalMessage.mNotifyMessage;
            if (roomNotifyMessage2 != null && (commonMessageData2 = roomNotifyMessage2.baseMessage) != null && (text2 = commonMessageData2.displayText) != null && !C79004UzY.LJJIFFI(text2.pieces)) {
                Iterator<TextPiece> it = text2.pieces.iterator();
                while (it.hasNext()) {
                    TextPieceGift textPieceGift = it.next().giftValue;
                    if (textPieceGift != null) {
                        j2 = textPieceGift.giftId;
                        break;
                    }
                }
            }
            j2 = 0;
            if (giftGlobalMessage.mFromUserId != ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room == null || (arrayList = room.filterRule) == null) {
                    arrayList = new ArrayList();
                }
                CommonMessageData commonMessageData3 = giftGlobalMessage.baseMessage;
                if (commonMessageData3 == null || (arrayList2 = commonMessageData3.filterTags) == null) {
                    arrayList2 = new ArrayList();
                }
                for (Object obj : arrayList2) {
                    for (LiveFilterMsgRule liveFilterMsgRule : arrayList) {
                        if (o.LJ(liveFilterMsgRule.name, obj) && liveFilterMsgRule.rule == 0) {
                            int nextInt = C78841Uwv.LIZ(System.currentTimeMillis()).nextInt(0, 100);
                            FilterMsgRuleParamRandom filterMsgRuleParamRandom = liveFilterMsgRule.random;
                            if (filterMsgRuleParamRandom != null) {
                                i = filterMsgRuleParamRandom.percentage;
                            } else {
                                i = 0;
                            }
                            if (nextInt < i) {
                                Long valueOf = Long.valueOf(j2);
                                BZI LIZ = C28787BRn.LIZ("abandon_announcements");
                                LIZ.LJIIZILJ();
                                LIZ.LJIJJ(valueOf, "gift_id");
                                LIZ.LJIJJ("gift", "reason");
                                LIZ.LJIJJ(C31120CJg.LJ().getDesc(), WM7.SCENE_SERVICE);
                                LIZ.LJJIIJZLJL();
                                return;
                            }
                        }
                    }
                }
            }
            DataChannel dataChannel2 = (DataChannel) c0ts.LIZ;
            if (dataChannel2 != null) {
                iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class);
            } else {
                iMessageManager = null;
            }
            if (giftGlobalMessage.mNotifyMessage != null) {
                ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
            }
            RoomNotifyMessage roomNotifyMessage3 = giftGlobalMessage.mNotifyMessage;
            if (roomNotifyMessage3 != null) {
                roomNotifyMessage3.LJLIL = giftGlobalMessage.mLeftIcon;
            }
            if (LiveAnchorGiftDisableSetting.INSTANCE.getValue() && (roomNotifyMessage = giftGlobalMessage.mNotifyMessage) != null) {
                roomNotifyMessage.schema = null;
            }
            RoomNotifyMessage roomNotifyMessage4 = giftGlobalMessage.mNotifyMessage;
            Gift findGiftById = GiftManager.inst().findGiftById(j2);
            if (findGiftById != null && roomNotifyMessage4 != null && (commonMessageData = roomNotifyMessage4.baseMessage) != null && (text = commonMessageData.displayText) != null && !C79004UzY.LJJIFFI(text.pieces)) {
                Iterator<TextPiece> it2 = text.pieces.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TextPieceGift textPieceGift2 = it2.next().giftValue;
                    if (textPieceGift2 != null) {
                        textPieceGift2.LIZ = findGiftById;
                        break;
                    }
                }
            }
            if (iMessageManager != null) {
                iMessageManager.insertMessage(giftGlobalMessage.mNotifyMessage, true);
            }
            RoomNotifyMessage roomNotifyMessage5 = giftGlobalMessage.mNotifyMessage;
            if (roomNotifyMessage5 == null || !LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_privilege_show", LiveLogMonitorSampleSetting.getSAMPLE_0())) {
                return;
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_privilege_show");
            String str6 = "anchor";
            if (z) {
                str = "anchor";
            } else {
                str = "user";
            }
            InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) TTL.LIZJ(LIZ2, str, "user_type")).LIZIZ;
            if (interfaceC05190Ih == null || interfaceC05190Ih.getLiveRoomId() == 0) {
                str6 = "user";
            }
            LIZ2.LJIJJ(str6, "to_user_type");
            LIZ2.LJIJJ("universe_gift_send", "privilege_scenario");
            LIZ2.LJIJJ("advanced_notice", "privilege_type");
            C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ2, "user_id");
            LIZ2.LJIJJ(Long.valueOf(roomNotifyMessage5.from_user_id), "to_user_id");
            PrivilegeLogExtra privilegeLogExtra = roomNotifyMessage5.logExtra;
            if (privilegeLogExtra != null) {
                str2 = privilegeLogExtra.privilege_id;
            } else {
                str2 = null;
            }
            LIZ2.LJIJJ(str2, "privilege_id");
            PrivilegeLogExtra privilegeLogExtra2 = roomNotifyMessage5.logExtra;
            if (privilegeLogExtra2 != null) {
                str3 = privilegeLogExtra2.privilege_order_id;
            } else {
                str3 = null;
            }
            LIZ2.LJIJJ(str3, "privilege_order_id");
            PrivilegeLogExtra privilegeLogExtra3 = roomNotifyMessage5.logExtra;
            if (privilegeLogExtra3 != null) {
                str4 = privilegeLogExtra3.privilege_version;
            } else {
                str4 = null;
            }
            LIZ2.LJIJJ(str4, "privilege_version_id");
            PrivilegeLogExtra privilegeLogExtra4 = roomNotifyMessage5.logExtra;
            if (privilegeLogExtra4 != null) {
                str5 = privilegeLogExtra4.data_version;
            }
            LIZ2.LJIJJ(str5, "data_version_id");
            LIZ2.LJIJJ(Integer.valueOf(((IRankService) CN1.LIZ(IRankService.class)).xh0()), "online_user");
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ2.LJIILL())) {
                LIZ2.LJIILLIIL((DataChannel) c0ts.LIZ);
                LIZ2.LJJIIJZLJL();
                return;
            }
            LIZ2.LJJIJ();
            LIZ2.LJI();
            BJM bjm = BJM.LJLIL;
            LIZ2.LJIJJ(BJM.LIZLLL(), "action_type");
            LIZ2.LJIJJ(bjm.LIZJ(), "live_type");
            LIZ2.LJJIIZI();
            return;
        }
        if (message instanceof AssetMessage) {
            C0NB.LJIIIZ("AssetMessage", "receiveAssetMessage");
            AssetMessage assetMessage = (AssetMessage) message;
            AbsNormalGiftAnimWidget absNormalGiftAnimWidget2 = ((GiftWidget) interfaceC31587CaV).LJLILLLLZI;
            if (absNormalGiftAnimWidget2 == null) {
                return;
            }
            absNormalGiftAnimWidget2.LJZI(assetMessage);
            return;
        }
        if (message instanceof ChatMessage) {
            ChatMessage chatMessage = (ChatMessage) message;
            GiftWidget giftWidget = (GiftWidget) interfaceC31587CaV;
            C32089Cib c32089Cib = giftWidget.LLI;
            DataChannel dataChannel3 = giftWidget.dataChannel;
            c32089Cib.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it3 = ((ArrayList) c32089Cib.LJLILLLLZI).iterator();
            while (it3.hasNext()) {
                if (elapsedRealtime - ((Number) it3.next()).longValue() > 30000) {
                    it3.remove();
                }
            }
            ((ArrayList) c32089Cib.LJLILLLLZI).add(Long.valueOf(elapsedRealtime));
            int size = ((ArrayList) c32089Cib.LJLILLLLZI).size();
            LiveGiftGuideClientAISettings liveGiftGuideClientAISettings = LiveGiftGuideClientAISettings.INSTANCE;
            if (size >= liveGiftGuideClientAISettings.getValue().massiveCommentCount) {
                if (dataChannel3 != null && (interfaceC65784Pro = (InterfaceC65784Pro) dataChannel3.kv0(WatchDurationChannel.class)) != null) {
                    j = ((Number) interfaceC65784Pro.invoke()).longValue();
                } else {
                    j = 0;
                }
                if (j < liveGiftGuideClientAISettings.getValue().frequencyControlTaskDelay) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("comment_count_last_min", ((ArrayList) c32089Cib.LJLILLLLZI).size());
                C32146CjW.LIZJ(dataChannel3, "massive_comments", jSONObject);
            }
            if (dataChannel3 == null || chatMessage.userInfo.getId() != ((Number) c32089Cib.LJLJI.getValue()).longValue()) {
                return;
            }
            JSONObject putOpt = new JSONObject().putOpt("room_id", Long.valueOf(C29306Beo.LJJIZ(dataChannel3)));
            String str7 = chatMessage.content;
            if (str7 == null) {
                str7 = "";
            }
            JSONObject putOpt2 = putOpt.putOpt("comment_content", str7);
            o.LJIIIIZZ(putOpt2, "JSONObject()\n           …essage.chatContent ?: \"\")");
            C19660pu.LIZIZ("livesdk_user_comment_sent", putOpt2);
            return;
        }
        if (message instanceof AccessRecallMessage) {
            AccessRecallMessage accessRecallMessage = (AccessRecallMessage) message;
            DataChannel dataChannel4 = this.LJLJJL;
            if (!C38354F3m.LIZJ(accessRecallMessage.scene, "GIFT")) {
                return;
            }
            if (dataChannel4 != null && (giftSuspension = (GiftSuspension) dataChannel4.kv0(C31586CaU.class)) != null) {
                num = Integer.valueOf(giftSuspension.status);
            }
            ?? giftSuspension2 = new GiftSuspension();
            int i2 = accessRecallMessage.status;
            giftSuspension2.status = i2;
            giftSuspension2.endTime = accessRecallMessage.endTime;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        if (dataChannel4 != null) {
                            ((C32537Cpp) dataChannel4.gv0(C31586CaU.class)).LIZ = giftSuspension2;
                        }
                        C31593Cab.LIZJ();
                        if ((num != null && num.intValue() != 0) || dataChannel4 == null) {
                            return;
                        }
                        dataChannel4.rv0(LiveGiftSuspensionEvent.class, Boolean.TRUE);
                        return;
                    }
                    if (num != null && num.intValue() == 3) {
                        return;
                    }
                    if (dataChannel4 != null) {
                        ((C32537Cpp) dataChannel4.gv0(C31586CaU.class)).LIZ = giftSuspension2;
                    }
                    C31593Cab.LIZJ();
                    if ((num != null && num.intValue() != 0) || dataChannel4 == null) {
                        return;
                    }
                    dataChannel4.rv0(LiveGiftSuspensionEvent.class, Boolean.TRUE);
                    return;
                }
                if (num != null && (num.intValue() == 2 || num.intValue() == 3)) {
                    return;
                }
                long LIZIZ = giftSuspension2.endTime - (C30725C4b.LIZIZ() / 1000);
                if (LIZIZ <= 0) {
                    return;
                }
                if (dataChannel4 != null) {
                    ((C32537Cpp) dataChannel4.gv0(C31586CaU.class)).LIZ = giftSuspension2;
                }
                C31593Cab.LIZJ();
                if ((num == null || num.intValue() == 0) && dataChannel4 != null) {
                    dataChannel4.rv0(LiveGiftSuspensionEvent.class, Boolean.TRUE);
                }
                CountDownTimerC31584CaS countDownTimerC31584CaS = new CountDownTimerC31584CaS(LIZIZ * 1000, giftSuspension2, dataChannel4);
                C31593Cab.LIZ = countDownTimerC31584CaS;
                countDownTimerC31584CaS.start();
                return;
            }
            if (dataChannel4 != null) {
                ((C32537Cpp) dataChannel4.gv0(C31586CaU.class)).LIZ = giftSuspension2;
            }
            C31593Cab.LIZJ();
            if (num == null) {
                return;
            }
            if ((num.intValue() != 1 && num.intValue() != 2 && num.intValue() != 3) || dataChannel4 == null) {
                return;
            }
            dataChannel4.rv0(LiveGiftSuspensionEvent.class, Boolean.FALSE);
            return;
        }
        if (!(message instanceof EffectPreloadingMessage)) {
            return;
        }
        EffectPreloadingMessage effectPreloadingMessage = (EffectPreloadingMessage) message;
        List<Long> list = effectPreloadingMessage.effectId;
        ArrayList arrayList3 = new ArrayList();
        for (Long l : list) {
            long longValue = l.longValue();
            if (C32366Cn4.LIZJ(longValue) == null) {
                if (!((ArrayList) C31585CaT.LIZ).contains(Long.valueOf(longValue))) {
                    arrayList3.add(l);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            C32368Cn6.LIZ = C31596Cae.LIZ(new ArrayList(arrayList3), new AqS171S0100000_5(effectPreloadingMessage, 798), C31589CaX.LJLIL);
            return;
        }
        Iterator<Long> it4 = effectPreloadingMessage.effectId.iterator();
        while (it4.hasNext()) {
            C32368Cn6.LIZ(C32366Cn4.LIZJ(it4.next().longValue()), 4);
        }
    }

    public final void onEvent(C31588CaW c31588CaW) {
        GiftMessage giftMessage;
        InterfaceC31587CaV interfaceC31587CaV;
        AbsNormalGiftAnimWidget absNormalGiftAnimWidget;
        if (c31588CaW != null && (giftMessage = c31588CaW.LIZ) != null && (interfaceC31587CaV = this.LJLJJI) != null && (absNormalGiftAnimWidget = ((GiftWidget) interfaceC31587CaV).LJLILLLLZI) != null) {
            absNormalGiftAnimWidget.LJLZ(giftMessage);
        }
    }
}
