package X;

import Y.ARunnableS51S0100000_15;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.YVo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87496YVo implements InterfaceC51679KPz, InterfaceC50391Jq7, InterfaceC51771KTn, InterfaceC224118qt {
    public final InterfaceC87502YVu LJLIL;
    public boolean LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public KQA LJLJLLL;
    public boolean LJLL;
    public final boolean LJLLI;
    public final int LJLLILLLL;
    public final List<Aweme> LJLLJ;
    public final C87500YVs LJLLL;
    public final C87498YVq LJLLLL;
    public int LJLILLLLZI = 1;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 258));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C87505YVx.LJLIL);

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

    @Override // X.InterfaceC51771KTn
    public final /* synthetic */ boolean shouldSetRefreshListener() {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
        this.LJLL = false;
        this.LJLJLLL = null;
        this.LJLLJ.clear();
        LIZ().LIZIZ();
        LIZ().LJJII();
        this.LJLIL.LIZIZ();
    }

    public final C50908JyS LIZ() {
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
        if (this.LJLLL.LIZIZ || LIZ().LJJIFFI()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        return this.LJLLJ;
    }

    public C87496YVo(InterfaceC87502YVu interfaceC87502YVu) {
        boolean z;
        int i;
        List<Aweme> arrayList;
        this.LJLIL = interfaceC87502YVu;
        this.LJLJJL = interfaceC87502YVu.getStartIndex();
        this.LJLJJLL = interfaceC87502YVu.getStartIndex();
        List<OSZ<Aweme, Long>> LIZLLL = interfaceC87502YVu.LIZLLL();
        if (LIZLLL == null || LIZLLL.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLI = !z;
        List<OSZ<Aweme, Long>> LIZLLL2 = interfaceC87502YVu.LIZLLL();
        if (LIZLLL2 != null) {
            Iterator<OSZ<Aweme, Long>> it = LIZLLL2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OSZ<Aweme, Long> next = it.next();
                if (next.getSecond().longValue() == this.LJLIL.getStartIndex()) {
                    if (next != null) {
                        i = LIZLLL2.indexOf(next);
                    }
                }
            }
        }
        i = -1;
        this.LJLLILLLL = i;
        List<OSZ<Aweme, Long>> LIZLLL3 = this.LJLIL.LIZLLL();
        if (LIZLLL3 != null) {
            if (i >= 0) {
                List<OSZ<Aweme, Long>> subList = LIZLLL3.subList(i, LIZLLL3.size());
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(subList, 10));
                for (OSZ<Aweme, Long> osz : subList) {
                    arrayList2.add(LIZLLL(osz.getSecond().longValue(), osz.getFirst()));
                }
                arrayList = ORZ.LLJILJILJ(arrayList2);
            } else {
                arrayList = new ArrayList<>();
            }
        } else if (this.LJLIL.getCurrentAweme() != null) {
            Aweme[] awemeArr = new Aweme[1];
            Aweme currentAweme = this.LJLIL.getCurrentAweme();
            if (currentAweme != null) {
                awemeArr[0] = LIZLLL(this.LJLIL.getStartIndex(), currentAweme);
                arrayList = C47261Igj.LJJIJIL(awemeArr);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            arrayList = new ArrayList<>();
        }
        this.LJLLJ = arrayList;
        this.LJLLL = new C87500YVs(this);
        this.LJLLLL = new C87498YVq(this);
    }

    public final void LIZIZ(int i) {
        if (isLoading() || System.currentTimeMillis() - this.LJLJJI < 500) {
            return;
        }
        KQA kqa = this.LJLJLLL;
        if (kqa != null) {
            kqa.c0(this.LJLJI);
        }
        this.LJLILLLLZI = i;
        this.LJLLL.LIZIZ = true;
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

    public final void LIZJ(int i) {
        int i2;
        List<OSZ<Aweme, Long>> LIZLLL;
        List<OSZ<Aweme, Long>> subList;
        if (!this.LJLL) {
            return;
        }
        KQA kqa = this.LJLJLLL;
        if (kqa != null) {
            kqa.c0(this.LJLJI);
        }
        this.LJLJI = false;
        if (i != 1) {
            if (i != 2) {
                KQA kqa2 = this.LJLJLLL;
                if (kqa2 != null) {
                    List<Aweme> list = this.LJLLJ;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                    Iterator<Aweme> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                    kqa2.j0(arrayList, false);
                    return;
                }
                return;
            }
            List<OSZ<Aweme, Long>> LIZLLL2 = this.LJLIL.LIZLLL();
            if (LIZLLL2 != null) {
                i2 = LIZLLL2.size();
            } else {
                i2 = 0;
            }
            if (this.LJLLI && this.LJLLJ.size() != i2 && this.LJLLILLLL > 0 && (LIZLLL = this.LJLIL.LIZLLL()) != null && (subList = LIZLLL.subList(0, this.LJLLILLLL)) != null) {
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(subList, 10));
                for (OSZ<Aweme, Long> osz : subList) {
                    arrayList2.add(LIZLLL(osz.getSecond().longValue(), osz.getFirst()));
                }
                this.LJLLJ.addAll(0, arrayList2);
            }
            KQA kqa3 = this.LJLJLLL;
            if (kqa3 != null) {
                List<Aweme> list2 = this.LJLLJ;
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<Aweme> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(it2.next());
                }
                kqa3.jh(arrayList3, false);
                return;
            }
            return;
        }
        KQA kqa4 = this.LJLJLLL;
        if (kqa4 != null) {
            List<Aweme> list3 = this.LJLLJ;
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(list3, 10));
            Iterator<Aweme> it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(it3.next());
            }
            kqa4.J5(arrayList4, false);
        }
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        IFeedFragmentAbility LJIILL;
        ILoadMoreAbility PZ;
        View view;
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        this.LJLL = true;
        this.LJLJLLL = detailFragmentPanel;
        LIZ().LJLILLLLZI = this.LJLLLL;
        LIZ().LJJ((C8BS) this.LJLJL.getValue());
        this.LJLIL.LIZ(this.LJLLL);
        if (!this.LJLLJ.isEmpty()) {
            KQA kqa = this.LJLJLLL;
            if (kqa != null) {
                List<Aweme> list = this.LJLLJ;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<Aweme> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                kqa.J5(arrayList, true);
            }
            if (!this.LJLLI) {
                this.LJLJI = true;
                LIZIZ(4);
            } else {
                Fragment fragment = detailFragmentPanel.getFragment();
                if (fragment != null && (view = fragment.getView()) != null) {
                    view.post(new ARunnableS51S0100000_15(this, 27));
                }
            }
        }
        final Fragment fragment2 = detailFragmentPanel.getFragment();
        if (fragment2 != null) {
            try {
                View view2 = fragment2.getView();
                if (view2 != null && (LJIILL = C78688UuS.LJIILL(C55230Lly.LJ(view2))) != null && (PZ = LJIILL.PZ()) != null) {
                    PZ.Up0(new AbstractC244919jL() { // from class: X.9Xz
                        @Override // X.AbstractC244919jL, X.InterfaceC55109Lk1
                        public final void onShow() {
                            ActivityC45651qj mo49getActivity;
                            Fragment fragment3 = Fragment.this;
                            if (fragment3.isResumed() && (mo49getActivity = fragment3.mo49getActivity()) != null) {
                                mo49getActivity.finish();
                            }
                        }
                    });
                }
            } catch (Exception unused) {
            }
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
            java.lang.String r0 = "ChatInnerCellOperator"
            X.C36922EeM.LIZLLL(r1, r0, r2)
            X.YVu r0 = r4.LJLIL
            r0.deleteItem(r5)
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLLJ
            int r3 = r0.size()
            r1 = 0
            r2 = 0
        L28:
            if (r2 >= r3) goto L3e
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLLJ
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
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r4.LJLLJ
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
        throw new UnsupportedOperationException("Method not decompiled: X.C87496YVo.deleteItem(java.lang.String):boolean");
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        this.LJLJI = true;
    }

    public final Aweme LIZLLL(long j, Aweme aweme) {
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
        if (this.LJLLI) {
            LIZJ(i);
        } else {
            LIZIZ(i);
        }
    }
}
