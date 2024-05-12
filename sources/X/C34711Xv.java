package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Xv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34711Xv implements InterfaceC19270pH {
    public final AbstractC03300Ba LIZ;
    public final C43501nG LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1nG] */
    public C34711Xv(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C1CG<C19260pG>(abstractC03300Ba) { // from class: X.1nG
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C19260pG c19260pG) {
                C19260pG c19260pG2 = c19260pG;
                String str = c19260pG2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                String str2 = c19260pG2.LIZIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str2);
                }
            }
        };
    }

    public final List<String> LIZ(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            ArrayList arrayList = new ArrayList(LIZIZ.getCount());
            while (LIZIZ.moveToNext()) {
                arrayList.add(LIZIZ.getString(0));
            }
            return arrayList;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }

    public final boolean LIZIZ(String str) {
        boolean z = true;
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            LIZJ.LLLLLLJ(1);
        } else {
            LIZJ.LJJII(1, str);
        }
        this.LIZ.LIZIZ();
        boolean z2 = false;
        Cursor LIZIZ = C25080ye.LIZIZ(this.LIZ, LIZJ, false);
        try {
            if (LIZIZ.moveToFirst()) {
                if (LIZIZ.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            LIZIZ.close();
            LIZJ.LIZLLL();
        }
    }
}
