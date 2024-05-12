package X;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;
import com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.aweme.profile.widgets.recommend.user.HomepageRecommendVM;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.9wU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253069wU extends YUI {
    public final Activity LIZ;
    public final C81719W5j LIZIZ;
    public final C106504Fy LIZJ;
    public final C244519ih LIZLLL;
    public final C253069wU LJ = this;
    public C4G1<InterfaceC111364Yq> LJFF;
    public C4G1<ActivityC45651qj> LJI;
    public C4G1<MusProfileEditFragment> LJII;
    public C244469ic LJIIIIZZ;
    public C244469ic LJIIIZ;
    public C244469ic LJIIJ;
    public C244469ic LJIIJJI;
    public C244469ic LJIIL;
    public C244469ic LJIILIIL;
    public C244469ic LJIILJJIL;
    public C244469ic LJIILL;
    public C244469ic LJIILLIIL;
    public C244469ic LJIIZILJ;
    public C244469ic LJIJ;
    public C244469ic LJIJI;
    public C244469ic LJIJJ;
    public C244469ic LJIJJLI;
    public C244469ic LJIL;
    public C244469ic LJJ;
    public C244469ic LJJI;
    public C4G1<QRCodeFragment> LJJIFFI;

    @Override // X.YUZ
    public final void LIZ() {
    }

    @Override // X.YUD
    public final void LIZJ() {
    }

    @Override // X.YUV
    public final void LIZLLL() {
    }

    @Override // X.YUX
    public final void LJ() {
    }

    @Override // X.YUU
    public final void LJFF() {
    }

    @Override // X.InterfaceC87456YUa
    public final void LJIIIIZZ() {
    }

    @Override // X.YUF
    public final void LJIIIZ() {
    }

    @Override // X.YUW
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC87457YUb
    public final void LJIILIIL() {
    }

    @Override // X.YUY
    public final void LJIILJJIL() {
    }

    @Override // X.InterfaceC87458YUc
    public final void LJIILL() {
    }

    @Override // X.YUH
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC255129zo
    public final InterfaceC111364Yq LIZIZ() {
        return this.LJFF.get();
    }

    @Override // X.InterfaceC87441YTl
    public final AbstractC65583PoZ LJII() {
        Activity activity = this.LIZ;
        Application application = (Application) C16880lQ.LLLLL(this.LIZJ.LIZ.LIZ);
        if (application != null) {
            C65574PoQ LJIIZILJ = LJIIZILJ();
            if (activity.getIntent() != null) {
                C16880lQ.LLJJIJI(activity.getIntent());
            }
            return AbstractC65583PoZ.of(new C48221us(application, new ViewModelProvider.AndroidViewModelFactory(application), LJIIZILJ));
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // X.YU4
    public final C253099wX LJIIJ() {
        return new C253099wX(this.LIZJ, this.LIZLLL, this.LJ);
    }

    @Override // X.YUB
    public final C253109wY LJIIL() {
        return new C253109wY(this.LIZJ, this.LIZLLL, this.LJ);
    }

    public final C65574PoQ LJIIZILJ() {
        C65534Pnm builderWithExpectedSize = AbstractC65564PoG.builderWithExpectedSize(11);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel", this.LJIIIIZZ);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel", this.LJIIJ);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.profile.widgets.recommend.user.HomepageRecommendVM", this.LJIIJJI);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel", this.LJIIL);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel", this.LJIILJJIL);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM", this.LJIILL);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel", this.LJIILLIIL);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel", this.LJIJ);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM", this.LJIJJ);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM", this.LJIL);
        builderWithExpectedSize.LIZIZ("com.ss.android.ugc.aweme.watch.history.core.WatchHistoryListViewModel", this.LJJI);
        return builderWithExpectedSize.LIZ();
    }

    @Override // X.YUT
    public final void LJI(ProfileEditActivity profileEditActivity) {
        InterfaceC252839w7<MusProfileEditFragment> c253079wV;
        C4G1<MusProfileEditFragment> c4g1 = this.LJII;
        if (c4g1 instanceof InterfaceC252839w7) {
            c253079wV = (InterfaceC252839w7) c4g1;
        } else {
            c4g1.getClass();
            c253079wV = new C253079wV(c4g1);
        }
        profileEditActivity.LJLJI = c253079wV;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.9ic] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.9ic] */
    public C253069wU(final C106504Fy c106504Fy, final C244519ih c244519ih, C81719W5j c81719W5j, Activity activity) {
        this.LIZJ = c106504Fy;
        this.LIZLLL = c244519ih;
        this.LIZ = activity;
        this.LIZIZ = c81719W5j;
        final int i = 0;
        this.LJFF = C4LK.LIZ(new C4G1<T>(c106504Fy, c244519ih, this, i) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i2, int i3, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i2, i3).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i2, int i3, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i2, i3).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i2, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i2, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i2, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i2, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i;
            }
        });
        final int i2 = 2;
        this.LJI = C4LK.LIZ(new C4G1<T>(c106504Fy, c244519ih, this, i2) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i3, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i3).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i3, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i3).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i2;
            }
        });
        final int i3 = 1;
        this.LJII = C253079wV.LIZ(new C4G1<T>(c106504Fy, c244519ih, this, i3) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i3;
            }
        });
        final int i4 = 3;
        this.LJIIIIZZ = new C4G1<T>(c106504Fy, c244519ih, this, i4) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i4;
            }
        };
        final int i5 = 5;
        this.LJIIIZ = new C4G1<T>(c106504Fy, c244519ih, this, i5) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i5;
            }
        };
        final int i6 = 4;
        this.LJIIJ = new C4G1<T>(c106504Fy, c244519ih, this, i6) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i6;
            }
        };
        final int i7 = 6;
        this.LJIIJJI = new C4G1<T>(c106504Fy, c244519ih, this, i7) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i7;
            }
        };
        final int i8 = 7;
        this.LJIIL = new C4G1<T>(c106504Fy, c244519ih, this, i8) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i8;
            }
        };
        final int i9 = 9;
        this.LJIILIIL = new C4G1<T>(c106504Fy, c244519ih, this, i9) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i9;
            }
        };
        final int i10 = 8;
        this.LJIILJJIL = new C4G1<T>(c106504Fy, c244519ih, this, i10) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i10;
            }
        };
        final int i11 = 10;
        this.LJIILL = new C4G1<T>(c106504Fy, c244519ih, this, i11) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i11;
            }
        };
        final int i12 = 11;
        this.LJIILLIIL = new C4G1<T>(c106504Fy, c244519ih, this, i12) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i12;
            }
        };
        final int i13 = 13;
        this.LJIIZILJ = new C4G1<T>(c106504Fy, c244519ih, this, i13) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i13;
            }
        };
        final int i14 = 12;
        this.LJIJ = new C4G1<T>(c106504Fy, c244519ih, this, i14) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i14;
            }
        };
        final int i15 = 15;
        this.LJIJI = new C4G1<T>(c106504Fy, c244519ih, this, i15) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i15;
            }
        };
        final int i16 = 14;
        this.LJIJJ = new C4G1<T>(c106504Fy, c244519ih, this, i16) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i16;
            }
        };
        final int i17 = 17;
        this.LJIJJLI = new C4G1<T>(c106504Fy, c244519ih, this, i17) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i17;
            }
        };
        final int i18 = 16;
        this.LJIL = new C4G1<T>(c106504Fy, c244519ih, this, i18) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i18;
            }
        };
        final int i19 = 19;
        this.LJJ = new C4G1<T>(c106504Fy, c244519ih, this, i19) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i19;
            }
        };
        final int i20 = 18;
        this.LJJI = new C4G1<T>(c106504Fy, c244519ih, this, i20) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i20;
            }
        };
        final int i21 = 20;
        this.LJJIFFI = C253079wV.LIZ(new C4G1<T>(c106504Fy, c244519ih, this, i21) { // from class: X.9ic
            public final C106504Fy LIZ;
            public final C244519ih LIZIZ;
            public final C253069wU LIZJ;
            public final int LIZLLL;

            /* JADX WARN: Type inference failed for: r1v3, types: [com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment, T] */
            @Override // X.C4G1
            public final T get() {
                switch (this.LIZLLL) {
                    case 0:
                        return (T) new InterfaceC111364Yq() { // from class: X.9is
                            @Override // X.InterfaceC111364Yq
                            public final GroupInviteViewModel LIZ(String str, GroupInfo groupInfo) {
                                return new GroupInviteViewModel(str, groupInfo);
                            }
                        };
                    case 1:
                        ActivityC45651qj activity2 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity2, "activity");
                        ?? r1 = (T) ((MusProfileEditFragment) activity2.getSupportFragmentManager().LJJJIL("user_profile_edit_fragment"));
                        if (r1 == 0) {
                            return (T) new MusProfileEditFragment();
                        }
                        r1.LLJZIJLIL = true;
                        return r1;
                    case 2:
                        Activity activity3 = this.LIZJ.LIZ;
                        try {
                            T t = (T) ((ActivityC45651qj) activity3);
                            if (t != null) {
                                return t;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
                        } catch (ClassCastException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Expected activity to be a FragmentActivity: ");
                            LIZ.append(activity3);
                            throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
                        }
                    case 3:
                        C244519ih c244519ih2 = this.LIZIZ;
                        return (T) new InterfaceC06740Og<GiphyViewModel>(c244519ih2.LIZJ, this.LIZ.LJIIIZ, c244519ih2.LIZLLL, c244519ih2.LJ) { // from class: X.4Fz
                            public final C4G1<InterfaceC106444Fs> LIZ;
                            public final C4G1<GiphyAnalytics> LIZIZ;
                            public final C4G1<InterfaceC106434Fr> LIZJ;
                            public final C4G1<AbstractC73946T0k> LIZLLL;

                            @Override // X.InterfaceC06740Og
                            public final GiphyViewModel create() {
                                return new GiphyViewModel(this.LIZ.get(), this.LIZIZ.get(), this.LIZJ.get(), this.LIZLLL.get());
                            }

                            {
                                this.LIZ = r1;
                                this.LIZIZ = r2;
                                this.LIZJ = r3;
                                this.LIZLLL = r4;
                            }
                        };
                    case 4:
                        return (T) new InterfaceC06740Og<HighlightSelectListViewModel>(this.LIZJ.LJIIIZ) { // from class: X.9fb
                            public final C4G1<InterfaceC214228aw<InterfaceC240489cC>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final HighlightSelectListViewModel create() {
                                return new HighlightSelectListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 5:
                        return (T) new InterfaceC214228aw<InterfaceC240489cC>() { // from class: X.9ik
                            public final C244559il LIZ = new InterfaceC240489cC() { // from class: X.9il
                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk LJJJLL(String str) {
                                    return C244599ip.LIZ().getNewReleasedList(str, "highlight_music");
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightMusic(String str, String str2) {
                                    return C244599ip.LIZ().highlightMusic(str, str2);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240489cC getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 6:
                        return (T) new InterfaceC06740Og<HomepageRecommendVM>() { // from class: X.9MB
                            @Override // X.InterfaceC06740Og
                            public final HomepageRecommendVM create() {
                                return new HomepageRecommendVM();
                            }
                        };
                    case 7:
                        return (T) new InterfaceC06740Og<MusicPlayViewModel>() { // from class: X.9eO
                            @Override // X.InterfaceC06740Og
                            public final MusicPlayViewModel create() {
                                return new MusicPlayViewModel();
                            }
                        };
                    case 8:
                        return (T) new InterfaceC06740Og<OriginMusicListViewModel>(this.LIZJ.LJIILIIL) { // from class: X.9fe
                            public final C4G1<InterfaceC214228aw<InterfaceC240439c7>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final OriginMusicListViewModel create() {
                                return new OriginMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 9:
                        return (T) new InterfaceC214228aw<InterfaceC240439c7>() { // from class: X.9ij
                            public final C244569im LIZ = new InterfaceC240439c7() { // from class: X.9im
                                @Override // X.InterfaceC240439c7
                                public final PinnedMusicList getPinnedMusicList(String str) {
                                    return MusicAwemeApi.LIZ.getPinnedMusicList(str).get();
                                }

                                @Override // X.InterfaceC240279br
                                public final AbstractC73672Svk<BaseResponse> highlightDelete(String str) {
                                    return C244599ip.LIZ().highlightDelete(str);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240439c7
                                public final OriginalMusicList LJL(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.fetchOriginalMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240439c7 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 10:
                        return (T) new InterfaceC06740Og<ProfileMafRedPointsVM>() { // from class: X.9MA
                            @Override // X.InterfaceC06740Og
                            public final ProfileMafRedPointsVM create() {
                                return new ProfileMafRedPointsVM();
                            }
                        };
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        return (T) new InterfaceC06740Og<ProfilePlatformViewModel>() { // from class: X.9T2
                            @Override // X.InterfaceC06740Og
                            public final ProfilePlatformViewModel create() {
                                return new ProfilePlatformViewModel();
                            }
                        };
                    case 12:
                        return (T) new InterfaceC06740Og<SearchMusicListViewModel>(this.LIZJ.LJIIZILJ) { // from class: X.9fd
                            public final C4G1<InterfaceC214228aw<InterfaceC240449c8>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final SearchMusicListViewModel create() {
                                return new SearchMusicListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        return (T) new InterfaceC214228aw<InterfaceC240449c8>() { // from class: X.9ii
                            public final C244579in LIZ = new InterfaceC240449c8() { // from class: X.9in
                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> LJJJIL(String str, String str2) {
                                    return C244589io.LIZ().unpinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240429c6
                                public final AbstractC73672Svk<BaseResponse> pinMusic(String str, String str2) {
                                    return C244589io.LIZ().pinMusic(str, str2);
                                }

                                @Override // X.InterfaceC240449c8
                                public final OriginalMusicList LJIJ(int i22, int i32, String str, String str2) {
                                    return MusicAwemeApi.LIZ.searchMusicList(str, str2, i22, i32).get();
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC240449c8 getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 14:
                        final C244469ic c244469ic = this.LIZJ.LJIJI;
                        return (T) new InterfaceC06740Og<UserProfileFollowVM>(c244469ic) { // from class: X.9id
                            public final C4G1<InterfaceC214228aw<InterfaceC244509ig>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileFollowVM create() {
                                return new UserProfileFollowVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = c244469ic;
                            }
                        };
                    case 15:
                        IUserService LIZ2 = UserService.LIZ();
                        o.LJIIIIZZ(LIZ2, "get().getService(IUserService::class.java)");
                        return (T) new C244489ie(LIZ2);
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        return (T) new InterfaceC06740Og<UserProfileInfoVM>(this.LIZJ.LJIJJLI) { // from class: X.9fc
                            public final C4G1<InterfaceC214228aw<InterfaceC237119Sh>> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final UserProfileInfoVM create() {
                                return new UserProfileInfoVM(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 17:
                        return (T) new InterfaceC214228aw<InterfaceC237119Sh>() { // from class: X.9iq
                            public final C251829uU LIZ = new InterfaceC237119Sh() { // from class: X.9uU
                                @Override // X.InterfaceC237119Sh
                                public final UserResponse LLI(Aweme aweme, String str, String str2, int i22, boolean z) {
                                    String LIZJ;
                                    boolean z2;
                                    AwemeRawAd awemeRawAd;
                                    String str3;
                                    String str4;
                                    String str5 = null;
                                    if (C61102aY.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("ProfileApi queryUserResponse aid: ");
                                        if (aweme != null) {
                                            str3 = aweme.getAid();
                                        } else {
                                            str3 = null;
                                        }
                                        LIZ3.append(str3);
                                        LIZ3.append(", aweme_secUid: ");
                                        if (aweme != null) {
                                            str4 = aweme.getSecAuthorUid();
                                        } else {
                                            str4 = null;
                                        }
                                        C36922EeM.LIZLLL(4, "feed2profile", C025908h.LIZIZ(LIZ3, str4, ", request_secUid: ", str, LIZ3));
                                    }
                                    Integer secIdSwitch = C2YJ.LIZIZ.LIZ.getSecIdSwitch();
                                    if (secIdSwitch == null || secIdSwitch.intValue() != 0) {
                                        if (!TextUtils.isEmpty(str)) {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, null, null);
                                        } else {
                                            LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), null, str2, null);
                                        }
                                    } else {
                                        LIZJ = C251809uS.LIZJ(i22, Boolean.valueOf(z), str, str2, null);
                                    }
                                    Uri.Builder buildUpon = UriProtector.parse(LIZJ).buildUpon();
                                    if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getNotificationConfig() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                                        if (awemeRawAd2 != null) {
                                            str5 = awemeRawAd2.getCreativeIdStr();
                                        }
                                        buildUpon.appendQueryParameter("creative_id", str5);
                                        buildUpon.appendQueryParameter("need_nofify_settings", "true");
                                    }
                                    C3EA.LIZ(LIZJ);
                                    C176956x1 c176956x1 = MF2.LIZ;
                                    if (c176956x1 != null) {
                                        C176946x0 c176946x0 = c176956x1.LIZ;
                                        if (c176946x0 != null) {
                                            c176946x0.LIZLLL = System.currentTimeMillis();
                                        }
                                        C176946x0 c176946x02 = c176956x1.LIZ;
                                        if (c176946x02 != null) {
                                            c176946x02.LJI = true;
                                        }
                                    }
                                    C73353Sqb.LIZJ().LJIIJ();
                                    F30 f30 = new F30();
                                    ((ArrayList) f30.LJLIL).add(new C66621QCr("check_preload", "true"));
                                    return (UserResponse) C87030YDq.LIZIZ.apiExecuteGetJSONObject(0, LIZJ, UserResponse.class, "", f30, true, null);
                                }
                            };

                            @Override // X.InterfaceC214228aw
                            public final void release() {
                            }

                            @Override // X.InterfaceC214228aw
                            public final /* bridge */ /* synthetic */ InterfaceC237119Sh getOperator() {
                                return this.LIZ;
                            }
                        };
                    case 18:
                        return (T) new InterfaceC06740Og<WatchHistoryListViewModel>(this.LIZJ.LJJ) { // from class: X.9ff
                            public final C4G1<IAccountUserService> LIZ;

                            @Override // X.InterfaceC06740Og
                            public final WatchHistoryListViewModel create() {
                                return new WatchHistoryListViewModel(this.LIZ.get());
                            }

                            {
                                this.LIZ = r1;
                            }
                        };
                    case 19:
                        this.LIZJ.LIZIZ.getClass();
                        T t2 = (T) AccountService.LJIJ().LJFF();
                        o.LJIIIIZZ(t2, "get().getService(IAccoun…class.java).userService()");
                        return t2;
                    case 20:
                        ActivityC45651qj activity4 = this.LIZJ.LJI.get();
                        o.LJIIIZ(activity4, "activity");
                        T t3 = (T) C70657RoD.LJIILIIL(activity4);
                        o.LJII(t3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qrcode.QRCodeFragment");
                        return t3;
                    default:
                        throw new AssertionError(this.LIZLLL);
                }
            }

            {
                this.LIZ = c106504Fy;
                this.LIZIZ = c244519ih;
                this.LIZJ = this;
                this.LIZLLL = i21;
            }
        });
    }
}
