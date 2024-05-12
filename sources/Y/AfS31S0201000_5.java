package Y;

import X.AbstractC36786EcA;
import X.B5G;
import X.C28238B6k;
import X.C29162BcU;
import X.C29164BcW;
import X.C31085CHx;
import X.C31086CHy;
import X.C31094CIg;
import X.C31099CIl;
import X.C31106CIs;
import X.C31598Cag;
import X.C47261Igj;
import X.C73943T0h;
import X.C75492Tk0;
import X.C75878TqE;
import X.CI5;
import X.EnumC31110CIw;
import X.EnumC75674Tmw;
import X.InterfaceC29082BbC;
import X.InterfaceC31601Caj;
import X.InterfaceC64592gB;
import X.InterfaceC75495Tk3;
import X.InterfaceC92693kP;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.event.CoHostOnboardPermitChannel;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionResponse;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.dataChannel.EmoteBitmapListChannel;
import com.bytedance.android.livesdk.list.MultiPlusFeedRoomListProvider;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AfS31S0201000_5 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS31S0201000_5 afS31S0201000_5, Object obj) {
        switch (afS31S0201000_5.i2) {
            case 0:
                C31086CHy c31086CHy = (C31086CHy) afS31S0201000_5.l0;
                C31085CHx c31085CHx = (C31085CHx) afS31S0201000_5.l1;
                Throwable th = (Throwable) obj;
                c31086CHy.getClass();
                C73943T0h.LIZ().LIZIZ(new C31099CIl(c31085CHx, false));
                c31086CHy.LJLIL = true;
                T t = c31086CHy.mView;
                if (t == 0 || !(th instanceof Exception)) {
                    return;
                }
                ((CI5) t).Gk0((Exception) th);
                return;
            default:
                AbstractC36786EcA abstractC36786EcA = (AbstractC36786EcA) afS31S0201000_5.l0;
                IESSettingsProxy iESSettingsProxy = (IESSettingsProxy) afS31S0201000_5.l1;
                abstractC36786EcA.getClass();
                C31094CIg LIZ = C31094CIg.LIZ();
                LIZ.getClass();
                synchronized (C31094CIg.class) {
                    LIZ.LIZ = true;
                }
                abstractC36786EcA.LIZ(iESSettingsProxy);
                return;
        }
    }

    public static final void accept$1(AfS31S0201000_5 afS31S0201000_5, Object obj) {
        T t;
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = (MultiPlusFeedRoomListProvider) afS31S0201000_5.l0;
        int i = afS31S0201000_5.i2;
        long[] jArr = (long[]) afS31S0201000_5.l1;
        BaseResponse baseResponse = (BaseResponse) obj;
        multiPlusFeedRoomListProvider.getClass();
        if (baseResponse != null && (t = baseResponse.data) != 0) {
            Map map = (Map) t;
            EnterRoomConfig.LogData logData = multiPlusFeedRoomListProvider.LJLJJLL.mLogData;
            String str = logData.requestId;
            String str2 = logData.logPb;
            for (int i2 = i; i2 < jArr.length + i; i2++) {
                long j = multiPlusFeedRoomListProvider.LL[i2];
                if (map.containsKey(Long.toString(j))) {
                    multiPlusFeedRoomListProvider.LJZL.add(Long.valueOf(j));
                    Room room = (Room) map.get(Long.toString(j));
                    room.setLog_pb(str2);
                    room.setRequestId(str);
                    ListProtector.set(multiPlusFeedRoomListProvider.LJLJJI, i2, room);
                    ListProtector.set(multiPlusFeedRoomListProvider.LJLJJL, i2, C28238B6k.LIZJ(true, room));
                } else {
                    ListProtector.set(multiPlusFeedRoomListProvider.LJLJJI, i2, null);
                }
            }
            multiPlusFeedRoomListProvider.LJLJLJ = false;
        }
    }

    public static final void accept$2(AfS31S0201000_5 afS31S0201000_5, Object obj) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = (MultiLiveAnchorPanelSettings) afS31S0201000_5.l0;
        if (multiLiveAnchorPanelSettings.applierSortSetting == afS31S0201000_5.i2) {
            ((InterfaceC31601Caj) ((InterfaceC29082BbC) ((C31598Cag) afS31S0201000_5.l1).LJLIL)).V7(multiLiveAnchorPanelSettings);
        }
    }

    public static final void accept$3(AfS31S0201000_5 afS31S0201000_5, Object obj) {
        Throwable th = (Throwable) obj;
        if (((MultiLiveAnchorPanelSettings) afS31S0201000_5.l0).applierSortSetting == afS31S0201000_5.i2) {
            ((InterfaceC31601Caj) ((InterfaceC29082BbC) ((C31598Cag) afS31S0201000_5.l1).LJLIL)).U2(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$4(AfS31S0201000_5 afS31S0201000_5, Object obj) {
        EnumC75674Tmw enumC75674Tmw;
        switch (afS31S0201000_5.i2) {
            case 0:
                C75492Tk0 c75492Tk0 = (C75492Tk0) afS31S0201000_5.l0;
                C75878TqE c75878TqE = (C75878TqE) afS31S0201000_5.l1;
                BaseResponse baseResponse = (BaseResponse) obj;
                c75492Tk0.getClass();
                Boolean bool = Boolean.FALSE;
                if (bool.equals(Boolean.valueOf(((CheckPermissionResponse) baseResponse.data).anchorOnboardPermit))) {
                    c75492Tk0.dataChannel.rv0(CoHostOnboardPermitChannel.class, bool);
                }
                if (((CheckPermissionResponse) baseResponse.data).multiHostPermission) {
                    enumC75674Tmw = EnumC75674Tmw.SUPPORT_MULTI;
                } else {
                    enumC75674Tmw = EnumC75674Tmw.NONE;
                }
                if (enumC75674Tmw == EnumC75674Tmw.NONE) {
                    c75492Tk0.LJJJJLL();
                } else {
                    InterfaceC92693kP interfaceC92693kP = c75492Tk0.LJLJI;
                    if (interfaceC92693kP != null) {
                        interfaceC92693kP.dispose();
                        c75492Tk0.LJLJI = null;
                    }
                }
                c75492Tk0.LJJJJZI(enumC75674Tmw);
                ((InterfaceC75495Tk3) c75492Tk0.mView).M80(enumC75674Tmw);
                LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                int i = LIZIZ.LJJZZI + 1;
                LIZIZ.LJJZZI = i;
                c75878TqE.LJJIJL(enumC75674Tmw, null, i);
                return;
            default:
                Object obj2 = afS31S0201000_5.l0;
                C29164BcW c29164BcW = (C29164BcW) afS31S0201000_5.l1;
                obj2.getClass();
                C29162BcU.LJ(c29164BcW.LIZIZ, c29164BcW.LJJIJIIJI, 0, c29164BcW.LJJIJIIJIL, "create Room failed");
                Handler handler = c29164BcW.LIZ;
                if (handler != null) {
                    Message obtainMessage = handler.obtainMessage(c29164BcW.LJFF);
                    obtainMessage.obj = obj;
                    c29164BcW.LIZ.sendMessage(obtainMessage);
                    return;
                }
                return;
        }
    }

    public static final void accept$5(AfS31S0201000_5 afS31S0201000_5, Object obj) {
        List<EmoteModel> list = (List) obj;
        C31106CIs.LIZLLL.clear();
        o.LJIIIIZZ(list, "list");
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                HashMap<String, Integer> hashMap = C31106CIs.LIZLLL;
                String str = ((EmoteModel) obj2).emoteId;
                o.LJIIIIZZ(str, "emoteModel.emoteId");
                hashMap.put(str, Integer.valueOf(i));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        C31106CIs.LJI.clear();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (true ^ C31106CIs.LJFF.containsKey(((EmoteModel) obj3).emoteId)) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            if (!list.isEmpty()) {
                for (EmoteModel emoteModel : list) {
                    if (((LinkedHashMap) C31106CIs.LJFF).get(emoteModel.emoteId) == null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C31106CIs.LJI.add(((EmoteModel) it.next()).emoteId);
                        }
                        return;
                    }
                }
            }
            C31106CIs.LJIIIIZZ.put(Integer.valueOf(afS31S0201000_5.i2), EnumC31110CIw.LOAD_SUCCESS);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.tv0(EmoteBitmapListChannel.class, C31106CIs.LIZ(afS31S0201000_5.i2));
            dataChannelGlobal.tv0(EmoteBaseInformationListChannel.class, C31106CIs.LIZ(afS31S0201000_5.i2));
            return;
        }
        C31106CIs.LIZLLL(arrayList, (Resources) afS31S0201000_5.l0, true, afS31S0201000_5.i2);
    }

    public AfS31S0201000_5(int i, Resources resources, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = resources;
        this.l1 = null;
    }

    public AfS31S0201000_5(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
