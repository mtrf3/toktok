package X;

import android.os.SystemClock;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveParseSeiAsyncSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.BPn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C28735BPn implements BQF {
    public final /* synthetic */ RoomPlayer2 LIZ;

    @Override // X.BQ5
    public final boolean LIZ() {
        return LiveParseSeiAsyncSetting.INSTANCE.getValue().getInnerEnable();
    }

    @Override // X.BQF
    public final void LJFF() {
        this.LIZ.mLogger.LJI(Long.valueOf(System.currentTimeMillis()), "sdk_player_start");
    }

    @Override // X.BQF
    public final void LJI() {
        this.LIZ.mLogger.LJI(Long.valueOf(System.currentTimeMillis()), "sdk_player_first_frame");
    }

    public C28735BPn(RoomPlayer2 roomPlayer2) {
        this.LIZ = roomPlayer2;
    }

    @Override // X.BQ5
    public final void LIZJ(EnumC79342VBy enumC79342VBy, Object obj) {
        RoomPlayer2 roomPlayer2 = this.LIZ;
        if (roomPlayer2.mAudioFocusController == null || roomPlayer2.mLivePlayController == null) {
            return;
        }
        InterfaceC28740BPs callback = roomPlayer2.getCallback();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayerMessage -> message is ");
        LIZ.append(enumC79342VBy.name());
        B4I.LIZ("RoomPlayer2", X1D.LIZIZ(LIZ));
        if (callback == null) {
            RoomPlayer2 roomPlayer22 = this.LIZ;
            if (!roomPlayer22.mHasAttached) {
                for (BQ0 bq0 : roomPlayer22.mPendingCallbacks) {
                    if (bq0.LIZ == enumC79342VBy) {
                        bq0.LIZIZ = obj;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onPlayerMessage -> replace pending message: ");
                        LIZ2.append(enumC79342VBy.toString());
                        B4I.LIZ("RoomPlayer2", X1D.LIZIZ(LIZ2));
                        return;
                    }
                }
                if (enumC79342VBy == EnumC79342VBy.DISPLAYED_PLAY) {
                    ListProtector.add(this.LIZ.mPendingCallbacks, 0, new BQ0(enumC79342VBy, obj));
                } else {
                    this.LIZ.mPendingCallbacks.add(new BQ0(enumC79342VBy, obj));
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onPlayerMessage -> add pending message: ");
                LIZ3.append(enumC79342VBy.name());
                B4I.LIZ("RoomPlayer2", X1D.LIZIZ(LIZ3));
                return;
            }
            return;
        }
        switch (VC0.LIZ[enumC79342VBy.ordinal()]) {
            case 1:
                callback.g();
                return;
            case 2:
                callback.c();
                return;
            case 3:
                callback.c();
                if (obj != null) {
                    this.LIZ.mMediaErrorMessage = obj.toString();
                }
                RoomPlayer2 roomPlayer23 = this.LIZ;
                if (roomPlayer23.mDecodeStatus == 1) {
                    return;
                }
                roomPlayer23.mDecodeStatus = 2;
                callback.i(EnumC79342VBy.MEDIA_ERROR.ordinal(), this.LIZ.mMediaErrorMessage);
                return;
            case 4:
                RoomPlayer2 roomPlayer24 = this.LIZ;
                roomPlayer24.mDecodeStatus = 1;
                if (!roomPlayer24.isBackground) {
                    if (!roomPlayer24.multiPlayer) {
                        roomPlayer24.mAudioFocusController.LIZLLL(roomPlayer24.getTagContext(), this.LIZ.mPlayerTag);
                    } else {
                        InterfaceC28738BPq interfaceC28738BPq = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ;
                        RoomPlayer2 roomPlayer25 = this.LIZ;
                        if (interfaceC28738BPq == roomPlayer25.mLivePlayController) {
                            roomPlayer25.mAudioFocusController.LIZLLL(roomPlayer25.getTagContext(), this.LIZ.mPlayerTag);
                        }
                    }
                }
                C28639BLv c28639BLv = this.LIZ.mLogger;
                if (!((ConcurrentHashMap) c28639BLv.LIZ).containsKey("first_frame")) {
                    c28639BLv.LJI(Long.valueOf(System.currentTimeMillis()), "first_frame");
                }
                BJD bjd = this.LIZ.liveRoomLogger;
                if (bjd != null) {
                    ((BJ9) bjd).LJJJLL = System.currentTimeMillis();
                }
                C28639BLv c28639BLv2 = this.LIZ.mLogger;
                if (!((ConcurrentHashMap) c28639BLv2.LIZ).containsKey("on_display_callback")) {
                    c28639BLv2.LJI(Long.valueOf(System.currentTimeMillis()), "on_display_callback");
                }
                callback.e(this.LIZ.mLogger.LIZLLL(), this.LIZ.mLogger.LJ());
                this.LIZ.mLogger.LJII();
                C0NB.LJIIIZ("RoomPlayer2", "DISPLAYED_PLAY");
                return;
            case 5:
                RoomPlayer2 roomPlayer26 = this.LIZ;
                roomPlayer26.mStopOnPlayingOther = true;
                roomPlayer26.mAudioFocusController.LJ(roomPlayer26.mPlayerTag);
                return;
            case 6:
                this.LIZ.mStopOnPlayingOther = true;
                return;
            case 7:
                SystemClock.currentThreadTimeMillis();
                if (obj instanceof C28272B7s) {
                    callback.d((C28272B7s) obj);
                    return;
                } else {
                    if (!(obj instanceof String)) {
                        return;
                    }
                    callback.d(new C28272B7s(null, (String) obj));
                    return;
                }
            case 8:
                callback.n();
                return;
            case 9:
                callback.j();
                return;
            case 10:
                int parseInt = CastIntegerProtector.parseInt((String) obj);
                callback.onVideoSizeChanged(65535 & parseInt, parseInt >> 16);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                callback.f();
                return;
            case 12:
                callback.o();
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                if (obj == null) {
                    return;
                }
                callback.h(obj.toString());
                return;
            case 14:
                if (obj == null) {
                    return;
                }
                callback.l(obj.toString());
                return;
            case 15:
                callback.k();
                return;
            default:
                return;
        }
    }
}
