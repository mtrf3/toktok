package com.ss.android.ugc.feed.platform.cell.interact.top.topwarn;

import X.AbstractC48820JEa;
import X.AnonymousClass391;
import X.C06460Ne;
import X.C116724i4;
import X.C16880lQ;
import X.C188727au;
import X.C1A7;
import X.C210018Mb;
import X.C210028Mc;
import X.C214348b8;
import X.C221108m2;
import X.C26338AVi;
import X.C2K0;
import X.C32151Nz;
import X.C37179EiV;
import X.C47959Irz;
import X.C51029K0z;
import X.C53947LFf;
import X.C54407LWx;
import X.C55096Ljo;
import X.C56466MEc;
import X.C56467MEd;
import X.C56468MEe;
import X.C56469MEf;
import X.C56509MFt;
import X.C5H3;
import X.C61447O9r;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73098SmU;
import X.C79057V0z;
import X.C7MY;
import X.C8T7;
import X.C8YN;
import X.FMX;
import X.InterfaceC222708oc;
import X.InterfaceC53931LEp;
import X.InterfaceC55102Lju;
import X.JVD;
import X.KRA;
import X.O6R;
import X.TBT;
import X.X1D;
import Y.ARunnableS28S0200000_9;
import Y.IDCListenerS256S0100000_9;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.placediscovery.ui.CategoryEntranceAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.ss.android.ugc.feed.platform.fragment.IFollowFeedFragmentAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopWarnComponent extends BaseCellSlotComponent implements TopWarnAbility, ComponentPriorityProtocol, InterfaceC55102Lju {
    public static final int[] LLIILZL = {62, 72, 82};
    public static final int LLIIZ = C7MY.LIZIZ(360);
    public TuxTextView LLFII;
    public TuxIconView LLFZ;
    public View LLI;
    public ViewPropertyAnimator LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C5H3 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public final C62822Ol8 LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public Aweme LLIIL;
    public boolean LLIILII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aey;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "top_container_warning";
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1077756689) {
            return null;
        }
        return this;
    }

    public TopWarnComponent() {
        new LinkedHashMap();
        this.LLII = C221108m2.LIZIZ(C56468MEe.LJLIL);
        this.LLIIII = C221108m2.LIZIZ(new AqS159S0100000_9(this, 717));
        this.LLIIIILZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C56466MEc.INSTANCE);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 715));
        this.LLIIIL = C221108m2.LIZIZ(C56467MEd.LJLIL);
        this.LLIIIZ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 716));
        this.LLIIJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 718));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 719));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnAbility
    public final void q8() {
        IVideoCellAbility iVideoCellAbility;
        InterfaceC222708oc LLLJ;
        View videoView;
        if (this.LLIILII && (iVideoCellAbility = (IVideoCellAbility) this.LLIIIJ.getValue()) != null && (LLLJ = iVideoCellAbility.LLLJ()) != null && (videoView = LLLJ.getVideoView()) != null) {
            videoView.addOnLayoutChangeListener(new IDCListenerS256S0100000_9(this, 0));
        }
    }

    public final void r4() {
        InterfaceC222708oc LLLJ;
        ViewGroup Dp;
        View videoView;
        int i;
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LLIIIJ.getValue();
        if (iVideoCellAbility == null || (LLLJ = iVideoCellAbility.LLLJ()) == null || (Dp = LLLJ.Dp()) == null || (videoView = LLLJ.getVideoView()) == null) {
            return;
        }
        int width = (Dp.getWidth() - videoView.getWidth()) / 2;
        if (((InterfaceC53931LEp) this.LLIIIL.getValue()).LJIJ().LIZ() == 1) {
            i = 32;
        } else {
            i = 128;
        }
        int LIZJ = C47959Irz.LIZJ(i, width);
        C26338AVi.LJI(getContainerView(), Integer.valueOf(LIZJ), null, Integer.valueOf(LIZJ), null, false, 26);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnAbility
    public final Rect bc() {
        View containerView = getContainerView();
        return new Rect(containerView.getLeft(), containerView.getTop(), containerView.getRight(), containerView.getBottom());
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLIIL = item.getAweme();
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C210018Mb.LIZ(aweme)) {
            if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
                Aweme aweme2 = item.getAweme();
                o.LJIIIIZZ(aweme2, "item.aweme");
                u4(aweme2);
            } else {
                C37179EiV.LIZ().post(new ARunnableS28S0200000_9(item, this, 40));
            }
            InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLIIJI.getValue();
            if (interactAreaCommonAbility != null) {
                if (interactAreaCommonAbility.vp()) {
                    interactAreaCommonAbility.zn("top_container_warning", this, true);
                    return;
                } else {
                    interactAreaCommonAbility.U00(this, null, null);
                    return;
                }
            }
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.LLIFFJFJJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        TuxTextView tuxTextView = this.LLFII;
        if (tuxTextView != null) {
            tuxTextView.setText("");
        }
        getContainerView().setVisibility(4);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C79057V0z.LJJJ(view, new ARunnableS28S0200000_9(view, this, 36));
        C8YN.LJII(this, (AssemViewModel) this.LLIIIILZ.getValue(), new TBT() { // from class: X.8Md
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C210028Mc.LJLIL, 6);
    }

    public final void q4(CharSequence charSequence) {
        TuxIconView tuxIconView = this.LLFZ;
        if (tuxIconView != null) {
            int width = tuxIconView.getWidth();
            int width2 = getContainerView().getWidth();
            if (width == 0 || width2 == 0) {
                TuxIconView tuxIconView2 = this.LLFZ;
                if (tuxIconView2 != null) {
                    JVD.LIZ(tuxIconView2, new AqS156S0200000_9(this, charSequence, 50));
                    return;
                }
                return;
            }
            TuxTextView tuxTextView = this.LLFII;
            if (tuxTextView == null) {
                return;
            }
            Integer valueOf = Integer.valueOf((width2 - width) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(5)));
            int i = 0;
            if (valueOf.intValue() <= 0) {
                return;
            }
            int intValue = valueOf.intValue();
            if (C53947LFf.LIZLLL() < LLIIZ) {
                i = 1;
            }
            while (i < 3) {
                tuxTextView.setTuxFont(LLIILZL[i]);
                int lineCount = C1A7.LJJIIJ(tuxTextView, charSequence, (TextPaint) this.LLII.getValue(), intValue, Float.valueOf(tuxTextView.getTextSize())).getLineCount();
                AbstractC48820JEa abstractC48820JEa = (AbstractC48820JEa) C56469MEf.LIZ.getValue();
                StringBuilder LIZJ = C06460Ne.LIZJ("trying font ", i, " with lc ", lineCount, " cc ");
                LIZJ.append(charSequence.length());
                LIZJ.append(" width ");
                LIZJ.append(tuxTextView.getMaxWidth());
                LIZJ.append(" textSize ");
                LIZJ.append(tuxTextView.getTextSize());
                abstractC48820JEa.LJIIIIZZ(X1D.LIZIZ(LIZJ));
                if (lineCount <= 3) {
                    break;
                } else {
                    i++;
                }
            }
            tuxTextView.setText(charSequence);
            JVD.LIZIZ(tuxTextView, new AqS159S0100000_9(this, 714));
        }
    }

    public final void u4(Aweme aweme) {
        String str;
        boolean z;
        KRA LIZIZ;
        Fragment fragment;
        if (aweme.getAwemeRiskModel() == null) {
            return;
        }
        C116724i4 c116724i4 = new C116724i4();
        String content = aweme.getAwemeRiskModel().getContent();
        o.LJIIIIZZ(content, "aweme.awemeRiskModel.content");
        c116724i4.LIZIZ(content);
        q4(c116724i4.LIZ);
        KRA LIZIZ2 = a1().LIZIZ();
        if (LIZIZ2 != null) {
            str = C56509MFt.LIZLLL(LIZIZ2);
        } else {
            str = null;
        }
        boolean LJ = o.LJ(str, "homepage_friends");
        IFollowFeedFragmentAbility iFollowFeedFragmentAbility = (IFollowFeedFragmentAbility) this.LLIIII.getValue();
        boolean z2 = false;
        if ((iFollowFeedFragmentAbility != null && iFollowFeedFragmentAbility.On0()) || (LJ && (LIZIZ = a1().LIZIZ()) != null && (fragment = LIZIZ.LJ) != null && C54407LWx.LIZIZ.LIZ.LJFF(fragment))) {
            z = true;
        } else {
            z = false;
        }
        CategoryEntranceAbility categoryEntranceAbility = (CategoryEntranceAbility) this.LLIIJLIL.getValue();
        if (categoryEntranceAbility != null) {
            z2 = categoryEntranceAbility.fn();
        }
        if (((InterfaceC53931LEp) this.LLIIIL.getValue()).LJIJ().LIZLLL() == 1) {
            if (z) {
                C26338AVi.LJI(getContainerView(), null, AnonymousClass391.LIZJ(118), null, null, false, 29);
                return;
            } else if (z2) {
                C26338AVi.LJI(getContainerView(), null, Integer.valueOf(C7MY.LIZIZ(136) - C61447O9r.LJIILIIL), null, null, false, 29);
                return;
            } else {
                C26338AVi.LJI(getContainerView(), null, AnonymousClass391.LIZJ(84), null, null, false, 29);
                return;
            }
        }
        if (z) {
            C26338AVi.LJI(getContainerView(), null, AnonymousClass391.LIZJ(91), null, null, false, 29);
        } else if (z2) {
            C26338AVi.LJI(getContainerView(), null, Integer.valueOf(C7MY.LIZIZ(136) - C61447O9r.LJIILIIL), null, null, false, 29);
        } else {
            C26338AVi.LJI(getContainerView(), null, AnonymousClass391.LIZJ(60), null, null, false, 29);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        String str;
        if (aweme != null && C210018Mb.LIZ(aweme)) {
            if (((InterfaceC53931LEp) this.LLIIIL.getValue()).LJIJ().LIZLLL() == 1) {
                r4();
                this.LLIILII = true;
            } else {
                this.LLIILII = false;
            }
            VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(this);
            getContainerView().setVisibility(0);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("group_id", videoItemParams.getAweme().getAid());
            AwemeRiskModel awemeRiskModel = videoItemParams.getAweme().getAwemeRiskModel();
            if (awemeRiskModel != null) {
                str = awemeRiskModel.getContent();
            } else {
                str = null;
            }
            c188727au.LJIIIZ("content", str);
            c188727au.LIZLLL(0, "clickable");
            c188727au.LJIIIZ("enter_from", videoItemParams.mEventType);
            FMX.LJIIL("info_bar_show", c188727au.LIZ);
            getContainerView().setAlpha(1.0f);
            ViewPropertyAnimator startDelay = getContainerView().animate().alpha(0.5555556f).setDuration(1000L).setStartDelay(3000L);
            this.LLIFFJFJJ = startDelay;
            startDelay.start();
            return;
        }
        getContainerView().setVisibility(4);
    }
}
