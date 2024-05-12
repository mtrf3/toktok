package com.bytedance.ext_power_list;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2I;
import X.A2V;
import X.AbstractC57774Mlu;
import X.AbstractC72278SYg;
import X.C162476Zf;
import X.C221108m2;
import X.C57775Mlv;
import X.C57776Mlw;
import X.C57777Mlx;
import X.C57983MpH;
import X.C5H3;
import X.C72808Sho;
import X.C8HZ;
import X.InterfaceC208718Hb;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.SZP;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS102S0101000_15;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS17S0202000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS64S0201000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class AssemListViewModel<S extends InterfaceC208718Hb<S, ITEM>, ITEM extends InterfaceC57784Mm4, Cursor> extends AssemSingleListViewModel<ITEM, S, Cursor> {
    public final C5H3 config$delegate = C221108m2.LIZIZ(new AqS165S0100000_15((AssemListViewModel) this, 32));
    public C72808Sho<ITEM> state;

    public Object onLoadLatest(Cursor cursor, InterfaceC67352kd<? super A2G<Cursor>> interfaceC67352kd) {
        return onLoadLatest$suspendImpl(this, cursor, interfaceC67352kd);
    }

    public abstract Object onLoadMore(Cursor cursor, InterfaceC67352kd<? super A2G<Cursor>> interfaceC67352kd);

    public abstract Object onRefresh(InterfaceC67352kd<? super A2G<Cursor>> interfaceC67352kd);

    public final AbstractC72278SYg<Cursor> getConfig() {
        return (AbstractC72278SYg) this.config$delegate.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listClear() {
        withState(new AqS181S0100000_15((AssemListViewModel) this, 11));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public List<ITEM> listGetAll() {
        List<InterfaceC57784Mm4> list;
        C72808Sho<ITEM> c72808Sho = this.state;
        if (c72808Sho != null) {
            list = c72808Sho.LJII();
        } else {
            list = null;
        }
        if (!(list instanceof List)) {
            return null;
        }
        return (List<ITEM>) list;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void manualListRefresh() {
        getConfig().getOperator().refresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddAll(Collection<? extends ITEM> elements) {
        o.LJIIIZ(elements, "elements");
        withState(new AqS146S0200000_15((AssemListViewModel) this, (Collection) elements, 0));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddItem(ITEM element) {
        o.LJIIIZ(element, "element");
        withState(new AqS146S0200000_15((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) element, 1));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public ITEM listGetAt(int i) {
        C72808Sho<ITEM> c72808Sho = this.state;
        if (c72808Sho != null) {
            return c72808Sho.LJI(i);
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public int listIndexOf(ITEM element) {
        o.LJIIIZ(element, "element");
        C72808Sho<ITEM> c72808Sho = this.state;
        if (c72808Sho != null) {
            return c72808Sho.LJIIIZ(element);
        }
        return -1;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listRemoveItem(ITEM element) {
        o.LJIIIZ(element, "element");
        withState(new AqS146S0200000_15((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) element, 2));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listRemoveItemAt(int i) {
        withState(new AqS102S0101000_15((AssemListViewModel) this, i, 0));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItem(ITEM element) {
        o.LJIIIZ(element, "element");
        withState(new AqS146S0200000_15((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) element, 3));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItems(Collection<? extends ITEM> list) {
        o.LJIIIZ(list, "list");
        withState(new AqS146S0200000_15((AssemListViewModel) this, (Collection) list, 4));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void manualListLoadLatest(Cursor cursor) {
        getConfig().getOperator().LIZIZ(cursor);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void manualListLoadMore(Cursor cursor) {
        getConfig().getOperator().LIZ(cursor);
    }

    public void manualListRetry(SZP type) {
        o.LJIIIZ(type, "type");
        getConfig().getOperator().LIZJ(type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setListState(C72808Sho<?> powerState) {
        o.LJIIIZ(powerState, "powerState");
        this.state = powerState;
    }

    public final A2G<Cursor> toValue(AbstractC57774Mlu<ITEM> abstractC57774Mlu) {
        if (abstractC57774Mlu instanceof C57983MpH) {
            A2F a2f = A2G.LIZ;
            C57983MpH c57983MpH = (C57983MpH) abstractC57774Mlu;
            Object obj = c57983MpH.LIZIZ;
            Object obj2 = null;
            if (obj == null) {
                obj = null;
            }
            Object obj3 = c57983MpH.LIZJ;
            if (obj3 != null) {
                obj2 = obj3;
            }
            List<T> list = c57983MpH.LIZLLL;
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.ies.powerlist.data.PowerItem>");
            a2f.getClass();
            return A2F.LIZLLL(obj, obj2, list);
        }
        if (abstractC57774Mlu instanceof C57777Mlx) {
            A2F a2f2 = A2G.LIZ;
            Exception exc = new Exception(((C57777Mlx) abstractC57774Mlu).LIZIZ);
            a2f2.getClass();
            return A2F.LIZJ(exc);
        }
        if (abstractC57774Mlu instanceof C57776Mlw) {
            A2F a2f3 = A2G.LIZ;
            List<T> list2 = ((C57776Mlw) abstractC57774Mlu).LIZIZ;
            o.LJII(list2, "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.ies.powerlist.data.PowerItem>");
            a2f3.getClass();
            return A2F.LIZ(list2);
        }
        throw new C162476Zf();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenRefresh(X.InterfaceC67352kd<? super X.AbstractC57774Mlu<ITEM>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.XMR
            if (r0 == 0) goto L39
            r4 = r6
            X.XMR r4 = (X.XMR) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L3f
            com.bytedance.ext_power_list.AssemListViewModel r0 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            X.A2G r3 = (X.A2G) r3
            X.Mlu r0 = r0.toResult(r3, r1)
            return r0
        L29:
            X.C141335gf.LIZJ(r3)
            r4.LJLIL = r5
            r4.LJLJJI = r1
            java.lang.Object r3 = r5.onRefresh(r4)
            if (r3 != r2) goto L37
            return r2
        L37:
            r0 = r5
            goto L22
        L39:
            X.XMR r4 = new X.XMR
            r4.<init>(r5, r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ext_power_list.AssemListViewModel.whenRefresh(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddAllAt(int i, Collection<? extends ITEM> elements) {
        o.LJIIIZ(elements, "elements");
        withState(new AqS64S0201000_15((AssemListViewModel) this, i, (int) elements, 0));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listAddItemAt(int i, ITEM element) {
        o.LJIIIZ(element, "element");
        withState(new AqS64S0201000_15((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) i, (int) element, 1));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItemAt(int i, ITEM element) {
        o.LJIIIZ(element, "element");
        withState(new AqS64S0201000_15((AssemListViewModel) this, (AssemListViewModel<S, int, Cursor>) i, (int) element, 2));
    }

    public final void modifyListState(S s, C72808Sho<ITEM> c72808Sho) {
        newState(C8HZ.LIZIZ(s.getListState(), null, null, null, c72808Sho.LJII(), 7));
    }

    public AbstractC57774Mlu<ITEM> toResult(A2G<Cursor> a2g, boolean z) {
        o.LJIIIZ(a2g, "<this>");
        if (a2g instanceof A2V) {
            A2V a2v = (A2V) a2g;
            T t = a2v.LIZIZ;
            T t2 = a2v.LIZJ;
            List<InterfaceC57784Mm4> list = a2v.LIZLLL;
            o.LJII(list, "null cannot be cast to non-null type kotlin.collections.List<ITEM of com.bytedance.ext_power_list.AssemListViewModel>");
            return C57775Mlv.LIZLLL(t, t2, list);
        }
        if (a2g instanceof A2I) {
            return C57775Mlv.LIZJ(((A2I) a2g).LIZIZ);
        }
        if (a2g instanceof A2H) {
            List<InterfaceC57784Mm4> list2 = ((A2H) a2g).LIZIZ;
            o.LJII(list2, "null cannot be cast to non-null type kotlin.collections.List<ITEM of com.bytedance.ext_power_list.AssemListViewModel>");
            return C57775Mlv.LIZ(list2);
        }
        throw new C162476Zf();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenLoadLatest(Cursor r7, X.InterfaceC67352kd<? super X.AbstractC57774Mlu<ITEM>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.XMP
            if (r0 == 0) goto L3b
            r5 = r8
            X.XMP r5 = (X.XMP) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L41
            com.bytedance.ext_power_list.AssemListViewModel r2 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            X.A2G r4 = (X.A2G) r4
            r1 = 0
            r0 = 0
            X.Mlu r0 = toResult$default(r2, r4, r1, r3, r0)
            return r0
        L2b:
            X.C141335gf.LIZJ(r4)
            r5.LJLIL = r6
            r5.LJLJJI = r3
            java.lang.Object r4 = r6.onLoadLatest(r7, r5)
            if (r4 != r1) goto L39
            return r1
        L39:
            r2 = r6
            goto L22
        L3b:
            X.XMP r5 = new X.XMP
            r5.<init>(r6, r8)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ext_power_list.AssemListViewModel.whenLoadLatest(java.lang.Object, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object whenLoadMore(Cursor r7, X.InterfaceC67352kd<? super X.AbstractC57774Mlu<ITEM>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.XMQ
            if (r0 == 0) goto L3b
            r5 = r8
            X.XMQ r5 = (X.XMQ) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L41
            com.bytedance.ext_power_list.AssemListViewModel r2 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            X.A2G r4 = (X.A2G) r4
            r1 = 0
            r0 = 0
            X.Mlu r0 = toResult$default(r2, r4, r1, r3, r0)
            return r0
        L2b:
            X.C141335gf.LIZJ(r4)
            r5.LJLIL = r6
            r5.LJLJJI = r3
            java.lang.Object r4 = r6.onLoadMore(r7, r5)
            if (r4 != r1) goto L39
            return r1
        L39:
            r2 = r6
            goto L22
        L3b:
            X.XMQ r5 = new X.XMQ
            r5.<init>(r6, r8)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ext_power_list.AssemListViewModel.whenLoadMore(java.lang.Object, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ Object onLoadLatest$suspendImpl(AssemListViewModel<S, ITEM, Cursor> assemListViewModel, Cursor cursor, InterfaceC67352kd<? super A2G<Cursor>> interfaceC67352kd) {
        return A2F.LIZIZ(A2G.LIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public void listSetItemsAt(int i, int i2, Collection<? extends ITEM> elements) {
        o.LJIIIZ(elements, "elements");
        withState(new AqS17S0202000_15((AssemListViewModel) this, i, i2, (int) elements, 0));
    }

    public static /* synthetic */ AbstractC57774Mlu toResult$default(AssemListViewModel assemListViewModel, A2G a2g, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return assemListViewModel.toResult(a2g, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toResult");
    }
}
