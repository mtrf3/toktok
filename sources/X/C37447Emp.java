package X;

import Y.ARunnableS25S0200000_6;
import com.google.gson.m;

/* renamed from: X.Emp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37447Emp<T> implements BQ6<String> {
    public final /* synthetic */ ARunnableS25S0200000_6 LIZ;

    public C37447Emp(ARunnableS25S0200000_6 aRunnableS25S0200000_6) {
        this.LIZ = aRunnableS25S0200000_6;
    }

    @Override // X.BQ6
    public final void accept(String str) {
        String str2 = str;
        ((C37442Emk) this.LIZ.l0).LIZIZ.LJII.LIZIZ("prefetch", 1001, str2);
        C37449Emr c37449Emr = ((C37442Emk) this.LIZ.l0).LIZIZ.LJIJI;
        m mVar = new m();
        mVar.LJJIIZ("error", str2);
        c37449Emr.LIZ(mVar, "pia.onWorkerError");
    }
}
