package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.a2l, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91943a2l {
    public static final ParcelableSnapshotMutableState LIZ = C78966Uyw.LJJJIL(C92232a7Q.LJLIL);
    public static C92083a51 LIZIZ;
    public static C92204a6y LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static InterfaceC88472Yns<? super JSONObject, C76800UCe> LJFF;
    public static InterfaceC88472Yns<? super String, C76800UCe> LJI;
    public static List<Methods> LJII;
    public static final C44001o4 LJIIIIZZ;
    public static final C44001o4 LJIIIZ;
    public static final C44001o4 LJIIJ;
    public static final C44001o4 LJIIJJI;

    static {
        C92076a4u c92076a4u = new C92076a4u(0);
        c92076a4u.LIZ = Boolean.TRUE;
        EnumC92086a54 region = EnumC92086a54.BOE;
        o.LJIIIZ(region, "region");
        c92076a4u.LIZLLL = region;
        LIZIZ = new C92083a51(c92076a4u.LIZ());
        LIZJ = new C92204a6y(null, null, null, null, null, null, null, 127);
        LJ = "";
        LJII = C61878OQg.INSTANCE;
        LJIIIIZZ = C78966Uyw.LJIJI(C92841aHF.LJLIL);
        LJIIIZ = C78966Uyw.LJIJI(C92838aHC.LJLIL);
        LJIIJ = C78966Uyw.LJIJI(C92839aHD.LJLIL);
        LJIIJJI = C78966Uyw.LJIJI(C92840aHE.LJLIL);
    }

    public static void LIZ() {
        LIZ.setValue(C92232a7Q.LJLIL);
        LJFF = null;
        LJI = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r1 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.InterfaceC91961a33 r3) {
        /*
            java.lang.String r0 = "newMethod"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.C91943a2l.LIZ
            r0.setValue(r3)
            boolean r0 = r3 instanceof X.C92231a7P
            if (r0 == 0) goto L2f
            X.a7P r3 = (X.C92231a7P) r3
            com.bytedance.pipo.checkout.api.network.model.response.Methods r0 = r3.LJLIL
            java.lang.String r2 = r0.getPaymentMethodType()
            X.a39 r1 = X.EnumC91967a39.CCDC
            java.lang.String r0 = r1.getValue()
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            if (r0 == 0) goto L3e
            java.lang.String r1 = r1.getValue()
        L26:
            X.Yns<? super java.lang.String, X.UCe> r0 = X.C91943a2l.LJI
            if (r0 != 0) goto L2b
        L2a:
            return
        L2b:
            r0.invoke(r1)
            goto L2a
        L2f:
            boolean r0 = r3 instanceof X.C92233a7R
            if (r0 == 0) goto L46
            X.a7R r3 = (X.C92233a7R) r3
            com.bytedance.pipo.checkout.api.network.model.response.StoredMethods r0 = r3.LJLIL
            java.lang.String r1 = r0.getPaymentMethod()
            if (r1 != 0) goto L26
            goto L46
        L3e:
            com.bytedance.pipo.checkout.api.network.model.response.Methods r0 = r3.LJLIL
            java.lang.String r1 = r0.getPaymentMethod()
            if (r1 != 0) goto L26
        L46:
            java.lang.String r1 = ""
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91943a2l.LIZJ(X.a33):void");
    }

    public static void LIZIZ(C92083a51 api, C92204a6y form, String code, String str, AbstractC91981a3N abstractC91981a3N, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        o.LJIIIZ(api, "api");
        o.LJIIIZ(form, "form");
        o.LJIIIZ(code, "code");
        LIZIZ = api;
        LIZJ = form;
        LJ = code;
        LIZLLL = str;
        LJFF = interfaceC88472Yns;
        LJI = interfaceC88472Yns2;
        List<Methods> list = form.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (Methods methods : list) {
            if (o.LJ(methods.getPaymentMethodType(), EnumC91967a39.CCDC.getValue())) {
                arrayList.add(methods);
            }
        }
        LJII = arrayList;
        C91980a3M.LIZIZ = abstractC91981a3N;
    }
}
