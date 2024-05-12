package com.ss.android.ugc.aweme.dsp.playerservice.plugin;

import X.C1DH;
import X.C91093Zp3;
import X.C91094Zp4;
import X.C91207Zqt;
import X.C91249ZrZ;
import X.C91250Zra;
import X.C91252Zrc;
import X.C91279Zs3;
import X.C91299ZsN;
import X.C91300ZsO;
import X.C91301ZsP;
import X.C91304ZsS;
import X.C91482ZvK;
import X.C91605ZxJ;
import X.EnumC91305ZsT;
import X.EnumC91310ZsY;
import X.EnumC91311ZsZ;
import X.FMX;
import X.IUT;
import X.InterfaceC63764P0u;
import X.InterfaceC91288ZsC;
import X.InterfaceC91289ZsD;
import X.InterfaceC91296ZsK;
import X.InterfaceC91459Zux;
import X.O6R;
import X.OSZ;
import X.TBU;
import X.X1D;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.dsp.playpage.model.DspMusicPlayedInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class AudioEventLoggerPlugin implements InterfaceC91459Zux, InterfaceC91289ZsD, InterfaceC91288ZsC, InterfaceC63764P0u {
    public static final C91093Zp3 Companion = new C91093Zp3();
    public boolean isLogPlayMusicQuality;
    public boolean isRendered;
    public boolean logWhenAppBackground;
    public InterfaceC91296ZsK mCurrentPlayable;
    public C91299ZsN mLastPauseOperation;
    public EnumC91310ZsY mLastPlaybackState = EnumC91310ZsY.PLAYBACK_STATE_STOPPED;
    public C91299ZsN mLastStopOperation;
    public C91605ZxJ mediaPlayerService;
    public Long playbackStateStartTime;
    public Long stallStartTime;

    private final void reset() {
        this.mLastPauseOperation = null;
        this.mLastStopOperation = null;
    }

    @Override // X.InterfaceC91288ZsC
    public boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public boolean interceptResume(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public boolean interceptSeek(long j) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public boolean interceptSetStartPlayTime(int i) {
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public void onPlaybackTimeChanged(long j) {
    }

    @Override // X.InterfaceC91289ZsD
    public void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public void onRenderStart() {
        C91301ZsP eventData;
        Object obj;
        this.isRendered = true;
        final C91250Zra c91250Zra = C91252Zrc.LIZ;
        C91252Zrc.LIZJ(new TBU(c91250Zra) { // from class: X.Zxy
            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74226TBe
            public final Object get() {
                return Long.valueOf(((C91250Zra) this.receiver).LJIILJJIL);
            }

            @Override // X.TBU, X.AbstractC74223TBb, X.InterfaceC74227TBf
            public final void set(Object obj2) {
                ((C91250Zra) this.receiver).LJIILJJIL = ((Number) obj2).longValue();
            }
        });
        Long l = this.playbackStateStartTime;
        if (l != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            InterfaceC91296ZsK interfaceC91296ZsK = this.mCurrentPlayable;
            if (interfaceC91296ZsK != null && (eventData = interfaceC91296ZsK.getEventData()) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("video_group_id", "");
                hashMap.put("video_author_id", "");
                hashMap.put("music_id", eventData.LIZ);
                hashMap.put("full_clip_id", eventData.LIZIZ);
                hashMap.put("meta_song_id", eventData.LIZJ);
                String str = "1";
                if (ActivityStack.isAppBackGround()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("is_background", obj);
                hashMap.put("scene_name", eventData.LIZLLL);
                hashMap.put("enter_method", eventData.LJ);
                hashMap.put("enter_from", eventData.LJFF);
                hashMap.put("request_id", eventData.LJI);
                hashMap.put("mvid", eventData.LJII);
                hashMap.put("first_frame_duration", String.valueOf(elapsedRealtime));
                hashMap.put("media_type", eventData.LJIIIIZZ);
                if (!eventData.LJIIJ) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap.put("song_type", str);
                FMX.LJIIL("play_music_first_frame", hashMap);
            }
            logPlayMusicQuality(elapsedRealtime);
            this.playbackStateStartTime = null;
        }
    }

    public void onStreamChanged(int i) {
    }

    @Override // X.InterfaceC91289ZsD
    public void onVideoSizeChanged(int i, int i2) {
    }

    @Override // X.InterfaceC91288ZsC
    public InterfaceC91296ZsK processPlayable(InterfaceC91296ZsK interfaceC91296ZsK) {
        return interfaceC91296ZsK;
    }

    public C91605ZxJ getMediaPlayerService() {
        C91605ZxJ c91605ZxJ = this.mediaPlayerService;
        if (c91605ZxJ != null) {
            return c91605ZxJ;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    public boolean isLastPauseFromUserAction() {
        if (o.LJ(this.mLastPauseOperation, new C91299ZsN("PAUSE_FROM_USER_PAUSE")) || o.LJ(this.mLastPauseOperation, new C91299ZsN("PAUSE_FROM_NOTIFICATION_CLICK")) || o.LJ(this.mLastPauseOperation, new C91299ZsN("PAUSE_FROM_MEDIA_SESSION_CALLBACK"))) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC63764P0u
    public void onAppBackground() {
        C91301ZsP eventData;
        if (this.mLastPlaybackState == EnumC91310ZsY.PLAYBACK_STATE_PLAYING || this.logWhenAppBackground) {
            InterfaceC91296ZsK interfaceC91296ZsK = this.mCurrentPlayable;
            if (interfaceC91296ZsK != null && (eventData = interfaceC91296ZsK.getEventData()) != null) {
                InterfaceC91459Zux interfaceC91459Zux = getMediaPlayerService().LJLJJI.LJLILLLLZI.get(C91482ZvK.class);
                if (!(interfaceC91459Zux instanceof C91482ZvK)) {
                    interfaceC91459Zux = null;
                }
                C91482ZvK c91482ZvK = (C91482ZvK) interfaceC91459Zux;
                if (c91482ZvK != null) {
                    long j = c91482ZvK.LJLJJL;
                    c91482ZvK.LJLJJL = 0L;
                    C91249ZrZ.LIZIZ(eventData, j, getMediaPlayerService().LJIJJ(), new C91299ZsN("PAUSE_FROM_LOG_BACKGROUND_CHANGE"));
                }
            }
            this.logWhenAppBackground = false;
        }
    }

    @Override // X.InterfaceC63764P0u
    public void onAppForeground() {
        InterfaceC91296ZsK interfaceC91296ZsK;
        C91301ZsP eventData;
        if (this.mLastPlaybackState == EnumC91310ZsY.PLAYBACK_STATE_PLAYING && (interfaceC91296ZsK = this.mCurrentPlayable) != null && (eventData = interfaceC91296ZsK.getEventData()) != null) {
            InterfaceC91459Zux interfaceC91459Zux = getMediaPlayerService().LJLJJI.LJLILLLLZI.get(C91482ZvK.class);
            if (!(interfaceC91459Zux instanceof C91482ZvK)) {
                interfaceC91459Zux = null;
            }
            C91482ZvK c91482ZvK = (C91482ZvK) interfaceC91459Zux;
            if (c91482ZvK != null) {
                long j = c91482ZvK.LJLJJL;
                c91482ZvK.LJLJJL = 0L;
                C91249ZrZ.LIZIZ(eventData, j, getMediaPlayerService().LJIJJ(), new C91299ZsN("RESUME_FROM_LOG_FOREGROUND_CHANGE"));
            }
        }
    }

    @Override // X.InterfaceC91292ZsG
    public void onAttach() {
        getMediaPlayerService().LJLJI.LJLIL.LJII(this);
        getMediaPlayerService().LJLJI.LJLJI.LJII(this);
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // X.InterfaceC91292ZsG
    public void onDetach() {
        getMediaPlayerService().LJLJI.LJLIL.LJIIL(this);
        getMediaPlayerService().LJLJI.LJLJI.LJIIL(this);
        ActivityStack.removeAppBackGroundListener(this);
    }

    private final void logPlayMusicQuality(long j) {
        C91301ZsP eventData;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        if (this.isLogPlayMusicQuality) {
            return;
        }
        InterfaceC91296ZsK interfaceC91296ZsK = this.mCurrentPlayable;
        if (interfaceC91296ZsK != null && (eventData = interfaceC91296ZsK.getEventData()) != null) {
            C91300ZsO performanceData = getMediaPlayerService().LJLJI.LJLILLLLZI.LJIIL().LJFF;
            o.LJIIIZ(performanceData, "performanceData");
            if (C91279Zs3.LIZ()) {
                C1DH.LJJIJIIJIL(5000L, C91279Zs3.LIZIZ);
            }
            if (C91279Zs3.LIZ()) {
                C1DH.LJJIJIIJIL(5000L, C91279Zs3.LIZLLL);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("video_group_id", "");
            hashMap.put("video_author_id", "");
            hashMap.put("music_id", eventData.LIZ);
            hashMap.put("full_clip_id", eventData.LIZIZ);
            hashMap.put("meta_song_id", eventData.LIZJ);
            String str = "1";
            if (ActivityStack.isAppBackGround()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_background", obj);
            hashMap.put("scene_name", eventData.LIZLLL);
            hashMap.put("enter_method", eventData.LJ);
            hashMap.put("enter_from", eventData.LJFF);
            hashMap.put("request_id", eventData.LJI);
            hashMap.put("mvid", eventData.LJII);
            hashMap.put("cache_size", String.valueOf(performanceData.LIZ));
            hashMap.put("audio_full_duration", String.valueOf(performanceData.LIZIZ));
            hashMap.put("play_bitrate", String.valueOf(performanceData.LIZJ));
            hashMap.put("first_frame_duration", String.valueOf(j));
            hashMap.put("media_type", eventData.LJIIIIZZ);
            if (eventData.LJIIJ) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("song_type", obj2);
            FMX.LJIIL("play_music_quality", hashMap);
            C91300ZsO performanceData2 = getMediaPlayerService().LJLJI.LJLILLLLZI.LJIIL().LJFF;
            o.LJIIIZ(performanceData2, "performanceData");
            long j2 = C91249ZrZ.LIZIZ;
            if (j2 != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
                C91249ZrZ.LIZIZ = 0L;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("video_group_id", "");
                hashMap2.put("video_author_id", "");
                hashMap2.put("music_id", eventData.LIZ);
                hashMap2.put("full_clip_id", eventData.LIZIZ);
                hashMap2.put("meta_song_id", eventData.LIZJ);
                if (ActivityStack.isAppBackGround()) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("is_background", obj3);
                hashMap2.put("scene_name", eventData.LIZLLL);
                hashMap2.put("enter_method", eventData.LJ);
                hashMap2.put("enter_from", eventData.LJFF);
                hashMap2.put("request_id", eventData.LJI);
                hashMap2.put("mvid", eventData.LJII);
                hashMap2.put("cache_size", String.valueOf(performanceData2.LIZ));
                hashMap2.put("audio_full_duration", String.valueOf(performanceData2.LIZIZ));
                hashMap2.put("play_bitrate", String.valueOf(performanceData2.LIZJ));
                hashMap2.put("duration", String.valueOf(elapsedRealtime));
                hashMap2.put("first_frame_duration", String.valueOf(j));
                hashMap2.put("media_type", eventData.LJIIIIZZ);
                if (eventData.LJIIJ) {
                    obj4 = "1";
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("song_type", obj4);
                FMX.LJIIL("dsp_first_play", hashMap2);
                String cacheSize = String.valueOf(performanceData2.LIZ);
                o.LJIIIZ(cacheSize, "cacheSize");
                C91250Zra c91250Zra = C91252Zrc.LIZ;
                c91250Zra.getClass();
                HashMap hashMap3 = new HashMap();
                C91250Zra.LIZ(new OSZ("act_attach_to_cf_attach_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LIZIZ, c91250Zra.LIZJ))), hashMap3);
                C91250Zra.LIZ(new OSZ("cf_attach_to_cf_vcreated_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LIZJ, c91250Zra.LIZLLL))), hashMap3);
                C91250Zra.LIZ(new OSZ("cf_vcreated_to_sf_attach_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LIZLLL, c91250Zra.LJ))), hashMap3);
                C91250Zra.LIZ(new OSZ("sf_attach_to_sf_vcreated_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJ, c91250Zra.LJFF))), hashMap3);
                C91250Zra.LIZ(new OSZ("sf_vcreated_to_play_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJFF, c91250Zra.LJIIL))), hashMap3);
                C91250Zra.LIZ(new OSZ("bind_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJIIJ, c91250Zra.LJIIJJI))), hashMap3);
                C91250Zra.LIZ(new OSZ("play_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJIIL, c91250Zra.LJIILIIL))), hashMap3);
                C91250Zra.LIZ(new OSZ("play_to_render", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJIILIIL, c91250Zra.LJIILJJIL))), hashMap3);
                C91250Zra.LIZ(new OSZ("card_view_init_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJI, c91250Zra.LJII))), hashMap3);
                C91250Zra.LIZ(new OSZ("data_req_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJIIIIZZ, c91250Zra.LJIIIZ))), hashMap3);
                C91250Zra.LIZ(new OSZ("total_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LIZ, c91250Zra.LJIILJJIL))), hashMap3);
                C91250Zra.LIZ(new OSZ("bind_and_play_dur", Long.valueOf(C91250Zra.LIZIZ(c91250Zra.LJIILL, c91250Zra.LJIILIIL))), hashMap3);
                if (c91250Zra.LJIILLIIL) {
                    obj5 = "1";
                } else {
                    obj5 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap3.put("from_activity", obj5);
                hashMap3.put("media_id", eventData.LJIIIZ);
                hashMap3.put("cache_size", cacheSize);
                if (!ActivityStack.isAppBackGround()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap3.put("is_background", str);
                hashMap3.put("enter_method", eventData.LJ);
                FMX.LJIIL("dsp_andr_enter_to_play_cost", hashMap3);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dsp_andr_enter_to_play_cost: ");
                LIZ.append(hashMap3);
                X1D.LIZIZ(LIZ);
            }
        }
        this.isLogPlayMusicQuality = true;
    }

    @Override // X.InterfaceC91288ZsC
    public boolean interceptPause(C91299ZsN c91299ZsN) {
        this.mLastPauseOperation = c91299ZsN;
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public boolean interceptStop(C91299ZsN c91299ZsN) {
        this.mLastStopOperation = c91299ZsN;
        return false;
    }

    @Override // X.InterfaceC91289ZsD
    public void onError(C91304ZsS errorCode) {
        InterfaceC91296ZsK interfaceC91296ZsK;
        C91301ZsP eventData;
        Object obj;
        o.LJIIIZ(errorCode, "errorCode");
        if (!this.isRendered && (interfaceC91296ZsK = this.mCurrentPlayable) != null && (eventData = interfaceC91296ZsK.getEventData()) != null) {
            String errorCode2 = String.valueOf(errorCode.LIZ);
            o.LJIIIZ(errorCode2, "errorCode");
            HashMap hashMap = new HashMap();
            hashMap.put("video_group_id", "");
            hashMap.put("video_author_id", "");
            hashMap.put("music_id", eventData.LIZ);
            hashMap.put("full_clip_id", eventData.LIZIZ);
            hashMap.put("meta_song_id", eventData.LIZJ);
            String str = "1";
            if (ActivityStack.isAppBackGround()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("is_background", obj);
            hashMap.put("scene_name", eventData.LIZLLL);
            hashMap.put("enter_method", eventData.LJ);
            hashMap.put("enter_from", eventData.LJFF);
            hashMap.put("request_id", eventData.LJI);
            hashMap.put("mvid", eventData.LJII);
            hashMap.put("error_code", errorCode2);
            hashMap.put("media_type", eventData.LJIIIIZZ);
            if (!eventData.LJIIJ) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            hashMap.put("song_type", str);
            FMX.LJIIL("play_music_fail", hashMap);
        }
        C91249ZrZ.LIZIZ = 0L;
    }

    @Override // X.InterfaceC91289ZsD
    public void onLoadStateChanged(EnumC91305ZsT loadingState) {
        C91301ZsP eventData;
        Object obj;
        o.LJIIIZ(loadingState, "loadingState");
        int i = C91094Zp4.LIZ[loadingState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.stallStartTime = null;
                return;
            }
            Long l = this.stallStartTime;
            if (l != null) {
                long longValue = l.longValue();
                InterfaceC91296ZsK interfaceC91296ZsK = this.mCurrentPlayable;
                if (interfaceC91296ZsK != null && (eventData = interfaceC91296ZsK.getEventData()) != null) {
                    C91300ZsO performanceData = getMediaPlayerService().LJLJI.LJLILLLLZI.LJIIL().LJFF;
                    long elapsedRealtime = SystemClock.elapsedRealtime() - longValue;
                    o.LJIIIZ(performanceData, "performanceData");
                    HashMap hashMap = new HashMap();
                    hashMap.put("video_group_id", "");
                    hashMap.put("video_author_id", "");
                    hashMap.put("music_id", eventData.LIZ);
                    hashMap.put("full_clip_id", eventData.LIZIZ);
                    hashMap.put("meta_song_id", eventData.LIZJ);
                    String str = "1";
                    if (ActivityStack.isAppBackGround()) {
                        obj = "1";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("is_background", obj);
                    hashMap.put("scene_name", eventData.LIZLLL);
                    hashMap.put("enter_method", eventData.LJ);
                    hashMap.put("enter_from", eventData.LJFF);
                    hashMap.put("request_id", eventData.LJI);
                    hashMap.put("mvid", eventData.LJII);
                    hashMap.put("block_duration", String.valueOf(elapsedRealtime));
                    hashMap.put("cache_size", String.valueOf(performanceData.LIZ));
                    hashMap.put("play_bitrate", String.valueOf(performanceData.LIZJ));
                    hashMap.put("media_type", eventData.LJIIIIZZ);
                    if (!eventData.LJIIJ) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    hashMap.put("song_type", str);
                    FMX.LJIIL("play_music_block", hashMap);
                }
                this.stallStartTime = null;
                return;
            }
            return;
        }
        if (!this.isRendered) {
            return;
        }
        this.stallStartTime = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // X.InterfaceC91289ZsD
    public void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
        this.mCurrentPlayable = interfaceC91296ZsK;
        reset();
    }

    @Override // X.InterfaceC91289ZsD
    public void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        String str;
        InterfaceC91296ZsK interfaceC91296ZsK;
        C91301ZsP eventData;
        Object obj;
        C91301ZsP eventData2;
        String str2;
        int LJJIIZ;
        int LJJIIZ2;
        C91301ZsP eventData3;
        Object obj2;
        int LJJIIJZLJL;
        o.LJIIIZ(currentState, "currentState");
        StringBuilder LIZ = X1D.LIZ();
        InterfaceC91296ZsK interfaceC91296ZsK2 = this.mCurrentPlayable;
        if (interfaceC91296ZsK2 != null) {
            str = interfaceC91296ZsK2.getId();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" state : ");
        LIZ.append(currentState);
        X1D.LIZIZ(LIZ);
        int i = C91094Zp4.LIZIZ[currentState.ordinal()];
        if (i != 1) {
            String str3 = "1";
            String str4 = "";
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        long LJIJJLI = getMediaPlayerService().LJIJJLI();
                        long LJIJJ = getMediaPlayerService().LJIJJ();
                        InterfaceC91296ZsK interfaceC91296ZsK3 = this.mCurrentPlayable;
                        if (interfaceC91296ZsK3 != null && (eventData3 = interfaceC91296ZsK3.getEventData()) != null) {
                            InterfaceC91459Zux interfaceC91459Zux = getMediaPlayerService().LJLJJI.LJLILLLLZI.get(C91482ZvK.class);
                            if (!(interfaceC91459Zux instanceof C91482ZvK)) {
                                interfaceC91459Zux = null;
                            }
                            C91482ZvK c91482ZvK = (C91482ZvK) interfaceC91459Zux;
                            if (c91482ZvK != null) {
                                long j = c91482ZvK.LJLJJL;
                                c91482ZvK.LJLJJL = 0L;
                                C91249ZrZ.LIZIZ(eventData3, j, LJIJJ, this.mLastStopOperation);
                                C91299ZsN c91299ZsN = this.mLastStopOperation;
                                HashMap hashMap = new HashMap();
                                hashMap.put("video_group_id", "");
                                hashMap.put("video_author_id", "");
                                hashMap.put("music_id", eventData3.LIZ);
                                hashMap.put("full_clip_id", eventData3.LIZIZ);
                                hashMap.put("meta_song_id", eventData3.LIZJ);
                                if (ActivityStack.isAppBackGround()) {
                                    obj2 = "1";
                                } else {
                                    obj2 = CardStruct.IStatusCode.DEFAULT;
                                }
                                hashMap.put("is_background", obj2);
                                hashMap.put("scene_name", eventData3.LIZLLL);
                                hashMap.put("enter_method", eventData3.LJ);
                                hashMap.put("enter_from", eventData3.LJFF);
                                hashMap.put("request_id", eventData3.LJI);
                                hashMap.put("audio_over_status", C91249ZrZ.LIZ(c91299ZsN));
                                hashMap.put("duration", String.valueOf(LJIJJLI));
                                double d = (LJIJJLI / LJIJJ) * 100;
                                if (Double.isNaN(d)) {
                                    LJJIIJZLJL = 0;
                                } else {
                                    LJJIIJZLJL = O6R.LJJIIJZLJL(d);
                                }
                                hashMap.put("duration_pct", String.valueOf(LJJIIJZLJL / 100.0f));
                                hashMap.put("mvid", eventData3.LJII);
                                hashMap.put("media_type", eventData3.LJIIIIZZ);
                                if (!eventData3.LJIIJ) {
                                    str3 = CardStruct.IStatusCode.DEFAULT;
                                }
                                hashMap.put("song_type", str3);
                                FMX.LJIIL("audio_finish", hashMap);
                            }
                        }
                        InterfaceC91296ZsK interfaceC91296ZsK4 = this.mCurrentPlayable;
                        if (interfaceC91296ZsK4 != null) {
                            str2 = interfaceC91296ZsK4.LIZIZ();
                        } else {
                            str2 = null;
                        }
                        float f = (float) LJIJJLI;
                        float f2 = (100 * f) / ((float) LJIJJ);
                        if (Float.isNaN(f2)) {
                            LJJIIZ = 0;
                        } else {
                            LJJIIZ = O6R.LJJIIZ(f2);
                        }
                        float f3 = f / 1000;
                        if (Float.isNaN(f3)) {
                            LJJIIZ2 = 0;
                        } else {
                            LJJIIZ2 = O6R.LJJIIZ(f3);
                        }
                        if (str2 != null) {
                            str4 = str2;
                        }
                        DspMusicPlayedInfo dspMusicPlayedInfo = new DspMusicPlayedInfo(str4, LJJIIZ2, LJJIIZ);
                        if (dspMusicPlayedInfo.playedSeconds >= 1) {
                            IUT iut = (IUT) C91207Zqt.LIZIZ.getValue();
                            dspMusicPlayedInfo.LJLIL = System.currentTimeMillis();
                            iut.LIZIZ(dspMusicPlayedInfo);
                        }
                    }
                } else {
                    if (this.mLastPlaybackState.isPlayingState()) {
                        InterfaceC91296ZsK interfaceC91296ZsK5 = this.mCurrentPlayable;
                        if (interfaceC91296ZsK5 != null && (eventData2 = interfaceC91296ZsK5.getEventData()) != null) {
                            InterfaceC91459Zux interfaceC91459Zux2 = getMediaPlayerService().LJLJJI.LJLILLLLZI.get(C91482ZvK.class);
                            if (!(interfaceC91459Zux2 instanceof C91482ZvK)) {
                                interfaceC91459Zux2 = null;
                            }
                            C91482ZvK c91482ZvK2 = (C91482ZvK) interfaceC91459Zux2;
                            if (c91482ZvK2 != null) {
                                long j2 = c91482ZvK2.LJLJJL;
                                c91482ZvK2.LJLJJL = 0L;
                                C91249ZrZ.LIZIZ(eventData2, j2, getMediaPlayerService().LJIJJ(), this.mLastPauseOperation);
                            }
                        }
                        this.logWhenAppBackground = o.LJ(this.mLastPauseOperation, new C91299ZsN("PAUSE_FROM_ON_BACKGROUND"));
                    }
                    C91249ZrZ.LIZIZ = 0L;
                }
            } else if (this.mLastPlaybackState.isStartState() && (interfaceC91296ZsK = this.mCurrentPlayable) != null && (eventData = interfaceC91296ZsK.getEventData()) != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("video_group_id", "");
                hashMap2.put("video_author_id", "");
                hashMap2.put("music_id", eventData.LIZ);
                hashMap2.put("full_clip_id", eventData.LIZIZ);
                hashMap2.put("meta_song_id", eventData.LIZJ);
                if (ActivityStack.isAppBackGround()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("is_background", obj);
                hashMap2.put("scene_name", eventData.LIZLLL);
                hashMap2.put("enter_method", eventData.LJ);
                hashMap2.put("enter_from", eventData.LJFF);
                hashMap2.put("request_id", eventData.LJI);
                hashMap2.put("mvid", eventData.LJII);
                hashMap2.put("media_type", eventData.LJIIIIZZ);
                if (!eventData.LJIIJ) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                hashMap2.put("song_type", str3);
                FMX.LJIIL("audio_play", hashMap2);
            }
        } else {
            this.isRendered = false;
            this.isLogPlayMusicQuality = false;
            this.stallStartTime = null;
            this.playbackStateStartTime = Long.valueOf(SystemClock.elapsedRealtime());
        }
        this.mLastPlaybackState = currentState;
    }

    @Override // X.InterfaceC91459Zux
    public void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        o.LJIIIZ(c91605ZxJ, "<set-?>");
        this.mediaPlayerService = c91605ZxJ;
    }

    @Override // X.InterfaceC91289ZsD
    public void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
    }
}
