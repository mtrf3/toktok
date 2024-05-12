package X;

import android.os.SystemClock;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bky, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29688Bky {
    public final EnumC29690Bl0 LIZ;
    public long LIZIZ;
    public final ConcurrentHashMap<String, String> LIZJ;

    public static java.util.Map LJ() {
        double d;
        String str;
        java.util.Map LIZ = C31023CFn.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        java.util.Map LIZ2 = C31023CFn.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        Object[] objArr = new Object[1];
        Double d2 = (Double) LIZ.get("cpu_rate");
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        objArr[0] = Double.valueOf(d);
        String LIZIZ = Q8U.LIZIZ(objArr, 1, "%.2f", "format(format, *args)");
        Double d3 = (Double) LIZ2.get("mem_java_free");
        if (d3 == null || (str = d3.toString()) == null) {
            str = "";
        }
        return C113554cx.LJJL(new OSZ("cpu_rate", LIZIZ), new OSZ("mem_free", str));
    }

    public static C29688Bky LJFF() {
        EnumC29690Bl0 enumC29690Bl0 = C29689Bkz.LJI;
        if (enumC29690Bl0 != null) {
            int i = C29692Bl2.LIZ[enumC29690Bl0.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    EnumC29690Bl0 enumC29690Bl02 = EnumC29690Bl0.STATE_T2;
                    C29689Bkz.LJI = enumC29690Bl02;
                    C29689Bkz.LIZ.getClass();
                    return C29689Bkz.LJIILIIL(enumC29690Bl02);
                }
            } else {
                EnumC29690Bl0 enumC29690Bl03 = EnumC29690Bl0.STATE_T1;
                C29689Bkz.LJI = enumC29690Bl03;
                C29689Bkz.LIZ.getClass();
                return C29689Bkz.LJIILIIL(enumC29690Bl03);
            }
        }
        EnumC29690Bl0 enumC29690Bl04 = EnumC29690Bl0.STATE_T0;
        C29689Bkz.LJI = enumC29690Bl04;
        C29689Bkz.LIZ.getClass();
        return C29689Bkz.LJIILIIL(enumC29690Bl04);
    }

    public final void LJII() {
        long j;
        String str;
        if (this.LIZ == EnumC29690Bl0.STATE_T0) {
            ConcurrentHashMap<String, String> concurrentHashMap = C29689Bkz.LJFF;
            StringBuilder LIZ = X1D.LIZ();
            C29689Bkz.LIZ.getClass();
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null) {
                j = ((C29374Bfu) LIZIZ).getCurrentUserId();
            } else {
                j = 0;
            }
            LIZ.append(j);
            LIZ.append('-');
            LIZ.append(UUID.randomUUID());
            concurrentHashMap.put("live_log_id", X1D.LIZIZ(LIZ));
            long uptimeMillis = SystemClock.uptimeMillis();
            this.LIZIZ = uptimeMillis;
            C29689Bkz.LJIIIIZZ = uptimeMillis;
            this.LIZJ.put("state", this.LIZ.toString());
            C29689Bkz.LJI = this.LIZ;
            LiveMode liveMode = C29689Bkz.LJ;
            if (liveMode != null) {
                str = liveMode.name();
            } else {
                str = null;
            }
            LJIIL(String.valueOf(str));
            LIZ("user_enter_start_live");
            concurrentHashMap.put("live_support_resolution", C29689Bkz.LJII.toString());
            LJIIJ();
        }
    }

    public final void LJIIJ() {
        this.LIZJ.put("resume_scene", String.valueOf(C29689Bkz.LJIILL));
        BZI LIZ = C28787BRn.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        LIZ.LJJIFFI(C29689Bkz.LJFF);
        LIZ.LJJIFFI(this.LIZJ);
        LIZ.LJIJJ(0, "state_time");
        LIZ.LJJIFFI(LJ());
        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        LIZ.LJIJJ("start", "stage");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ() {
        String str;
        String str2;
        String str3;
        String str4;
        if (C77357UXp.LJJIJ()) {
            str = "manual_speedtest";
        } else if (C77357UXp.LJJIIZI()) {
            str = "auto_speedtest";
        } else {
            java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.LLLZI.LIZJ();
            if (LIZJ == null || LIZJ.isEmpty()) {
                str = "default";
            } else {
                str = "selected";
            }
        }
        C29689Bkz.LJIILJJIL = str;
        if (C29689Bkz.LJ != LiveMode.SCREEN_RECORD) {
            LiveMode liveMode = C29689Bkz.LJ;
            LiveMode liveMode2 = LiveMode.THIRD_PARTY;
        }
        GameTag LIZIZ = C28514BHa.LIZIZ();
        if (LIZIZ != null && (str4 = LIZIZ.showName) != null) {
            str4.length();
        }
        OSZ osz = new OSZ("null", "");
        Object first = osz.getFirst();
        Object second = osz.getSecond();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        if (quality == null || (str2 = quality.sdkKey) == null) {
            str2 = "";
        }
        PushStreamInfo.Quality quality2 = (PushStreamInfo.Quality) dataChannelGlobal.mv0(BroadcastShareScreenDefinition.class);
        if (quality2 == null || (str3 = quality2.name) == null) {
            str3 = "";
        }
        String resumeLiveDefinition = InterfaceC30442Bx8.LLLZIIL.LIZJ();
        String resumeLiveDefinitionType = InterfaceC30442Bx8.LLLZIL.LIZJ();
        o.LJIIIIZZ(resumeLiveDefinition, "resumeLiveDefinition");
        if (resumeLiveDefinition.length() > 0) {
            o.LJIIIIZZ(resumeLiveDefinitionType, "resumeLiveDefinitionType");
            if (resumeLiveDefinitionType.length() > 0) {
                C29689Bkz.LJIILJJIL = resumeLiveDefinitionType;
                str2 = resumeLiveDefinition;
            }
        }
        this.LIZJ.put("definition_type", C29689Bkz.LJIILJJIL);
        this.LIZJ.put("take_definition", str2);
        this.LIZJ.put("quality", str3);
        this.LIZJ.put("game_label", first);
        this.LIZJ.put("game_label_id", second);
        this.LIZJ.put("live_support_resolution", "");
    }

    public C29688Bky(EnumC29690Bl0 state) {
        o.LJIIIZ(state, "state");
        this.LIZ = state;
        this.LIZIZ = SystemClock.uptimeMillis();
        this.LIZJ = new ConcurrentHashMap<>();
    }

    public static void LJIIJJI(C29688Bky c29688Bky) {
        c29688Bky.getClass();
        C29689Bkz.LJI = EnumC29690Bl0.STATE_T0;
        C29689Bkz.LJFF.clear();
        C29689Bkz.LJ = null;
        C29689Bkz.LJIIIZ = false;
        C29689Bkz.LJIIJ = false;
        C29689Bkz.LJIIJJI = false;
        C29689Bkz.LJIILIIL = false;
        C29689Bkz.LJIIL = false;
    }

    public final void LIZ(String str) {
        this.LIZJ.put("action_type", str);
    }

    public final void LIZLLL(String code) {
        o.LJIIIZ(code, "code");
        this.LIZJ.put("error_code", code);
    }

    public final void LJI(Exception exc) {
        int i;
        String str;
        if (exc instanceof C29401Dk) {
            C29401Dk c29401Dk = (C29401Dk) exc;
            i = c29401Dk.getErrorCode();
            c29401Dk.getErrorMsg();
            str = "system_exit_room_server_exception";
        } else if (exc instanceof C0TL) {
            C0TL c0tl = (C0TL) exc;
            i = c0tl.getCronetError();
            c0tl.getMessage();
            str = "system_exit_room_network_exception";
        } else {
            if (exc != null) {
                exc.getMessage();
            }
            i = -1;
            str = "system_exit_room_other_exception";
        }
        LIZ(str);
        LIZLLL(String.valueOf(i));
        LJIIIIZZ("");
        if (this.LIZ == EnumC29690Bl0.STATE_T2) {
            LJIIJJI(this);
        }
    }

    public final void LJIIIIZZ(String str) {
        C29689Bkz.LIZIZ.remove(this.LIZ);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.LIZJ.put("resume_scene", String.valueOf(C29689Bkz.LJIILL));
        BZI LIZ = C28787BRn.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        if (str.length() > 0) {
            LIZ.LJIJJ(str, "error_reason");
        }
        LIZ.LJJIFFI(C29689Bkz.LJFF);
        LIZ.LJJIFFI(LJ());
        LIZ.LJJIFFI(this.LIZJ);
        I9A.LIZ(uptimeMillis, this.LIZIZ, LIZ, "state_time");
        LIZ.LJIJJ(Long.valueOf(uptimeMillis - C29689Bkz.LJIIIIZZ), "live_duration");
        LIZ.LJIJJ("end", "stage");
        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        LIZ.LJJIIJZLJL();
    }

    public final void LJIIL(String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = C29689Bkz.LJFF;
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        concurrentHashMap.put("room_type", lowerCase);
    }

    public final void LJIILIIL(String str) {
        String str2;
        long j;
        if (this.LIZ == EnumC29690Bl0.STATE_T0) {
            ConcurrentHashMap<String, String> concurrentHashMap = C29689Bkz.LJFF;
            StringBuilder LIZ = X1D.LIZ();
            C29689Bkz.LIZ.getClass();
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null) {
                j = ((C29374Bfu) LIZIZ).getCurrentUserId();
            } else {
                j = 0;
            }
            LIZ.append(j);
            LIZ.append('-');
            LIZ.append(UUID.randomUUID());
            concurrentHashMap.put("live_log_id", X1D.LIZIZ(LIZ));
        }
        this.LIZIZ = SystemClock.uptimeMillis();
        this.LIZJ.put("state", this.LIZ.toString());
        C29689Bkz.LJI = this.LIZ;
        LiveMode liveMode = C29689Bkz.LJ;
        if (liveMode != null) {
            str2 = liveMode.name();
        } else {
            str2 = null;
        }
        LJIIL(String.valueOf(str2));
        LIZ(str);
        C29689Bkz.LJFF.put("live_support_resolution", C29689Bkz.LJII.toString());
        LJIIJ();
    }

    public final void LIZJ(String actionType, String endReason) {
        o.LJIIIZ(actionType, "actionType");
        o.LJIIIZ(endReason, "endReason");
        LIZ(actionType);
        LJIIIIZZ(endReason);
        if (this.LIZ == EnumC29690Bl0.STATE_T2) {
            LJIIJJI(this);
        }
    }

    public final void LJIIIZ(String str, String errorReason) {
        o.LJIIIZ(errorReason, "errorReason");
        LIZ(str);
        this.LIZJ.put("resume_scene", String.valueOf(C29689Bkz.LJIILL));
        long uptimeMillis = SystemClock.uptimeMillis();
        BZI LIZ = C28787BRn.LIZ("livesdk_game_host_broadcast_whole_link_tracking");
        LIZ.LJJIFFI(C29689Bkz.LJFF);
        LIZ.LJJIFFI(LJ());
        if (errorReason.length() > 0) {
            LIZ.LJIJJ(errorReason, "error_reason");
        }
        LIZ.LJJIFFI(this.LIZJ);
        I9A.LIZ(uptimeMillis, this.LIZIZ, LIZ, "state_time");
        LIZ.LJIJJ(Long.valueOf(uptimeMillis - C29689Bkz.LJIIIIZZ), "live_duration");
        LIZ.LJIJJ("middle", "stage");
        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        LIZ.LJJIIJZLJL();
    }
}
