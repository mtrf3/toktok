package com.ss.android.ugc.aweme.qna.fragment;

import X.AbstractC030109x;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C184077Kh;
import X.C185517Pv;
import X.C188727au;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C29S;
import X.C33Q;
import X.C34443DfT;
import X.C37481dY;
import X.C3C5;
import X.C3C8;
import X.C52201KeD;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69606RTm;
import X.C73305Spp;
import X.C74100T6i;
import X.C74101T6j;
import X.C74102T6k;
import X.C74103T6l;
import X.C74104T6m;
import X.C74105T6n;
import X.C74134T7q;
import X.C74135T7r;
import X.C74137T7t;
import X.C74140T7w;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC72752Sgu;
import X.FMX;
import X.GE7;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC72761Sh3;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.LG1;
import X.MI7;
import X.MIC;
import X.MIK;
import X.MIL;
import X.MIO;
import X.OSK;
import X.OSL;
import X.OSM;
import X.QD3;
import X.T7O;
import X.TBT;
import X.TBW;
import X.XKX;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaMobViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaNavigationViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import com.ss.android.ugc.aweme.qnasearch.vm.QnaSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes13.dex */
public class QnaSuggestedTabFragment extends BaseQnaTabFragment implements KPL {
    public static final /* synthetic */ int LJZI = 0;
    public View LJLJJI;
    public C74135T7r LJLJJL;
    public QnaSuggestedTabViewModel LJLJJLL;
    public QnaNavigationViewModel LJLJL;
    public QnaMobViewModel LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final C214298b3 LJLL;
    public final C37481dY LJLLI;
    public final boolean LJLLILLLL;
    public C74140T7w LJLLJ;
    public C74137T7t LJLLL;
    public Long LJLLLL;
    public final AtomicLong LJLLLLLL;
    public final int LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment
    public final String wl() {
        return "suggested";
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment
    public final int xl() {
        return R.string.pqb;
    }

    public QnaSuggestedTabFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(QnaBannerViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 861);
        C74104T6m c74104T6m = C74104T6m.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c74104T6m, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c74104T6m, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLLL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(QnaSelectedPageViewModel.class);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(LIZ2, 862);
        C74105T6n c74105T6n = C74105T6n.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(aqS162S0100000_122, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c74105T6n, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b32 = new C214298b3(aqS162S0100000_122, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c74105T6n, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLL = c214298b32;
        this.LJLLI = new C37481dY();
        this.LJLLILLLL = true;
        this.LJLLLLLL = new AtomicLong(-1L);
        this.LJLZ = 3000;
    }

    public final void Ll() {
        if (!this.LJLIL) {
            this.LJLIL = true;
            Kl();
        }
        C74140T7w c74140T7w = this.LJLLJ;
        if (c74140T7w != null) {
            C74135T7r c74135T7r = this.LJLJJL;
            if (c74135T7r != null) {
                ((Set) c74135T7r.LJLJJLL.LJLIL).clear();
                ((HashSet) c74135T7r.LJLJL.LIZ).clear();
                C74135T7r c74135T7r2 = this.LJLJJL;
                if (c74135T7r2 != null) {
                    BaseQnaTabFragment.Gl(c74140T7w, c74135T7r2);
                    return;
                } else {
                    o.LJIJI("suggestedTabAdapter");
                    throw null;
                }
            }
            o.LJIJI("suggestedTabAdapter");
            throw null;
        }
    }

    public final MIL Jl() {
        Serializable serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("qna_profile_mode");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof MIL)) {
            return null;
        }
        return (MIL) serializable;
    }

