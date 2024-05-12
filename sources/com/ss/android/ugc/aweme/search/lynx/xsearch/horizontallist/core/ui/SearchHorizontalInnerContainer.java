package com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui;

import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C0A2;
import X.C15280iq;
import X.C16330kX;
import X.C16880lQ;
import X.C184077Kh;
import X.C1IZ;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C2U8;
import X.C2WP;
import X.C45804HyK;
import X.C46447IKt;
import X.C49111JPf;
import X.C49163JRf;
import X.C49164JRg;
import X.C49171JRn;
import X.C49172JRo;
import X.C49177JRt;
import X.C49217JTh;
import X.C49967JjH;
import X.C50365Jph;
import X.C50420Jqa;
import X.C50989Jzl;
import X.C57434MgQ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C68182ly;
import X.C72792tP;
import X.C72808Sho;
import X.C76732zl;
import X.C78926UyI;
import X.C78949Uyf;
import X.C9G1;
import X.IL3;
import X.InterfaceC48907JHj;
import X.InterfaceC49194JSk;
import X.InterfaceC57784Mm4;
import X.JGU;
import X.JIB;
import X.JLU;
import X.JNU;
import X.JRB;
import X.JRE;
import X.JRS;
import X.JSE;
import X.JTB;
import X.JTI;
import X.JTL;
import X.JTP;
import X.K0X;
import X.K8U;
import X.OSZ;
import X.QD3;
import X.SYL;
import X.TBR;
import X.X1D;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import Y.IDCListenerS255S0100000_8;
import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchHorizontalInnerContainer extends JNU implements GenericLifecycleObserver, InterfaceC49194JSk {
    public static final /* synthetic */ int LLIIIZ = 0;
    public final JIB LJLJL;
    public final ViewGroup LJLJLJ;
    public List<C49164JRg> LJLJLLL;
    public ReadableMap LJLL;
    public C49177JRt LJLLI;
    public final ArrayList<InterfaceC48907JHj> LJLLILLLL;
    public final ArrayList<RecyclerView.ViewHolder> LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public final JRB LJLZ;
    public final HashSet<Integer> LJZ;
    public InterfaceC48907JHj LJZI;
    public View LJZL;
    public ILynxSearchHorizontal.HorizontalStyle LL;
    public boolean LLD;
    public boolean LLF;
    public JRE LLFF;
    public boolean LLFFF;
    public final SearchStateViewModel LLFII;
    public SearchTabHorizontalVM LLFZ;
    public SearchSeparateTabHorizontalVM LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public int LLIIII;
    public final AObserverS76S0100000_8 LLIIIILZ;
    public final C62822Ol8 LLIIIJ;
    public int LLIIIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    public final List<InterfaceC48907JHj> Q() {
        this.LJLLILLLL.clear();
        U(this.LJLZ.LJIIJJI());
        return this.LJLLILLLL;
    }

    public final void V() {
        C15280iq.LIZIZ("HorizontalContainer", "playMediaIfHave");
        if (!this.LJLLLL) {
            C15280iq.LIZIZ("HorizontalContainer", "playMediaIfHave return");
            return;
        }
        if (this.LLD) {
            C15280iq.LIZIZ("HorizontalContainer", "playMediaIfHave taken over by DETAIL_ACTIVITY_FINISHED");
            this.LLD = false;
        } else {
            C15280iq.LIZIZ("HorizontalContainer", "checkRealPlayDelay");
            tryPlay();
            this.LJLJLJ.removeCallbacks((Runnable) this.LLIIIJ.getValue());
            this.LJLJLJ.postDelayed((Runnable) this.LLIIIJ.getValue(), 100L);
        }
    }

    public final void tryPlay() {
        if (this.LLIIII < 8) {
            C15280iq.LIZIZ("HorizontalContainer", "tryPlay dispatchPlayTargetChangedEvent");
            if (this.itemView.getWindowVisibility() == 0) {
                this.LJLZ.LJLZ.LIZJ();
            }
            this.LLIIII++;
            return;
        }
        C15280iq.LIZIZ("HorizontalContainer", "tryPlay onResume");
        this.LJLZ.LJLZ.LJ();
        this.LLIIII = Integer.MAX_VALUE;
    }

    public final InterfaceC48907JHj T() {
        ArrayList arrayList = (ArrayList) Q();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC48907JHj interfaceC48907JHj = (InterfaceC48907JHj) ListProtector.get(arrayList, i);
            if (interfaceC48907JHj.isPlaying()) {
                this.LJZI = interfaceC48907JHj;
                return interfaceC48907JHj;
            }
        }
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (C49111JPf.LIZ()) {
            this.LJLZ.LJLZ.LJIIJ = true;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (C49111JPf.LIZ()) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS44S0100000_8(this, 32), 500L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0191, code lost:
    
        return -1;
     */
    @Override // X.InterfaceC49194JSk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LLD(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer.LLD(com.ss.android.ugc.aweme.feed.model.Aweme):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a8, code lost:
    
        if (r0.LJII(X.JSH.class) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(java.util.List<X.C49164JRg> r15) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer.P(java.util.List):void");
    }

    public final void U(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt);
                if (childAt instanceof InterfaceC48907JHj) {
                    this.LJLLILLLL.add(childAt);
                }
            }
        }
    }

    public final void Y(JRE jre) {
        this.LLFF = jre;
        this.LJLZ.LJIJI(jre);
        SearchTabHorizontalVM searchTabHorizontalVM = this.LLFZ;
        if (searchTabHorizontalVM != null) {
            searchTabHorizontalVM.LJLJI = jre.LIZ;
        }
        SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM = this.LLI;
        if (searchSeparateTabHorizontalVM == null) {
            return;
        }
        searchSeparateTabHorizontalVM.LJLJI = jre.LIZ;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void horizontalPlayAtPosition(C9G1 event) {
        int i;
        String aid;
        int i2;
        o.LJIIIZ(event, "event");
        int i3 = event.LJLILLLLZI;
        Activity LJIILL = C78949Uyf.LJIILL(getContext());
        int i4 = 0;
        if (LJIILL != null) {
            i = LJIILL.hashCode();
        } else {
            i = 0;
        }
        if (i3 != i) {
            return;
        }
        this.LLFFF = true;
        Aweme aweme = event.LJLIL;
        List<Aweme> LJZ = this.LJLZ.LJLLLLLL.LJZ();
        if (C78949Uyf.LJJIFFI(aweme)) {
            aid = C78949Uyf.LJIIZILJ(aweme);
        } else {
            aid = aweme.getAid();
        }
        C76732zl c76732zl = new C76732zl();
        Iterator<Aweme> it = LJZ.iterator();
        int i5 = 0;
        while (true) {
            i2 = -1;
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().getAid(), aid)) {
                    break;
                } else {
                    i5++;
                }
            } else {
                i5 = -1;
                break;
            }
        }
        c76732zl.element = i5;
        if (i5 == -1 && this.LJLZ.LJLJJLL != null) {
            Iterator<Aweme> it2 = LJZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (TextUtils.equals(it2.next().getAid(), this.LJLZ.LJLJJLL)) {
                    i2 = i4;
                    break;
                }
                i4++;
            }
            c76732zl.element = i2;
            if (i2 < 0) {
                return;
            }
        }
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS27S0200000_8(this, c76732zl, 30), 500L);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onEnterSearchVideoDetailEvent(IL3 event) {
        o.LJIIIZ(event, "event");
        C15280iq.LIZIZ("HorizontalContainer", "EnterSearchVideoDetailEvent");
        JRB jrb = this.LJLZ;
        jrb.LJLZ.LJIIJ = true;
        jrb.LJLJJLL = event.LJLIL;
        this.LLF = true;
    }

    @QD3
    public final void onEvent(C50420Jqa event) {
        String aid;
        int i;
        SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM;
        OSZ<Integer, List<Aweme>> Av0;
        List<Aweme> second;
        JSE jse;
        Map<Integer, List<Aweme>> map;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 66) {
            Object obj = event.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            Aweme aweme = (Aweme) obj;
            if (C46447IKt.LJLJLJ && !C49163JRf.LIZIZ(this.LJLZ.LJLLLLLL.LJLL)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("return because new auto player can handle this ");
                LIZ.append(aweme);
                X1D.LIZIZ(LIZ);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DETAIL_ACTIVITY_FINISHED, aweme.searchFeedType: ");
            LIZ2.append(aweme.getSearchFeedType());
            C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ2));
            if (this.LLF) {
                int i2 = 0;
                this.LLF = false;
                if (!o.LJ(aweme.getSearchFeedType(), "SearchHotSpot") && event.LJLJLJ != 73 && !o.LJ(aweme.getSearchFeedType(), "search_horizontal_tab_lynx") && !o.LJ(aweme.getSearchFeedType(), "search_separate_tab_lynx") && !C78949Uyf.LJJII(aweme, JTL.TRENDING_VIDEO_CARD)) {
                    C15280iq.LIZIZ("HorizontalContainer", "HORIZONTAL_UNIQUE_ID not found, deferring resume play logic to playMediaIfHave()");
                    this.LLD = false;
                    this.LJLZ.LJLZ.LJIIJ = false;
                    return;
                }
                this.LLD = true;
                List<Aweme> LJZ = this.LJLZ.LJLLLLLL.LJZ();
                if (C78949Uyf.LJJIFFI(aweme)) {
                    aid = C78949Uyf.LJIIZILJ(aweme);
                } else {
                    aid = aweme.getAid();
                }
                C76732zl c76732zl = new C76732zl();
                Iterator<Aweme> it = LJZ.iterator();
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (it.hasNext()) {
                        if (TextUtils.equals(it.next().getAid(), aid)) {
                            break;
                        } else {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                c76732zl.element = i3;
                SearchTabHorizontalVM searchTabHorizontalVM = this.LLFZ;
                if (searchTabHorizontalVM != null && (jse = searchTabHorizontalVM.LJLJI) != null && (map = jse.LJIIIIZZ) != null) {
                    for (Map.Entry<Integer, List<Aweme>> entry : map.entrySet()) {
                        int intValue = entry.getKey().intValue();
                        List<Aweme> value = entry.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Aweme aweme2 : value) {
                            String aid2 = aweme2.getAid();
                            if (aid2 != null && aid2.length() != 0) {
                                arrayList.add(aweme2);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (TextUtils.equals(((Aweme) it2.next()).getAid(), aid)) {
                                if (i4 != -1) {
                                    C2U8.LIZ(new C2WP(Integer.valueOf(intValue), Integer.valueOf(i4)));
                                }
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                if (o.LJ(aweme.getSearchFeedType(), "search_separate_tab_lynx") && (searchSeparateTabHorizontalVM = this.LLI) != null && (second = (Av0 = searchSeparateTabHorizontalVM.Av0(aweme)).getSecond()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Aweme aweme3 : second) {
                        String aid3 = aweme3.getAid();
                        if (aid3 != null && aid3.length() != 0) {
                            arrayList2.add(aweme3);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    int i5 = 0;
                    while (true) {
                        if (it3.hasNext()) {
                            if (TextUtils.equals(((Aweme) it3.next()).getAid(), aid)) {
                                break;
                            } else {
                                i5++;
                            }
                        } else {
                            i5 = -1;
                            break;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i5);
                    if (valueOf != null && valueOf.intValue() != -1) {
                        C2U8.LIZ(new C2WP(Integer.valueOf(Av0.getFirst().intValue()), valueOf));
                    }
                }
                if (C49111JPf.LIZ() && event.LJLJLJ == 71 && c76732zl.element == -1 && this.LJLZ.LJLJJLL != null) {
                    Iterator<Aweme> it4 = LJZ.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        if (TextUtils.equals(it4.next().getAid(), this.LJLZ.LJLJJLL)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    c76732zl.element = i;
                    if (i < 0) {
                        return;
                    }
                }
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS27S0200000_8(this, c76732zl, 31), 500L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    @X.QD3(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOpenHotSpotEvent(X.C49162JRe r19) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer.onOpenHotSpotEvent(X.JRe):void");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onOuterContainerStatusChanged(JRS event) {
        Fragment fragment;
        o.LJIIIZ(event, "event");
        int i = event.LJLIL;
        if (this.LLIIIL == -1) {
            this.LLIIIL = i;
        }
        if (this.LLIIIL != i) {
            return;
        }
        int i2 = event.LJLILLLLZI;
        if (i2 != 3) {
            if (i2 != 5) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RETURN_FROM_DETAIL: ");
            JIB jib = this.LJLJL;
            if (jib != null) {
                fragment = jib.LIZ();
            } else {
                fragment = null;
            }
            LIZ.append(fragment);
            C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
            if (this.LLFFF) {
                this.LLFFF = false;
                return;
            } else {
                V();
                return;
            }
        }
        ArrayList arrayList = (ArrayList) Q();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC48907JHj interfaceC48907JHj = (InterfaceC48907JHj) ListProtector.get(arrayList, i3);
            JLU.LJIIIIZZ(interfaceC48907JHj);
            interfaceC48907JHj.g9();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("release ");
        LIZ2.append(arrayList.size());
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ2));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReceiveOpenCommentEvent(C49217JTh event) {
        String str;
        Aweme aweme;
        Fragment fragment;
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(event, "event");
        K8U k8u = event.LJLIL;
        if (k8u != null && k8u.getAwemeID().length() > 0) {
            str = event.LJLIL.getAwemeID();
        } else {
            str = event.LJLJI;
            if (str == null) {
                str = "";
            }
        }
        if (str.length() == 0) {
            return;
        }
        Iterator<Aweme> it = this.LJLZ.LJLLLLLL.LJZ().iterator();
        while (true) {
            if (it.hasNext()) {
                aweme = it.next();
                if (o.LJ(str, aweme.getAid())) {
                    break;
                }
            } else {
                aweme = null;
                break;
            }
        }
        Aweme aweme2 = aweme;
        if (aweme2 == null) {
            return;
        }
        K0X k0x = new K0X(this, event);
        SearchResultActivity LIZIZ = C50989Jzl.LIZIZ();
        if (LIZIZ == null || LIZIZ.getSupportFragmentManager().LJJJJLI().size() <= 0 || (fragment = (Fragment) ListProtector.get(LIZIZ.getSupportFragmentManager().LJJJJLI(), 0)) == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
            return;
        }
        lifecycleScope.launchWhenResumed(new C72792tP(fragment, aweme2, k0x, null));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onReceiveVideoEvent(C1IZ event) {
        o.LJIIIZ(event, "event");
        if (event.LJLJI) {
            return;
        }
        Iterator<Aweme> it = this.LJLZ.LJLLLLLL.LJZ().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().getAid(), String.valueOf(event.LJLIL))) {
                if (i == -1) {
                    return;
                }
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS12S0101000_8(i, this, 17), 500L);
                return;
            }
            i++;
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        ActivityC45651qj LJJIFFI;
        SearchStateViewModel searchStateViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(v, "v");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onViewAttachedToWindow  ");
        LIZ.append(this);
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
        super.onViewAttachedToWindow(v);
        EventBus.LIZJ().LJIILJJIL(this);
        if (C49967JjH.LIZIZ() && (LJJIFFI = C45804HyK.LJJIFFI(getContext())) != null && (searchStateViewModel = this.LLFII) != null && (mutableLiveData = searchStateViewModel.isScrollingInternal) != null) {
            mutableLiveData.observe(LJJIFFI, this.LLIIIILZ);
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        SearchStateViewModel searchStateViewModel;
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(v, "v");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onViewDetachedFromWindow  ");
        LIZ.append(this);
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
        super.onViewDetachedFromWindow(v);
        EventBus.LIZJ().LJIJ(this);
        if (C49967JjH.LIZIZ() && (searchStateViewModel = this.LLFII) != null && (mutableLiveData = searchStateViewModel.isScrollingInternal) != null) {
            mutableLiveData.removeObserver(this.LLIIIILZ);
        }
    }

    public final void X(ILynxSearchHorizontal.ScrollAnchorInfo scrollAnchorInfo, Callback callback) {
        int i;
        LinearLayoutManager linearLayoutManager;
        SearchStateViewModel searchStateViewModel = (SearchStateViewModel) ViewModelProviders.of(getActivity()).get(SearchStateViewModel.class);
        searchStateViewModel.setIsScrollingInternal(true);
        C15280iq.LIZIZ("HorizontalContainer", "Horizontal scrolling start");
        C0A2 layoutManager = this.LJLZ.LJIIJJI().getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        if (scrollAnchorInfo == null) {
            layoutManager.LJZL(0);
        } else {
            Integer index = scrollAnchorInfo.getIndex();
            if (index != null) {
                i = index.intValue();
            } else {
                i = 0;
            }
            int scrollOffset = scrollAnchorInfo.getScrollOffset();
            int paddingStart = this.LJLZ.LJIIJJI().getPaddingStart();
            if (scrollOffset > 0) {
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    linearLayoutManager.LJFF(i, scrollOffset - paddingStart);
                }
            } else {
                layoutManager.LJZL(i);
            }
        }
        RecyclerView LJIIJJI = this.LJLZ.LJIIJJI();
        if (C16330kX.LIZJ(LJIIJJI) && !LJIIJJI.isLayoutRequested()) {
            if (callback != null) {
                callback.invoke(0, new JSONObject());
            }
        } else {
            LJIIJJI.addOnLayoutChangeListener(new IDCListenerS255S0100000_8(callback, 1));
        }
        this.LJLZ.LJIIJJI().postDelayed(new ARunnableS27S0200000_8(this, searchStateViewModel, 32), 200L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHorizontalInnerContainer(View itemView, JIB jib, JGU jgu) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        this.LJLJL = jib;
        View findViewById = itemView.findViewById(R.id.je8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…rch_aweme_card_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.LJLJLJ = viewGroup;
        this.LJLLILLLL = new ArrayList<>();
        this.LJLLJ = new ArrayList<>();
        this.LJLLL = "";
        this.LJLLLL = true;
        this.LJLLLLLL = -1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchHorizontalViewHolder:  initSubHolder");
        LIZ.append(viewGroup);
        C15280iq.LIZIZ("HorizontalContainer", X1D.LIZIZ(LIZ));
        viewGroup.removeAllViews();
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        JRE jre = this.LLFF;
        JRB jrb = new JRB(new JTI(C50365Jph.LIZIZ(R.layout.cjf, (ViewGroup) view)), jib, jgu);
        jrb.LJIJI(jre);
        viewGroup.addView(jrb.LJIIIZ());
        if (C46447IKt.LJLJLJ) {
            jrb.LJLLLLLL.LJLLJ = new C49172JRo(jrb, this);
        }
        if (((Number) JTP.LIZ.getValue()).intValue() == 1) {
            jrb.LJLLLLLL.LJLLL = new AqS174S0100000_8(this, 245);
        }
        this.LJLZ = jrb;
        this.LJZ = new HashSet<>();
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS158S0100000_8(itemView, 181));
        SYL syl = new SYL(getContext(), null);
        SYL syl2 = new SYL(getContext(), null);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(getContext());
        if (LJJIFFI != null) {
            this.LLFZ = (SearchTabHorizontalVM) new C214378bB(C65352Pkq.LIZ(SearchTabHorizontalVM.class), new AqS151S0100000_1(LJJIFFI, 706), C214528bQ.LJLIL, C78926UyI.LJJII(LJJIFFI, false), C184077Kh.LJLIL, C49171JRn.INSTANCE, C78926UyI.LJIIJJI(LJJIFFI), C78926UyI.LJIILL(LJJIFFI)).getValue();
            this.LLI = JTB.LIZIZ(getActivity());
        }
        final SearchTabHorizontalVM searchTabHorizontalVM = this.LLFZ;
        if (searchTabHorizontalVM != null) {
            C72808Sho<InterfaceC57784Mm4> state = syl.getState();
            o.LJIIIIZZ(state, "powerList.state");
            searchTabHorizontalVM.setListState(state);
            syl.LJLJLLL((AbstractC72278SYg) new TBR(searchTabHorizontalVM) { // from class: X.JTM
                @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
        final SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM = this.LLI;
        if (searchSeparateTabHorizontalVM != null) {
            C72808Sho<InterfaceC57784Mm4> state2 = syl2.getState();
            o.LJIIIIZZ(state2, "powerList2.state");
            searchSeparateTabHorizontalVM.setListState(state2);
            syl2.LJLJLLL((AbstractC72278SYg) new TBR(searchSeparateTabHorizontalVM) { // from class: X.JTN
                @Override // X.TBR, X.AbstractC74222TBa, X.InterfaceC74226TBe
                public final Object get() {
                    return ((AssemListViewModel) this.receiver).getConfig();
                }
            }.get());
        }
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(getContext());
        this.LLFII = LJJIFFI2 != null ? (SearchStateViewModel) ViewModelProviders.of(LJJIFFI2).get(SearchStateViewModel.class) : null;
        C68182ly.LIZ(C57434MgQ.LIZIZ(getActivity()), this);
        this.LLII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 182));
        this.LLIIIILZ = new AObserverS76S0100000_8(this, 38);
        this.LLIIIJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 180));
        this.LLIIIL = -1;
    }
}
