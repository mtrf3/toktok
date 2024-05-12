package com.ss.android.ugc.aweme.kids.commonfeed.panel;

import X.AbstractC51687KQh;
import X.C0TS;
import X.C10K;
import X.C16310kV;
import X.C16880lQ;
import X.C2068389v;
import X.C38816FLg;
import X.C39398FdC;
import X.C55121LkD;
import X.C55995LyJ;
import X.C76939UHn;
import X.C80794VnK;
import X.C82708Wd6;
import X.C82712WdA;
import X.C82713WdB;
import X.InterfaceC65784Pro;
import X.InterfaceC82710Wd8;
import X.KL2;
import X.KRZ;
import X.OB4;
import X.ViewOnTouchListenerC81167VtL;
import Y.ACListenerS34S0100000_14;
import Y.ACallableS38S1200000_9;
import Y.ARunnableS1S0501000_10;
import Y.ARunnableS50S0100000_14;
import Y.IDAListenerS145S0200000_13;
import Y.IDCListenerS260S0100000_14;
import Y.IDiS275S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class BaseFeedPanel extends AbstractC51687KQh implements WeakHandler.IHandler {
    public View bottomSpace;
    public String categoryId;
    public InterfaceC65784Pro<Boolean> checkLoadMoreListener;
    public int curIndex;
    public List<Aweme> datas;
    public String enterFrom;
    public C82708Wd6 feedAdapter;
    public WeakHandler handler;
    public boolean isFeedResume;
    public boolean isFirst;
    public boolean isFirstSurfaceAvailable;
    public ImageView ivPlay;
    public C76939UHn likeLayout;
    public C55121LkD loadMoreLayout;
    public KRZ playController;
    public C55995LyJ refreshLayout;
    public View topSpace;
    public C80794VnK viewPager;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseFeedPanel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void adaptation() {
        C80794VnK c80794VnK = this.viewPager;
        if (c80794VnK != null) {
            View view = this.topSpace;
            if (view != null) {
                View view2 = this.bottomSpace;
                if (view2 != null) {
                    C38816FLg.LJ(new ARunnableS1S0501000_10(this.activity, view2, view, c80794VnK, new OB4(), 0));
                    return;
                } else {
                    o.LJIJI("bottomSpace");
                    throw null;
                }
            }
            o.LJIJI("topSpace");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    @Override // X.AbstractC51687KQh
    public void initPanel() {
    }

    private final void handlePlayOrPause() {
        KRZ krz = this.playController;
        if (krz != null) {
            if (krz.LJLILLLLZI.isPlaying()) {
                KRZ krz2 = this.playController;
                if (krz2 != null) {
                    krz2.LJLILLLLZI.LJIILJJIL();
                    InterfaceC82710Wd8 curViewHolder = getCurViewHolder();
                    if (curViewHolder != null) {
                        curViewHolder.LIZLLL();
                    }
                    showIvPlay();
                    return;
                }
                o.LJIJI("playController");
                throw null;
            }
            KRZ krz3 = this.playController;
            if (krz3 != null) {
                krz3.LJLILLLLZI.LIZIZ();
                InterfaceC82710Wd8 curViewHolder2 = getCurViewHolder();
                if (curViewHolder2 != null) {
                    curViewHolder2.LJ();
                }
                hideIvPlay();
                return;
            }
            o.LJIJI("playController");
            throw null;
        }
        o.LJIJI("playController");
        throw null;
    }

    private final boolean isRecommendPage() {
        return TextUtils.equals(this.enterFrom, "homepage_hot");
    }

    private final void showIvPlay() {
        ImageView imageView = this.ivPlay;
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.setScaleX(2.5f);
            imageView.setScaleY(2.5f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            imageView.setSelected(false);
            return;
        }
        o.LJIJI("ivPlay");
        throw null;
    }

    public final void checkLoadMore() {
        int i = this.curIndex;
        C82708Wd6 c82708Wd6 = this.feedAdapter;
        if (c82708Wd6 != null) {
            if (i != c82708Wd6.getCount() - 3) {
                int i2 = this.curIndex;
                if (this.feedAdapter != null) {
                    if (i2 == r0.getCount() - 1) {
                        C82708Wd6 c82708Wd62 = this.feedAdapter;
                        if (c82708Wd62 != null) {
                            if (c82708Wd62.getCount() > 3) {
                                return;
                            }
                        } else {
                            o.LJIJI("feedAdapter");
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    o.LJIJI("feedAdapter");
                    throw null;
                }
            }
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.checkLoadMoreListener;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        o.LJIJI("feedAdapter");
        throw null;
    }

    public final void clickPlay() {
        KRZ krz = this.playController;
        if (krz != null) {
            if (krz.LJLILLLLZI.isPlaying()) {
                return;
            }
            KRZ krz2 = this.playController;
            if (krz2 != null) {
                krz2.LJLILLLLZI.LIZIZ();
                InterfaceC82710Wd8 curViewHolder = getCurViewHolder();
                if (curViewHolder != null) {
                    curViewHolder.LJ();
                }
                hideIvPlay();
                return;
            }
            o.LJIJI("playController");
            throw null;
        }
        o.LJIJI("playController");
        throw null;
    }

    public final InterfaceC82710Wd8 getCurViewHolder() {
        C80794VnK c80794VnK = this.viewPager;
        if (c80794VnK != null) {
            for (int childCount = c80794VnK.getChildCount() - 1; -1 < childCount; childCount--) {
                C80794VnK c80794VnK2 = this.viewPager;
                if (c80794VnK2 != null) {
                    Object tag = c80794VnK2.getChildAt(childCount).getTag(R.id.fdh);
                    o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.viewholder.IFeedViewHolder");
                    InterfaceC82710Wd8 interfaceC82710Wd8 = (InterfaceC82710Wd8) tag;
                    C80794VnK c80794VnK3 = this.viewPager;
                    if (c80794VnK3 != null) {
                        if (adapterItemEqualHolderAweme(c80794VnK3.getCurrentItem(), interfaceC82710Wd8)) {
                            return interfaceC82710Wd8;
                        }
                    } else {
                        o.LJIJI("viewPager");
                        throw null;
                    }
                } else {
                    o.LJIJI("viewPager");
                    throw null;
                }
            }
            return null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public final void hideIvPlay() {
        ImageView imageView = this.ivPlay;
        if (imageView != null) {
            imageView.setVisibility(0);
            imageView.animate().alpha(0.0f).setDuration(100L).withEndAction(new ARunnableS50S0100000_14(imageView, 65));
            imageView.setSelected(false);
            return;
        }
        o.LJIJI("ivPlay");
        throw null;
    }

    @Override // X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC82710Wd8 curViewHolder = getCurViewHolder();
        if (curViewHolder != null) {
            curViewHolder.unBind();
        }
    }

    public final void startPlay() {
        hideIvPlay();
        KRZ krz = this.playController;
        if (krz != null) {
            KRZ.LIZIZ(krz);
        } else {
            o.LJIJI("playController");
            throw null;
        }
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final InterfaceC65784Pro<Boolean> getCheckLoadMoreListener() {
        return this.checkLoadMoreListener;
    }

    public final List<Aweme> getDatas() {
        return this.datas;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final boolean isFeedResume() {
        return this.isFeedResume;
    }

    private final void bindView(View view) {
        C55995LyJ c55995LyJ;
        if (view != null) {
            c55995LyJ = (C55995LyJ) view.findViewById(R.id.d6x);
        } else {
            c55995LyJ = null;
        }
        o.LJI(c55995LyJ);
        this.refreshLayout = c55995LyJ;
        View findViewById = view.findViewById(R.id.d6w);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.…eed_base_loadmore_layout)");
        this.loadMoreLayout = (C55121LkD) findViewById;
        View findViewById2 = view.findViewById(R.id.d71);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.…_base_vertical_viewpager)");
        this.viewPager = (C80794VnK) findViewById2;
        View findViewById3 = view.findViewById(R.id.d6u);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.feed_base_digg_layout)");
        this.likeLayout = (C76939UHn) findViewById3;
        View findViewById4 = view.findViewById(R.id.d70);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.feed_base_top_space)");
        this.topSpace = findViewById4;
        View findViewById5 = view.findViewById(R.id.d6t);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.feed_base_bottom_space)");
        this.bottomSpace = findViewById5;
        View findViewById6 = view.findViewById(R.id.d6v);
        o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.….feed_base_iv_play_pause)");
        ImageView imageView = (ImageView) findViewById6;
        this.ivPlay = imageView;
        C16880lQ.LJIILLIIL(imageView, new ACListenerS34S0100000_14(this, 17));
    }

    public final void handleDoubleClick(MotionEvent motionEvent) {
        float f;
        float f2;
        TuxIconView tuxIconView;
        DataCenter LLI;
        InterfaceC82710Wd8 curViewHolder = getCurViewHolder();
        if (curViewHolder != null && (LLI = curViewHolder.LLI()) != null) {
            LLI.jv0(null, "digg_aweme");
        }
        C76939UHn c76939UHn = this.likeLayout;
        if (c76939UHn != null) {
            if (motionEvent != null) {
                f = motionEvent.getRawX();
                f2 = motionEvent.getRawY();
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (c76939UHn.LJLIL.isEmpty()) {
                Context context = c76939UHn.LJLILLLLZI;
                o.LJI(context);
                tuxIconView = new TuxIconView(context, null, 0, 6, null);
                if (c76939UHn.LJLJJLL == null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZJ = c76939UHn.LJLJI;
                    c2068389v.LIZIZ = c76939UHn.LJLJJI;
                    c2068389v.LIZ = R.raw.icon_color_gradient_heart;
                    c76939UHn.LJLJJLL = c2068389v;
                }
            } else {
                TuxIconView poll = c76939UHn.LJLIL.poll();
                o.LJIIIIZZ(poll, "mLikeViews.poll()");
                tuxIconView = poll;
            }
            tuxIconView.setTuxIcon(c76939UHn.LJLJJLL);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c76939UHn.LJLJJI, c76939UHn.LJLJI);
            layoutParams.topMargin = (int) (f2 - (c76939UHn.LJLJI / 2));
            if (C16310kV.LIZLLL(c76939UHn) == 1) {
                f = c76939UHn.LJLJL - f;
            }
            layoutParams.setMarginStart((int) (f - (c76939UHn.LJLJJI / 2)));
            tuxIconView.setLayoutParams(layoutParams);
            if (tuxIconView.getParent() == null) {
                c76939UHn.addView(tuxIconView);
            }
            Random random = c76939UHn.LJLJJL;
            o.LJI(random);
            float nextInt = random.nextInt(40) - 20;
            tuxIconView.setRotation(nextInt);
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
            o.LJI(c76939UHn.LJLJJL);
            float nextInt2 = (r0.nextInt(10) + 20) / 10;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            int LIZJ = (int) KL2.LIZJ(c76939UHn.LJLILLLLZI, 50.0f);
            o.LJI(c76939UHn.LJLJJL);
            float f3 = -(r0.nextInt(LIZJ) + LIZJ);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (Math.tan((nextInt * 3.141592653589793d) / 360) * f3), 0.0f, f3);
            animationSet2.addAnimation(scaleAnimation2);
            animationSet2.addAnimation(alphaAnimation);
            animationSet2.addAnimation(translateAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(animationSet2);
            tuxIconView.startAnimation(animationSet);
            animationSet.setAnimationListener(new IDAListenerS145S0200000_13(c76939UHn, tuxIconView, 4));
            return;
        }
        o.LJIJI("likeLayout");
        throw null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null && message.what == 0) {
            handlePlayOrPause();
        }
    }

    public final void handlePagePause(boolean z) {
        KRZ krz = this.playController;
        if (krz != null) {
            krz.LJLILLLLZI.LJIILJJIL();
            InterfaceC82710Wd8 curViewHolder = getCurViewHolder();
            if (curViewHolder != null) {
                curViewHolder.LIZLLL();
                return;
            }
            return;
        }
        o.LJIJI("playController");
        throw null;
    }

    public final void handlePageResume(boolean z) {
        hideIvPlay();
        KRZ krz = this.playController;
        if (krz != null) {
            krz.LJLILLLLZI.LIZIZ();
            InterfaceC82710Wd8 curViewHolder = getCurViewHolder();
            if (curViewHolder != null) {
                curViewHolder.LJ();
                return;
            }
            return;
        }
        o.LJIJI("playController");
        throw null;
    }

    public final void insertVideo(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        ListProtector.add(this.datas, this.curIndex + 1, aweme);
        C82708Wd6 c82708Wd6 = this.feedAdapter;
        if (c82708Wd6 != null) {
            c82708Wd6.setData(this.datas);
        } else {
            o.LJIJI("feedAdapter");
            throw null;
        }
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setCheckLoadMoreListener(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.checkLoadMoreListener = interfaceC65784Pro;
    }

    public final void setCurItem(int i) {
        C80794VnK c80794VnK = this.viewPager;
        if (c80794VnK != null) {
            c80794VnK.LLF = false;
            c80794VnK.LJJIIJZLJL(i, false, false, 0);
        } else {
            o.LJIJI("viewPager");
            throw null;
        }
    }

    public final void setDatas(List<Aweme> value) {
        o.LJIIIZ(value, "value");
        this.datas = value;
        if (this.curIndex == 0) {
            this.isFirst = true;
            this.isFirstSurfaceAvailable = true;
        }
        C82708Wd6 c82708Wd6 = this.feedAdapter;
        if (c82708Wd6 != null) {
            c82708Wd6.setData(value);
        } else {
            o.LJIJI("feedAdapter");
            throw null;
        }
    }

    public final void setEnterFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterFrom = str;
    }

    public final void setFeedResume(boolean z) {
        this.isFeedResume = z;
    }

    public BaseFeedPanel(String enterFrom, String str) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.enterFrom = enterFrom;
        this.categoryId = str;
        this.isFirst = true;
        this.isFeedResume = true;
        this.isFirstSurfaceAvailable = true;
        this.datas = new ArrayList();
    }

    private final boolean adapterItemEqualHolderAweme(int i, InterfaceC82710Wd8 interfaceC82710Wd8) {
        if (interfaceC82710Wd8 != null) {
            C82708Wd6 c82708Wd6 = this.feedAdapter;
            Object obj = null;
            if (c82708Wd6 != null) {
                C0TS c0ts = c82708Wd6.LJLL;
                if (i >= 0) {
                    if (i < ((ArrayList) c0ts.LIZ).size()) {
                        obj = ListProtector.get((ArrayList) c0ts.LIZ, i);
                    }
                } else {
                    c0ts.getClass();
                }
                if (obj == interfaceC82710Wd8.getAweme()) {
                    return true;
                }
            } else {
                o.LJIJI("feedAdapter");
                throw null;
            }
        }
        return false;
    }

    @Override // X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindView(view);
        this.handler = new WeakHandler(this);
        Activity activity = this.activity;
        o.LJIIIIZZ(activity, "activity");
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            ViewOnTouchListenerC81167VtL viewOnTouchListenerC81167VtL = new ViewOnTouchListenerC81167VtL(activity, weakHandler, new C82712WdA(this));
            Context context = getContext();
            Fragment fragment = getFragment();
            o.LJIIIIZZ(fragment, "fragment");
            C82708Wd6 c82708Wd6 = new C82708Wd6(context, fragment, this.enterFrom, this.categoryId, viewOnTouchListenerC81167VtL);
            this.feedAdapter = c82708Wd6;
            c82708Wd6.LJLLI = new C82713WdB(this);
            C80794VnK c80794VnK = this.viewPager;
            if (c80794VnK != null) {
                c80794VnK.setAdapter(c82708Wd6);
                C80794VnK c80794VnK2 = this.viewPager;
                if (c80794VnK2 != null) {
                    c80794VnK2.LJI(new IDiS275S0100000_14(this, 4));
                    C80794VnK c80794VnK3 = this.viewPager;
                    if (c80794VnK3 != null) {
                        c80794VnK3.addOnLayoutChangeListener(new IDCListenerS260S0100000_14(this, 0));
                        this.playController = new KRZ(this);
                        C82708Wd6 c82708Wd62 = this.feedAdapter;
                        if (c82708Wd62 != null) {
                            c82708Wd62.setData(this.datas);
                            C55995LyJ c55995LyJ = this.refreshLayout;
                            if (c55995LyJ != null) {
                                C80794VnK c80794VnK4 = this.viewPager;
                                if (c80794VnK4 != null) {
                                    c55995LyJ.setViewPager(c80794VnK4);
                                    C55121LkD c55121LkD = this.loadMoreLayout;
                                    if (c55121LkD != null) {
                                        c55121LkD.LIZJ();
                                        C55121LkD c55121LkD2 = this.loadMoreLayout;
                                        if (c55121LkD2 != null) {
                                            C80794VnK c80794VnK5 = this.viewPager;
                                            if (c80794VnK5 != null) {
                                                C55995LyJ c55995LyJ2 = this.refreshLayout;
                                                if (c55995LyJ2 != null) {
                                                    c55121LkD2.LJLILLLLZI = c80794VnK5;
                                                    c55121LkD2.LJLJI = c55995LyJ2;
                                                    return;
                                                } else {
                                                    o.LJIJI("refreshLayout");
                                                    throw null;
                                                }
                                            }
                                            o.LJIJI("viewPager");
                                            throw null;
                                        }
                                        o.LJIJI("loadMoreLayout");
                                        throw null;
                                    }
                                    o.LJIJI("loadMoreLayout");
                                    throw null;
                                }
                                o.LJIJI("viewPager");
                                throw null;
                            }
                            o.LJIJI("refreshLayout");
                            throw null;
                        }
                        o.LJIJI("feedAdapter");
                        throw null;
                    }
                    o.LJIJI("viewPager");
                    throw null;
                }
                o.LJIJI("viewPager");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("handler");
        throw null;
    }

    public final void mobPageScroll(boolean z, Aweme aweme, Aweme aweme2) {
        String str;
        if (!isRecommendPage() || aweme == null || aweme2 == null) {
            return;
        }
        if (z) {
            str = "homepage_slide_down";
        } else {
            str = "homepage_slide_up";
        }
        ACallableS38S1200000_9 aCallableS38S1200000_9 = new ACallableS38S1200000_9(aweme, str, aweme2, 0);
        C39398FdC.LIZ.getClass();
        C10K.LIZIZ(aCallableS38S1200000_9, C39398FdC.LIZ(), null);
    }

    public /* synthetic */ BaseFeedPanel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2);
    }
}
