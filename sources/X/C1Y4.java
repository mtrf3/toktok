package X;

import com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateInfo;
import com.bytedance.android.livesdk.dataChannel.MobileGameStreamInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1Y4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y4 implements InterfaceC21070sB {
    public static final float LJIILIIL = MobileHighPingAdjustBitrateInfo.INSTANCE.getValue().getHigh_ping_limit_bitrate_allow_range();
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;

    public final void LIZLLL() {
        this.LJIIL = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = -1;
        this.LJII = -1;
    }

    @Override // X.InterfaceC21070sB
    public final void LIZ() {
        LIZLLL();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("HighPingBitrateOptimizeModule", "onGameLiveEnd. reset all");
        }
    }

    @Override // X.InterfaceC21070sB
    public final void LIZIZ() {
        LIZLLL();
        DataChannelGlobal.LJLJJI.pv0(MobileGameStreamInfo.class, this, new IDqS416S0100000(this, 275));
    }

    public final void LIZJ(int i, int i2, int i3, boolean z) {
        LiveCore liveCore;
        boolean z2;
        long j;
        String str;
        String str2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        InterfaceC21020s6 interfaceC21020s6 = (InterfaceC21020s6) dataChannelGlobal.mv0(C54992Dv.class);
        if (interfaceC21020s6 != null && (liveCore = interfaceC21020s6.getLiveCore()) != null) {
            this.LJIIJJI = true;
            TEBundle tEBundle = new TEBundle();
            tEBundle.setInt("defaultBitrate", i2 * 1000);
            tEBundle.setInt("minBitrate", i * 1000);
            tEBundle.setInt("maxBitrate", i3 * 1000);
            tEBundle.setString("from", "game_high_ping_optmize");
            liveCore.updateSdkParams(tEBundle);
            tEBundle.release();
            this.LJI = i;
            this.LJII = i3;
            int i4 = 0;
            if (i3 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = this.LJIIL + 1;
            }
            this.LJIIL = i4;
            BZI LIZ = C28787BRn.LIZ("livesdk_game_high_ping_bitrate_adjust");
            LIZ.LJIJJ(Long.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "anchor_id");
            Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
            if (room != null) {
                j = room.getId();
            } else {
                j = 0;
            }
            LIZ.LJIJJ(Long.valueOf(j), "room_id");
            if (z) {
                str = "reduce";
            } else {
                str = "recover";
            }
            LIZ.LJIJJ(str, "bitrate_adjust_type");
            LIZ.LJIJJ(Integer.valueOf(this.LJIIL), "continue_reduce_count");
            if (z2) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            LIZ.LJIJJ(str2, "max_bitrate_reduce_to_min_bitrate");
            LIZ.LJIJJ(Integer.valueOf(this.LIZJ), "origin_max_bitrate");
            LIZ.LJIJJ(Integer.valueOf(this.LIZ), "origin_min_bitrate");
            LIZ.LJIJJ(Integer.valueOf(i3), "new_max_bitrate");
            LIZ.LJJIIJZLJL();
        }
    }
}
