package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.LiveModeChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.livesdk.broadcast.LiveEducationTouchChannel;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.chatroom.model.RoomTag;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewComponentsSimplifyTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSimplifiedGoLivePageSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSlowFunctionOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.preview.LivePreviewMoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0N7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0N7 {
    public static long LIZ;

    public static final JSONObject LIZ(long j) {
        new JSONObject();
        try {
            JSONObject put = new JSONObject().put("product_line", "live").put("version", "preview_version").put("live_sdk_version", "preview_version").put("report_version", 5).put("timestamp", j).put("mode", "push").put("project_key", "live-stream-sdk");
            o.LJIIIIZZ(put, "JSONObject()\n           …t_key\",\"live-stream-sdk\")");
            return put;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static final int LIZJ(LiveMode liveMode) {
        String str;
        Gson gson = C09650Zl.LIZIZ;
        java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.LJIJ.LIZJ();
        if (liveMode != null) {
            str = liveMode.name();
        } else {
            str = null;
        }
        RoomTag roomTag = (RoomTag) GsonProtectorUtils.fromJson(gson, LIZJ.get(str), RoomTag.class);
        if (roomTag != null) {
            return roomTag.id;
        }
        return -1;
    }

    public static final void LJIIJ(LiveMode liveMode) {
        if (liveMode != null) {
            C29702BlC LIZ2 = C18230nb.LIZ("ttlive_change_mode");
            LIZ2.LJ("preview");
            LIZ2.LIZLLL("select_live_mode", liveMode.name());
            LIZ2.LJIIIZ();
        }
    }

    public static final void LJIILL(DataChannel dataChannel) {
        Boolean bool;
        String str;
        LiveMode liveMode;
        LiveMode liveMode2;
        String str2 = null;
        if (dataChannel != null && (liveMode2 = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            bool = Boolean.valueOf(C28509BGv.LJI(liveMode2));
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            if (LivePreviewComponentsSimplifyTypeSetting.INSTANCE.inExperiment()) {
                str = "live_detail";
            } else if (LiveSimplifiedGoLivePageSetting.INSTANCE.enableSimplifiedGoLivePageV1orV2()) {
                str = "settings";
            }
            BZI LIZ2 = C28787BRn.LIZ("livesdk_cover_modify_click");
            LIZ2.LJIIL("click");
            if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
                str2 = C28509BGv.LIZ(liveMode);
            }
            C06490Nh.LIZLLL(LIZ2, str2, "live_type", str, "position");
        }
        str = "outside";
        BZI LIZ22 = C28787BRn.LIZ("livesdk_cover_modify_click");
        LIZ22.LJIIL("click");
        if (dataChannel != null) {
            str2 = C28509BGv.LIZ(liveMode);
        }
        C06490Nh.LIZLLL(LIZ22, str2, "live_type", str, "position");
    }

    public static final void LJIIZILJ(LatestBanRecordInfo record) {
        boolean z;
        o.LJIIIZ(record, "record");
        C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_fetch_ban_status_all");
        LIZLLL.LJ("preview");
        LIZLLL.LIZIZ(Long.valueOf(record.banTime), "ban_time");
        LIZLLL.LIZIZ(Long.valueOf(record.banDuration), "ban_duration");
        LIZLLL.LIZ(Integer.valueOf(record.banCount), "ban_count");
        LIZLLL.LIZLLL("ban_reason", record.banReason);
        Boolean valueOf = Boolean.valueOf(record.isBannedForever);
        JSONObject jSONObject = LIZLLL.LIZIZ;
        if (valueOf != null) {
            z = valueOf.booleanValue();
        } else {
            z = false;
        }
        jSONObject.put("is_ban_forever", z);
        LIZLLL.LJI = true;
        LIZLLL.LJIIIZ();
    }

    public static final void LJIJ(boolean z) {
        boolean z2;
        C29702BlC LIZLLL = C18230nb.LIZLLL("ttlive_fetch_pc_mode_all");
        LIZLLL.LJ("preview");
        Boolean valueOf = Boolean.valueOf(z);
        JSONObject jSONObject = LIZLLL.LIZIZ;
        if (valueOf != null) {
            z2 = valueOf.booleanValue();
        } else {
            z2 = false;
        }
        jSONObject.put("support_pc_mode", z2);
        LIZLLL.LJI = true;
        LIZLLL.LJIIIZ();
    }

    public static final void LJJIFFI(JSONObject jSONObject) {
        try {
            jSONObject.put("live_platform_version", C30443Bx9.LIZ());
        } catch (Throwable th) {
            C0NB.LJI("StreamLog", th);
        }
        ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).h0().LJIIIIZZ(jSONObject, true);
    }

    public static final void LJFF(DataChannel dataChannel, String str) {
        String str2;
        if (dataChannel != null) {
            dataChannel.rv0(LiveEducationTouchChannel.class, Boolean.TRUE);
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_live_education_touch");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "touch_type");
        String str3 = (String) DataChannelGlobal.LJLJJI.mv0(C55012Dx.class);
        if (dataChannel != null) {
            str2 = (String) dataChannel.kv0(C28472BFk.class);
        } else {
            str2 = null;
        }
        LIZ2.LJIJJ(LIZIZ(str3, str2, null), "enter_from");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIIIIZZ(DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_golive_page_duration");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis() - LIZ), "stay_duration");
        LIZ2.LJIJJ(str, "quit_type");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIILIIL(DataChannel dataChannel, String str) {
        Object obj;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_takepage_age_verify_pop_up");
        LIZ2.LJIILLIIL(dataChannel);
        if (dataChannel != null) {
            obj = dataChannel.kv0(C28472BFk.class);
        } else {
            obj = null;
        }
        LIZ2.LJIJJ(obj, "enter_from");
        LIZ2.LJIJJ("video_live", "live_type");
        LIZ2.LIZJ(str);
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIJI(DataChannel dataChannel, String str) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_one_account_popup");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(str, "action_type");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIJJ(DataChannel dataChannel, String str) {
        Long l;
        LiveMode liveMode;
        RoomCreateInfo roomCreateInfo;
        BZI LIZ2 = C28787BRn.LIZ("anchor_enter_room");
        LIZ2.LJIILLIIL(dataChannel);
        String str2 = null;
        if (dataChannel != null && (roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class)) != null) {
            l = Long.valueOf(roomCreateInfo.mLastRoomId);
        } else {
            l = null;
        }
        LIZ2.LJIJJ(l, "room_id");
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class)) != null) {
            str2 = C28509BGv.LIZ(liveMode);
        }
        C06490Nh.LIZLLL(LIZ2, str2, "live_type", str, "action_type");
    }

    public static final void LJIJJLI(DataChannel dataChannel, String str) {
        String str2;
        Long l;
        LiveMode streamType;
        Object next;
        ApplicationExitInfo applicationExitInfo;
        Object next2;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str3 = null;
        if (o.LJ(str, "show") && Build.VERSION.SDK_INT >= 30) {
            if (C30097BrZ.LIZ) {
                ApplicationExitInfo applicationExitInfo2 = C30097BrZ.LIZIZ;
                if (applicationExitInfo2 != null) {
                    C30097BrZ.LIZ(applicationExitInfo2, linkedHashMap);
                }
            } else {
                Context applicationContext = GlobalContext.getApplicationContext();
                try {
                    Object LLILL = C16880lQ.LLILL(GlobalContext.getApplicationContext(), "activity");
                    o.LJII(LLILL, "null cannot be cast to non-null type android.app.ActivityManager");
                    List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) LLILL).getHistoricalProcessExitReasons(applicationContext.getPackageName(), 0, 12);
                    o.LJIIIIZZ(historicalProcessExitReasons, "am.getHistoricalProcessE…ntext.packageName, 0, 12)");
                    Long recentGoLiveStartTime = InterfaceC30442Bx8.LJIILIIL.LIZJ();
                    o.LJIIIIZZ(recentGoLiveStartTime, "recentGoLiveStartTime");
                    if (recentGoLiveStartTime.longValue() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (ApplicationExitInfo applicationExitInfo3 : historicalProcessExitReasons) {
                            ApplicationExitInfo applicationExitInfo4 = applicationExitInfo3;
                            if (applicationExitInfo4.getTimestamp() >= recentGoLiveStartTime.longValue() && o.LJ(applicationExitInfo4.getProcessName(), applicationContext.getPackageName())) {
                                arrayList.add(applicationExitInfo3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            next2 = null;
                        } else {
                            next2 = it.next();
                            if (it.hasNext()) {
                                long timestamp = ((ApplicationExitInfo) next2).getTimestamp() - recentGoLiveStartTime.longValue();
                                do {
                                    Object next3 = it.next();
                                    long timestamp2 = ((ApplicationExitInfo) next3).getTimestamp() - recentGoLiveStartTime.longValue();
                                    if (timestamp > timestamp2) {
                                        next2 = next3;
                                        timestamp = timestamp2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        applicationExitInfo = (ApplicationExitInfo) next2;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (ApplicationExitInfo applicationExitInfo5 : historicalProcessExitReasons) {
                            if (o.LJ(applicationExitInfo5.getProcessName(), applicationContext.getPackageName())) {
                                arrayList2.add(applicationExitInfo5);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        if (!it2.hasNext()) {
                            next = null;
                        } else {
                            next = it2.next();
                            if (it2.hasNext()) {
                                long timestamp3 = ((ApplicationExitInfo) next).getTimestamp();
                                do {
                                    Object next4 = it2.next();
                                    long timestamp4 = ((ApplicationExitInfo) next4).getTimestamp();
                                    if (timestamp3 < timestamp4) {
                                        next = next4;
                                        timestamp3 = timestamp4;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        applicationExitInfo = (ApplicationExitInfo) next;
                    }
                    if (applicationExitInfo != null) {
                        C30097BrZ.LIZ = true;
                        C30097BrZ.LIZIZ = applicationExitInfo;
                        C30097BrZ.LIZ(applicationExitInfo, linkedHashMap);
                    }
                } catch (Throwable th) {
                    linkedHashMap.put("app_exit_reason", "-1");
                    String localizedMessage = th.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "";
                    }
                    linkedHashMap.put("app_exit_description", localizedMessage);
                    C0NB.LJI("GoLiveExitExceptionRecord", th);
                }
            }
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_back_to_live");
        LIZ2.LJIILLIIL(dataChannel);
        if (room != null) {
            str2 = room.getIdStr();
        } else {
            str2 = null;
        }
        LIZ2.LJJIIJ(str2);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        LIZ2.LJFF(String.valueOf(l));
        if (room != null && (streamType = room.getStreamType()) != null) {
            str3 = C28509BGv.LIZ(streamType);
        }
        LIZ2.LJIJ(str3);
        LIZ2.LIZJ(str);
        if (!linkedHashMap.isEmpty()) {
            LIZ2.LJJIFFI(linkedHashMap);
        }
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIL(DataChannel dataChannel, String str) {
        Object obj;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_takepage_safety_edu_pop_up");
        LIZ2.LJIILLIIL(dataChannel);
        if (dataChannel != null) {
            obj = dataChannel.kv0(C28472BFk.class);
        } else {
            obj = null;
        }
        LIZ2.LJIJJ(obj, "enter_from");
        LIZ2.LJIJJ("video_live", "live_type");
        LIZ2.LIZJ(str);
        LIZ2.LJJIIJZLJL();
    }

    public static final String LIZIZ(String str, String str2, String str3) {
        int hashCode;
        if (o.LJ(str3, "click_plus") && o.LJ(str2, "notification_page")) {
            return "camera";
        }
        if (str2 == null || ((hashCode = str2.hashCode()) == -1572049565 ? !str2.equals("notification_page") : hashCode == 3452698 ? !str2.equals("push") : !(hashCode == 823500643 && str2.equals("inner_push")))) {
            if (o.LJ(str, "") || str == null) {
                return "camera";
            }
            return str;
        }
        return str2;
    }

    public static final void LJ(final DataChannel dataChannel, final boolean z, final boolean z2) {
        final int i;
        final LiveMode liveMode;
        String str;
        String str2;
        Boolean bool;
        final String str3;
        final String str4;
        boolean z3;
        boolean z4;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Integer num = (Integer) dataChannelGlobal.mv0(C29064Bau.class);
        if (num != null) {
            i = num.intValue();
        } else {
            i = -2;
        }
        Boolean bool2 = null;
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.kv0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        String str5 = (String) dataChannelGlobal.mv0(C55012Dx.class);
        if (dataChannel != null) {
            str = (String) dataChannel.kv0(C28472BFk.class);
            str2 = (String) dataChannel.kv0(C30379Bw7.class);
        } else {
            str = null;
            str2 = null;
        }
        final String LIZIZ = LIZIZ(str5, str, str2);
        if (!User.sSubPermission || i == -2) {
            i = -1;
        }
        C28527BHn c28527BHn = (C28527BHn) dataChannelGlobal.mv0(ECBcToggleChannel.class);
        boolean z5 = false;
        if (c28527BHn == null || liveMode == null) {
            bool = null;
        } else if (liveMode == LiveMode.VIDEO) {
            C28531BHr c28531BHr = c28527BHn.LIZ;
            if (c28531BHr.LJFF || 2 == c28531BHr.LJ) {
                z4 = true;
            } else {
                z4 = false;
            }
            bool = Boolean.valueOf(z4);
        } else {
            C28531BHr c28531BHr2 = c28527BHn.LIZ;
            int i2 = c28531BHr2.LIZJ;
            if (c28531BHr2.LIZLLL || 2 == i2) {
                z3 = true;
            } else {
                z3 = false;
            }
            bool = Boolean.valueOf(z3);
        }
        if (C29306Beo.LJJIFFI(bool)) {
            str3 = "setting";
        } else {
            str3 = "default";
        }
        C28527BHn c28527BHn2 = (C28527BHn) dataChannelGlobal.mv0(ECBcToggleChannel.class);
        if (c28527BHn2 != null) {
            if (liveMode == LiveMode.VIDEO) {
                C28531BHr c28531BHr3 = c28527BHn2.LIZ;
                if (c28531BHr3.LJFF || 2 == c28531BHr3.LJ) {
                    z5 = true;
                }
            } else {
                z5 = C47261Igj.LJJIJIIJI(2, 1).contains(Integer.valueOf(c28527BHn2.LIZ.LIZJ));
            }
            bool2 = Boolean.valueOf(z5);
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        if (LiveSlowFunctionOptSetting.INSTANCE.inSlowFunctionOptNew()) {
            C30326BvG.LIZ(new Runnable() { // from class: X.0N6
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        C0N7.LJIIJJI(DataChannel.this, LIZIZ, liveMode, z, i, str3, str4, z2);
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        } else {
            LJIIJJI(dataChannel, LIZIZ, liveMode, z, i, str3, str4, z2);
        }
    }

    public static final void LIZLLL(String str, String str2, DataChannel dataChannel, String liveType) {
        o.LJIIIZ(liveType, "liveType");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_takepage_widget_base_monitor");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ(liveType, "live_type");
        LIZ2.LJIJJ(str, "action_type");
        LIZ2.LJIJJ(str2, "widget_name");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJII(String str, String str2, long j, DataChannel dataChannel) {
        long j2;
        InterfaceC05190Ih interfaceC05190Ih;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_multi_device_resume_popup");
        InterfaceC29405BgP LIZJ = C279117r.LIZJ(LIZ2, dataChannel);
        if (LIZJ != null && (interfaceC05190Ih = ((C29374Bfu) LIZJ).LIZIZ) != null) {
            j2 = interfaceC05190Ih.getId();
        } else {
            j2 = 0;
        }
        C07250Qf.LIZJ(j2, LIZ2, "anchor_id", str, "action_type");
        LIZ2.LJIJJ(str2, "click_type");
        LIZ2.LJIJJ(Long.valueOf(j), "resume_room_id");
        LIZ2.LJIJJ(1, "cross_device_continue");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIIIZ(Context context, int i, int i2, String str) {
        ActivityC45651qj activityC45651qj;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_broadcast_path_get_room_create_info_from_preview", 0.01d)) {
            return;
        }
        if (context != null) {
            activityC45651qj = C29306Beo.LIZIZ(context);
        } else {
            activityC45651qj = null;
        }
        boolean LJJIII = C1XY.LJJIII(activityC45651qj);
        String str2 = "normal";
        BZI LIZIZ = C0N3.LIZIZ("livesdk_broadcast_path_get_room_create_info_from_preview", "normal", "enter_from");
        if (LJJIII) {
            str2 = "smooth";
        }
        LIZIZ.LJIJJ(str2, "is_smooth");
        LIZIZ.LJIJJ(Integer.valueOf(i), "is_success");
        LIZIZ.LJIJJ(Integer.valueOf(i2), "cache");
        LIZIZ.LJIJJ(str, "error");
        LIZIZ.LJJIIJZLJL();
    }

    public static final void LJIILLIIL(String str, String str2, LiveMode liveMode, boolean z) {
        String str3;
        String str4;
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_open_room");
        LIZ2.LIZLLL("title", str);
        LIZ2.LIZLLL("cover", str2);
        if (liveMode != null) {
            str3 = liveMode.name();
        } else {
            str3 = null;
        }
        LIZ2.LIZLLL("live_mode", str3);
        LIZ2.LIZ(InterfaceC30442Bx8.LJIJI.LIZJ(), "filter_position");
        if (z) {
            str4 = "front";
        } else {
            str4 = "back";
        }
        LIZ2.LIZLLL("camera_type", str4);
        LIZ2.LIZJ("beauty_skin", InterfaceC30442Bx8.LJJIFFI.LIZJ());
        LIZ2.LIZJ("big_eyes", InterfaceC30442Bx8.LJJII.LIZJ());
        LIZ2.LIZJ("face_lift", InterfaceC30442Bx8.LJJIII.LIZJ());
        LIZ2.LJIIIZ();
    }

    public static final void LJJI(boolean z, LiveMode liveMode, String str, DataChannel dataChannel) {
        String str2;
        Object obj;
        String valueOf;
        String valueOf2;
        String valueOf3;
        float floatValue = InterfaceC30442Bx8.LJJI.LIZJ().floatValue() * 100.0f;
        float floatValue2 = InterfaceC30442Bx8.LJJIFFI.LIZJ().floatValue() * 100.0f;
        float floatValue3 = InterfaceC30442Bx8.LJJII.LIZJ().floatValue() * 100.0f;
        float floatValue4 = InterfaceC30442Bx8.LJJIII.LIZJ().floatValue() * 100.0f;
        BZI LIZ2 = C28787BRn.LIZ("pm_live_take_edit_features");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIIIZ("live_take");
        LIZ2.LJIIL("click");
        if (z) {
            str2 = "audio_live";
        } else {
            str2 = "video_live";
        }
        LIZ2.LJIJJ(str2, "live_type");
        LIZ2.LJIJJ(liveMode.logStreamingType, "streaming_type");
        LIZ2.LJIJJ(str, "anchor_id");
        int LIZJ = LIZJ(liveMode);
        String str3 = "1";
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (LIZJ != -1) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj, "is_tag");
        if (C28509BGv.LIZIZ(liveMode) || (floatValue == 0.0f && floatValue2 == 0.0f && floatValue3 == 0.0f && floatValue4 == 0.0f)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(str3, "is_beauty");
        if (C28509BGv.LIZIZ(liveMode)) {
            valueOf = CardStruct.IStatusCode.DEFAULT;
        } else {
            valueOf = String.valueOf(floatValue);
        }
        LIZ2.LJIJJ(valueOf, "beauty_white");
        if (C28509BGv.LIZIZ(liveMode)) {
            valueOf2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            valueOf2 = String.valueOf(floatValue2);
        }
        LIZ2.LJIJJ(valueOf2, "beauty_skin");
        if (C28509BGv.LIZIZ(liveMode)) {
            valueOf3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            valueOf3 = String.valueOf(floatValue3);
        }
        LIZ2.LJIJJ(valueOf3, "beauty_bigeye");
        if (!C28509BGv.LIZIZ(liveMode)) {
            str4 = String.valueOf(floatValue4);
        }
        LIZ2.LJIJJ(str4, "beauty_facethin");
        LIZ2.LJJIIJZLJL();
        C18230nb.LIZLLL("ttlive_open_room").LJIIIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x02e8, code lost:
    
        if (r1 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03ef, code lost:
    
        if (r1 == 2) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x059b, code lost:
    
        if (r7 == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x059d, code lost:
    
        if (r2 != 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x059f, code lost:
    
        if (r6 == 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0597, code lost:
    
        if (r1 != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0592, code lost:
    
        if (r1 != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x058d, code lost:
    
        if (r1 != null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x02da, code lost:
    
        if (r28 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x060a, code lost:
    
        if (r5 == false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x01a0, code lost:
    
        if (r0.getFirst() != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x01b4, code lost:
    
        if (r0.isEmpty() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0200, code lost:
    
        if (r15 != null) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139 A[LOOP:0: B:78:0x0133->B:80:0x0139, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.Object, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJI(com.bytedance.android.livesdkapi.depend.model.live.Room r26, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r27, com.bytedance.ies.sdk.datachannel.DataChannel r28, int r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0N7.LJI(com.bytedance.android.livesdkapi.depend.model.live.Room, com.bytedance.android.livesdkapi.depend.model.live.LiveMode, com.bytedance.ies.sdk.datachannel.DataChannel, int, boolean):void");
    }

    public static final void LJIILJJIL(DataChannel dataChannel, String str, String str2, String str3, Long l) {
        String str4;
        o.LJIIIZ(dataChannel, "dataChannel");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_livetake_banner_click");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIJJ("toast", "enter_from");
        LIZ2.LJIJJ("general", "appeal_type");
        LIZ2.LJIJJ(str, "record_id");
        LIZ2.LJIJJ(str2, "violation_type");
        LIZ2.LJIJJ(str3, "violation_reason");
        LIZ2.LJIJJ(l, "violation_anchor_id");
        LiveMode liveMode = (LiveMode) dataChannel.kv0(BCX.class);
        if (liveMode != null) {
            str4 = liveMode.logStreamingType;
        } else {
            str4 = null;
        }
        LIZ2.LJIJ(str4);
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJJ(DataChannel dataChannel, String str, String str2, String str3, Long l) {
        BZI LIZ2 = C28787BRn.LIZ("livesdk_livetake_banner_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIIL("show");
        LIZ2.LJIJJ(str, "record_id");
        LIZ2.LJIJJ(str2, "violation_type");
        LIZ2.LJIJJ(str3, "violation_reason");
        LIZ2.LJIJJ(l, "violation_anchor_id");
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIIL(DataChannel dataChannel, String str, String str2, int i, String str3, boolean z, int i2) {
        String str4;
        String str5;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_pm_live_takepage_show");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIIIZ("live_take");
        LIZ2.LJIIL("show");
        LIZ2.LJIIJJI("live_take_page");
        BZJ bzj = LIZ2.LIZ;
        if (bzj != null) {
            bzj.LJIILJJIL(dataChannel);
        }
        if (dataChannel != null) {
            str4 = (String) dataChannel.kv0(C30379Bw7.class);
        } else {
            str4 = null;
        }
        LIZ2.LJIJJ(LIZIZ(str, str2, str4), "enter_from");
        LIZ2.LJIJJ(Integer.valueOf(i), "has_ever_set_hashtag");
        LIZ2.LJIJ(str3);
        LIZ2.LJIJJ(Integer.valueOf(z ? 1 : 0), "screen_share_permission");
        if (LivePreviewMoreSetting.INSTANCE.useMoreBtn()) {
            str5 = "new";
        } else {
            str5 = "old";
        }
        LIZ2.LJIJJ(str5, "version_type");
        if (User.sSubPermission) {
            if (i2 != -2) {
                LIZ2.LJIJJ(Integer.valueOf(i2), "is_opt_in");
            }
        } else {
            LIZ2.LJIJJ(-1, "is_opt_in");
        }
        LIZ2.LJJIIJZLJL();
    }

    public static final void LJIIJJI(DataChannel dataChannel, String str, LiveMode liveMode, boolean z, int i, String str2, String str3, boolean z2) {
        String str4;
        String str5;
        Object obj;
        if (dataChannel != null && o.LJ(dataChannel.kv0(BD6.class), Boolean.TRUE)) {
            str4 = "fold";
        } else {
            str4 = "unfold";
        }
        BZI LIZ2 = C28787BRn.LIZ("live_action");
        LIZ2.LJIILLIIL(dataChannel);
        LIZ2.LJIIL("click");
        LIZ2.LJIIIZ("live");
        LIZ2.LJIIJJI("live_action");
        LIZ2.LJIIJ("action");
        BZJ bzj = LIZ2.LIZ;
        if (bzj != null) {
            bzj.LJIILJJIL(dataChannel);
        }
        LIZ2.LJIJJ(str, "enter_from");
        String str6 = "1";
        if (z2) {
            LIZ2.LJIJJ("1", "is_practice");
        }
        if (liveMode != null) {
            str5 = C28509BGv.LIZ(liveMode);
        } else {
            str5 = null;
        }
        LIZ2.LJIJJ(str5, "live_type");
        LIZ2.LJIJJ("1", "is_pc_guidance");
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.LJIJJ(obj, "is_application_needed");
        if (!C29232Bdc.LIZIZ()) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        C78895Uxn.LIZIZ(LIZ2, str6, "is_subscriber_only_live", i, "is_opt_in");
        LIZ2.LJIJJ("default", "toggle_setting");
        LIZ2.LJIJJ(str2, "toggle_setting");
        C06490Nh.LIZLLL(LIZ2, str3, "is_gaming_toggle", str4, "bottom_status");
    }
}
