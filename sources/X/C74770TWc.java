package X;

import Y.AfS0S0311000_13;
import Y.AfS3S0501000_13;
import Y.AfS65S0100000_13;
import android.app.Activity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.AudienceMultiGuestPermissionResponseData;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Arrays;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TWc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74770TWc {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> LIZJ;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C74773TWf.LJLIL);

    public static String LIZLLL() {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_VoiceChatPermissionManager_", LJ, LIZ2);
        }
        return "VoiceChatPermissionManager";
    }

    public static void LJ(Long l) {
        MultiGuestDataHolder multiGuestDataHolder;
        long j;
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        if (c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER") != null) {
            Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
            if ((obj instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) obj) != null) {
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                multiGuestDataHolder.LJIIZILJ(j);
                multiGuestDataHolder.LJJJ = 0L;
            }
        }
    }

    public static void LJFF(AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData) {
        MultiGuestDataHolder multiGuestDataHolder;
        Long l;
        C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
        String str = null;
        if (c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER") != null) {
            Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
            if ((obj instanceof MultiGuestDataHolder) && (multiGuestDataHolder = (MultiGuestDataHolder) obj) != null) {
                MultiGuestPermissionInfo multiGuestPermissionInfo = audienceMultiGuestPermissionResponseData.permissionInfo;
                if (multiGuestPermissionInfo != null) {
                    l = Long.valueOf(multiGuestPermissionInfo.errCode);
                } else {
                    l = null;
                }
                multiGuestDataHolder.LJJJ = l;
                MultiGuestPermissionInfo multiGuestPermissionInfo2 = audienceMultiGuestPermissionResponseData.permissionInfo;
                if (multiGuestPermissionInfo2 != null) {
                    str = multiGuestPermissionInfo2.noPermissionPrompt;
                }
                multiGuestDataHolder.LJJJI = str;
            }
        }
    }

    public static final void LIZJ(Room room, TYZ tyz) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo2;
        boolean z;
        MultiGuestDataHolder multiGuestDataHolder;
        String str;
        MultiGuestDataHolder multiGuestDataHolder2;
        long j;
        MultiLiveUserApplySettings multiLiveUserApplySettings3;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo3;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        Long l;
        if (room == null) {
            return;
        }
        MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
        if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo = multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo.roomPackSuccessFlag && multiLiveUserSettings != null && (multiLiveUserApplySettings2 = multiLiveUserSettings.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo2 = multiLiveUserApplySettings2.roomAudienceMultiGuestPermissionInfo) != null && roomAudienceMultiGuestPermissionInfo2.permissionInfo != null) {
            if (multiLiveUserSettings != null) {
                z = multiLiveUserSettings.O();
            } else {
                z = false;
            }
            long j2 = 0;
            if (z) {
                C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
                if (c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER") != null) {
                    Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
                    if ((obj instanceof MultiGuestDataHolder) && (multiGuestDataHolder2 = (MultiGuestDataHolder) obj) != null) {
                        MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
                        if (multiLiveUserSettings2 != null && (multiLiveUserApplySettings3 = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (roomAudienceMultiGuestPermissionInfo3 = multiLiveUserApplySettings3.roomAudienceMultiGuestPermissionInfo) != null && (multiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo3.permissionInfo) != null && (l = multiGuestPermissionInfo.linkPermissionType) != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        multiGuestDataHolder2.LJIIZILJ(j);
                        multiGuestDataHolder2.LJJJ = 0L;
                        return;
                    }
                    return;
                }
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings3 = room.multiLiveUserSettings;
            if (multiLiveUserSettings3 == null || !multiLiveUserSettings3.N()) {
                return;
            }
            C75559Tl5 c75559Tl52 = C75559Tl5.LIZIZ;
            if (c75559Tl52.LIZJ().get("MULTI_GUEST_DATA_HOLDER") == null) {
                return;
            }
            Object obj2 = c75559Tl52.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
            if (!(obj2 instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) obj2) == null) {
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings4 = room.multiLiveUserSettings;
            if (multiLiveUserSettings4 != null) {
                j2 = multiLiveUserSettings4.L();
            }
            multiGuestDataHolder.LJJJ = Long.valueOf(j2);
            MultiLiveUserSettings multiLiveUserSettings5 = room.multiLiveUserSettings;
            if (multiLiveUserSettings5 != null) {
                str = multiLiveUserSettings5.M();
            } else {
                str = "";
            }
            multiGuestDataHolder.LJJJI = str;
            return;
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)) == null) {
            return;
        }
        ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r1.appId(), r1.liveId())).LIZLLL(C73933Szx.LJ(tyz))).LIZJ(C74771TWd.LJLIL, new AfS65S0100000_13(tyz, 107));
    }

    public static void LIZ(DataChannel dataChannel, int i, Activity activity, Long l, InterfaceC88472Yns interfaceC88472Yns, AqS163S0100000_13 aqS163S0100000_13) {
        long j;
        OSZ osz;
        AqS58S0400000_13 aqS58S0400000_13 = new AqS58S0400000_13(activity, dataChannel, interfaceC88472Yns, aqS163S0100000_13, 5);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        int LIZIZ2 = TRK.LIZIZ(j);
        if (LIZIZ2 == 2) {
            osz = new OSZ(Boolean.valueOf(C76944UHs.LIZIZ(activity, "android.permission.RECORD_AUDIO")), new String[]{"android.permission.RECORD_AUDIO"});
        } else {
            String LIZLLL2 = LIZLLL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cannot enter here, linkPermission is :");
            LIZ2.append(LIZIZ2);
            LIZ2.append(", need to check the specific_permission_bit_map value from server");
            C32014ChO.LIZJ(LIZLLL2, X1D.LIZIZ(LIZ2), null);
            osz = new OSZ(Boolean.valueOf(C76944UHs.LIZIZ(activity, "android.permission.RECORD_AUDIO")), new String[]{"android.permission.RECORD_AUDIO"});
        }
        if (((Boolean) osz.getFirst()).booleanValue()) {
            aqS58S0400000_13.invoke(Integer.valueOf(i));
            return;
        }
        C61099NyR LIZIZ3 = C61099NyR.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-voice_chat_check_audio_record_permission"));
        String[] strArr = (String[]) osz.getSecond();
        LIZIZ3.LIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C76589U4b(aqS58S0400000_13, i, osz, activity));
    }

    public static void LIZIZ(Room room, DataChannel dataChannel, InterfaceC74617TQf interfaceC74617TQf, int i, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2) {
        Long l;
        o.LJIIIZ(room, "room");
        if (LIZ) {
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
        LIZ2.append("roomId:");
        LIZ2.append(room.getId());
        LIZ2.append("; userId:");
        LIZ2.append(room.getOwnerUserId());
        TYQ.LIZLLL("LinkIn_Guest_Permission", X1D.LIZIZ(LIZ2));
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)) == null) {
            return;
        }
        LIZ = true;
        C73495Sst LIZJ2 = ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r1.appId(), r1.liveId())).LIZLLL(C73933Szx.LJ(interfaceC74617TQf))).LIZJ(new AfS3S0501000_13(dataChannel, interfaceC74617TQf, i, interfaceC88472Yns, interfaceC88471Ynr, interfaceC88471Ynr2, 1), new AfS0S0311000_13(z, dataChannel, interfaceC65784Pro, interfaceC74617TQf, i, 1));
        o.LJIIIIZZ(LIZJ2, "dataChannel: DataChannel…          )\n            }");
        C73318Sq2 cb = (C73318Sq2) LIZLLL.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LIZJ2);
    }
}
