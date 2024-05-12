package com.ss.android.ugc.aweme.nows.feed.ui;

import X.AbstractC193947jK;
import X.ActivityC45651qj;
import X.C16310kV;
import X.C181787Bm;
import X.C181837Br;
import X.C181847Bs;
import X.C193887jE;
import X.C194237jn;
import X.C194437k7;
import X.C196307n8;
import X.C196327nA;
import X.C196337nB;
import X.C196347nC;
import X.C196387nG;
import X.C212428Vi;
import X.C213688a4;
import X.C214348b8;
import X.C241249dQ;
import X.C40328FsC;
import X.C44384HbQ;
import X.C47704Ins;
import X.C51029K0z;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7ML;
import X.C7MY;
import X.C7O3;
import X.C7XD;
import X.C8XO;
import X.EnumC181857Bt;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.InterfaceC86893Y8j;
import X.TBT;
import X.ViewOnTouchListenerC86892Y8i;
import X.X1D;
import Y.ARunnableS22S0200000_3;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowInteractionControl;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowLikeViewModel;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowShareViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowGestureAssem extends ReusedUIContentAssem<NowGestureAssem> implements GenericLifecycleObserver, C8XO<InterfaceC194547kI>, InterfaceC194257jp, InterfaceC86893Y8j {
    public static final C7O3 LLFZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public final InterfaceC115514g7 LLD;
    public final C55749LuL LLF;
    public View LLFF;
    public ConstraintLayout LLFFF;
    public C196307n8 LLFII;

    static {
        TBT tbt = new TBT(NowGestureAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt, new TBT(NowGestureAssem.class, "shareVM", "getShareVM()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowShareViewModel;", 0), new TBT(NowGestureAssem.class, "nowLikeViewModel", "getNowLikeViewModel()Lcom/ss/android/ugc/aweme/nows/interaction/viewmodel/NowLikeViewModel;", 0)};
        LLFZ = new C7O3();
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // X.InterfaceC86893Y8j
    public final void R0() {
        Z3(false);
    }

    @Override // X.InterfaceC86893Y8j
    public final void m2() {
        Z3(true);
        ConstraintLayout constraintLayout = this.LLFFF;
        if (constraintLayout != null) {
            float width = constraintLayout.getWidth();
            if (this.LLFF != null) {
                float width2 = width / r0.getWidth();
                ConstraintLayout constraintLayout2 = this.LLFFF;
                if (constraintLayout2 != null) {
                    float height = constraintLayout2.getHeight();
                    if (this.LLFF != null) {
                        float height2 = height / r0.getHeight();
                        View view = this.LLFF;
                        if (view != null) {
                            view.animate().translationX(0.0f).translationY(0.0f).scaleX(width2).scaleY(height2).setDuration(150L).start();
                            return;
                        } else {
                            o.LJIJI("postTypeContainer");
                            throw null;
                        }
                    }
                    o.LJIJI("postTypeContainer");
                    throw null;
                }
                o.LJIJI("mainPostContainer");
                throw null;
            }
            o.LJIJI("postTypeContainer");
            throw null;
        }
        o.LJIJI("mainPostContainer");
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowGestureAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 598), null, C196327nA.INSTANCE, null, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NowShareViewModel.class);
        this.LL = C214348b8.LIZ(this, LIZ2, null, new AqS153S0100000_3(LIZ2, 599), null, C196337nB.INSTANCE, null, null);
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(NowLikeViewModel.class);
        this.LLD = C214348b8.LIZ(this, LIZ3, c241249dQ, new AqS153S0100000_3(LIZ3, 600), null, C196347nC.INSTANCE, null, null);
        this.LLF = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    @Override // X.InterfaceC86893Y8j
    public final void C(boolean z) {
        Z3(!z);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LJZL.LIZ(this, LLI[0]));
    }

    public final void Z3(boolean z) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LJZL.LIZ(this, LLI[0]);
        assemViewModel.getClass();
        assemViewModel.setState(new AqS8S0010000_3(!z, 6));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        this.LLFF = C7MY.LIZLLL(view, "view", R.id.hzy, "view.findViewById(R.id.post_type_container)");
        View findViewById = view.findViewById(R.id.gch);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.main_post)");
        this.LLFFF = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.cff);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.double_click_like_layout)");
        this.LLFII = (C196307n8) findViewById2;
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (lifecycle = LIZLLL.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.nows.feed.ui.NowGestureAssem$onViewCreated$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        onStop();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
                public final void onStop() {
                    C196307n8 c196307n8 = NowGestureAssem.this.LLFII;
                    if (c196307n8 != null) {
                        c196307n8.removeAllViews();
                    } else {
                        o.LJIJI("doubleClickLikeIcon");
                        throw null;
                    }
                }
            });
        }
        ((NowPostCellViewModel) this.LJZL.LIZ(this, LLI[0])).hv0(this, C213688a4.LIZLLL());
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    @Override // X.InterfaceC194257jp
    public final void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        int i;
        Aweme aweme;
        NowPostInfo nowPostInfo;
        NowInteractionControl nowInteractionControl;
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        View view = this.LLFF;
        if (view != null) {
            if (nowPostCellState.LJLIL instanceof C193887jE) {
                C7ML c7ml = nowPostCellState.LJLJI;
                if (c7ml != null && (aweme = c7ml.getAweme()) != null && (nowPostInfo = aweme.nowPostInfo) != null && (nowInteractionControl = nowPostInfo.getNowInteractionControl()) != null && nowInteractionControl.getDisableLike()) {
                    i = 6;
                } else {
                    i = 7;
                }
                view.setOnTouchListener(new ViewOnTouchListenerC86892Y8i(i, view, this));
                return;
            }
            view.setOnTouchListener(null);
            return;
        }
        o.LJIJI("postTypeContainer");
        throw null;
    }

    @Override // X.InterfaceC86893Y8j
    public final void LJLLI(float f, float f2, View v) {
        final ImageView imageView;
        float f3;
        o.LJIIIZ(v, "v");
        if (((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().isPrivate()) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                C40328FsC.LIZLLL(LIZ, R.string.j2p);
                return;
            }
            return;
        }
        final C196307n8 c196307n8 = this.LLFII;
        if (c196307n8 != null) {
            if (c196307n8.LJLJJI.isEmpty()) {
                imageView = new ImageView(c196307n8.getContext());
            } else {
                Object poll = ((LinkedList) c196307n8.LJLJJI).poll();
                o.LJII(poll, "null cannot be cast to non-null type android.widget.ImageView");
                imageView = (ImageView) poll;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c196307n8.LJLILLLLZI, c196307n8.LJLIL);
            layoutParams.topMargin = (int) (f2 - ((c196307n8.LJLIL * 4) / 5.0f));
            if (C16310kV.LIZLLL(c196307n8) == 1) {
                f3 = c196307n8.LJLJI - f;
            } else {
                f3 = f;
            }
            layoutParams.setMarginStart((int) (f3 - (c196307n8.LJLILLLLZI / 2)));
            imageView.setLayoutParams(layoutParams);
            if (imageView.getParent() == null) {
                c196307n8.addView(imageView);
            }
            float nextInt = c196307n8.LJLJJL.nextInt(40) - 20;
            imageView.setRotation(nextInt);
            AnimationSet animationSet = new AnimationSet(false);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            scaleAnimation.setFillBefore(true);
            scaleAnimation.setDuration(300L);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.setDuration(500L);
            animationSet2.setStartOffset(500L);
            animationSet2.setFillAfter(true);
            animationSet2.setInterpolator(new DecelerateInterpolator());
            float nextInt2 = (c196307n8.LJLJJL.nextInt(10) + 20) / 10;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            int LIZIZ = C7MY.LIZIZ(50);
            float f4 = -(c196307n8.LJLJJL.nextInt(LIZIZ) + LIZIZ);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (Math.tan((nextInt * 3.141592653589793d) / 360) * f4), 0.0f, f4);
            animationSet2.addAnimation(scaleAnimation2);
            animationSet2.addAnimation(alphaAnimation);
            animationSet2.addAnimation(translateAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(animationSet2);
            imageView.startAnimation(animationSet);
            animationSet.setAnimationListener(new Animation.AnimationListener() { // from class: X.7n9
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    o.LJIIIZ(animation, "animation");
                    C196307n8 c196307n82 = c196307n8;
                    ImageView imageView2 = imageView;
                    c196307n82.getClass();
                    c196307n82.post(new ARunnableS22S0200000_3(imageView2, c196307n82, 29));
                }
            });
            InterfaceC115514g7 interfaceC115514g7 = this.LLD;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLI;
            ((NowLikeViewModel) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[2])).kv0(v, true, ((C181847Bs) this.LLF.getValue()).LJLIL, (C181847Bs) this.LLF.getValue(), 1);
            if (((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getUserDigg() != 1 && C44384HbQ.LJIIJJI(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme())) {
                C196387nG c196387nG = (C196387nG) C196387nG.LIZJ.getValue();
                String aid = ((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAid();
                o.LJIIIIZZ(aid, "item.aweme.aid");
                c196387nG.getClass();
                CopyOnWriteArrayList<String> copyOnWriteArrayList = c196387nG.LIZ;
                o.LJI(copyOnWriteArrayList);
                if (!copyOnWriteArrayList.contains(aid)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onDoubleClick(");
                    LIZ2.append(((C7ML) C51029K0z.LJIILLIIL(this)).getAweme().getAid());
                    LIZ2.append(", ");
                    C181787Bm c181787Bm = C181787Bm.LIZ;
                    LIZ2.append(c181787Bm);
                    LIZ2.append(')');
                    C7XD.LIZ("NowGestureAssem", X1D.LIZIZ(LIZ2));
                    C181837Br.LIZ = c181787Bm;
                    ((NowShareViewModel) this.LL.LIZ(this, interfaceC74236TBoArr[1])).jv0(EnumC181857Bt.FLIP, (InterfaceC194547kI) C51029K0z.LJIILLIIL(this));
                    return;
                }
                return;
            }
            return;
        }
        o.LJIJI("doubleClickLikeIcon");
        throw null;
    }

    @Override // X.InterfaceC86893Y8j
    public final void M(float f, float f2, float f3) {
        View view = this.LLFF;
        if (view != null) {
            view.setScaleX(f3);
            View view2 = this.LLFF;
            if (view2 != null) {
                view2.setScaleY(f3);
                View view3 = this.LLFF;
                if (view3 != null) {
                    view3.setTranslationX(view3.getTranslationX() + f);
                    View view4 = this.LLFF;
                    if (view4 != null) {
                        view4.setTranslationY(view4.getTranslationY() + f2);
                        return;
                    } else {
                        o.LJIJI("postTypeContainer");
                        throw null;
                    }
                }
                o.LJIJI("postTypeContainer");
                throw null;
            }
            o.LJIJI("postTypeContainer");
            throw null;
        }
        o.LJIJI("postTypeContainer");
        throw null;
    }
}
