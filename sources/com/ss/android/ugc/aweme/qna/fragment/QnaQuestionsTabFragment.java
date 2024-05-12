package com.ss.android.ugc.aweme.qna.fragment;

import X.AbstractC030109x;
import X.ActivityC45651qj;
import X.AnonymousClass982;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C2317597r;
import X.C29S;
import X.C33Q;
import X.C38350F3i;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73969T1h;
import X.C74100T6i;
import X.C74101T6j;
import X.C74102T6k;
import X.C74134T7q;
import X.C74135T7r;
import X.C74140T7w;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.ECY;
import X.GE5;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.RBX;
import X.T16;
import X.T71;
import X.T7B;
import X.T7C;
import X.T7E;
import X.TBT;
import X.TBW;
import Y.ACListenerS32S0100000_12;
import Y.AfS0S1120000_12;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationSharedViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaNavigationViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaQuestionsTabViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QnaQuestionsTabFragment extends BaseQnaTabFragment implements KPL {
    public static final /* synthetic */ int LJLLLL = 0;
    public View LJLJJI;
    public C74135T7r LJLJJL;
    public C74140T7w LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public QnaQuestionsTabViewModel LJLJLLL;
    public QnaNavigationViewModel LJLL;
    public final C214298b3 LJLLI;
    public final C214298b3 LJLLILLLL;
    public final C214378bB LJLLJ;
    public final Map<Integer, View> LJLLL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
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

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment
    public final String wl() {
        return "questions";
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment
    public final int xl() {
        return R.string.po2;
    }

    public QnaQuestionsTabFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        AqS60S0110000_3 LJJ;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(QnaBannerViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 764);
        T71 t71 = T71.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), t71, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), t71, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLI = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(QnaSelectedPageViewModel.class);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(LIZ2, 765);
        C2317597r c2317597r = C2317597r.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(aqS154S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c2317597r, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b32 = new C214298b3(aqS154S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c2317597r, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLILLLL = c214298b32;
        C65776Prg LIZ3 = C65352Pkq.LIZ(QnaCreationSharedViewModel.class);
        AnonymousClass982 anonymousClass982 = AnonymousClass982.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLLJ = new C214378bB(LIZ3, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, anonymousClass982, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    public final void Jl() {
        String secUserId;
        String userId = this.LJLILLLLZI;
        if (userId != null) {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (Ml()) {
                userId = ((RBX) LJIILL).getCurUserId();
            }
            RBX rbx = (RBX) LJIILL;
            if (Ml()) {
                secUserId = rbx.getCurSecUserId();
            } else {
                secUserId = rbx.getLastRecordedSecUid();
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.LJLJLLL;
            if (qnaQuestionsTabViewModel != null) {
                o.LJIIIIZZ(userId, "userId");
                o.LJIIIIZZ(secUserId, "secUserId");
                String str = this.LJLJL;
                boolean z = this.LJLJLJ;
                boolean Ml = Ml();
                T7B t7b = qnaQuestionsTabViewModel.LJLJL;
                t7b.getClass();
                QnaApiV2.LIZ.getClass();
                t7b.LJIILIIL.LIZ(ECY.LIZIZ().getQuestionsTabData(C38350F3i.LJJIZ(userId), t7b.LJIIJJI, 0, secUserId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new T7C(t7b, str, z, Ml), new AfS0S1120000_12(t7b, str, z, Ml, 0)));
            }
        }
    }

    public final void Kl() {
        String secUserId;
        String userId = this.LJLILLLLZI;
        if (userId != null) {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (Ml()) {
                userId = ((RBX) LJIILL).getCurUserId();
            }
            RBX rbx = (RBX) LJIILL;
            if (Ml()) {
                secUserId = rbx.getCurSecUserId();
            } else {
                secUserId = rbx.getLastRecordedSecUid();
            }
            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.LJLJLLL;
            if (qnaQuestionsTabViewModel != null) {
                o.LJIIIIZZ(userId, "userId");
                o.LJIIIIZZ(secUserId, "secUserId");
                String str = this.LJLJL;
                boolean z = this.LJLJLJ;
                boolean Ml = Ml();
                T7B t7b = qnaQuestionsTabViewModel.LJLJL;
                t7b.getClass();
                if (t7b.LJIILL.get()) {
                    return;
                }
                t7b.LJIILL.set(true);
                QnaApiV2.LIZ.getClass();
                t7b.LJIILIIL.LIZ(ECY.LIZIZ().getQuestionsTabData(C38350F3i.LJJIZ(userId), t7b.LJIIJJI, t7b.LJIIL, secUserId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S1120000_12(t7b, str, z, Ml, 1), new AfS0S1120000_12(t7b, str, z, Ml, 2)));
            }
        }
    }

    public final View Ll() {
        View view = this.LJLJJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("questionsTabLayout");
        throw null;
    }

    public final boolean Ml() {
        return TextUtils.equals(this.LJLILLLLZI, HG3.LJIILL().getCurUserId());
    }

    public final void Nl() {
        if (this.LJLJLLL != null) {
            Kl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GE5.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Button button;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData<C74100T6i<T7E>> mutableLiveData5;
        MutableLiveData mutableLiveData6;
        MutableLiveData mutableLiveData7;
        MutableLiveData mutableLiveData8;
        MutableLiveData mutableLiveData9;
        MutableLiveData mutableLiveData10;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 139));
        ((C73305Spp) Ll().findViewById(R.id.iia)).LJFF();
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        this.LJLJLLL = (QnaQuestionsTabViewModel) new ViewModelProvider(requireActivity).get(QnaQuestionsTabViewModel.class);
        this.LJLL = (QnaNavigationViewModel) ViewModelProviders.of(requireActivity()).get(QnaNavigationViewModel.class);
        View Ll = Ll();
        o.LJIIIIZZ(requireContext(), "requireContext()");
        View findViewById = Ll.findViewById(R.id.ikj);
        o.LJIIIIZZ(findViewById, "answersTabLayout.findVie…w>(R.id.questions_tab_rv)");
        C74140T7w c74140T7w = (C74140T7w) findViewById;
        this.LJLJJLL = c74140T7w;
        AbstractC030109x itemAnimator = c74140T7w.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJFF = 0L;
        }
        this.LJLJJL = new C74135T7r(new C74102T6k(this.LJLJLLL, this.LJLL));
        C74140T7w c74140T7w2 = this.LJLJJLL;
        if (c74140T7w2 != null) {
            c74140T7w2.setLayoutManager(new LinearLayoutManager());
            C74140T7w c74140T7w3 = this.LJLJJLL;
            if (c74140T7w3 != null) {
                C74135T7r c74135T7r = this.LJLJJL;
                if (c74135T7r != null) {
                    c74140T7w3.setAdapter(c74135T7r);
                    C74140T7w c74140T7w4 = this.LJLJJLL;
                    if (c74140T7w4 != null) {
                        C74135T7r c74135T7r2 = this.LJLJJL;
                        if (c74135T7r2 != null) {
                            c74140T7w4.LJIIJJI(new C74134T7q(c74140T7w4, c74135T7r2, new AqS162S0100000_12(this, 36)));
                            C8YN.LJII(this, (AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.Sgq
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((E86) obj).LJLJJI;
                                }
                            }, null, new AqS186S0100000_4(this, 5), 6);
                            C8YN.LJII(this, this.LJLLILLLL.getValue(), new TBT() { // from class: X.93k
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C2306293i) obj).LJLIL;
                                }
                            }, null, new AqS186S0100000_4(this, 6), 6);
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel != null && (mutableLiveData10 = qnaQuestionsTabViewModel.LJLJLJ) != null) {
                                mutableLiveData10.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 45)));
                            }
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel2 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel2 != null && (mutableLiveData9 = qnaQuestionsTabViewModel2.LJLJLLL) != null) {
                                mutableLiveData9.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 47)));
                            }
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel3 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel3 != null && (mutableLiveData8 = qnaQuestionsTabViewModel3.LJLILLLLZI) != null) {
                                mutableLiveData8.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 48)));
                            }
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel4 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel4 != null && (mutableLiveData7 = qnaQuestionsTabViewModel4.LJLJJI) != null) {
                                mutableLiveData7.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 50)));
                            }
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel5 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel5 != null && (mutableLiveData6 = qnaQuestionsTabViewModel5.LJLJJLL) != null) {
                                mutableLiveData6.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 52)));
                            }
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel6 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel6 != null && (mutableLiveData5 = qnaQuestionsTabViewModel6.LJLLL) != null) {
                                mutableLiveData5.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 29)));
                            }
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel7 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel7 != null && (mutableLiveData4 = qnaQuestionsTabViewModel7.LJLLLLLL) != null) {
                                mutableLiveData4.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 31)));
                            }
                            C8YN.LJII(this, (AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.Sgs
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((E86) obj).LJLJL;
                                }
                            }, C213688a4.LIZJ(), new AqS194S0100000_12(this, 7), 4);
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel8 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel8 != null && (mutableLiveData3 = qnaQuestionsTabViewModel8.LJLLI) != null) {
                                mutableLiveData3.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 35)));
                            }
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel9 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel9 != null && (mutableLiveData2 = qnaQuestionsTabViewModel9.LJLLILLLL) != null) {
                                mutableLiveData2.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 37)));
                            }
                            C8YN.LJII(this, this.LJLLJ.getValue(), new TBT() { // from class: X.T75
                                @Override // X.TBT, X.TBZ, X.TBW
                                public final Object get(Object obj) {
                                    return ((C74117T6z) obj).LJLIL;
                                }
                            }, null, new AqS194S0100000_12(this, 5), 6);
                            QnaQuestionsTabViewModel qnaQuestionsTabViewModel10 = this.LJLJLLL;
                            if (qnaQuestionsTabViewModel10 != null && (mutableLiveData = qnaQuestionsTabViewModel10.LJLL) != null) {
                                mutableLiveData.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 28)));
                            }
                            if (e1.LIZ(31744, "public_qna_analytics_tab", true, false) && (button = (Button) Ll().findViewById(R.id.d96)) != null) {
                                button.setVisibility(0);
                                C16880lQ.LJIILIIL(button, new ACListenerS32S0100000_12(this, 77));
                                return;
                            }
                            return;
                        }
                        o.LJIJI("questionsTabAdapter");
                        throw null;
                    }
                    o.LJIJI("rv");
                    throw null;
                }
                o.LJIJI("questionsTabAdapter");
                throw null;
            }
            o.LJIJI("rv");
            throw null;
        }
        o.LJIJI("rv");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        this.LJLJJI = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.c_6, viewGroup, false, "inflater.inflate(R.layou…stions, container, false)");
        View Ll = Ll();
        try {
            ViewTreeLifecycleOwner.set(Ll, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(Ll, this);
            C10A.LIZIZ(Ll, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return Ll;
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

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
