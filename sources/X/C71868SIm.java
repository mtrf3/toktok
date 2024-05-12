package X;

import android.view.View;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrl;
import com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra;
import com.ss.android.ugc.aweme.feed.model.live.LiveUser;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.result.common.core.ui.LiveInnerFlowAbility;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.SIm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71868SIm extends AbstractC71870SIo {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        boolean z;
        Object obj;
        long currentTimeMillis;
        boolean z2;
        String str;
        boolean z3;
        String str2;
        View view;
        LiveUser liveUser;
        LiveStreamUrl liveStreamUrl;
        LiveStreamUrlExtra.SrConfig srConfig;
        LiveStreamUrlExtra.SrConfig srConfig2;
        String LJIIJ;
        InterfaceC71869SIn interfaceC71869SIn = (InterfaceC71869SIn) xBaseParamModel;
        o.LJIIIZ(type, "type");
        long parseLong = CastLongProtector.parseLong(interfaceC71869SIn.getRoomId());
        String playerTag = interfaceC71869SIn.getPlayerTag();
        if (C78685UuP.LJJJZ(playerTag)) {
            C2U8.LIZ(new C2UR(Long.valueOf(parseLong)));
        }
        Boolean hasCommerceGoods = interfaceC71869SIn.getHasCommerceGoods();
        if (hasCommerceGoods != null) {
            z = hasCommerceGoods.booleanValue();
        } else {
            z = false;
        }
        String enterFromMerge = interfaceC71869SIn.getEnterFromMerge();
        String enterMethod = interfaceC71869SIn.getEnterMethod();
        String autoRouteSchema = interfaceC71869SIn.getAutoRouteSchema();
        String owner = interfaceC71869SIn.getOwner();
        if (owner == null) {
            owner = "";
        }
        HashMap<String, String> hashMap = new HashMap<>();
        java.util.Map<String, Object> logExtra = interfaceC71869SIn.getLogExtra();
        if (logExtra != null) {
            for (Map.Entry<String, Object> entry : logExtra.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        java.util.Map<String, Object> logExtra2 = interfaceC71869SIn.getLogExtra();
        if (logExtra2 != null) {
            obj = logExtra2.get("list_item_id");
        } else {
            obj = null;
        }
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        hashMap.put("list_item_id", obj);
        hashMap.put("source_page_type", "live");
        String streamData = interfaceC71869SIn.getStreamData();
        if (streamData == null) {
            streamData = "";
        }
        String str3 = (String) hashMap.get("click_timestamp");
        if (str3 == null) {
            str3 = String.valueOf(System.currentTimeMillis());
        }
        o.LJIIIIZZ(str3, "logExtra[\"click_timestam…ntTimeMillis().toString()");
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = parseLong;
        roomsData.enterFromMerge = enterFromMerge;
        EnterRoomConfig.TimeStamp timeStamp = roomsData.timeStamps;
        if (timeStamp != null) {
            try {
                currentTimeMillis = CastLongProtector.parseLong(str3);
            } catch (NumberFormatException unused) {
                currentTimeMillis = System.currentTimeMillis();
            }
            timeStamp.enterRoomStarTimeReal = currentTimeMillis;
        }
        enterRoomConfig.mRoomsData.enterMethod = enterMethod;
        if (autoRouteSchema != null && !ujb.o.LJJJJJL(autoRouteSchema) && (LJIIJ = M2T.LJIIJ(1, autoRouteSchema)) != null) {
            enterRoomConfig.mRoomsData.extraSchema = ECommerceService.createIECommerceServicebyMonsterPlugin(false).prefetchPdpEnterLiveRoom(LJIIJ);
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        if (z) {
            z2 = true;
        } else {
            z2 = false;
        }
        roomsData2.hasCommerceGoods = Boolean.valueOf(z2);
        EnterRoomConfig.ECWrapData eCWrapData = enterRoomConfig.mECData;
        eCWrapData.autoOpenProductBag = 0;
        eCWrapData.autoOpenProductBagTrackParams = "{}";
        eCWrapData.isFromECContext = 1;
        eCWrapData.ecCommonExtraParam = hashMap;
        eCWrapData.optAutoRouteSchemeRouting = 1;
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String str4 = (String) hashMap.get("search_id");
        if (str4 == null) {
            str4 = "";
        }
        logData.search_id = str4;
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        String str5 = (String) hashMap.get("search_type");
        if (str5 == null) {
            str5 = "";
        }
        logData2.search_type = str5;
        EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
        String str6 = (String) hashMap.get("search_keyword");
        if (str6 == null) {
            str6 = "";
        }
        logData3.search_keyword = str6;
        EnterRoomConfig.LogData logData4 = enterRoomConfig.mLogData;
        String str7 = (String) hashMap.get("source_module");
        if (str7 != null) {
            str = s.LJJZZIII("_outer_flow", str7);
        } else {
            str = null;
        }
        logData4.sourceModule = str;
        EnterRoomConfig.LogData logData5 = enterRoomConfig.mLogData;
        String str8 = (String) hashMap.get("list_item_id");
        if (str8 == null) {
            str8 = "";
        }
        logData5.list_item_id = str8;
        EnterRoomConfig.LogData logData6 = enterRoomConfig.mLogData;
        String str9 = (String) hashMap.get("search_result_id");
        if (str9 == null) {
            str9 = "";
        }
        logData6.search_result_id_v2 = str9;
        EnterRoomConfig.LogData logData7 = enterRoomConfig.mLogData;
        logData7.search_result_type = 2;
        if (C78857UxB.LJJJIL(logData7.sourceModule)) {
            hashMap.put("source_module", enterRoomConfig.mLogData.sourceModule + "_outer_flow");
        }
        C34K c34k = new C34K();
        C76732zl c76732zl = new C76732zl();
        if ((!ujb.o.LJJJJJL(streamData)) && (!ujb.o.LJJJJJL(owner))) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (ujb.o.LJJJJJL(streamData)) {
            c76732zl.element |= 4;
        }
        if (ujb.o.LJJJJJL(owner)) {
            c76732zl.element = 2 | c76732zl.element;
        }
        if (z3) {
            NewLiveRoomStruct newLiveRoomStruct = new NewLiveRoomStruct();
            try {
                Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), owner, C65330PkU.LIZJ(C65352Pkq.LJI(LiveUser.class)));
                if (!(fromJson instanceof LiveUser)) {
                    fromJson = null;
                }
                liveUser = (LiveUser) fromJson;
            } catch (com.google.gson.s unused2) {
                liveUser = null;
            }
            newLiveRoomStruct.owner = liveUser;
            try {
                Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), streamData, C65330PkU.LIZJ(C65352Pkq.LJI(LiveStreamUrl.class)));
                if (!(fromJson2 instanceof LiveStreamUrl)) {
                    fromJson2 = null;
                }
                liveStreamUrl = (LiveStreamUrl) fromJson2;
            } catch (com.google.gson.s unused3) {
                liveStreamUrl = null;
            }
            newLiveRoomStruct.stream_url = liveStreamUrl;
            newLiveRoomStruct.id = parseLong;
            if (C78685UuP.LJJJZ(playerTag)) {
                String multiStreamData = newLiveRoomStruct.getMultiStreamData();
                String multiStreamDefaultQualitySdkKey = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
                int ordinal = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
                LiveStreamUrlExtra streamUrlExtra = newLiveRoomStruct.getStreamUrlExtra();
                if (streamUrlExtra != null) {
                    srConfig2 = streamUrlExtra.getSrConfig();
                } else {
                    srConfig2 = null;
                }
                C78857UxB.LJIILIIL(enterRoomConfig, multiStreamData, multiStreamDefaultQualitySdkKey, ordinal, srConfig2, newLiveRoomStruct.getOptions());
                InterfaceC28737BPp LJJJJZ = LiveOuterService.LJJJLL().LJJIJIL().LJJJJZ(playerTag);
                if (LJJJJZ == null) {
                    c76732zl.element = 1 | c76732zl.element;
                } else if (C78685UuP.LJJJZ(LJJJJZ.LJJIJ()) && o.LJ(LJJJJZ.LJJIJ(), newLiveRoomStruct.getMultiStreamData())) {
                    LJJJJZ.LJIIIZ(false);
                    enterRoomConfig.mStreamData.sharePullStreamData = newLiveRoomStruct.getMultiStreamData();
                    enterRoomConfig.mRoomsData.warmUpPlayerTag = playerTag;
                    c34k.element = true;
                } else {
                    c76732zl.element |= 8;
                }
            }
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            long j = newLiveRoomStruct.id;
            roomsData3.roomId = j;
            enterRoomConfig.mStreamData.streamRoomId = j;
            String multiStreamData2 = newLiveRoomStruct.getMultiStreamData();
            String multiStreamDefaultQualitySdkKey2 = newLiveRoomStruct.getMultiStreamDefaultQualitySdkKey();
            int ordinal2 = RoomStruct.getStreamType(newLiveRoomStruct).ordinal();
            LiveStreamUrlExtra streamUrlExtra2 = newLiveRoomStruct.getStreamUrlExtra();
            if (streamUrlExtra2 != null) {
                srConfig = streamUrlExtra2.getSrConfig();
            } else {
                srConfig = null;
            }
            C78857UxB.LJIILIIL(enterRoomConfig, multiStreamData2, multiStreamDefaultQualitySdkKey2, ordinal2, srConfig, newLiveRoomStruct.getOptions());
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (view = interfaceC38263Ezz.getView()) != null) {
            ((LiveInnerFlowAbility) C55096Ljo.LIZIZ(C55230Lly.LJ(view), LiveInnerFlowAbility.class)).Fc(enterRoomConfig, String.valueOf(parseLong));
        }
        C76542zS.LIZJ("rd_ec_webcast_room_schema", new C71315Ryp(parseLong, enterFromMerge, enterMethod, streamData, owner, playerTag, c34k, c76732zl));
        InterfaceC38263Ezz interfaceC38263Ezz2 = this.LJLIL;
        if (interfaceC38263Ezz2 != null) {
            str2 = interfaceC38263Ezz2.LIZIZ();
        } else {
            str2 = null;
        }
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC71871SIp.class, str2), "");
    }
}
