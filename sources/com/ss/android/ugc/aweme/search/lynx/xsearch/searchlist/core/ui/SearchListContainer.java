package com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui;

import X.AbstractC49114JPi;
import X.ActivityC45651qj;
import X.C0A2;
import X.C15280iq;
import X.C16330kX;
import X.C16880lQ;
import X.C221108m2;
import X.C45804HyK;
import X.C48880JGi;
import X.C48892JGu;
import X.C49153JQv;
import X.C49173JRp;
import X.C49177JRt;
import X.C49181JRx;
import X.C49182JRy;
import X.C50420Jqa;
import X.C50620Jto;
import X.C55457Lpd;
import X.C62822Ol8;
import X.C76732zl;
import X.C80001VaX;
import X.IL3;
import X.InterfaceC48907JHj;
import X.JLU;
import X.JR4;
import X.JRG;
import X.JRQ;
import X.JRR;
import X.JRS;
import X.JRT;
import X.JSE;
import X.JTI;
import X.QD3;
import X.VNL;
import X.X1D;
import Y.ARunnableS27S0200000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.search.lynx.xsearch.searchlist.core.ui.ILynxSearchList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes9.dex */
public final class SearchListContainer extends AbstractC49114JPi implements GenericLifecycleObserver {
    public static final /* synthetic */ int LLIIII = 0;
    public final ViewGroup LJLLILLLL;
    public C49177JRt LJLLJ;
    public final ArrayList<InterfaceC48907JHj> LJLLL;
    public boolean LJLLLL;
    public InterfaceC48907JHj LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public JRG LJZI;
    public JRT LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C49153JQv LLF;
    public final C49173JRp LLFF;
    public View LLFFF;
    public int LLFII;
    public final ActivityC45651qj LLFZ;
    public final JRR LLI;
    public final AqS158S0100000_8 LLIFFJFJJ;
    public int LLII;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onActivityDestroy();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onActivityPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onActivityResume();
        }
    }

    @Override // X.AbstractC49114JPi
    public final RecyclerView LJIIJJI() {
        return (RecyclerView) this.LL.getValue();
    }

    public final void LJIILLIIL() {
        JavaOnlyArray javaOnlyArray;
        int i;
        ViewGroup.LayoutParams layoutParams;
        C15280iq.LIZIZ("HorizontalContainer", "bindBounceFromSpan");
        JRT jrt = this.LJZL;
        if (jrt == null) {
            return;
        }
        JRT jrt2 = this.LLFF.LJLJJL;
        if (jrt2 == null || (javaOnlyArray = jrt2.LJ) == null) {
            ViewGroup viewGroup = this.LJLIL.LJLJI;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                return;
            }
            return;
        }
        if (javaOnlyArray.size() > 0) {
            int i2 = 0;
            if (javaOnlyArray.get(0) instanceof Integer) {
                Object obj = javaOnlyArray.get(0);
                o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj).intValue();
                C49181JRx c49181JRx = jrt.LJFF;
                if (c49181JRx == null) {
                    C49173JRp c49173JRp = this.LLFF;
                    c49173JRp.getClass();
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
                    C49182JRy c49182JRy = new C49182JRy(c49173JRp.LJLJJI);
                    c49182JRy.setLayoutParams(layoutParams2);
                    c49181JRx = new C49181JRx(c49182JRy);
                    jrt.LJFF = c49181JRx;
                }
                if (this.LLFF.LJZL(c49181JRx, intValue)) {
                    this.LLFFF = c49181JRx.itemView;
                    ViewGroup viewGroup2 = this.LJLIL.LJLJI;
                    if (viewGroup2 != null) {
                        viewGroup2.removeAllViews();
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams3.gravity = 17;
                        viewGroup2.addView(this.LLFFF, layoutParams3);
                        UIComponent L = c49181JRx.L();
                        if (L != null) {
                            i = L.getWidth();
                        } else {
                            i = 0;
                        }
                        UIComponent L2 = c49181JRx.L();
                        if (L2 != null) {
                            i2 = L2.getHeight();
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("setBounceView: width=");
                        LIZ.append(i);
                        LIZ.append("; height=");
                        LIZ.append(i2);
                        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
                        View view = this.LLFFF;
                        if (view == null || (layoutParams = view.getLayoutParams()) == null) {
                            layoutParams = new FrameLayout.LayoutParams(i, i2);
                        }
                        layoutParams.width = i;
                        layoutParams.height = i2;
                        View view2 = this.LLFFF;
                        if (view2 != null) {
                            view2.setLayoutParams(layoutParams);
                        }
                        ViewGroup viewGroup3 = this.LJLIL.LJLJI;
                        if (viewGroup3 != null) {
                            ViewGroup.LayoutParams layoutParams4 = viewGroup3.getLayoutParams();
                            if (layoutParams4 == null) {
                                layoutParams4 = new LinearLayout.LayoutParams(i, -1);
                            }
                            layoutParams4.width = i;
                            viewGroup3.setLayoutParams(layoutParams4);
                        }
                        ViewGroup viewGroup4 = this.LJLIL.LJLJJI;
                        if (viewGroup4 != null) {
                            ViewGroup.LayoutParams layoutParams5 = viewGroup4.getLayoutParams();
                            if (layoutParams5 == null) {
                                layoutParams5 = new LinearLayout.LayoutParams(i, -1);
                            }
                            layoutParams5.width = i;
                            viewGroup4.setLayoutParams(layoutParams5);
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC49114JPi
    /* renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final JR4 LJIIL() {
        return (JR4) this.LLD.getValue();
    }

    public final void LJIL() {
        C15280iq.LIZIZ("HorizontalContainer", "playMediaIfHave");
        if (!this.LJLLLL) {
            C15280iq.LIZIZ("HorizontalContainer", "playMediaIfHave return");
        } else if (this.LJLZ) {
            C15280iq.LIZIZ("HorizontalContainer", "playMediaIfHave taken over by DETAIL_ACTIVITY_FINISHED");
            this.LJLZ = false;
        } else {
            C15280iq.LIZIZ("HorizontalContainer", "checkRealPlayDelay");
            this.LLF.LJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onActivityDestroy() {
        Lifecycle lifecycle;
        ActivityC45651qj activityC45651qj = this.LLFZ;
        if (activityC45651qj != null && (lifecycle = activityC45651qj.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        C15280iq.LIZIZ("HorizontalContainer", "onActivityDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onActivityPause() {
        C15280iq.LIZIZ("HorizontalContainer", "onActivityPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onActivityResume() {
        C15280iq.LIZIZ("HorizontalContainer", "onActivityResume");
    }

    public final void LJIIZILJ(boolean z) {
        C80001VaX c80001VaX = this.LJLIL.LJLJJL;
        if (c80001VaX != null) {
            if (z) {
                c80001VaX.setOnScrollToEndListener(this.LLIFFJFJJ);
                c80001VaX.setOnScrollThresholdHitListener(this.LLI);
                c80001VaX.setEnable(true);
            } else {
                c80001VaX.setOnScrollToEndListener(null);
                c80001VaX.setOnScrollThresholdHitListener(null);
                c80001VaX.setEnable(false);
            }
        }
    }

    public final int LJIJ(String str) {
        JRT jrt;
        JSE jse;
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        if (str == null || (jrt = this.LJZL) == null || (jse = jrt.LIZ) == null || (dynamicPatch = jse.LIZ) == null || (awemeList = dynamicPatch.getAwemeList()) == null) {
            return -1;
        }
        int size = awemeList.size();
        for (int i = 0; i < size; i++) {
            if (o.LJ(((Aweme) ListProtector.get(awemeList, i)).getAid(), str)) {
                return i;
            }
        }
        return -1;
    }

    public final void LJIJI(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                LJIJI((ViewGroup) childAt);
                if (childAt instanceof InterfaceC48907JHj) {
                    this.LJLLL.add(childAt);
                }
            }
        }
    }

    public final void LJJ(ILynxSearchList.ScrollAnchorInfo scrollAnchorInfo) {
        C0A2 layoutManager = LJIIJJI().getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        int i = 0;
        if (scrollAnchorInfo == null) {
            layoutManager.LJZL(0);
            return;
        }
        Integer index = scrollAnchorInfo.getIndex();
        if (index != null) {
            i = index.intValue();
        }
        layoutManager.LJZL(i);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEnterSearchVideoDetailEvent(IL3 event) {
        o.LJIIIZ(event, "event");
        C15280iq.LIZIZ("HorizontalContainer", "EnterSearchVideoDetailEvent");
        this.LLF.LJIIJ = true;
        this.LJLJJLL = event.LJLIL;
        this.LJZ = true;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onOuterContainerStatusChanged(JRS event) {
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (this.LLII == -1) {
            this.LLII = i;
        }
        if (this.LLII != i) {
            return;
        }
        int i2 = event.LJLILLLLZI;
        if (i2 != 3) {
            if (i2 != 5) {
                return;
            }
            LJIL();
            return;
        }
        this.LJLLL.clear();
        LJIJI(LJIIJJI());
        ArrayList<InterfaceC48907JHj> arrayList = this.LJLLL;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC48907JHj interfaceC48907JHj = (InterfaceC48907JHj) ListProtector.get(arrayList, i3);
            JLU.LJIIIIZZ(interfaceC48907JHj);
            interfaceC48907JHj.g9();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release ");
        LIZ.append(arrayList.size());
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC49114JPi
    public final void onVideoEvent(C50420Jqa event) {
        List<Aweme> arrayList;
        long j;
        JSE jse;
        DynamicPatch dynamicPatch;
        Aweme aweme;
        Aweme aweme2;
        int i;
        o.LJIIIZ(event, "event");
        if (!C16330kX.LIZIZ(this.LJLIL.itemView)) {
            return;
        }
        int i2 = event.LJLJLJ;
        if (i2 != 73 && i2 != 71 && i2 != 74) {
            return;
        }
        int i3 = event.LJLIL;
        if (i3 != 13) {
            if (i3 != 21) {
                if (i3 != 66) {
                    return;
                }
                Object obj = event.LJLILLLLZI;
                if (!(obj instanceof Aweme) || (aweme2 = (Aweme) obj) == null) {
                    return;
                }
                C76732zl c76732zl = new C76732zl();
                int LJIJ = LJIJ(aweme2.getAid());
                c76732zl.element = LJIJ;
                if (LJIJ < 0) {
                    return;
                }
                C55457Lpd.LJLLI = -1;
                if (event.LJLJJLL > 0 || C50620Jto.LIZ()) {
                    boolean z = !event.LJLL;
                    long j2 = event.LJLJJLL;
                    long j3 = event.LJLJLLL;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("SearchVideoForLynx_");
                    Activity LJIJJ = C45804HyK.LJIJJ(LJIIIIZZ());
                    if (LJIJJ != null) {
                        i = LJIJJ.hashCode();
                    } else {
                        i = 0;
                    }
                    LIZ.append(i);
                    String shareId = C48880JGi.LIZ(X1D.LIZIZ(LIZ), aweme2.getAid());
                    o.LJIIIIZZ(shareId, "shareId");
                    C48892JGu.LIZIZ(aweme2, z, shareId, j2, j3);
                }
                if (!this.LJZ) {
                    return;
                }
                this.LJZ = false;
                this.LJLZ = true;
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS27S0200000_8(this, c76732zl, 33), 500L);
                return;
            }
            Object obj2 = event.LJLILLLLZI;
            if (!(obj2 instanceof Aweme) || (aweme = (Aweme) obj2) == null) {
                return;
            }
            int LJIJ2 = LJIJ(aweme.getAid());
            if ((LJIJ2 < 0 && (LJIJ2 = LJIJ(this.LJLJJLL)) < 0) || !event.LJLLI) {
                return;
            }
            LJIIJ().LJFF(LJIJ2, 0);
            return;
        }
        Object obj3 = event.LJLILLLLZI;
        o.LJII(obj3, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj3;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JRT jrt = this.LJZL;
        if (jrt == null || (jse = jrt.LIZ) == null || (dynamicPatch = jse.LIZ) == null || (arrayList = dynamicPatch.getAwemeList()) == null) {
            arrayList = new ArrayList<>();
        }
        for (Aweme aweme3 : arrayList) {
            if (o.LJ(aweme3.getAid(), str)) {
                Bundle bundle = event.LJLJI;
                if (bundle == null) {
                    return;
                }
                int i4 = bundle.getInt("user_digged");
                aweme3.setUserDigg(i4);
                if (aweme3.getStatistics() == null) {
                    return;
                }
                AwemeStatistics statistics = aweme3.getStatistics();
                if (statistics != null) {
                    j = statistics.getDiggCount();
                } else {
                    j = 0;
                }
                if (i4 == 1) {
                    aweme3.getStatistics().setDiggCount(j + 1);
                } else {
                    aweme3.getStatistics().setDiggCount(j - 1);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchListContainer(ViewGroup parent, VNL vnl, JTI jti) {
        super(jti, null, null);
        Lifecycle lifecycle;
        o.LJIIIZ(parent, "parent");
        this.LJLLILLLL = parent;
        this.LJLLL = new ArrayList<>();
        this.LJLLLL = true;
        this.LL = C221108m2.LIZIZ(new AqS158S0100000_8(jti, 184));
        this.LLD = C221108m2.LIZIZ(new AqS158S0100000_8(this, 185));
        this.LLF = LJIIL().LIZIZ();
        Context context = jti.itemView.getContext();
        o.LJIIIIZZ(context, "viewHolder.itemView.context");
        C49173JRp c49173JRp = new C49173JRp(context, vnl, LJIIL().LIZ(), LJIIL().LIZIZ(), LJIIJJI(), this.LJZL);
        this.LLFF = c49173JRp;
        LJIIL().LJLJL = c49173JRp;
        LJIIZILJ(true);
        C80001VaX c80001VaX = jti.LJLJJL;
        if (c80001VaX != null) {
            c80001VaX.setOnScrollChangeListener(new JRQ(this));
        }
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) C45804HyK.LJIJJ(context2);
        this.LLFZ = activityC45651qj;
        if (activityC45651qj != null && (lifecycle = activityC45651qj.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LLI = JRR.LJLIL;
        this.LLIFFJFJJ = new AqS158S0100000_8(this, 186);
        this.LLII = -1;
    }
}
