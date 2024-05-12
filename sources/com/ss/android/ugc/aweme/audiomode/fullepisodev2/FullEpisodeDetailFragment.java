package com.ss.android.ugc.aweme.audiomode.fullepisodev2;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C145995oB;
import X.C16880lQ;
import X.C184077Kh;
import X.C1FM;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C2VP;
import X.C3C5;
import X.C47261Igj;
import X.C55987LyB;
import X.C56451MDn;
import X.C62562cu;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78496UrM;
import X.C78897Uxp;
import X.C78926UyI;
import X.C81156VtA;
import X.C81312Vvg;
import X.C84492XEa;
import X.C84728XNc;
import X.C84735XNj;
import X.C85059XZv;
import X.C85061XZx;
import X.C85064Xa0;
import X.C85067Xa3;
import X.C8HI;
import X.C90903hW;
import X.EnumC81316Vvk;
import X.FMX;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.KL2;
import X.ServiceConnectionC84731XNf;
import X.ViewTreeObserverOnGlobalLayoutListenerC81158VtC;
import X.W5E;
import X.W5F;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS82S0100000_14;
import Y.AObserverS83S0100000_15;
import Y.ARunnableS51S0100000_15;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bef.effectsdk.view.BEFView$Builder;
import com.bef.effectsdk.view.BEFView$FitMode;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.notification.BackgroundAudioService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.feed.model.PodcastUrlModel;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS68S1200000_15;
import kotlin.jvm.internal.o;
import q03.IDaS491S0100000_15;

