package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveParseSeiAsyncSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewCardEnableSrSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xub, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86341Xub implements InterfaceC32188CkC {
    public final /* synthetic */ LivePreviewPlayerVM LJLIL;

    @Override // X.InterfaceC32188CkC
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJI(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIL(String s) {
        o.LJIIIZ(s, "s");
    }

    @Override // X.InterfaceC32188CkC
    public final boolean LIZ() {
        return LiveParseSeiAsyncSetting.INSTANCE.getValue().getPreviewEnable();
    }

    @Override // X.InterfaceC32188CkC
    public final void LLLZL() {
        C77554UcA c77554UcA;
        C77554UcA c77554UcA2;
        C86343Xud hv0;
        Aweme aweme;
        String str;
        Aweme aweme2;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        Aweme aweme3;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        Long l;
        LiveRoomStruct liveRoomStruct;
        Object obj;
        String str2;
        Long l2;
        String str3;
        User user;
        C86345Xuf c86345Xuf;
        this.LJLIL.LJLJI.setValue(C76800UCe.LIZ);
        C86343Xud hv02 = this.LJLIL.hv0();
        if (hv02 != null && (c77554UcA = hv02.LJII) != null && !c77554UcA.LIZ) {
            C86343Xud hv03 = this.LJLIL.hv0();
            String str4 = null;
            if (hv03 != null && (c86345Xuf = hv03.LJIIIIZZ) != null) {
                c86345Xuf.LJLJJI = System.currentTimeMillis();
            }
            LivePreviewPlayerVM livePreviewPlayerVM = this.LJLIL;
            C86343Xud hv04 = livePreviewPlayerVM.hv0();
            if (hv04 != null) {
                C86345Xuf c86345Xuf2 = hv04.LJIIIIZZ;
                long j = c86345Xuf2.LJLIL;
                if (j > 0 && c86345Xuf2.LJLJJI > 0 && hv04.LIZ != null && hv04.LIZIZ != null) {
                    livePreviewPlayerVM.jv0(j, "start");
                    livePreviewPlayerVM.jv0(hv04.LJIIIIZZ.LJLJJI, "first_frame");
                    JSONObject LIZIZ = livePreviewPlayerVM.LJLLLL.LIZIZ();
                    String optString = LIZIZ.optString("Codec_Type:", "-1");
                    boolean LJ = o.LJ(optString, "bytevc1");
                    String str5 = CardStruct.IStatusCode.DEFAULT;
                    if (LJ) {
                        obj = "1";
                    } else if (!o.LJ(optString, "h264")) {
                        obj = "-1";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    String optString2 = LIZIZ.optString("HardDecode:", "-1");
                    if (o.LJ(optString2, "true")) {
                        str5 = "1";
                    } else if (!o.LJ(optString2, "false")) {
                        str5 = "-1";
                    }
                    HashMap hashMap = new HashMap();
                    String optString3 = LIZIZ.optString("settings_res:", "-1");
                    optString3.toString();
                    hashMap.put("vquality", optString3);
                    hashMap.put("bitrate", String.valueOf(LIZIZ.optInt("download_Speed:", -1)));
                    String optString4 = LIZIZ.optString("width:", "-1");
                    optString4.toString();
                    hashMap.put("definition", optString4);
                    hashMap.put("is_hw", str5);
                    hashMap.put("is_bytevc1", obj);
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("scene_id", "1007");
                    c188727au.LJIIIZ("enter_from_merge", hv04.LIZJ);
                    c188727au.LJIIIZ("action_type", "click");
                    LiveRoomStruct liveRoomStruct2 = hv04.LIZIZ;
                    if (liveRoomStruct2 != null && (user = liveRoomStruct2.owner) != null) {
                        str2 = user.getUid();
                    } else {
                        str2 = null;
                    }
                    c188727au.LJIIIZ("anchor_id", str2);
                    LiveRoomStruct liveRoomStruct3 = hv04.LIZIZ;
                    if (liveRoomStruct3 != null) {
                        l2 = Long.valueOf(liveRoomStruct3.id);
                    } else {
                        l2 = null;
                    }
                    c188727au.LJFF(l2, "room_id");
                    Aweme aweme4 = hv04.LIZ;
                    if (aweme4 != null) {
                        str3 = aweme4.getRequestId();
                    } else {
                        str3 = null;
                    }
                    c188727au.LJIIIZ("request_id", str3);
                    c188727au.LJIIIZ("enter_method", "live_cell");
                    String str6 = "";
                    c188727au.LJIIIZ("notice_type", "");
                    c188727au.LJIIIZ("show_cnt", String.valueOf(0));
                    c188727au.LJIIIZ("yellow_dot_logid", "");
                    c188727au.LJ(livePreviewPlayerVM.LJLJL.LIZJ("first_frame"), "duration");
                    c188727au.LJIIIIZZ(livePreviewPlayerVM.LJLJL.LIZIZ);
                    c188727au.LJIIIZ("live_play_session_id", hv04.LJJIII);
                    String str7 = hv04.LJJIIJ;
                    if (str7 != null) {
                        str6 = str7;
                    }
                    c188727au.LJIIIZ("live_session_id", str6);
                    c188727au.LJII(hashMap);
                    java.util.Map<String, String> map = c188727au.LIZ;
                    C0NB.LIZIZ("ttlive_enter_room_ttlive_enter_room_log_FeedLiveViewHolderNew", map.toString());
                    C28642BLy c28642BLy = livePreviewPlayerVM.LJLJL;
                    c28642BLy.getClass();
                    if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
                        for (Map.Entry<String, String> entry : c28642BLy.LIZIZ.entrySet()) {
                            String key = entry.getKey();
                            String value = entry.getValue();
                            c28642BLy.LIZJ(key);
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append(" <--> ");
                            LIZ.append(value);
                            LIZ.append(" - ");
                            C0MT.LJ(LIZ, c28642BLy.LIZIZ.get(key), "  ", LIZ);
                        }
                        c28642BLy.LIZJ("player_first_frame_render_end");
                        c28642BLy.LIZJ("first_frame");
                    }
                    FMX.LJIIL("livesdk_enter_window_from_draw_duration", map);
                    livePreviewPlayerVM.LJLJL.LIZIZ();
                }
            }
            LivePreviewPlayerVM livePreviewPlayerVM2 = this.LJLIL;
            C86343Xud hv05 = livePreviewPlayerVM2.hv0();
            if (hv05 != null && hv05.LJFF) {
                livePreviewPlayerVM2.setMute(false);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("first frame ");
                C86343Xud hv06 = livePreviewPlayerVM2.hv0();
                if (hv06 != null && (liveRoomStruct = hv06.LIZIZ) != null) {
                    l = Long.valueOf(liveRoomStruct.id);
                } else {
                    l = null;
                }
                LIZ2.append(l);
                X1D.LIZIZ(LIZ2);
                livePreviewPlayerVM2.LJLLLL.LLZLI();
            } else {
                livePreviewPlayerVM2.setMute(true);
            }
            this.LJLIL.LJLLLL.changeSRSupportScene(LivePreviewCardEnableSrSetting.INSTANCE.isEnable());
            LivePreviewPlayerVM livePreviewPlayerVM3 = this.LJLIL;
            C86343Xud hv07 = livePreviewPlayerVM3.hv0();
            if (hv07 != null && hv07.LJIILJJIL && (hv0 = livePreviewPlayerVM3.hv0()) != null && (aweme = hv0.LIZ) != null && (aweme.isAd() || C63081OpJ.LLF(aweme))) {
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "play", aweme.getAwemeRawAd());
                C58655N0h LJJJJ = C63081OpJ.LJJJJ("draw_ad", aweme, "play");
                if (LJJJJ != null) {
                    LIZLLL = LJJJJ;
                }
                C86343Xud hv08 = livePreviewPlayerVM3.hv0();
                if (hv08 != null && (aweme3 = hv08.LIZ) != null && (roomFeedCellStruct2 = aweme3.getRoomFeedCellStruct()) != null && (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) != null) {
                    str = Long.valueOf(newLiveRoomData2.getAnchorId()).toString();
                } else {
                    str = null;
                }
                LIZLLL.LIZIZ(str, "anchor_id");
                C86343Xud hv09 = livePreviewPlayerVM3.hv0();
                if (hv09 != null && (aweme2 = hv09.LIZ) != null && (roomFeedCellStruct = aweme2.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                    str4 = Long.valueOf(newLiveRoomData.id).toString();
                }
                LIZLLL.LIZIZ(str4, "room_id");
                LIZLLL.LJI();
                C86343Xud hv010 = livePreviewPlayerVM3.hv0();
                if (hv010 != null) {
                    hv010.LJIILJJIL = false;
                }
            }
            C86343Xud hv011 = this.LJLIL.hv0();
            if (hv011 != null && (c77554UcA2 = hv011.LJII) != null) {
                c77554UcA2.LIZ = true;
            }
            LivePreviewPlayerVM livePreviewPlayerVM4 = this.LJLIL;
            C86343Xud hv012 = livePreviewPlayerVM4.hv0();
            if (hv012 == null) {
                return;
            }
            hv012.LJJII = livePreviewPlayerVM4.LJLLLL.getCurrentResolution();
        }
    }

    public C86341Xub(LivePreviewPlayerVM livePreviewPlayerVM) {
        this.LJLIL = livePreviewPlayerVM;
    }

    @Override // X.InterfaceC32188CkC
    public final void LJII(C28272B7s c28272B7s) {
        if (c28272B7s != null) {
            this.LJLIL.lv0(c28272B7s);
        }
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIIIZZ(String s) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        String str;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        o.LJIIIZ(s, "s");
        C86343Xud hv0 = this.LJLIL.hv0();
        if (hv0 != null) {
            Aweme aweme2 = hv0.LIZ;
            if ((aweme2 != null && aweme2.isAd()) || ((aweme = hv0.LIZ) != null && C63081OpJ.LLF(aweme))) {
                Aweme aweme3 = hv0.LIZ;
                String str2 = null;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "over", awemeRawAd);
                C58655N0h LJJJJ = C63081OpJ.LJJJJ("draw_ad", hv0.LIZ, "over");
                if (LJJJJ != null) {
                    LIZLLL = LJJJJ;
                }
                LIZLLL.LIZJ(Long.valueOf(System.currentTimeMillis() - hv0.LJIIIIZZ.LJLIL), "duration");
                Aweme aweme4 = hv0.LIZ;
                if (aweme4 != null && (roomFeedCellStruct2 = aweme4.getRoomFeedCellStruct()) != null && (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) != null) {
                    str = Long.valueOf(newLiveRoomData2.getAnchorId()).toString();
                } else {
                    str = null;
                }
                LIZLLL.LIZIZ(str, "anchor_id");
                Aweme aweme5 = hv0.LIZ;
                if (aweme5 != null && (roomFeedCellStruct = aweme5.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null) {
                    str2 = Long.valueOf(newLiveRoomData.id).toString();
                }
                LIZLLL.LIZIZ(str2, "room_id");
                LIZLLL.LJI();
            }
        }
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJJI(String str) {
        this.LJLIL.lv0(new C28272B7s(null, str));
    }

    @Override // X.InterfaceC32188CkC
    public final void LIZJ(EnumC79342VBy message, Object obj) {
        C86343Xud hv0;
        o.LJIIIZ(message, "message");
        this.LJLIL.LJLIL.setValue(message);
        int i = VC5.LIZ[message.ordinal()];
        if (i != 1) {
            if (i != 2 || (hv0 = this.LJLIL.hv0()) == null || hv0.LJJI <= 0) {
                return;
            }
            hv0.LJJIFFI = (SystemClock.elapsedRealtime() - hv0.LJJI) + hv0.LJJIFFI;
            return;
        }
        C86343Xud hv02 = this.LJLIL.hv0();
        if (hv02 == null) {
            return;
        }
        hv02.LJJ++;
        if (hv02.LJJI != 0) {
            return;
        }
        hv02.LJJI = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC32188CkC
    public final void LJIIJ(int i, int i2, View view) {
        this.LJLIL.LJLILLLLZI.setValue(new C86361Xuv(i, i2));
    }
}
