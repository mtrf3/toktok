package X;

import android.content.Context;
import defpackage.i0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: X.QcS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67380QcS {
    public final Context LIZ;
    public final InterfaceC67483Qe7 LIZIZ;
    public final InterfaceC67397Qcj LIZJ;
    public final LD7 LIZLLL;
    public final Executor LJ;
    public final PSE LJFF;
    public final InterfaceC67370QcI LJI;
    public final InterfaceC67370QcI LJII;
    public final InterfaceC66854QLq LJIIIIZZ;

    public final void LIZ(final AbstractC67354Qc2 abstractC67354Qc2, int i) {
        C67389Qcb LIZ;
        InterfaceC67412Qcy interfaceC67412Qcy = this.LIZIZ.get(abstractC67354Qc2.LIZIZ());
        new C67389Qcb(EnumC67392Qce.OK, 0L);
        final long j = 0;
        while (((Boolean) this.LJFF.LIZLLL(new C67401Qcn(this, abstractC67354Qc2))).booleanValue()) {
            final Iterable iterable = (Iterable) this.LJFF.LIZLLL(new InterfaceC54346LUo() { // from class: X.Qcq
                @Override // X.InterfaceC54346LUo
                public final Object execute() {
                    C67380QcS c67380QcS = C67380QcS.this;
                    return c67380QcS.LIZJ.LLZLI(abstractC67354Qc2);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (interfaceC67412Qcy == null) {
                C46617IRh.LIZ("Uploader");
                LIZ = new C67389Qcb(EnumC67392Qce.FATAL_ERROR, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC67413Qcz) it.next()).LIZ());
                }
                if (abstractC67354Qc2.LIZJ() != null) {
                    PSE pse = this.LJFF;
                    InterfaceC66854QLq interfaceC66854QLq = this.LJIIIIZZ;
                    Objects.requireNonNull(interfaceC66854QLq);
                    Object LIZLLL = pse.LIZLLL(new QBF(interfaceC66854QLq));
                    C67362QcA c67362QcA = new C67362QcA();
                    c67362QcA.LJFF = new HashMap();
                    c67362QcA.LIZLLL = Long.valueOf(this.LJI.getTime());
                    c67362QcA.LJ = Long.valueOf(this.LJII.getTime());
                    c67362QcA.LIZLLL("GDT_CLIENT_METRICS");
                    C67365QcD c67365QcD = new C67365QcD("proto");
                    LIZLLL.getClass();
                    C67499QeN c67499QeN = AbstractC67513Qeb.LIZ;
                    c67499QeN.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c67499QeN.LIZ(byteArrayOutputStream, LIZLLL);
                    } catch (IOException unused) {
                    }
                    c67362QcA.LIZJ(new C67366QcE(c67365QcD, byteArrayOutputStream.toByteArray()));
                    arrayList.add(interfaceC67412Qcy.LIZIZ(c67362QcA.LIZIZ()));
                }
                C67403Qcp c67403Qcp = new C67403Qcp();
                c67403Qcp.LIZ = arrayList;
                c67403Qcp.LIZIZ = abstractC67354Qc2.LIZJ();
                String str = "";
                if (c67403Qcp.LIZ == null) {
                    str = i0.LJFF("", " events");
                }
                if (str.isEmpty()) {
                    LIZ = interfaceC67412Qcy.LIZ(new C67382QcU(c67403Qcp.LIZ, c67403Qcp.LIZIZ));
                } else {
                    throw new IllegalStateException(i0.LJFF("Missing required properties:", str));
                }
            }
            if (LIZ.LIZ == EnumC67392Qce.TRANSIENT_ERROR) {
                this.LJFF.LIZLLL(new InterfaceC54346LUo() { // from class: X.Qck
                    @Override // X.InterfaceC54346LUo
                    public final Object execute() {
                        C67380QcS c67380QcS = C67380QcS.this;
                        Iterable<AbstractC67413Qcz> iterable2 = iterable;
                        AbstractC67354Qc2 abstractC67354Qc22 = abstractC67354Qc2;
                        long j2 = j;
                        c67380QcS.LIZJ.LLZZZZ(iterable2);
                        c67380QcS.LIZJ.LJJLIIIJL(c67380QcS.LJI.getTime() + j2, abstractC67354Qc22);
                        return null;
                    }
                });
                this.LIZLLL.LIZIZ(abstractC67354Qc2, i + 1, true);
                return;
            }
            this.LJFF.LIZLLL(new C67407Qct(this, iterable));
            EnumC67392Qce enumC67392Qce = LIZ.LIZ;
            if (enumC67392Qce == EnumC67392Qce.OK) {
                j = Math.max(j, LIZ.LIZIZ);
                if (abstractC67354Qc2.LIZJ() != null) {
                    this.LJFF.LIZLLL(new C83673Wsf(this));
                }
            } else if (enumC67392Qce == EnumC67392Qce.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String LJI = ((AbstractC67413Qcz) it2.next()).LIZ().LJI();
                    if (!hashMap.containsKey(LJI)) {
                        hashMap.put(LJI, 1);
                    } else {
                        hashMap.put(LJI, Integer.valueOf(((Integer) hashMap.get(LJI)).intValue() + 1));
                    }
                }
                this.LJFF.LIZLLL(new InterfaceC54346LUo() { // from class: X.Qbz
                    @Override // X.InterfaceC54346LUo
                    public final Object execute() {
                        C67380QcS c67380QcS = C67380QcS.this;
                        java.util.Map map = hashMap;
                        c67380QcS.getClass();
                        Iterator it3 = map.entrySet().iterator();
                        while (it3.hasNext()) {
                            c67380QcS.LJIIIIZZ.LIZIZ(((Integer) r5.getValue()).intValue(), EnumC67390Qcc.INVALID_PAYLOD, (String) ((Map.Entry) it3.next()).getKey());
                        }
                        return null;
                    }
                });
            }
        }
        this.LJFF.LIZLLL(new InterfaceC54346LUo() { // from class: X.Qcm
            @Override // X.InterfaceC54346LUo
            public final Object execute() {
                C67380QcS c67380QcS = C67380QcS.this;
                c67380QcS.LIZJ.LJJLIIIJL(c67380QcS.LJI.getTime() + j, abstractC67354Qc2);
                return null;
            }
        });
    }

    public C67380QcS(Context context, InterfaceC67483Qe7 interfaceC67483Qe7, InterfaceC67397Qcj interfaceC67397Qcj, LD7 ld7, Executor executor, PSE pse, InterfaceC67370QcI interfaceC67370QcI, InterfaceC67370QcI interfaceC67370QcI2, InterfaceC66854QLq interfaceC66854QLq) {
        this.LIZ = context;
        this.LIZIZ = interfaceC67483Qe7;
        this.LIZJ = interfaceC67397Qcj;
        this.LIZLLL = ld7;
        this.LJ = executor;
        this.LJFF = pse;
        this.LJI = interfaceC67370QcI;
        this.LJII = interfaceC67370QcI2;
        this.LJIIIIZZ = interfaceC66854QLq;
    }
}
