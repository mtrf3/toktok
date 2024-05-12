package X;

import Y.AfS20S1100000_5;
import com.bytedance.android.live.liveinteract.api.MultiLiveVideoSizePairData;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.AudienceResolutionBanAuto;
import com.bytedance.android.livesdk.dataChannel.GameLiveAbrNewResolution;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayConfirmIntervalSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.B4i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28184B4i extends C05630Jz {
    public Room LIZ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public long LJI;
    public long LJIIJ;
    public int LJIIL;
    public int LJIILIIL;
    public DataChannel LJIILL;
    public LiveMode LJIILLIIL;
    public String LIZIZ = "";
    public String LIZJ = "";
    public final java.util.Map<String, InterfaceC92693kP> LJII = new LinkedHashMap();
    public final long LJIIIIZZ = LivePlayConfirmIntervalSetting.INSTANCE.getValue();
    public final long LJIIIZ = LivePlayEnforceIntervalSetting.INSTANCE.getValue();
    public String LJIIJJI = "";
    public final String LJIILJJIL = "";

    public final void LJIIJ() {
        if (!LJIIIZ() || !o.LJ(this.LIZIZ, "T1")) {
            return;
        }
        LJIIIIZZ();
        LJIILJJIL(System.currentTimeMillis(), "system_exit_first_frame_received", "", "");
        LJIILIIL();
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZLLL = currentTimeMillis;
        this.LIZIZ = "T2";
        LJIILJJIL(currentTimeMillis, "system_enter_confirm_time_start", "", "");
        LJIILL(this.LJIIIIZZ, this.LIZIZ);
    }

    public final void LJIIJJI() {
        if (!LJIIIZ() || !o.LJ(this.LIZIZ, "T0")) {
            return;
        }
        LJIILJJIL(System.currentTimeMillis(), "system_exit_preload_succeeded", "", "");
        LJIILIIL();
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZLLL = currentTimeMillis;
        this.LIZIZ = "T1";
        LJIILJJIL(currentTimeMillis, "system_enter_start_receive_first_frame", "", "");
    }

    public final void LJIILIIL() {
        this.LJFF = 0;
        this.LJI = 0L;
    }

    public final void LJIIIIZZ() {
        String str;
        java.util.Map map;
        String str2;
        DataChannel dataChannel = this.LJIILL;
        if (dataChannel == null || (map = (java.util.Map) dataChannel.kv0(AudienceLastSelectDefinitionInfo.class)) == null || (str2 = (String) map.get("sdk_key")) == null || C78939UyV.LJJIIZI(str2)) {
            DataChannel dataChannel2 = this.LJIILL;
            if (dataChannel2 == null || (str = (String) dataChannel2.kv0(GameLiveAbrNewResolution.class)) == null) {
                str = "";
            }
            this.LJIIJJI = str;
            return;
        }
        this.LJIIJJI = str2;
    }

    public final boolean LJIIIZ() {
        LiveMode liveMode = this.LJIILLIIL;
        if (liveMode == LiveMode.THIRD_PARTY || liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.LIVE_STUDIO) {
            return true;
        }
        return false;
    }

    public C28184B4i(Room room) {
        this.LIZ = room;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        LJIILJJIL(r2, r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        r0 = r8.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001e, code lost:
    
        if (r8 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.B5C r8) {
        /*
            r7 = this;
            r1 = r7
            boolean r0 = r1.LJIIIZ()
            if (r0 != 0) goto L8
            return
        L8:
            java.lang.String r0 = r1.LIZIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            return
        L11:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r6 = ""
            if (r8 == 0) goto L1d
            java.lang.String r4 = r8.LIZ
            if (r4 != 0) goto L20
        L1d:
            r4 = r6
            if (r8 == 0) goto L24
        L20:
            java.lang.String r5 = r8.LIZIZ
            if (r5 != 0) goto L27
        L24:
            r5 = r6
            if (r8 == 0) goto L2b
        L27:
            java.lang.String r0 = r8.LIZJ
            if (r0 != 0) goto L2f
        L2b:
            r1.LJIILJJIL(r2, r4, r5, r6)
            return
        L2f:
            r6 = r0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28184B4i.LJIIL(X.B5C):void");
    }

    public final void LJIILL(long j, String str) {
        if (((LinkedHashMap) this.LJII).get(str) != null) {
            return;
        }
        this.LJII.put(str, AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS20S1100000_5(this, str, 4)));
    }

    public final void LJIILJJIL(long j, String str, String str2, String str3) {
        OSZ osz;
        int i;
        int i2;
        Long l;
        Long l2;
        String name;
        StreamUrl streamUrl;
        LinkedList<LiveCoreSDKData.Quality> linkedList;
        DataChannel dataChannel = this.LJIILL;
        ArrayList arrayList = null;
        if (dataChannel != null) {
            osz = (OSZ) dataChannel.kv0(MultiLiveVideoSizePairData.class);
        } else {
            osz = null;
        }
        if (osz != null) {
            i = ((Number) osz.getFirst()).intValue();
        } else {
            i = 0;
        }
        this.LJIIL = i;
        if (osz != null) {
            i2 = ((Number) osz.getSecond()).intValue();
        } else {
            i2 = 0;
        }
        this.LJIILIIL = i2;
        if (!LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_game_audience_watchlive_whole_link_tracking", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            return;
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_game_audience_watchlive_whole_link_tracking");
        C06530Nl.LIZLLL(LIZ, this.LIZIZ, "state", j, "timestamp");
        LIZ.LJIJJ(this.LIZJ, "live_log_id");
        LIZ.LJIJJ(str, "action_type");
        String str4 = "";
        LIZ.LJIJJ("", "enter_from_key");
        I9A.LIZ(j, this.LIZLLL, LIZ, "duration_time");
        LIZ.LJIJJ(Long.valueOf(j - this.LJ), "live_watch_time");
        LIZ.LJIJJ(str2, "error_code");
        LIZ.LJIJJ(str3, "error_msg");
        LIZ.LJIJJ(Integer.valueOf(this.LJFF), "rebuffer_count");
        LIZ.LJIJJ(Long.valueOf(this.LJI), "rebuffer_time");
        LIZ.LJIJJ(0, "interrupt_count");
        LIZ.LJIJJ(0L, "interrupt_time");
        Room room = this.LIZ;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "room_id");
        Room room2 = this.LIZ;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        LIZ.LJIJJ(l2, "host_id");
        Room room3 = this.LIZ;
        if (room3 != null && (streamUrl = room3.getStreamUrl()) != null && (linkedList = streamUrl.qualityList) != null) {
            arrayList = new ArrayList();
            Iterator<LiveCoreSDKData.Quality> it = linkedList.iterator();
            while (it.hasNext()) {
                LiveCoreSDKData.Quality next = it.next();
                LiveCoreSDKData.Quality it2 = next;
                o.LJIIIIZZ(it2, "it");
                String str5 = it2.sdkKey;
                if (str5 != null && !ujb.o.LJJJJJL(str5)) {
                    Boolean bool = (Boolean) DataChannelGlobal.LJLJJI.mv0(AudienceResolutionBanAuto.class);
                    if (bool != null && bool.booleanValue()) {
                        String str6 = it2.sdkKey;
                        o.LJIIIIZZ(str6, "quality.sdkKey");
                        if (C78939UyV.LJJIIZI(str6)) {
                        }
                    }
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str7 = ((LiveCoreSDKData.Quality) it3.next()).sdkKey;
                o.LJIIIIZZ(str7, "it.sdkKey");
                arrayList2.add(str7);
            }
        }
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, arrayList2);
        if (json == null) {
            json = "";
        }
        LIZ.LJIJJ(json, "live_support_resolution");
        LIZ.LJIJJ(this.LJIIJJI, "live_resolution");
        LIZ.LJIJJ(Integer.valueOf(this.LJIIL), "live_width");
        LIZ.LJIJJ(Integer.valueOf(this.LJIILIIL), "live_height");
        LiveMode liveMode = this.LJIILLIIL;
        if (liveMode != null && (name = liveMode.name()) != null) {
            str4 = name;
        }
        LIZ.LJIJJ(str4, "room_type");
        LIZ.LJIJJ(this.LJIILJJIL, "screen_orientation");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJIIZILJ();
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJIIZILJ();
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
    }
}
