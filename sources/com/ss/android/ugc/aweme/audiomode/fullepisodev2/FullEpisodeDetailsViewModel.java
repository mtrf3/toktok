package com.ss.android.ugc.aweme.audiomode.fullepisodev2;

import X.AV1;
import X.AbstractC72932td;
import X.C05L;
import X.C10K;
import X.C145995oB;
import X.C15070iV;
import X.C178476zT;
import X.C1810878u;
import X.C200727uG;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C227768wm;
import X.C25620zW;
import X.C2NU;
import X.C2U8;
import X.C33Q;
import X.C35663Dz9;
import X.C38995FSd;
import X.C3C8;
import X.C40883G2t;
import X.C47148Ieu;
import X.C47729IoH;
import X.C48229IwL;
import X.C48231IwN;
import X.C50420Jqa;
import X.C53010KrG;
import X.C56412MCa;
import X.C59955Nfz;
import X.C63012dd;
import X.C64482g0;
import X.C68322mC;
import X.C76800UCe;
import X.C78609UtB;
import X.C78685UuP;
import X.C79004UzY;
import X.C7HV;
import X.C84735XNj;
import X.C85062XZy;
import X.C85063XZz;
import X.C85067Xa3;
import X.C85068Xa4;
import X.C85069Xa5;
import X.C85070Xa6;
import X.C85071Xa7;
import X.C85072Xa8;
import X.C85074XaA;
import X.C85076XaC;
import X.C85077XaD;
import X.C85079XaF;
import X.C85080XaG;
import X.C85081XaH;
import X.C85085XaL;
import X.C85086XaM;
import X.C85089XaP;
import X.C85096XaW;
import X.C85099XaZ;
import X.C85990Xow;
import X.C8YZ;
import X.EnumC124564ui;
import X.EnumC57435MgR;
import X.EnumC85066Xa2;
import X.FMX;
import X.GXC;
import X.HG3;
import X.InterfaceC200717uF;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC67352kd;
import X.InterfaceC79150V4o;
import X.InterfaceC85083XaJ;
import X.InterfaceC85087XaN;
import X.InterfaceC85091XaR;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.J9P;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.RBX;
import X.TBW;
import X.V1I;
import X.X1D;
import X.XKX;
import X.XOX;
import Y.ACallableS118S0100000_15;
import Y.ARunnableS51S0100000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import com.ss.android.ugc.aweme.feed.model.UpvotePreloadStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FullEpisodeDetailsViewModel extends AssemViewModel<C35663Dz9> implements KPL, InterfaceC200717uF {
    public static final C85081XaH Companion = new C85081XaH();
    public final MutableLiveData<Boolean> _isFavorite;
    public final MutableLiveData<Boolean> _isLiked;
    public final MutableLiveData<Boolean> _isPlaying;
    public final MutableLiveData<EnumC85066Xa2> _loadingState;
    public final MutableLiveData<XOX> _playbackState;
    public final MutableLiveData<Integer> _prepareState;
    public final MutableLiveData<Long> _progress;
    public final C85072Xa8 appBackGroundListener;
    public Aweme aweme;
    public boolean hasMobPodcastPlay;
    public int isBackground;
    public final LiveData<Boolean> isFavorite;
    public final LiveData<Boolean> isLiked;
    public boolean isLiking;
    public final LiveData<Boolean> isPlaying;
    public final C200727uG itemDiggPresenter;
    public final LiveData<EnumC85066Xa2> loadingState;
    public final C85068Xa4 mediaPlayerController = new C85068Xa4();
    public String pageEnterFrom;
    public long playFinishStartTime;
    public long playTimeStart;
    public final LiveData<XOX> playbackState;
    public final C85063XZz playerListener;
    public final LiveData<Integer> prepareState;
    public final LiveData<Long> progress;
    public InterfaceC79150V4o timer;

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public final void cancelTimer() {
        InterfaceC79150V4o interfaceC79150V4o = this.timer;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(null);
        }
    }

    public final void clickPlayButton() {
        XOX LIZIZ = this.mediaPlayerController.LIZIZ();
        if (LIZIZ.isPlayingState()) {
            pausePlayer(new C84735XNj("PAUSE_FROM_USER_PAUSE"));
            C85062XZy.LJFF((int) getPlayerDuration(), this.isBackground, this.aweme);
        } else if (LIZIZ.isPauseState()) {
            resumePlayer(new C84735XNj("RESUME_FROM_USER_RESUME"));
            C85062XZy.LIZJ((int) getPlayerDuration(), this.isBackground, this.aweme);
        } else {
            playPlayer$default(this, new C84735XNj("RESUME_FROM_USER_RESUME"), 0, 2, null);
            C85062XZy.LIZJ((int) getPlayerDuration(), this.isBackground, this.aweme);
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public C35663Dz9 defaultState() {
        return new C35663Dz9();
    }

    public final float getCurrentBufferPercent() {
        if (this.mediaPlayerController.LIZIZ.LIZ()) {
            return r1.LJ / 100.0f;
        }
        return 0.0f;
    }

    public final long getPlayBackTime() {
        return this.mediaPlayerController.LIZJ();
    }

    public final long getPlayerDuration() {
        return this.mediaPlayerController.LIZLLL();
    }

    public final XOX getPlayerState() {
        XOX LIZIZ = this.mediaPlayerController.LIZIZ();
        if (LIZIZ == null) {
            return XOX.PLAYBACK_STATE_STOPPED;
        }
        return LIZIZ;
    }

    public final void initPlayer() {
        C85099XaZ c85099XaZ = this.mediaPlayerController.LIZ;
        C85063XZz listener = this.playerListener;
        c85099XaZ.getClass();
        o.LJIIIZ(listener, "listener");
        C85096XaW<InterfaceC85091XaR> c85096XaW = c85099XaZ.LIZ;
        if (!c85096XaW.LIZ.contains(listener)) {
            c85096XaW.LIZ.add(listener);
        }
        ActivityStack.addAppBackGroundListener(this.appBackGroundListener);
        C85068Xa4 c85068Xa4 = this.mediaPlayerController;
        c85068Xa4.LIZ.getClass();
        c85068Xa4.LIZJ.getClass();
        C85069Xa5 c85069Xa5 = c85068Xa4.LIZIZ;
        c85069Xa5.getClass();
        C38995FSd.LIZJ().execute(new ARunnableS51S0100000_15(c85069Xa5, 96));
    }

    public final void mobPlayFinish() {
        String str;
        String str2;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        String str3;
        User author;
        PodcastInfo podcastInfo3;
        Aweme aweme = this.aweme;
        int playerDuration = (int) getPlayerDuration();
        long currentTimeMillis = System.currentTimeMillis() - this.playFinishStartTime;
        int i = this.isBackground;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        Integer num = null;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        c145995oB.LJI("preview_video_id", str2);
        String str5 = C85067Xa3.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        c145995oB.LJI("preview_enter_from", str5);
        c145995oB.LIZJ(Float.valueOf(playerDuration / 1000), "episode_duration");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        c145995oB.LIZ(C85062XZy.LIZ(num), "follow_status");
        c145995oB.LJI("country_code", C85990Xow.LIZ());
        c145995oB.LIZ(((int) currentTimeMillis) / 1000, "play_duration");
        c145995oB.LIZ(i, "is_background");
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList2, 0)) != null) {
                str4 = str3;
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str4);
        }
        FMX.LJIIL("podcast_play_finish", c145995oB.LIZ);
    }

    public final void mobPlayTime() {
        String str;
        String str2;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        List<String> urlList2;
        String str3;
        User author;
        PodcastInfo podcastInfo3;
        Aweme aweme = this.aweme;
        long currentTimeMillis = System.currentTimeMillis() - this.playTimeStart;
        int playerDuration = (int) getPlayerDuration();
        int i = this.isBackground;
        C145995oB c145995oB = new C145995oB();
        String str4 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        Integer num = null;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        c145995oB.LJI("preview_video_id", str2);
        String str5 = C85067Xa3.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        c145995oB.LJI("preview_enter_from", str5);
        c145995oB.LIZJ(Float.valueOf(playerDuration / 1000), "episode_duration");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            num = Integer.valueOf(author.getFollowStatus());
        }
        c145995oB.LIZ(C85062XZy.LIZ(num), "follow_status");
        c145995oB.LJI("country_code", C85990Xow.LIZ());
        c145995oB.LIZ(((int) currentTimeMillis) / 1000, "play_time");
        c145995oB.LIZ(i, "is_background");
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null && (playAddr = podcastInfo.getPlayAddr()) != null && (urlList = playAddr.getUrlList()) != null && !urlList.isEmpty()) {
            if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null && (urlList2 = playAddr2.getUrlList()) != null && (str3 = (String) ListProtector.get(urlList2, 0)) != null) {
                str4 = str3;
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str4);
        }
        FMX.LJIIL("podcast_play_time", c145995oB.LIZ);
        this.playTimeStart = System.currentTimeMillis();
    }

    public final void storeProgressRolling() {
        C10K.LIZJ(new ACallableS118S0100000_15(this, 0));
    }

    public FullEpisodeDetailsViewModel() {
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this._isPlaying = mutableLiveData;
        this.isPlaying = mutableLiveData;
        MutableLiveData<XOX> mutableLiveData2 = new MutableLiveData<>(XOX.PLAYBACK_STATE_STOPPED);
        this._playbackState = mutableLiveData2;
        this.playbackState = mutableLiveData2;
        MutableLiveData<Long> mutableLiveData3 = new MutableLiveData<>(0L);
        this._progress = mutableLiveData3;
        this.progress = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>(-1);
        this._prepareState = mutableLiveData4;
        this.prepareState = mutableLiveData4;
        MutableLiveData<EnumC85066Xa2> mutableLiveData5 = new MutableLiveData<>(EnumC85066Xa2.LOAD_STATE_DEFAULT);
        this._loadingState = mutableLiveData5;
        this.loadingState = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>(bool);
        this._isFavorite = mutableLiveData6;
        this.isFavorite = mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>(bool);
        this._isLiked = mutableLiveData7;
        this.isLiked = mutableLiveData7;
        C200727uG c200727uG = new C200727uG();
        this.itemDiggPresenter = c200727uG;
        this.playerListener = new C85063XZz(this);
        this.appBackGroundListener = new C85072Xa8(this);
        this.playTimeStart = System.currentTimeMillis();
        this.playFinishStartTime = System.currentTimeMillis();
        c200727uG.LJJ(new C178476zT());
        c200727uG.LJLILLLLZI = this;
    }

    public final int getIsBackGround() {
        return this.isBackground;
    }

    public final boolean getIsLiking() {
        return this.isLiking;
    }

    public final LiveData<EnumC85066Xa2> getLoadingState() {
        return this.loadingState;
    }

    public final C85068Xa4 getMediaPlayerController() {
        return this.mediaPlayerController;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final LiveData<XOX> getPlaybackState() {
        return this.playbackState;
    }

    public final LiveData<Integer> getPrepareState() {
        return this.prepareState;
    }

    public final LiveData<Long> getProgress() {
        return this.progress;
    }

    public final LiveData<Boolean> isFavorite() {
        return this.isFavorite;
    }

    public final LiveData<Boolean> isLiked() {
        return this.isLiked;
    }

    public final LiveData<Boolean> isPlaying() {
        return this.isPlaying;
    }

    private final List<UpvoteStruct> filterMUFUpvote(UpvoteList upvoteList) {
        List<UpvoteStruct> upvotes;
        if (upvoteList != null && (upvotes = upvoteList.getUpvotes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (UpvoteStruct upvoteStruct : upvotes) {
                UpvoteStruct upvoteStruct2 = upvoteStruct;
                User user = upvoteStruct2.getUser();
                if (user != null && user.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue() && !AV1.LJIJ(upvoteStruct2.getUser())) {
                    arrayList.add(upvoteStruct);
                }
            }
            return arrayList;
        }
        return null;
    }

    private final List<UpvoteStruct> filterNotMyUpvote(UpvoteList upvoteList) {
        List<UpvoteStruct> upvotes;
        if (upvoteList != null && (upvotes = upvoteList.getUpvotes()) != null) {
            ArrayList arrayList = new ArrayList();
            for (UpvoteStruct upvoteStruct : upvotes) {
                if (!AV1.LJIJ(upvoteStruct.getUser())) {
                    arrayList.add(upvoteStruct);
                }
            }
            return arrayList;
        }
        return null;
    }

    private final boolean getFiendsUpvote(Aweme aweme) {
        List<UpvoteStruct> filterNotMyUpvote;
        boolean z = false;
        if (aweme == null || aweme.getAid() == null) {
            return false;
        }
        C7HV c7hv = C7HV.LIZIZ;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        UpvoteList LJIIIZ = c7hv.LJIIIZ(aid);
        int intValue = ((Number) C53010KrG.LIZ.getValue()).intValue();
        if (2 <= intValue && intValue < 4) {
            filterNotMyUpvote = filterMUFUpvote(LJIIIZ);
        } else {
            filterNotMyUpvote = filterNotMyUpvote(LJIIIZ);
        }
        if (filterNotMyUpvote == null || filterNotMyUpvote.isEmpty()) {
            z = true;
        }
        return !z;
    }

    private final void saveCacheKey(String str) {
        String str2;
        PodcastInfo podcastInfo;
        Keva repo = Keva.getRepo("FullEpisodeDetailFragment");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("full_episode_cachekey");
        Aweme aweme = this.aweme;
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null) {
            str2 = podcastInfo.getEpisodeItemId();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (str == null) {
            str = "";
        }
        repo.storeString(LIZIZ, str);
    }

    public final C85070Xa6 generatePlayable(PodcastInfo podcastInfo) {
        boolean z;
        EnumC124564ui enumC124564ui;
        C85070Xa6 c85070Xa6 = new C85070Xa6(podcastInfo);
        InterfaceC85087XaN LIZ = c85070Xa6.LIZ();
        if (LIZ instanceof C85074XaA) {
            Keva repo = Keva.getRepo("FullEpisodeDetailFragment");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("full_episode_cachekey");
            String str = null;
            if (podcastInfo != null) {
                str = podcastInfo.getEpisodeItemId();
            }
            LIZ2.append(str);
            String storeKey = repo.getString(X1D.LIZIZ(LIZ2), "");
            if (C78685UuP.LJJJZ(storeKey)) {
                o.LJIIIIZZ(storeKey, "storeKey");
                C47729IoH LJJII = C47148Ieu.LIZ.LJJII(storeKey);
                if (LJJII != null) {
                    long j = LJJII.LIZ;
                    if (j > 0 && LJJII.LIZIZ == j) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StringBuilder LIZIZ = C25620zW.LIZIZ("Find preloaded resource associated with special key(", storeKey, "), detail is {");
                    LIZIZ.append(LJJII.LIZJ);
                    LIZIZ.append(", ");
                    LIZIZ.append(LJJII.LIZ);
                    LIZIZ.append(", ");
                    V1I.LIZJ(LIZIZ, LJJII.LIZIZ, ", isComplete: ", z);
                    LIZIZ.append('}');
                    X1D.LIZIZ(LIZIZ);
                    String str2 = LJJII.LIZJ;
                    o.LJIIIIZZ(str2, "cacheInfo.mLocalFilePath");
                    if (z) {
                        enumC124564ui = EnumC124564ui.FULL_PRELOADED;
                    } else {
                        enumC124564ui = EnumC124564ui.FRAGMENT_PRELOADED;
                    }
                    GXC gxc = new GXC(storeKey, str2, enumC124564ui);
                    if (((String) gxc.LJLJI).length() > 0 && new File((String) gxc.LJLJI).exists() && new File((String) gxc.LJLJI).length() > 0) {
                        c85070Xa6.LIZLLL = new C85076XaC(((C85074XaA) LIZ).LIZ, storeKey, 12);
                    }
                }
            }
        }
        return c85070Xa6;
    }

    @Override // X.InterfaceC200717uF
    public void onItemDiggFailed(Exception exc) {
        this.isLiking = false;
    }

    @Override // X.InterfaceC200717uF
    public void onItemDiggSuccess(C15070iV<String, Integer> c15070iV) {
        Integer num;
        boolean z = false;
        this.isLiking = false;
        String str = null;
        if (c15070iV != null) {
            str = c15070iV.LIZ;
        }
        C50420Jqa c50420Jqa = new C50420Jqa(13, str);
        Bundle bundle = new Bundle();
        if (c15070iV == null || (num = c15070iV.LIZIZ) == null) {
            num = -1;
        }
        MutableLiveData<Boolean> mutableLiveData = this._isLiked;
        if (num.intValue() == 1) {
            z = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
        bundle.putInt("user_digged", num.intValue());
        c50420Jqa.LJLJI = bundle;
        C2U8.LIZ(c50420Jqa);
        C2U8.LIZ(new C1810878u(num.intValue()));
    }

    public final void pausePlayer(C84735XNj c84735XNj) {
        this.mediaPlayerController.LJ(c84735XNj);
    }

    public final void resumePlayer(C84735XNj c84735XNj) {
        this.mediaPlayerController.LIZ(c84735XNj);
    }

    public final void seekPlayerProgress(Long l) {
        long j;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        this.mediaPlayerController.LJI(j);
        storeProgressRolling();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, X.Xa6] */
    public final void setPodcastPlayable(PodcastInfo podcastInfo) {
        XOX xox;
        InterfaceC85087XaN interfaceC85087XaN;
        ?? generatePlayable = generatePlayable(podcastInfo);
        C85068Xa4 c85068Xa4 = this.mediaPlayerController;
        C85069Xa5 c85069Xa5 = c85068Xa4.LIZIZ;
        C85080XaG c85080XaG = c85068Xa4.LIZJ;
        c85080XaG.getClass();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = generatePlayable;
        c85080XaG.LIZ.LIZ(new AqS146S0200000_15(c68322mC, (C85070Xa6) generatePlayable, 42));
        InterfaceC85083XaJ interfaceC85083XaJ = (InterfaceC85083XaJ) c68322mC.element;
        c85069Xa5.LJ = 0;
        c85069Xa5.LJFF = false;
        c85069Xa5.LIZLLL = null;
        if (c85069Xa5.LIZ()) {
            int i = c85069Xa5.LIZIZ().LIZIZ().LIZ.LJIIL;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xox = XOX.PLAYBACK_STATE_STOPPED;
                        } else {
                            xox = XOX.PLAYBACK_STATE_ERROR;
                        }
                    } else {
                        xox = XOX.PLAYBACK_STATE_PAUSED;
                    }
                } else {
                    xox = XOX.PLAYBACK_STATE_PLAYING;
                }
            } else {
                xox = XOX.PLAYBACK_STATE_STOPPED;
            }
        } else {
            xox = XOX.PLAYBACK_STATE_STOPPED;
        }
        if (xox != XOX.PLAYBACK_STATE_STOPPED) {
            c85069Xa5.LIZJ();
        }
        c85069Xa5.LIZ.LIZJ(interfaceC85083XaJ);
        if (interfaceC85083XaJ != null) {
            interfaceC85087XaN = interfaceC85083XaJ.LIZ();
        } else {
            interfaceC85087XaN = null;
        }
        if (interfaceC85087XaN instanceof C85086XaM) {
            if (interfaceC85083XaJ != null) {
                o.LJII(interfaceC85083XaJ.LIZ(), "null cannot be cast to non-null type com.ss.android.ugc.aweme.audiomode.fullepisodev2.player.entity.VideoModelPlayerDataSource");
                c85069Xa5.LIZIZ().LIZLLL();
                c85069Xa5.LIZIZ();
                throw null;
            }
        } else if (interfaceC85087XaN instanceof C85074XaA) {
            C85074XaA c85074XaA = (C85074XaA) interfaceC85087XaN;
            c85069Xa5.LIZIZ().LJ(c85074XaA.LIZ, c85074XaA.LIZIZ, c85074XaA.LJ, c85074XaA.LJFF);
        } else if (interfaceC85087XaN instanceof C85076XaC) {
            C85076XaC c85076XaC = (C85076XaC) interfaceC85087XaN;
            c85069Xa5.LIZIZ().LJ(c85076XaC.LIZ, c85076XaC.LIZIZ, c85076XaC.LIZJ, c85076XaC.LIZLLL);
        } else if (!(interfaceC85087XaN instanceof C85085XaL)) {
            if (interfaceC85087XaN == null) {
                c85069Xa5.LIZ.LIZ(C85079XaF.LIZLLL);
            } else {
                c85069Xa5.LIZ.LIZ(C85079XaF.LIZJ);
            }
        } else {
            C85089XaP LIZIZ = c85069Xa5.LIZIZ();
            interfaceC85087XaN.getClass();
            LIZIZ.getClass();
            o.LJIIIZ(null, "fd");
            throw null;
        }
        c85069Xa5.LIZLLL = interfaceC85083XaJ;
        if (generatePlayable.LIZ() instanceof C85074XaA) {
            saveCacheKey(((C85074XaA) generatePlayable.LIZ()).LIZIZ);
        }
    }

    public final Object startTimer(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        this.timer = XKX.LIZLLL(getAssemVMScope(), null, null, new C63012dd(null), 3);
        return C76800UCe.LIZ;
    }

    public final void stopPlayer(C84735XNj c84735XNj) {
        this.mediaPlayerController.LJII(c84735XNj);
        C85068Xa4 c85068Xa4 = this.mediaPlayerController;
        c85068Xa4.LIZ.LIZ.LIZ.clear();
        c85068Xa4.LIZJ.LIZ.LIZ.clear();
        C85069Xa5 c85069Xa5 = c85068Xa4.LIZIZ;
        C85089XaP LIZIZ = c85069Xa5.LIZIZ();
        LIZIZ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LIZIZ);
        LIZ.append("  -> release");
        X1D.LIZIZ(LIZ);
        LIZIZ.LIZLLL();
        if (LIZIZ.LIZIZ) {
            LIZIZ.LIZIZ().LJZI(null);
            LIZIZ.LIZIZ().LJJLIIIJILLIZJL();
        }
        c85069Xa5.LIZJ.dispose();
        ActivityStack.removeAppBackGroundListener(this.appBackGroundListener);
    }

    public final void clickFavorite(Aweme aweme, Context context) {
        if (aweme == null || aweme.isScheduleVideo()) {
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            String aid = aweme.getAid();
            if (context != null) {
                Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
                String str = this.pageEnterFrom;
                if (str == null) {
                    str = "";
                }
                C40883G2t c40883G2t = new C40883G2t();
                c40883G2t.LIZLLL("group_id", aid);
                c40883G2t.LIZLLL("author_id", aweme.getAuthorUid());
                c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aid));
                J9P.LIZIZ(LJJLIIIJ, str, "click_favorite_video", (Bundle) c40883G2t.LIZ, new C85077XaD(context, this, aweme));
                return;
            }
            return;
        }
        handleFavorite(aweme, context);
    }

    public final void clickLike(Aweme aweme, Context context) {
        if (aweme == null || aweme.isScheduleVideo()) {
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            String aid = aweme.getAid();
            if (context != null) {
                Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
                String str = this.pageEnterFrom;
                if (str == null) {
                    str = "";
                }
                C40883G2t c40883G2t = new C40883G2t();
                c40883G2t.LIZLLL("group_id", aid);
                c40883G2t.LIZLLL("author_id", aweme.getAuthorUid());
                c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aid));
                J9P.LIZIZ(LJJLIIIJ, str, "", (Bundle) c40883G2t.LIZ, new C85071Xa7(context, this, aweme));
                return;
            }
            return;
        }
        if (o.LJ(this._isLiked.getValue(), Boolean.TRUE)) {
            handleUnlike(context, aweme);
        } else {
            handleLike(context, aweme);
        }
    }

    public final void handleFavorite(Aweme aweme, Context context) {
        if (aweme == null) {
            return;
        }
        if (!C2NU.LIZ.LIZIZ()) {
            C05L.LIZLLL(context, R.string.img);
        } else {
            XKX.LIZLLL(getAssemVMScope(), null, null, new C64482g0(this, aweme, context, null), 3);
        }
    }

    public final void handleLike(Context context, Aweme aweme) {
        UpvotePreloadStruct upvotePreload;
        if (!C2NU.LIZ.LIZIZ()) {
            C05L.LIZLLL(context, R.string.img);
            return;
        }
        if (aweme != null && aweme.getAwemeType() != 34) {
            boolean z = false;
            if (((RBX) HG3.LJIILL()).isLogin()) {
                if (getFiendsUpvote(aweme) || ((upvotePreload = aweme.getUpvotePreload()) != null && upvotePreload.getNeedPullUpvoteInfo())) {
                    z = true;
                }
            } else {
                z = false;
            }
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            sendDiggRequest(context, aid, 1, aweme, z);
        }
    }

    public final void handleUnlike(Context context, Aweme aweme) {
        if (!C2NU.LIZ.LIZIZ()) {
            C05L.LIZLLL(context, R.string.img);
        } else if (aweme != null && aweme.getAwemeType() != 34) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            sendDiggRequest$default(this, context, aid, 0, aweme, false, 16, null);
        }
    }

    public final void initAweme(Aweme aweme, String str) {
        this.aweme = aweme;
        this.pageEnterFrom = str;
    }

    public final void playPlayer(C84735XNj c84735XNj, int i) {
        this.mediaPlayerController.LJFF(c84735XNj, i);
    }

    public final void refreshLikeState(Aweme aweme, String aid) {
        o.LJIIIZ(aid, "aid");
        if (aweme == null || !o.LJ(aid, aweme.getAid())) {
            return;
        }
        MutableLiveData<Boolean> mutableLiveData = this._isLiked;
        boolean z = true;
        if (aweme.getUserDigg() != 1) {
            z = false;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C212418Vh.LJIIJJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void withStateSafe(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C212418Vh.LJIIL(vm1, interfaceC88472Yns);
    }

    private final HashMap<String, String> buildQueryMap(String str, int i, boolean z) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("aweme_id", str);
        hashMap.put("type", String.valueOf(i));
        hashMap.put("friends_upvote", String.valueOf(z));
        return hashMap;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C212418Vh.LJIIJ(vm1, vm2, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C212418Vh.LJIIIZ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public static /* synthetic */ void playPlayer$default(FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel, C84735XNj c84735XNj, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        fullEpisodeDetailsViewModel.playPlayer(c84735XNj, i);
    }

    private final void sendDiggRequest(Context context, String str, int i, Aweme aweme, boolean z) {
        String str2;
        String str3;
        Long creativeId;
        Long adId;
        if (i == 1) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            C48229IwL.LIZ(new C48231IwN(1, aid, "", System.currentTimeMillis()));
        }
        HashMap<String, String> buildQueryMap = buildQueryMap(str, i, z);
        String str4 = null;
        if (aweme != null && aweme.isAd()) {
            if (context != null) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    str2 = awemeRawAd.getLogExtra();
                } else {
                    str2 = null;
                }
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null && (adId = awemeRawAd2.getAdId()) != null) {
                    str3 = String.valueOf(adId);
                } else {
                    str3 = null;
                }
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                if (awemeRawAd3 != null && (creativeId = awemeRawAd3.getCreativeId()) != null) {
                    str4 = String.valueOf(creativeId);
                }
                C59955Nfz.LIZ(context, str2, str3, str4, buildQueryMap);
            }
        } else {
            C59955Nfz.LIZIZ("", null, buildQueryMap);
        }
        this.isLiking = true;
        this.itemDiggPresenter.LJIILL(buildQueryMap);
    }

    public final void refreshFavoriteState(boolean z, Aweme aweme, Context context, String aid, boolean z2) {
        o.LJIIIZ(aid, "aid");
        if (aweme == null || !o.LJ(aid, aweme.getAid())) {
            return;
        }
        Boolean bool = null;
        if (z) {
            MutableLiveData<Boolean> mutableLiveData = this._isFavorite;
            if (this.isFavorite.getValue() != null) {
                bool = Boolean.valueOf(!r0.booleanValue());
            }
            mutableLiveData.setValue(bool);
            return;
        }
        Aweme i6 = AwemeService.LIZ().i6(aweme.getAid());
        if (context != null) {
            C79004UzY.LJJIJIIJI(context);
        }
        MutableLiveData<Boolean> mutableLiveData2 = this._isFavorite;
        if (i6 != null) {
            bool = Boolean.valueOf(i6.isCollected());
        }
        mutableLiveData2.setValue(bool);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, T> InterfaceC222288nw asyncSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super C3C8, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super C3C8, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C212418Vh.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LJI(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    public static /* synthetic */ void refreshFavoriteState$default(FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel, boolean z, Aweme aweme, Context context, String str, boolean z2, int i, Object obj) {
        if ((i & 16) != 0) {
            z2 = false;
        }
        fullEpisodeDetailsViewModel.refreshFavoriteState(z, aweme, context, str, z2);
    }

    public static /* synthetic */ void sendDiggRequest$default(FullEpisodeDetailsViewModel fullEpisodeDetailsViewModel, Context context, String str, int i, Aweme aweme, boolean z, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        fullEpisodeDetailsViewModel.sendDiggRequest(context, str, i, aweme, z);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
