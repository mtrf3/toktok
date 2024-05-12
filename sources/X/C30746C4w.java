package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.C4w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30746C4w {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C30747C4x.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C30748C4y.LJLIL);

    public static boolean LIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static void LIZJ(SlimRoom slimRoom, EnterRoomConfig config) {
        boolean z;
        Long l;
        SlimRoom.RoomAuthStatus roomAuthStatus;
        String str;
        Long l2;
        o.LJIIIZ(config, "config");
        if (slimRoom != null) {
            config.mStreamData.streamRoomId = slimRoom.getId();
            int i = 1;
            if (slimRoom.multiStreamScene == 1) {
                z = true;
            } else {
                z = false;
            }
            Long l3 = null;
            if (z && slimRoom.getExtraStreamData() != null && slimRoom.getExtraStreamDefaultQualitySdkKey() != null && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
                String buildExtraSreamPullUrl = slimRoom.buildExtraSreamPullUrl();
                String extraSdkParams = slimRoom.getExtraSdkParams();
                String extraStreamData = slimRoom.getExtraStreamData();
                String extraStreamDefaultQualitySdkKey = slimRoom.getExtraStreamDefaultQualitySdkKey();
                int ordinal = slimRoom.getStreamType().ordinal();
                StreamUrlExtra.SrConfig srConfig = slimRoom.getExtraStreamUrlExtra().srConfig;
                StreamUrl streamUrl = slimRoom.multiStreamUrl;
                if (streamUrl != null) {
                    l2 = Long.valueOf(streamUrl.streamDelayMs);
                } else {
                    l2 = null;
                }
                C78847Ux1.LJIILJJIL(config, buildExtraSreamPullUrl, extraSdkParams, extraStreamData, extraStreamDefaultQualitySdkKey, ordinal, srConfig, l2, slimRoom.getOptions());
            } else {
                String buildPullUrl = slimRoom.buildPullUrl();
                String sdkParams = slimRoom.getSdkParams();
                String multiStreamData = slimRoom.getMultiStreamData();
                String multiStreamDefaultQualitySdkKey = slimRoom.getMultiStreamDefaultQualitySdkKey();
                int ordinal2 = slimRoom.getStreamType().ordinal();
                StreamUrlExtra.SrConfig srConfig2 = slimRoom.getStreamUrlExtraSafely().srConfig;
                StreamUrl streamUrl2 = slimRoom.getStreamUrl();
                if (streamUrl2 != null) {
                    l = Long.valueOf(streamUrl2.streamDelayMs);
                } else {
                    l = null;
                }
                C78847Ux1.LJIILJJIL(config, buildPullUrl, sdkParams, multiStreamData, multiStreamDefaultQualitySdkKey, ordinal2, srConfig2, l, slimRoom.getOptions());
            }
            if (slimRoom.getLinkMic() != null) {
                EnterRoomConfig.GuestUser guestUser = config.mRoomsData.guestUser;
                if (guestUser != null && guestUser.uid == 0 && slimRoom.getLinkMic().followedList != null && slimRoom.getLinkMic().followedList.size() > 0) {
                    EnterRoomConfig.GuestUser guestUser2 = config.mRoomsData.guestUser;
                    if (guestUser2 != null) {
                        guestUser2.uid = ((User) ListProtector.get(slimRoom.getLinkMic().followedList, 0)).getId();
                    }
                    EnterRoomConfig.GuestUser guestUser3 = config.mRoomsData.guestUser;
                    if (guestUser3 != null) {
                        guestUser3.nickName = C05170If.LJ((User) ListProtector.get(slimRoom.getLinkMic().followedList, 0));
                    }
                }
                if (slimRoom.getLinkMic().audienceIdList != null) {
                    EnterRoomConfig.GuestUser guestUser4 = config.mRoomsData.guestUser;
                    if (guestUser4 != null) {
                        if (slimRoom.getLinkMic().audienceIdList.size() <= 0) {
                            i = 0;
                        }
                        guestUser4.isGuestEnter = i;
                    }
                    EnterRoomConfig.GuestUser guestUser5 = config.mRoomsData.guestUser;
                    if (guestUser5 != null) {
                        List<Long> list = slimRoom.getLinkMic().audienceIdList;
                        EnterRoomConfig.GuestUser guestUser6 = config.mRoomsData.guestUser;
                        if (guestUser6 != null) {
                            l3 = Long.valueOf(guestUser6.uid);
                        }
                        if (list.contains(l3)) {
                            str = "guest";
                        } else {
                            str = "anchor";
                        }
                        guestUser5.distributionType = str;
                    }
                }
            }
            config.mRoomsData.hasCommerceGoods = Boolean.valueOf(slimRoom.hasCommerceGoods);
            WarningTag warningTag = slimRoom.warningTag;
            if (warningTag != null) {
                config.mRoomsData.warningTag = warningTag;
            }
            MaskLayer maskLayer = slimRoom.maskLayer;
            if (maskLayer != null) {
                config.mRoomsData.maskLayer = maskLayer;
            }
            if (slimRoom.getStreamUrl() != null) {
                config.mStreamData.captionStreamDelayMs = slimRoom.getStreamUrl().streamDelayMs;
            }
            EnterRoomConfig.RoomsData roomsData = config.mRoomsData;
            if (roomsData.commerceStruct == null && (roomAuthStatus = slimRoom.roomAuthStatus) != null && roomAuthStatus.commercePermission > 0) {
                CommerceStruct commerceStruct = new CommerceStruct();
                commerceStruct.commercePermission = slimRoom.roomAuthStatus.commercePermission;
                roomsData.commerceStruct = commerceStruct;
            }
        }
    }

    public static java.util.Map LIZIZ(String str, String str2, SlimRoom slimRoom) {
        String str3;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from_merge", str);
        oszArr[1] = new OSZ("enter_method", str2);
        String str4 = null;
        if (slimRoom != null) {
            str3 = slimRoom.getMultiStreamData();
        } else {
            str3 = null;
        }
        oszArr[2] = new OSZ("stream_info", str3);
        if (slimRoom != null) {
            str4 = slimRoom.getOptions();
        }
        oszArr[3] = new OSZ("options", str4);
        return C113554cx.LJJL(oszArr);
    }
}
