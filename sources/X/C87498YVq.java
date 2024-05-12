package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.YVq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87498YVq implements InterfaceC50666JuY {
    public final /* synthetic */ C87496YVo LJLIL;

    public C87498YVq(C87496YVo c87496YVo) {
        this.LJLIL = c87496YVo;
    }

    @Override // X.InterfaceC50666JuY
    public final void Yv(Exception exc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBatchDetailFailed: ");
        LIZ.append(exc);
        C36922EeM.LIZLLL(6, "ChatInnerCellOperator", X1D.LIZIZ(LIZ));
        if ((exc instanceof C38306F1q) && ((C38306F1q) exc).getErrorCode() == 2053) {
            s00(null);
            return;
        }
        C87496YVo c87496YVo = this.LJLIL;
        KQA kqa = c87496YVo.LJLJLLL;
        if (kqa != null) {
            kqa.c0(c87496YVo.LJLJI);
        }
        C87496YVo c87496YVo2 = this.LJLIL;
        boolean z = c87496YVo2.LJLJI;
        c87496YVo2.LJLJI = false;
        if (!z) {
            int i = c87496YVo2.LJLILLLLZI;
            if (i != 1) {
                if (i != 2) {
                    KQA kqa2 = c87496YVo2.LJLJLLL;
                    if (kqa2 != null) {
                        kqa2.nc(exc);
                        return;
                    }
                    return;
                }
                KQA kqa3 = c87496YVo2.LJLJLLL;
                if (kqa3 == null) {
                    return;
                }
                kqa3.Qw(exc);
                return;
            }
            KQA kqa4 = c87496YVo2.LJLJLLL;
            if (kqa4 == null) {
                return;
            }
            kqa4.cb0(exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.OQg] */
    @Override // X.InterfaceC50666JuY
    public final void s00(List<Aweme> list) {
        Integer num;
        List list2;
        List<C4J7> list3;
        ?? arrayList;
        Aweme aweme;
        long startIndex;
        long startIndex2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBatchDetailSuccess: ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        C36922EeM.LIZLLL(4, "ChatInnerCellOperator", X1D.LIZIZ(LIZ));
        C87496YVo c87496YVo = this.LJLIL;
        KQA kqa = c87496YVo.LJLJLLL;
        if (kqa != null) {
            kqa.c0(c87496YVo.LJLJI);
        }
        C87496YVo c87496YVo2 = this.LJLIL;
        c87496YVo2.LJLJI = false;
        C102283zs c102283zs = c87496YVo2.LJLLL.LIZ;
        if (c102283zs == null || (list2 = c102283zs.LIZ) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        if (c102283zs == null || (list3 = c102283zs.LIZ) == null) {
            list3 = C61878OQg.INSTANCE;
        }
        boolean z = true;
        if (list3.isEmpty()) {
            arrayList = C61878OQg.INSTANCE;
        } else {
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            for (Aweme aweme2 : list) {
                linkedHashMap.put(aweme2.getAid(), aweme2);
            }
            C87496YVo c87496YVo3 = this.LJLIL;
            arrayList = new ArrayList(C32I.LJJL(list3, 10));
            for (C4J7 c4j7 : list3) {
                Aweme aweme3 = (Aweme) linkedHashMap.get(c4j7.LIZIZ);
                if (aweme3 == null || (aweme = aweme3.m114clone()) == null) {
                    c87496YVo3.getClass();
                    aweme = new Aweme();
                    AwemeStatus awemeStatus = new AwemeStatus();
                    aweme.setCanPlay(false);
                    awemeStatus.setDelete(true);
                    aweme.setStatus(awemeStatus);
                    User user = new User();
                    user.setAdFake(false);
                    aweme.setAuthor(user);
                    aweme.setAid(c4j7.LIZIZ);
                }
                arrayList.add(c87496YVo3.LIZLLL(c4j7.LIZJ, aweme));
            }
        }
        C87496YVo c87496YVo4 = this.LJLIL;
        int i = c87496YVo4.LJLILLLLZI;
        if (i != 1) {
            if (i != 2) {
                c87496YVo4.LJLLJ.addAll(arrayList);
                C87496YVo c87496YVo5 = this.LJLIL;
                C4J7 c4j72 = (C4J7) ORZ.LLFII(list2);
                if (c4j72 != null) {
                    startIndex2 = c4j72.LIZJ;
                } else {
                    startIndex2 = this.LJLIL.LJLIL.getStartIndex();
                }
                c87496YVo5.LJLJJL = startIndex2;
                C87496YVo c87496YVo6 = this.LJLIL;
                KQA kqa2 = c87496YVo6.LJLJLLL;
                if (kqa2 != null) {
                    List<Aweme> list4 = c87496YVo6.LJLLJ;
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(list4, 10));
                    Iterator<Aweme> it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next());
                    }
                    C102283zs c102283zs2 = this.LJLIL.LJLLL.LIZ;
                    if (c102283zs2 != null) {
                        z = c102283zs2.LIZIZ;
                    }
                    kqa2.j0(arrayList2, z);
                    return;
                }
                return;
            }
            c87496YVo4.LJLLJ.addAll(0, arrayList);
            C87496YVo c87496YVo7 = this.LJLIL;
            C4J7 c4j73 = (C4J7) ORZ.LJLLLL(list2);
            if (c4j73 != null) {
                startIndex = c4j73.LIZJ;
            } else {
                startIndex = this.LJLIL.LJLIL.getStartIndex();
            }
            c87496YVo7.LJLJJLL = startIndex;
            C87496YVo c87496YVo8 = this.LJLIL;
            KQA kqa3 = c87496YVo8.LJLJLLL;
            if (kqa3 != null) {
                List<Aweme> list5 = c87496YVo8.LJLLJ;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list5, 10));
                Iterator<Aweme> it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(it2.next());
                }
                C102283zs c102283zs3 = this.LJLIL.LJLLL.LIZ;
                if (c102283zs3 != null) {
                    z = c102283zs3.LIZIZ;
                }
                kqa3.jh(arrayList3, z);
                return;
            }
            return;
        }
        c87496YVo4.LJLLJ.clear();
        this.LJLIL.LJLLJ.addAll(arrayList);
        if (list2.isEmpty()) {
            C87496YVo c87496YVo9 = this.LJLIL;
            c87496YVo9.LJLJJLL = c87496YVo9.LJLIL.getStartIndex();
            C87496YVo c87496YVo10 = this.LJLIL;
            c87496YVo10.LJLJJL = c87496YVo10.LJLIL.getStartIndex();
        } else {
            this.LJLIL.LJLJJLL = ((C4J7) ORZ.LJLLJ(list2)).LIZJ;
            this.LJLIL.LJLJJL = ((C4J7) ORZ.LLFF(list2)).LIZJ;
        }
        C87496YVo c87496YVo11 = this.LJLIL;
        KQA kqa4 = c87496YVo11.LJLJLLL;
        if (kqa4 != null) {
            List<Aweme> list6 = c87496YVo11.LJLLJ;
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(list6, 10));
            Iterator<Aweme> it3 = list6.iterator();
            while (it3.hasNext()) {
                arrayList4.add(it3.next());
            }
            C102283zs c102283zs4 = this.LJLIL.LJLLL.LIZ;
            if (c102283zs4 != null) {
                z = c102283zs4.LIZIZ;
            }
            kqa4.J5(arrayList4, z);
        }
    }
}
