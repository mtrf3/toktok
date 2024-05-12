package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.Qid, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67763Qid extends AbstractRunnableC64621PXt {
    public final ArrayList<InterfaceC67836Qjo> LJLJI;
    public final /* synthetic */ C67761Qib LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set<com.google.android.gms.common.api.Scope>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Set] */
    @Override // X.AbstractRunnableC64621PXt
    public final void LIZJ() {
        ?? hashSet;
        C67761Qib c67761Qib = this.LJLJJI;
        C67756QiW c67756QiW = c67761Qib.LIZ.LJLLJ;
        C67736QiC c67736QiC = c67761Qib.LJIIZILJ;
        if (c67736QiC == null) {
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet(c67736QiC.LIZIZ);
            java.util.Map<C67718Qhu<?>, C89601ZEn> map = c67761Qib.LJIIZILJ.LIZLLL;
            for (C67718Qhu<?> c67718Qhu : map.keySet()) {
                if (!((HashMap) c67761Qib.LIZ.LJLJL).containsKey(c67718Qhu.LIZIZ)) {
                    map.get(c67718Qhu).getClass();
                    hashSet.addAll(null);
                }
            }
        }
        c67756QiW.LJLLLLLL = hashSet;
        ArrayList<InterfaceC67836Qjo> arrayList = this.LJLJI;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC67836Qjo interfaceC67836Qjo = (InterfaceC67836Qjo) ListProtector.get(arrayList, i);
            C67761Qib c67761Qib2 = this.LJLJJI;
            interfaceC67836Qjo.LJIILIIL(c67761Qib2.LJIILJJIL, c67761Qib2.LIZ.LJLLJ.LJLLLLLL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67763Qid(C67761Qib c67761Qib, ArrayList<InterfaceC67836Qjo> arrayList) {
        super(c67761Qib);
        this.LJLJJI = c67761Qib;
        this.LJLJI = arrayList;
    }
}
