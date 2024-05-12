package X;

import Y.ACListenerS23S0100000_3;
import Y.ALAdapterS2S0200000_3;
import Y.AUListenerS67S0101000_3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.84i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054084i implements KPL {
    public final VideoDescAssem LJLIL;
    public final VideoDescVM LJLILLLLZI;
    public final VideoDiggVM LJLJI;
    public final VideoFavoriteVM LJLJJI;
    public final ConstraintSizeVM LJLJJL;
    public final VideoViewModel LJLJJLL;
    public final TuxTextView LJLJL;
    public final FrameLayout LJLJLJ;
    public final View LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public TuxTextLayoutView LJLLL;
    public C2055584x LJLLLL;
    public C2055584x LJLLLLLL;
    public final C2055684y LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public int LL;
    public Animator LLD;
    public Layout LLF;
    public Layout LLFF;
    public Layout LLFFF;
    public Layout LLFII;
    public Layout LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public final C73318Sq2 LLII;

    public final void LJII() {
        if (this.LJLILLLLZI.LJLL) {
            if (C2057985v.LIZ()) {
                this.LJLJL.setTuxFont(52);
            } else {
                this.LJLJL.setTextSize(14.0f);
            }
        } else if (C2057985v.LIZ()) {
            this.LJLJL.setTuxFont(42);
        } else {
            this.LJLJL.setTextSize(15.0f);
        }
        TuxTextLayoutView tuxTextLayoutView = this.LJLLL;
        if (tuxTextLayoutView != null) {
            tuxTextLayoutView.setTextAlignment(5);
            TuxTextLayoutView tuxTextLayoutView2 = this.LJLLL;
            if (tuxTextLayoutView2 != null) {
                tuxTextLayoutView2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS23S0100000_3(this, 0)));
                if (AnonymousClass843.LIZLLL()) {
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 1), this.LJLJLLL);
                }
                DT2 dt2 = DT2.LJLIL;
                TuxTextLayoutView tuxTextLayoutView3 = this.LJLLL;
                if (tuxTextLayoutView3 != null) {
                    dt2.LJLIL(tuxTextLayoutView3);
                    C8YN.LJII(this, this.LJLJJLL, new TBT() { // from class: X.85I
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C82B) obj).LJLIL;
                        }
                    }, null, new AqS185S0100000_3(this, 5), 6);
                    C8YN.LJII(this, this.LJLJJLL, new TBT() { // from class: X.85J
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C82B) obj).LJLILLLLZI;
                        }
                    }, null, new AqS185S0100000_3(this, 6), 6);
                    C8YN.LJII(this, this.LJLJJLL, new TBT() { // from class: X.85N
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C82B) obj).LJZ;
                        }
                    }, null, new AqS185S0100000_3(this, 7), 6);
                    C8YN.LJII(this, this.LJLJJLL, new TBT() { // from class: X.82F
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C82B) obj).LJLLLL;
                        }
                    }, null, new AqS185S0100000_3(this, 8), 6);
                    C8YN.LJII(this, this.LJLILLLLZI, new TBT() { // from class: X.83d
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C83X) obj).LJLIL;
                        }
                    }, C213688a4.LIZJ(), new AqS185S0100000_3(this, 3), 4);
                    C8YN.LJII(this, this.LJLILLLLZI, new TBT() { // from class: X.83Y
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((C83X) obj).LJLJJI;
                        }
                    }, C213688a4.LJ(), new AqS185S0100000_3(this, 4), 4);
                    return;
                }
                o.LJIJI("descView");
                throw null;
            }
            o.LJIJI("descView");
            throw null;
        }
        o.LJIJI("descView");
        throw null;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.getLifecycle();
    }

    public final int LIZLLL() {
        C85C c85c;
        if (AnonymousClass843.LIZLLL() && (c85c = this.LJLIL.LLILII) != null) {
            TuxTextLayoutView tuxTextLayoutView = this.LJLLL;
            if (tuxTextLayoutView != null) {
                return (int) c85c.LJJII(tuxTextLayoutView);
            }
            o.LJIJI("descView");
            throw null;
        }
        return 0;
    }

    public final boolean LJIILJJIL() {
        Aweme aweme;
        if (!AnonymousClass843.LIZ()) {
            return false;
        }
        VideoItemParams gv0 = this.LJLILLLLZI.gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null && aweme.isAd()) {
            return false;
        }
        return true;
    }

    public final void LIZ(View containerView) {
        o.LJIIIZ(containerView, "containerView");
        View findViewById = containerView.findViewById(R.id.c7y).findViewById(R.id.desc);
        o.LJIIIIZZ(findViewById, "v.findViewById(R.id.desc)");
        TuxTextLayoutView tuxTextLayoutView = (TuxTextLayoutView) findViewById;
        this.LJLLL = tuxTextLayoutView;
        tuxTextLayoutView.setFadingEdgeLength(O6R.LJJIIZ(C32151Nz.LJIIZILJ(40)));
        TuxTextLayoutView tuxTextLayoutView2 = this.LJLLL;
        if (tuxTextLayoutView2 != null) {
            tuxTextLayoutView2.setVerticalFadingEdgeEnabled(true);
        } else {
            o.LJIJI("descView");
            throw null;
        }
    }

    public final void LIZIZ(String str) {
        LJIIJJI(false, str, PostModeEntranceMechanism.SEE_MORE_BTN);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.text.Layout r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2054084i.LJFF(android.text.Layout):void");
    }

    public final void LJI(AnonymousClass860 data) {
        o.LJIIIZ(data, "data");
        C2055684y c2055684y = this.LJLZ;
        c2055684y.getClass();
        if (data.LIZIZ) {
            c2055684y.LIZIZ.invoke(data);
        } else {
            c2055684y.LIZJ.invoke();
        }
    }

    public final void LJIILIIL(boolean z) {
        String str;
        if (this.LJLILLLLZI.sv0()) {
            str = "        ";
        } else if (z) {
            Context context = this.LJLIL.getContext();
            if (context != null) {
                str = context.getString(R.string.gdq);
            } else {
                str = null;
            }
        } else {
            str = this.LJLILLLLZI.LJLLLLLL;
        }
        this.LJLJL.setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2055584x LIZJ(X.C2054384l r23, final com.ss.android.ugc.aweme.feed.model.Aweme r24) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2054084i.LIZJ(X.84l, com.ss.android.ugc.aweme.feed.model.Aweme):X.84x");
    }

    public final void LJIIIZ(Layout layout, boolean z) {
        int i;
        int i2;
        TuxTextLayoutView tuxTextLayoutView = this.LJLLL;
        if (tuxTextLayoutView != null) {
            tuxTextLayoutView.setTextLayout(layout);
            this.LLFZ = layout;
            TuxTextLayoutView tuxTextLayoutView2 = this.LJLLL;
            if (tuxTextLayoutView2 != null) {
                if (z) {
                    i = this.LLIFFJFJJ;
                } else {
                    i = Integer.MAX_VALUE;
                }
                tuxTextLayoutView2.setMaxHeight(i);
                int paragraphDirection = layout.getParagraphDirection(layout.getLineCount() - 1);
                ViewGroup.LayoutParams layoutParams = this.LJLJL.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (paragraphDirection == 1) {
                    i2 = 85;
                } else {
                    i2 = 83;
                }
                layoutParams2.gravity = i2;
                this.LJLJL.setLayoutParams(layoutParams2);
                return;
            }
            o.LJIJI("descView");
            throw null;
        }
        o.LJIJI("descView");
        throw null;
    }

    public final void LJIIJ(Layout layout, Layout layout2) {
        int i;
        TuxTextLayoutView tuxTextLayoutView = this.LJLLL;
        if (tuxTextLayoutView != null) {
            int i2 = 0;
            tuxTextLayoutView.setScrollY(0);
            if (this.LJLILLLLZI.LJZL || layout2 == null) {
                LJIIIZ(layout, true);
                int height = layout.getHeight();
                boolean z = this.LJLILLLLZI.LJZL;
                if (LJIILJJIL() || !z) {
                    i = 0;
                } else {
                    i = this.LJLJL.getHeight();
                }
                int i3 = this.LLIFFJFJJ;
                if (height > i3) {
                    height = i3;
                }
                int i4 = height + i;
                this.LJLJLJ.getLayoutParams().height = i4;
                if (layout2 != null) {
                    LJIIL(i4, LIZLLL());
                }
            } else {
                LJIIIZ(layout2, false);
                this.LJLJLJ.getLayoutParams().height = layout2.getHeight();
            }
            if (!this.LJLILLLLZI.LJZL) {
                TuxTextView tuxTextView = this.LJLJL;
                if (layout2 == null) {
                    i2 = 8;
                }
                tuxTextView.setVisibility(i2);
                return;
            }
            return;
        }
        o.LJIJI("descView");
        throw null;
    }

    public final void LJIIL(int i, int i2) {
        if (AnonymousClass843.LIZLLL()) {
            C85C c85c = this.LJLIL.LLILII;
            if (c85c != null) {
                c85c.LJJIIZI(i, i2);
                return;
            }
            return;
        }
        C85C c85c2 = this.LJLIL.LLILII;
        if (c85c2 == null) {
            return;
        }
        c85c2.LJJJLZIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJJI(final boolean z, String str, PostModeEntranceMechanism mech) {
        VideoItemParams gv0;
        Aweme aweme;
        OSZ osz;
        Layout layout;
        boolean z2;
        Aweme aweme2;
        boolean z3;
        Aweme aweme3;
        int i;
        ValueAnimator ofInt;
        long j;
        DataCenter dataCenter;
        VideoDescVM videoDescVM = this.LJLILLLLZI;
        final boolean z4 = true;
        if (z != (!videoDescVM.LJZL) || (gv0 = videoDescVM.gv0()) == null || (aweme = gv0.getAweme()) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleNavigateToPostModeDetail: ");
        LIZ.append(aweme.getAid());
        LIZ.append(", expand: ");
        LIZ.append(z);
        LIZ.append(", hideMethod: ");
        LIZ.append(str);
        LIZ.append(", mech: ");
        LIZ.append(mech);
        X1D.LIZIZ(LIZ);
        Aweme aweme4 = null;
        if (C8SG.LIZIZ.LJIILLIIL(aweme)) {
            if (z) {
                VideoDescVM videoDescVM2 = this.LJLILLLLZI;
                videoDescVM2.getClass();
                o.LJIIIZ(mech, "mech");
                videoDescVM2.setState(new AqS134S0200000_3(aweme, mech, 279));
            }
            if (mech == PostModeEntranceMechanism.SEE_MORE_BTN) {
                final IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) this.LJLL.getValue();
                VideoDescVM videoDescVM3 = this.LJLILLLLZI;
                videoDescVM3.getClass();
                videoDescVM3.LJLLLL = str;
                C10K.LIZIZ(new Callable() { // from class: X.83W
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        VideoDescVM videoDescVM4 = C2054084i.this.LJLILLLLZI;
                        boolean z5 = z4;
                        IPhotoModeAbility iPhotoModeAbility2 = iPhotoModeAbility;
                        if (z5) {
                            FMX.LJIIL("video_title", videoDescVM4.lv0("spread", iPhotoModeAbility2, ""));
                        } else {
                            FMX.LJIIL("video_title", videoDescVM4.lv0("fold", iPhotoModeAbility2, videoDescVM4.LJLLLL));
                            videoDescVM4.LJLLLL = "click_hide";
                        }
                        return C76800UCe.LIZ;
                    }
                }, FMX.LIZIZ(), null);
                return;
            }
            return;
        }
        if (this.LLFZ == null) {
            return;
        }
        if (this.LJLZ.LIZ(aweme)) {
            osz = new OSZ(this.LLFFF, this.LLFII);
        } else {
            osz = new OSZ(this.LLF, this.LLFF);
        }
        Layout layout2 = (Layout) osz.getFirst();
        Layout layout3 = (Layout) osz.getSecond();
        if (layout2 == null) {
            return;
        }
        final IPhotoModeAbility iPhotoModeAbility2 = (IPhotoModeAbility) this.LJLL.getValue();
        if (z) {
            VideoDescVM videoDescVM4 = this.LJLILLLLZI;
            videoDescVM4.getClass();
            videoDescVM4.LJLLLL = str;
        }
        C10K.LIZIZ(new Callable() { // from class: X.83W
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VideoDescVM videoDescVM42 = C2054084i.this.LJLILLLLZI;
                boolean z5 = z;
                IPhotoModeAbility iPhotoModeAbility22 = iPhotoModeAbility2;
                if (z5) {
                    FMX.LJIIL("video_title", videoDescVM42.lv0("spread", iPhotoModeAbility22, ""));
                } else {
                    FMX.LJIIL("video_title", videoDescVM42.lv0("fold", iPhotoModeAbility22, videoDescVM42.LJLLLL));
                    videoDescVM42.LJLLLL = "click_hide";
                }
                return C76800UCe.LIZ;
            }
        }, FMX.LIZIZ(), null);
        VideoItemParams gv02 = this.LJLILLLLZI.gv0();
        if (gv02 != null && (dataCenter = gv02.dataCenter) != null) {
            dataCenter.jv0(Boolean.valueOf(z), "is_desc_see_more_expanded");
        }
        if (!z || layout3 != null) {
            if (AnonymousClass843.LIZLLL() && this.LJLILLLLZI.LJLLL <= 0) {
                C85C c85c = this.LJLIL.LLILII;
                if (c85c != null) {
                    TuxTextLayoutView tuxTextLayoutView = this.LJLLL;
                    if (tuxTextLayoutView != null) {
                        this.LJLILLLLZI.LJLLL = c85c.LJJIJIL(tuxTextLayoutView);
                    } else {
                        o.LJIJI("descView");
                        throw null;
                    }
                }
                int i2 = this.LJLILLLLZI.LJLLL;
                if (i2 > 0) {
                    int i3 = this.LLIFFJFJJ;
                    if (i3 <= i2) {
                        i2 = i3;
                    }
                    this.LLIFFJFJJ = i2;
                }
            }
            if (layout3 == null) {
                layout = layout2;
            } else {
                layout = layout3;
            }
            C85C c85c2 = this.LJLIL.LLILII;
            if (c85c2 != null) {
                c85c2.LJIL(z);
            }
            VideoDescVM videoDescVM5 = this.LJLILLLLZI;
            videoDescVM5.getClass();
            videoDescVM5.setState(new AqS8S0010000_3(z, 56));
            VideoItemParams gv03 = this.LJLILLLLZI.gv0();
            if (gv03 != null) {
                aweme4 = gv03.getAweme();
            }
            if (AnonymousClass843.LIZJ(aweme4)) {
                int identityHashCode = System.identityHashCode(C55096Ljo.LJIIIIZZ(this.LJLIL));
                int identityHashCode2 = System.identityHashCode(C55096Ljo.LJIIIZ(this.LJLIL));
                C200647u8 c200647u8 = ((C200617u5) this.LJLJI.getState()).LJLILLLLZI;
                if (c200647u8 != null) {
                    z2 = c200647u8.LIZIZ;
                } else {
                    VideoItemParams gv04 = this.LJLILLLLZI.gv0();
                    if (gv04 != null && (aweme2 = gv04.getAweme()) != null && aweme2.getUserDigg() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                C200647u8 c200647u82 = ((C203577yr) this.LJLJJI.getState()).LJLIL;
                if (c200647u82 != null) {
                    z3 = c200647u82.LIZIZ;
                } else {
                    VideoItemParams gv05 = this.LJLILLLLZI.gv0();
                    if (gv05 != null && (aweme3 = gv05.getAweme()) != null && aweme3.getCollectStatus() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                C2KK c2kk = new C2KK(z, z2, identityHashCode2, identityHashCode, z3);
                C85C c85c3 = this.LJLIL.LLILII;
                if (c85c3 != null) {
                    c85c3.LJJIZ(z);
                }
                C50420Jqa c50420Jqa = new C50420Jqa(72, c2kk);
                c50420Jqa.LJLZ = identityHashCode;
                C2U8.LIZ(c50420Jqa);
            }
            this.LJLILLLLZI.LJZL = z;
            Animator animator = this.LLD;
            if (animator != null) {
                animator.cancel();
            }
            C85C c85c4 = this.LJLIL.LLILII;
            if (c85c4 != null) {
                c85c4.LJIJJLI(z, AnonymousClass843.LIZLLL());
            }
            int height = layout.getHeight();
            int height2 = layout2.getHeight();
            boolean z5 = !((Boolean) C2058285y.LIZ.getValue()).booleanValue();
            if (LJIILJJIL() || !z5) {
                i = 0;
            } else {
                i = this.LJLJL.getHeight();
            }
            int i4 = this.LLIFFJFJJ;
            if (height2 > i4) {
                height2 = i4;
            }
            int i5 = height2 + i;
            int LIZLLL = LIZLLL();
            if (o.LJ(layout2, this.LLFZ)) {
                ofInt = ValueAnimator.ofInt(i5, height);
                ofInt.addUpdateListener(new AUListenerS67S0101000_3(LIZLLL, this, 0));
                ofInt.addListener(new ALAdapterS2S0200000_3(this, layout3, 0));
            } else {
                ofInt = ValueAnimator.ofInt(height, i5);
                ofInt.addUpdateListener(new AUListenerS67S0101000_3(LIZLLL, this, 1));
                ofInt.addListener(new ALAdapterS2S0200000_3(this, layout2, 1));
            }
            this.LLD = ofInt;
            if (z) {
                j = 150;
            } else {
                j = 100;
            }
            ofInt.setDuration(j);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
        }
        VideoViewModel videoViewModel = this.LJLJJLL;
        videoViewModel.getClass();
        videoViewModel.setState(new AqS8S0010000_3(z, 49));
    }

    public final void LJIIIIZZ(C2055584x c2055584x, Aweme aweme, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2;
        float measureText;
        Layout layout;
        OSZ osz;
        boolean z4;
        C85C c85c;
        if (c2055584x == null) {
            return;
        }
        if (AnonymousClass843.LIZLLL() && (c85c = this.LJLIL.LLILII) != null) {
            c85c.LJJJJI();
        }
        int i3 = this.LJZL;
        int parseColor = ColorProtector.parseColor("#4E000000");
        if (this.LJLILLLLZI.LJLL) {
            if (aweme != null && aweme.isAd()) {
                z4 = true;
            } else {
                z4 = false;
            }
            i = 51;
            Integer LIZIZ = C2055284u.LIZIZ(3, 51, false, z4);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            }
        } else {
            if (aweme != null && aweme.isAd()) {
                z3 = true;
            } else {
                z3 = false;
            }
            i = 41;
            Integer LIZIZ2 = C2055284u.LIZIZ(3, 41, false, z3);
            if (LIZIZ2 != null) {
                i = LIZIZ2.intValue();
            }
        }
        if (this.LL == this.LJZI && AnonymousClass843.LIZJ(aweme)) {
            i2 = this.LJZ;
        } else {
            i2 = this.LL;
        }
        C74247TBz c74247TBz = new C74247TBz();
        c74247TBz.LJFF(i2);
        TextDirectionHeuristic LOCALE = TextDirectionHeuristics.LOCALE;
        o.LJIIIIZZ(LOCALE, "LOCALE");
        TC0 tc0 = c74247TBz.LIZIZ;
        tc0.getClass();
        tc0.LJIIL = LOCALE;
        c74247TBz.LJ(this.LJLLILLLL);
        c74247TBz.LIZIZ();
        TC0 tc02 = c74247TBz.LIZIZ;
        tc02.LJIJJLI = 3.0f;
        tc02.LJIJI = 0.0f;
        tc02.LJIJJ = 1.0f;
        tc02.LJIL = parseColor;
        c74247TBz.LIZ.setShadowLayer(3.0f, 0.0f, 1.0f, parseColor);
        c74247TBz.LIZJ(i);
        c74247TBz.LIZIZ();
        c74247TBz.LIZIZ.LJJIFFI = i3;
        c74247TBz.LIZLLL(c2055584x.LIZ);
        Layout LIZ = c74247TBz.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(' ');
        LIZ2.append(this.LJLILLLLZI.LJLLLLLL);
        String LIZIZ3 = X1D.LIZIZ(LIZ2);
        if (this.LJLILLLLZI.sv0()) {
            measureText = this.LJLJL.getPaint().measureText("     ");
        } else {
            measureText = this.LJLJL.getPaint().measureText(LIZIZ3);
        }
        c2055584x.LIZJ = this.LLI;
        if (measureText < 0.0f) {
            measureText = 0.0f;
        }
        c2055584x.LIZIZ = measureText;
        C74247TBz c74247TBz2 = new C74247TBz();
        c74247TBz2.LJFF(this.LL);
        TextDirectionHeuristic LOCALE2 = TextDirectionHeuristics.LOCALE;
        o.LJIIIIZZ(LOCALE2, "LOCALE");
        TC0 tc03 = c74247TBz2.LIZIZ;
        tc03.getClass();
        tc03.LJIIL = LOCALE2;
        c74247TBz2.LJ(this.LJLLILLLL);
        c74247TBz2.LIZIZ();
        TC0 tc04 = c74247TBz2.LIZIZ;
        tc04.LJIJJLI = 3.0f;
        tc04.LJIJI = 0.0f;
        tc04.LJIJJ = 1.0f;
        tc04.LJIL = parseColor;
        c74247TBz2.LIZ.setShadowLayer(3.0f, 0.0f, 1.0f, parseColor);
        c74247TBz2.LIZJ(i);
        if (((Number) C52689Km5.LIZ.getValue()).intValue() != 0) {
            c74247TBz2.LIZIZ();
            c74247TBz2.LIZIZ.LJJIFFI = i3;
        }
        if (z2) {
            layout = null;
        } else {
            layout = LIZ;
        }
        List<Layout> LIZ3 = c2055584x.LIZ(c74247TBz2, layout);
        if (LIZ3.size() <= 1) {
            osz = new OSZ(ListProtector.get(LIZ3, 0), null);
        } else {
            VideoDescVM videoDescVM = this.LJLILLLLZI;
            videoDescVM.LLII = true;
            videoDescVM.LJLLI = true;
            this.LJLJL.setVisibility(0);
            VideoDescVM videoDescVM2 = this.LJLILLLLZI;
            int lineCount = LIZ.getLineCount();
            if (!z) {
                videoDescVM2.LL = lineCount;
            } else {
                videoDescVM2.LLD = lineCount;
            }
            if (!z) {
                LJFF(LIZ);
            }
            LJIILIIL(this.LJLILLLLZI.LJZL);
            osz = new OSZ(LIZ, ListProtector.get(LIZ3, 1));
        }
        if (z) {
            this.LLFFF = (Layout) osz.getFirst();
            this.LLFII = (Layout) osz.getSecond();
        } else {
            this.LLF = (Layout) osz.getFirst();
            this.LLFF = (Layout) osz.getSecond();
        }
        if (osz.getSecond() != null && !this.LJLILLLLZI.LJZL) {
            Layout layout2 = (Layout) osz.getSecond();
            if (layout2 != null) {
                LJIIIZ(layout2, false);
                return;
            }
            return;
        }
        LJIIIZ((Layout) osz.getFirst(), true);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    public C2054084i(VideoDescAssem videoDescAssem, VideoDescVM videoDescVM, VideoDiggVM videoDiggVM, VideoFavoriteVM videoFavoriteVM, ConstraintSizeVM constraintSizeVM, VideoViewModel videoVM, TuxTextView tuxTextView, FrameLayout frameLayout, View view) {
        int i;
        int i2;
        int i3;
        o.LJIIIZ(videoDescAssem, "videoDescAssem");
        o.LJIIIZ(videoDescVM, "videoDescVM");
        o.LJIIIZ(videoDiggVM, "videoDiggVM");
        o.LJIIIZ(videoFavoriteVM, "videoFavoriteVM");
        o.LJIIIZ(constraintSizeVM, "constraintSizeVM");
        o.LJIIIZ(videoVM, "videoVM");
        this.LJLIL = videoDescAssem;
        this.LJLILLLLZI = videoDescVM;
        this.LJLJI = videoDiggVM;
        this.LJLJJI = videoFavoriteVM;
        this.LJLJJL = constraintSizeVM;
        this.LJLJJLL = videoVM;
        this.LJLJL = tuxTextView;
        this.LJLJLJ = frameLayout;
        this.LJLJLLL = view;
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 3));
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 2));
        Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "descToggleView.context", R.attr.dk);
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = 0;
        }
        this.LJLLILLLL = i;
        Integer LIZJ2 = C72972SkS.LIZJ(tuxTextView, "descToggleView.context", R.attr.dj);
        if (LIZJ2 != null) {
            i2 = LIZJ2.intValue();
        } else {
            i2 = 0;
        }
        this.LJLLJ = i2;
        this.LJLZ = new C2055684y(videoDescVM, new C2054584n(this), new C2054184j(this));
        Context context = tuxTextView.getContext();
        o.LJIIIIZZ(context, "descToggleView.context");
        this.LJZ = C63081OpJ.LJJJJL(context) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)) * 2);
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "descToggleView.context");
        int LIZ = C47135Ieh.LIZ(100, C47135Ieh.LIZ(12, C63081OpJ.LJJJJL(context2)));
        this.LJZI = LIZ;
        if (videoDescVM.LJLL) {
            i3 = 14;
        } else {
            i3 = 15;
        }
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(i3 * 1.3d))) + (((Number) C52689Km5.LIZ.getValue()).intValue() != 1 ? C7MY.LIZIZ(3) : 0);
        this.LJZL = LJJIIZ;
        this.LL = LIZ;
        this.LLI = 4;
        this.LLIFFJFJJ = (AnonymousClass843.LIZLLL() ? 24 : 12) * LJJIIZ;
        this.LLII = new C73318Sq2();
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
