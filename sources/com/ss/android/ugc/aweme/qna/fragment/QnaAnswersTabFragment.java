package com.ss.android.ugc.aweme.qna.fragment;

import X.AbstractC030109x;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C2317397p;
import X.C29S;
import X.C33Q;
import X.C38350F3i;
import X.C3C5;
import X.C3C8;
import X.C42625Go9;
import X.C50420Jqa;
import X.C56412MCa;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73969T1h;
import X.C74100T6i;
import X.C74101T6j;
import X.C74102T6k;
import X.C74124T7g;
import X.C74125T7h;
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
import X.E86;
import X.ECY;
import X.GE1;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KKR;
import X.KPL;
import X.ORZ;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.RBX;
import X.T16;
import X.T70;
import X.T7A;
import X.T7E;
import X.TBT;
import X.TBW;
import Y.AfS64S0100000_12;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.qna.api.AnswerStruct;
import com.ss.android.ugc.aweme.qna.api.QnaApiV2;
import com.ss.android.ugc.aweme.qna.vm.QnaAnswersTabViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaNavigationViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QnaAnswersTabFragment extends BaseQnaTabFragment implements KPL {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public View LJLJJI;
    public C74135T7r LJLJJL;
    public String LJLJJLL;
    public QnaAnswersTabViewModel LJLJL;
    public QnaNavigationViewModel LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final C214298b3 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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
        return "answers";
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment
    public final int xl() {
        return R.string.po1;
    }

    public QnaAnswersTabFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(QnaBannerViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 762);
        T70 t70 = T70.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), t70, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), t70, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLLL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(QnaSelectedPageViewModel.class);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(LIZ2, 763);
        C2317397p c2317397p = C2317397p.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(aqS154S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c2317397p, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b32 = new C214298b3(aqS154S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c2317397p, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLL = c214298b32;
        C42625Go9.LIZIZ(this);
    }

    public final void Jl() {
        String secUserId;
        String userId = this.LJLILLLLZI;
        if (userId != null) {
            IAccountUserService LJIILL = HG3.LJIILL();
            if (Ll()) {
                userId = ((RBX) LJIILL).getCurUserId();
            }
            RBX rbx = (RBX) LJIILL;
            if (Ll()) {
                secUserId = rbx.getCurSecUserId();
            } else {
                secUserId = rbx.getLastRecordedSecUid();
            }
            QnaAnswersTabViewModel qnaAnswersTabViewModel = this.LJLJL;
            if (qnaAnswersTabViewModel != null) {
                o.LJIIIIZZ(userId, "userId");
                o.LJIIIIZZ(secUserId, "secUserId");
                T7A t7a = qnaAnswersTabViewModel.LJLJL;
                t7a.getClass();
                if (t7a.LJIIJJI.get()) {
                    return;
                }
                t7a.LJIIJJI.set(true);
                QnaApiV2.LIZ.getClass();
                t7a.LJIIIZ.LIZ(ECY.LIZIZ().getAnswersTabData(C38350F3i.LJJIZ(userId), t7a.LJII, t7a.LJIIIIZZ, secUserId).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(t7a, 94), new AfS64S0100000_12(t7a, 95)));
            }
        }
    }

    public final View Kl() {
        View view = this.LJLJJI;
        if (view != null) {
            return view;
        }
        o.LJIJI("answerTabLayout");
        throw null;
    }

    public final boolean Ll() {
        return TextUtils.equals(this.LJLILLLLZI, HG3.LJIILL().getCurUserId());
    }

    public final void Ml() {
        if (this.LJLJL != null) {
            Jl();
        }
    }

    public final void Nl(List<? extends C74125T7h> list) {
        boolean z;
        if (this.LJLJL != null) {
            Boolean bool = ((E86) ((AssemViewModel) this.LJLJLLL.getValue()).getState()).LJLJJI;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (!z) {
                List LLJILJILJ = ORZ.LLJILJILJ(list);
                ListProtector.add(LLJILJILJ, 0, new C74124T7g(this.LJLJJLL));
                C74135T7r c74135T7r = this.LJLJJL;
                if (c74135T7r != null) {
                    c74135T7r.submitList(LLJILJILJ);
                    return;
                } else {
                    o.LJIJI("answersTabAdapter");
                    throw null;
                }
            }
            C74135T7r c74135T7r2 = this.LJLJJL;
            if (c74135T7r2 != null) {
                c74135T7r2.submitList(list);
            } else {
                o.LJIJI("answersTabAdapter");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GE1.LJLIL);
    }

    @QD3
    public final void onVideoEvent(C50420Jqa event) {
        KKR kkr;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 2) {
            Object obj = event.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (AwemeService.LIZ().i6(str) != null) {
                QnaAnswersTabViewModel qnaAnswersTabViewModel = this.LJLJL;
                if (qnaAnswersTabViewModel != null) {
                    T7A t7a = qnaAnswersTabViewModel.LJLJL;
                    t7a.getClass();
                    synchronized (t7a.LJIIJ) {
                        Iterator it = ((ArrayList) t7a.LIZLLL).iterator();
                        Long l = null;
                        while (it.hasNext()) {
                            AnswerStruct answerStruct = (AnswerStruct) it.next();
                            Iterator<Aweme> it2 = answerStruct.answers.iterator();
                            while (it2.hasNext()) {
                                String aid = it2.next().getAid();
                                if (aid == null) {
                                    aid = null;
                                }
                                if (o.LJ(aid, str)) {
                                    l = Long.valueOf(answerStruct.questionId);
                                }
                            }
                        }
                        List<AnswerStruct> list = t7a.LIZLLL;
                        ArrayList arrayList = new ArrayList();
                        Iterator it3 = ((ArrayList) list).iterator();
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            long j = ((AnswerStruct) next).questionId;
                            if (l != null && j == l.longValue()) {
                            }
                            arrayList.add(next);
                        }
                        t7a.LIZLLL = ORZ.LLJILJILJ(arrayList);
                    }
                    t7a.LIZJ(C61878OQg.INSTANCE);
                    if (!((ArrayList) t7a.LIZLLL).isEmpty()) {
                        kkr = KKR.SUCCESS;
                    } else {
                        kkr = KKR.SUCCESS_EMPTY;
                    }
                    t7a.LIZJ.setValue(new C74100T6i<>(kkr));
                }
                String str2 = this.LJLILLLLZI;
                if (str2 != null) {
                    QnaBannerViewModel qnaBannerViewModel = (QnaBannerViewModel) this.LJLJLLL.getValue();
                    Long LJJIZ = C38350F3i.LJJIZ(str2);
                    String lastRecordedSecUid = ((RBX) HG3.LJIILL()).getLastRecordedSecUid();
                    o.LJIIIIZZ(lastRecordedSecUid, "userService().lastRecordedSecUid");
                    qnaBannerViewModel.gv0(LJJIZ, lastRecordedSecUid);
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData mutableLiveData;
        MutableLiveData<C74100T6i<T7E>> mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        MutableLiveData mutableLiveData7;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 138));
        ((C73305Spp) Kl().findViewById(R.id.iia)).LJFF();
        this.LJLJL = (QnaAnswersTabViewModel) new ViewModelProvider(this).get(QnaAnswersTabViewModel.class);
        this.LJLJLJ = (QnaNavigationViewModel) ViewModelProviders.of(requireActivity()).get(QnaNavigationViewModel.class);
        View Kl = Kl();
        o.LJIIIIZZ(requireContext(), "requireContext()");
        C74140T7w c74140T7w = (C74140T7w) Kl.findViewById(R.id.a6a);
        AbstractC030109x itemAnimator = c74140T7w.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJFF = 0L;
        }
        this.LJLJJL = new C74135T7r(new C74102T6k(this.LJLJL, this.LJLJLJ));
        c74140T7w.setLayoutManager(new LinearLayoutManager());
        C74135T7r c74135T7r = this.LJLJJL;
        if (c74135T7r != null) {
            c74140T7w.setAdapter(c74135T7r);
            C74135T7r c74135T7r2 = this.LJLJJL;
            if (c74135T7r2 != null) {
                c74140T7w.LJIIJJI(new C74134T7q(c74140T7w, c74135T7r2, new AqS162S0100000_12(this, 37)));
                QnaAnswersTabViewModel qnaAnswersTabViewModel = this.LJLJL;
                if (qnaAnswersTabViewModel != null && (mutableLiveData7 = qnaAnswersTabViewModel.LJLJLJ) != null) {
                    mutableLiveData7.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 32)));
                }
                QnaAnswersTabViewModel qnaAnswersTabViewModel2 = this.LJLJL;
                if (qnaAnswersTabViewModel2 != null && (mutableLiveData6 = qnaAnswersTabViewModel2.LJLJLLL) != null) {
                    mutableLiveData6.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 33)));
                }
                QnaAnswersTabViewModel qnaAnswersTabViewModel3 = this.LJLJL;
                if (qnaAnswersTabViewModel3 != null && (mutableLiveData5 = qnaAnswersTabViewModel3.LJLILLLLZI) != null) {
                    mutableLiveData5.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 34)));
                }
                QnaAnswersTabViewModel qnaAnswersTabViewModel4 = this.LJLJL;
                if (qnaAnswersTabViewModel4 != null && (mutableLiveData4 = qnaAnswersTabViewModel4.LJLJJI) != null) {
                    mutableLiveData4.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 36)));
                }
                QnaAnswersTabViewModel qnaAnswersTabViewModel5 = this.LJLJL;
                if (qnaAnswersTabViewModel5 != null && (mutableLiveData3 = qnaAnswersTabViewModel5.LJLJJLL) != null) {
                    mutableLiveData3.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 39)));
                }
                QnaAnswersTabViewModel qnaAnswersTabViewModel6 = this.LJLJL;
                if (qnaAnswersTabViewModel6 != null && (mutableLiveData2 = qnaAnswersTabViewModel6.LJLLI) != null) {
                    mutableLiveData2.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 41)));
                }
                QnaAnswersTabViewModel qnaAnswersTabViewModel7 = this.LJLJL;
                if (qnaAnswersTabViewModel7 != null && (mutableLiveData = qnaAnswersTabViewModel7.LJLLJ) != null) {
                    mutableLiveData.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 42)));
                }
                C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Sgt
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((E86) obj).LJLJL;
                    }
                }, C213688a4.LIZJ(), new AqS194S0100000_12(this, 10), 4);
                if (!Ll()) {
                    C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Sgp
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((E86) obj).LJLJJI;
                        }
                    }, null, new AqS194S0100000_12(this, 6), 6);
                }
                C8YN.LJII(this, this.LJLL.getValue(), new TBT() { // from class: X.93l
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C2306293i) obj).LJLIL;
                    }
                }, null, new AqS186S0100000_4(this, 188), 6);
                return;
            }
            o.LJIJI("answersTabAdapter");
            throw null;
        }
        o.LJIJI("answersTabAdapter");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        this.LJLJJI = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.c_4, viewGroup, false, "inflater.inflate(R.layou…nswers, container, false)");
        View Kl = Kl();
        try {
            ViewTreeLifecycleOwner.set(Kl, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(Kl, this);
            C10A.LIZIZ(Kl, this);
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
        return Kl;
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
