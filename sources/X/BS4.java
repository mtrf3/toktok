package X;

import Y.AfS57S0100000_5;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxMessage4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.network.ActivityTreasureBoxApi;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOpt;
import com.bytedance.android.livesdk.livesetting.redenvelope.GetTreasureBoxListOptEnablePost;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BS4 implements BS1 {
    public DataChannel LIZIZ;
    public BS3 LIZJ;
    public Boolean LIZLLL;
    public Room LJ;
    public final java.util.Set<RedEnvelopMessage> LIZ = new HashSet();
    public final java.util.Map<Integer, String> LJFF = new LinkedHashMap();
    public final BS5 LJI = new BS5(this);
    public final C28797BRx LJII = new C28797BRx(this);

    @Override // X.BS1
    public final void LIZ() {
        IMessageManager iMessageManager;
        this.LIZJ = null;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(this.LJI);
        }
        C72818Shy.LJII("liveGoldenEnvelopCloseAll", this.LJII);
        C72818Shy.LJII("EVENT_ENVELOPE_UPDATE", this.LJII);
        if (LiveRecycleWidgetV2RevenueSetting.INSTANCE.getValue()) {
            ((HashSet) this.LIZ).clear();
            ((LinkedHashMap) this.LJFF).clear();
        }
    }

    @Override // X.BS1
    public final void onPause() {
    }

    @Override // X.BS1
    public final void onResume() {
    }

    @Override // X.BS1
    public final boolean isAnchor() {
        Boolean bool = this.LIZLLL;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // X.BS1
    public final void LIZIZ(List<RedEnvelopInfo> list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "envelopeList");
        for (RedEnvelopInfo redEnvelopInfo : list) {
            Integer num = redEnvelopInfo.businessType;
            if (num == null || num.intValue() != 0) {
                Integer num2 = redEnvelopInfo.businessType;
                if (num2 == null || num2.intValue() != 1) {
                    Integer num3 = redEnvelopInfo.businessType;
                    if (num3 == null || num3.intValue() != 2) {
                        Integer num4 = redEnvelopInfo.businessType;
                        if (num4 == null || num4.intValue() != 9) {
                            LJ.add(redEnvelopInfo);
                        }
                    }
                }
            }
        }
        LJI(LJFF(LJ), null, "api");
    }

    @Override // X.BS1
    public final boolean LIZJ(int i) {
        if (((LinkedHashMap) this.LJFF).keySet().contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public final java.util.Map<Integer, ActivityTreasureBoxInfoModel4FE> LJFF(List<RedEnvelopInfo> list) {
        Integer num;
        Integer num2;
        List<ActivityTreasureBoxMessage4FE> list2;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE;
        Integer num3;
        Integer num4;
        List<ActivityTreasureBoxMessage4FE> list3;
        String str;
        List<String> urls;
        ImageModel imageModel;
        List<String> urls2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            RedEnvelopInfo redEnvelopInfo = (RedEnvelopInfo) it.next();
            if (!linkedHashMap.containsKey(redEnvelopInfo.businessType)) {
                linkedHashMap.put(redEnvelopInfo.businessType, new ActivityTreasureBoxInfoModel4FE());
                ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(redEnvelopInfo.businessType);
                if (activityTreasureBoxInfoModel4FE != null) {
                    activityTreasureBoxInfoModel4FE.timeDiff = C31012CFc.LIZIZ;
                }
            }
            ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE2 = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(redEnvelopInfo.businessType);
            if (activityTreasureBoxInfoModel4FE2 != null && (list3 = activityTreasureBoxInfoModel4FE2.envelopList) != null) {
                ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE = new ActivityTreasureBoxMessage4FE();
                ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE2 = new ActivityTreasureBoxInfo4FE();
                activityTreasureBoxInfo4FE2.businessType = redEnvelopInfo.businessType;
                activityTreasureBoxInfo4FE2.diamondCount = redEnvelopInfo.diamondCount;
                activityTreasureBoxInfo4FE2.envelopeId = redEnvelopInfo.envelopeId;
                activityTreasureBoxInfo4FE2.envelopeIdc = redEnvelopInfo.envelopeIdc;
                activityTreasureBoxInfo4FE2.peopleCount = redEnvelopInfo.peopleCount;
                activityTreasureBoxInfo4FE2.sendUserId = redEnvelopInfo.sendUserId;
                activityTreasureBoxInfo4FE2.unpackAt = redEnvelopInfo.unpackAt;
                activityTreasureBoxInfo4FE2.sendUserName = redEnvelopInfo.sendUserName;
                ImageModel imageModel2 = redEnvelopInfo.sendUserAvatar;
                if (imageModel2 == null || (urls = imageModel2.getUrls()) == null || urls.size() <= 0 || (imageModel = redEnvelopInfo.sendUserAvatar) == null || (urls2 = imageModel.getUrls()) == null || (str = (String) ListProtector.get(urls2, 0)) == null) {
                    str = "";
                }
                activityTreasureBoxInfo4FE2.sendUserAvatar = str;
                activityTreasureBoxInfo4FE2.followStatusShow = redEnvelopInfo.followShowStatus;
                activityTreasureBoxInfo4FE2.skinId = redEnvelopInfo.skinId;
                activityTreasureBoxMessage4FE.envelopInfo = activityTreasureBoxInfo4FE2;
                activityTreasureBoxMessage4FE.diaplay = 1;
                list3.add(activityTreasureBoxMessage4FE);
            }
        }
        Iterator it2 = ((HashSet) this.LIZ).iterator();
        while (it2.hasNext()) {
            RedEnvelopMessage redEnvelopMessage = (RedEnvelopMessage) it2.next();
            MessageRedEnvelopInfo messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo;
            if (messageRedEnvelopInfo != null) {
                num = messageRedEnvelopInfo.businessType;
            } else {
                num = null;
            }
            if (!linkedHashMap.containsKey(num)) {
                MessageRedEnvelopInfo messageRedEnvelopInfo2 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo2 != null) {
                    num3 = messageRedEnvelopInfo2.businessType;
                } else {
                    num3 = null;
                }
                linkedHashMap.put(num3, new ActivityTreasureBoxInfoModel4FE());
                MessageRedEnvelopInfo messageRedEnvelopInfo3 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo3 != null) {
                    num4 = messageRedEnvelopInfo3.businessType;
                } else {
                    num4 = null;
                }
                ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE3 = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(num4);
                if (activityTreasureBoxInfoModel4FE3 != null) {
                    activityTreasureBoxInfoModel4FE3.timeDiff = C31012CFc.LIZIZ;
                }
            }
            MessageRedEnvelopInfo messageRedEnvelopInfo4 = redEnvelopMessage.envelopeInfo;
            if (messageRedEnvelopInfo4 != null) {
                num2 = messageRedEnvelopInfo4.businessType;
            } else {
                num2 = null;
            }
            ActivityTreasureBoxInfoModel4FE activityTreasureBoxInfoModel4FE4 = (ActivityTreasureBoxInfoModel4FE) linkedHashMap.get(num2);
            if (activityTreasureBoxInfoModel4FE4 != null && (list2 = activityTreasureBoxInfoModel4FE4.envelopList) != null) {
                ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE2 = new ActivityTreasureBoxMessage4FE();
                MessageRedEnvelopInfo messageRedEnvelopInfo5 = redEnvelopMessage.envelopeInfo;
                if (messageRedEnvelopInfo5 != null) {
                    activityTreasureBoxInfo4FE = O5Y.LJIIJJI(messageRedEnvelopInfo5);
                } else {
                    activityTreasureBoxInfo4FE = null;
                }
                activityTreasureBoxMessage4FE2.envelopInfo = activityTreasureBoxInfo4FE;
                activityTreasureBoxMessage4FE2.diaplay = redEnvelopMessage.display;
                list2.add(activityTreasureBoxMessage4FE2);
            }
        }
        ((HashSet) this.LIZ).clear();
        return linkedHashMap;
    }

    @Override // X.BS1
    public final void LIZLLL(DataChannel dataChannel, BS3 view) {
        IMessageManager iMessageManager;
        String str;
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("attachView(");
        LIZ.append(dataChannel);
        LIZ.append(')');
        C0NB.LIZIZ("ActivityTreasurePresenter", X1D.LIZIZ(LIZ));
        this.LIZJ = view;
        this.LIZIZ = dataChannel;
        this.LIZLLL = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class);
        this.LJ = (Room) dataChannel.kv0(RoomChannel.class);
        if (!GetTreasureBoxListOpt.INSTANCE.getValue()) {
            Room room = this.LJ;
            if (room == null) {
                C0NB.LIZIZ("ActivityTreasurePresenter", "getRedEnvelops: room info null");
            } else {
                String idStr = room.getIdStr();
                if (idStr == null || idStr.length() == 0) {
                    C0NB.LIZIZ("ActivityTreasurePresenter", "getRedEnvelops: roomIdStr info null");
                } else {
                    Room room2 = this.LJ;
                    if (room2 == null || (str = room2.getIdStr()) == null) {
                        str = "";
                    }
                    if (!GetTreasureBoxListOptEnablePost.INSTANCE.getValue()) {
                        T28.LIZLLL(((ActivityTreasureBoxApi) Q7L.LIZIZ(ActivityTreasureBoxApi.class)).getRedEnvelopList(str)).LJJII(new AfS57S0100000_5(this, 365), C28278B7y.LJLIL);
                    } else {
                        T28.LIZLLL(((ActivityTreasureBoxApi) Q7L.LIZIZ(ActivityTreasureBoxApi.class)).getRedEnvelopListV2(str)).LJJII(new AfS57S0100000_5(this, 366), C28279B7z.LJLIL);
                    }
                }
            }
        }
        C72818Shy.LIZLLL("liveGoldenEnvelopCloseAll", this.LJII);
        C72818Shy.LIZLLL("EVENT_ENVELOPE_UPDATE", this.LJII);
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.RED_ENVELOPE_MESSAGE.getIntType(), this.LJI);
        }
    }

    @Override // X.BS1
    public final void LJ(int i, String id) {
        o.LJIIIZ(id, "id");
        this.LJFF.put(Integer.valueOf(i), id);
    }

    public final void LJI(java.util.Map<Integer, ActivityTreasureBoxInfoModel4FE> map, RedEnvelopMessage redEnvelopMessage, String str) {
        if (this.LIZJ == null) {
            Iterator it = ((LinkedHashMap) map).entrySet().iterator();
            while (it.hasNext()) {
                C28794BRu.LIZ(this.LIZLLL, "RedEnvelopeWidget is null", ((ActivityTreasureBoxInfoModel4FE) ((Map.Entry) it.next()).getValue()).envelopList);
            }
        }
        BS3 bs3 = this.LIZJ;
        if (bs3 != null) {
            bs3.LJJ(map, str);
        }
    }
}
