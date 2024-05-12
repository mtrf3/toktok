package X;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* renamed from: X.Uq5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78417Uq5 implements InterfaceC78437UqP {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ List LIZIZ;
    public final /* synthetic */ InterfaceC78385UpZ LIZJ;
    public final /* synthetic */ C78408Upw LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0HX] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    @Override // X.InterfaceC78437UqP
    public final void LIZIZ() {
        Object obj;
        ?? arrayList;
        final String str = "subs";
        if (this.LIZ) {
            obj = "subs";
        } else {
            obj = "inapp";
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        Object[] objArr = new Object[2];
        int i = 0;
        objArr[0] = obj;
        StringBuilder LIZ = X1D.LIZ();
        List list = this.LIZIZ;
        if (list != null) {
            i = list.size();
        }
        objArr[1] = C08380Uo.LIZ(LIZ, i, "", LIZ);
        LJ.getClass();
        C16880lQ.LLLZ("BillingManager: query skuDetails list from google service, itemType: %s, skuList length is: %s", objArr);
        C78408Upw c78408Upw = this.LIZLLL;
        List<String> list2 = this.LIZIZ;
        Boolean valueOf = Boolean.valueOf(this.LIZ);
        InterfaceC78385UpZ interfaceC78385UpZ = this.LIZJ;
        c78408Upw.getClass();
        if (!valueOf.booleanValue()) {
            str = "inapp";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = (List) list2.stream().map(new Function() { // from class: X.UqO
                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    String str2 = str;
                    C0HY c0hy = new C0HY();
                    c0hy.LIZ = (String) obj2;
                    c0hy.LIZIZ = str2;
                    return c0hy.LIZ();
                }
            }).collect(Collectors.toList());
        } else {
            arrayList = new ArrayList();
            for (String str2 : list2) {
                C0HY c0hy = new C0HY();
                c0hy.LIZ = str2;
                c0hy.LIZIZ = str;
                arrayList.add(c0hy.LIZ());
            }
        }
        ?? c0hx = new C0HX();
        c0hx.LIZ(arrayList);
        c78408Upw.LJIIJJI.LJI(new C04870Hb(c0hx), new C78413Uq1(c78408Upw, interfaceC78385UpZ));
    }

    @Override // X.InterfaceC78437UqP
    public final void LIZ(C78368UpI c78368UpI) {
        this.LIZJ.LIZ(c78368UpI, null);
    }

    public C78417Uq5(C78408Upw c78408Upw, boolean z, List list, InterfaceC78385UpZ interfaceC78385UpZ) {
        this.LIZLLL = c78408Upw;
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = interfaceC78385UpZ;
    }
}
