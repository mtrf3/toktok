package X;

import Y.ARunnableS25S0200000_6;
import com.google.gson.m;

/* renamed from: X.Emq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37448Emq<T> implements BQ6<String> {
    public final /* synthetic */ ARunnableS25S0200000_6 LIZ;

    public C37448Emq(ARunnableS25S0200000_6 aRunnableS25S0200000_6) {
        this.LIZ = aRunnableS25S0200000_6;
    }

    @Override // X.BQ6
    public final void accept(String str) {
        C37449Emr c37449Emr = ((C37442Emk) this.LIZ.l0).LIZIZ.LJIJI;
        m mVar = new m();
        mVar.LJJIIZ("data", str);
        c37449Emr.LIZ(mVar, "pia.onWorkerMessage");
    }
}
