package com.bytedance.android.live.livepullstream;

import X.B35;
import X.B4E;
import X.B4I;
import X.B57;
import X.BMZ;
import X.BQ9;
import X.C16880lQ;
import X.C28295B8p;
import X.C28644BMa;
import X.C28645BMb;
import X.C28646BMc;
import X.C38354F3m;
import X.C38995FSd;
import X.C78579Ush;
import X.CN1;
import X.F73;
import X.HZD;
import X.InterfaceC28605BKn;
import X.InterfaceC28738BPq;
import X.InterfaceC28740BPs;
import X.InterfaceC30552Byu;
import X.InterfaceC30713C3p;
import X.InterfaceC31143CKd;
import X.VCT;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateSurfaceSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* loaded from: classes6.dex */
public class PullStreamService implements IPullStreamService {
    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final String v70() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isInMusicallyRegion()) {
            return "musically_live";
        }
        return "tiktok_live";
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void Be() {
        Iterator it = ((HashMap) BMZ.LIZIZ().LIZ).entrySet().iterator();
        while (it.hasNext()) {
            B35 b35 = (B35) ((Map.Entry) it.next()).getValue();
            if (b35.getPlayerTag().contains("prepare")) {
                b35.release();
                it.remove();
            }
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC31143CKd S40() {
        C28645BMb.LIZ().getClass();
        return (InterfaceC31143CKd) VCT.LIZIZ(InterfaceC31143CKd.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC30713C3p SN() {
        C28645BMb.LIZ().getClass();
        return (InterfaceC30713C3p) VCT.LIZIZ(InterfaceC30713C3p.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final BMZ Wp() {
        return BMZ.LIZIZ();
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC28738BPq h0() {
        C28645BMb.LIZ().getClass();
        return C28645BMb.LIZIZ();
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC28605BKn ho() {
        C28645BMb.LIZ().getClass();
        return (InterfaceC28605BKn) VCT.LIZIZ(InterfaceC28605BKn.class);
    }

    @Override // X.InterfaceC06390Mx
    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            C38995FSd.LIZIZ().submit(new HZD(0, this));
        } else {
            F73.LIZ = new C28646BMc();
        }
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final InterfaceC30552Byu s40() {
        C28645BMb.LIZ().getClass();
        return (InterfaceC30552Byu) VCT.LIZIZ(InterfaceC30552Byu.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final C78579Ush th() {
        C28645BMb.LIZ().getClass();
        return (C78579Ush) VCT.LIZIZ(C78579Ush.class);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final BQ9 Tx() {
        return BQ9.LJ;
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void Jn0(String str) {
        BMZ LIZIZ = BMZ.LIZIZ();
        if (str == null) {
            LIZIZ.getClass();
            return;
        }
        B35 LIZJ = LIZIZ.LIZJ(str);
        if (LIZJ == null) {
            return;
        }
        LIZJ.stop(false);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final void PX(String str) {
        B35 LIZJ;
        String playerTag;
        BMZ LIZIZ = BMZ.LIZIZ();
        LIZIZ.getClass();
        String str2 = BMZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recycle() -> playerTag=");
        LIZ.append(str);
        B4I.LIZ(str2, X1D.LIZIZ(LIZ));
        if (str == null || (LIZJ = LIZIZ.LIZJ(str)) == null || (playerTag = LIZJ.getPlayerTag()) == null) {
            return;
        }
        LIZJ.release();
        ((HashMap) LIZIZ.LIZ).remove(playerTag);
        ((LinkedList) LIZIZ.LIZIZ).offer(LIZJ);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final boolean S4(Context context, String str) {
        B35 LIZJ;
        BMZ LIZIZ = BMZ.LIZIZ();
        LIZIZ.getClass();
        if (!LivePreCreateSurfaceSetting.INSTANCE.getValue() || (LIZJ = LIZIZ.LIZJ(str)) == null) {
            return false;
        }
        String str2 = BMZ.LIZJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("preCreatedSurface() -> playerTag is ");
        LIZ.append(str);
        B4I.LIZ(str2, X1D.LIZIZ(LIZ));
        return LIZJ.preCreatedSurface(context);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final B35 t30(Context context, Room room) {
        long j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("warmUp -> roomId=");
        LIZ.append(room.getId());
        B4I.LIZ("PullStreamService", X1D.LIZIZ(LIZ));
        BMZ LIZIZ = BMZ.LIZIZ();
        LIZIZ.getClass();
        if (BMZ.LJFF()) {
            return null;
        }
        String str = B57.LIZ.LIZ().mEnterRoomConfig.mRoomsData.enterRoomScene;
        if (room.getStreamUrl() != null) {
            j = room.getStreamUrl().streamDelayMs;
        } else {
            j = 0;
        }
        return LIZIZ.LJ(room.getId(), context, room.buildPullUrl(), room.getSdkParams(), room.getMultiStreamData(), room.getMultiStreamDefaultQualitySdkKey(), room.getStreamUrlExtraSafely().srConfig, room.getStreamType(), false, null, str, j, false);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final B35 Wm0(Context context, EnterRoomConfig enterRoomConfig, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("warmUp -> roomId=");
        LIZ.append(j);
        B4I.LIZ("PullStreamService", X1D.LIZIZ(LIZ));
        BMZ LIZIZ = BMZ.LIZIZ();
        LIZIZ.getClass();
        if (BMZ.LJFF() || enterRoomConfig == null) {
            return null;
        }
        EnterRoomConfig.StreamData streamData = enterRoomConfig.mStreamData;
        String str = streamData.pullStreamUrl;
        String str2 = streamData.pullStreamData;
        String str3 = streamData.sharePullStreamData;
        boolean LJ = C38354F3m.LJ(str3);
        if (LJ) {
            str3 = str2;
        }
        boolean z = !LJ;
        EnterRoomConfig.StreamData streamData2 = enterRoomConfig.mStreamData;
        String str4 = streamData2.pullDefaultResolution;
        LiveMode valueOf = LiveMode.valueOf(streamData2.streamType);
        EnterRoomConfig.StreamData streamData3 = enterRoomConfig.mStreamData;
        String str5 = streamData3.pullSDKParam;
        StreamUrlExtra.SrConfig srConfig = new StreamUrlExtra.SrConfig(streamData3.extraStreamSREnable, streamData3.extraStreamSRAntiAlias, streamData3.extraStreamSRStrength);
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        return LIZIZ.LJ(j, context, str, str5, str3, str4, srConfig, valueOf, z, roomsData.warmUpPlayerTag, roomsData.enterRoomScene, enterRoomConfig.mStreamData.captionStreamDelayMs, enterRoomConfig.mFeedCoverData.enterPreviewSmooth);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final RoomPlayer2 Ha(long j, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, InterfaceC28740BPs interfaceC28740BPs, Context context, long j2) {
        C16880lQ.LLLLL(context);
        C28644BMa c28644BMa = new C28644BMa();
        c28644BMa.LIZ = str;
        if (!TextUtils.isEmpty(str)) {
            c28644BMa.LJII = 1;
        }
        c28644BMa.LIZIZ = str2;
        c28644BMa.LJ = liveMode;
        c28644BMa.LJFF = srConfig;
        c28644BMa.LJI = j2;
        return new RoomPlayer2(j, c28644BMa, b4e, interfaceC28740BPs);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final RoomPlayer2 om0(long j, String str, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, C28295B8p c28295B8p, Context context, String str2, long j2) {
        C16880lQ.LLLLL(context);
        C28644BMa c28644BMa = new C28644BMa();
        c28644BMa.LIZJ = str;
        if (c28644BMa.LJII == 0 && !TextUtils.isEmpty(str)) {
            c28644BMa.LJII = 2;
        }
        c28644BMa.LIZLLL = str2;
        c28644BMa.LJ = liveMode;
        c28644BMa.LJFF = srConfig;
        c28644BMa.LJI = j2;
        return new RoomPlayer2(j, c28644BMa, b4e, c28295B8p);
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final B35 Nf(long j, String str, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, C28295B8p c28295B8p, Context context, String str2, String str3, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ensureRoomPlayer -> roomId=");
        LIZ.append(j);
        LIZ.append(", playerTag=");
        LIZ.append(str3);
        B4I.LIZ("PullStreamService", X1D.LIZIZ(LIZ));
        BMZ LIZIZ = BMZ.LIZIZ();
        LIZIZ.getClass();
        if (BMZ.LJFF()) {
            return ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).om0(j, str, liveMode, srConfig, b4e, c28295B8p, context, str2, j2);
        }
        B35 LIZJ = LIZIZ.LIZJ(str3);
        if (LIZJ != null) {
            LIZJ.attach(context, b4e, c28295B8p);
            if (!LIZJ.getIsPreparePlayer() || LIZJ.getPlayerHasLogPrePlayerHitCache()) {
                return LIZJ;
            }
            LIZJ.setPlayerHashLogPrePlayerHitCache(true);
            BMZ.LJI(1);
            return LIZJ;
        }
        B35 LIZ2 = LIZIZ.LIZ(j, context, str, str2, null, null, srConfig, liveMode, j2, false);
        LIZ2.attach(context, b4e, c28295B8p);
        return LIZ2;
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final String gf(long j, Context context, String str, String str2, String str3, String str4, StreamUrlExtra.SrConfig srConfig, LiveMode liveMode, String str5, long j2) {
        BMZ LIZIZ = BMZ.LIZIZ();
        B35 LIZJ = LIZIZ.LIZJ(str5);
        if (LIZJ != null) {
            if (LIZJ.getIsPreparePlayer() && !LIZJ.getPlayerHasLogPrePlayerHitCache()) {
                LIZJ.setPlayerHashLogPrePlayerHitCache(true);
                BMZ.LJI(1);
            }
            return LIZJ.getPlayerTag();
        }
        B35 LIZ = LIZIZ.LIZ(j, context, str, str2, str3, str4, srConfig, liveMode, j2, true);
        LIZ.preparePlayer();
        return LIZ.getPlayerTag();
    }

    @Override // com.bytedance.android.live.livepullstream.api.IPullStreamService
    public final B35 ht0(long j, String str, String str2, LiveMode liveMode, StreamUrlExtra.SrConfig srConfig, B4E b4e, InterfaceC28740BPs interfaceC28740BPs, Context context, String str3, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ensureRoomPlayer -> roomId=");
        LIZ.append(j);
        LIZ.append(", playerTag=");
        LIZ.append(str3);
        B4I.LIZ("PullStreamService", X1D.LIZIZ(LIZ));
        BMZ LIZIZ = BMZ.LIZIZ();
        LIZIZ.getClass();
        if (BMZ.LJFF()) {
            return ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Ha(j, str, null, liveMode, srConfig, b4e, interfaceC28740BPs, context, j2);
        }
        B35 LIZJ = LIZIZ.LIZJ(str3);
        if (LIZJ != null) {
            LIZJ.attach(context, b4e, interfaceC28740BPs);
            if (!LIZJ.getIsPreparePlayer() || LIZJ.getPlayerHasLogPrePlayerHitCache()) {
                return LIZJ;
            }
            LIZJ.setPlayerHashLogPrePlayerHitCache(true);
            BMZ.LJI(1);
            return LIZJ;
        }
        B35 LIZ2 = LIZIZ.LIZ(j, context, null, null, str, str2, srConfig, liveMode, j2, false);
        LIZ2.attach(context, b4e, interfaceC28740BPs);
        return LIZ2;
    }
}
