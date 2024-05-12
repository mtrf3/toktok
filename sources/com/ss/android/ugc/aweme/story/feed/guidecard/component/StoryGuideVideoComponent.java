package com.ss.android.ugc.aweme.story.feed.guidecard.component;

import X.C16880lQ;
import X.C17N;
import X.C212428Vi;
import X.C221138m5;
import X.C221878nH;
import X.C224238r5;
import X.C2299590t;
import X.C30581Hy;
import X.C35704Dzo;
import X.C36922EeM;
import X.C51029K0z;
import X.C55096Ljo;
import X.C58152Pz;
import X.C60392Yp;
import X.C77121UOn;
import X.C78540Us4;
import X.C78555UsJ;
import X.C78847Ux1;
import X.C78939UyV;
import X.C78996UzQ;
import X.C79004UzY;
import X.C90I;
import X.C99O;
import X.EnumC62195Ob1;
import X.IWF;
import X.InterfaceC222698ob;
import X.InterfaceC46330IGg;
import X.InterfaceC55235Lm3;
import X.KL0;
import X.KR8;
import X.LYH;
import X.W5F;
import X.W5N;
import X.W5O;
import X.W5U;
import X.W8E;
import Y.ARunnableS23S0200000_4;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.StoryPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class StoryGuideVideoComponent extends BaseCellContentComponent<StoryGuideVideoComponent> implements StoryVideoAbility {
    public FrameLayout LL;
    public SmartImageView LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final Handler LLFII;
    public ARunnableS23S0200000_4 LLFZ;
    public final C221138m5 LLI;
    public final C221138m5 LLIFFJFJJ;
    public final C221138m5 LLII;

    public StoryGuideVideoComponent() {
        new LinkedHashMap();
        this.LLFFF = true;
        this.LLFII = new Handler(C16880lQ.LLJJJJ());
        this.LLI = KR8.LJIIJJI(C221878nH.LJLIL);
        this.LLIFFJFJJ = KR8.LJIIJJI(new AqS153S0100000_3(this, 956));
        this.LLII = KR8.LJIIJJI(new AqS153S0100000_3(this, 955));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        this.LLFII.removeCallbacksAndMessages(null);
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLII.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryVideoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void w1() {
        SmartImageView smartImageView = this.LLD;
        if (smartImageView != null) {
            C17N.LJJIIJZLJL(smartImageView);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void LJJJJLL() {
        View view;
        InterfaceC222698ob LLJJIJIL;
        try {
            Context context = getContext();
            if (context != null) {
                C224238r5.LJFF(context);
                c4(this.LLD);
                StoryPlayerViewAbility storyPlayerViewAbility = (StoryPlayerViewAbility) this.LLIFFJFJJ.getValue();
                if (storyPlayerViewAbility != null && (LLJJIJIL = storyPlayerViewAbility.LLJJIJIL()) != null) {
                    view = LLJJIJIL.getVideoView();
                } else {
                    view = null;
                }
                c4(view);
            }
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLII.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIIJJI(interfaceC55235Lm3, this, StoryVideoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final boolean Lx() {
        return this.LLFF;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        Video video;
        UrlModel originCover;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLF = false;
        this.LLFF = false;
        Aweme aweme = item.getAweme();
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        this.LLFFF = true;
        LJJJJLL();
        e4("bindCoverImage");
        if (video != null && video.getPlayAddr() != null && !C79004UzY.LJJIFFI(video.getPlayAddr().getUrlList()) && (originCover = video.getOriginCover()) != null && originCover.getUrlList() != null && !originCover.getUrlList().isEmpty()) {
            if (C35704Dzo.LIZLLL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme())) {
                b4(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), video);
                this.LLFFF = true;
                return;
            }
            SmartImageView smartImageView = this.LLD;
            if (smartImageView != null) {
                C17N.LJJIIJZLJL(smartImageView);
            }
            this.LLFFF = false;
            SmartImageView smartImageView2 = this.LLD;
            if (smartImageView2 == null) {
                return;
            }
            C78847Ux1.LJJLIIIIJ(smartImageView2, smartImageView2.getContext(), R.drawable.aim);
            return;
        }
        SmartImageView smartImageView3 = this.LLD;
        if (smartImageView3 == null) {
            return;
        }
        C78847Ux1.LJJLIIIIJ(smartImageView3, smartImageView3.getContext(), R.drawable.bop);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void L5(String str) {
        this.LLFF = true;
        w1();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void Y2(Aweme aweme) {
        SmartImageView smartImageView = this.LLD;
        if (smartImageView != null) {
            try {
                smartImageView.setBackgroundResource(R.drawable.aim);
            } catch (Exception e) {
                C36922EeM.LJFF(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void b8(String str) {
        Video video;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme != null && TextUtils.equals(str, aweme.getAid()) && (video = aweme.getVideo()) != null) {
            b4(aweme, video);
        }
    }

    public final void c4(View view) {
        int i;
        int i2;
        int i3;
        if (view == null || ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo() == null) {
            return;
        }
        Video video = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo();
        int i4 = 0;
        if (video != null) {
            i = video.getWidth();
        } else {
            i = 0;
        }
        Video video2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getVideo();
        if (video2 != null) {
            i4 = video2.getHeight();
        }
        if (i != 0 && i4 != 0) {
            this.LLI.getValue().getClass();
            if (C224238r5.LJII() == 0) {
                return;
            }
            double d = i / i4;
            double d2 = C224238r5.LJFF;
            this.LLI.getValue().getClass();
            if (d >= d2 / C224238r5.LJII()) {
                this.LLI.getValue().getClass();
                i2 = C224238r5.LJII();
                if (i > 0 && i4 > 0) {
                    int i5 = (i * i2) / i4;
                    i3 = i2;
                    i2 = i5;
                }
                i3 = i2;
            } else {
                i2 = C224238r5.LJFF;
                if (i > 0 && i4 > 0) {
                    i3 = (i4 * i2) / i;
                }
                i3 = i2;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i2;
                layoutParams.height = i3;
                view.setLayoutParams(layoutParams);
                view.setRotation(0.0f);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void e4(String str) {
        C58152Pz.LJ(C78996UzQ.LJIIL(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()), str);
        if (!this.LLFFF) {
            SmartImageView smartImageView = this.LLD;
            if (smartImageView != null) {
                C17N.LJJIIJZLJL(smartImageView);
                return;
            }
            return;
        }
        SmartImageView smartImageView2 = this.LLD;
        if (smartImageView2 != null) {
            C17N.LJJLIIIJJI(smartImageView2);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void onBuffering(boolean z) {
        String str;
        BaseFeedPageParams baseFeedPageParams = a1().LJ;
        if (baseFeedPageParams == null || (str = baseFeedPageParams.eventType) == null) {
            str = "";
        }
        boolean LJIL = C30581Hy.LJIL(str);
        boolean LJIJJ = C30581Hy.LJIJJ(str);
        boolean LJIJI = C30581Hy.LJIJI(str);
        if (LJIL || LJIJJ || LJIJI) {
            if (z) {
                ARunnableS23S0200000_4 aRunnableS23S0200000_4 = new ARunnableS23S0200000_4(this, ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), 21);
                this.LLFZ = aRunnableS23S0200000_4;
                LYH.LJ(new AqS151S0200000_4(this, aRunnableS23S0200000_4, 19));
            } else {
                ARunnableS23S0200000_4 aRunnableS23S0200000_42 = this.LLFZ;
                if (aRunnableS23S0200000_42 == null) {
                    return;
                }
                this.LLFII.removeCallbacks(aRunnableS23S0200000_42);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void onPreparePlay(String str) {
        e4("onPreparePlay");
        this.LLF = false;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void onRenderFirstFrame(String str) {
        int videoWidth;
        int videoHeight;
        int i;
        Aweme aweme;
        Video video;
        UrlModel originCover;
        Video video2;
        Video video3;
        Video video4;
        Video video5;
        this.LLF = true;
        SmartImageView smartImageView = this.LLD;
        if (smartImageView != null) {
            C17N.LJJIIJZLJL(smartImageView);
        }
        Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme2 == null || aweme2.getVideo() == null) {
            return;
        }
        if (C90I.LIZ()) {
            InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
            videoWidth = LJJLIIIIJ.getVideoWidth();
            videoHeight = LJJLIIIIJ.getVideoHeight();
        } else {
            videoWidth = IWF.LJJLIIIIJ().getVideoWidth();
            videoHeight = IWF.LJJLIIIIJ().getVideoHeight();
        }
        if (videoWidth <= 0 || videoHeight <= 0) {
            return;
        }
        Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        int i2 = 0;
        if (aweme3 != null && (video5 = aweme3.getVideo()) != null) {
            i = video5.getWidth();
        } else {
            i = 0;
        }
        Aweme aweme4 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme4 != null && (video4 = aweme4.getVideo()) != null) {
            i2 = video4.getHeight();
        }
        int LJJI = C78555UsJ.LJJI(i, i2, videoWidth, videoHeight);
        if (LJJI == 0 || LJJI > 1 || (aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()) == null || aweme.getVideo() == null) {
            return;
        }
        Aweme aweme5 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme5 != null && (video3 = aweme5.getVideo()) != null) {
            video3.setWidth(videoWidth);
        }
        Aweme aweme6 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme6 != null && (video2 = aweme6.getVideo()) != null) {
            video2.setHeight(videoHeight);
        }
        Aweme aweme7 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        if (aweme7 != null && (video = aweme7.getVideo()) != null && (originCover = video.getOriginCover()) != null) {
            originCover.setWidth(videoWidth);
            originCover.setHeight(videoHeight);
        }
        LJJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.guidecard.ability.StoryVideoAbility
    public final void onResumePlay(String str) {
        SmartImageView smartImageView;
        if (this.LLF) {
            SmartImageView smartImageView2 = this.LLD;
            if (smartImageView2 != null) {
                C17N.LJJIIJZLJL(smartImageView2);
                return;
            }
            return;
        }
        SmartImageView smartImageView3 = this.LLD;
        if (smartImageView3 == null || smartImageView3.getVisibility() != 0 || (smartImageView = this.LLD) == null) {
            return;
        }
        C17N.LJJIIJZLJL(smartImageView);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LL = (FrameLayout) view.findViewById(R.id.player_view);
        this.LLD = (SmartImageView) view.findViewById(R.id.cover);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        IViewPagerComponentAbility LJIIIZ;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (LJIIIZ = C78540Us4.LJIIIZ(LIZLLL)) != null && LJIIIZ.jl(i)) {
            C60392Yp.LIZIZ("LFeedView", "isMultiInvokePageSelected");
        } else {
            e4("onViewHolderSelected");
        }
    }

    public final void b4(Aweme aweme, Video video) {
        Bitmap LIZJ;
        W5O LIZ;
        if (aweme != null && C78996UzQ.LJJIIZI(aweme) && aweme.isProhibited()) {
            SmartImageView smartImageView = this.LLD;
            if (smartImageView != null) {
                C78847Ux1.LJJLIIIIJ(smartImageView, smartImageView.getContext(), R.drawable.bop);
                return;
            }
            return;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(video.getOriginCover()));
        if (C2299590t.LIZ) {
            List<String> urlList = video.getOriginCover().getUrlList();
            o.LJIIIIZZ(urlList, "video.originCover.urlList");
            if ((true ^ urlList.isEmpty()) && (LIZ = W5O.LIZ(UriProtector.parse((String) ListProtector.get(video.getOriginCover().getUrlList(), 0)))) != null) {
                W5N LJI = W5N.LJI();
                LJI.getClass();
                if (W8E.LJII().LJIILIIL().LJII(LJI.LJ(LIZ.LIZIZ))) {
                    LJII.LJJIII = EnumC62195Ob1.SMALL;
                }
            }
        }
        if (((Boolean) C99O.LJI.getValue()).booleanValue() && (LIZJ = C77121UOn.LIZIZ().LIZJ(video)) != null && !LIZJ.isRecycled()) {
            SmartImageView smartImageView2 = this.LLD;
            if (smartImageView2 != null) {
                smartImageView2.setImageBitmap(LIZJ);
                return;
            }
            return;
        }
        SmartImageView smartImageView3 = this.LLD;
        if (smartImageView3 == null) {
            return;
        }
        LJII.LJJI = KL0.HIGH;
        LJII.LIZIZ("StoryGuideCardVideoCpt");
        LJII.LJJIIJ = smartImageView3;
        C16880lQ.LLJJJ(LJII);
    }
}
