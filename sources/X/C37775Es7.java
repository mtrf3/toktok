package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Es7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37775Es7 extends AbstractC37121EhZ {
    public final InterfaceC37774Es6 LJLIL;
    public final InterfaceC37666EqM LJLILLLLZI;
    public boolean LJLJI;
    public EnumC38014Evy LJLJJI;
    public final /* synthetic */ C31926Cfy LJLJJL;
    public final /* synthetic */ List LJLJJLL;
    public final /* synthetic */ InterfaceC37666EqM LJLJL;
    public final /* synthetic */ InterfaceC37774Es6 LJLJLJ;

    public final EnumC37847EtH LIZLLL() {
        F0S f0s;
        InterfaceC40516FvE interfaceC40516FvE = (InterfaceC40516FvE) this.contextProviderFactory.LIZJ(InterfaceC40516FvE.class);
        if (interfaceC40516FvE == null || (f0s = interfaceC40516FvE.LLLIZZ()) == null) {
            f0s = F0S.RN;
        }
        int i = F0R.LIZ[f0s.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return EnumC37847EtH.RN;
                }
                return EnumC37847EtH.WEB;
            }
            return EnumC37847EtH.RN;
        }
        return EnumC37847EtH.LYNX;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        String name;
        String name2;
        InterfaceC37774Es6 interfaceC37774Es6 = this.LJLIL;
        if (interfaceC37774Es6 != null && (name2 = interfaceC37774Es6.getName()) != null) {
            return name2;
        }
        InterfaceC37666EqM interfaceC37666EqM = this.LJLILLLLZI;
        if (interfaceC37666EqM != null && (name = interfaceC37666EqM.getName()) != null) {
            return name;
        }
        return "";
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC37788EsK
    public final void release() {
        super.release();
        InterfaceC37774Es6 interfaceC37774Es6 = this.LJLIL;
        if (interfaceC37774Es6 != null) {
            interfaceC37774Es6.release();
        }
        InterfaceC37666EqM interfaceC37666EqM = this.LJLILLLLZI;
        if (interfaceC37666EqM != null) {
            interfaceC37666EqM.release();
        }
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final boolean getNeedCallback() {
        return this.LJLJI;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIJ(enumC38014Evy, "<set-?>");
        this.LJLJJI = enumC38014Evy;
    }

    @Override // X.AbstractC37121EhZ
    public final void setNeedCallback(boolean z) {
        this.LJLJI = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        if (r1 != null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC37120EhY r10, java.util.Map<java.lang.String, ? extends java.lang.Object> r11) {
        /*
            r9 = this;
            java.lang.String r5 = "data"
            java.lang.String r7 = "code"
            java.lang.Object r1 = r11.get(r7)
            boolean r0 = r1 instanceof java.lang.Integer
            r8 = 0
            if (r0 != 0) goto Le
            r1 = r8
        Le:
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 1
            if (r1 == 0) goto L27
            int r4 = r1.intValue()
        L17:
            java.lang.String r0 = "msg"
            java.lang.Object r3 = r11.get(r0)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L22
            r3 = r8
        L22:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L29
            goto L2b
        L27:
            r4 = 1
            goto L17
        L29:
            java.lang.String r3 = ""
        L2b:
            java.lang.Object r6 = r11.get(r5)     // Catch: java.lang.Throwable -> L44
            boolean r0 = X.C65777Prh.LJII(r6)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L36
            r6 = r8
        L36:
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L3e
        L3a:
            X.C3C5.m7constructorimpl(r6)     // Catch: java.lang.Throwable -> L44
            goto L4c
        L3e:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L44
            r6.<init>()     // Catch: java.lang.Throwable -> L44
            goto L3a
        L44:
            r0 = move-exception
            X.3C4 r6 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r6)
        L4c:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            boolean r0 = X.C3C5.m12isFailureimpl(r6)
            if (r0 == 0) goto L58
            r6 = r1
        L58:
            if (r4 == r2) goto Lc1
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.put(r7, r0)
            java.lang.String r0 = "error_message"
            r2.put(r0, r3)
            java.lang.String r1 = r9.getName()
            java.lang.String r0 = "method_name"
            r2.put(r0, r1)
            java.lang.String r0 = "bridge_data"
            r2.put(r0, r6)
            X.EtH r0 = r9.LIZLLL()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "platform"
            r2.put(r0, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            java.lang.Object r0 = r11.get(r5)
            if (r0 == 0) goto L97
        L8e:
            java.util.Map r0 = (java.util.Map) r0
            r1.<init>(r0)
            r10.LIZIZ(r4, r3, r1)
            goto L9c
        L97:
            X.3mF r0 = X.C113554cx.LJJJLIIL()
            goto L8e
        L9c:
            X.Cfy r1 = r9.LJLJJL     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto Lb8
            java.lang.Class<X.Xtn> r0 = X.C86291Xtn.class
            java.lang.Object r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> Lca
            X.Xtn r0 = (X.C86291Xtn) r0     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Lb8
            com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto Lb8
        Lae:
            X.Cfy r0 = r9.LJLJJL     // Catch: java.lang.Throwable -> Lca
            X.UCe r8 = r1.reportJSBError(r0, r2)     // Catch: java.lang.Throwable -> Lca
        Lb4:
            X.C3C5.m7constructorimpl(r8)     // Catch: java.lang.Throwable -> Lca
            goto Ld2
        Lb8:
            X.Xtn r0 = X.C86291Xtn.LJIIL     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto Lb4
            com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend r1 = r0.LIZIZ     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto Lb4
            goto Lae
        Lc1:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r11)
            r10.LIZ(r0)
            goto Ld2
        Lca:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37775Es7.LIZJ(X.EhY, java.util.Map):void");
    }

    @Override // X.InterfaceC38186Eyk
    public final void handle(JSONObject params, InterfaceC37120EhY callback) {
        AbstractC37663EqJ c37661EqH;
        o.LJIIJ(params, "params");
        o.LJIIJ(callback, "callback");
        EnumC37847EtH LIZLLL = LIZLLL();
        InterfaceC37666EqM interfaceC37666EqM = this.LJLJL;
        if (interfaceC37666EqM != null) {
            if (LIZLLL == EnumC37847EtH.WEB) {
                c37661EqH = new C37662EqI(interfaceC37666EqM, params);
            } else if (LIZLLL == EnumC37847EtH.LYNX) {
                c37661EqH = new C37661EqH(interfaceC37666EqM, C38381F4n.LIZJ(params));
            } else {
                return;
            }
            c37661EqH.LIZJ(new C36573EWz(new C37029Eg5(this, callback)));
            return;
        }
        if (this.LJLIL != null) {
            Iterator it = this.LJLJJLL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC37776Es8 interfaceC37776Es8 = (InterfaceC37776Es8) it.next();
                if (interfaceC37776Es8.LIZIZ(LIZLLL)) {
                    InterfaceC78280Uns LIZ = interfaceC37776Es8.LIZ(params);
                    if (LIZ != null) {
                        this.LJLIL.LIZJ(LIZ, new C37030Eg6(this, callback), LIZLLL);
                        return;
                    }
                }
            }
            callback.onError(-3, "Unsupported platform type");
            return;
        }
        throw new Exception("Bullet Inner XBridge is Null!!");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37775Es7(C31926Cfy c31926Cfy, List list, InterfaceC37666EqM interfaceC37666EqM, InterfaceC37774Es6 interfaceC37774Es6, F3T f3t, F3T f3t2) {
        super(f3t2);
        String str;
        EnumC38004Evo access;
        EnumC38014Evy enumC38014Evy;
        EnumC38005Evp access2;
        this.LJLJJL = c31926Cfy;
        this.LJLJJLL = list;
        this.LJLJL = interfaceC37666EqM;
        this.LJLJLJ = interfaceC37774Es6;
        if (interfaceC37774Es6 != null) {
            if (c31926Cfy != null) {
                c31926Cfy.LIZJ(C38049EwX.class, f3t.LIZJ(C38049EwX.class));
                c31926Cfy.LIZIZ(InterfaceC40311Frv.class, new C31924Cfw(new C37778EsA(this)));
                c31926Cfy.LIZIZ(InterfaceC37790EsM.class, new C31924Cfw(new C37777Es9(this)));
            }
            interfaceC37774Es6.LIZIZ(c31926Cfy);
        } else {
            interfaceC37774Es6 = null;
        }
        this.LJLIL = interfaceC37774Es6;
        this.LJLILLLLZI = interfaceC37666EqM;
        if ((interfaceC37774Es6 == null || (access2 = interfaceC37774Es6.getAccess()) == null || (str = access2.getValue()) == null) && (interfaceC37666EqM == null || (access = interfaceC37666EqM.getAccess()) == null || (str = access.getValue()) == null)) {
            str = "";
        }
        if (o.LJ(str, EnumC38005Evp.PRIVATE.getValue())) {
            enumC38014Evy = EnumC38014Evy.PRIVATE;
        } else if (o.LJ(str, EnumC38005Evp.PROTECT.getValue())) {
            enumC38014Evy = EnumC38014Evy.PROTECT;
        } else if (o.LJ(str, EnumC38005Evp.PUBLIC.getValue())) {
            enumC38014Evy = EnumC38014Evy.PUBLIC;
        } else {
            enumC38014Evy = EnumC38014Evy.PRIVATE;
        }
        this.LJLJJI = enumC38014Evy;
    }
}
