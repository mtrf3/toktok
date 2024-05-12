package X;

import Y.ARunnableS1S1400000_6;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.m;

/* renamed from: X.Emr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37449Emr implements InterfaceC37460En2 {
    public final EnumC37404Em8 LIZ;
    public final C37463En5 LIZIZ;
    public final C37392Elw LIZJ;
    public boolean LIZLLL;
    public final C37607EpP<m> LJ = new C37607EpP<>();
    public InterfaceC37591Ep9 LJFF = null;
    public int LJI = 0;
    public final SparseArray<BQ6<C37428EmW>> LJII = new SparseArray<>();

    public static void LIZLLL(BQ6 bq6, Object obj) {
        if (bq6 != null) {
            try {
                bq6.accept(obj);
            } catch (Throwable th) {
                C37238EjS.LIZLLL(4, "[Bridge] invoke callback error:", th);
            }
        }
    }

    @Override // X.InterfaceC37460En2
    public final void LIZ(Object obj, String str) {
        InterfaceC31710CcU interfaceC31710CcU = null;
        C37613EpV.LIZJ(new RunnableC32036Chk(this, obj, str, interfaceC31710CcU, interfaceC31710CcU, 1));
    }

    public C37449Emr(EnumC37404Em8 enumC37404Em8, C37463En5 c37463En5, C37392Elw c37392Elw) {
        this.LIZ = enumC37404Em8;
        this.LIZIZ = c37463En5;
        this.LIZJ = c37392Elw;
    }

    public final void LIZIZ(BQ6 bq6, BQ6 bq62, m mVar, String str) {
        C37613EpV.LIZJ(new ARunnableS1S1400000_6(bq6, str, this, bq62, mVar, 1));
    }

    public final void LIZJ(int i, String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("name=");
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(", message=");
            sb.append(str2);
        }
        if (th != null) {
            sb.append(", error=");
            sb.append(android.util.Log.getStackTraceString(th));
        }
        this.LIZIZ.LJII.LIZIZ("bridge", i, sb.toString());
    }
}
