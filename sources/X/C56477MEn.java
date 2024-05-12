package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MEn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56477MEn {
    public static boolean LIZLLL;
    public final boolean LIZ;
    public String LIZIZ;
    public final C56476MEm LIZJ;

    public final String LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("profile_");
        String str = this.LIZIZ;
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public C56477MEn(boolean z, String str, RecyclerView recyclerView) {
        this.LIZ = z;
        this.LIZIZ = str;
        C56476MEm c56476MEm = new C56476MEm(this);
        this.LIZJ = c56476MEm;
        InterfaceC55057LjB LIZ = C40443Fu3.LIZ(LIZ());
        LIZ.LJI(c56476MEm);
        LIZ.LJIIIIZZ(recyclerView);
    }
}
