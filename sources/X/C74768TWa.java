package X;

import Y.AfS0S0311000_13;
import Y.AfS3S0501000_13;
import Y.AfS57S0100000_5;
import android.app.Activity;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.TWa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74768TWa {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> LIZJ;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C74775TWh.LJLIL);

    public static long LIZJ(Room room) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long l;
        o.LJIIIZ(room, "room");
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo.permissionInfo) != null && (l = multiGuestPermissionInfo.linkPermissionType) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static void LJ(Long l) {
        long j;
        TVD LIZ2 = TTV.LIZ();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        LIZ2.LIZJ(j);
        LIZ2.LJIJI = 0L;
    }

    public static final void LIZLLL(Room room, LiveWidget viewInterface) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo2;
        long j;
        String str;
        o.LJIIIZ(viewInterface, "viewInterface");
        if (room == null) {
            return;
        }
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag && multiLiveUserSettings != null && (multiLiveUserApplySettings2 = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo2 = multiLiveUserApplySettings2.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo2.permissionInfo != null) {
            if (multiLiveUserSettings != null && multiLiveUserSettings.O()) {
                LJ(Long.valueOf(LIZJ(room)));
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
            if (multiLiveUserSettings2 == null || !multiLiveUserSettings2.N()) {
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings3 = room.multiLiveUserSettings;
            if (multiLiveUserSettings3 != null) {
                j = multiLiveUserSettings3.L();
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            MultiLiveUserSettings multiLiveUserSettings4 = room.multiLiveUserSettings;
            if (multiLiveUserSettings4 != null) {
                str = multiLiveUserSettings4.M();
            } else {
                str = "";
            }
            LJFF(valueOf, str);
            return;
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)) == null) {
            return;
        }
        ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r1.appId(), r1.liveId())).LIZLLL(C73933Szx.LJ(viewInterface))).LIZJ(TWZ.LJLIL, new AfS57S0100000_5(viewInterface, 17));
    }

    public static void LJFF(Long l, String str) {
        long j;
        TVD LIZ2 = TTV.LIZ();
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        LIZ2.LJIJI = j;
        LIZ2.LJIJJ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(boolean z, int i, Activity activity, Long l, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        long j;
        OSZ osz;
        String str;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (TTV.LIZIZ(j) == 2) {
            osz = new OSZ(Boolean.valueOf(C76944UHs.LIZIZ(activity, "android.permission.RECORD_AUDIO")), "android.permission.RECORD_AUDIO");
        } else {
            osz = new OSZ(Boolean.FALSE, "android.permission.RECORD_AUDIO");
        }
        if (((Boolean) osz.getFirst()).booleanValue()) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
            return;
        }
        C61099NyR.LIZIZ.LIZIZ(activity, C78857UxB.LJJIIJ(1476788234, "bpea-live_studio_link_mic_audio")).LIZ(osz.getSecond()).LIZJ(new C76591U4d(interfaceC88472Yns, i, z, activity, osz, interfaceC65784Pro, interfaceC65784Pro2));
        String[] strArr = {osz.getSecond()};
        HashMap hashMap = new HashMap();
        TWL.LIZ(hashMap);
        if (z) {
            str = TWL.LJI;
        } else {
            str = C78983UzD.LJLLILLLL;
        }
        if (str == null) {
            str = "";
        }
        hashMap.put("check_permission_scene", str);
        hashMap.put("popup_type", "first_popup");
        hashMap.put("guest_permission", TWL.LJI(false, null));
        hashMap.put("require_permission", TWL.LJII(strArr));
        TWL.LJIL("livesdk_guest_sys_permission_show", hashMap);
    }

    public static void LIZIZ(Room room, DataChannel dataChannel, TSX tsx, int i, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2) {
        C73318Sq2 cb;
        Long l;
        o.LJIIIZ(room, "room");
        if (LIZ || tsx == null) {
            return;
        }
        if (i == 1 && LIZIZ) {
            BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> baseResponse = LIZJ;
            if (baseResponse != null) {
                if (interfaceC88471Ynr2 != null) {
                    MultiGuestPermissionInfo multiGuestPermissionInfo = baseResponse.data.permissionInfo;
                    if (multiGuestPermissionInfo != null) {
                        l = multiGuestPermissionInfo.linkPermissionType;
                    } else {
                        l = null;
                    }
                    interfaceC88471Ynr2.invoke(l, Integer.valueOf(i));
                }
                LIZIZ = false;
                return;
            }
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LinkIn_Guest_Permission, roomId:");
        LIZ2.append(room.getId());
        LIZ2.append("; userId:");
        LIZ2.append(room.getOwnerUserId());
        TYP.LIZJ("GameLinkPermissionManager", X1D.LIZIZ(LIZ2));
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)) == null) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("LinkIn_Guest_Permission2, roomId:");
        LIZ3.append(room.getId());
        LIZ3.append("; userId:");
        LIZ3.append(room.getOwnerUserId());
        LIZ3.append("， viewInterface:");
        LIZ3.append(tsx);
        LIZ3.append(", compositeDisposable.isDisposed:");
        C62822Ol8 c62822Ol8 = LIZLLL;
        LIZ3.append(((C73318Sq2) c62822Ol8.getValue()).LJLILLLLZI);
        TYP.LIZ("GameLinkPermissionManager", X1D.LIZIZ(LIZ3), true);
        LIZ = true;
        C73495Sst LIZJ2 = ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r5.appId(), r5.liveId())).LIZLLL(C73933Szx.LJ(tsx))).LIZJ(new AfS3S0501000_13(dataChannel, tsx, i, interfaceC88472Yns, interfaceC88471Ynr, interfaceC88471Ynr2, 0), new AfS0S0311000_13(z, dataChannel, interfaceC65784Pro, tsx, i, 0));
        o.LJIIIIZZ(LIZJ2, "dataChannel: DataChannel…          )\n            }");
        if (((C73318Sq2) c62822Ol8.getValue()).LJLILLLLZI) {
            cb = new C73318Sq2();
        } else {
            cb = (C73318Sq2) c62822Ol8.getValue();
        }
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LIZJ2);
    }
}