/* loaded from: classes16.dex */
public final class FullEpisodeDetailFragment extends FeedFragment {
    public ServiceConnectionC84731XNf LJLJL;
    public TuxIconView LJLJLJ;
    public C81156VtA LJLJLLL;
    public TuxTextView LJLL;
    public ViewGroup LJLLI;
    public View LJLLILLLL;
    public FrameLayout LJLLJ;
    public SmartImageView LJLLL;
    public TuxIconView LJLLLL;
    public TuxIconView LJLLLLLL;
    public C81156VtA LJLZ;
    public C81156VtA LJZ;
    public ViewGroup LJZI;
    public View LJZL;
    public ViewGroup LL;
    public View LLD;
    public TuxIconView LLF;
    public FrameLayout LLFF;
    public FrameLayout LLFFF;
    public TuxTextView LLFII;
    public TuxTextView LLFZ;
    public C1FM LLI;
    public C81312Vvg LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIIJ;
    public Aweme LLIIIZ;
    public PodcastInfo LLIIJI;
    public String LLIIJLIL;
    public final C214298b3 LLIIL;
    public View LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public final Map<Integer, View> LLIL = new LinkedHashMap();
    public final C85061XZx LLIIII = new C85061XZx(this);
    public final ARunnableS51S0100000_15 LLIIIILZ = new ARunnableS51S0100000_15(this, 25);
    public final C84728XNc LLIIIL = new C84728XNc(this);

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void Gz() {
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean ub(boolean z) {
        return false;
    }

    public FullEpisodeDetailFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(FullEpisodeDetailsViewModel.class);
        this.LLIIL = new C214298b3(LIZ, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 39), C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C85059XZv.INSTANCE, (InterfaceC65784Pro) null, 384);
    }

    public final FullEpisodeDetailsViewModel Hl() {
        return (FullEpisodeDetailsViewModel) this.LLIIL.getValue();
    }

    public final void Jl() {
        String str;
        if (!this.LLIILZL) {
            long playBackTime = Hl().getPlayBackTime();
            if (playBackTime >= Hl().getPlayerDuration()) {
                playBackTime = 0;
            }
            Keva repo = Keva.getRepo("FullEpisodeDetailFragment");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("full_episode_progress");
            PodcastInfo podcastInfo = this.LLIIJI;
            if (podcastInfo != null) {
                str = podcastInfo.getEpisodeItemId();
            } else {
                str = null;
            }
            LIZ.append(str);
            repo.storeLong(X1D.LIZIZ(LIZ), playBackTime);
            this.LLIILZL = true;
        }
    }

    public final void Gl() {
        o.LJIIIIZZ(requireContext(), "requireContext()");
        int LLILZ = (((int) C63081OpJ.LLILZ(r1, r1.getResources().getDisplayMetrics().widthPixels)) - 66) - 90;
        if (LLILZ >= 248) {
            return;
        }
        C81312Vvg c81312Vvg = this.LLIFFJFJJ;
        if (c81312Vvg != null) {
            ViewGroup.LayoutParams layoutParams = c81312Vvg.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) KL2.LIZJ(requireContext(), LLILZ);
            return;
        }
        o.LJIJI("playerSeekBarView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Jl();
        Hl().stopPlayer(new C84735XNj("STOP_FROM_MAIN_PLAYER"));
        if (this.LJLJL != null) {
            Context requireContext = requireContext();
            ServiceConnectionC84731XNf serviceConnectionC84731XNf = this.LJLJL;
            if (serviceConnectionC84731XNf != null) {
                requireContext.unbindService(serviceConnectionC84731XNf);
            } else {
                o.LJIJI("backgroundAudioServiceConnection");
                throw null;
            }
        }
        C84492XEa.LIZ = null;
        C84492XEa.LIZJ = null;
        C84492XEa.LIZLLL = null;
        C1FM c1fm = this.LLI;
        if (c1fm != null) {
            c1fm.onPause();
            FrameLayout frameLayout = this.LJLLJ;
            if (frameLayout != null) {
                C16880lQ.LJLLLL(c1fm, frameLayout);
                c1fm.onDestroy();
            } else {
                o.LJIJI("bEFViewContainer");
                throw null;
            }
        }
        this.LLI = null;
        Hl().mobPlayTime();
        ((LinkedHashMap) this.LLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1FM c1fm = this.LLI;
        if (c1fm != null) {
            c1fm.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1FM c1fm = this.LLI;
        if (c1fm != null) {
            c1fm.onResume();
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    public final void Kl(long j) {
        int i = (int) j;
        C81312Vvg c81312Vvg = this.LLIFFJFJJ;
        if (c81312Vvg != null) {
            c81312Vvg.setProgress(i);
            int i2 = i / 1000;
            TuxTextView tuxTextView = this.LLFII;
            if (tuxTextView != null) {
                tuxTextView.setText(C56451MDn.LIZ(i2, this.LLIIZ));
                return;
            } else {
                o.LJIJI("curPlayTime");
                throw null;
            }
        }
        o.LJIJI("playerSeekBarView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        Aweme aweme;
        PodcastInfo podcastInfo;
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (onBackPressedDispatcher = mo49getActivity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new C85064Xa0(this));
        }
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("init_aweme");
        } else {
            serializable = null;
        }
        if (serializable instanceof Aweme) {
            aweme = (Aweme) serializable;
        } else {
            aweme = null;
        }
        this.LLIIIZ = aweme;
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null) {
            this.LLIIJI = podcastInfo;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("page_enter_from");
        }
        this.LLIIJLIL = str;
        C85067Xa3.LIZ = str;
    }

    public final void Il(C81156VtA c81156VtA, String str) {
        Typeface LIZLLL = C8HI.LIZJ().LIZLLL("medium");
        if (LIZLLL != null) {
            c81156VtA.getPaint().setTypeface(LIZLLL);
        }
        c81156VtA.setText(str);
        c81156VtA.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC81158VtC(c81156VtA, str));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        List<String> list;
        String str3;
        String str4;
        Context context;
        Boolean isBrandedContent;
        String aid;
        List<String> episodeAuthors;
        int i;
        String episodeTitle;
        int i2;
        PodcastUrlModel cover;
        List<String> urlList;
        String str5;
        String str6;
        PodcastInfo podcastInfo;
        PodcastUrlModel playAddr;
        List<String> urlList2;
        PodcastInfo podcastInfo2;
        PodcastUrlModel playAddr2;
        PodcastInfo podcastInfo3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LLIIJI == null) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        Aweme aweme = this.LLIIIZ;
        C145995oB c145995oB = new C145995oB();
        String str7 = "";
        if (aweme == null || (podcastInfo3 = aweme.getPodcastInfo()) == null || (str = podcastInfo3.getEpisodeItemId()) == null) {
            str = "";
        }
        c145995oB.LJI("podcast_rss_entry_id", str);
        String str8 = null;
        if (aweme == null || (str2 = aweme.getAid()) == null) {
            str2 = "";
        }
        c145995oB.LJI("preview_video_id", str2);
        String str9 = C85067Xa3.LIZ;
        if (str9 == null) {
            str9 = "";
        }
        c145995oB.LJI("preview_enter_from", str9);
        if (aweme != null && (podcastInfo2 = aweme.getPodcastInfo()) != null && (playAddr2 = podcastInfo2.getPlayAddr()) != null) {
            list = playAddr2.getUrlList();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            if (aweme == null || (podcastInfo = aweme.getPodcastInfo()) == null || (playAddr = podcastInfo.getPlayAddr()) == null || (urlList2 = playAddr.getUrlList()) == null || (str6 = (String) ListProtector.get(urlList2, 0)) == null) {
                str6 = "";
            }
            c145995oB.LIZLLL("podcast_rss_feed_url", str6);
        }
        FMX.LJIIL("enter_podcast_page", c145995oB.LIZ);
        Hl().initAweme(this.LLIIIZ, this.LLIIJLIL);
        TuxIconView tuxIconView = this.LJLJLJ;
        if (tuxIconView != null) {
            C78897Uxp.LJJJJLL(tuxIconView);
            TuxIconView tuxIconView2 = this.LJLJLJ;
            if (tuxIconView2 != null) {
                C16880lQ.LJJJ(tuxIconView2, new ACListenerS35S0100000_15(this, 171));
                PodcastInfo podcastInfo4 = this.LLIIJI;
                if (podcastInfo4 == null || (str3 = podcastInfo4.getFeedTitle()) == null) {
                    str3 = "";
                }
                TuxTextView tuxTextView = this.LJLL;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                    TuxTextView tuxTextView2 = this.LJLL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(str3);
                        TuxTextView tuxTextView3 = this.LJLL;
                        if (tuxTextView3 != null) {
                            int i3 = 8;
                            if (600.0f < tuxTextView3.getPaint().measureText(str3)) {
                                TuxTextView tuxTextView4 = this.LJLL;
                                if (tuxTextView4 != null) {
                                    tuxTextView4.setVisibility(8);
                                    C81156VtA c81156VtA = this.LJLJLLL;
                                    if (c81156VtA != null) {
                                        c81156VtA.setVisibility(0);
                                        c81156VtA.setTuxFont(33);
                                        PodcastInfo podcastInfo5 = this.LLIIJI;
                                        if (podcastInfo5 == null || (str5 = podcastInfo5.getFeedTitle()) == null) {
                                            str5 = "";
                                        }
                                        Il(c81156VtA, str5);
                                    } else {
                                        o.LJIJI("titleMarquee");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("titleNormal");
                                    throw null;
                                }
                            }
                            SmartImageView smartImageView = this.LJLLL;
                            if (smartImageView != null) {
                                Context context2 = smartImageView.getContext();
                                o.LJIIIIZZ(context2, "coverView.context");
                                if (C55987LyB.LIZ(context2)) {
                                    ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) KL2.LIZJ(smartImageView.getContext(), 184.0f);
                                }
                                PodcastInfo podcastInfo6 = this.LLIIJI;
                                if (podcastInfo6 != null && (cover = podcastInfo6.getCover()) != null && (urlList = cover.getUrlList()) != null && (!urlList.isEmpty())) {
                                    W5F w5f = new W5F(new C62562cu(urlList));
                                    w5f.LIZJ = requireContext();
                                    W5E LIZ = w5f.LIZ();
                                    SmartImageView smartImageView2 = this.LJLLL;
                                    if (smartImageView2 != null) {
                                        smartImageView2.LIZ(LIZ);
                                    } else {
                                        o.LJIJI("fullEpisodeCover");
                                        throw null;
                                    }
                                }
                                PodcastInfo podcastInfo7 = this.LLIIJI;
                                if (podcastInfo7 != null && (episodeTitle = podcastInfo7.getEpisodeTitle()) != null) {
                                    C81156VtA c81156VtA2 = this.LJLZ;
                                    if (c81156VtA2 != null) {
                                        if (episodeTitle.length() > 0) {
                                            i2 = 0;
                                        } else {
                                            i2 = 8;
                                        }
                                        c81156VtA2.setVisibility(i2);
                                        C81156VtA c81156VtA3 = this.LJLZ;
                                        if (c81156VtA3 != null) {
                                            c81156VtA3.setTuxFont(13);
                                            C81156VtA c81156VtA4 = this.LJLZ;
                                            if (c81156VtA4 != null) {
                                                Il(c81156VtA4, episodeTitle);
                                            } else {
                                                o.LJIJI("fullEpisodeTopic");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("fullEpisodeTopic");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("fullEpisodeTopic");
                                        throw null;
                                    }
                                }
                                PodcastInfo podcastInfo8 = this.LLIIJI;
                                if (podcastInfo8 != null && (episodeAuthors = podcastInfo8.getEpisodeAuthors()) != null) {
                                    C81156VtA c81156VtA5 = this.LJZ;
                                    if (c81156VtA5 != null) {
                                        if (episodeAuthors.size() > 0) {
                                            i = 0;
                                        } else {
                                            i = 8;
                                        }
                                        c81156VtA5.setVisibility(i);
                                        StringBuilder sb = new StringBuilder();
                                        int i4 = 0;
                                        for (String str10 : episodeAuthors) {
                                            int i5 = i4 + 1;
                                            if (i4 >= 0) {
                                                String str11 = str10;
                                                if (i4 == 0) {
                                                    sb.append(str11);
                                                } else {
                                                    sb.append(", ");
                                                    sb.append(str11);
                                                }
                                                i4 = i5;
                                            } else {
                                                C47261Igj.LJJJJJ();
                                                throw null;
                                            }
                                        }
                                        C81156VtA c81156VtA6 = this.LJZ;
                                        if (c81156VtA6 != null) {
                                            c81156VtA6.setTuxFont(52);
                                            C81156VtA c81156VtA7 = this.LJZ;
                                            if (c81156VtA7 != null) {
                                                Il(c81156VtA7, sb.toString());
                                            } else {
                                                o.LJIJI("fullEpisodeAuthors");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("fullEpisodeAuthors");
                                            throw null;
                                        }
                                    } else {
                                        o.LJIJI("fullEpisodeAuthors");
                                        throw null;
                                    }
                                }
                                TuxIconView tuxIconView3 = this.LJLLLL;
                                if (tuxIconView3 != null) {
                                    C78897Uxp.LJJJJLL(tuxIconView3);
                                    FullEpisodeDetailsViewModel Hl = Hl();
                                    Aweme aweme2 = this.LLIIIZ;
                                    Context requireContext = requireContext();
                                    Aweme aweme3 = this.LLIIIZ;
                                    if (aweme3 == null || (str4 = aweme3.getAid()) == null) {
                                        str4 = "";
                                    }
                                    FullEpisodeDetailsViewModel.refreshFavoriteState$default(Hl, false, aweme2, requireContext, str4, false, 16, null);
                                    TuxIconView tuxIconView4 = this.LJLLLL;
                                    if (tuxIconView4 != null) {
                                        C16880lQ.LJIIJ(new IDaS491S0100000_15(this, 1), tuxIconView4);
                                        FullEpisodeDetailsViewModel Hl2 = Hl();
                                        Aweme aweme4 = this.LLIIIZ;
                                        if (aweme4 != null && (aid = aweme4.getAid()) != null) {
                                            str7 = aid;
                                        }
                                        Hl2.refreshLikeState(aweme4, str7);
                                        TuxIconView tuxIconView5 = this.LJLLLLLL;
                                        if (tuxIconView5 != null) {
                                            C78897Uxp.LJJJJLL(tuxIconView5);
                                            TuxIconView tuxIconView6 = this.LJLLLLLL;
                                            if (tuxIconView6 != null) {
                                                C16880lQ.LJJJ(tuxIconView6, new ACListenerS35S0100000_15(this, 170));
                                                PodcastInfo podcastInfo9 = this.LLIIJI;
                                                if (podcastInfo9 != null && (isBrandedContent = podcastInfo9.isBrandedContent()) != null) {
                                                    boolean booleanValue = isBrandedContent.booleanValue();
                                                    View view2 = this.LLIILII;
                                                    if (view2 != null) {
                                                        if (booleanValue) {
                                                            i3 = 0;
                                                        }
                                                        view2.setVisibility(i3);
                                                    } else {
                                                        o.LJIJI("brandedContentView");
                                                        throw null;
                                                    }
                                                }
                                                TuxIconView tuxIconView7 = this.LLF;
                                                if (tuxIconView7 != null) {
                                                    C78897Uxp.LJJJJLL(tuxIconView7);
                                                    TuxIconView tuxIconView8 = this.LLF;
                                                    if (tuxIconView8 != null) {
                                                        C16880lQ.LJIIJ(new IDaS491S0100000_15(this, 2), tuxIconView8);
                                                        FrameLayout frameLayout = this.LLFF;
                                                        if (frameLayout != null) {
                                                            C78897Uxp.LJJJJLL(frameLayout);
                                                            FrameLayout frameLayout2 = this.LLFF;
                                                            if (frameLayout2 != null) {
                                                                C16880lQ.LJIIJ(new IDaS491S0100000_15(this, 3), frameLayout2);
                                                                FrameLayout frameLayout3 = this.LLFFF;
                                                                if (frameLayout3 != null) {
                                                                    C78897Uxp.LJJJJLL(frameLayout3);
                                                                    FrameLayout frameLayout4 = this.LLFFF;
                                                                    if (frameLayout4 != null) {
                                                                        C16880lQ.LJIIJ(new IDaS491S0100000_15(this, 4), frameLayout4);
                                                                        BEFView$Builder obtain = BEFView$Builder.obtain();
                                                                        obtain.setRenderSize(720, 1280);
                                                                        obtain.setFPS(30.0d);
                                                                        obtain.setNeglectTouchEvent(true);
                                                                        obtain.setFitMode(BEFView$FitMode.FILL_SCREEN);
                                                                        obtain.setKeepStatusAtPause(true);
                                                                        C1FM build = obtain.build(requireContext());
                                                                        this.LLI = build;
                                                                        if (build != null) {
                                                                            build.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                                                        }
                                                                        C1FM c1fm = this.LLI;
                                                                        if (c1fm != null) {
                                                                            c1fm.setOpaque(false);
                                                                        }
                                                                        FrameLayout frameLayout5 = this.LJLLJ;
                                                                        if (frameLayout5 != null) {
                                                                            frameLayout5.addView(this.LLI);
                                                                            C1FM c1fm2 = this.LLI;
                                                                            if (c1fm2 != null && (context = c1fm2.getContext()) != null) {
                                                                                C2VP.LIZ(new AqS68S1200000_15(context, new AqS146S0200000_15(this, context, 34), 2));
                                                                            }
                                                                            Hl().isPlaying().observe(getViewLifecycleOwner(), new AObserverS83S0100000_15(this, 81));
                                                                            Hl().getPlaybackState().observe(getViewLifecycleOwner(), new Observer() { // from class: X.95c
                                                                                @Override // androidx.lifecycle.Observer
                                                                                public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                                                                                }
                                                                            });
                                                                            Hl().getProgress().observe(getViewLifecycleOwner(), new AObserverS83S0100000_15(this, 82));
                                                                            Hl().getPrepareState().observe(getViewLifecycleOwner(), new AObserverS83S0100000_15(this, 83));
                                                                            Hl().getLoadingState().observe(getViewLifecycleOwner(), new AObserverS83S0100000_15(this, 84));
                                                                            Hl().isFavorite().observe(getViewLifecycleOwner(), new AObserverS82S0100000_14(this, 55));
                                                                            Hl().isLiked().observe(getViewLifecycleOwner(), new AObserverS83S0100000_15(this, 85));
                                                                            C81312Vvg c81312Vvg = this.LLIFFJFJJ;
                                                                            if (c81312Vvg != null) {
                                                                                c81312Vvg.setSplitTrack(false);
                                                                                C81312Vvg c81312Vvg2 = this.LLIFFJFJJ;
                                                                                if (c81312Vvg2 != null) {
                                                                                    c81312Vvg2.setCustomOnSeekBarChangeListener(this.LLIIII);
                                                                                    this.LLIIIJ = false;
                                                                                    C81312Vvg c81312Vvg3 = this.LLIFFJFJJ;
                                                                                    if (c81312Vvg3 != null) {
                                                                                        c81312Vvg3.setMode(EnumC81316Vvk.NORMAL);
                                                                                        C81312Vvg c81312Vvg4 = this.LLIFFJFJJ;
                                                                                        if (c81312Vvg4 != null) {
                                                                                            c81312Vvg4.removeCallbacks(this.LLIIIILZ);
                                                                                            Context requireContext2 = requireContext();
                                                                                            o.LJIIIIZZ(requireContext2, "requireContext()");
                                                                                            if (C55987LyB.LIZ(requireContext2)) {
                                                                                                Gl();
                                                                                            }
                                                                                            Kl(0L);
                                                                                            Hl().setPodcastPlayable(this.LLIIJI);
                                                                                            Hl().initPlayer();
                                                                                            this.LJLJL = new ServiceConnectionC84731XNf(Hl().getMediaPlayerController(), this.LLIIIL, this.LLIIIZ);
                                                                                            Intent intent = new Intent(mo49getActivity(), (Class<?>) BackgroundAudioService.class);
                                                                                            ActivityC45651qj mo49getActivity2 = mo49getActivity();
                                                                                            if (mo49getActivity2 != null) {
                                                                                                ServiceConnectionC84731XNf serviceConnectionC84731XNf = this.LJLJL;
                                                                                                if (serviceConnectionC84731XNf != null) {
                                                                                                    mo49getActivity2.bindService(intent, serviceConnectionC84731XNf, 1);
                                                                                                    FullEpisodeDetailsViewModel Hl3 = Hl();
                                                                                                    C84735XNj c84735XNj = new C84735XNj("RESUME_FROM_ON_RESUME");
                                                                                                    Keva repo = Keva.getRepo("FullEpisodeDetailFragment");
                                                                                                    StringBuilder LIZ2 = X1D.LIZ();
                                                                                                    LIZ2.append("full_episode_progress");
                                                                                                    PodcastInfo podcastInfo10 = this.LLIIJI;
                                                                                                    if (podcastInfo10 != null) {
                                                                                                        str8 = podcastInfo10.getEpisodeItemId();
                                                                                                    }
                                                                                                    LIZ2.append(str8);
                                                                                                    Hl3.playPlayer(c84735XNj, (int) repo.getLong(X1D.LIZIZ(LIZ2), 0L));
                                                                                                    return;
                                                                                                }
                                                                                                o.LJIJI("backgroundAudioServiceConnection");
                                                                                                throw null;
                                                                                            }
                                                                                            "Required value was null.".toString();
                                                                                            throw new IllegalArgumentException("Required value was null.");
                                                                                        }
                                                                                        o.LJIJI("playerSeekBarView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("playerSeekBarView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("playerSeekBarView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("playerSeekBarView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("bEFViewContainer");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("backWardBtn");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("backWardBtn");
                                                                throw null;
                                                            }
                                                            o.LJIJI("forwardBtn");
                                                            throw null;
                                                        }
                                                        o.LJIJI("forwardBtn");
                                                        throw null;
                                                    }
                                                    o.LJIJI("playPauseBtn");
                                                    throw null;
                                                }
                                                o.LJIJI("playPauseBtn");
                                                throw null;
                                            }
                                            o.LJIJI("likeIcon");
                                            throw null;
                                        }
                                        o.LJIJI("likeIcon");
                                        throw null;
                                    }
                                    o.LJIJI("favoriteIcon");
                                    throw null;
                                }
                                o.LJIJI("favoriteIcon");
                                throw null;
                            }
                            o.LJIJI("fullEpisodeCover");
                            throw null;
                        }
                        o.LJIJI("titleNormal");
                        throw null;
                    }
                    o.LJIJI("titleNormal");
                    throw null;
                }
                o.LJIJI("titleNormal");
                throw null;
            }
            o.LJIJI("backBtn");
            throw null;
        }
        o.LJIJI("backBtn");
        throw null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.bzo, viewGroup, false, "view");
        View findViewById = LIZIZ.findViewById(R.id.aej);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.back_btn)");
        this.LJLJLJ = (TuxIconView) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.la6);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.title_marquee)");
        this.LJLJLLL = (C81156VtA) findViewById2;
        View findViewById3 = LIZIZ.findViewById(R.id.la_);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.title_normal)");
        this.LJLL = (TuxTextView) findViewById3;
        View findViewById4 = LIZIZ.findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.content_container)");
        this.LJLLI = (ViewGroup) findViewById4;
        View findViewById5 = LIZIZ.findViewById(R.id.dp5);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.fullEpisode_background)");
        this.LJLLJ = (FrameLayout) findViewById5;
        LayoutInflater layoutInflater2 = getLayoutInflater();
        ViewGroup viewGroup2 = this.LJLLI;
        C29S c29s = null;
        if (viewGroup2 != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater2, R.layout.bzn, viewGroup2, true);
            o.LJIIIIZZ(LLLLIILL, "layoutInflater.inflate(R…deContentContainer, true)");
            this.LJLLILLLL = LLLLIILL;
            View findViewById6 = LLLLIILL.findViewById(R.id.bxt);
            o.LJIIIIZZ(findViewById6, "episodeContentView.findViewById(R.id.cover_img)");
            this.LJLLL = (SmartImageView) findViewById6;
            View view = this.LJLLILLLL;
            if (view != null) {
                View findViewById7 = view.findViewById(R.id.d58);
                o.LJIIIIZZ(findViewById7, "episodeContentView.findV…yId(R.id.favorite_button)");
                this.LJLLLL = (TuxIconView) findViewById7;
                View view2 = this.LJLLILLLL;
                if (view2 != null) {
                    View findViewById8 = view2.findViewById(R.id.fqw);
                    o.LJIIIIZZ(findViewById8, "episodeContentView.findViewById(R.id.like_button)");
                    this.LJLLLLLL = (TuxIconView) findViewById8;
                    View view3 = this.LJLLILLLL;
                    if (view3 != null) {
                        View findViewById9 = view3.findViewById(R.id.cy1);
                        o.LJIIIIZZ(findViewById9, "episodeContentView.findV…wById(R.id.episode_topic)");
                        this.LJLZ = (C81156VtA) findViewById9;
                        View view4 = this.LJLLILLLL;
                        if (view4 != null) {
                            View findViewById10 = view4.findViewById(R.id.cy0);
                            o.LJIIIIZZ(findViewById10, "episodeContentView.findV…yId(R.id.episode_authors)");
                            this.LJZ = (C81156VtA) findViewById10;
                            View view5 = this.LJLLILLLL;
                            if (view5 != null) {
                                View findViewById11 = view5.findViewById(R.id.asr);
                                o.LJIIIIZZ(findViewById11, "episodeContentView.findV…yId(R.id.branded_content)");
                                this.LLIILII = findViewById11;
                                View findViewById12 = LIZIZ.findViewById(R.id.hsj);
                                o.LJIIIIZZ(findViewById12, "view.findViewById(R.id.player_btn_container)");
                                this.LJZI = (ViewGroup) findViewById12;
                                LayoutInflater layoutInflater3 = getLayoutInflater();
                                ViewGroup viewGroup3 = this.LJZI;
                                if (viewGroup3 != null) {
                                    View LLLLIILL2 = C16880lQ.LLLLIILL(layoutInflater3, R.layout.bzp, viewGroup3, true);
                                    o.LJIIIIZZ(LLLLIILL2, "layoutInflater.inflate(R…playerBtnContainer, true)");
                                    this.LJZL = LLLLIILL2;
                                    View findViewById13 = LIZIZ.findViewById(R.id.hsr);
                                    o.LJIIIIZZ(findViewById13, "view.findViewById(R.id.player_seek)");
                                    this.LL = (ViewGroup) findViewById13;
                                    LayoutInflater layoutInflater4 = getLayoutInflater();
                                    ViewGroup viewGroup4 = this.LL;
                                    if (viewGroup4 != null) {
                                        View LLLLIILL3 = C16880lQ.LLLLIILL(layoutInflater4, R.layout.bzq, viewGroup4, true);
                                        o.LJIIIIZZ(LLLLIILL3, "layoutInflater.inflate(R…layerSeekContainer, true)");
                                        this.LLD = LLLLIILL3;
                                        View findViewById14 = LLLLIILL3.findViewById(R.id.dpo);
                                        o.LJIIIIZZ(findViewById14, "playerSeekLayout.findVie….id.fullepisode_seek_bar)");
                                        this.LLIFFJFJJ = (C81312Vvg) findViewById14;
                                        View view6 = this.LLD;
                                        if (view6 != null) {
                                            View findViewById15 = view6.findViewById(R.id.c13);
                                            o.LJIIIIZZ(findViewById15, "playerSeekLayout.findVie…t_seek_video_time_normal)");
                                            this.LLFII = (TuxTextView) findViewById15;
                                            View view7 = this.LLD;
                                            if (view7 != null) {
                                                View findViewById16 = view7.findViewById(R.id.liu);
                                                o.LJIIIIZZ(findViewById16, "playerSeekLayout.findVie….total_video_time_normal)");
                                                this.LLFZ = (TuxTextView) findViewById16;
                                                View view8 = this.LJZL;
                                                if (view8 != null) {
                                                    View findViewById17 = view8.findViewById(R.id.dpn);
                                                    o.LJIIIIZZ(findViewById17, "playerBtnView.findViewBy….fullepisode_play_status)");
                                                    this.LLF = (TuxIconView) findViewById17;
                                                    View view9 = this.LJZL;
                                                    if (view9 != null) {
                                                        View findViewById18 = view9.findViewById(R.id.dpk);
                                                        o.LJIIIIZZ(findViewById18, "playerBtnView.findViewBy…pisode_play_fast_forward)");
                                                        this.LLFF = (FrameLayout) findViewById18;
                                                        View view10 = this.LJZL;
                                                        if (view10 != null) {
                                                            View findViewById19 = view10.findViewById(R.id.dph);
                                                            o.LJIIIIZZ(findViewById19, "playerBtnView.findViewBy…isode_play_fast_backward)");
                                                            this.LLFFF = (FrameLayout) findViewById19;
                                                            try {
                                                                ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
                                                                ViewTreeViewModelStoreOwner.set(LIZIZ, this);
                                                                C10A.LIZIZ(LIZIZ, this);
                                                                ActivityC45651qj mo49getActivity = mo49getActivity();
                                                                if (mo49getActivity instanceof C29S) {
                                                                    c29s = (C29S) mo49getActivity;
                                                                }
                                                                C90903hW.LIZ(c29s);
                                                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                                                            } catch (Throwable th) {
                                                                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                                                            }
                                                            return LIZIZ;
                                                        }
                                                        o.LJIJI("playerBtnView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("playerBtnView");
                                                    throw null;
                                                }
                                                o.LJIJI("playerBtnView");
                                                throw null;
                                            }
                                            o.LJIJI("playerSeekLayout");
                                            throw null;
                                        }
                                        o.LJIJI("playerSeekLayout");
                                        throw null;
                                    }
                                    o.LJIJI("playerSeekContainer");
                                    throw null;
                                }
                                o.LJIJI("playerBtnContainer");
                                throw null;
                            }
                            o.LJIJI("episodeContentView");
                            throw null;
                        }
                        o.LJIJI("episodeContentView");
                        throw null;
                    }
                    o.LJIJI("episodeContentView");
                    throw null;
                }
                o.LJIJI("episodeContentView");
                throw null;
            }
            o.LJIJI("episodeContentView");
            throw null;
        }
        o.LJIJI("episodeContentContainer");
        throw null;
    }
}
