package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Y2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y2 implements InterfaceC19410pV {
    public final AbstractC03300Ba LIZ;
    public final C43561nM LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1nM] */
    public C1Y2(final AbstractC03300Ba abstractC03300Ba) {
        this.LIZ = abstractC03300Ba;
        this.LIZIZ = new C1CG<C19400pU>(abstractC03300Ba) { // from class: X.1nM
            @Override // X.C0BI
            public final String LIZIZ() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            @Override // X.C1CG
            public final void LIZLLL(InterfaceC37591dj interfaceC37591dj, C19400pU c19400pU) {
                C19400pU c19400pU2 = c19400pU;
                String str = c19400pU2.LIZ;
                if (str == null) {
                    interfaceC37591dj.LLLLLLJ(1);
                } else {
                    interfaceC37591dj.LJJII(1, str);
                }
                String str2 = c19400pU2.LIZIZ;
                if (str2 == null) {
                    interfaceC37591dj.LLLLLLJ(2);
                } else {
                    interfaceC37591dj.LJJII(2, str2);
                }
            }
        };
    }

    public final List<String> LIZ(String str) {
        C1CD LIZJ = C1CD.LIZJ(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
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
}
