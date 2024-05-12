package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.AF9;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C175216uD;
import X.C177056xB;
import X.C184077Kh;
import X.C184387Lm;
import X.C187197Wh;
import X.C200247tU;
import X.C200257tV;
import X.C200267tW;
import X.C200277tX;
import X.C200307ta;
import X.C200987ug;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C224748ru;
import X.C26045AKb;
import X.C2K0;
import X.C36922EeM;
import X.C44498HdG;
import X.C45804HyK;
import X.C50420Jqa;
import X.C52535Kjb;
import X.C55096Ljo;
import X.C57434MgQ;
import X.C58522Rk;
import X.C62905OmT;
import X.C62906OmU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C78996UzQ;
import X.C7AY;
import X.C80S;
import X.C86641XzR;
import X.C8W0;
import X.C8YN;
import X.EnumC177736yH;
import X.InterfaceC174146sU;
import X.InterfaceC203737z7;
import X.InterfaceC55102Lju;
import X.InterfaceC65784Pro;
import X.InterfaceC72642tA;
import X.InterfaceC86642XzS;
import X.OQA;
import X.TBT;
import Y.ACListenerS38S0200000_3;
import Y.AObserverS71S0100000_3;
import Y.IDCListenerS157S0100000_3;
import Y.IDCListenerS47S0200000_3;
import Y.IDTListenerS113S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageBottomActionBarAssem;
import com.ss.android.ugc.aweme.fullpagev3.scope.FullPageBottomActionBarAbility;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeCommentViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeContainerViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeFavoriteViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeShareViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class FullPageBottomActionBarAssem extends BaseFullPageAssem implements InterfaceC86642XzS, InterfaceC174146sU, InterfaceC72642tA, InterfaceC203737z7, FullPageBottomActionBarAbility, InterfaceC55102Lju {
    public final C214378bB LJLJJI;
    public final C214378bB LJLJJL;
    public final C214378bB LJLJJLL;
    public final C214378bB LJLJL;
    public boolean LJLJLJ;
    public C62906OmU LJLJLLL;
    public boolean LJLL;
    public C86641XzR LJLLI;
    public C187197Wh LJLLILLLL;
    public C7AY LJLLJ;

    @Override // com.ss.android.ugc.aweme.fullpagev3.scope.FullPageBottomActionBarAbility
    public final FullPageBottomActionBarAssem pQ() {
        return this;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1292524735) {
            return null;
        }
        return this;
    }

    @Override // X.InterfaceC174146sU
    public final void x() {
    }

    public FullPageBottomActionBarAssem() {
        InterfaceC65784Pro LJIILJJIL;
        InterfaceC65784Pro LJIILJJIL2;
        InterfaceC65784Pro LJIILJJIL3;
        InterfaceC65784Pro LJIILJJIL4;
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(PostDiggViewModel.class);
        C200247tU c200247tU = C200247tU.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 420);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        AqS60S0110000_3 LJIIZILJ = C78926UyI.LJIIZILJ(this, true);
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLJJI = new C214378bB(LIZ, null, c214528bQ, LJJII, c184077Kh, c200247tU, LJIILJJIL, LJIIZILJ);
        C65776Prg LIZ2 = C65352Pkq.LIZ(PostModeFavoriteViewModel.class);
        C200277tX c200277tX = C200277tX.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL2 = new AqS153S0100000_3((C8W0) this, 421);
        } else {
            LJIILJJIL2 = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJL = new C214378bB(LIZ2, null, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c200277tX, LJIILJJIL2, C78926UyI.LJIIZILJ(this, true));
        C65776Prg LIZ3 = C65352Pkq.LIZ(PostModeCommentViewModel.class);
        C200257tV c200257tV = C200257tV.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL3 = new AqS153S0100000_3((C8W0) this, 422);
        } else {
            LJIILJJIL3 = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJLL = new C214378bB(LIZ3, null, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c200257tV, LJIILJJIL3, C78926UyI.LJIIZILJ(this, true));
        C65776Prg LIZ4 = C65352Pkq.LIZ(PostModeShareViewModel.class);
        C200267tW c200267tW = C200267tW.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL4 = new AqS153S0100000_3((C8W0) this, 423);
        } else {
            LJIILJJIL4 = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJL = new C214378bB(LIZ4, null, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c200267tW, LJIILJJIL4, C78926UyI.LJIIZILJ(this, true));
    }

    public final PostDiggViewModel E3() {
        return (PostDiggViewModel) this.LJLJJI.getValue();
    }

    public final PostModeFavoriteViewModel F3() {
        return (PostModeFavoriteViewModel) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC86642XzS
    public final void Z2() {
        ActivityC45651qj LIZ;
        Fragment LJJJIL;
        if (this.LJLL || (LIZ = C212428Vi.LIZ(this)) == null || (LJJJIL = LIZ.getSupportFragmentManager().LJJJIL("PostModeDetailFragment")) == null) {
            return;
        }
        this.LJLL = true;
        ((PostModeShareViewModel) this.LJLJL.getValue()).gv0(LIZ, LJJJIL, new InterfaceC72642tA<C50420Jqa>(this) { // from class: X.7Lf
            public final WeakReference<FullPageBottomActionBarAssem> LJLIL;

            {
                o.LJIIIZ(this, "fullPageBottomActionBarAssem");
                this.LJLIL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC72642tA
            public final void onInternalEvent(C50420Jqa c50420Jqa) {
                C50420Jqa c50420Jqa2 = c50420Jqa;
                FullPageBottomActionBarAssem fullPageBottomActionBarAssem = this.LJLIL.get();
                if (fullPageBottomActionBarAssem != null) {
                    fullPageBottomActionBarAssem.onInternalEvent(c50420Jqa2);
                }
            }
        }, A3().getPostModeDetailParams());
        PostModeContainerViewModel v3 = v3();
        if (v3 != null) {
            v3.jv0(true);
        }
    }

    @Override // X.InterfaceC86642XzS
    public final void B0() {
        F3().iv0(getContainerView(), this);
    }

    public final void C3() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String charSequence = C184387Lm.LIZLLL(context, A3().getAweme()).toString();
        PostModeContainerViewModel v3 = v3();
        if (v3 != null) {
            v3.kv0(charSequence);
        }
    }

    public final void I3() {
        C187197Wh c187197Wh;
        Context context;
        Aweme aweme = A3().getAweme();
        if (aweme == null) {
            return;
        }
        if ((aweme.getStatus() != null && !aweme.getStatus().isPrivate()) || this.LJLJLJ || (c187197Wh = this.LJLLILLLL) == null) {
            return;
        }
        c187197Wh.LJJIII(aweme);
        if (C78996UzQ.LJJIIZI(aweme) && this.LJLJLLL == null && (context = getContext()) != null) {
            C62905OmT c62905OmT = new C62905OmT(context);
            c62905OmT.LIZ(R.string.pau);
            c62905OmT.LJIIIIZZ(R.string.cg_, new IDCListenerS157S0100000_3(aweme, 2), false);
            c62905OmT.LJIIJJI(R.string.hp2, new IDCListenerS47S0200000_3(this, aweme, 5), false);
            c62905OmT.LIZJ(new AqS169S0100000_3(this, 795));
            this.LJLJLLL = new C62906OmU(c62905OmT);
        }
        C62906OmU c62906OmU = this.LJLJLLL;
        if (c62906OmU != null) {
            c62906OmU.LIZLLL();
        }
        this.LJLJLJ = true;
    }

    @Override // X.InterfaceC86642XzS
    public final void LJJZZIII() {
        E3().kv0(new AqS185S0100000_3(this, 51));
    }

    @Override // X.InterfaceC86642XzS
    public final void LJLJJL() {
        if (C80S.LJFF(A3().getAweme())) {
            I3();
            return;
        }
        if (C184387Lm.LJI(A3().getAweme())) {
            C3();
        }
        PostModeContainerViewModel v3 = v3();
        if (v3 != null) {
            v3.LJLJJL.setValue(C76800UCe.LIZ);
        }
    }

    @Override // X.InterfaceC86642XzS
    public final void c() {
        Aweme aweme = A3().getAweme();
        if (aweme != null) {
            boolean isCollected = aweme.isCollected();
            C86641XzR c86641XzR = this.LJLLI;
            if (c86641XzR != null) {
                c86641XzR.LJJZZI(isCollected);
            } else {
                o.LJIJI("actionBarView");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC203737z7
    public final void ix() {
        if (!C52535Kjb.LIZ()) {
            F3().jv0();
        }
        C86641XzR c86641XzR = this.LJLLI;
        if (c86641XzR != null) {
            c86641XzR.LJJZ();
        } else {
            o.LJIJI("actionBarView");
            throw null;
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.InterfaceC203737z7
    public final void aB(Exception exc) {
        C36922EeM.LJFF(exc);
        C86641XzR c86641XzR = this.LJLLI;
        if (c86641XzR != null) {
            c86641XzR.LJJZZI(false);
            C86641XzR c86641XzR2 = this.LJLLI;
            if (c86641XzR2 != null) {
                c86641XzR2.LJJZ();
                return;
            } else {
                o.LJIJI("actionBarView");
                throw null;
            }
        }
        o.LJIJI("actionBarView");
        throw null;
    }

    @Override // X.InterfaceC203737z7
    public final void gd(String str) {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.InterfaceC72642tA
    public final void onInternalEvent(C50420Jqa c50420Jqa) {
        Context context;
        String str;
        String str2;
        Activity LJIJJ;
        C200987ug postModeNavigator;
        this.LJLL = false;
        PostModeContainerViewModel v3 = v3();
        if (v3 != null) {
            v3.jv0(false);
        }
        if (c50420Jqa == null || (context = getContext()) == null) {
            return;
        }
        int i = c50420Jqa.LJLIL;
        if (i != 1) {
            if (i != 55) {
                if (i != 56 || (postModeNavigator = A3().getPostModeNavigator()) == null) {
                    return;
                }
                postModeNavigator.LIZIZ();
                return;
            }
            C200987ug postModeNavigator2 = A3().getPostModeNavigator();
            if (postModeNavigator2 == null || (LJIJJ = C45804HyK.LJIJJ(postModeNavigator2.LIZJ)) == null) {
                return;
            }
            MixFeedService.LJJIJIIJIL().LJIIIIZZ(new C58522Rk(postModeNavigator2, LJIJJ));
            return;
        }
        Aweme aweme = A3().getAweme();
        if (aweme == null) {
            return;
        }
        PostModeDetailParams postModeDetailParams = A3().getPostModeDetailParams();
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        String str3 = c50420Jqa.LJLLL;
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        String str4 = "";
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (str3 == null) {
            str3 = "";
        }
        if (str != null) {
            str4 = str;
        }
        OQA.LIZJ(LIZ, aweme, str2, context, str3, str4, "graphic_detail", 128);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        LifecycleOwner LIZIZ;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        MutableLiveData mutableLiveData5;
        ViewGroup viewGroup;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        this.LJLLI = new C86641XzR(context, this);
        View containerView = getContainerView();
        String str = null;
        if ((containerView instanceof FrameLayout) && (viewGroup = (ViewGroup) containerView) != null) {
            C86641XzR c86641XzR = this.LJLLI;
            if (c86641XzR != null) {
                viewGroup.addView(c86641XzR);
            } else {
                o.LJIJI("actionBarView");
                throw null;
            }
        }
        C8YN.LJII(this, E3(), new TBT() { // from class: X.7th
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C200367tg) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 196), 6);
        E3().LJLJJL.LIZIZ(PostDiggViewModel.LJLLI[0], getContext());
        PostDiggViewModel E3 = E3();
        Aweme aweme = A3().getAweme();
        E3.LJLJLJ = aweme;
        E3.setState(new AqS134S0200000_3(E3, aweme, 203));
        ((PostModeCommentViewModel) this.LJLJJLL.getValue()).LJLILLLLZI.LIZIZ(PostModeCommentViewModel.LJLJI[0], getContext());
        PostModeCommentViewModel postModeCommentViewModel = (PostModeCommentViewModel) this.LJLJJLL.getValue();
        postModeCommentViewModel.LJLIL = A3().getAweme();
        postModeCommentViewModel.gv0(null);
        F3().LJLJJL.LIZIZ(PostModeFavoriteViewModel.LJLL[0], getContext());
        PostModeFavoriteViewModel F3 = F3();
        PostModeDetailParams postModeDetailParams = A3().getPostModeDetailParams();
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        }
        F3.LJLJL = str;
        PostModeFavoriteViewModel F32 = F3();
        Aweme aweme2 = A3().getAweme();
        if (aweme2 != null) {
            F32.LJLIL = aweme2;
            F32.setState(new AqS134S0200000_3(F32, aweme2, 204));
        } else {
            F32.getClass();
        }
        PostModeShareViewModel postModeShareViewModel = (PostModeShareViewModel) this.LJLJL.getValue();
        postModeShareViewModel.LJLIL = A3().getAweme();
        postModeShareViewModel.setState(new AqS169S0100000_3(postModeShareViewModel, 715));
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null || (LIZIZ = C57434MgQ.LIZIZ(LIZ)) == null) {
            return;
        }
        PostModeContainerViewModel v3 = v3();
        if (v3 != null && (mutableLiveData5 = v3.LJLLILLLL) != null) {
            mutableLiveData5.observe(LIZIZ, new AObserverS71S0100000_3(this, 56));
        }
        PostModeContainerViewModel v32 = v3();
        if (v32 != null && (mutableLiveData4 = v32.LLILL) != null) {
            mutableLiveData4.observe(LIZIZ, new AObserverS71S0100000_3(this, 57));
        }
        PostModeContainerViewModel v33 = v3();
        if (v33 != null && (mutableLiveData3 = v33.LLIIIJ) != null) {
            mutableLiveData3.observe(LIZIZ, new AObserverS71S0100000_3(this, 58));
        }
        PostModeContainerViewModel v34 = v3();
        if (v34 != null && (mutableLiveData2 = v34.LL) != null) {
            mutableLiveData2.observe(LIZIZ, new AObserverS71S0100000_3(this, 60));
        }
        PostModeContainerViewModel v35 = v3();
        if (v35 != null && (mutableLiveData = v35.LJZI) != null) {
            mutableLiveData.observe(LIZIZ, new AObserverS71S0100000_3(this, 62));
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJJLL.getValue(), new TBT() { // from class: X.7Ob
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C185047Oa) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 205), 6);
        C8YN.LJII(this, F3(), new TBT() { // from class: X.87g
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2061387d) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 207), 6);
        C8YN.LJII(this, F3(), new TBT() { // from class: X.87c
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2061387d) obj).LJLJI);
            }
        }, null, new AqS185S0100000_3(this, 200), 6);
        C8YN.LJII(this, (AssemViewModel) this.LJLJL.getValue(), new TBT() { // from class: X.7tY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C200227tS) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 202), 6);
    }

    @Override // X.InterfaceC174146sU
    public final void q(C175216uD c175216uD) {
        String str;
        String str2;
        String str3;
        MutableLiveData<Boolean> mutableLiveData;
        C7AY c7ay = c175216uD.LIZLLL;
        this.LJLLJ = c7ay;
        C86641XzR c86641XzR = this.LJLLI;
        if (c86641XzR != null) {
            C224748ru c224748ru = (C224748ru) c86641XzR.findViewById(R.id.hyw);
            Aweme aweme = A3().getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            PostModeDetailParams postModeDetailParams = A3().getPostModeDetailParams();
            if (postModeDetailParams != null) {
                str2 = postModeDetailParams.eventType;
            } else {
                str2 = null;
            }
            EnumC177736yH enumC177736yH = EnumC177736yH.POST_MODE;
            Aweme aweme2 = A3().getAweme();
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            } else {
                str3 = null;
            }
            c7ay.LIZIZ(new C177056xB((View) null, c224748ru, (TuxIconView) null, (TuxIconView) null, (TuxIconView) null, (TextView) null, str, str2, false, enumC177736yH, str3));
            if (a.LJ().LJ(3)) {
                C86641XzR c86641XzR2 = this.LJLLI;
                if (c86641XzR2 != null) {
                    c86641XzR2.findViewById(R.id.hyw).setEnabled(false);
                    C86641XzR c86641XzR3 = this.LJLLI;
                    if (c86641XzR3 != null) {
                        c86641XzR3.findViewById(R.id.hyo).setEnabled(false);
                    } else {
                        o.LJIJI("actionBarView");
                        throw null;
                    }
                } else {
                    o.LJIJI("actionBarView");
                    throw null;
                }
            } else if (C184387Lm.LJI(A3().getAweme())) {
                H3(new AqS153S0100000_3(this, 1548), true);
            } else if (C80S.LJFF(A3().getAweme())) {
                H3(new AqS153S0100000_3(this, 1549), false);
            }
            PostModeContainerViewModel v3 = v3();
            if (v3 != null && (mutableLiveData = v3.LLIIIL) != null) {
                mutableLiveData.observe(this, new AObserverS71S0100000_3(this, 24));
            }
            C187197Wh c187197Wh = new C187197Wh(C212428Vi.LIZ(this));
            this.LJLLILLLL = c187197Wh;
            c187197Wh.LJJ(new AF9());
            H3(C200307ta.LJLIL, false);
            return;
        }
        o.LJIJI("actionBarView");
        throw null;
    }

    public final void H3(InterfaceC65784Pro interfaceC65784Pro, boolean z) {
        C86641XzR c86641XzR = this.LJLLI;
        if (c86641XzR != null) {
            View findViewById = c86641XzR.findViewById(R.id.hyw);
            if (findViewById == null) {
                return;
            }
            C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, interfaceC65784Pro, 89), findViewById);
            if (z) {
                findViewById.setOnTouchListener(new IDTListenerS113S0100000_3(interfaceC65784Pro, 20));
                return;
            }
            return;
        }
        o.LJIJI("actionBarView");
        throw null;
    }
}
