package X;

import com.bytedance.android.livesdk.livesetting.linkmic.CoHostPullLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFirstFrameSuccessRateOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestLayoutFirstFrameLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostFirstLayoutShownSwitch;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.b1;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CgG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31944CgG implements InterfaceC28296B8q {
    public static final /* synthetic */ int LJIJJ = 0;
    public volatile long LIZIZ;
    public volatile int LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public final ConcurrentHashMap<String, String> LIZ = new ConcurrentHashMap<>();
    public String LJFF = "";

    @Override // X.InterfaceC28296B8q
    public final void LIZ() {
        if (this.LIZIZ <= 0 || !LJJII()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullStreamPauseLog, ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        this.LIZ.put("event_pause_ts", String.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC28296B8q
    public final void LIZJ() {
        this.LJIIIZ = LJJ(this.LJIIIZ, "multiGuestWidgetCreate");
    }

    @Override // X.InterfaceC28296B8q
    public final void LIZLLL() {
        this.LJII = LJJ(this.LJII, "interactLayerCreate");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJ() {
        this.LJIIJJI = LJJ(this.LJIIJJI, "analyzeSeiStart");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJFF() {
        this.LJIILL = LJJ(this.LJIILL, "layoutMeasureEnd");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIIJ() {
        if (this.LJIILL <= 0) {
            return;
        }
        this.LJIJ = LJJ(this.LJIJ, "firstWindowRender");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIIJJI() {
        this.LJIIIIZZ = LJJ(this.LJIIIIZZ, "linkControlWidgetCreate");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIIL() {
        this.LJIIJ = LJJ(this.LJIIJ, "multiGuestWidgetGetSei");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIILIIL() {
        this.LJIILIIL = LJJ(this.LJIILIIL, "getDslStart");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIILJJIL() {
        this.LJIILJJIL = LJJ(this.LJIILJJIL, "getDslEnd");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIILL() {
        if (this.LJIILL <= 0) {
            return;
        }
        this.LJIILLIIL = LJJ(this.LJIILLIIL, "layoutFirstDrawEnd");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIIZILJ() {
        if (this.LJIILL <= 0) {
            return;
        }
        this.LJIIZILJ = LJJ(this.LJIIZILJ, "layoutDrawEnd");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIJ() {
        this.LJIIL = LJJ(this.LJIIL, "analyzeSeiEnd");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIJI() {
        if (this.LIZIZ <= 0 || !LJJII()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullStreamResumeLog, ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        this.LIZ.put("event_resume_ts", String.valueOf(System.currentTimeMillis()));
    }

    public final void LJJI() {
        if (this.LIZIZ <= 0 || !LJJII()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullStreamSuccessLog, ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        LJJIIJ();
    }

    public final boolean LJJII() {
        if (CoHostPullLogSetting.INSTANCE.getValue() && !this.LJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC28296B8q
    public final void LIZIZ() {
        if (!LJJII()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullStreamPreparedLog, ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        this.LIZ.put("event_prepared_ts", String.valueOf(currentTimeMillis));
        this.LIZ.put("duration_start_to_prepared", String.valueOf(currentTimeMillis - this.LIZIZ));
    }

    public final void LJJIIJ() {
        if (!LJJII()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tryCommit, ");
        LIZ.append(hashCode());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        if (this.LIZ.keySet().contains("duration_start_to_success")) {
            this.LIZ.put("status", "success");
            if (!CoHostFirstLayoutShownSwitch.INSTANCE.getValue()) {
                this.LJ = true;
                LJJIII(this.LIZ);
                return;
            } else {
                if (!this.LIZ.keySet().contains("duration_layout_first_frame")) {
                    return;
                }
                this.LJ = true;
                LJJIII(this.LIZ);
                return;
            }
        }
        if (this.LIZ.keySet().contains("duration_start_to_failure")) {
            this.LIZ.put("status", "failure");
            if (CoHostFirstLayoutShownSwitch.INSTANCE.getValue()) {
                this.LIZ.put("duration_layout_first_frame", "-1");
            }
            this.LJ = true;
            LJJIII(this.LIZ);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZ.put("event_end_ts", String.valueOf(currentTimeMillis));
        this.LIZ.put("duration_start_to_end", String.valueOf(currentTimeMillis - this.LIZIZ));
        this.LIZ.put("status", "cancel");
        if (CoHostFirstLayoutShownSwitch.INSTANCE.getValue()) {
            if (this.LIZ.keySet().contains("duration_start_to_player_render")) {
                this.LIZ.put("duration_layout_first_frame", "-2");
            } else {
                this.LIZ.put("duration_layout_first_frame", "-1");
            }
        }
        this.LJ = true;
        LJJIII(this.LIZ);
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIIIIZZ(String str) {
        if (this.LIZIZ <= 0 || !LJJII()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullStreamEndLog, ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        this.LIZ.put("event_end_source", str);
        LJJIIJ();
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIILLIIL(long j) {
        if (!LJJII()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("allWindowRender, ");
        LIZ.append(hashCode());
        LIZ.append(", timeMs:");
        C0RN.LJ(LIZ, j, LIZ, "LiveInteractMonitor");
        this.LJIJI = j;
        this.LIZ.put("duration_layout_first_frame", String.valueOf(j - this.LIZIZ));
        if (this.LIZ.keySet().contains("duration_start_to_player_render")) {
            this.LJ = true;
            LJJIII(this.LIZ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // X.InterfaceC28296B8q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(com.bytedance.android.livesdkapi.depend.model.live.Room r9) {
        /*
            r8 = this;
            boolean r0 = r8.LJJII()
            if (r0 != 0) goto L7
            return
        L7:
            r7 = 1
            r8.LIZLLL = r7
            if (r9 == 0) goto Laa
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "pullStreamRoomParamLog, "
            r1.append(r0)
            int r0 = r8.hashCode()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "LiveInteractMonitor"
            X.C0NB.LJIIIZ(r0, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r8.LIZ
            long r0 = r9.getId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "room_id"
            r2.put(r0, r1)
            java.util.Map<java.lang.String, java.lang.Long> r4 = r9.linkerMap
            if (r4 == 0) goto L72
            java.util.Set r0 = r4.keySet()
            java.lang.String r3 = "2"
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lb5
            r0 = 2
            r8.LIZJ = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r8.LIZ
            java.lang.String r1 = "scene"
            java.lang.String r0 = "multi_host"
            r2.put(r1, r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r8.LIZ
            java.lang.Object r0 = r4.get(r3)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "channel_id"
            java.lang.Object r0 = r2.put(r0, r1)
        L70:
            if (r0 != 0) goto L74
        L72:
            r8.LIZJ = r7
        L74:
            com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo r0 = r9.getLinkMicInfo()
            if (r0 == 0) goto Lb3
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r0 = r0.battleInfo
            if (r0 == 0) goto Lb3
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r0.setting
            if (r0 == 0) goto Lb3
            int r1 = r0.status
            if (r1 == r7) goto L89
            r0 = 3
            if (r1 != r0) goto Lb3
        L89:
            com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo r0 = r9.getLinkMicInfo()
            if (r0 == 0) goto Laa
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse r0 = r0.battleInfo
            if (r0 == 0) goto Laa
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r0.setting
            if (r0 == 0) goto Laa
            long r5 = r0.battleId
            r3 = 0
            java.lang.String r2 = "connection_type"
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lab
            if (r7 == 0) goto Lab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r8.LIZ
            java.lang.String r0 = "manual_pk"
            r1.put(r2, r0)
        Laa:
            return
        Lab:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = r8.LIZ
            java.lang.String r0 = ""
            r1.put(r2, r0)
            goto Laa
        Lb3:
            r7 = 0
            goto L89
        Lb5:
            r8.LIZJ = r7
            X.UCe r0 = X.C76800UCe.LIZ
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31944CgG.LJIJJ(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    public final void LJJIII(ConcurrentHashMap concurrentHashMap) {
        if (o.LJ(this.LJFF, "5") && LinkMicMultiGuestLayoutFirstFrameLogSetting.INSTANCE.isEnable() && CoHostFirstLayoutShownSwitch.INSTANCE.getValue()) {
            LJIL(concurrentHashMap, "duration_get_sei_to_interaction_create", this.LJII, this.LJI);
            LJIL(concurrentHashMap, "duration_interaction_create_to_lcw_create", this.LJIIIIZZ, this.LJII);
            LJIL(concurrentHashMap, "duration_lcw_create_to_mgw_create", this.LJIIIZ, this.LJIIIIZZ);
            LJIL(concurrentHashMap, "duration_get_sei_to_analyze_sei_start", this.LJIIJJI, this.LJIIJ);
            LJIL(concurrentHashMap, "duration_analyze_sei", this.LJIIL, this.LJIIJJI);
            LJIL(concurrentHashMap, "duration_analyze_sei_end_to_get_dsl_start", this.LJIILIIL, this.LJIIL);
            LJIL(concurrentHashMap, "duration_get_dsl", this.LJIILJJIL, this.LJIILIIL);
            LJIL(concurrentHashMap, "duration_get_dsl_end_to_measure_end", this.LJIILL, this.LJIILJJIL);
            LJIL(concurrentHashMap, "duration_layout_draw", this.LJIIZILJ, this.LJIILL);
            LJIL(concurrentHashMap, "duration_layout_draw_end_to_first_mask_drawed", this.LJIJ, this.LJIILLIIL);
            LJIL(concurrentHashMap, "duration_draw_start_to_all_mask_end", this.LJIJI, this.LJIILL);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_first_frame_success_rate");
        LIZ.LJJIFFI(concurrentHashMap);
        if (o.LJ("livesdk_first_frame_success_rate", "livesdk_first_frame_success_rate") && BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        } else {
            LIZ.LJJIIJZLJL();
        }
        this.LIZIZ = 0L;
        this.LIZJ = 0;
        this.LIZLLL = false;
        this.LJFF = "";
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
        this.LJIIJJI = 0L;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = 0L;
        this.LJIILLIIL = 0L;
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJI = 0L;
        this.LIZ.clear();
    }

    @Override // X.InterfaceC28296B8q
    public final void LJI(Integer num, String str) {
        String str2;
        if (this.LIZIZ <= 0 || !LJJII()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullStreamFailLog, ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        ConcurrentHashMap<String, String> concurrentHashMap = this.LIZ;
        if (num == null || (str2 = num.toString()) == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        concurrentHashMap.put("err_code", str2);
        if (str != null) {
            this.LIZ.put("err_msg", str);
        }
        this.LIZ.put("event_failure_ts", String.valueOf(currentTimeMillis));
        this.LIZ.put("duration_start_to_failure", String.valueOf(currentTimeMillis - this.LIZIZ));
        if (!this.LIZLLL) {
            return;
        }
        LJJIIJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r0 = r3.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        r1 = r0.linkerArchType;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r1 != X.EnumC31946CgI.CROSS_ROOM_ARCH.getType()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        r0 = r12.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        r0 = r0.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0051, code lost:
    
        r9 = r0.battleId;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0053, code lost:
    
        LJJIFFI(r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        r8 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0039, code lost:
    
        if (r3 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r3 != null) goto L21;
     */
    @Override // X.InterfaceC28296B8q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C28272B7s r12, org.json.JSONObject r13) {
        /*
            r11 = this;
            r5 = r11
            long r1 = r5.LIZIZ
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto Lf
            boolean r0 = r5.LJJII()
            if (r0 != 0) goto L10
        Lf:
            return
        L10:
            r0 = 0
            if (r12 == 0) goto L15
            com.bytedance.android.livesdk.sei.LiveSeiStruct r0 = r12.LIZ
        L15:
            java.lang.String r2 = "sei_normal"
            r1 = 1
            java.lang.String r8 = "1"
            java.lang.String r4 = "0"
            if (r0 == 0) goto L65
            com.bytedance.android.livesdk.sei.LiveSeiStruct r3 = r12.LIZ
            if (r3 == 0) goto L5d
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r3.LIZ
            if (r0 == 0) goto L5d
            r1 = 0
            if (r3 == 0) goto L59
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r3.LIZ
            if (r0 == 0) goto L59
            int r6 = r0.version
        L2f:
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r3.LIZ
            if (r0 == 0) goto L37
            java.lang.String r7 = r0.channelId
            if (r7 != 0) goto L3b
        L37:
            java.lang.String r7 = ""
            if (r3 == 0) goto L41
        L3b:
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r3.LIZ
            if (r0 == 0) goto L41
            int r1 = r0.linkerArchType
        L41:
            X.CgI r0 = X.EnumC31946CgI.CROSS_ROOM_ARCH
            int r0 = r0.getType()
            if (r1 != r0) goto L57
        L49:
            com.bytedance.android.livesdk.sei.LiveSeiStruct r0 = r12.LIZ
            if (r0 == 0) goto L53
            com.bytedance.android.livesdk.sei.SeiAppData r0 = r0.LIZ
            if (r0 == 0) goto L53
            long r9 = r0.battleId
        L53:
            r5.LJJIFFI(r6, r7, r8, r9)
            goto Lf
        L57:
            r8 = r4
            goto L49
        L59:
            r6 = 0
            if (r3 == 0) goto L37
            goto L2f
        L5d:
            int r0 = r5.LIZJ
            if (r0 != r1) goto Lf
            r5.LJIIIIZZ(r2)
            goto Lf
        L65:
            if (r13 == 0) goto L93
            java.lang.String r0 = "ver"
            int r6 = r13.optInt(r0)
            java.lang.String r0 = "channel_id"
            java.lang.String r7 = r13.optString(r0)
            java.lang.String r0 = "linker_arch_type"
            int r3 = r13.optInt(r0)
            X.CgI r0 = X.EnumC31946CgI.CROSS_ROOM_ARCH
            int r0 = r0.getType()
            if (r3 != r0) goto L9c
        L81:
            java.lang.String r0 = "battle_id"
            long r9 = r13.optLong(r0)
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            r5.LJJIFFI(r6, r7, r8, r9)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto Lf
        L93:
            int r0 = r5.LIZJ
            if (r0 != r1) goto Lf
            r5.LJIIIIZZ(r2)
            goto Lf
        L9c:
            r8 = r4
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31944CgG.LJII(X.B7s, org.json.JSONObject):void");
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIIIZ(long j, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pullStreamStartLog, ");
        LIZ.append(hashCode());
        LIZ.append(", ");
        LIZ.append(j);
        LIZ.append(", ");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
        if (this.LIZIZ > 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("already init, ");
            LIZ2.append(hashCode());
            LIZ2.append(", ");
            LIZ2.append(j);
            LIZ2.append(", ");
            LIZ2.append(C16880lQ.LLLLIIIILLL().getName());
            C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ2));
            return;
        }
        this.LIZIZ = j2;
        this.LJ = false;
        this.LIZ.put("room_id", String.valueOf(j));
        this.LIZ.put("event_start_ts", String.valueOf(this.LIZIZ));
    }

    @Override // X.InterfaceC28296B8q
    public final void LJIJJLI(long j, long j2) {
        if (!LJJII()) {
            return;
        }
        if (LinkMicFirstFrameSuccessRateOpt.getValue()) {
            if (j <= 0) {
                j = this.LIZIZ;
            }
            if (j2 <= 0) {
                j2 = System.currentTimeMillis();
            }
            String str = this.LIZ.get("event_player_render_ts");
            if (str == null || str.length() == 0) {
                this.LIZ.put("event_player_render_ts", String.valueOf(j2));
            }
            String str2 = this.LIZ.get("duration_start_to_player_render");
            if (str2 == null || str2.length() == 0) {
                this.LIZ.put("duration_start_to_player_render", String.valueOf(j2 - j));
            }
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pullStreamDisplayLog, ");
            LIZ.append(hashCode());
            LIZ.append(", ");
            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
            C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZ));
            this.LIZ.put("event_player_render_ts", String.valueOf(currentTimeMillis));
            this.LIZ.put("duration_start_to_player_render", String.valueOf(currentTimeMillis - this.LIZIZ));
        }
        if (this.LIZ.keySet().contains("duration_start_to_success")) {
            LJJI();
        }
    }

    public final long LJJ(long j, String str) {
        if (!LJJII() || !LinkMicMultiGuestLayoutFirstFrameLogSetting.INSTANCE.isEnable() || !CoHostFirstLayoutShownSwitch.INSTANCE.getValue() || j > 0) {
            return j;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZJ = b1.LIZJ(str, ", ");
        LIZJ.append(C16880lQ.LLJIJIL(j));
        LIZJ.append(", timeMs:");
        LIZJ.append(currentTimeMillis);
        C0NB.LJIIIZ("LiveInteractMonitor", X1D.LIZIZ(LIZJ));
        return currentTimeMillis;
    }

    public static void LJIL(ConcurrentHashMap concurrentHashMap, String str, long j, long j2) {
        if (str.length() > 0 && j > 0 && j2 > 0) {
            concurrentHashMap.put(str, String.valueOf(j - j2));
        }
    }

    public final void LJJIFFI(int i, String str, String str2, long j) {
        this.LJFF = String.valueOf(i);
        if (i == 2) {
            if (str.length() > 0) {
                this.LIZ.put(WM7.SCENE_SERVICE, "multi_host");
                this.LIZ.put("arch_type", str2);
                this.LIZ.put("channel_id", str);
                if (j > 0) {
                    this.LIZ.put("connection_type", "manual_pk");
                } else {
                    this.LIZ.put("connection_type", "");
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (!this.LIZ.keySet().contains("duration_start_to_success")) {
                    this.LIZ.put("event_success_ts", String.valueOf(currentTimeMillis));
                    this.LIZ.put("duration_start_to_success", String.valueOf(currentTimeMillis - this.LIZIZ));
                }
                if (this.LIZ.keySet().contains("duration_start_to_player_render")) {
                    LJJI();
                    return;
                }
                return;
            }
        } else if (i == 5 && str.length() > 0 && LinkMicMultiGuestLayoutFirstFrameLogSetting.INSTANCE.isEnable()) {
            this.LIZ.put(WM7.SCENE_SERVICE, "multi_guest");
            this.LIZ.put("channel_id", str);
            long currentTimeMillis2 = System.currentTimeMillis();
            if (!this.LIZ.keySet().contains("duration_start_to_success")) {
                this.LIZ.put("event_success_ts", String.valueOf(currentTimeMillis2));
                this.LIZ.put("duration_start_to_success", String.valueOf(currentTimeMillis2 - this.LIZIZ));
                this.LJI = currentTimeMillis2;
            }
            if (!this.LIZ.keySet().contains("duration_start_to_player_render")) {
                return;
            }
            LJJI();
            return;
        }
        LJIIIIZZ("sei_other");
    }
}
