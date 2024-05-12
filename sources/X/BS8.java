package X;

import Y.AfS57S0100000_5;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.api.RedEnvelopeApi;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.gift.event.LiveSendRedEnvelopeEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.livesetting.portal.PortalFeatureSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOpt;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOptEnablePost;
import com.bytedance.android.livesdk.model.RoomAuthMessage;
import com.bytedance.android.livesdk.model.RoomAuthMessageGoldenEnvelope;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BS8 implements BSH {
    public DataChannel LIZIZ;
    public BSA LIZJ;
    public Boolean LIZLLL;
    public Room LJ;
    public boolean LJI;
    public String LJII;
    public final java.util.Set<RedEnvelopMessage> LIZ = new HashSet();
    public final LinkedList<OSZ<String, String>> LJFF = new LinkedList<>();
    public final BS9 LJIIIIZZ = new BS9(this);
    public final BS7 LJIIIZ = new BS7(this);

    @Override // X.BSH
    public final void LIZ() {
        IMessageManager iMessageManager;
        this.LIZJ = null;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this.LJIIIIZZ);
        }
        C72818Shy.LJII("liveGoldenEnvelopeCreate", this.LJIIIZ);
        C72818Shy.LJII("liveGoldenEnvelopCloseAll", this.LJIIIZ);
        C72818Shy.LJII("EVENT_ENVELOPE_UPDATE", this.LJIIIZ);
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue()) {
            this.LJ = null;
            ((HashSet) this.LIZ).clear();
        }
        LJIILIIL(false);
    }

    @Override // X.BSH
    public final void LJI() {
        this.LJI = false;
    }

    @Override // X.BSH
    public final void onPause() {
    }

    @Override // X.BSH
    public final void onResume() {
    }

    @Override // X.BSH
    public final void LIZLLL() {
        if (!this.LJI && this.LJFF.size() > 0) {
            this.LJI = true;
            OSZ<String, String> removeFirst = this.LJFF.removeFirst();
            if (this.LIZJ == null && !LJIIJJI()) {
                C28792BRs.LIZ(this.LIZLLL, "RedEnvelopeWidget is null", ((RedEnvelopeInfoModel4FE) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, removeFirst.getFirst(), new BSB().getType())).envelopList);
            }
            BSA bsa = this.LIZJ;
            if (bsa != null) {
                bsa.LJLJJLL(removeFirst.getFirst(), removeFirst.getSecond());
            }
        }
    }

    public final boolean LJIIJJI() {
        boolean z;
        String str = this.LJII;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.BSH
    public final boolean isAnchor() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.BSH
    public final boolean LJII() {
        return LJIIJJI();
    }

    @Override // X.BSH
    public final Room LIZJ() {
        return this.LJ;
    }

    @Override // X.BSH
    public final String LJFF() {
        return this.LJII;
    }

    @Override // X.BSH
    public final void LIZIZ(List<RedEnvelopInfo> envelopeList) {
        Integer num;
        Integer num2;
        Integer num3;
        o.LJIIIZ(envelopeList, "envelopeList");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(envelopeList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            RedEnvelopInfo redEnvelopInfo = (RedEnvelopInfo) it.next();
            Integer num4 = redEnvelopInfo.businessType;
            if ((num4 != null && num4.intValue() == 1) || (((num = redEnvelopInfo.businessType) != null && num.intValue() == 2) || (((num2 = redEnvelopInfo.businessType) != null && num2.intValue() == 4) || ((num3 = redEnvelopInfo.businessType) != null && num3.intValue() == 9)))) {
                arrayList2.add(redEnvelopInfo);
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            RedEnvelopInfo redEnvelopInfo2 = (RedEnvelopInfo) it2.next();
            arrayList3.add(redEnvelopInfo2.sendUserId);
            arrayList4.add(redEnvelopInfo2.envelopeId);
        }
        if (arrayList.size() > 0) {
            LJIIL(LJIIJ(arrayList), "api");
        } else {
            C0NB.LJ("RedEnvelopePresenter", "err info: list size = 0");
        }
    }

    @Override // X.BSH
    public final void LJ(String str) {
        this.LJII = str;
    }

    public final String LJIIJ(List<RedEnvelopInfo> list) {
        long j;
        long j2;
        Long l;
        Long l2;
        Long l3;
        boolean z;
        Integer num;
        Boolean bool;
        int i;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        Integer num2;
        int i2;
        String str;
        List<String> urls;
        ImageModel imageModel;
        List<String> urls2;
        RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE = new RedEnvelopeInfoModel4FE();
        redEnvelopeInfoModel4FE.dataFrom = "api";
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29022BaE.class);
        if (map != null) {
            for (RedEnvelopInfo redEnvelopInfo : list) {
                Integer num3 = redEnvelopInfo.businessType;
                if (num3 != null) {
                    i2 = num3.intValue();
                } else {
                    i2 = 0;
                }
                if (o.LJ(map.get(Long.valueOf(i2)), Boolean.TRUE)) {
                    List<RedEnvelopeMessage4FE> list2 = redEnvelopeInfoModel4FE.envelopList;
                    RedEnvelopeMessage4FE redEnvelopeMessage4FE = new RedEnvelopeMessage4FE();
                    RedEnvelopInfo4FE redEnvelopInfo4FE2 = new RedEnvelopInfo4FE();
                    redEnvelopInfo4FE2.businessType = redEnvelopInfo.businessType;
                    redEnvelopInfo4FE2.diamondCount = redEnvelopInfo.diamondCount;
                    redEnvelopInfo4FE2.envelopeId = redEnvelopInfo.envelopeId;
                    redEnvelopInfo4FE2.envelopeIdc = redEnvelopInfo.envelopeIdc;
                    redEnvelopInfo4FE2.peopleCount = redEnvelopInfo.peopleCount;
                    redEnvelopInfo4FE2.sendUserId = redEnvelopInfo.sendUserId;
                    redEnvelopInfo4FE2.unpackAt = redEnvelopInfo.unpackAt;
                    redEnvelopInfo4FE2.sendUserName = redEnvelopInfo.sendUserName;
                    ImageModel imageModel2 = redEnvelopInfo.sendUserAvatar;
                    if (imageModel2 == null || (urls = imageModel2.getUrls()) == null || urls.size() <= 0 || (imageModel = redEnvelopInfo.sendUserAvatar) == null || (urls2 = imageModel.getUrls()) == null || (str = (String) ListProtector.get(urls2, 0)) == null) {
                        str = "";
                    }
                    redEnvelopInfo4FE2.sendUserAvatar = str;
                    redEnvelopInfo4FE2.followStatusShow = redEnvelopInfo.followShowStatus;
                    redEnvelopInfo4FE2.createAt = CardStruct.IStatusCode.DEFAULT;
                    redEnvelopeMessage4FE.envelopInfo = redEnvelopInfo4FE2;
                    redEnvelopeMessage4FE.diaplay = 1;
                    list2.add(redEnvelopeMessage4FE);
                }
            }
            Iterator it = ((HashSet) this.LIZ).iterator();
            while (it.hasNext()) {
                RedEnvelopMessage redEnvelopMessage = (RedEnvelopMessage) it.next();
                MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo != null && (num2 = messageRedEnvelopInfo.businessType) != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                if (o.LJ(map.get(Long.valueOf(i)), Boolean.TRUE)) {
                    List<RedEnvelopeMessage4FE> list3 = redEnvelopeInfoModel4FE.envelopList;
                    RedEnvelopeMessage4FE redEnvelopeMessage4FE2 = new RedEnvelopeMessage4FE();
                    MessageRedEnvelopInfo messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo;
                    if (messageRedEnvelopInfo2 != null) {
                        redEnvelopInfo4FE = C77125UOr.LJIILIIL(messageRedEnvelopInfo2);
                    } else {
                        redEnvelopInfo4FE = null;
                    }
                    redEnvelopeMessage4FE2.envelopInfo = redEnvelopInfo4FE;
                    redEnvelopeMessage4FE2.diaplay = redEnvelopMessage.display;
                    list3.add(redEnvelopeMessage4FE2);
                }
            }
        }
        if (LJIIJJI()) {
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            for (int size = redEnvelopeInfoModel4FE.envelopList.size() - 1; size < 1; size++) {
                RedEnvelopInfo4FE redEnvelopInfo4FE3 = ((RedEnvelopeMessage4FE) ListProtector.get(redEnvelopeInfoModel4FE.envelopList, size)).envelopInfo;
                if (redEnvelopInfo4FE3 != null && (num = redEnvelopInfo4FE3.businessType) != null && num.intValue() == 4 && !PortalFeatureSetting.INSTANCE.getValue() && !z) {
                    ListProtector.remove(redEnvelopeInfoModel4FE.envelopList, size);
                }
            }
        }
        ((HashSet) this.LIZ).clear();
        redEnvelopeInfoModel4FE.timeDiff = C31012CFc.LIZIZ;
        DataChannel dataChannel2 = this.LIZIZ;
        long j3 = 0;
        if (dataChannel2 != null && (l3 = (Long) dataChannel2.kv0(BDJ.class)) != null) {
            j = l3.longValue();
        } else {
            j = 0;
        }
        redEnvelopeInfoModel4FE.requestListTimestamp = j;
        DataChannel dataChannel3 = this.LIZIZ;
        if (dataChannel3 != null && (l2 = (Long) dataChannel3.kv0(BDI.class)) != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        redEnvelopeInfoModel4FE.requestPermissionTimestamp = j2;
        DataChannel dataChannel4 = this.LIZIZ;
        if (dataChannel4 != null && (l = (Long) dataChannel4.kv0(C28415BDf.class)) != null) {
            j3 = l.longValue();
        }
        redEnvelopeInfoModel4FE.listResponseTimestamp = j3;
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, redEnvelopeInfoModel4FE);
        o.LJIIIIZZ(json, "gson.toJson(model)");
        return json;
    }

    public final void LJIILIIL(boolean z) {
        Context LJFF;
        IBrowserService iBrowserService;
        BSA bsa = this.LIZJ;
        if (bsa != null && (LJFF = bsa.LJFF()) != null && (iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class)) != null) {
            iBrowserService.qk0(LJFF, Boolean.valueOf(z), "TREASURE_BOX_SHORT_TOUCH_IS_SHOWING");
        }
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Long, O] */
    @Override // X.BSH
    public final void LJIIIIZZ(DataChannel dataChannel, BSA view) {
        IMessageManager iMessageManager;
        String str;
        RoomAuthStatus roomAuthStatus;
        RoomAuthMessage roomAuthMessage;
        RoomAuthMessageGoldenEnvelope roomAuthMessageGoldenEnvelope;
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attachView(");
        LIZ.append(dataChannel);
        LIZ.append(')');
        C0NB.LIZIZ("RedEnvelopePresenter", X1D.LIZIZ(LIZ));
        this.LIZJ = view;
        this.LIZIZ = dataChannel;
        this.LIZLLL = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        Room room = (Room) dataChannel.kv0(RoomChannel.class);
        this.LJ = room;
        if (room != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isAnchorEnvelopeRevoke() && (roomAuthMessage = room.mRoomAuthMessage) != null && (roomAuthMessageGoldenEnvelope = roomAuthMessage.goldenEnvelope) != null) {
            long j = roomAuthMessageGoldenEnvelope.revokeEndTime * 1000;
            if (j > C30725C4b.LIZIZ() && j - C30725C4b.LIZIZ() > 0) {
                DataChannel dataChannel2 = this.LIZIZ;
                if (dataChannel2 != null) {
                    ((C32537Cpp) dataChannel2.gv0(BRM.class)).LIZ = Long.valueOf(j);
                }
                BSA bsa = this.LIZJ;
                if (bsa != null) {
                    bsa.LJJLIIIJLLLLLLLZ();
                }
            }
        }
        LifecycleOwner lifecycleOwner = null;
        if (!GetTreasureBoxListOpt.INSTANCE.getValue()) {
            Room room2 = this.LJ;
            if (room2 == null) {
                C0NB.LIZIZ("RedEnvelopePresenter", "getRedEnvelops: room info null");
            } else {
                String idStr = room2.getIdStr();
                if (idStr == null || idStr.length() == 0) {
                    C0NB.LIZIZ("RedEnvelopePresenter", "getRedEnvelops: roomStrId info null");
                } else {
                    Room room3 = this.LJ;
                    if (room3 == null || (str = room3.getIdStr()) == null) {
                        str = "";
                    }
                    if (!GetTreasureBoxListOptEnablePost.INSTANCE.getValue()) {
                        T28.LIZLLL(((RedEnvelopeApi) Q7L.LIZIZ(RedEnvelopeApi.class)).getRedEnvelopList(str)).LJJII(new AfS57S0100000_5(this, 287), C28276B7w.LJLIL);
                    } else {
                        T28.LIZLLL(((RedEnvelopeApi) Q7L.LIZIZ(RedEnvelopeApi.class)).getRedEnvelopListV2(str)).LJJII(new AfS57S0100000_5(this, 288), C28277B7x.LJLIL);
                    }
                }
            }
        }
        LJIILIIL(false);
        BSA bsa2 = this.LIZJ;
        if (bsa2 instanceof LifecycleOwner) {
            o.LJII(bsa2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            lifecycleOwner = (LifecycleOwner) bsa2;
        }
        DataChannel dataChannel3 = this.LIZIZ;
        if (dataChannel3 != null) {
            dataChannel3.lv0(lifecycleOwner, LiveSendRedEnvelopeEvent.class, new AqS171S0100000_5(this, 753));
        }
        C72818Shy.LIZLLL("liveGoldenEnvelopeCreate", this.LJIIIZ);
        C72818Shy.LIZLLL("liveGoldenEnvelopCloseAll", this.LJIIIZ);
        C72818Shy.LIZLLL("EVENT_ENVELOPE_UPDATE", this.LJIIIZ);
        DataChannel dataChannel4 = this.LIZIZ;
        if (dataChannel4 != null && (iMessageManager = (IMessageManager) dataChannel4.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.RED_ENVELOPE_MESSAGE.getIntType(), this.LJIIIIZZ);
            iMessageManager.addMessageListener(EnumC31509CYf.ACCESS_RECALL_MESSAGE.getIntType(), this.LJIIIIZZ);
            iMessageManager.addMessageListener(EnumC31509CYf.PERCEPTION_MESSAGE.getIntType(), this.LJIIIIZZ);
        }
    }

    public final String LJIIIZ(RedEnvelopMessage redEnvelopMessage, String str) {
        boolean z;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        long j;
        long j2;
        Long l;
        Long l2;
        Long l3;
        Integer num;
        boolean z2;
        RedEnvelopInfo4FE redEnvelopInfo4FE2;
        Integer num2;
        Boolean bool;
        int i = 0;
        if (redEnvelopMessage == null) {
            z = true;
        } else {
            z = false;
        }
        if (z || redEnvelopMessage.envelopeInfo == null) {
            return null;
        }
        RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE = new RedEnvelopeInfoModel4FE();
        redEnvelopeInfoModel4FE.dataFrom = str;
        if (LJIIJJI()) {
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = false;
            }
            MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo;
            if (messageRedEnvelopInfo != null && (num2 = messageRedEnvelopInfo.businessType) != null && num2.intValue() == 4 && !PortalFeatureSetting.INSTANCE.getValue() && !z2) {
                redEnvelopeInfoModel4FE.envelopList = new ArrayList();
            } else {
                RedEnvelopeMessage4FE[] redEnvelopeMessage4FEArr = new RedEnvelopeMessage4FE[1];
                RedEnvelopeMessage4FE redEnvelopeMessage4FE = new RedEnvelopeMessage4FE();
                MessageRedEnvelopInfo messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo2 != null) {
                    redEnvelopInfo4FE2 = C77125UOr.LJIILIIL(messageRedEnvelopInfo2);
                } else {
                    redEnvelopInfo4FE2 = null;
                }
                redEnvelopeMessage4FE.envelopInfo = redEnvelopInfo4FE2;
                redEnvelopeMessage4FE.diaplay = redEnvelopMessage.display;
                redEnvelopeMessage4FEArr[0] = redEnvelopeMessage4FE;
                redEnvelopeInfoModel4FE.envelopList = C47261Igj.LJII(redEnvelopeMessage4FEArr);
            }
        } else if (redEnvelopMessage.display == 1) {
            RedEnvelopeMessage4FE[] redEnvelopeMessage4FEArr2 = new RedEnvelopeMessage4FE[1];
            RedEnvelopeMessage4FE redEnvelopeMessage4FE2 = new RedEnvelopeMessage4FE();
            MessageRedEnvelopInfo messageRedEnvelopInfo3 = redEnvelopMessage.envelopeInfo;
            if (messageRedEnvelopInfo3 != null) {
                redEnvelopInfo4FE = C77125UOr.LJIILIIL(messageRedEnvelopInfo3);
            } else {
                redEnvelopInfo4FE = null;
            }
            redEnvelopeMessage4FE2.envelopInfo = redEnvelopInfo4FE;
            redEnvelopeMessage4FE2.diaplay = redEnvelopMessage.display;
            redEnvelopeMessage4FEArr2[0] = redEnvelopeMessage4FE2;
            redEnvelopeInfoModel4FE.envelopList = C47261Igj.LJII(redEnvelopeMessage4FEArr2);
        } else {
            C0NB.LJ("RedEnvelopePresenter", "wait interface");
        }
        java.util.Map map = (java.util.Map) DataChannelGlobal.LJLJJI.mv0(C29022BaE.class);
        MessageRedEnvelopInfo messageRedEnvelopInfo4 = redEnvelopMessage.envelopeInfo;
        if (messageRedEnvelopInfo4 != null && (num = messageRedEnvelopInfo4.businessType) != null) {
            i = num.intValue();
        }
        redEnvelopeInfoModel4FE.timeDiff = C31012CFc.LIZIZ;
        DataChannel dataChannel2 = this.LIZIZ;
        long j3 = 0;
        if (dataChannel2 != null && (l3 = (Long) dataChannel2.kv0(BDJ.class)) != null) {
            j = l3.longValue();
        } else {
            j = 0;
        }
        redEnvelopeInfoModel4FE.requestListTimestamp = j;
        DataChannel dataChannel3 = this.LIZIZ;
        if (dataChannel3 != null && (l2 = (Long) dataChannel3.kv0(BDI.class)) != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        redEnvelopeInfoModel4FE.requestPermissionTimestamp = j2;
        DataChannel dataChannel4 = this.LIZIZ;
        if (dataChannel4 != null && (l = (Long) dataChannel4.kv0(C28415BDf.class)) != null) {
            j3 = l.longValue();
        }
        redEnvelopeInfoModel4FE.listResponseTimestamp = j3;
        Gson gson = C09650Zl.LIZIZ;
        if (map == null || !o.LJ(map.get(Long.valueOf(i)), Boolean.TRUE)) {
            return null;
        }
        return GsonProtectorUtils.toJson(gson, redEnvelopeInfoModel4FE);
    }

    public final void LJIIL(String str, String str2) {
        this.LJFF.add(new OSZ<>(str, str2));
        LIZLLL();
    }
}
