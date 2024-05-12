package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: X.PBa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64030PBa extends AbstractRunnableC64070PCo {
    public final /* synthetic */ PBZ LJLJJI;

    public final void LIZ() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.LJLJJI.LIZLLL;
        long j = r0.LIZJ * 1024 * 1024;
        HashMap hashMap = new HashMap();
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start weedOut:");
            LIZ.append(currentTimeMillis - (i * 86400000));
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
        }
        Iterator it = ((HashSet) this.LJLJJI.LIZ).iterator();
        long j2 = 0;
        while (it.hasNext()) {
            InterfaceC64040PBk interfaceC64040PBk = (InterfaceC64040PBk) it.next();
            C64039PBj c64039PBj = new C64039PBj();
            hashMap.put(interfaceC64040PBk.getName(), c64039PBj);
            c64039PBj.LIZ = interfaceC64040PBk.getName();
            c64039PBj.LIZIZ = interfaceC64040PBk.getSize();
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("weedOut:name:");
                LIZ2.append(c64039PBj.LIZ);
                LIZ2.append(" beforeSize:");
                LIZ2.append(c64039PBj.LIZIZ);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
            }
            interfaceC64040PBk.LIZ(currentTimeMillis - (i * 86400000));
            long size = interfaceC64040PBk.getSize();
            c64039PBj.LIZJ = size;
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("weedOut:name:");
                LIZ3.append(c64039PBj.LIZ);
                LIZ3.append(" afterSize:");
                LIZ3.append(c64039PBj.LIZIZ);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ3));
            }
            j2 += size;
        }
        while (true) {
            i--;
            if (j2 <= j || i <= 0) {
                break;
            }
            Iterator it2 = ((HashSet) this.LJLJJI.LIZ).iterator();
            j2 = 0;
            while (it2.hasNext()) {
                InterfaceC64040PBk interfaceC64040PBk2 = (InterfaceC64040PBk) it2.next();
                interfaceC64040PBk2.LIZ(currentTimeMillis - (i * 86400000));
                long size2 = interfaceC64040PBk2.getSize();
                C64039PBj c64039PBj2 = (C64039PBj) hashMap.get(interfaceC64040PBk2.getName());
                if (c64039PBj2 != null) {
                    c64039PBj2.LIZJ = size2;
                }
                j2 += interfaceC64040PBk2.getSize();
            }
        }
        InterfaceC64048PBs interfaceC64048PBs = this.LJLJJI.LIZIZ;
        if (interfaceC64048PBs != null) {
            ArrayList arrayList = new ArrayList(hashMap.values());
            interfaceC64048PBs.getClass();
            if (C78915Uy7.LJIJJ(arrayList)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C64039PBj c64039PBj3 = (C64039PBj) it3.next();
                try {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("before_size_");
                    LIZ4.append(c64039PBj3.LIZ);
                    jSONObject.put(X1D.LIZIZ(LIZ4), c64039PBj3.LIZIZ);
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("after_size_");
                    LIZ5.append(c64039PBj3.LIZ);
                    jSONObject.put(X1D.LIZIZ(LIZ5), c64039PBj3.LIZJ);
                } catch (Exception unused) {
                }
            }
            PCE.LJ("apm_db_size", 0, null, jSONObject, null);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64030PBa(PBZ pbz) {
        super(0L, 14400000L);
        this.LJLJJI = pbz;
    }
}
