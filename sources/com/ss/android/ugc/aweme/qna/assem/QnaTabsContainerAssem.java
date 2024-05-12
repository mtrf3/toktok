package com.ss.android.ugc.aweme.qna.assem;

import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C00F;
import X.C16880lQ;
import X.C184077Kh;
import X.C212428Vi;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C34443DfT;
import X.C47704Ins;
import X.C52201KeD;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72214SVu;
import X.C72759Sh1;
import X.C74053T4n;
import X.C74101T6j;
import X.C74102T6k;
import X.C74107T6p;
import X.C74109T6r;
import X.C74110T6s;
import X.C74111T6t;
import X.C74113T6v;
import X.C74137T7t;
import X.C77123UOp;
import X.C78926UyI;
import X.C8YN;
import X.C99W;
import X.C9BD;
import X.HG3;
import X.InterfaceC65784Pro;
import X.KEI;
import X.LG1;
import X.MIL;
import X.RBX;
import X.T74;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.W5I;
import Y.ACListenerS32S0100000_12;
import Y.IDiS166S0200000_12;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment;
import com.ss.android.ugc.aweme.qna.fragment.QnaAnswersTabFragment;
import com.ss.android.ugc.aweme.qna.fragment.QnaQuestionsTabFragment;
import com.ss.android.ugc.aweme.qna.fragment.QnaSuggestedTabFragment;
import com.ss.android.ugc.aweme.qna.vm.QnaBannerViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaCreationSharedViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaNavigationViewModel;
import com.ss.android.ugc.aweme.qna.vm.QnaSelectedPageViewModel;
import com.ss.android.ugc.aweme.qnasearch.vm.QnaSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS128S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QnaTabsContainerAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C214378bB LJLJJI;
    public QnaNavigationViewModel LJLJJL;
    public ActivityC45651qj LJLJJLL;
    public Resources LJLJL;
    public C74053T4n LJLJLJ;
    public Integer LJLJLLL;
    public C74137T7t LJLL;

    public QnaTabsContainerAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C72214SVu.class, null), checkSupervisorPrepared());
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(QnaBannerViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9bd, new AqS162S0100000_12(LIZ, 858), C72759Sh1.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(QnaSelectedPageViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS162S0100000_12(LIZ2, 859), C74107T6p.INSTANCE, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(QnaCreationSharedViewModel.class);
        C74111T6t c74111T6t = C74111T6t.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS162S0100000_12(this, 860);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ3, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c74111T6t, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    public final C72214SVu v3() {
        return (C72214SVu) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        super.onCreateView();
        W5I.LIZIZ(getContext(), null);
    }

    @Override // X.C8W0
    public final void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        C74137T7t c74137T7t = this.LJLL;
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
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C74137T7t c74137T7t = this.LJLL;
        if (c74137T7t != null) {
            c74137T7t.LJ();
        }
    }

    public final boolean x3() {
        return TextUtils.equals(v3().LJLJI, HG3.LJIILL().getCurUserId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [long[], java.io.Serializable] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData mutableLiveData;
        Drawable drawable;
        FragmentManager childFragmentManager;
        QnaAnswersTabFragment qnaAnswersTabFragment;
        QnaQuestionsTabFragment qnaQuestionsTabFragment;
        CharSequence LJIILIIL;
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            this.LJLJJLL = LIZ;
            Resources resources = view.getResources();
            o.LJIIIIZZ(resources, "view.resources");
            this.LJLJL = resources;
            ActivityC45651qj activityC45651qj = this.LJLJJLL;
            if (activityC45651qj != null) {
                this.LJLJJL = (QnaNavigationViewModel) new ViewModelProvider(activityC45651qj).get(QnaNavigationViewModel.class);
                Fragment LIZLLL = C212428Vi.LIZLLL(this);
                if (LIZLLL != null && (childFragmentManager = LIZLLL.getChildFragmentManager()) != null) {
                    Context context = getContext();
                    o.LJI(context);
                    C74110T6s c74110T6s = new C74110T6s(context, childFragmentManager);
                    if (c74110T6s != null) {
                        ViewPager viewPager = (ViewPager) view.findViewById(R.id.nb6);
                        viewPager.setAdapter(c74110T6s);
                        c74110T6s.notifyDataSetChanged();
                        viewPager.setOffscreenPageLimit(3);
                        boolean z = true;
                        if (C00F.LIZ(31744, 0, "public_qna_suggested_tab", true) == 0 || !x3()) {
                            z = false;
                        }
                        if (z || v3().LIZ()) {
                            String authorId = v3().LJLJI;
                            String enterFrom = v3().LJLIL;
                            String enterMethod = v3().LJLILLLLZI;
                            MIL mil = v3().LJLJJI;
                            ?? r8 = v3().LJLJJL;
                            o.LJIIIZ(authorId, "authorId");
                            o.LJIIIZ(enterFrom, "enterFrom");
                            o.LJIIIZ(enterMethod, "enterMethod");
                            QnaSuggestedTabFragment qnaSuggestedTabFragment = new QnaSuggestedTabFragment();
                            Bundle LIZJ = AnonymousClass036.LIZJ("author_id", authorId, "enter_from", enterFrom);
                            LIZJ.putString("enter_method", enterMethod);
                            LIZJ.putSerializable("qna_profile_mode", mil);
                            LIZJ.putSerializable("question_ids", r8);
                            qnaSuggestedTabFragment.setArguments(LIZJ);
                            ((ArrayList) c74110T6s.LJLJLLL).add(qnaSuggestedTabFragment);
                            c74110T6s.notifyDataSetChanged();
                        }
                        if (v3().LIZ()) {
                            qnaAnswersTabFragment = null;
                        } else {
                            String authorId2 = v3().LJLJI;
                            String enterFrom2 = v3().LJLIL;
                            String enterMethod2 = v3().LJLILLLLZI;
                            o.LJIIIZ(authorId2, "authorId");
                            o.LJIIIZ(enterFrom2, "enterFrom");
                            o.LJIIIZ(enterMethod2, "enterMethod");
                            qnaAnswersTabFragment = new QnaAnswersTabFragment();
                            Bundle LIZJ2 = AnonymousClass036.LIZJ("author_id", authorId2, "enter_from", enterFrom2);
                            LIZJ2.putString("enter_method", enterMethod2);
                            LIZJ2.putBoolean("isSelf", o.LJ(authorId2, ((RBX) HG3.LJIILL()).getCurUserId()));
                            qnaAnswersTabFragment.setArguments(LIZJ2);
                        }
                        if (v3().LIZ()) {
                            qnaQuestionsTabFragment = null;
                        } else {
                            String authorId3 = v3().LJLJI;
                            String enterFrom3 = v3().LJLIL;
                            String enterMethod3 = v3().LJLILLLLZI;
                            o.LJIIIZ(authorId3, "authorId");
                            o.LJIIIZ(enterFrom3, "enterFrom");
                            o.LJIIIZ(enterMethod3, "enterMethod");
                            qnaQuestionsTabFragment = new QnaQuestionsTabFragment();
                            Bundle LIZJ3 = AnonymousClass036.LIZJ("author_id", authorId3, "enter_from", enterFrom3);
                            LIZJ3.putString("enter_method", enterMethod3);
                            LIZJ3.putBoolean("isSelf", o.LJ(authorId3, ((RBX) HG3.LJIILL()).getCurUserId()));
                            qnaQuestionsTabFragment.setArguments(LIZJ3);
                        }
                        if (qnaAnswersTabFragment != null) {
                            ((ArrayList) c74110T6s.LJLJLLL).add(qnaAnswersTabFragment);
                            c74110T6s.notifyDataSetChanged();
                        }
                        if (qnaQuestionsTabFragment != null) {
                            ((ArrayList) c74110T6s.LJLJLLL).add(qnaQuestionsTabFragment);
                            c74110T6s.notifyDataSetChanged();
                        }
                        View findViewById = view.findViewById(R.id.kyt);
                        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tab_layout)");
                        this.LJLJLJ = (C74053T4n) findViewById;
                        if (v3().LIZ()) {
                            C74053T4n c74053T4n = this.LJLJLJ;
                            if (c74053T4n != null) {
                                c74053T4n.setVisibility(8);
                                View findViewById2 = view.findViewById(R.id.kyg);
                                if (findViewById2 != null) {
                                    findViewById2.setVisibility(0);
                                }
                            } else {
                                o.LJIJI("tabLayout");
                                throw null;
                            }
                        }
                        C74053T4n c74053T4n2 = this.LJLJLJ;
                        if (c74053T4n2 != null) {
                            C74053T4n.LJIILJJIL(c74053T4n2, viewPager);
                            int count = c74110T6s.getCount();
                            for (int i = 0; i < count; i++) {
                                C74053T4n c74053T4n3 = this.LJLJLJ;
                                if (c74053T4n3 != null) {
                                    KEI LJI = c74053T4n3.LJI(i);
                                    if (c74110T6s.LJJIIJ(i) instanceof QnaSuggestedTabFragment) {
                                        Resources resources2 = this.LJLJL;
                                        if (resources2 != null) {
                                            LJIILIIL = resources2.getString(R.string.pqb);
                                            o.LJIIIIZZ(LJIILIIL, "resources.getString(R.st…tructure_suggested_title)");
                                        } else {
                                            o.LJIJI("resources");
                                            throw null;
                                        }
                                    } else {
                                        LJIILIIL = c74110T6s.LJIILIIL(i);
                                    }
                                    if (LJI != null) {
                                        LJI.LIZIZ(LJIILIIL);
                                    }
                                } else {
                                    o.LJIJI("tabLayout");
                                    throw null;
                                }
                            }
                            C74053T4n c74053T4n4 = this.LJLJLJ;
                            if (c74053T4n4 != null) {
                                c74053T4n4.LIZ(new C74109T6r(c74110T6s, this, viewPager));
                                BaseQnaTabFragment currentFragment = c74110T6s.LJJIIJ(viewPager.getCurrentItem());
                                AssemViewModel assemViewModel = (AssemViewModel) this.LJLJI.getValue();
                                o.LJIIIZ(currentFragment, "currentFragment");
                                assemViewModel.setState(new AqS170S0100000_4(currentFragment, 1057));
                                viewPager.addOnPageChangeListener(new IDiS166S0200000_12(c74110T6s, this, 0));
                                if (qnaAnswersTabFragment != null) {
                                    C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.T6u
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((E86) obj).LJLILLLLZI;
                                        }
                                    }, null, new AqS128S0300000_12(this, qnaAnswersTabFragment, c74110T6s, 2), 6);
                                }
                                if (qnaQuestionsTabFragment != null) {
                                    C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.T6w
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((E86) obj).LJLJI;
                                        }
                                    }, null, new AqS128S0300000_12(this, qnaQuestionsTabFragment, c74110T6s, 3), 6);
                                }
                                viewPager.addOnPageChangeListener(new T74(c74110T6s));
                                Integer num = this.LJLJLLL;
                                if (num != null) {
                                    C8YN.LJII(this, this.LJLJJI.getValue(), new TBT() { // from class: X.T6x
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((C74117T6z) obj).LJLIL;
                                        }
                                    }, null, new C74113T6v(viewPager, num.intValue()), 6);
                                }
                            } else {
                                o.LJIJI("tabLayout");
                                throw null;
                            }
                        } else {
                            o.LJIJI("tabLayout");
                            throw null;
                        }
                    }
                }
                if (C34443DfT.LIZ && C52201KeD.LIZ && !v3().LIZ() && x3() && this.LJLJJL != null) {
                    ActivityC45651qj activityC45651qj2 = this.LJLJJLL;
                    if (activityC45651qj2 != null) {
                        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.iid);
                        Context context2 = getContext();
                        if (context2 != null) {
                            LG1 lg1 = new LG1(context2, null);
                            viewGroup.addView(lg1);
                            C74137T7t c74137T7t = new C74137T7t();
                            this.LJLL = c74137T7t;
                            c74137T7t.LIZLLL(new C74102T6k(null, this.LJLJJL), lg1, activityC45651qj2, activityC45651qj2, v3().LJLJJI, activityC45651qj2, (QnaBannerViewModel) this.LJLILLLLZI.getValue(), 4.0f);
                        }
                        view.findViewById(R.id.ihj).setVisibility(0);
                        if (C99W.LIZ) {
                            View findViewById3 = view.findViewById(R.id.ihi);
                            Context context3 = getContext();
                            if (context3 != null) {
                                drawable = context3.getDrawable(R.drawable.c15);
                            } else {
                                drawable = null;
                            }
                            findViewById3.setBackground(drawable);
                        }
                        view.findViewById(R.id.iho).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 204)));
                        C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.ihy), new ACListenerS32S0100000_12(this, 205));
                        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 206), view);
                    } else {
                        o.LJIJI("activity");
                        throw null;
                    }
                }
                ActivityC45651qj activityC45651qj3 = this.LJLJJLL;
                if (activityC45651qj3 != null) {
                    QnaNavigationViewModel qnaNavigationViewModel = this.LJLJJL;
                    if (qnaNavigationViewModel != null && (mutableLiveData = qnaNavigationViewModel.LJLILLLLZI) != null) {
                        mutableLiveData.observe(activityC45651qj3, new C74101T6j(new AqS143S0200000_12(this, activityC45651qj3, 169)));
                    }
                    C8YN.LJII(this, (AssemViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.E89
                        @Override // X.TBT, X.TBZ, X.TBW
                        public final Object get(Object obj) {
                            return ((E86) obj).LJLJJLL;
                        }
                    }, C213688a4.LIZLLL(), new AqS194S0100000_12(this, BuildConfig.VERSION_CODE), 4);
                    return;
                }
                o.LJIJI("activity");
                throw null;
            }
            o.LJIJI("activity");
            throw null;
        }
    }

    public final void A3(BaseQnaTabFragment baseQnaTabFragment, long j, C74110T6s c74110T6s) {
        String string;
        String string2;
        int count = c74110T6s.getCount();
        for (int i = 0; i < count; i++) {
            C74053T4n c74053T4n = this.LJLJLJ;
            if (c74053T4n != null) {
                KEI LJI = c74053T4n.LJI(i);
                o.LJII(LJI, "null cannot be cast to non-null type com.bytedance.tux.tab.TuxTabBar.Tab");
                c74110T6s.LJJIIJ(i);
                BaseQnaTabFragment LJJIIJ = c74110T6s.LJJIIJ(i);
                o.LJII(LJJIIJ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.qna.fragment.BaseQnaTabFragment");
                String wl = LJJIIJ.wl();
                String wl2 = baseQnaTabFragment.wl();
                if (o.LJ(wl, wl2)) {
                    if (o.LJ(wl2, "answers")) {
                        if (j == 1000) {
                            Resources resources = this.LJLJL;
                            if (resources != null) {
                                string2 = resources.getString(R.string.pnz);
                            } else {
                                o.LJIJI("resources");
                                throw null;
                            }
                        } else if (j > 1000) {
                            Resources resources2 = this.LJLJL;
                            if (resources2 != null) {
                                string2 = resources2.getString(R.string.po0);
                            } else {
                                o.LJIJI("resources");
                                throw null;
                            }
                        } else {
                            Resources resources3 = this.LJLJL;
                            if (resources3 != null) {
                                string2 = resources3.getString(R.string.po1, C77123UOp.LJJIIJ(j));
                            } else {
                                o.LJIJI("resources");
                                throw null;
                            }
                        }
                        o.LJIIIIZZ(string2, "when {\n                 …                        }");
                        LJI.LIZIZ(string2);
                        return;
                    }
                    if (!o.LJ(wl2, "questions")) {
                        return;
                    }
                    if (j == 1000) {
                        Resources resources4 = this.LJLJL;
                        if (resources4 != null) {
                            string = resources4.getString(R.string.po3);
                        } else {
                            o.LJIJI("resources");
                            throw null;
                        }
                    } else if (j > 1000) {
                        Resources resources5 = this.LJLJL;
                        if (resources5 != null) {
                            string = resources5.getString(R.string.po4);
                        } else {
                            o.LJIJI("resources");
                            throw null;
                        }
                    } else {
                        Resources resources6 = this.LJLJL;
                        if (resources6 != null) {
                            string = resources6.getString(R.string.po2, C77123UOp.LJJIIJ(j));
                        } else {
                            o.LJIJI("resources");
                            throw null;
                        }
                    }
                    o.LJIIIIZZ(string, "when {\n                 …                        }");
                    LJI.LIZIZ(string);
                    return;
                }
            } else {
                o.LJIJI("tabLayout");
                throw null;
            }
        }
    }
}
