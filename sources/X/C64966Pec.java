package X;

import com.bytedance.retrofit2.mime.TypedOutput;

/* renamed from: X.Pec, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64966Pec<T> extends AbstractC64964Pea<T> {
    public final InterfaceC65016PfQ<T, TypedOutput> LIZ;

    public C64966Pec(InterfaceC65016PfQ interfaceC65016PfQ) {
        this.LIZ = interfaceC65016PfQ;
    }

    @Override // X.AbstractC64964Pea
    public final void LIZ(C64970Peg c64970Peg, T t) {
        if (t != null) {
            c64970Peg.LIZLLL.put("content-type", "application/json; charset=UTF-8");
            c64970Peg.LIZJ = "application/json; charset=UTF-8";
            c64970Peg.LJI = new C64999Pf9(this, t);
            return;
        }
        throw new IllegalArgumentException("Body parameter value must not be null.");
    }
}
