package com.ss.android.ugc.aweme.ui.feed;

import X.ActivityC45651qj;
import X.C184077Kh;
import X.C201347vG;
import X.C201467vS;
import X.C2044180n;
import X.C2044380p;
import X.C2045581b;
import X.C209108Io;
import X.C214348b8;
import X.C214378bB;
import X.C214528bQ;
import X.C222588oQ;
import X.C38995FSd;
import X.C55096Ljo;
import X.C5H3;
import X.C65352Pkq;
import X.C78880UxY;
import X.C78926UyI;
import X.C81J;
import X.C81K;
import X.C88Q;
import X.EnumC201127uu;
import X.EnumC221088m0;
import X.InterfaceC2043980l;
import X.V16;
import X.X1D;
import Y.IDiS165S0200000_3;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.detail.DetailFlingGestureAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.main.FlingGestureAbility;
import com.ss.android.ugc.aweme.model.PostModeEgressEtData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.service.IPhotosViewHolderType;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedPhotosViewHolder extends BaseSimpleFeedViewCell implements IPhotosViewHolderType, InterfaceC2043980l {
    public final C5H3 LLZZZIL;
    public final C2044180n LLZZZZ;
    public IDiS165S0200000_3 a;
    public final C214378bB b;
    public String c;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final int LJLJJLL() {
        return 6;
    }

    @Override // X.InterfaceC2043980l
    public final void LJLL(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final String gR() {
        return "cell_photos";
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.BaseSimpleFeedViewCell
    public final C88Q LLLLIIL() {
        return new C88Q() { // from class: X.81L
            @Override // X.C88Q
            public final void LJ() {
            }

            @Override // X.C88Q
            public final void LJFF() {
            }

            @Override // X.C88Q
            public final void LJJJJZI() {
            }

            @Override // X.C88Q
            public final void n() {
            }

            @Override // X.C88Q
            public final void LIZ() {
                FeedPhotosViewHolder.this.Xx();
            }

            @Override // X.C88Q
            public final void LIZJ() {
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    LLLLLILLIL.f1(false, System.currentTimeMillis(), null);
                }
                FeedPhotosViewHolder.this.Xx();
            }

            @Override // X.C88Q
            public final void LIZLLL() {
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    LLLLLILLIL.n1(System.currentTimeMillis());
                }
                FeedPhotosViewHolder.this.LF();
            }

            @Override // X.C88Q
            public final void LJJIIZ() {
                int i;
                AwemeRawAd awemeRawAd;
                PhotoModeImageInfo photoModeImageInfo;
                List<PhotoModeImageUrlModel> imageList;
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    FeedPhotosViewHolder feedPhotosViewHolder = FeedPhotosViewHolder.this;
                    Aweme aweme = feedPhotosViewHolder.LJLLL;
                    if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                        i = imageList.size();
                    } else {
                        i = 0;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    Aweme aweme2 = feedPhotosViewHolder.LJLLL;
                    if (aweme2 != null) {
                        awemeRawAd = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    LLLLLILLIL.h1(i, currentTimeMillis, awemeRawAd);
                }
                FeedPhotosViewHolder.this.LF();
                FeedPhotosViewHolder feedPhotosViewHolder2 = FeedPhotosViewHolder.this;
                IDiS165S0200000_3 iDiS165S0200000_3 = feedPhotosViewHolder2.a;
                if (iDiS165S0200000_3 != null) {
                    if (feedPhotosViewHolder2.LLLLLL == null) {
                        InterfaceC55235Lm3 vScope = feedPhotosViewHolder2.LLLLIILLL;
                        o.LJIIIZ(vScope, "vScope");
                        feedPhotosViewHolder2.LLLLLL = (HomePageViewPagerAbility) C55096Ljo.LIZ(vScope, HomePageViewPagerAbility.class, null);
                    }
                    HomePageViewPagerAbility homePageViewPagerAbility = feedPhotosViewHolder2.LLLLLL;
                    if (homePageViewPagerAbility != null) {
                        homePageViewPagerAbility.ku(iDiS165S0200000_3);
                    }
                }
                feedPhotosViewHolder2.a = null;
            }

            @Override // X.C88Q
            public final void LJJJJJL() {
                FeedPhotosViewHolder feedPhotosViewHolder = FeedPhotosViewHolder.this;
                if (feedPhotosViewHolder.LLZZZZ.LJLJLJ == -1) {
                    feedPhotosViewHolder.LLLLLLZ(false);
                    IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                    if (LLLLLILLIL == null) {
                        return;
                    }
                    LLLLLILLIL.f1(false, System.currentTimeMillis(), null);
                }
            }

            @Override // X.C88Q
            public final void onDestroyView() {
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    LLLLLILLIL.n1(System.currentTimeMillis());
                }
            }

            @Override // X.C88Q
            public final void onPause() {
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    LLLLLILLIL.n1(System.currentTimeMillis());
                }
            }

            @Override // X.C88Q
            public final void onResume() {
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    LLLLLILLIL.f1(false, System.currentTimeMillis(), null);
                }
                FeedPhotosViewHolder.this.Xx();
            }

            @Override // X.C88Q
            public final void LIZIZ(String str) {
                int i;
                List<PhotoModeImageUrlModel> imageList;
                List<PhotoModeImageUrlModel> imageList2;
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    FeedPhotosViewHolder feedPhotosViewHolder = FeedPhotosViewHolder.this;
                    LLLLLILLIL.reset();
                    int i2 = 0;
                    LLLLLILLIL.a1(0);
                    long currentTimeMillis = System.currentTimeMillis();
                    PhotoModeImageInfo photoModeImageInfo = feedPhotosViewHolder.LJLLL.getPhotoModeImageInfo();
                    if (photoModeImageInfo != null && (imageList2 = photoModeImageInfo.getImageList()) != null) {
                        i = imageList2.size();
                    } else {
                        i = 0;
                    }
                    LLLLLILLIL.f1(true, currentTimeMillis, Integer.valueOf(i));
                    PhotoModeImageInfo photoModeImageInfo2 = feedPhotosViewHolder.LJLLL.getPhotoModeImageInfo();
                    if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                        i2 = imageList.size();
                    }
                    Aweme aweme = feedPhotosViewHolder.LJLLL;
                    o.LJIIIIZZ(aweme, "aweme");
                    LLLLLILLIL.u1(i2, aweme);
                    if (C1DJ.LJJ(feedPhotosViewHolder.LJLLL)) {
                        LLLLLILLIL.m1(C55096Ljo.LJIJ(feedPhotosViewHolder));
                    }
                }
                FeedPhotosViewHolder feedPhotosViewHolder2 = FeedPhotosViewHolder.this;
                feedPhotosViewHolder2.getClass();
                C76732zl c76732zl = new C76732zl();
                c76732zl.element = -1;
                IDiS165S0200000_3 iDiS165S0200000_3 = new IDiS165S0200000_3(c76732zl, feedPhotosViewHolder2, 1);
                if (feedPhotosViewHolder2.LLLLLL == null) {
                    InterfaceC55235Lm3 vScope = feedPhotosViewHolder2.LLLLIILLL;
                    o.LJIIIZ(vScope, "vScope");
                    feedPhotosViewHolder2.LLLLLL = (HomePageViewPagerAbility) C55096Ljo.LIZ(vScope, HomePageViewPagerAbility.class, null);
                }
                HomePageViewPagerAbility homePageViewPagerAbility = feedPhotosViewHolder2.LLLLLL;
                if (homePageViewPagerAbility != null) {
                    homePageViewPagerAbility.ii(iDiS165S0200000_3);
                }
                feedPhotosViewHolder2.a = iDiS165S0200000_3;
                FeedPhotosViewHolder.this.c = str;
            }

            @Override // X.C88Q
            public final void LJII(C56682Ki event) {
                String str;
                o.LJIIIZ(event, "event");
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    if (!event.LJLIL) {
                        LLLLLILLIL.n1(System.currentTimeMillis());
                    } else {
                        LLLLLILLIL.f1(false, System.currentTimeMillis(), null);
                    }
                }
                FeedPhotosViewHolder feedPhotosViewHolder = FeedPhotosViewHolder.this;
                String str2 = feedPhotosViewHolder.c;
                ActivityC45651qj activity = feedPhotosViewHolder.getActivity();
                if (activity != null) {
                    str = C116694i1.LIZ(activity).nv0();
                } else {
                    str = null;
                }
                if (o.LJ(str2, str) && event.LJLIL) {
                    FeedPhotosViewHolder.this.Xx();
                } else {
                    FeedPhotosViewHolder.this.LF();
                }
            }

            @Override // X.C88Q
            public final void Z6(C209108Io event) {
                o.LJIIIZ(event, "event");
                IAdPhotoModeService LLLLLILLIL = FeedPhotosViewHolder.this.LLLLLILLIL();
                if (LLLLLILLIL != null) {
                    if (!o.LJ(event.LJLILLLLZI, "HOME")) {
                        LLLLLILLIL.n1(System.currentTimeMillis());
                    } else {
                        LLLLLILLIL.f1(false, System.currentTimeMillis(), null);
                    }
                }
            }
        };
    }

    public final IAdPhotoModeService LLLLLILLIL() {
        Aweme aweme = this.LJLLL;
        if (aweme != null && aweme.isAd()) {
            return AdPhotoModeServiceImpl.LIZ();
        }
        return null;
    }

    public final PhotoViewModelV2 LLLLLLL() {
        return (PhotoViewModelV2) this.LLZZZIL.getValue();
    }

    public final void Xx() {
        Aweme aweme = this.LJLLL;
        if (aweme != null && V16.LJJIFFI(aweme) == 1) {
            return;
        }
        FlingGestureAbility flingGestureAbility = (FlingGestureAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), DetailFlingGestureAbility.class, null);
        if (flingGestureAbility != null) {
            flingGestureAbility.Xx();
        }
        FlingGestureAbility flingGestureAbility2 = (FlingGestureAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), HomePageViewPagerAbility.class, null);
        if (flingGestureAbility2 == null) {
            return;
        }
        flingGestureAbility2.Xx();
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final boolean declineReport() {
        return this.LLZZZZ.LJLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final long getSavedDuration() {
        long j;
        C2044180n c2044180n = this.LLZZZZ;
        long j2 = c2044180n.LJLLI;
        Long l = c2044180n.LJLJJI;
        if (l != null) {
            j = System.currentTimeMillis() - l.longValue();
            c2044180n.LJLJJI = null;
        } else {
            c2044180n.LJLJJI = null;
            j = 0;
        }
        long j3 = j2 + j;
        c2044180n.LJLLI = 0L;
        return j3;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void permitEventReport() {
        this.LLZZZZ.LJLJLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final boolean D8() {
        boolean z = LLLLLLL().LJZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPhotosViewHolderV2 shouldMutePlayerOnResume mutePlayer: ");
        LIZ.append(z);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        return z;
    }

    public final void LF() {
        FlingGestureAbility flingGestureAbility = (FlingGestureAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), DetailFlingGestureAbility.class, null);
        if (flingGestureAbility != null) {
            flingGestureAbility.LF();
        }
        FlingGestureAbility flingGestureAbility2 = (FlingGestureAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), HomePageViewPagerAbility.class, null);
        if (flingGestureAbility2 != null) {
            flingGestureAbility2.LF();
        }
    }

    public final String LLLLLLLLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPhotosViewHolderV2_");
        LIZ.append(hashCode());
        String LIZ2 = C201347vG.LIZ(null, X1D.LIZIZ(LIZ), 1);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getPhotoSharedVMKey: ");
        LIZ3.append(LIZ2);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ3));
        return LIZ2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final boolean d7() {
        boolean z = !LLLLLLL().LJLLLLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPhotosViewHolderV2 shouldResumePlayerOnResume resumePlayer: ");
        LIZ.append(z);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        return z;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final int getCurrentPlayPosition() {
        IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ(this), IPhotoModeAbility.class, null);
        if (iPhotoModeAbility != null) {
            return iPhotoModeAbility.Jg();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final boolean getIsMuted() {
        return LLLLLLL().LJZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final boolean i7() {
        boolean z = !LLLLLLL().LJLLLLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPhotosViewHolderV2 shouldPausePlayerOnPause pausePlayer: ");
        LIZ.append(z);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        return z;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void fadeInWidgetContainer() {
        super.fadeInWidgetContainer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedPhotosViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        this.LLZZZIL = C214348b8.LIZJ(this, C65352Pkq.LIZ(PhotoViewModelV2.class), C81J.INSTANCE, EnumC221088m0.SYNCHRONIZED);
        this.LLZZZZ = new C2044180n(params.LJIIIZ);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1140);
        this.b = new C214378bB(C65352Pkq.LIZ(PhotoSharedViewModel.class), aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, C81K.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.BaseSimpleFeedViewCell
    public final void LLLLL(boolean z) {
        super.LLLLL(z);
        if (z) {
            LLLLLLL().getClass();
            LLLLLLL().tv0();
            LLLLLLZ(false);
        } else {
            LLLLLLL().getClass();
            LLLLLLL().rv0();
        }
    }

    public final void LLLLLLLZIL(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedPhotosViewHolderV2 onVisibleChanged ");
        LIZ.append(z);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        if (z) {
            LLLLLLZ(false);
            Xx();
        } else {
            LLLLLLZ(true);
            LF();
        }
    }

    public final void LLLLLLZ(boolean z) {
        if (z) {
            C2044180n c2044180n = this.LLZZZZ;
            c2044180n.getClass();
            long currentTimeMillis = System.currentTimeMillis() - c2044180n.LJLJLJ;
            PostModeEgressEtData postModeEgressEtData = c2044180n.LJLL;
            C2044380p c2044380p = new C2044380p(postModeEgressEtData.photoModeDuration + currentTimeMillis + c2044180n.LJLJJLL, postModeEgressEtData.postModeDuration + c2044180n.LJLJL);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("totalPlayTime form fullpage: ");
            LIZ.append(c2044180n.LJLL.photoModeDuration);
            LIZ.append(", ");
            LIZ.append(c2044180n.LJLL.postModeDuration);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("totalPlayTime current feed: ");
            LIZ2.append(c2044180n.LJLJJLL);
            LIZ2.append(", ");
            LIZ2.append(c2044180n.LJLJL);
            LIZ2.append(", ");
            LIZ2.append(currentTimeMillis);
            String msg2 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg2, "msg");
            PhotoViewModelV2 LLLLLLL = LLLLLLL();
            LLLLLLL.LJLLLL.LIZIZ(c2044380p.LJLIL, c2044380p.LJLILLLLZI);
            final C2044180n c2044180n2 = this.LLZZZZ;
            final Aweme aweme = this.LJLLL;
            o.LJIIIIZZ(aweme, "aweme");
            c2044180n2.getClass();
            if (!c2044180n2.LJLJLLL) {
                long j = c2044180n2.LJLJLJ;
                if (j == 0 || j == -1) {
                    return;
                }
                if (c2044180n2.LJLJJL) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("calculateAndReportStayTime isReporting: ");
                    LIZ3.append(c2044180n2.LJLJJL);
                    C201467vS.LJIIJ(X1D.LIZIZ(LIZ3));
                    return;
                }
                c2044180n2.LJLJJL = true;
                long currentTimeMillis2 = System.currentTimeMillis() - c2044180n2.LJLJLJ;
                PostModeEgressEtData postModeEgressEtData2 = c2044180n2.LJLL;
                C2044380p c2044380p2 = new C2044380p(postModeEgressEtData2.photoModeDuration + currentTimeMillis2, postModeEgressEtData2.postModeDuration);
                final long j2 = c2044380p2.LJLIL;
                final long j3 = c2044380p2.LJLILLLLZI;
                C38995FSd.LIZIZ().execute(new Runnable() { // from class: X.80o
                    public final void LIZ() {
                        long j4 = j2;
                        if (j4 >= 0) {
                            long j5 = j3;
                            if (j5 >= 0) {
                                Aweme aweme2 = aweme;
                                C2044180n c2044180n3 = c2044180n2;
                                C2045481a.LIZ(aweme2, j4, j5, c2044180n3.LJLJI, c2044180n3.LJLILLLLZI, C47636Imm.LJII(2));
                            }
                        }
                        C2044180n c2044180n4 = c2044180n2;
                        c2044180n4.LJLJJLL += j2;
                        c2044180n4.LJLJL += j3;
                        c2044180n4.LJLJLJ = -1L;
                        c2044180n4.LJLIL = 0L;
                        c2044180n4.LJLILLLLZI = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                        c2044180n4.LJLL = new PostModeEgressEtData(false, (EnumC201127uu) null, 0L, 0L, 0L, (Long) null, 0, 255);
                        c2044180n4.LJLJJL = false;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ4;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ4) {
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        C2044180n c2044180n3 = this.LLZZZZ;
        if (!c2044180n3.LJLJLLL) {
            c2044180n3.LJLJLJ = System.currentTimeMillis();
        }
        c2044180n3.LJLJLLL = false;
        c2044180n3.LJLJJL = false;
    }

    @Override // X.InterfaceC2043980l
    public final void T2(EnumC201127uu enumC201127uu) {
        ActivityC45651qj activity;
        if ((enumC201127uu == EnumC201127uu.SLIDE_RIGHT_FROM_IMAGE || enumC201127uu == EnumC201127uu.SLIDE_RIGHT || enumC201127uu == EnumC201127uu.BACK || enumC201127uu == EnumC201127uu.BACK_USE_SWIPE_ANIM || enumC201127uu == EnumC201127uu.BACK_USE_FADE_OUT_ANIM) && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void k7(View view) {
        super.k7(view);
        FrameLayout frameLayout = this.LLILZ;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setBackground(null);
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void saveDuration(long j) {
        this.LLZZZZ.LJLLI += j;
    }

    @Override // com.ss.android.ugc.aweme.service.IPhotosViewHolderType
    public final void setStartTime(long j) {
        this.LLZZZZ.LJLJJI = Long.valueOf(j);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public final void ug(Video video) {
        SmartImageView smartImageView = this.LLFII;
        if (smartImageView != null) {
            smartImageView.setVisibility(8);
        }
        this.LLLIIIL = false;
        Aweme aweme = this.LJLLL;
        if (aweme != null && C78880UxY.LJJLIIIJLLLLLLLZ(aweme)) {
            if (this.LLFZ == null) {
                this.LLFZ = AVExternalServiceImpl.LIZ().publishService().createCoverMaskView(this.LLJJJIL, this.LLILZ);
            }
            AVExternalServiceImpl.LIZ().publishService().showPhotoCoverWhenPreview(this.LJLLL, this.LLFII, this.LLFZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void x8(String sessionId) {
        o.LJIIIZ(sessionId, "sessionId");
        PhotoViewModelV2 LLLLLLL = LLLLLLL();
        LLLLLLL.getClass();
        C2045581b c2045581b = LLLLLLL.LJLL;
        c2045581b.getClass();
        c2045581b.LIZ = sessionId;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.BaseSimpleFeedViewCell
    public final void LLLLIL(boolean z, C209108Io event) {
        o.LJIIIZ(event, "event");
        super.LLLLIL(z, event);
        if (z) {
            LLLLLLZ(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0140, code lost:
    
        if (r8.equals("others_homepage") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0162, code lost:
    
        r0 = X.C81M.LIZ(java.lang.Integer.valueOf(com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting.DEFAULT));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015e, code lost:
    
        if (r8.equals("single_song") == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZ(int r27, com.ss.android.ugc.aweme.feed.model.Aweme r28) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.FeedPhotosViewHolder.LLLZ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
