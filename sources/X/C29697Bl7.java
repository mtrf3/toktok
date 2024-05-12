package X;

import Y.ARunnableS7S0000100_5;
import android.os.SystemClock;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bl7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29697Bl7 {
    public static long LIZ;
    public static boolean LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static long LJ;
    public static long LJFF;
    public static long LJI;
    public static long LJII;
    public static long LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static int LJIILJJIL;
    public static RoomCreateInfo LJIILLIIL;
    public static int LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static long LJJ;
    public static long LJJI;
    public static long LJJIFFI;
    public static long LJJII;
    public static long LJJIII;
    public static long LJJIIJ;
    public static long LJJIIJZLJL;
    public static String LJIILL = "";
    public static final C29700BlA LJJIIZ = new C29700BlA();
    public static final C29699Bl9 LJJIIZI = new C29699Bl9();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJI() {
        /*
            r5 = 0
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "getNetworkInterfaces()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r1 = java.util.Collections.list(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "list(this)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L3d
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L3d
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = r2.getName()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "tun0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L3b
            java.lang.String r1 = r2.getName()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r0 = "tun1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L17
        L3b:
            r4 = 1
            goto L3e
        L3d:
            r4 = 0
        L3e:
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r3 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = "http.proxyPort"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L5e
            r2 = -1
            if (r0 == 0) goto L56
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Throwable -> L5e
        L51:
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L5e
            goto L58
        L56:
            r1 = -1
            goto L51
        L58:
            if (r0 != 0) goto L5e
            if (r1 == r2) goto L5e
            r0 = 1
            goto L5f
        L5e:
            r0 = 0
        L5f:
            if (r4 == 0) goto L67
            if (r0 == 0) goto L65
            r5 = 3
        L64:
            return r5
        L65:
            r5 = 2
            goto L64
        L67:
            if (r0 == 0) goto L64
            r5 = 1
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29697Bl7.LJI():int");
    }

    public static void LJIIIIZZ() {
        LIZJ(0);
        LIZIZ(0);
        if (LJIIIIZZ != 0) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_broadcast_end");
            LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis() - LJIIIIZZ), "duration");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(Long.valueOf(LJIJI), "duration_server_heat_level_1");
            LIZ2.LJIJJ(Long.valueOf(LJIJJ), "duration_server_heat_level_2");
            LIZ2.LJIJJ(Long.valueOf(LJIJJLI), "duration_server_heat_level_3");
            LIZ2.LJIJJ(Long.valueOf(LJIL), "duration_server_heat_level_4");
            LIZ2.LJIJJ(Long.valueOf(LJJ), "duration_server_heat_level_5");
            LIZ2.LJIJJ(Long.valueOf(LJJIFFI), "duration_client_heat_level_1");
            LIZ2.LJIJJ(Long.valueOf(LJJII), "duration_client_heat_level_2");
            LIZ2.LJIJJ(Long.valueOf(LJJIII), "duration_client_heat_level_3");
            LIZ2.LJIJJ(Long.valueOf(LJJIIJ), "duration_client_heat_level_4");
            C30869C9p.LIZ(LJJIIJZLJL, LIZ2, "duration_client_heat_level_5");
        }
        RoomCreateInfo roomCreateInfo = LJIILLIIL;
        if (roomCreateInfo != null) {
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).jp0(roomCreateInfo.mLastRoomId, LJJIIZ);
            ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).uG(roomCreateInfo.mLastRoomId, LJJIIZI);
        }
        LJIJ = 0L;
        LJIJI = 0L;
        LJIJJ = 0L;
        LJIJJLI = 0L;
        LJIL = 0L;
        LJJ = 0L;
        LJJI = 0L;
        LJJIFFI = 0L;
        LJJII = 0L;
        LJJIII = 0L;
        LJJIIJ = 0L;
        LJJIIJZLJL = 0L;
        LIZJ = 0L;
        LJ = 0L;
        LJFF = 0L;
        LJI = 0L;
        LJII = 0L;
        LJIIIIZZ = 0L;
    }

    public static void LJIIL() {
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_create_room_success_all");
        LIZ2.LJI(Long.valueOf(System.currentTimeMillis() - LIZ), "duration");
        C78840Uwu.LJIIIIZZ(LIZ2);
        LIZ2.LJIIIZ();
        LIZ = System.currentTimeMillis();
        LJ = System.currentTimeMillis();
    }

    public static void LJIILIIL() {
        String str;
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_enter_broadcast_all");
        LIZ2.LIZJ("beauty_skin", InterfaceC30442Bx8.LJJIFFI.LIZJ());
        LIZ2.LIZJ("big_eyes", InterfaceC30442Bx8.LJJII.LIZJ());
        LIZ2.LIZJ("face_lift", InterfaceC30442Bx8.LJJIII.LIZJ());
        Integer LIZJ2 = InterfaceC30442Bx8.LJIIIZ.LIZJ();
        if (LIZJ2 == null || LIZJ2.intValue() != 1) {
            str = "back";
        } else {
            str = "front";
        }
        LIZ2.LIZLLL("camera_type", str);
        LIZ2.LIZ(InterfaceC30442Bx8.LJIJI.LIZJ(), "filter_position");
        LIZ2.LJI(Long.valueOf(System.currentTimeMillis() - LIZ), "duration");
        C78840Uwu.LJIIIIZZ(LIZ2);
        LIZ2.LJIIIZ();
        LIZ = System.currentTimeMillis();
        LIZIZ = false;
        LJFF = System.currentTimeMillis();
    }

    public static void LJII() {
        long currentTimeMillis = System.currentTimeMillis();
        C38995FSd.LIZIZ().submit(new ARunnableS7S0000100_5(currentTimeMillis, 2));
        LIZ = currentTimeMillis;
        LJI = currentTimeMillis;
    }

    public static void LIZIZ(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - LJJI;
        LJJI = SystemClock.elapsedRealtime();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        LJJIIJZLJL += elapsedRealtime;
                        return;
                    }
                    LJJIIJ += elapsedRealtime;
                    return;
                }
                LJJIII += elapsedRealtime;
                return;
            }
            LJJII += elapsedRealtime;
            return;
        }
        LJJIFFI += elapsedRealtime;
    }

    public static void LIZJ(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - LJIJ;
        LJIJ = SystemClock.elapsedRealtime();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        LJJ += elapsedRealtime;
                        return;
                    }
                    LJIL += elapsedRealtime;
                    return;
                }
                LJIJJLI += elapsedRealtime;
                return;
            }
            LJIJJ += elapsedRealtime;
            return;
        }
        LJIJI += elapsedRealtime;
    }

    public static void LJIIIZ(long j) {
        LJII = j;
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_broadcast_created_all");
        LIZ2.LJI(Long.valueOf(LIZJ), "click_start_live");
        LIZ2.LJI(Long.valueOf(LJ), "create_room_success");
        LIZ2.LJI(Long.valueOf(LJFF), "video_page_create");
        LIZ2.LJI(Long.valueOf(LJI), "video_page_create_success");
        LIZ2.LJI(Long.valueOf(LJII), "video_page_camera_first_show");
        C78840Uwu.LJIIIIZZ(LIZ2);
        LIZ2.LJIIIZ();
    }

    public static void LJIIJ(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        if (liveMode == LiveMode.VIDEO) {
            C29702BlC LIZ2 = C18230nb.LIZ("ttlive_click_start_video_live_all");
            LIZ2.LJI = true;
            C78840Uwu.LJIIIIZZ(LIZ2);
            LIZ2.LJIIIZ();
        } else if (liveMode == LiveMode.THIRD_PARTY) {
            C29702BlC LIZ3 = C18230nb.LIZ("ttlive_click_start_obs_live_all");
            LIZ3.LJI = true;
            C78840Uwu.LJIIIIZZ(LIZ3);
            LIZ3.LJIIIZ();
        }
        LIZ = System.currentTimeMillis();
        LIZJ = System.currentTimeMillis();
    }

    public static void LJIILJJIL(WeakHandler weakHandler) {
        LiveMode liveMode;
        long j;
        o.LJIIIZ(weakHandler, "weakHandler");
        if (!LIZIZ) {
            C12800eq.LIZLLL(EnumC12790ep.CreateLive);
            C29702BlC LIZ2 = C18230nb.LIZ("ttlive_start_push_video_stream_all");
            LIZ2.LJI(Long.valueOf(System.currentTimeMillis() - LIZ), "duration");
            C78840Uwu.LJIIIIZZ(LIZ2);
            LIZ2.LJIIIZ();
            weakHandler.postDelayed(new RunnableC28927BWx("ttlive_push_video_stream_five_all"), LivePreviewNetworkSpeedThresholdSetting.DEFAULT);
            weakHandler.postDelayed(new RunnableC28927BWx("ttlive_push_video_stream_fifteen_all"), 900000L);
            weakHandler.postDelayed(new RunnableC28927BWx("ttlive_push_video_stream_twenty_five_all"), 1500000L);
            LIZIZ = true;
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = 0;
            if (LIZJ != 0 && LJII != 0 && (LJ != 0 || LIZLLL)) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_broadcast_duration");
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
                if (room != null) {
                    liveMode = room.getStreamType();
                } else {
                    liveMode = null;
                }
                LIZ(LIZ3, liveMode);
                LIZ3.LJIIZILJ();
                long j3 = LJII;
                long j4 = LIZJ;
                BroadcastSmoothGoLiveSetting broadcastSmoothGoLiveSetting = BroadcastSmoothGoLiveSetting.INSTANCE;
                if (broadcastSmoothGoLiveSetting.enable() && dataChannelGlobal.mv0(C2E1.class) != null) {
                    j = 0;
                } else {
                    j = j3 - j4;
                }
                LIZ3.LJIJJ(Long.valueOf(j), "first_show_camera_user");
                I9A.LIZ(currentTimeMillis, LIZJ, LIZ3, "first_push_stream_user");
                long j5 = LJII;
                long j6 = LJ;
                if (!broadcastSmoothGoLiveSetting.enable() || dataChannelGlobal.mv0(C2E1.class) == null) {
                    j2 = j5 - j6;
                }
                LIZ3.LJIJJ(Long.valueOf(j2), "first_show_camera_launch");
                I9A.LIZ(currentTimeMillis, LJ, LIZ3, "first_push_stream_launch");
                I9A.LIZ(LJI, LJ, LIZ3, "video_broadcast_create_launch");
                LIZ3.LJIJJ(Integer.valueOf(LJIIIZ), "max_bitrate");
                LIZ3.LJIJJ(Integer.valueOf(LJIIJ), "min_bitrate");
                LIZ3.LJIJJ(Integer.valueOf(LJIIJJI), "default_bitrate");
                LIZ3.LJIJJ(Integer.valueOf(LJIIL ? 1 : 0), "is_bytevc1");
                LIZ3.LJIJJ(Integer.valueOf(LJIILIIL ? 1 : 0), "is_hw");
                LIZ3.LJIJJ(Integer.valueOf(LJIILJJIL), "definition");
                LIZ3.LJIJJ(Integer.valueOf(LJIIZILJ), "resume_scene");
                LIZ3.LJIJJ(Integer.valueOf(LJI()), "is_vpn");
                LIZ3.LJJIIJZLJL();
            }
            LJIIIIZZ = System.currentTimeMillis();
            RoomCreateInfo roomCreateInfo = LJIILLIIL;
            if (roomCreateInfo != null) {
                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).uk0(roomCreateInfo.mLastRoomId, LJJIIZ);
                ((IRoomFunctionService) CN1.LIZ(IRoomFunctionService.class)).C50(roomCreateInfo.mLastRoomId, LJJIIZI);
            }
            C29698Bl8 c29698Bl8 = C29698Bl8.LJLIL;
            o.LJIIIZ(c29698Bl8, "<set-?>");
            C31014CFe.LJIIZILJ = c29698Bl8;
        }
    }

    public static void LJIILL(int i) {
        boolean z;
        LJIIZILJ = i;
        LIZJ = System.currentTimeMillis();
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL = z;
    }

    public static void LIZ(BZI bzi, LiveMode liveMode) {
        boolean z;
        boolean z2;
        OSZ osz;
        String str;
        String str2;
        java.util.Map<Long, PushStreamInfo> map;
        PushStreamInfo pushStreamInfo;
        List<PushStreamInfo.Quality> list;
        RoomCreateInfo roomCreateInfo;
        String str3;
        String str4;
        if (liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.THIRD_PARTY) {
            z = true;
        } else {
            z = false;
        }
        GameTag LIZIZ2 = C28514BHa.LIZIZ();
        if (LIZIZ2 == null || (str4 = LIZIZ2.showName) == null || str4.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str5 = "";
        if (!z2 && z && (roomCreateInfo = LJIILLIIL) != null && roomCreateInfo.showGameTags) {
            GameTag LIZIZ3 = C28514BHa.LIZIZ();
            if (LIZIZ3 != null) {
                String str6 = LIZIZ3.showName;
                if (str6 == null) {
                    str6 = "";
                }
                Long l = LIZIZ3.id;
                if (l == null || (str3 = l.toString()) == null) {
                    str3 = "";
                }
                osz = new OSZ(str6, str3);
            } else {
                osz = new OSZ("", "");
            }
        } else {
            osz = new OSZ("null", "");
        }
        Object first = osz.getFirst();
        Object second = osz.getSecond();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str = quality.sdkKey) == null) {
            str = "";
        }
        PushStreamInfo.Quality quality2 = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        if (quality2 == null || (str2 = quality2.name) == null) {
            str2 = "";
        }
        RoomCreateInfo roomCreateInfo2 = LJIILLIIL;
        if (roomCreateInfo2 != null && (map = roomCreateInfo2.pushStreamInfoMap) != null && (pushStreamInfo = map.get(4L)) != null && (list = pushStreamInfo.qualityList) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<PushStreamInfo.Quality> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().name);
            }
            String abstractCollection = arrayList.toString();
            if (abstractCollection != null) {
                str5 = abstractCollection;
            }
        }
        String resumeLiveDefinition = InterfaceC30442Bx8.LLLZIIL.LIZJ();
        String resumeLiveDefinitionType = InterfaceC30442Bx8.LLLZIL.LIZJ();
        o.LJIIIIZZ(resumeLiveDefinition, "resumeLiveDefinition");
        if (resumeLiveDefinition.length() > 0) {
            o.LJIIIIZZ(resumeLiveDefinitionType, "resumeLiveDefinitionType");
            if (resumeLiveDefinitionType.length() > 0) {
                LJIILL = resumeLiveDefinitionType;
                str = resumeLiveDefinition;
            }
        }
        bzi.LJIJJ(LJIILL, "definition_type");
        bzi.LJIJJ(str, "take_definition");
        bzi.LJIJJ(str2, "quality");
        bzi.LJIJJ(first, "game_label");
        bzi.LJIJJ(second, "game_label_id");
        bzi.LJIJJ(str5, "live_support_resolution");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.Exception r9, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r10) {
        /*
            java.lang.String r0 = "e"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "liveMode"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = X.C29697Bl7.LIZJ
            long r7 = r7 - r0
            boolean r0 = r9 instanceof X.C29401Dk
            if (r0 == 0) goto L6b
            X.1Dk r9 = (X.C29401Dk) r9
            int r4 = r9.getErrorCode()
            java.lang.String r6 = r9.getErrorMsg()
            r5 = 2
        L20:
            r3 = 0
        L21:
            java.lang.String r0 = "livesdk_create_room"
            X.BZI r2 = X.C28787BRn.LIZ(r0)
            r2.LJIIZILJ()
            java.lang.String r1 = "live_type"
            java.lang.String r0 = r10.logStreamingType
            r2.LJIJJ(r0, r1)
            java.lang.String r1 = "error_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.LJIJJ(r0, r1)
            java.lang.String r1 = "error_code"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.LJIJJ(r0, r1)
            java.lang.String r1 = "error_code_1"
            java.lang.String r0 = "error_msg"
            X.KNV.LJ(r3, r2, r1, r6, r0)
            java.lang.String r1 = "duration"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.LJIJJ(r0, r1)
            int r0 = LJI()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_vpn"
            r2.LJIJJ(r1, r0)
            r2.LJJIIJZLJL()
            if (r6 != 0) goto L67
            java.lang.String r6 = ""
        L67:
            LJIIJJI(r5, r4, r3, r6, r10)
            return
        L6b:
            boolean r0 = r9 instanceof X.C0TL
            if (r0 == 0) goto L7e
            r0 = r9
            X.0TL r0 = (X.C0TL) r0
            int r4 = r0.getCronetError()
            int r3 = r0.statusCode
            java.lang.String r6 = r9.getMessage()
            r5 = 3
            goto L21
        L7e:
            java.lang.String r6 = r9.getMessage()
            r5 = 4
            r4 = -1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29697Bl7.LIZLLL(java.lang.Exception, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }

    public static void LJFF(int i, LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        BZI LIZ2 = C28787BRn.LIZ("livesdk_create_room");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(liveMode.logStreamingType, "live_type");
        LIZ2.LJIJJ(1, "error_type");
        LIZ2.LJIJJ(Integer.valueOf(i), "error_code");
        LIZ2.LJIJJ(0, "error_code_1");
        LIZ2.LJIJJ("", "error_msg");
        LIZ2.LJIJJ(0, "duration");
        LIZ2.LJIJJ(Integer.valueOf(LJI()), "is_vpn");
        LIZ2.LJJIIJZLJL();
        LJIIJJI(1, i, 0, "", liveMode);
    }

    public static void LJ(LiveMode liveMode, DataChannel dataChannel, boolean z, Long l) {
        RoomCreateInfo roomCreateInfo;
        String str;
        o.LJIIIZ(liveMode, "liveMode");
        long currentTimeMillis = System.currentTimeMillis() - LIZJ;
        if (dataChannel != null) {
            roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class);
        } else {
            roomCreateInfo = null;
        }
        LJIILLIIL = roomCreateInfo;
        if (C77357UXp.LJJIJ()) {
            str = "manual_speedtest";
        } else if (C77357UXp.LJJIIZI()) {
            str = "auto_speedtest";
        } else {
            java.util.Map<String, String> LIZJ2 = InterfaceC30442Bx8.LLLZI.LIZJ();
            if (LIZJ2 == null || LIZJ2.isEmpty()) {
                str = "default";
            } else {
                str = "selected";
            }
        }
        LJIILL = str;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_create_room");
        LIZ(LIZ2, liveMode);
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(l, "room_id");
        C78895Uxn.LIZIZ(LIZ2, liveMode.logStreamingType, "live_type", 0, "error_type");
        C78895Uxn.LIZIZ(LIZ2, CardStruct.IStatusCode.DEFAULT, "error_code", 0, "error_code_1");
        LIZ2.LJIJJ("", "error_msg");
        LIZ2.LJIJJ(Long.valueOf(currentTimeMillis), "duration");
        LIZ2.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(Boolean.valueOf(z)) ? 1 : 0), "continue");
        LIZ2.LJIJJ(Integer.valueOf(LJI()), "is_vpn");
        LIZ2.LJJIIJZLJL();
    }

    public static void LJIIJJI(int i, int i2, int i3, String str, LiveMode liveMode) {
        C29702BlC LIZ2 = C18230nb.LIZ("ttlive_create_room_error");
        LIZ2.LIZ(Integer.valueOf(i), "error_type");
        LIZ2.LIZ(Integer.valueOf(i2), "error_code");
        LIZ2.LIZ(Integer.valueOf(i3), "error_code_1");
        LIZ2.LIZLLL("error_msg", str);
        LIZ2.LIZLLL("live_type", liveMode.logStreamingType);
        LIZ2.LJI = true;
        C78840Uwu.LJIIIIZZ(LIZ2);
        LIZ2.LJIIIZ();
    }
}
