package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.C0A2;
import X.C0AB;
import X.C17N;
import X.C212418Vh;
import X.C212428Vi;
import X.C220858ld;
import X.C252449vU;
import X.C32151Nz;
import X.C32I;
import X.C43I;
import X.C47261Igj;
import X.C49536JcK;
import X.C50082Jl8;
import X.C50321Joz;
import X.C50420Jqa;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51006K0c;
import X.C72242sW;
import X.C72808Sho;
import X.C76800UCe;
import X.C80796VnM;
import X.C80938Vpe;
import X.C90193gN;
import X.EnumC50080Jl6;
import X.InterfaceC224118qt;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.KPI;
import X.KPJ;
import X.KPQ;
import X.KPS;
import X.KPT;
import X.KPU;
import X.KSI;
import X.O6R;
import X.SYL;
import X.W5F;
import X.W5U;
import X.Z9N;
import Y.ARunnableS27S0200000_8;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ui.SearchCreationEntranceAssem;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackCell;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public class AqS171S0200000_8 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS171S0200000_8(X.SYL r3, X.KPJ r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 4: goto Lf;
                case 5: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS171S0200000_8.<init>(X.SYL, X.KPJ, int):void");
    }

    public static final Object invoke$0(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object obj) {
        AbstractC72932td response = (AbstractC72932td) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(response, "response");
        SearchBotHolder searchBotHolder = (SearchBotHolder) aqS171S0200000_8.l0;
        TakoPollingVM takoPollingVM = (TakoPollingVM) aqS171S0200000_8.l1;
        AqS139S0200000_8 aqS139S0200000_8 = new AqS139S0200000_8(response, (AbstractC72932td<TakoInfo>) searchBotHolder, (SearchBotHolder) 0);
        searchBotHolder.getClass();
        C212418Vh.LJIIJJI(takoPollingVM, aqS139S0200000_8);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object obj) {
        String str = (String) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (str != null) {
            try {
            } catch (Exception unused) {
                TakoPollingVM takoPollingVM = (TakoPollingVM) aqS171S0200000_8.l0;
                Boolean bool = Boolean.FALSE;
                takoPollingVM.getClass();
                takoPollingVM.setState(new AqS174S0100000_8(bool, 217));
            }
            if (str.length() != 0 && new File(str).exists()) {
                C17N.LJJLIIIJJI(((SearchBotHolder) aqS171S0200000_8.l1).LJLJLJ);
                W5F LJI = W5U.LJI(new File(str));
                LJI.LJJIIJ = ((SearchBotHolder) aqS171S0200000_8.l1).LJLJLJ;
                int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
                LJI.LJII = LJJIIZ;
                LJI.LJIIIIZZ = LJJIIZ2;
                if (C90193gN.LIZ()) {
                    LJI.LJIILL(new C80938Vpe());
                }
                LJI.LIZLLL(new C49536JcK((TakoPollingVM) aqS171S0200000_8.l0));
                return C76800UCe.LIZ;
            }
        }
        TakoPollingVM takoPollingVM2 = (TakoPollingVM) aqS171S0200000_8.l0;
        Boolean bool2 = Boolean.FALSE;
        takoPollingVM2.getClass();
        takoPollingVM2.setState(new AqS174S0100000_8(bool2, 217));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object it) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        C212418Vh.LJIIJJI(((HashtagFeedbackCell) aqS171S0200000_8.l0).L(), new AqS139S0200000_8((HashtagFeedbackCell) aqS171S0200000_8.l0, (KSI) aqS171S0200000_8.l1, 50));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS171S0200000_8 aqS171S0200000_8, Object obj, Object obj2) {
        Aweme newAwemeScrollTo = (Aweme) obj;
        List<Aweme> list = (List) obj2;
        o.LJIIIZ(newAwemeScrollTo, "newAwemeScrollTo");
        SearchAwemeCardForUser searchAwemeCardForUser = (SearchAwemeCardForUser) aqS171S0200000_8.l0;
        SearchUser searchUser = searchAwemeCardForUser.LJLLILLLL;
        if (searchUser != null) {
            C50420Jqa c50420Jqa = (C50420Jqa) aqS171S0200000_8.l1;
            if (list != null) {
                searchUser.awemeCards = list;
                searchAwemeCardForUser.LJIIIZ(list);
            }
            List<Aweme> list2 = searchUser.awemeCards;
            if (list2 != null && !o.LJ(searchAwemeCardForUser.LJIIJJI().LJLJJI, list2)) {
                searchAwemeCardForUser.LJIIIZ(list2);
            }
            SearchAwemeCardForUser.LJJIIJ(searchAwemeCardForUser, c50420Jqa, newAwemeScrollTo);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object obj) {
        C80796VnM viewPager;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            InterfaceC224118qt interfaceC224118qt = (InterfaceC224118qt) aqS171S0200000_8.l0;
            KPI kpi = (KPI) aqS171S0200000_8.l1;
            if (interfaceC224118qt != null && interfaceC224118qt.getAwemeList() != null && (viewPager = kpi.LJLIL.getViewPager()) != null) {
                viewPager.post(new ARunnableS27S0200000_8(interfaceC224118qt, kpi, 56));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object obj) {
        T t;
        Aweme aweme;
        boolean z;
        C43I c43i = (C43I) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (t = c43i.LIZ) != 0) {
            KPJ kpj = (KPJ) aqS171S0200000_8.l0;
            SYL syl = (SYL) aqS171S0200000_8.l1;
            Iterator<Aweme> it = kpj.LJIIIZ().getState().LJLJI.iterator();
            while (true) {
                if (it.hasNext()) {
                    aweme = it.next();
                    if (o.LJ(aweme.getAid(), t)) {
                        break;
                    }
                } else {
                    aweme = null;
                    break;
                }
            }
            Aweme aweme2 = aweme;
            if (aweme2 != null) {
                Iterator it2 = ((ArrayList) syl.getState().LJII()).iterator();
                int i = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) next;
                        if (interfaceC57784Mm4 instanceof KPS) {
                            KPS kps = (KPS) interfaceC57784Mm4;
                            if (o.LJ(kps.LJLIL, t)) {
                                C72808Sho<InterfaceC57784Mm4> state = syl.getState();
                                if (aweme2.getUserDigg() == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                state.LJIILL(i, KPS.LIZ(kps, KPU.L(kps.LJLJJLL, z, false, null, false, 14)));
                            }
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            KPJ kpj = (KPJ) aqS171S0200000_8.l0;
            SYL syl = (SYL) aqS171S0200000_8.l1;
            String str = kpj.LJIIIZ().getState().LJLJJI;
            Iterator it = ((ArrayList) syl.getState().LJII()).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) next;
                    if (interfaceC57784Mm4 instanceof KPS) {
                        KPS kps = (KPS) interfaceC57784Mm4;
                        if (o.LJ(str, kps.LJLIL)) {
                            syl.getState().LJIILL(i, KPS.LIZ(kps, KPU.L(kps.LJLJJLL, false, false, null, true, 7)));
                            break;
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object awemeList) {
        UrlModel urlModel;
        boolean z;
        long j;
        boolean z2;
        String str;
        KPT kpt;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(awemeList, "awemeList");
        C72808Sho<InterfaceC57784Mm4> state = ((SYL) aqS171S0200000_8.l0).getState();
        FilterVM LJIIIZ = ((KPJ) aqS171S0200000_8.l1).LJIIIZ();
        List<Aweme> awemeList2 = LJIIIZ.getState().LJLJI;
        o.LJIIIZ(awemeList2, "awemeList");
        C252449vU state2 = LJIIIZ.getState();
        ArrayList arrayList = new ArrayList(C32I.LJJL(awemeList2, 10));
        for (Aweme aweme : awemeList2) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            Video video = aweme.getVideo();
            if (video != null) {
                urlModel = video.getCover();
            } else {
                urlModel = null;
            }
            if (aweme.getUserDigg() == 1) {
                z = true;
            } else {
                z = false;
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j = statistics.getDiggCount();
            } else {
                j = 0;
            }
            boolean LJIIIZ2 = C220858ld.LJIIIZ(aweme);
            if (aweme.getUserDigg() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean LJ = o.LJ(aweme.getAid(), state2.LJLJJI);
            String aid2 = aweme.getAid();
            KPQ kpq = state2.LJLJL;
            if (kpq != null) {
                str = kpq.LJLIL;
            } else {
                str = null;
            }
            if (o.LJ(aid2, str)) {
                KPQ kpq2 = state2.LJLJL;
                if (kpq2 != null && kpq2.LJLILLLLZI) {
                    kpt = KPT.PLAYING;
                } else {
                    kpt = KPT.PAUSED;
                }
            } else {
                kpt = KPT.NOT_DEFINED;
            }
            arrayList.add(new KPS(aid, urlModel, z, j, LJIIIZ2, new KPU(z2, LJ, kpt, false)));
        }
        state.LJIILLIIL(arrayList);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        List<InterfaceC57784Mm4> LJII = ((SYL) aqS171S0200000_8.l0).getState().LJII();
        SYL syl = (SYL) aqS171S0200000_8.l0;
        Iterator it = ((ArrayList) LJII).iterator();
        int i = -1;
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) next;
                if (interfaceC57784Mm4 instanceof KPS) {
                    KPS kps = (KPS) interfaceC57784Mm4;
                    if (o.LJ(kps.LJLIL, obj)) {
                        i = i2;
                    }
                    if (kps.LJLJJLL.LJLILLLLZI && !o.LJ(kps.LJLIL, obj)) {
                        syl.getState().LJIILL(i2, KPS.LIZ(kps, KPU.L(kps.LJLJJLL, false, false, null, false, 5)));
                    }
                    if (!kps.LJLJJLL.LJLILLLLZI && o.LJ(kps.LJLIL, obj)) {
                        syl.getState().LJIILL(i2, KPS.LIZ(kps, KPU.L(kps.LJLJJLL, false, true, null, false, 5)));
                    }
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        if (i >= 0) {
            ((C0AB) ((KPJ) aqS171S0200000_8.l1).LJLJLLL.getValue()).LIZ = i;
            C0A2 layoutManager = ((SYL) aqS171S0200000_8.l0).getLayoutManager();
            if (layoutManager != null) {
                layoutManager.LLIIIILZ((C0AB) ((KPJ) aqS171S0200000_8.l1).LJLJLLL.getValue());
            }
        }
        KPJ kpj = (KPJ) aqS171S0200000_8.l1;
        kpj.LIZ(1.0f - kpj.LJIIIZ().getState().LJLJJL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS171S0200000_8 aqS171S0200000_8, Object obj, Object obj2) {
        MotionEvent event = (MotionEvent) obj2;
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(event, "event");
        if (event.getAction() == 0) {
            ((C72242sW) aqS171S0200000_8.l0).element = System.currentTimeMillis();
            Z9N.LIZIZ.LLILII(((C51006K0c) aqS171S0200000_8.l1).getContext(), ((C51006K0c) aqS171S0200000_8.l1).getSearchParams());
        } else if (event.getAction() == 3) {
            Z9N z9n = Z9N.LIZIZ;
            z9n.LLLIIII(((C72242sW) aqS171S0200000_8.l0).element, "comment_related_search", true);
            z9n.LJIIIZ("cancel", ((C51006K0c) aqS171S0200000_8.l1).LJLLLL, "ACTION_CANCEL");
        }
        return Boolean.FALSE;
    }

    public static final Object invoke$9(AqS171S0200000_8 aqS171S0200000_8, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue) {
            ((View) aqS171S0200000_8.l0).setVisibility(0);
            SearchCreationEntranceAssem searchCreationEntranceAssem = (SearchCreationEntranceAssem) aqS171S0200000_8.l1;
            searchCreationEntranceAssem.getClass();
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            Fragment LIZLLL = C212428Vi.LIZLLL(searchCreationEntranceAssem);
            c50651JuJ.getClass();
            C50321Joz LJ = C50651JuJ.LJ(LIZLLL);
            ViewGroup viewGroup = searchCreationEntranceAssem.LJLJLLL;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                C50082Jl8.LIZIZ(EnumC50080Jl6.SHOOT, LJ);
            }
            ViewGroup viewGroup2 = searchCreationEntranceAssem.LJLL;
            if (viewGroup2 != null && viewGroup2.getVisibility() == 0) {
                C50082Jl8.LIZIZ(EnumC50080Jl6.ALBUM, LJ);
            }
            TuxTextView tuxTextView = searchCreationEntranceAssem.LJLLI;
            if (tuxTextView != null && tuxTextView.getVisibility() == 0) {
                C50082Jl8.LIZIZ(EnumC50080Jl6.TEXTMODE, LJ);
            }
        } else {
            ((View) aqS171S0200000_8.l0).setVisibility(8);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS171S0200000_8(com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder r3, com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS171S0200000_8.<init>(com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder, com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS171S0200000_8(InterfaceC224118qt interfaceC224118qt, KPI kpi, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC224118qt;
        this.l1 = kpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS171S0200000_8(C51006K0c c51006K0c, C72242sW c72242sW, int i) {
        super(2);
        this.$t = i;
        this.l0 = c72242sW;
        this.l1 = c51006K0c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS171S0200000_8(View view, SearchCreationEntranceAssem searchCreationEntranceAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = searchCreationEntranceAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS171S0200000_8(SearchAwemeCardForUser searchAwemeCardForUser, C50420Jqa c50420Jqa, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchAwemeCardForUser;
        this.l1 = c50420Jqa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS171S0200000_8(HashtagFeedbackCell hashtagFeedbackCell, KSI ksi, int i) {
        super(2);
        this.$t = i;
        this.l0 = hashtagFeedbackCell;
        this.l1 = ksi;
    }
}
