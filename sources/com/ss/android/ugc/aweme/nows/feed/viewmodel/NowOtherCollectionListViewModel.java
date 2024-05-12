package com.ss.android.ugc.aweme.nows.feed.viewmodel;

import X.A2F;
import X.A2G;
import X.C194567kK;
import X.C194667kU;
import X.C195617m1;
import X.C195627m2;
import X.C195637m3;
import X.C195667m6;
import X.C195677m7;
import X.C2050482y;
import X.C33Q;
import X.C61878OQg;
import X.C78596Usy;
import X.C78949Uyf;
import X.C79234V7u;
import X.C7ML;
import X.C8HZ;
import X.EnumC195697m9;
import X.InterfaceC194547kI;
import X.InterfaceC55235Lm3;
import X.InterfaceC67352kd;
import X.ORZ;
import X.XKX;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowOtherCollectionListViewModel extends AssemListViewModel<C194567kK, InterfaceC194547kI, Long> {
    public boolean LJLJI;
    public InterfaceC55235Lm3 LJLJJL;
    public volatile C195627m2 LJLIL = new C195627m2(new Aweme(), 0, false, null, 510);
    public String LJLILLLLZI = "";
    public final C194667kU LJLJJI = C78596Usy.LJJIFFI();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C194567kK(0);
    }

    public final CopyOnWriteArrayList<EnumC195697m9> hv0() {
        return this.LJLIL.LJLJL.LJII;
    }

    public final void iv0(int i) {
        if (!this.LJLIL.LJLJL.LIZIZ || this.LJLIL.LJLJL.LIZJ == 0 || this.LJLIL.LJLJL.LIZLLL.length() == 0 || hv0().isEmpty() || i < 0) {
            return;
        }
        if (C79234V7u.LJJ(hv0())) {
            CopyOnWriteArrayList<EnumC195697m9> hv0 = hv0();
            C195667m6 c195667m6 = new C195667m6(this);
            o.LJIIIZ(hv0, "<this>");
            if (i >= hv0.size() || ListProtector.get(hv0, i) != EnumC195697m9.FAKE) {
                return;
            }
            List<? extends EnumC195697m9> LLJILJILJ = ORZ.LLJILJILJ(hv0);
            ListProtector.set(LLJILJILJ, i, EnumC195697m9.FAKE_TRAN_WAIT);
            c195667m6.invoke(LLJILJILJ);
            return;
        }
        CopyOnWriteArrayList<EnumC195697m9> hv02 = hv0();
        o.LJIIIZ(hv02, "<this>");
        ListIterator<EnumC195697m9> listIterator = hv02.listIterator(hv02.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            if (listIterator.previous() == EnumC195697m9.NO_FAKE) {
                int nextIndex = listIterator.nextIndex();
                if (nextIndex != -1 && nextIndex >= i) {
                    return;
                }
            }
        }
        CopyOnWriteArrayList<EnumC195697m9> hv03 = hv0();
        C195677m7 c195677m7 = new C195677m7(this);
        o.LJIIIZ(hv03, "<this>");
        Iterator<EnumC195697m9> it = hv03.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next() != EnumC195697m9.NO_FAKE) {
                if (i2 != -1) {
                    List<? extends EnumC195697m9> LLJILJILJ2 = ORZ.LLJILJILJ(hv03);
                    int min = Math.min((i2 + 20) - 1, ((ArrayList) LLJILJILJ2).size() - 1);
                    if (i2 <= min) {
                        while (true) {
                            ListProtector.set(LLJILJILJ2, i2, EnumC195697m9.FAKE_TRAN_ING);
                            if (i2 == min) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    c195677m7.invoke(LLJILJILJ2);
                }
            } else {
                i2++;
            }
        }
        XKX.LIZLLL(getAssemVMScope(), null, null, new C195617m1(this, this.LJLIL.LJLJL.LIZLLL, null), 3);
    }

    public final void jv0(List<InterfaceC194547kI> list) {
        if (this.LJLIL.LJLIL.getAuthor() == null) {
            return;
        }
        Iterator<InterfaceC194547kI> it = list.iterator();
        while (it.hasNext()) {
            it.next().getAweme().setAuthor(this.LJLIL.LJLIL.getAuthor());
        }
    }

    public final synchronized void kv0(List<? extends EnumC195697m9> list) {
        C195637m3 c195637m3 = this.LJLIL.LJLJL;
        CopyOnWriteArrayList<EnumC195697m9> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);
        c195637m3.getClass();
        c195637m3.LJII = copyOnWriteArrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC194547kI> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 346));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L30;
     */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r19) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.viewmodel.NowOtherCollectionListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    public final void gv0(Aweme aweme, List list) {
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (o.LJ(((C7ML) it.next()).getAweme().getAid(), aweme.getAid())) {
                if (i != -1) {
                    ListProtector.set(list, i, C78949Uyf.LJIILIIL(aweme, null, null, ((C7ML) ListProtector.get(list, i)).z(), this.LJLJJL, true, false, this.LJLJI, this.LJLIL.LJLJLLL, 1606));
                    return;
                }
            } else {
                i++;
            }
        }
        arrayList.add(C78949Uyf.LJIILIIL(aweme, null, null, this.LJLIL.LJLJI, this.LJLJJL, true, false, this.LJLJI, this.LJLIL.LJLJLLL, 1606));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        return A2F.LJ(A2G.LIZ, null, new Long(this.LJLIL.LJLJL.LIZJ), C61878OQg.INSTANCE, 1);
    }
}
