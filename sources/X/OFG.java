package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OFG {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIIIIZZ;
    public COL LIZLLL;
    public boolean LJI;
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(OFF.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 604));
    public final java.util.Map<String, Object> LIZJ = new ConcurrentHashMap();
    public String LJ = "";
    public final OFJ<String, JSONObject> LJFF = new OFJ<>(128, C58401Mw1.LJLIL);
    public final List<OFN> LJII = new LinkedList();

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(OFG.class), "context", "getContext()Lorg/json/JSONObject;");
        C65352Pkq.LIZ.getClass();
        LJIIIIZZ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(OFG.class), "common", "getCommon()Ljava/util/Map;")};
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r6 = this;
            java.util.List<X.OFN> r0 = r6.LJII
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            X.OFN r0 = (X.OFN) r0
            r0.LIZ()
            goto L6
        L16:
            java.util.List<X.OFN> r0 = r6.LJII
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.clear()
            X.OFP r2 = X.OFP.ContainerTrace
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto Lbc
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = "bid_allow_list"
            java.util.List r4 = r2.getStrListOptions(r0, r1)
            X.OFH r0 = X.OFH.LIZLLL
            java.lang.String r1 = r6.LJ
            r0.getClass()
            java.lang.String r3 = ""
            if (r1 == 0) goto Lba
            X.OFI r0 = X.OFH.LIZ
            r0.getClass()
            X.COL r2 = X.OFI.LJ(r1)
            X.OFM r1 = X.OFH.LJFF(r2)
            r0 = 0
            if (r1 == 0) goto L58
            if (r2 == 0) goto L51
            android.view.View r0 = r2.LIZ()
        L51:
            java.lang.String r0 = r1.getMonitorBid(r0)
            if (r0 == 0) goto L58
        L57:
            r3 = r0
        L58:
            int r0 = r3.length()
            if (r0 <= 0) goto Lbc
            boolean r0 = r4.contains(r3)
            if (r0 == 0) goto Lbc
            X.OFJ<java.lang.String, org.json.JSONObject> r0 = r6.LJFF
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L6e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r4 = r5.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            X.VMb r3 = new X.VMb     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = "bd_hybrid_monitor_trace"
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r6.LJ     // Catch: java.lang.Throwable -> Lb5
            r3.LJIIIIZZ = r0     // Catch: java.lang.Throwable -> Lb5
            X.Fo5 r0 = X.EnumC40073Fo5.Tea     // Catch: java.lang.Throwable -> Lb5
            r3.LJIIJJI = r0     // Catch: java.lang.Throwable -> Lb5
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb5
            r2.<init>()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "name"
            java.lang.Object r0 = r4.getKey()     // Catch: java.lang.Throwable -> Lb5
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = "params"
            java.lang.Object r0 = r4.getValue()     // Catch: java.lang.Throwable -> Lb5
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lb5
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lb5
            r3.LIZLLL = r2     // Catch: java.lang.Throwable -> Lb5
            X.VMa r1 = r3.LIZ()     // Catch: java.lang.Throwable -> Lb5
            X.OFH r0 = X.OFH.LIZLLL     // Catch: java.lang.Throwable -> Lb5
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5
            X.OFH.LIZLLL(r1)     // Catch: java.lang.Throwable -> Lb5
            goto L6e
        Lb5:
            r0 = move-exception
            X.C77117UOj.LJIIZILJ(r0)
            goto L6e
        Lba:
            r0 = r3
            goto L57
        Lbc:
            X.OFJ<java.lang.String, org.json.JSONObject> r0 = r6.LJFF
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OFG.LIZJ():void");
    }

    public final void LIZ(OFG other) {
        o.LJIIJ(other, "other");
        C40082FoE.LJII((JSONObject) this.LIZ.getValue(), other.LIZ.getValue());
        ((java.util.Map) this.LIZIZ.getValue()).putAll((java.util.Map) other.LIZIZ.getValue());
        ((ConcurrentHashMap) this.LIZJ).putAll(other.LIZJ);
        this.LJFF.putAll(other.LJFF);
        ((LinkedList) this.LJII).addAll(other.LJII);
    }

    public final void LIZIZ(String containerId, COL col) {
        o.LJIIJ(containerId, "containerId");
        this.LIZLLL = col;
        this.LJ = containerId;
        this.LJI = true;
        Iterator<OFN> it = this.LJII.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(containerId, col);
        }
        ((LinkedList) this.LJII).clear();
    }
}
