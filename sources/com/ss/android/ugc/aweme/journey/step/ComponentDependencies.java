package com.ss.android.ugc.aweme.journey.step;

import X.AbstractC39351FcR;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C31968Cge;
import X.C40769FzJ;
import X.C40771FzL;
import X.C40776FzQ;
import X.C40777FzR;
import X.C40797Fzl;
import X.C40870G2g;
import X.C62822Ol8;
import X.C76800UCe;
import X.G13;
import X.G1L;
import X.G36;
import X.InterfaceC35877E6f;
import X.InterfaceC35879E6h;
import X.InterfaceC39169FYv;
import X.InterfaceC39170FYw;
import X.InterfaceC40778FzS;
import X.InterfaceC40779FzT;
import X.InterfaceC40780FzU;
import X.InterfaceC40781FzV;
import X.InterfaceC40782FzW;
import X.InterfaceC40793Fzh;
import X.InterfaceC40802Fzq;
import X.InterfaceC40803Fzr;
import X.InterfaceC40807Fzv;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeTrialPageInfo;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.PickYourAdPlanPage;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.ss.android.ugc.aweme.plugin.journey.NewUserJourneyStep;
import com.ss.android.ugc.aweme.plugin.journey.TopicInterestCategoryStruct;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ComponentDependencies extends ViewModel implements InterfaceC40803Fzr, InterfaceC40807Fzv, InterfaceC40793Fzh, InterfaceC40781FzV, InterfaceC39170FYw, InterfaceC40782FzW, InterfaceC40778FzS, G1L, InterfaceC40780FzU, InterfaceC40779FzT, InterfaceC39169FYv, InterfaceC40802Fzq, InterfaceC35877E6f, G13, InterfaceC35879E6h {
    public NewUserJourneyStep LJLIL;
    public AbstractC39351FcR LJLILLLLZI;
    public InterfaceC88472Yns<? super Fragment, C76800UCe> LJLJI;
    public InterfaceC88472Yns<? super Fragment, C76800UCe> LJLJJI;
    public PrivacyHighlightsForTeens LJLL;
    public String LJLLI;
    public C31968Cge LJLLILLLL;
    public List<NewUserInterestStruct> LJLLJ;
    public List<TopicInterestCategoryStruct> LJLLL;
    public PickYourAdPlanPage LJZ;
    public AdFreeTrialPageInfo LJZI;
    public boolean LJZL;
    public InterfaceC65784Pro<C76800UCe> LL;
    public G36 LLD;
    public boolean LLF;
    public C40870G2g LLFF;
    public int LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public InterfaceC65784Pro<C76800UCe> LLI;
    public InterfaceC65784Pro<? extends WeakReference<ActivityC45651qj>> LLIFFJFJJ;
    public InterfaceC65784Pro<C76800UCe> LLII;
    public InterfaceC88472Yns<? super Fragment, C76800UCe> LLIIII;
    public boolean LJLJJL = true;
    public long LJLJJLL = Long.MAX_VALUE;
    public InterfaceC65784Pro<C76800UCe> LJLJL = C40797Fzl.LJLIL;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C40777FzR.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C40776FzQ.LJLIL);
    public final AtomicBoolean LJLLLL = new AtomicBoolean(true);
    public final MutableLiveData<C40769FzJ> LJLLLLLL = new MutableLiveData<>();
    public InterfaceC65784Pro<? extends WeakReference<Context>> LJLZ = C40771FzL.LJLIL;

    @Override // X.G1L, X.InterfaceC40802Fzq
    public final G36 LLLLZIL() {
        return null;
    }

    @Override // X.InterfaceC40779FzT
    public final boolean K70() {
        if (this.LJLLJ == null && this.LJLLL == null) {
            return true;
        }
        return this.LJLLLL.get();
    }

    @Override // X.InterfaceC40793Fzh, X.InterfaceC40781FzV, X.InterfaceC39170FYw, X.InterfaceC40778FzS, X.G1L, X.InterfaceC40780FzU, X.InterfaceC40779FzT, X.InterfaceC40802Fzq
    public final InterfaceC88472Yns<Fragment, C76800UCe> LJIIZILJ() {
        InterfaceC88472Yns interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns;
        }
        o.LJIJI("transactionRunnable");
        throw null;
    }

    @Override // X.InterfaceC40803Fzr, X.InterfaceC40807Fzv, X.InterfaceC40782FzW, X.InterfaceC35877E6f, X.G13
    public final InterfaceC65784Pro<C76800UCe> LJJJJI() {
        o.LJIIIIZZ(Log.getStackTraceString(new RuntimeException("Not a real exception, next step calling stack")), "getStackTraceString(Runt…ext step calling stack\"))");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLII;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro;
        }
        o.LJIJI("nextStepRunnable");
        throw null;
    }

    @Override // X.InterfaceC40803Fzr, X.InterfaceC40807Fzv, X.InterfaceC40782FzW, X.G13
    public final InterfaceC65784Pro<WeakReference<ActivityC45651qj>> LJJLL() {
        InterfaceC65784Pro interfaceC65784Pro = this.LLIFFJFJJ;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro;
        }
        o.LJIJI("fragmentActivityProvider");
        throw null;
    }

    @Override // X.InterfaceC40807Fzv, X.InterfaceC40779FzT, X.InterfaceC39169FYv, X.InterfaceC40802Fzq
    public final AbstractC39351FcR LJLJJL() {
        AbstractC39351FcR abstractC39351FcR = this.LJLILLLLZI;
        if (abstractC39351FcR != null) {
            return abstractC39351FcR;
        }
        o.LJIJI("journeyStrategy");
        throw null;
    }

    @Override // X.G1L, X.InterfaceC40802Fzq
    public final G36 LLLLLIL() {
        G36 g36 = this.LLD;
        if (g36 != null) {
            return g36;
        }
        o.LJIJI("curI18nItem");
        throw null;
    }

    @Override // X.InterfaceC40782FzW
    public final boolean Uo0() {
        return ((AtomicBoolean) this.LJLJLJ.getValue()).get();
    }

    @Override // X.InterfaceC39170FYw, X.InterfaceC40782FzW
    public final boolean Y() {
        C40769FzJ value = this.LJLLLLLL.getValue();
        if (value != null) {
            return value.LJLIL;
        }
        return false;
    }

    @Override // X.InterfaceC39170FYw
    public final Intent cv() {
        C40769FzJ value = this.LJLLLLLL.getValue();
        if (value != null) {
            return value.LJLILLLLZI;
        }
        return null;
    }

    public final NewUserJourneyStep gv0() {
        NewUserJourneyStep newUserJourneyStep = this.LJLIL;
        if (newUserJourneyStep != null) {
            return newUserJourneyStep;
        }
        o.LJIJI("currentStep");
        throw null;
    }

    @Override // X.InterfaceC40807Fzv, X.G13
    public final InterfaceC88472Yns<Fragment, C76800UCe> j8() {
        o.LJIIIIZZ(Log.getStackTraceString(new RuntimeException("Not a real exception, replace fragment calling stack")), "getStackTraceString(Runt…fragment calling stack\"))");
        InterfaceC88472Yns interfaceC88472Yns = this.LLIIII;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns;
        }
        o.LJIJI("replaceFragmentRunnable");
        throw null;
    }

    @Override // X.InterfaceC39169FYv
    public final InterfaceC88472Yns<Fragment, C76800UCe> kH() {
        InterfaceC88472Yns interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            return interfaceC88472Yns;
        }
        o.LJIJI("noAnimationTransactionRunnable");
        throw null;
    }

    @Override // X.InterfaceC40807Fzv
    public final InterfaceC65784Pro<C76800UCe> lK() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LLI;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro;
        }
        o.LJIJI("skipToFinishBlock");
        throw null;
    }

    @Override // X.InterfaceC40779FzT
    public final boolean ur() {
        boolean z;
        List<TopicInterestCategoryStruct> list = this.LJLLL;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // X.InterfaceC40782FzW
    public final boolean vu() {
        return ((AtomicBoolean) this.LJLJLLL.getValue()).get();
    }

    @Override // X.G1L, X.InterfaceC40802Fzq
    public final InterfaceC65784Pro<C76800UCe> x1() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LL;
        if (interfaceC65784Pro != null) {
            return interfaceC65784Pro;
        }
        o.LJIJI("refreshFeedHandler");
        throw null;
    }

    @Override // X.InterfaceC35877E6f
    public final long Z1() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJLL;
        if (elapsedRealtime > 0) {
            return elapsedRealtime;
        }
        return 0L;
    }

    @Override // X.G13
    public final PickYourAdPlanPage Gr() {
        return this.LJZ;
    }

    @Override // X.G13
    public final boolean L40() {
        return this.LJZL;
    }

    @Override // X.G1L, X.InterfaceC40802Fzq
    public final boolean LLJJJIL() {
        return this.LLF;
    }

    @Override // X.InterfaceC40793Fzh
    public final boolean Ma() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC40778FzS
    public final C31968Cge R4() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC39169FYv
    public final boolean Uh0() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC40802Fzq
    public final InterfaceC65784Pro<WeakReference<Context>> ZC() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC40778FzS
    public final String a7() {
        return this.LJLLI;
    }

    @Override // X.G13
    public final AdFreeTrialPageInfo bp() {
        return this.LJZI;
    }

    @Override // X.InterfaceC40781FzV, X.InterfaceC40778FzS
    public final C40870G2g o0() {
        return this.LLFF;
    }

    @Override // X.InterfaceC39169FYv
    public final boolean uS() {
        return this.LLFII;
    }

    @Override // X.InterfaceC40780FzU
    public final PrivacyHighlightsForTeens wQ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC39169FYv
    public final int xL() {
        return this.LLFFF;
    }

    @Override // X.G13
    public final void DI(boolean z) {
        this.LJZL = z;
    }

    public final void hv0(List<NewUserInterestStruct> list) {
        synchronized (this) {
            this.LJLLJ = list;
        }
    }

    public final void iv0(List<TopicInterestCategoryStruct> list) {
        synchronized (this) {
            this.LJLLL = list;
        }
    }
}
