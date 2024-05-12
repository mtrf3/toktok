package com.ss.android.ugc.aweme.homepage.ui.slide;

import X.C16880lQ;
import X.C221018lt;
import X.C221108m2;
import X.C32I;
import X.C47261Igj;
import X.C51647KOt;
import X.C53962LFu;
import X.C54133LMj;
import X.C62822Ol8;
import X.C78613UtF;
import X.HG3;
import X.InterfaceC54080LKi;
import X.InterfaceC54434LXy;
import X.LKJ;
import X.LNC;
import X.ORZ;
import X.RBX;
import X.X1D;
import X.XIC;
import X.XKQ;
import X.XKW;
import X.XKX;
import android.os.Looper;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.hox.Hox;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SlideGuideViewModel extends ViewModel implements InterfaceC54434LXy {
    public static Boolean LJZ;
    public final LKJ LJLIL;
    public final HomePageDataViewModel LJLILLLLZI;
    public final XKW LJLJI;
    public final C62822Ol8 LJLJJI;
    public final NextLiveData LJLJJL;
    public final NextLiveData LJLJJLL;
    public final NextLiveData LJLJL;
    public final NextLiveData LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public XKQ LJLLI;
    public XKQ LJLLILLLL;
    public Boolean LJLLJ;
    public boolean LJLLL;
    public Boolean LJLLLL;
    public final List<String> LJLLLLLL;
    public final List<String> LJLZ;

    static {
        new C54133LMj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC54434LXy
    public final void Wt0(boolean z) {
        this.LJLLJ = Boolean.valueOf(!z);
        Boolean bool = (Boolean) this.LJLJLJ.getValue();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        if (o.LJ(this.LJLLLL, Boolean.TRUE) && !booleanValue && o.LJ(this.LJLL, "Following")) {
            iv0(0L, "Following");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0013. Please report as an issue. */
    public final boolean hv0(String str) {
        boolean z;
        boolean z2;
        Aweme aweme = this.LJLILLLLZI.LJLJLLL;
        if (aweme != null && aweme.isAd()) {
            z = true;
        } else {
            z = false;
        }
        switch (str.hashCode()) {
            case -1525083535:
                if (str.equals("Following")) {
                    Boolean bool = this.LJLLJ;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = true;
                    }
                    if (!((RBX) HG3.LJIILL()).isLogin()) {
                        return false;
                    }
                    if (this.LJLIL.Oh() && !z2) {
                        return false;
                    }
                    if (z || z2) {
                        return true;
                    }
                    return false;
                }
                return z;
            case 2576150:
                if (str.equals("Shop")) {
                    return false;
                }
                return z;
            case 2587369:
                if (str.equals("Stem")) {
                    Keva repo = Keva.getRepo("slide_mask_guide_repo");
                    Boolean bool2 = LJZ;
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    if (repo.contains("tab_first_enter_done")) {
                        LJZ = Boolean.FALSE;
                        return false;
                    }
                    repo.storeBoolean("tab_first_enter_done", true);
                    LJZ = Boolean.FALSE;
                    return true;
                }
                return z;
            case 1442906357:
                if (str.equals("MUSIC_DSP_XTAB")) {
                    return ((IMusicDspService) this.LJLJJI.getValue()).LJIIJJI();
                }
                return z;
            default:
                return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC54434LXy
    public final void qX(boolean z) {
        this.LJLLJ = Boolean.valueOf(!z);
        Boolean bool = (Boolean) this.LJLJLJ.getValue();
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        if (o.LJ(this.LJLLLL, Boolean.TRUE) && !booleanValue && o.LJ(this.LJLL, "Following")) {
            iv0(0L, "Following");
        }
    }

    @Override // X.InterfaceC54434LXy
    public final void setVisible(boolean z) {
        T value = this.LJLJLJ.getValue();
        Boolean bool = Boolean.FALSE;
        if (o.LJ(value, bool)) {
            return;
        }
        gv0(this.LJLJL, bool);
        XKQ xkq = this.LJLLILLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
    }

    public static void gv0(MutableLiveData mutableLiveData, Object obj) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    public final void iv0(long j, String str) {
        if (hv0(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(" is avoid show");
            C221018lt.LJFF("SlideGuide", X1D.LIZIZ(LIZ));
            return;
        }
        this.LJLLI = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), this.LJLJI, null, new LNC(false, j, str, this, null), 2);
    }

    public SlideGuideViewModel(Hox hox, HomeTabViewModel homeTabViewModel, LKJ followFeedVM, HomePageDataViewModel dataViewModel) {
        XIC dispatcher = C78613UtF.LIZ;
        o.LJIIIZ(homeTabViewModel, "homeTabViewModel");
        o.LJIIIZ(followFeedVM, "followFeedVM");
        o.LJIIIZ(dataViewModel, "dataViewModel");
        o.LJIIIZ(dispatcher, "dispatcher");
        this.LJLIL = followFeedVM;
        this.LJLILLLLZI = dataViewModel;
        this.LJLJI = dispatcher;
        this.LJLJJI = C221108m2.LIZIZ(C51647KOt.LJLIL);
        NextLiveData nextLiveData = new NextLiveData();
        this.LJLJJL = nextLiveData;
        this.LJLJJLL = nextLiveData;
        NextLiveData nextLiveData2 = new NextLiveData();
        this.LJLJL = nextLiveData2;
        this.LJLJLJ = nextLiveData2;
        this.LJLL = "For You";
        List LLJI = ORZ.LLJI(homeTabViewModel.pU());
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        Iterator it = LLJI.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC54080LKi) it.next()).tag());
        }
        this.LJLLLLLL = ORZ.LLJILJILJ(arrayList);
        this.LJLZ = C47261Igj.LJJIJ("Stem");
        hox.hv0("HOME", new C53962LFu(new AqS175S0100000_9(this, 489)));
    }
}
