package X;

import Y.IDCListenerS137S0100000_29;
import Y.IDHandlerS27S0100000_29;
import Y.IDRunnableS88S0100000_29;
import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.BaseLyricsViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.lyric.widget.SmoothScrollLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zt1, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public abstract class AbstractC91339Zt1 extends FrameLayout implements InterfaceC91083Zot, InterfaceC91289ZsD, InterfaceC91291ZsF {
    public int LJLIL;
    public BaseLyricsViewModel LJLILLLLZI;
    public C91395Ztv LJLJI;
    public AbstractC91590Zx4 LJLJJI;
    public boolean LJLJJL;
    public C91084Zou LJLJJLL;
    public Integer LJLJL;
    public long LJLJLJ;
    public volatile boolean LJLJLLL;
    public final int LJLL;
    public Pair<Integer, Integer> LJLLI;
    public C91109ZpJ LJLLILLLL;
    public C91542ZwI LJLLJ;
    public C0A2 LJLLL;
    public C91367ZtT LJLLLL;
    public View.OnClickListener LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final Handler LJZI;

    public abstract Integer LIZJ(int i);

    public Integer getFadingEdgeLen() {
        return null;
    }

    public abstract Class<? extends BaseLyricsViewModel> getViewModelClass();

    @Override // X.InterfaceC91289ZsD
    public final void onBufferingUpdate(float f) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onCompletion() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlayableChanged(InterfaceC91296ZsK interfaceC91296ZsK) {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepare() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPrepared() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onRenderStart() {
    }

    @Override // X.InterfaceC91289ZsD
    public final void onVideoSizeChanged(int i, int i2) {
    }

    public void setPageIndex(int i) {
    }

    private final Integer getIndicatorLyricViewIndex() {
        ArrayList<C91077Zon> arrayList;
        C0A2 c0a2;
        LinearLayoutManager linearLayoutManager;
        int i;
        int i2 = this.LJLJJLL.LJIIJ;
        C91367ZtT c91367ZtT = this.LJLLLL;
        if (c91367ZtT != null && (arrayList = c91367ZtT.LJLJI) != null) {
            C91542ZwI c91542ZwI = this.LJLLJ;
            if (c91542ZwI != null) {
                c0a2 = c91542ZwI.getLayoutManager();
            } else {
                c0a2 = null;
            }
            if (!(c0a2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) c0a2) == null) {
                return null;
            }
            int i3 = (int) (i2 + (this.LJLJJLL.LJIIIZ * 0.5f));
            int LLILL = linearLayoutManager.LLILL();
            View LJJIJIL = linearLayoutManager.LJJIJIL(LLILL);
            if (LJJIJIL == null) {
                return null;
            }
            int abs = Math.abs(LJJIJIL.getTop());
            Iterator<C91077Zon> it = arrayList.iterator();
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                C91077Zon next = it.next();
                int i6 = i4 + 1;
                if (i4 >= 0) {
                    C91077Zon c91077Zon = next;
                    if (i4 >= LLILL) {
                        if (i4 == LLILL) {
                            i = c91077Zon.LIZJ - abs;
                        } else {
                            i = c91077Zon.LIZJ;
                        }
                        i5 += i;
                        if (i5 > i3) {
                            return Integer.valueOf(i4);
                        }
                    }
                    i4 = i6;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return null;
    }

    private final InterfaceC91108ZpI getMOnDispatchTouchEventListener() {
        return (InterfaceC91108ZpI) this.LJLZ.getValue();
    }

    private final Observer<C91075Zol> getMReqLyricsObserver() {
        return (Observer) this.LJZ.getValue();
    }

    public final void LIZLLL() {
        C91109ZpJ c91109ZpJ = this.LJLLILLLL;
        if (c91109ZpJ == null) {
            return;
        }
        c91109ZpJ.setVisibility(8);
    }

    public final void LJ() {
        Integer indicatorLyricViewIndex;
        C91542ZwI c91542ZwI = this.LJLLJ;
        if (c91542ZwI != null && c91542ZwI.getScrollState() == 0 && (indicatorLyricViewIndex = getIndicatorLyricViewIndex()) != null) {
            LJIIIIZZ(this, Integer.valueOf(indicatorLyricViewIndex.intValue()), false, 4);
        }
    }

    public final void LJFF() {
        MutableLiveData<C91075Zol> mutableLiveData;
        BaseLyricsViewModel baseLyricsViewModel = this.LJLILLLLZI;
        if (baseLyricsViewModel != null && (mutableLiveData = baseLyricsViewModel.LJLJJI) != null) {
            mutableLiveData.observeForever(getMReqLyricsObserver());
        }
    }

    public final void LJI() {
        C91605ZxJ c91605ZxJ;
        C91334Zsw c91334Zsw;
        AbstractC91590Zx4 playerController = getPlayerController();
        if (playerController != null && (c91605ZxJ = playerController.LJLILLLLZI) != null && (c91334Zsw = c91605ZxJ.LJLJI.LJLIL) != null) {
            c91334Zsw.LJIIL(this);
        }
        AbstractC91590Zx4 playerController2 = getPlayerController();
        if (playerController2 != null) {
            playerController2.bK(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        MutableLiveData<C91075Zol> mutableLiveData;
        LJI();
        this.LJZI.removeCallbacksAndMessages(null);
        BaseLyricsViewModel baseLyricsViewModel = this.LJLILLLLZI;
        if (baseLyricsViewModel != null && (mutableLiveData = baseLyricsViewModel.LJLJJI) != null) {
            mutableLiveData.removeObserver(getMReqLyricsObserver());
        }
        super.onDetachedFromWindow();
    }

    public final C91367ZtT getMAdapter() {
        return this.LJLLLL;
    }

    public final C91542ZwI getMLyricsRlv() {
        return this.LJLLJ;
    }

    public final AbstractC91590Zx4 getPlayerController() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC91339Zt1(Context context) {
        super(context, null, 0);
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        new LinkedHashMap();
        this.LJLJJLL = new C91084Zou();
        this.LJLJL = -1;
        this.LJLJLJ = -1L;
        this.LJLL = 1;
        C91489ZvR c91489ZvR = (C91489ZvR) this;
        this.LJLZ = C221108m2.LIZIZ(new IDqS421S0100000_29(c91489ZvR, 2));
        this.LJZ = C221108m2.LIZIZ(new IDqS421S0100000_29(c91489ZvR, 3));
        this.LJZI = new IDHandlerS27S0100000_29(c91489ZvR, C16880lQ.LLJJJJ(), 0);
        this.LJLIL = ViewConfiguration.get(context).getScaledTouchSlop();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bj, this, true);
        this.LJLLILLLL = (C91109ZpJ) findViewById(R.id.ji);
        this.LJLLJ = (C91542ZwI) findViewById(R.id.ii);
        Integer fadingEdgeLen = getFadingEdgeLen();
        if (fadingEdgeLen != null) {
            int intValue = fadingEdgeLen.intValue();
            C91542ZwI c91542ZwI = this.LJLLJ;
            if (c91542ZwI != null) {
                c91542ZwI.setFadingEdgeLength(intValue);
            }
        }
        C91109ZpJ c91109ZpJ = this.LJLLILLLL;
        if (c91109ZpJ != null) {
            layoutParams = c91109ZpJ.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = this.LJLJJLL.LJIIJ;
        }
        C91109ZpJ c91109ZpJ2 = this.LJLLILLLL;
        if (c91109ZpJ2 != null) {
            c91109ZpJ2.setOnClickListener(new ViewOnClickListenerC13880ga(new IDCListenerS137S0100000_29(c91489ZvR, 0)));
        }
        getContext();
        this.LJLLL = new SmoothScrollLayoutManager();
        C91367ZtT c91367ZtT = new C91367ZtT();
        c91367ZtT.LJLJJI = this.LJLLLLLL;
        this.LJLLLL = c91367ZtT;
        C91542ZwI c91542ZwI2 = this.LJLLJ;
        if (c91542ZwI2 != null) {
            c91542ZwI2.setLayoutParams(new FrameLayout.LayoutParams(this.LJLJJLL.LIZIZ(), -2));
            c91542ZwI2.setLayoutManager(this.LJLLL);
            c91542ZwI2.setAdapter(this.LJLLLL);
            c91542ZwI2.setItemAnimator(null);
            c91542ZwI2.setDisableTouchScroll(this.LJLJJLL.LJIILIIL);
            c91542ZwI2.LJIIJJI(new C91340Zt2(c91489ZvR));
            c91542ZwI2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC91063ZoZ(c91542ZwI2, c91489ZvR));
        }
    }

    @Override // X.InterfaceC91291ZsF
    public final void Hz(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91291ZsF
    public final void Kj(EnumC91307ZsV playMode) {
        o.LJIIIZ(playMode, "playMode");
    }

    public final Integer LIZIZ(long j) {
        ArrayList<C91077Zon> arrayList;
        C91367ZtT c91367ZtT = this.LJLLLL;
        C91077Zon c91077Zon = null;
        if (c91367ZtT != null && (arrayList = c91367ZtT.LJLJI) != null) {
            Iterator<C91077Zon> it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (it.next().LIZ == 3) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            C91077Zon c91077Zon2 = (C91077Zon) ORZ.LJLLLLLL(i, arrayList);
            if (c91077Zon2 == null) {
                return null;
            }
            C91319Zsh c91319Zsh = c91077Zon2.LIZIZ;
            long j2 = c91319Zsh.LIZIZ;
            if (j < c91319Zsh.LIZJ && j2 <= j) {
                Iterator<C91077Zon> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C91077Zon next = it2.next();
                    if (next.LIZLLL) {
                        c91077Zon = next;
                        break;
                    }
                }
                C91077Zon c91077Zon3 = c91077Zon;
                if (j <= 500 && j < c91077Zon2.LIZIZ.LIZJ) {
                    if (c91077Zon3 != null) {
                        c91077Zon3.LIZLLL = false;
                    }
                    c91077Zon2.LIZLLL = false;
                    return 0;
                }
                if (c91077Zon3 != null) {
                    c91077Zon3.LIZLLL = false;
                }
                c91077Zon2.LIZLLL = true;
                return Integer.valueOf(i);
            }
            Iterator<C91077Zon> it3 = arrayList.iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                C91077Zon next2 = it3.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C91077Zon c91077Zon4 = next2;
                    if (c91077Zon4.LIZ == 3) {
                        C91319Zsh c91319Zsh2 = c91077Zon4.LIZIZ;
                        long j3 = c91319Zsh2.LIZIZ;
                        long j4 = c91319Zsh2.LIZJ;
                        if (j3 <= j && j < j4) {
                            Iterator<C91077Zon> it4 = arrayList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    break;
                                }
                                C91077Zon next3 = it4.next();
                                if (next3.LIZLLL) {
                                    c91077Zon = next3;
                                    break;
                                }
                            }
                            C91077Zon c91077Zon5 = c91077Zon;
                            if (c91077Zon5 != null) {
                                c91077Zon5.LIZLLL = false;
                            }
                            c91077Zon4.LIZLLL = true;
                            return Integer.valueOf(i2);
                        }
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return null;
    }

    public final void LJII(int i) {
        Integer LIZJ = LIZJ(i);
        if (LIZJ != null) {
            int intValue = LIZJ.intValue();
            C91542ZwI c91542ZwI = this.LJLLJ;
            if (c91542ZwI != null) {
                c91542ZwI.scrollBy(0, intValue);
            }
            LIZ(Integer.valueOf(i), false);
        }
    }

    @Override // X.InterfaceC91291ZsF
    public final void Y50(InterfaceC91297ZsL playableQueue) {
        o.LJIIIZ(playableQueue, "playableQueue");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onError(C91304ZsS errorCode) {
        o.LJIIIZ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onLoadStateChanged(EnumC91305ZsT loadingState) {
        o.LJIIIZ(loadingState, "loadingState");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackStateChanged(EnumC91310ZsY currentState) {
        String str;
        C91367ZtT c91367ZtT;
        ArrayList<C91077Zon> arrayList;
        C91488ZvQ c91488ZvQ;
        InterfaceC91296ZsK LIZ;
        o.LJIIIZ(currentState, "currentState");
        C91395Ztv c91395Ztv = this.LJLJI;
        String str2 = null;
        if (c91395Ztv != null) {
            str = c91395Ztv.LJLJJL;
        } else {
            str = null;
        }
        AbstractC91590Zx4 playerController = getPlayerController();
        if (playerController != null && (LIZ = playerController.LIZ()) != null) {
            str2 = LIZ.getId();
        }
        if (o.LJ(str, str2) && currentState == EnumC91310ZsY.PLAYBACK_STATE_STOPPED && (c91367ZtT = this.LJLLLL) != null && (arrayList = c91367ZtT.LJLJI) != null && arrayList.size() > 0) {
            C91367ZtT c91367ZtT2 = this.LJLLLL;
            if (c91367ZtT2 != null && (c91488ZvQ = c91367ZtT2.LJLIL) != null) {
                c91488ZvQ.LIZIZ();
            }
            postDelayed(new IDRunnableS88S0100000_29(this, 3), 300L);
        }
    }

    @Override // X.InterfaceC91289ZsD
    public final void onPlaybackTimeChanged(long j) {
        C91395Ztv c91395Ztv;
        String str;
        String str2;
        Long l;
        InterfaceC91296ZsK LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onPlaybackTimeChanged ");
        LIZ2.append(j);
        X1D.LIZIZ(LIZ2);
        if (getVisibility() == 8 || (c91395Ztv = this.LJLJI) == null || (str = c91395Ztv.LJLJJL) == null) {
            return;
        }
        AbstractC91590Zx4 playerController = getPlayerController();
        Long l2 = null;
        if (playerController != null && (LIZ = playerController.LIZ()) != null) {
            str2 = LIZ.getId();
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            setVisibility(8);
            return;
        }
        if (this.LJLJLJ > j) {
            return;
        }
        this.LJLJLJ = -1L;
        Pair<Integer, Integer> pair = this.LJLLI;
        boolean z = false;
        if (pair != null) {
            if (((Integer) pair.first) != null) {
                l = Long.valueOf(r0.intValue());
            } else {
                l = null;
            }
            if (j >= l.longValue()) {
                if (((Integer) pair.second) != null) {
                    l2 = Long.valueOf(r0.intValue());
                }
                if (j <= l2.longValue()) {
                    if (getVisibility() != 0) {
                        z = true;
                    }
                }
            }
            setVisibility(4);
        }
        LJIIIIZZ(this, LIZIZ(j), z, 2);
    }

    @Override // X.InterfaceC91083Zot
    public void setConfig(C91084Zou config) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(config, "config");
        this.LJLJJLL = config;
        C91367ZtT c91367ZtT = this.LJLLLL;
        if (c91367ZtT != null) {
            c91367ZtT.LJLILLLLZI = config;
        }
        BaseLyricsViewModel baseLyricsViewModel = this.LJLILLLLZI;
        if (baseLyricsViewModel != null) {
            baseLyricsViewModel.jv0(config);
        }
        C91542ZwI c91542ZwI = this.LJLLJ;
        ViewGroup.LayoutParams layoutParams = null;
        if (c91542ZwI != null) {
            c91542ZwI.getLayoutParams().width = this.LJLJJLL.LIZIZ();
            c91542ZwI.setDisableTouchScroll(this.LJLJJLL.LJIILIIL);
            this.LJLJJLL.getClass();
            c91542ZwI.setOnDispatchTouchEventListener(null);
        }
        C91109ZpJ c91109ZpJ = this.LJLLILLLL;
        if (c91109ZpJ != null) {
            layoutParams = c91109ZpJ.getLayoutParams();
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        marginLayoutParams.topMargin = this.LJLJJLL.LJIIJ;
    }

    public final void setItemClickListener$music_dsp_release(View.OnClickListener onClickListener) {
        this.LJLLLLLL = onClickListener;
        C91367ZtT c91367ZtT = this.LJLLLL;
        if (c91367ZtT != null) {
            c91367ZtT.LJLJJI = onClickListener;
        }
    }

    public final void setLyricsInfo(ArrayList<C91077Zon> arrayList) {
        C91367ZtT c91367ZtT = this.LJLLLL;
        int i = 0;
        if (c91367ZtT != null) {
            c91367ZtT.LJLJI.clear();
            if (arrayList != null && arrayList.size() > 0 && arrayList != null) {
                c91367ZtT.LJLJI.addAll(arrayList);
            }
            c91367ZtT.notifyDataSetChanged();
        }
        if (arrayList != null && arrayList.size() > 0) {
            AbstractC91590Zx4 playerController = getPlayerController();
            long j = 0;
            if (playerController != null) {
                C91330Zss c91330Zss = playerController.LJLILLLLZI.LJLJI.LJLILLLLZI;
                if (c91330Zss.LJII()) {
                    C91061ZoX LJIIL = c91330Zss.LJIIL();
                    if (LJIIL.LIZIZ) {
                        j = LJIIL.LIZIZ().LJIJ();
                    }
                }
            }
            Integer LIZIZ = LIZIZ(j);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            }
            LJII(i);
        }
    }

    public final void setMAdapter(C91367ZtT c91367ZtT) {
        this.LJLLLL = c91367ZtT;
    }

    public final void setMLyricsRlv(C91542ZwI c91542ZwI) {
        this.LJLLJ = c91542ZwI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPlayPage(InterfaceC91281Zs5 playPage) {
        Fragment fragment;
        o.LJIIIZ(playPage, "playPage");
        if (!(playPage instanceof Fragment) || (fragment = (Fragment) playPage) == null || fragment.mo49getActivity() == null) {
            return;
        }
        AbstractC91590Zx4 playerController = playPage.getPlayerController();
        boolean D9 = playPage.D9();
        this.LJLJJI = playerController;
        this.LJLJJL = D9;
        this.LJLILLLLZI = (BaseLyricsViewModel) ViewModelProviders.of((Fragment) playPage).get(getViewModelClass());
        LJFF();
    }

    public final void LIZ(Integer num, boolean z) {
        C91488ZvQ c91488ZvQ;
        KeyEvent.Callback callback;
        if (num == null || o.LJ(this.LJLJL, num)) {
            return;
        }
        C91367ZtT c91367ZtT = this.LJLLLL;
        C91488ZvQ c91488ZvQ2 = null;
        if (c91367ZtT != null) {
            c91488ZvQ = c91367ZtT.LJLIL;
        } else {
            c91488ZvQ = null;
        }
        C0A2 c0a2 = this.LJLLL;
        if (c0a2 != null) {
            callback = c0a2.LJJIJIL(num.intValue());
        } else {
            callback = null;
        }
        if (callback instanceof C91488ZvQ) {
            c91488ZvQ2 = (C91488ZvQ) callback;
        }
        C91395Ztv c91395Ztv = this.LJLJI;
        if ((c91395Ztv == null || !c91395Ztv.LJLJJLL) && z) {
            setVisibility(0);
        }
        if (c91488ZvQ2 == null) {
            return;
        }
        this.LJLJL = num;
        if (c91488ZvQ2.getVisibility() != 0) {
            c91488ZvQ2.setVisibility(0);
        }
        if (z) {
            setVisibility(0);
            if (c91488ZvQ != null) {
                c91488ZvQ.setVisibility(8);
            }
            c91488ZvQ2.LIZ();
        } else {
            if (c91488ZvQ != null) {
                c91488ZvQ.LIZIZ();
            }
            c91488ZvQ2.LIZ();
        }
        C91367ZtT c91367ZtT2 = this.LJLLLL;
        if (c91367ZtT2 == null) {
            return;
        }
        c91367ZtT2.LJLIL = c91488ZvQ2;
    }

    @Override // X.InterfaceC91291ZsF
    public final void a50(C91299ZsN c91299ZsN, InterfaceC91296ZsK playable) {
        o.LJIIIZ(playable, "playable");
    }

    @Override // X.InterfaceC91289ZsD
    public final void onSeekStateChanged(EnumC91311ZsZ seekState, long j) {
        o.LJIIIZ(seekState, "seekState");
        if (seekState == EnumC91311ZsZ.SEEKING) {
            this.LJLJLLL = true;
            return;
        }
        if (seekState != EnumC91311ZsZ.SEEK_SUCCESS) {
            return;
        }
        long j2 = this.LJLJLJ;
        int i = 0;
        long j3 = 0;
        if (j2 >= 0) {
            LIZ(LIZIZ(j2), false);
            return;
        }
        this.LJLJLLL = false;
        AbstractC91590Zx4 playerController = getPlayerController();
        if (playerController != null) {
            C91330Zss c91330Zss = playerController.LJLILLLLZI.LJLJI.LJLILLLLZI;
            if (c91330Zss.LJII()) {
                C91061ZoX LJIIL = c91330Zss.LJIIL();
                if (LJIIL.LIZIZ) {
                    j3 = LJIIL.LIZIZ().LJIJ();
                }
            }
        }
        Integer LIZIZ = LIZIZ(j3);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        }
        LJII(i);
    }

    public static void LJIIIIZZ(AbstractC91339Zt1 abstractC91339Zt1, Integer num, boolean z, int i) {
        boolean z2;
        Integer LIZJ;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC91339Zt1.getClass();
        if (num != null) {
            num.intValue();
            if (abstractC91339Zt1.LJLJLLL || (LIZJ = abstractC91339Zt1.LIZJ(num.intValue())) == null) {
                return;
            }
            int intValue = LIZJ.intValue();
            if (z2) {
                abstractC91339Zt1.LIZ(num, z);
            }
            C91542ZwI c91542ZwI = abstractC91339Zt1.LJLLJ;
            if (c91542ZwI == null) {
                return;
            }
            c91542ZwI.LJLIIIL(0, intValue);
        }
    }
}
