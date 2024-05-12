package com.ss.android.ugc.aweme.nows.feed.viewmodel;

import X.AbstractC193947jK;
import X.AbstractC194007jQ;
import X.AbstractC194637kR;
import X.C177336xd;
import X.C181847Bs;
import X.C193687iu;
import X.C193847jA;
import X.C193887jE;
import X.C193997jP;
import X.C194437k7;
import X.C194627kQ;
import X.C195827mM;
import X.C196367nE;
import X.C196577nZ;
import X.C56412MCa;
import X.C76800UCe;
import X.C78996UzQ;
import X.C7ML;
import X.C7XD;
import X.InterfaceC88472Yns;
import X.TBT;
import X.X1D;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes4.dex */
public final class NowPostCellViewModel extends AssemViewModel<C194437k7> {
    public static final /* synthetic */ int LJLIL = 0;

    static {
        new C193687iu();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C194437k7 defaultState() {
        return new C194437k7(0);
    }

    public final void jv0(AbstractC193947jK cellState) {
        o.LJIIIZ(cellState, "cellState");
        setState(new AqS169S0100000_3(cellState, 347));
    }

    public final void kv0(InterfaceC88472Yns<? super C196577nZ, C196577nZ> reducer) {
        o.LJIIIZ(reducer, "reducer");
        setState(new AqS169S0100000_3(reducer, (InterfaceC88472Yns<? super C177336xd, C76800UCe>) 348));
    }

    /* JADX WARN: Incorrect types in method signature: <CELL:Lcom/bytedance/assem/arch/reused/ReusedUIAssem<TRECEIVER;>;:LX/7jp;RECEIVER:Ljava/lang/Object;>(TCELL;LX/MCa<LX/8Yf<LX/7jK;>;>;)V */
    public final void hv0(ReusedUIAssem cell, C56412MCa subscribeConfig) {
        o.LJIIIZ(cell, "cell");
        o.LJIIIZ(subscribeConfig, "subscribeConfig");
        AssemViewModel.selectSubscribe$default(this, new TBT() { // from class: X.7jo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C194437k7) obj).LJLIL;
            }
        }, subscribeConfig, null, null, new AqS134S0200000_3(cell, this, (NowPostCellViewModel) 115), 12, null);
    }

    public static AbstractC193947jK gv0(NowPostCellViewModel nowPostCellViewModel, C194437k7 c194437k7, AbstractC194637kR abstractC194637kR, C7ML c7ml, int i) {
        AbstractC193947jK abstractC193947jK;
        C181847Bs c181847Bs;
        String str;
        Boolean bool;
        AbstractC193947jK LIZIZ;
        String aid;
        Integer num;
        String aid2;
        String aid3;
        Aweme aweme;
        int i2;
        AbstractC194007jQ c193997jP;
        Aweme aweme2;
        User author;
        Aweme aweme3;
        User author2;
        Aweme aweme4;
        String aid4;
        Aweme aweme5;
        Boolean bool2 = null;
        if ((i & 1) != 0) {
            abstractC193947jK = c194437k7.LJLIL;
        } else {
            abstractC193947jK = null;
        }
        if ((i & 2) != 0) {
            abstractC194637kR = c194437k7.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c7ml = c194437k7.LJLJI;
        }
        if ((i & 8) != 0) {
            c181847Bs = c194437k7.LJLJJI;
        } else {
            c181847Bs = null;
        }
        nowPostCellViewModel.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("before computeNextState: useItem = ");
        if (c7ml != null && (aweme5 = c7ml.getAweme()) != null) {
            str = aweme5.getAid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        LIZ.append(", useCellState = ");
        LIZ.append(abstractC193947jK);
        LIZ.append(", usePostState = ");
        LIZ.append(abstractC194637kR);
        LIZ.append(", isLocal = ");
        int i3 = 0;
        if (c7ml != null && (aweme4 = c7ml.getAweme()) != null && (aid4 = aweme4.getAid()) != null) {
            bool = Boolean.valueOf(s.LJJJLZIJ(aid4, "-", false));
        } else {
            bool = null;
        }
        LIZ.append(bool);
        C7XD.LJ("NowPostCellViewModel", X1D.LIZIZ(LIZ));
        if (abstractC194637kR instanceof C194627kQ) {
            if (c7ml != null) {
                aweme = c7ml.getAweme();
            } else {
                aweme = null;
            }
            if (!C78996UzQ.LJJIIZI(aweme)) {
                C196367nE.LIZ.getClass();
                if (!C196367nE.LJIIIIZZ(c7ml)) {
                    C7ML c7ml2 = c194437k7.LJLJI;
                    if (c7ml2 != null && (aweme3 = c7ml2.getAweme()) != null && (author2 = aweme3.getAuthor()) != null) {
                        i2 = author2.getFollowStatus();
                    } else {
                        i2 = 0;
                    }
                    C7ML c7ml3 = c194437k7.LJLJI;
                    if (c7ml3 != null && (aweme2 = c7ml3.getAweme()) != null && (author = aweme2.getAuthor()) != null) {
                        i3 = author.getFollowerStatus();
                    }
                    if (c7ml != null) {
                        c193997jP = C193687iu.LIZ(c7ml, abstractC194637kR);
                    } else {
                        c193997jP = new C193997jP(i2, i3, Boolean.valueOf(abstractC194637kR.LIZ()));
                    }
                    return new C193847jA(c193997jP);
                }
            }
        }
        if (c7ml == null) {
            return abstractC193947jK;
        }
        if (!c181847Bs.LJLIL.LIZJ(abstractC194637kR)) {
            LIZIZ = C193687iu.LIZIZ(c7ml, abstractC194637kR);
        } else {
            LIZIZ = C193687iu.LIZIZ(c7ml, abstractC194637kR);
            LIZIZ.getClass();
            if (LIZIZ instanceof C193887jE) {
                C196367nE.LIZ.getClass();
                if (!C196367nE.LJIIIIZZ(c7ml) && abstractC194637kR.LIZ()) {
                    String authorUid = c7ml.getAweme().getAuthorUid();
                    o.LJIIIIZZ(authorUid, "useItem.aweme.authorUid");
                    if (!C196367nE.LJI(authorUid) && ((aid = c7ml.getAweme().getAid()) == null || (num = (Integer) ((ConcurrentHashMap) C195827mM.LIZ).get(aid)) == null || (num.intValue() | 2) <= 0)) {
                        LIZIZ = new C193847jA(C193687iu.LIZ(c7ml, abstractC194637kR));
                    }
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("after computeNextState: ");
        LIZ2.append(LIZIZ);
        LIZ2.append(", useItem = ");
        Aweme aweme6 = c7ml.getAweme();
        if (aweme6 != null && (aid3 = aweme6.getAid()) != null) {
            str2 = aid3;
        }
        LIZ2.append(str2);
        LIZ2.append(", useCellState = ");
        LIZ2.append(abstractC193947jK);
        LIZ2.append(", usePostState = ");
        LIZ2.append(abstractC194637kR);
        LIZ2.append(", isLocal = ");
        Aweme aweme7 = c7ml.getAweme();
        if (aweme7 != null && (aid2 = aweme7.getAid()) != null) {
            bool2 = Boolean.valueOf(s.LJJJLZIJ(aid2, "-", false));
        }
        LIZ2.append(bool2);
        C7XD.LJ("NowPostCellViewModel", X1D.LIZIZ(LIZ2));
        return LIZIZ;
    }
}
