package com.ss.android.ugc.feed.platform.cell.shrink;

import X.AbstractC48820JEa;
import X.AbstractC86878Y7u;
import X.C221108m2;
import X.C227768wm;
import X.C2K0;
import X.C51029K0z;
import X.C52883KpD;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55953Lxd;
import X.C62822Ol8;
import X.C86870Y7m;
import X.C86873Y7p;
import X.C86875Y7r;
import X.C86876Y7s;
import X.C86877Y7t;
import X.InterfaceC222708oc;
import X.InterfaceC55102Lju;
import X.X1D;
import Y.IDCListenerS261S0100000_15;
import android.animation.ValueAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class VideoShrinkComponent extends BaseCellContentComponent implements VideoShrinkAbility, InterfaceC55102Lju {
    public final C62822Ol8 LL;
    public AbstractC86878Y7u LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final ValueAnimator LLFII;
    public int LLFZ;
    public float LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final boolean LLII;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2016640377) {
            return null;
        }
        return this;
    }

    public VideoShrinkComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(C86873Y7p.LJLIL);
        this.LLF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1312));
        this.LLFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 676));
        this.LLFFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 675));
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(100L);
        valueAnimator.setInterpolator(C55953Lxd.LIZLLL());
        this.LLFII = valueAnimator;
        this.LLFZ = 1;
        this.LLIFFJFJJ = C221108m2.LIZIZ(C86870Y7m.LJLIL);
        this.LLII = ((Number) C52883KpD.LIZ.getValue()).intValue() == 0;
    }

    public final void b4() {
        View videoView;
        AbstractC86878Y7u abstractC86878Y7u = this.LLD;
        if (abstractC86878Y7u != null && (videoView = abstractC86878Y7u.LIZIZ.getVideoView()) != null) {
            videoView.setScaleX(abstractC86878Y7u.LIZLLL);
            videoView.setScaleY(abstractC86878Y7u.LJ);
            videoView.setTranslationY(abstractC86878Y7u.LIZ());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void q8() {
        InterfaceC222708oc LLLJ;
        View videoView;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLF.getValue();
        if (iVideoCellAbility != null && (LLLJ = iVideoCellAbility.LLLJ()) != null && (videoView = LLLJ.getVideoView()) != null) {
            videoView.addOnLayoutChangeListener(new IDCListenerS261S0100000_15(this, 1));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        b4();
        ((AbstractC48820JEa) this.LL.getValue()).LJIIIIZZ("onHolderUnselected");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    public static boolean e4(Aweme aweme) {
        int awemeType;
        if (aweme.isAd() || aweme.getVideo() == null || (awemeType = aweme.getAwemeType()) == 160 || awemeType == 150 || awemeType == 43 || C54838Lfe.LJIIZILJ(aweme) || awemeType == 101) {
            return false;
        }
        return true;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        InterfaceC222708oc interfaceC222708oc;
        View view;
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLF.getValue();
        if (iVideoCellAbility != null) {
            interfaceC222708oc = iVideoCellAbility.LLLJ();
        } else {
            interfaceC222708oc = null;
        }
        IVideoCellAbility iVideoCellAbility2 = (IVideoCellAbility) this.LLF.getValue();
        if (iVideoCellAbility2 != null) {
            view = iVideoCellAbility2.Lt();
        } else {
            view = null;
        }
        if (interfaceC222708oc == null) {
            AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LL.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("feedPlayerView null ");
            LIZ.append(item.getAweme().getAid());
            abstractC48820JEa.LJIIL(X1D.LIZIZ(LIZ));
            return;
        }
        Aweme aweme = item.getAweme();
        if (aweme == null) {
            return;
        }
        boolean LJJIII = C227768wm.LJJIII(aweme);
        if (((Boolean) this.LLIFFJFJJ.getValue()).booleanValue() && (video = aweme.getVideo()) != null && (fakeLandscapeInfo = video.getFakeLandscapeInfo()) != null && fakeLandscapeInfo.isValid()) {
            if ((fakeLandscapeInfo.getRight() - fakeLandscapeInfo.getLeft()) * video.getWidth() > (fakeLandscapeInfo.getBottom() - fakeLandscapeInfo.getTop()) * video.getHeight()) {
                this.LLD = new C86875Y7r(aweme, interfaceC222708oc, view);
                AbstractC48820JEa abstractC48820JEa2 = (AbstractC48820JEa) this.LL.getValue();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[onBind] ");
                LIZ2.append(this.LLD);
                LIZ2.append(' ');
                LIZ2.append(e4(aweme));
                LIZ2.append(' ');
                LIZ2.append(((Boolean) this.LLIFFJFJJ.getValue()).booleanValue());
                LIZ2.append(' ');
                LIZ2.append(this.LLII);
                abstractC48820JEa2.LJII(aweme, X1D.LIZIZ(LIZ2));
            }
        }
        if (LJJIII) {
            this.LLD = new C86877Y7t(aweme, interfaceC222708oc, view);
        } else if (this.LLII) {
            this.LLD = new C86876Y7s(aweme, interfaceC222708oc, view);
        } else {
            this.LLD = null;
        }
        AbstractC48820JEa abstractC48820JEa22 = (AbstractC48820JEa) this.LL.getValue();
        StringBuilder LIZ22 = X1D.LIZ();
        LIZ22.append("[onBind] ");
        LIZ22.append(this.LLD);
        LIZ22.append(' ');
        LIZ22.append(e4(aweme));
        LIZ22.append(' ');
        LIZ22.append(((Boolean) this.LLIFFJFJJ.getValue()).booleanValue());
        LIZ22.append(' ');
        LIZ22.append(this.LLII);
        abstractC48820JEa22.LJII(aweme, X1D.LIZIZ(LIZ22));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void Bb0(int i, int i2) {
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (!e4(aweme)) {
            return;
        }
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) this.LL.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onBottomSheetStateChanged] ");
        LIZ.append(i);
        LIZ.append(' ');
        LIZ.append(i2);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (i2 == 1) {
            b4();
            c4(this, false, true, 0L, 4);
        }
        if (i == 2) {
            if (i2 == 4) {
                c4(this, false, false, 0L, 6);
            }
        } else if (i2 != 3) {
            if (i2 == 4) {
                c4(this, false, false, 150L, 2);
            }
        } else {
            c4(this, true, false, 0L, 2);
        }
        this.LLFZ = i2;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility
    public final void Ui0(float f, float f2) {
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (!e4(aweme) || f2 <= 0.0f) {
            return;
        }
        AbstractC86878Y7u abstractC86878Y7u = this.LLD;
        if (abstractC86878Y7u != null) {
            abstractC86878Y7u.LIZIZ(f, f2);
        }
        if (f > 0.0f && f == f2) {
            this.LLI = f;
        }
    }

    public static void c4(VideoShrinkComponent videoShrinkComponent, boolean z, boolean z2, long j, int i) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        ValueAnimator clone = videoShrinkComponent.LLFII.clone();
        clone.setStartDelay(j);
        ICellCleanAbility iCellCleanAbility = (ICellCleanAbility) videoShrinkComponent.LLFFF.getValue();
        if (iCellCleanAbility != null) {
            iCellCleanAbility.lV(z, clone, z2);
        }
        IFeedCleanAbility iFeedCleanAbility = (IFeedCleanAbility) videoShrinkComponent.LLFF.getValue();
        if (iFeedCleanAbility != null) {
            iFeedCleanAbility.Wu0(z, clone, z2);
        }
        AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) videoShrinkComponent.LL.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[toggleClean] ");
        LIZ.append(z);
        LIZ.append(" immediately: ");
        LIZ.append(z2);
        abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZ));
    }
}
