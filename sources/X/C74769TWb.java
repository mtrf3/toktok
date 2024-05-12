package X;

import Y.AfS0S0311000_13;
import Y.AfS3S0501000_13;
import Y.AfS57S0100000_5;
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
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS51S0400000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.TWb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74769TWb {
    public static boolean LIZ;
    public static boolean LIZIZ;
    public static BaseResponse<AudienceMultiGuestPermissionResponseData, CheckPermissionExtra> LIZJ;
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C74774TWg.LJLIL);

    public static long LJ(Room room) {
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

    public static String LJI(int i) {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_MultiGuestPermissionManager_", LJ, LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ3, "_MultiGuestPermissionManager_", i, LIZ3);
    }

    public static void LJII(Long l) {
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

    public static void LJIIIIZZ(AudienceMultiGuestPermissionResponseData audienceMultiGuestPermissionResponseData) {
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

    public static final void LJFF(Room room, InterfaceC75495Tk3 viewInterface) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo2;
        boolean z;
        MultiGuestDataHolder multiGuestDataHolder;
        String str;
        MultiGuestDataHolder multiGuestDataHolder2;
        o.LJIIIZ(viewInterface, "viewInterface");
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
            long j = 0;
            if (z) {
                C75559Tl5 c75559Tl5 = C75559Tl5.LIZIZ;
                if (c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER") != null) {
                    Object obj = c75559Tl5.LIZJ().get("MULTI_GUEST_DATA_HOLDER");
                    if ((obj instanceof MultiGuestDataHolder) && (multiGuestDataHolder2 = (MultiGuestDataHolder) obj) != null) {
                        multiGuestDataHolder2.LJIIZILJ(LJ(room));
                        multiGuestDataHolder2.LJJJ = 0L;
                        return;
                    }
                    return;
                }
                return;
            }
            MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
            if (multiLiveUserSettings2 == null || !multiLiveUserSettings2.N()) {
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
            MultiLiveUserSettings multiLiveUserSettings3 = room.multiLiveUserSettings;
            if (multiLiveUserSettings3 != null) {
                j = multiLiveUserSettings3.L();
            }
            multiGuestDataHolder.LJJJ = Long.valueOf(j);
            MultiLiveUserSettings multiLiveUserSettings4 = room.multiLiveUserSettings;
            if (multiLiveUserSettings4 != null) {
                str = multiLiveUserSettings4.M();
            } else {
                str = "";
            }
            multiGuestDataHolder.LJJJI = str;
            return;
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)) == null) {
            return;
        }
        ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r1.appId(), r1.liveId())).LIZLLL(C73933Szx.LJ(viewInterface))).LIZJ(C74772TWe.LJLIL, new AfS57S0100000_5(viewInterface, 309));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(boolean r9, int r10, android.app.Activity r11, java.lang.Long r12, X.InterfaceC88472Yns r13, X.InterfaceC65784Pro r14) {
        /*
            if (r12 == 0) goto Lbd
            long r0 = r12.longValue()
        L6:
            int r1 = X.TRK.LIZIZ(r0)
            r0 = 1
            java.lang.String r3 = "android.permission.CAMERA"
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            r8 = r11
            if (r1 == r0) goto L4f
            r0 = 2
            if (r1 == r0) goto L39
            r0 = 3
            if (r1 == r0) goto L4f
            X.OSZ r6 = new X.OSZ
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String[] r0 = new java.lang.String[]{r2, r3}
            r6.<init>(r1, r0)
        L23:
            java.lang.Object r0 = r6.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = r10
            r3 = r13
            if (r0 == 0) goto Lc1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.invoke(r0)
            return
        L39:
            X.OSZ r6 = new X.OSZ
            java.lang.String[] r0 = new java.lang.String[]{r2}
            boolean r0 = X.C76944UHs.LIZIZ(r8, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String[] r0 = new java.lang.String[]{r2}
            r6.<init>(r1, r0)
            goto L23
        L4f:
            java.lang.String[] r0 = new java.lang.String[]{r2}
            boolean r0 = X.C76944UHs.LIZIZ(r8, r0)
            if (r0 == 0) goto L6f
            java.lang.String[] r0 = new java.lang.String[]{r3}
            boolean r0 = X.C76944UHs.LIZIZ(r8, r0)
            if (r0 != 0) goto L6f
            X.OSZ r6 = new X.OSZ
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String[] r0 = new java.lang.String[]{r3}
            r6.<init>(r1, r0)
            goto L23
        L6f:
            java.lang.String[] r0 = new java.lang.String[]{r2}
            boolean r0 = X.C76944UHs.LIZIZ(r8, r0)
            if (r0 != 0) goto L8f
            java.lang.String[] r0 = new java.lang.String[]{r3}
            boolean r0 = X.C76944UHs.LIZIZ(r8, r0)
            if (r0 == 0) goto L8f
            X.OSZ r6 = new X.OSZ
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String[] r0 = new java.lang.String[]{r2}
            r6.<init>(r1, r0)
            goto L23
        L8f:
            java.lang.String[] r0 = new java.lang.String[]{r2}
            boolean r0 = X.C76944UHs.LIZIZ(r8, r0)
            if (r0 != 0) goto Lb0
            java.lang.String[] r0 = new java.lang.String[]{r3}
            boolean r0 = X.C76944UHs.LIZIZ(r8, r0)
            if (r0 != 0) goto Lb0
            X.OSZ r6 = new X.OSZ
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String[] r0 = new java.lang.String[]{r2, r3}
            r6.<init>(r1, r0)
            goto L23
        Lb0:
            X.OSZ r6 = new X.OSZ
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String[] r0 = new java.lang.String[]{r2, r3}
            r6.<init>(r1, r0)
            goto L23
        Lbd:
            r0 = 0
            goto L6
        Lc1:
            X.NyQ r2 = X.C61099NyR.LIZIZ
            java.lang.String r1 = "bpea-check_audio_and_camera_permission_multiguest"
            r0 = 1476788234(0x5806000a, float:5.893389E14)
            X.UxG r0 = X.C78857UxB.LJJIIJ(r0, r1)
            X.NyR r2 = r2.LIZIZ(r8, r0)
            java.lang.Object r1 = r6.getSecond()
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            X.NyS r0 = r2.LIZ(r0)
            X.U4c r2 = new X.U4c
            r5 = r9
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.LIZJ(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74769TWb.LIZIZ(boolean, int, android.app.Activity, java.lang.Long, X.Yns, X.Pro):void");
    }

    public static void LIZ(boolean z, DataChannel dataChannel, int i, Activity activity, Long l, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro) {
        LIZIZ(z, i, activity, l, new AqS51S0400000_5(activity, (Activity) dataChannel, (DataChannel) interfaceC88472Yns, (InterfaceC88472Yns<? super Integer, C76800UCe>) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 4), null);
    }

    public static void LIZJ(Room room, DataChannel dataChannel, InterfaceC74596TPk interfaceC74596TPk, int i, boolean z, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr interfaceC88471Ynr2) {
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
        C73495Sst LIZJ2 = ((InterfaceC29205BdB) T28.LIZLLL(((LinkApi) Q7L.LIZIZ(LinkApi.class)).checkAudienceSelfPermission(room.getId(), r1.appId(), r1.liveId())).LIZLLL(C73933Szx.LJ(interfaceC74596TPk))).LIZJ(new AfS3S0501000_13(dataChannel, interfaceC74596TPk, i, interfaceC88472Yns, interfaceC88471Ynr, interfaceC88471Ynr2, 3), new AfS0S0311000_13(z, dataChannel, interfaceC65784Pro, interfaceC74596TPk, i, 2));
        o.LJIIIIZZ(LIZJ2, "dataChannel: DataChannel…          )\n            }");
        C73318Sq2 cb = (C73318Sq2) LIZLLL.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LIZJ2);
    }
}
