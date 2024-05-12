package com.bytedance.ext_power_list;

import X.AbstractC57774Mlu;
import X.C57775Mlv;
import X.C72313SZp;
import X.C76800UCe;
import X.C84284X6a;
import X.C84285X6b;
import X.C84360X8y;
import X.C84361X8z;
import X.C8HZ;
import X.InterfaceC2064888m;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.ORZ;
import X.OSZ;
import X.SZP;
import X.X6X;
import X.X6Y;
import X.X6Z;
import X.X90;
import X.X91;
import X.X92;
import X.X93;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS102S0101000_15;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS17S0202000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS64S0201000_15;
import kotlin.jvm.internal.AqS6S0600000_15;
import kotlin.jvm.internal.IDqS439S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class AssemSingleListViewModel<ITEM, S extends InterfaceC2064888m<S, ITEM>, Cursor> extends AssemViewModel<S> {
    public OSZ<? extends Cursor, ? extends Cursor> lastPageResult = new OSZ<>(null, null);

    public abstract void newState(C8HZ<ITEM> c8hz);

    public Object whenLoadLatest(Cursor cursor, InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>> interfaceC67352kd) {
        Object LIZIZ;
        LIZIZ = C57775Mlv.LIZIZ();
        return LIZIZ;
    }

    public abstract Object whenLoadMore(Cursor cursor, InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>> interfaceC67352kd);

    public abstract Object whenRefresh(InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>> interfaceC67352kd);

    public void listClear() {
        withState(new AqS181S0100000_15(this, 13));
    }

    public void manualListRefresh() {
        withState(new AqS181S0100000_15(this, 12));
    }

    public List<ITEM> listGetAll() {
        return ((InterfaceC2064888m) getState()).getListItemState();
    }

    public void listAddAll(Collection<? extends ITEM> elements) {
        o.LJIIIZ(elements, "elements");
        withState(new AqS146S0200000_15((AssemSingleListViewModel) this, (Collection) elements, 6));
    }

    public void listAddItem(ITEM item) {
        withState(new AqS146S0200000_15((AssemSingleListViewModel) this, (AssemSingleListViewModel<ITEM, S, int>) item, 7));
    }

    public ITEM listGetAt(int i) {
        List<ITEM> listItemState = ((InterfaceC2064888m) getState()).getListItemState();
        if (listItemState != null) {
            return (ITEM) ListProtector.get(listItemState, i);
        }
        return null;
    }

    public int listIndexOf(ITEM item) {
        List<ITEM> listItemState = ((InterfaceC2064888m) getState()).getListItemState();
        if (listItemState != null) {
            return listItemState.indexOf(item);
        }
        return -1;
    }

    public void listRemoveItem(ITEM item) {
        withState(new AqS146S0200000_15((AssemSingleListViewModel) this, (AssemSingleListViewModel<ITEM, S, int>) item, 8));
    }

    public void listRemoveItemAt(int i) {
        withState(new AqS102S0101000_15(this, i, 1));
    }

    public void listSetItem(ITEM item) {
        withState(new AqS146S0200000_15((AssemSingleListViewModel) this, (AssemSingleListViewModel<ITEM, S, int>) item, 9));
    }

    public void listSetItems(Collection<? extends ITEM> list) {
        o.LJIIIZ(list, "list");
        withState(new AqS146S0200000_15((AssemSingleListViewModel) this, (Collection) list, 10));
    }

    public void manualListLoadLatest(Cursor cursor) {
        if (cursor == null && (cursor = this.lastPageResult.getFirst()) == null) {
            return;
        }
        withState(new AqS146S0200000_15((AssemSingleListViewModel) this, (AssemSingleListViewModel<ITEM, S, int>) cursor, 11));
    }

    public void manualListLoadMore(Cursor cursor) {
        if (cursor == null && (cursor = this.lastPageResult.getSecond()) == null) {
            return;
        }
        withState(new AqS146S0200000_15((AssemSingleListViewModel) this, (AssemSingleListViewModel<ITEM, S, int>) cursor, 5));
    }

    public void listAddAllAt(int i, Collection<? extends ITEM> elements) {
        o.LJIIIZ(elements, "elements");
        withState(new AqS64S0201000_15((AssemSingleListViewModel) this, i, (int) elements, 3));
    }

    public void listAddItemAt(int i, ITEM item) {
        withState(new AqS64S0201000_15((AssemSingleListViewModel) this, (AssemSingleListViewModel<int, S, Cursor>) i, (int) item, 4));
    }

    public void listSetItemAt(int i, ITEM item) {
        withState(new AqS64S0201000_15((AssemSingleListViewModel) this, (AssemSingleListViewModel<int, S, Cursor>) i, (int) item, 5));
    }

    public final void modifyListState(S s, InterfaceC88472Yns<? super List<ITEM>, C76800UCe> interfaceC88472Yns) {
        List arrayList;
        List<ITEM> listItemState = s.getListItemState();
        if (listItemState != null) {
            arrayList = ORZ.LLJILJILJ(listItemState);
        } else {
            arrayList = new ArrayList();
        }
        interfaceC88472Yns.invoke(arrayList);
        newState(C8HZ.LIZIZ(s.getListState(), null, null, null, arrayList, 7));
    }

    public final void refreshInner(InterfaceC65784Pro<Boolean> validation, InterfaceC88472Yns<? super AbstractC57774Mlu<ITEM>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(validation, "validation");
        loadPage(SZP.Refresh, validation, interfaceC88472Yns, new X6X(this, null), new AqS165S0100000_15(this, 33), new IDqS439S0100000_15(this, 2), C84360X8y.LJLIL);
    }

    public void listSetItemsAt(int i, int i2, Collection<? extends ITEM> elements) {
        o.LJIIIZ(elements, "elements");
        withState(new AqS17S0202000_15((AssemSingleListViewModel) this, i, i2, (int) elements, 1));
    }

    public final void loadLatestInner(Cursor cursor, InterfaceC65784Pro<Boolean> validation, InterfaceC88472Yns<? super AbstractC57774Mlu<ITEM>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(validation, "validation");
        loadPage(SZP.Prev, validation, interfaceC88472Yns, new X6Y(this, cursor, null), new AqS165S0100000_15(this, 34), new IDqS439S0100000_15(this, 3), C84361X8z.LJLIL);
    }

    public final void loadMoreInner(Cursor cursor, InterfaceC65784Pro<Boolean> validation, InterfaceC88472Yns<? super AbstractC57774Mlu<ITEM>, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(validation, "validation");
        loadPage(SZP.Next, validation, interfaceC88472Yns, new X6Z(this, cursor, null), new AqS165S0100000_15(this, 35), new IDqS439S0100000_15(this, 4), X90.LJLIL);
    }

    public List<ITEM> onLoadPageAddData(SZP type, List<? extends ITEM> originItem, List<? extends ITEM> newData) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(originItem, "originItem");
        o.LJIIIZ(newData, "newData");
        ArrayList arrayList = new ArrayList();
        int i = C72313SZp.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    arrayList.addAll(newData);
                    arrayList.addAll(originItem);
                }
            } else {
                arrayList.addAll(originItem);
                arrayList.addAll(newData);
            }
        } else {
            arrayList.addAll(newData);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void manualListLoadLatest$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            assemSingleListViewModel.manualListLoadLatest(obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: manualListLoadLatest");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void manualListLoadMore$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            assemSingleListViewModel.manualListLoadMore(obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: manualListLoadMore");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshInner$default(AssemSingleListViewModel assemSingleListViewModel, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                interfaceC65784Pro = X91.LJLIL;
            }
            if ((i & 2) != 0) {
                interfaceC88472Yns = null;
            }
            assemSingleListViewModel.refreshInner(interfaceC65784Pro, interfaceC88472Yns);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshInner");
    }

    public final void handleState(SZP type, AbstractC57774Mlu<ITEM> pageValue, InterfaceC88473Ynt<? super C8HZ<ITEM>, ? super Cursor, ? super Cursor, C8HZ<ITEM>> onSuccess, InterfaceC88471Ynr<? super C8HZ<ITEM>, ? super Throwable, C8HZ<ITEM>> onFail, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(type, "type");
        o.LJIIIZ(pageValue, "pageValue");
        o.LJIIIZ(onSuccess, "onSuccess");
        o.LJIIIZ(onFail, "onFail");
        withState(new AqS6S0600000_15((AbstractC57774Mlu) pageValue, (AssemSingleListViewModel) this, type, (SZP) onSuccess, (InterfaceC88471Ynr) onFail, (InterfaceC65784Pro) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadLatestInner$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                interfaceC65784Pro = X92.LJLIL;
            }
            if ((i & 4) != 0) {
                interfaceC88472Yns = null;
            }
            assemSingleListViewModel.loadLatestInner(obj, interfaceC65784Pro, interfaceC88472Yns);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadLatestInner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadMoreInner$default(AssemSingleListViewModel assemSingleListViewModel, Object obj, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                interfaceC65784Pro = X93.LJLIL;
            }
            if ((i & 4) != 0) {
                interfaceC88472Yns = null;
            }
            assemSingleListViewModel.loadMoreInner(obj, interfaceC65784Pro, interfaceC88472Yns);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreInner");
    }

    private final void loadPage(SZP szp, InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC88472Yns<? super AbstractC57774Mlu<ITEM>, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super InterfaceC67352kd<? super AbstractC57774Mlu<ITEM>>, ? extends Object> interfaceC88472Yns2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC88473Ynt<? super C8HZ<ITEM>, ? super Cursor, ? super Cursor, C8HZ<ITEM>> interfaceC88473Ynt, InterfaceC88471Ynr<? super C8HZ<ITEM>, ? super Throwable, C8HZ<ITEM>> interfaceC88471Ynr) {
        interfaceC65784Pro2.invoke();
        XKX.LIZLLL(getAssemVMScope(), null, null, new C84284X6a(this, interfaceC65784Pro, szp, interfaceC88473Ynt, interfaceC88471Ynr, interfaceC88472Yns2, interfaceC88472Yns, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleState$default(AssemSingleListViewModel assemSingleListViewModel, SZP szp, AbstractC57774Mlu abstractC57774Mlu, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65784Pro interfaceC65784Pro, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                interfaceC65784Pro = null;
            }
            assemSingleListViewModel.handleState(szp, abstractC57774Mlu, interfaceC88473Ynt, interfaceC88471Ynr, interfaceC65784Pro);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleState");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadPage$default(AssemSingleListViewModel assemSingleListViewModel, SZP szp, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                interfaceC65784Pro = C84285X6b.LJLIL;
            }
            if ((i & 4) != 0) {
                interfaceC88472Yns = null;
            }
            assemSingleListViewModel.loadPage(szp, interfaceC65784Pro, interfaceC88472Yns, interfaceC88472Yns2, interfaceC65784Pro2, interfaceC88473Ynt, interfaceC88471Ynr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPage");
    }
}
