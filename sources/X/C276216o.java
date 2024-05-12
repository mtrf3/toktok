package X;

import Y.IDRunnableS29S0200000;
import aj2.c;
import aj2.d;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.common.utility.Logger;
import defpackage.b1;
import ij2.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import rj2.a$a;

/* renamed from: X.16o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C276216o {
    public static final C276216o LJIIL = new C276216o();
    public C276016m LIZ;
    public volatile C0RB LIZIZ;
    public volatile C0RG LIZJ;
    public volatile C30991Jn LIZLLL;
    public volatile C1DJ LJ;
    public volatile C31021Jq LJFF;
    public volatile C31041Js LJI;
    public volatile C0TF LJII;
    public volatile C31051Jt LJIIIIZZ;
    public volatile C41501k2 LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;

    public final C0RB LIZ() {
        if (this.LIZIZ == null) {
            synchronized (this) {
                if (this.LIZIZ == null) {
                    C276016m c276016m = this.LIZ;
                    this.LIZIZ = new C0RB(c276016m.LIZJ, c276016m.LIZLLL, c276016m.LJ, LJ());
                }
            }
        }
        return this.LIZIZ;
    }

    public final C1DJ LIZIZ() {
        if (this.LJ == null) {
            synchronized (this) {
                if (this.LJ == null) {
                    this.LJ = new C1DJ();
                }
            }
        }
        return this.LJ;
    }

    public final InterfaceC31001Jo LIZJ() {
        if (this.LJIIIZ == null) {
            synchronized (this) {
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = new C41501k2();
                }
            }
        }
        return this.LJIIIZ;
    }

    public final C0RC LIZLLL() {
        if (this.LJFF == null) {
            synchronized (this) {
                if (this.LJFF == null) {
                    this.LJFF = new C31021Jq(this.LIZ.LIZ);
                }
            }
        }
        return this.LJFF;
    }

    public final C0RE LJ() {
        if (this.LJI == null) {
            synchronized (this) {
                if (this.LJI == null) {
                    this.LJI = new C31041Js();
                }
            }
        }
        return this.LJI;
    }

    public static void LJI(Class cls) {
        C37848EtI.LIZLLL(cls, EnumC37847EtH.ALL, null, 4);
    }

    public final C24020ww LJFF(final C276016m c276016m) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Pair pair;
        boolean z;
        C276016m c276016m2 = this.LIZ;
        if (c276016m2 == null) {
            this.LIZ = c276016m;
        } else {
            if (TextUtils.isEmpty(c276016m2.LIZIZ) && !TextUtils.isEmpty(c276016m.LIZIZ)) {
                c276016m2.LIZIZ = c276016m.LIZIZ;
            }
            JSONArray jSONArray3 = c276016m.LIZJ;
            if (jSONArray3 != null && (jSONArray = c276016m.LIZLLL) != null && (jSONArray2 = c276016m.LJ) != null) {
                c276016m2.LIZJ = jSONArray3;
                c276016m2.LIZLLL = jSONArray;
                c276016m2.LJ = jSONArray2;
            }
            if (!TextUtils.isEmpty(c276016m.LJFF)) {
                c276016m2.LJFF = c276016m.LJFF;
            }
            if (!TextUtils.isEmpty(c276016m.LJI)) {
                c276016m2.LJI = c276016m.LJI;
            }
            if (!TextUtils.isEmpty(c276016m.LJII)) {
                c276016m2.LJII = c276016m.LJII;
            }
            if (!TextUtils.isEmpty(c276016m.LJIIIIZZ)) {
                c276016m2.LJIIIIZZ = c276016m.LJIIIIZZ;
            }
            InterfaceC06380Mw interfaceC06380Mw = c276016m.LJIIIZ;
            if (interfaceC06380Mw != null) {
                c276016m2.LJIIIZ = interfaceC06380Mw;
            }
            if (!TextUtils.isEmpty(c276016m.LJIIJ)) {
                c276016m2.LJIIJ = c276016m.LJIIJ;
            }
            AbstractC66805QJt abstractC66805QJt = c276016m.LJIIJJI;
            if (abstractC66805QJt != null) {
                c276016m2.LJIIJJI = abstractC66805QJt;
            }
            if (!TextUtils.isEmpty(c276016m.LJIILIIL)) {
                c276016m2.LJIILIIL = c276016m.LJIILIIL;
            }
            if (!TextUtils.isEmpty(c276016m.LJIIL)) {
                c276016m2.LJIIL = c276016m.LJIIL;
            }
            C0RF c0rf = c276016m.LJIILJJIL;
            if (c0rf != null) {
                c276016m2.LJIILJJIL = c0rf;
            }
            if (!TextUtils.isEmpty(c276016m.LJIILL)) {
                c276016m2.LJIILL = c276016m.LJIILL;
            }
            Cert cert = c276016m.LJIILLIIL;
            if (cert != null) {
                c276016m2.LJIILLIIL = cert;
            }
            Cert cert2 = c276016m.LJIIZILJ;
            if (cert2 != null) {
                c276016m2.LJIIZILJ = cert2;
            }
            if (!TextUtils.isEmpty(c276016m.LJIJI)) {
                c276016m2.LJIJI = c276016m.LJIJI;
            }
            InterfaceC269413y interfaceC269413y = c276016m.LJIJJ;
            if (interfaceC269413y != null) {
                c276016m2.LJIJJ = interfaceC269413y;
            }
            c cVar = c276016m.LJIJJLI;
            if (cVar != null) {
                c276016m2.LJIJJLI = cVar;
            }
            a$a a_a = c276016m.LJIL;
            if (a_a != null) {
                c276016m2.LJIL = a_a;
            }
        }
        d.a aVar = new d.a(this.LIZ.LIZ);
        C276016m c276016m3 = this.LIZ;
        String str = c276016m3.LIZIZ;
        if (str != null) {
            aVar.LIZIZ = str;
        }
        if (c276016m3.LJIIIZ != null) {
            aVar.LIZJ = new C39301gU(this);
        }
        String str2 = c276016m3.LJIIJ;
        if (str2 != null) {
            aVar.LIZLLL = str2;
        }
        AbstractC66805QJt abstractC66805QJt2 = c276016m3.LJIIJJI;
        if (abstractC66805QJt2 != null) {
            aVar.LJ = abstractC66805QJt2;
        }
        Cert cert3 = c276016m3.LJIILLIIL;
        if (cert3 != null) {
            aVar.LJFF = cert3;
        }
        Cert cert4 = c276016m3.LJIIZILJ;
        if (cert4 != null) {
            aVar.LJI = cert4;
        }
        Cert cert5 = c276016m3.LJIJ;
        if (cert5 != null) {
            aVar.LJII = cert5;
        }
        c cVar2 = c276016m3.LJIJJLI;
        if (cVar2 != null) {
            aVar.LJIIIIZZ = cVar2;
        }
        a$a a_a2 = c276016m3.LJIL;
        if (a_a2 != null) {
            aVar.LJIIJJI = a_a2;
        }
        a aVar2 = a.LJIJ;
        d LIZ = aVar.LIZ();
        aVar2.getClass();
        a.LJFF(LIZ);
        this.LIZIZ = null;
        C0RE LJ = LJ();
        String str3 = this.LIZ.LJIIJ;
        C0RD c0rd = new C0RD() { // from class: X.1gV
            @Override // X.C0RD
            public final void LIZ(java.util.Map<String, String> map) {
                C276216o.this.LJIIJJI = true;
                InterfaceC269413y interfaceC269413y2 = c276016m.LJIJJ;
                if (interfaceC269413y2 != null) {
                    interfaceC269413y2.LIZ();
                }
            }
        };
        C31041Js c31041Js = (C31041Js) LJ;
        if (!TextUtils.equals(c31041Js.LIZIZ, str3) && !TextUtils.isEmpty(str3)) {
            c31041Js.LIZIZ = str3;
            c31041Js.LIZ.clear();
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                RunnableC39007FSp.LIZIZ(new IDRunnableS29S0200000(c0rd, c31041Js, 23));
            } else {
                c31041Js.LIZIZ(c31041Js.LIZIZ, c0rd, null);
            }
        }
        if (!this.LJIIJ) {
            LJI(C533727p.class);
            LJI(C533827q.class);
            LJI(C534027s.class);
            LJI(C534127t.class);
            LJI(C534227u.class);
            LJI(C534327v.class);
            LJI(C533627o.class);
            LJI(C533927r.class);
            LJI(C534427w.class);
            java.util.Map LIZIZ = C37848EtI.LIZIZ(EnumC37847EtH.ALL, "DEFAULT");
            ArrayList arrayList = new ArrayList();
            arrayList.add("pipo.executeRiskJS");
            arrayList.add("pipo.fetch");
            arrayList.add("pipo.onEvent");
            arrayList.add("pipo.openWebView");
            arrayList.add("pipoAppInfo");
            arrayList.add("pipo.getStarlingData");
            arrayList.add("pipo.encryptString");
            arrayList.add("pipo.getInfoByOcr");
            if (LIZIZ == null) {
                pair = new Pair(Boolean.FALSE, arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    StringBuilder LIZJ = b1.LIZJ(str4, " miss --- ");
                    if (LIZIZ.get(str4) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZJ.append(z);
                    Logger.d("pipo ecommerce", X1D.LIZIZ(LIZJ));
                    if (LIZIZ.get(str4) == null) {
                        arrayList2.add(str4);
                    }
                }
                if (arrayList2.isEmpty()) {
                    pair = new Pair(Boolean.TRUE, arrayList2);
                } else {
                    pair = new Pair(Boolean.FALSE, arrayList2);
                }
            }
            if (Boolean.FALSE.equals(pair.first)) {
                return new C24020ww(12, pair.second.toString());
            }
        }
        this.LJIIJ = true;
        return new C24020ww(1, "success");
    }
}
