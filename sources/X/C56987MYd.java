package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS14S0010000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MYd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56987MYd implements InterfaceC116134h7, LifecycleOwner {
    public final SkylightListViewModel LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final java.util.Map<EnumC56998MYo, AbstractC116364hU<?>> LJLJI;
    public final C56988MYe LJLJJI;
    public final ConcurrentHashMap<String, Integer> LJLJJL;

    @Override // X.InterfaceC116134h7
    public final InboxHorizontalTopListCombinePod LJII() {
        return this.LJLIL.jv0();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.getLifecycle();
    }

    @Override // X.InterfaceC116134h7
    public final ConcurrentHashMap<String, Integer> LIZ() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC116134h7
    public final /* bridge */ /* synthetic */ LifecycleOwner LIZJ() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC116134h7
    public final java.util.Map<EnumC56998MYo, AbstractC116364hU<?>> LIZLLL() {
        return this.LJLJI;
    }

    public C56987MYd(SkylightListViewModel vm) {
        o.LJIIIZ(vm, "vm");
        this.LJLIL = vm;
        this.LJLILLLLZI = C221108m2.LIZIZ(MZ2.LJLIL);
        C221108m2.LIZIZ(MZ4.LJLIL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LJLJI = linkedHashMap;
        this.LJLJJI = new C56988MYe();
        this.LJLJJL = new ConcurrentHashMap<>();
        linkedHashMap.put(EnumC56998MYo.GENERAL, new MYX(this));
        linkedHashMap.put(EnumC56998MYo.ACTIVE_STATUS, new C116194hD(this));
        linkedHashMap.put(EnumC56998MYo.STORY, new MYZ(this));
        linkedHashMap.put(EnumC56998MYo.STORY_WIDGET, new C56989MYf(this));
    }

    @Override // X.InterfaceC116134h7
    public final int LJI(int i) {
        Integer num = this.LJLJJI.LIZ.get(Integer.valueOf(i));
        if (num == null) {
            return ImagePreloadExperiment.PRIORITY_DEFAULT;
        }
        return num.intValue();
    }

    public final List<InterfaceC57784Mm4> LJIIIIZZ(List<? extends InterfaceC57784Mm4> list) {
        Integer num;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
            InterfaceC57784Mm4 interfaceC57784Mm42 = interfaceC57784Mm4;
            this.LJLJJI.getClass();
            int LIZIZ = C56988MYe.LIZIZ(interfaceC57784Mm42);
            this.LJLJJI.getClass();
            String LIZ = C56988MYe.LIZ(interfaceC57784Mm42);
            if (o.LJ(LIZ, "ignore") || (this.LJLJJL.containsKey(LIZ) && (num = this.LJLJJL.get(LIZ)) != null && num.intValue() == LIZIZ)) {
                arrayList.add(interfaceC57784Mm4);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC67352kd<? super java.util.List<? extends X.InterfaceC57784Mm4>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C56996MYm
            if (r0 == 0) goto L5b
            r6 = r8
            X.MYm r6 = (X.C56996MYm) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 != r2) goto La3
            java.lang.Object r1 = r6.LJLILLLLZI
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.MYd r4 = r6.LJLIL
            X.C141335gf.LIZJ(r5)
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.4hU r0 = (X.AbstractC116364hU) r0
            r6.LJLIL = r4
            r6.LJLILLLLZI = r1
            r6.LJLJJL = r2
            java.lang.Object r0 = r0.LJ(r6)
            if (r0 != r3) goto L26
            return r3
        L45:
            X.C141335gf.LIZJ(r5)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = r7.LJLJJL
            r0.clear()
            java.util.Map<X.MYo, X.4hU<?>> r0 = r7.LJLJI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r1 = r0.iterator()
            r4 = r7
            goto L26
        L5b:
            X.MYm r6 = new X.MYm
            r6.<init>(r7, r8)
            goto L12
        L61:
            r4.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map<X.MYo, X.4hU<?>> r0 = r4.LJLJI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L75:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L96
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            X.4hU r0 = (X.AbstractC116364hU) r0
            java.util.List<T extends X.Mm4> r1 = r0.LIZIZ
            if (r1 == 0) goto L75
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L92
            goto L75
        L92:
            r3.addAll(r1)
            goto L75
        L96:
            X.MYe r0 = r4.LJLJJI
            java.util.List r1 = r4.LJIIIIZZ(r3)
            Y.IDComparatorS341S0100000_9 r0 = r0.LIZIZ
            java.util.List r0 = X.ORZ.LLILII(r0, r1)
            return r0
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56987MYd.LJIIIZ(X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC116134h7
    public final void LIZIZ(List<? extends InterfaceC57784Mm4> list, boolean z) {
        MKT mkt;
        C72808Sho<InterfaceC57784Mm4> state;
        o.LJIIIZ(list, "list");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resetListAfterWhenUpdate list size ");
        LIZ.append(list.size());
        LIZ.append(", need reset pos ");
        LIZ.append(z);
        C34B.LJI("SkylightDataFactory", X1D.LIZIZ(LIZ));
        List<InterfaceC57784Mm4> LJIIIIZZ = LJIIIIZZ(list);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("filter display item list ");
        LIZ2.append(((ArrayList) LJIIIIZZ).size());
        C34B.LJI("SkylightDataFactory", X1D.LIZIZ(LIZ2));
        List LLILII = ORZ.LLILII(this.LJLJJI.LIZIZ, LJIIIIZZ);
        SkylightListViewModel skylightListViewModel = this.LJLIL;
        boolean isEmpty = LLILII.isEmpty();
        skylightListViewModel.getClass();
        skylightListViewModel.setState(new AqS14S0010000_9(isEmpty, 8));
        MKT mkt2 = this.LJLIL.LJLJLLL;
        if (mkt2 != null && (state = mkt2.getState()) != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("display result list ");
            LIZ3.append(LLILII.size());
            C34B.LJI("SkylightDataFactory", X1D.LIZIZ(LIZ3));
            state.LJIILLIIL(LLILII);
        }
        if (z && (mkt = this.LJLIL.LJLJLLL) != null) {
            mkt.LJLI(0);
        }
    }

    @Override // X.InterfaceC116134h7
    public final boolean LJFF(int i, String str) {
        Integer num;
        if (!this.LJLJJL.containsKey(str) || str == "ignore" || (num = this.LJLJJL.get(str)) == null || i < num.intValue()) {
            return true;
        }
        return false;
    }
}
