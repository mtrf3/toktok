package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxViewClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Eza, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38238Eza extends LynxViewClient {
    public final /* synthetic */ C78215Ump LIZ;
    public final /* synthetic */ SparkContext LIZIZ;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJI(LynxPerfMetric lynxPerfMetric) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJII() {
        C78181UmH c78181UmH = this.LIZ.LJLILLLLZI;
        if (c78181UmH != null) {
            c78181UmH.LJ = C78181UmH.LIZ();
            c78181UmH.LJI = 5;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIJJI() {
        C37942Euo c37942Euo;
        java.util.Map<String, InterfaceC31920Cfs> LJI;
        C78181UmH c78181UmH = this.LIZ.LJLILLLLZI;
        if (c78181UmH != null) {
            c78181UmH.LIZJ = C78181UmH.LIZ();
            c78181UmH.LJI = 3;
        }
        SparkContext sparkContext = this.LIZIZ;
        if (sparkContext != null && (c37942Euo = (C37942Euo) sparkContext.LIZIZ(C37942Euo.class)) != null) {
            C78215Ump c78215Ump = this.LIZ;
            SparkContext sparkContext2 = this.LIZIZ;
            ArrayList arrayList = new ArrayList();
            InterfaceC38239Ezb interfaceC38239Ezb = c78215Ump.LJLJJLL;
            if (interfaceC38239Ezb != null && interfaceC38239Ezb.LIZJ(sparkContext2) != null) {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator it = OQY.INSTANCE.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String name = (String) entry.getKey();
                    Object value = entry.getValue();
                    o.LJII(value, "null cannot be cast to non-null type com.bytedance.ies.web.jsbridge2.BaseStatelessMethod<kotlin.Any, *>");
                    AbstractC38127Exn abstractC38127Exn = (AbstractC38127Exn) value;
                    o.LJIIIZ(sparkContext2, "sparkContext");
                    o.LJIIIZ(name, "name");
                    C38236EzY c38236EzY = new C38236EzY();
                    c38236EzY.LIZ = name;
                    EnumC38078Ex0 permissionGroup = abstractC38127Exn.getPermissionGroup();
                    o.LJIIIIZZ(permissionGroup, "method.permissionGroup");
                    c38236EzY.LIZIZ(C38108ExU.LIZ(permissionGroup));
                    c38236EzY.LIZLLL = new C38109ExV(sparkContext2, abstractC38127Exn);
                    arrayList2.add(c38236EzY);
                }
                arrayList.addAll(arrayList2);
            }
            InterfaceC38239Ezb interfaceC38239Ezb2 = c78215Ump.LJLJJLL;
            if (interfaceC38239Ezb2 != null && (LJI = interfaceC38239Ezb2.LJI(sparkContext2)) != null) {
                ArrayList arrayList3 = new ArrayList(LJI.size());
                for (Map.Entry<String, InterfaceC31920Cfs> entry2 : LJI.entrySet()) {
                    String name2 = entry2.getKey();
                    InterfaceC31920Cfs method = entry2.getValue();
                    o.LJIIIZ(sparkContext2, "sparkContext");
                    o.LJIIIZ(name2, "name");
                    o.LJIIIZ(method, "method");
                    C38236EzY c38236EzY2 = new C38236EzY();
                    AbstractC38123Exj LIZ = method.LIZ();
                    c38236EzY2.LIZ = name2;
                    EnumC38078Ex0 permissionGroup2 = LIZ.getPermissionGroup();
                    o.LJIIIIZZ(permissionGroup2, "bridge.permissionGroup");
                    c38236EzY2.LIZIZ(C38108ExU.LIZ(permissionGroup2));
                    c38236EzY2.LIZLLL = new C38107ExT(new C68322mC(), sparkContext2, method);
                    arrayList3.add(c38236EzY2);
                }
                arrayList.addAll(arrayList3);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c37942Euo.LJIILJJIL((C38236EzY) it2.next());
            }
        }
        C78181UmH c78181UmH2 = this.LIZ.LJLILLLLZI;
        if (c78181UmH2 != null) {
            c78181UmH2.LIZLLL = C78181UmH.LIZ();
            c78181UmH2.LJI = 4;
        }
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIJ(LynxError lynxError) {
        C32257ClJ.LJIIIIZZ(new AqS153S0200000_6(lynxError, this.LIZ, 32));
    }

    public C38238Eza(C78215Ump c78215Ump, SparkContext sparkContext) {
        this.LIZ = c78215Ump;
        this.LIZIZ = sparkContext;
    }
}
