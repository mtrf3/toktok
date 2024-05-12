package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JhV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49857JhV extends AbstractC50421Jqb<AbstractC49845JhJ, C49903JiF> implements InterfaceC50391Jq7, InterfaceC50394JqA, InterfaceC50393Jq9, InterfaceC49872Jhk, InterfaceC50392Jq8, InterfaceC49873Jhl {
    public final ArrayList<InterfaceC49869Jhh> LJLIL;

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 9;
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC49872Jhk
    public final IE6 LIZ() {
        IE6 mModel = this.mModel;
        o.LJIIIIZZ(mModel, "mModel");
        return mModel;
    }

    @Override // X.InterfaceC50392Jq8
    public final void Mt() {
        this.mModel.Mt();
    }

    public C49857JhV(AbstractC49845JhJ model) {
        o.LJIIIZ(model, "model");
        this.LJLIL = new ArrayList<>();
        this.mModel = model;
        model.addNotifyListener(new C49858JhW(this));
        this.mPresenter = new C49903JiF();
    }

    @Override // X.InterfaceC50391Jq7
    public final void bindPreLoadView(InterfaceC51032K1c interfaceC51032K1c) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJL = interfaceC51032K1c;
    }

    @Override // X.InterfaceC50391Jq7
    public final void setPreLoad(boolean z) {
        ((AbstractC51030K1a) this.mPresenter).LJLJJLL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[LOOP:4: B:123:0x00c6->B:140:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0107  */
    @Override // X.InterfaceC50393Jq9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zj0(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49857JhV.zj0(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.InterfaceC50394JqA
    public final boolean R2(int i, Aweme aweme) {
        return this.mModel.LJIJJLI(i, aweme);
    }

    @Override // X.InterfaceC49873Jhl
    public final void ec(C2KC<Aweme> c2kc, List<? extends Aweme> list) {
        T t;
        PRESENTER presenter = this.mPresenter;
        if (presenter != 0 && (t = presenter.LJLIL) != 0) {
            int i = c2kc.LIZIZ;
            List<Aweme> insertList = c2kc.LIZ;
            if (list.isEmpty()) {
                list = new ArrayList<>();
            }
            if (C65777Prh.LJI(list)) {
                if (i >= 0 && i <= list.size()) {
                    o.LJIIIIZZ(insertList, "insertList");
                    list.addAll(i, insertList);
                    C2KF c2kf = new C2KF(c2kc, list);
                    List<C8BT> list2 = t.mNotifyListeners;
                    if (list2 != null && list2.size() != 0) {
                        for (C8BT c8bt : t.mNotifyListeners) {
                            if (c8bt instanceof C49903JiF) {
                                C51031K1b c51031K1b = (C51031K1b) c8bt;
                                if (!c51031K1b.onItemInsertedNew(c2kf)) {
                                    c51031K1b.onItemInserted(c2kf.LJ, c2kf.LIZIZ);
                                }
                            }
                        }
                    }
                    C50440Jqu.LIZJ = true;
                    return;
                }
                throw new C49866Jhe(i, list.size());
            }
        }
    }

    @Override // X.InterfaceC50392Jq8
    public final void zX(int i, int i2, Aweme aweme) {
        this.mModel.zX(i, i2, aweme);
    }

    @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        Iterator<InterfaceC49869Jhh> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        super.request(i, feedParam, i2, z);
    }
}