    public final void Kl() {
        Object obj;
        long[] jArr;
        MIL Jl = Jl();
        if (Jl != null && Jl == MIL.FYP_BANNER) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                obj = arguments.getSerializable("question_ids");
            } else {
                obj = null;
            }
            if (obj instanceof long[]) {
                jArr = (long[]) obj;
            } else {
                jArr = null;
            }
            QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.LJLJJLL;
            if (qnaSuggestedTabViewModel != null) {
                XKX.LIZLLL(ViewModelKt.getViewModelScope(qnaSuggestedTabViewModel), null, null, new MIC(qnaSuggestedTabViewModel, jArr, null), 3);
                return;
            }
            return;
        }
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel2 = this.LJLJJLL;
        if (qnaSuggestedTabViewModel2 == null) {
            return;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(qnaSuggestedTabViewModel2), null, null, new MIK(qnaSuggestedTabViewModel2, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EventBus LIZJ = EventBus.LIZJ();
        if (LIZJ.LJI(this)) {
            LIZJ.LJIJ(this);
        }
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        C74137T7t c74137T7t = this.LJLLL;
        if (c74137T7t != null) {
            ConstraintLayout constraintLayout = c74137T7t.LIZLLL;
            if (constraintLayout != null && (viewGroup = (ViewGroup) constraintLayout.findViewById(R.id.ihi)) != null) {
                viewGroup.clearFocus();
            }
            QnaSearchViewModel qnaSearchViewModel = c74137T7t.LIZ;
            if (qnaSearchViewModel != null) {
                qnaSearchViewModel.LJLIL.LIZ.LJ();
            }
        }
        KeyboardUtils.LIZIZ(getView());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C74137T7t c74137T7t = this.LJLLL;
        if (c74137T7t != null) {
            c74137T7t.LJ();
        }
        this.LJLLLL = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void Ml(EnumC72752Sgu exitMethod) {
        Long l = this.LJLLLL;
        if (l != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            if (Jl() == MIL.FYP_BANNER) {
                InterfaceC72761Sh3.LIZ.getClass();
                o.LJIIIZ(exitMethod, "exitMethod");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "qa_trending_page");
                c188727au.LJIIIZ("exit_method", exitMethod.getValue());
                c188727au.LJ(elapsedRealtime, "stay_duration");
                FMX.LJIIL("exit_qa_trending_page", c188727au.LIZ);
            } else if (this.LJLLILLLL) {
                InterfaceC72761Sh3.LIZ.getClass();
                o.LJIIIZ(exitMethod, "exitMethod");
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("enter_from", "qa_personal_profile");
                c188727au2.LJIIIZ("exit_method", exitMethod.getValue());
                c188727au2.LJ(elapsedRealtime, "stay_duration");
                FMX.LJIIL("exit_qa_personal_profile", c188727au2.LIZ);
            }
        }
        this.LJLLLL = null;
    }

    @Override // com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(GE7.LJLIL);
    }

    @QD3
    public final void onQuestionCollectEvent(C185517Pv event) {
        o.LJIIIZ(event, "event");
        Long id = event.LJLIL.getId();
        if (id != null) {
            long longValue = id.longValue();
            Integer collectStatus = event.LJLIL.getCollectStatus();
            if (collectStatus != null) {
                int intValue = collectStatus.intValue();
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.LJLJJLL;
                if (qnaSuggestedTabViewModel != null) {
                    String questionId = String.valueOf(longValue);
                    o.LJIIIZ(questionId, "questionId");
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(qnaSuggestedTabViewModel), null, null, new MIO(qnaSuggestedTabViewModel, questionId, intValue, null), 3);
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        QnaSearchViewModel qnaSearchViewModel;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData<C74100T6i<String>> mutableLiveData6;
        MutableLiveData mutableLiveData7;
        MutableLiveData mutableLiveData8;
        MutableLiveData mutableLiveData9;
        MutableLiveData mutableLiveData10;
        MutableLiveData<C74100T6i<C69606RTm>> mutableLiveData11;
        MutableLiveData mutableLiveData12;
        MutableLiveData mutableLiveData13;
        LiveData<C74100T6i<Boolean>> liveData;
        MutableLiveData mutableLiveData14;
        AbstractC030109x itemAnimator;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJJLL = (QnaSuggestedTabViewModel) new ViewModelProvider(this, new MI7()).get(QnaSuggestedTabViewModel.class);
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        this.LJLJL = (QnaNavigationViewModel) new ViewModelProvider(requireActivity).get(QnaNavigationViewModel.class);
        ActivityC45651qj requireActivity2 = requireActivity();
        o.LJIIIIZZ(requireActivity2, "requireActivity()");
        this.LJLJLJ = (QnaMobViewModel) new ViewModelProvider(requireActivity2).get(QnaMobViewModel.class);
        QnaSuggestedTabViewModel qnaSuggestedTabViewModel = this.LJLJJLL;
        if (qnaSuggestedTabViewModel != null) {
            MIL Jl = Jl();
            qnaSuggestedTabViewModel.LJLJLJ = Jl;
            T7O t7o = qnaSuggestedTabViewModel.LJLJL;
            if (Jl != null) {
                t7o.LJJI = Jl;
            } else {
                t7o.getClass();
            }
        }
        C74102T6k c74102T6k = new C74102T6k(this.LJLJJLL, this.LJLJL);
        View view2 = this.LJLJJI;
        if (view2 != null) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            MIL Jl2 = Jl();
            if (C34443DfT.LIZ && !C52201KeD.LIZ && Jl() != MIL.FYP_BANNER) {
                ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.ktk);
                LG1 lg1 = new LG1(requireContext, null);
                viewGroup.addView(lg1);
                C74137T7t c74137T7t = new C74137T7t();
                this.LJLLL = c74137T7t;
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                o.LJIIIIZZ(viewLifecycleOwner, "this.viewLifecycleOwner");
                c74137T7t.LIZLLL(c74102T6k, lg1, this, requireContext, Jl2, viewLifecycleOwner, (QnaBannerViewModel) this.LJLJLLL.getValue(), 16.0f);
            }
            View view3 = this.LJLJJI;
            if (view3 != null) {
                o.LJIIIIZZ(requireContext(), "requireContext()");
                C74137T7t c74137T7t2 = this.LJLLL;
                if (c74137T7t2 != null) {
                    qnaSearchViewModel = c74137T7t2.LIZ;
                } else {
                    qnaSearchViewModel = null;
                }
                C74140T7w c74140T7w = (C74140T7w) view3.findViewById(R.id.ktf);
                this.LJLLJ = c74140T7w;
                if (c74140T7w != null && (itemAnimator = c74140T7w.getItemAnimator()) != null) {
                    itemAnimator.LJFF = 0L;
                }
                C74102T6k c74102T6k2 = new C74102T6k(this.LJLJJLL, this.LJLJL);
                C37481dY c37481dY = this.LJLLI;
                MIL Jl3 = Jl();
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel2 = this.LJLJJLL;
                o.LJII(qnaSuggestedTabViewModel2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.vm.QnaScrollDelegate");
                this.LJLJJL = new C74135T7r(c74102T6k2, c37481dY, Jl3, qnaSuggestedTabViewModel2, qnaSearchViewModel);
                C74140T7w c74140T7w2 = this.LJLLJ;
                if (c74140T7w2 != null) {
                    c74140T7w2.setLayoutManager(new LinearLayoutManager());
                }
                C74140T7w c74140T7w3 = this.LJLLJ;
                if (c74140T7w3 != null) {
                    C74135T7r c74135T7r = this.LJLJJL;
                    if (c74135T7r != null) {
                        c74140T7w3.setAdapter(c74135T7r);
                    } else {
                        o.LJIJI("suggestedTabAdapter");
                        throw null;
                    }
                }
                C74140T7w c74140T7w4 = this.LJLLJ;
                if (c74140T7w4 != null) {
                    C74135T7r c74135T7r2 = this.LJLJJL;
                    if (c74135T7r2 != null) {
                        c74140T7w4.LJIIJJI(new C74134T7q(c74140T7w4, c74135T7r2, new AqS159S0100000_9(this, 30)));
                        C74135T7r c74135T7r3 = this.LJLJJL;
                        if (c74135T7r3 != null) {
                            c74140T7w4.LJIIJJI(new C74103T6l(this, c74140T7w4, c74135T7r3));
                        } else {
                            o.LJIJI("suggestedTabAdapter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("suggestedTabAdapter");
                        throw null;
                    }
                }
                C8YN.LJII(this, this.LJLL.getValue(), new TBT() { // from class: X.93j
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C2306293i) obj).LJLIL;
                    }
                }, null, new AqS194S0100000_12(this, 9), 6);
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel3 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel3 != null && (mutableLiveData14 = qnaSuggestedTabViewModel3.LJLL) != null) {
                    mutableLiveData14.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 43)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel4 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel4 != null && (liveData = qnaSuggestedTabViewModel4.LJLLI) != null) {
                    liveData.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 44)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel5 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel5 != null && (mutableLiveData13 = qnaSuggestedTabViewModel5.LJLLILLLL) != null) {
                    mutableLiveData13.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 46)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel6 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel6 != null && (mutableLiveData12 = qnaSuggestedTabViewModel6.LJLZ) != null) {
                    mutableLiveData12.observe(getViewLifecycleOwner(), new C74101T6j(new AqS167S0100000_1(this, 24)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel7 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel7 != null && (mutableLiveData11 = qnaSuggestedTabViewModel7.LJLLL) != null) {
                    mutableLiveData11.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 49)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel8 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel8 != null && (mutableLiveData10 = qnaSuggestedTabViewModel8.LJZI) != null) {
                    mutableLiveData10.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 51)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel9 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel9 != null && (mutableLiveData9 = qnaSuggestedTabViewModel9.LJLILLLLZI) != null) {
                    mutableLiveData9.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 53)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel10 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel10 != null && (mutableLiveData8 = qnaSuggestedTabViewModel10.LJLJJI) != null) {
                    mutableLiveData8.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 26)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel11 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel11 != null && (mutableLiveData7 = qnaSuggestedTabViewModel11.LJLJJLL) != null) {
                    mutableLiveData7.observe(getViewLifecycleOwner(), new C74101T6j(new AqS175S0100000_9(this, 16)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel12 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel12 != null && (mutableLiveData6 = qnaSuggestedTabViewModel12.LJLLLL) != null) {
                    mutableLiveData6.observe(getViewLifecycleOwner(), new C74101T6j(new AqS173S0100000_7(this, 31)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel13 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel13 != null && (mutableLiveData5 = qnaSuggestedTabViewModel13.LJLLLLLL) != null) {
                    mutableLiveData5.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 27)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel14 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel14 != null && (mutableLiveData4 = qnaSuggestedTabViewModel14.LJLLJ) != null) {
                    mutableLiveData4.observe(getViewLifecycleOwner(), new C74101T6j(new AqS167S0100000_1(this, 23)));
                }
                QnaSuggestedTabViewModel qnaSuggestedTabViewModel15 = this.LJLJJLL;
                if (qnaSuggestedTabViewModel15 != null && (mutableLiveData3 = qnaSuggestedTabViewModel15.LL) != null) {
                    mutableLiveData3.observe(getViewLifecycleOwner(), new C74101T6j(new AqS178S0100000_12(this, 30)));
                }
                C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Sgr
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((E86) obj).LJLJL;
                    }
                }, null, new AqS191S0100000_9(this, 3), 6);
                C8YN.LJII(this, (AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.E88
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((E86) obj).LJLJJLL;
                    }
                }, C213688a4.LIZLLL(), new AqS194S0100000_12(this, 8), 4);
                QnaNavigationViewModel qnaNavigationViewModel = this.LJLJL;
                if (qnaNavigationViewModel != null && (mutableLiveData2 = qnaNavigationViewModel.LJLJJI) != null) {
                    mutableLiveData2.observe(this, new C74101T6j(new AqS178S0100000_12(this, 38)));
                }
                QnaMobViewModel qnaMobViewModel = this.LJLJLJ;
                if (qnaMobViewModel != null && (mutableLiveData = qnaMobViewModel.LJLILLLLZI) != null) {
                    mutableLiveData.observe(this, new C74101T6j(new AqS178S0100000_12(this, 40)));
                }
                EventBus LIZJ = EventBus.LIZJ();
                if (!LIZJ.LJI(this)) {
                    LIZJ.LJIILJJIL(this);
                }
                View view4 = this.LJLJJI;
                if (view4 != null) {
                    ((C73305Spp) view4.findViewById(R.id.iia)).LJFF();
                    return;
                } else {
                    o.LJIJI("suggestedTabLayout");
                    throw null;
                }
            }
            o.LJIJI("suggestedTabLayout");
            throw null;
        }
        o.LJIJI("suggestedTabLayout");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.c_7, viewGroup, false, "inflater.inflate(R.layou…uggest, container, false)");
        this.LJLJJI = LIZIZ;
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
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
