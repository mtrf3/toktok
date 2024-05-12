package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YVp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87497YVp implements InterfaceC51679KPz, InterfaceC50391Jq7, InterfaceC51771KTn, InterfaceC224118qt {
    public final InterfaceC87502YVu LJLIL;
    public boolean LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public KQA LJLJLLL;
    public final List<Aweme> LJLL;
    public final C87499YVr LJLLI;
    public final C87501YVt LJLLILLLL;
    public int LJLILLLLZI = 1;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 257));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C87504YVw.LJLIL);

    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
    }

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final /* synthetic */ boolean cannotLoadMore() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 7000;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLJLLL = null;
        this.LJLL.clear();
        LIZIZ().LIZIZ();
        LIZIZ().LJJII();
        this.LJLIL.LIZIZ();
    }

    public final C50908JyS LIZIZ() {
        return (C50908JyS) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLJL.getValue();
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        if (this.LJLIL.getCurrentAweme() == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        if (this.LJLLI.LIZIZ || LIZIZ().LJJIFFI()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51771KTn
    public final boolean shouldSetRefreshListener() {
        return this.LJLIL.LJI();
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        return this.LJLL;
    }

    public C87497YVp(InterfaceC87502YVu interfaceC87502YVu) {
        List<Aweme> arrayList;
        this.LJLIL = interfaceC87502YVu;
        this.LJLJJL = interfaceC87502YVu.getStartIndex();
        this.LJLJJLL = interfaceC87502YVu.getStartIndex();
        if (interfaceC87502YVu.getCurrentAweme() != null) {
            Aweme[] awemeArr = new Aweme[1];
            Aweme currentAweme = interfaceC87502YVu.getCurrentAweme();
            if (currentAweme != null) {
                awemeArr[0] = LJ(interfaceC87502YVu.getStartIndex(), currentAweme);
                arrayList = C47261Igj.LJJIJIL(awemeArr);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            arrayList = new ArrayList<>();
        }
        this.LJLL = arrayList;
        this.LJLLI = new C87499YVr(this);
        this.LJLLILLLL = new C87501YVt(this);
    }

    public static boolean LIZ(C102283zs c102283zs) {
        List<C4J7> list = c102283zs.LIZ;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C4J7> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().LIZ == null) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.OQg] */
    public final void LIZJ(List<? extends Aweme> list) {
        List list2;
        List<C4J7> list3;
        ?? arrayList;
        Aweme m114clone;
        Aweme aweme;
        long startIndex;
        long startIndex2;
        KQA kqa = this.LJLJLLL;
        if (kqa != null) {
            kqa.c0(this.LJLJI);
        }
        this.LJLJI = false;
        C102283zs c102283zs = this.LJLLI.LIZ;
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
            arrayList = new ArrayList(C32I.LJJL(list3, 10));
            for (C4J7 c4j7 : list3) {
                if (!IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZIZ()) {
                    m114clone = c4j7.LIZ;
                } else {
                    Aweme aweme3 = c4j7.LIZ;
                    if (aweme3 != null) {
                        m114clone = aweme3.m114clone();
                    }
                    aweme = (Aweme) linkedHashMap.get(c4j7.LIZIZ);
                    if (aweme != null || (m114clone = aweme.m114clone()) == null) {
                        m114clone = new Aweme();
                        AwemeStatus awemeStatus = new AwemeStatus();
                        m114clone.setCanPlay(false);
                        awemeStatus.setDelete(true);
                        m114clone.setStatus(awemeStatus);
                        User user = new User();
                        user.setAdFake(false);
                        m114clone.setAuthor(user);
                        m114clone.setAid(c4j7.LIZIZ);
                    }
                    arrayList.add(LJ(c4j7.LIZJ, m114clone));
                }
                if (m114clone != null) {
                    arrayList.add(LJ(c4j7.LIZJ, m114clone));
                }
                aweme = (Aweme) linkedHashMap.get(c4j7.LIZIZ);
                if (aweme != null) {
                }
                m114clone = new Aweme();
                AwemeStatus awemeStatus2 = new AwemeStatus();
                m114clone.setCanPlay(false);
                awemeStatus2.setDelete(true);
                m114clone.setStatus(awemeStatus2);
                User user2 = new User();
                user2.setAdFake(false);
                m114clone.setAuthor(user2);
                m114clone.setAid(c4j7.LIZIZ);
                arrayList.add(LJ(c4j7.LIZJ, m114clone));
            }
        }
        int i = this.LJLILLLLZI;
        if (i != 1) {
            if (i != 2) {
                this.LJLL.addAll(arrayList);
                C4J7 c4j72 = (C4J7) ORZ.LLFII(list2);
                if (c4j72 != null) {
                    startIndex2 = c4j72.LIZJ;
                } else {
                    startIndex2 = this.LJLIL.getStartIndex();
                }
                this.LJLJJL = startIndex2;
                KQA kqa2 = this.LJLJLLL;
                if (kqa2 != null) {
                    List<Aweme> list4 = this.LJLL;
                    C102283zs c102283zs2 = this.LJLLI.LIZ;
                    if (c102283zs2 != null) {
                        z = c102283zs2.LIZIZ;
                    }
                    kqa2.j0(list4, z);
                }
            } else {
                this.LJLL.addAll(0, arrayList);
                C4J7 c4j73 = (C4J7) ORZ.LJLLLL(list2);
                if (c4j73 != null) {
                    startIndex = c4j73.LIZJ;
                } else {
                    startIndex = this.LJLIL.getStartIndex();
                }
                this.LJLJJLL = startIndex;
                KQA kqa3 = this.LJLJLLL;
                if (kqa3 != null) {
                    List<Aweme> list5 = this.LJLL;
                    C102283zs c102283zs3 = this.LJLLI.LIZ;
                    if (c102283zs3 != null) {
                        z = c102283zs3.LIZIZ;
                    }
                    kqa3.jh(list5, z);
                }
            }
        } else {
            this.LJLL.clear();
            this.LJLL.addAll(arrayList);
            if (list2.isEmpty()) {
                this.LJLJJLL = this.LJLIL.getStartIndex();
                this.LJLJJL = this.LJLIL.getStartIndex();
            } else {
                this.LJLJJLL = ((C4J7) ORZ.LJLLJ(list2)).LIZJ;
                this.LJLJJL = ((C4J7) ORZ.LLFF(list2)).LIZJ;
            }
            KQA kqa4 = this.LJLJLLL;
            if (kqa4 != null) {
                List<Aweme> list6 = this.LJLL;
                C102283zs c102283zs4 = this.LJLLI.LIZ;
                if (c102283zs4 != null) {
                    z = c102283zs4.LIZIZ;
                }
                kqa4.J5(list6, z);
            }
        }
        this.LJLLI.LIZIZ = false;
    }

    public final void LIZLLL(int i) {
        if (isLoading() || System.currentTimeMillis() - this.LJLJJI < 500) {
            return;
        }
        KQA kqa = this.LJLJLLL;
        if (kqa != null) {
            kqa.c0(this.LJLJI);
        }
        this.LJLILLLLZI = i;
        this.LJLLI.LIZIZ = true;
        if (i != 1) {
            if (i != 2) {
                this.LJLIL.LJ(this.LJLJJL);
                return;
            } else {
                this.LJLIL.LJFF(this.LJLJJLL);
                return;
            }
        }
        this.LJLIL.refresh();
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.LJLJLLL = detailFragmentPanel;
        LIZIZ().LJLILLLLZI = this.LJLLILLLL;
        LIZIZ().LJJ((C8BS) this.LJLJL.getValue());
        this.LJLIL.LIZ(this.LJLLI);
        if (this.LJLIL.getCurrentAweme() != null) {
            KQA kqa = this.LJLJLLL;
            if (kqa != null) {
                kqa.J5(this.LJLL, true);
            }
            this.LJLJI = true;
            LIZLLL(4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
    
        return false;
     */
    @Override // X.InterfaceC51679KPz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean deleteItem(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "aid"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "deleteItem: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            r1 = 4
            java.lang.String r0 = "ExtDetailChatOperator2"
            X.C36922EeM.LIZLLL(r1, r0, r2)
            X.YVu r0 = r4.LJLIL
            r0.deleteItem(r5)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLL
            int r3 = r0.size()
            r1 = 0
            r2 = 0
        L28:
            if (r2 >= r3) goto L3e
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r0 = r0.getAid()
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 == 0) goto L3f
            if (r2 >= 0) goto L42
        L3e:
            return r1
        L3f:
            int r2 = r2 + 1
            goto L28
        L42:
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLL
            com.bytedance.mt.protector.impl.collections.ListProtector.remove(r0, r2)
            long r0 = java.lang.System.currentTimeMillis()
            r4.LJLJJI = r0
            X.KQA r0 = r4.LJLJLLL
            if (r0 == 0) goto L54
            r0.onItemDeleted(r2)
        L54:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87497YVp.deleteItem(java.lang.String):boolean");
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        this.LJLJI = true;
    }

    public final Aweme LJ(long j, Aweme aweme) {
        if (IMService.createIIMServicebyMonsterPlugin(false).getImVideoService().LIZJ() && !this.LJLIL.LIZJ()) {
            aweme.setImItemId(String.valueOf(j));
            return aweme;
        }
        Aweme aweme2 = new Aweme();
        aweme2.setAid(String.valueOf(j));
        aweme2.setAwemeType(13);
        aweme2.setForwardItem(aweme);
        aweme.setImItemId(aweme2.getAid());
        return aweme2;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        LIZLLL(i);
    }
}
