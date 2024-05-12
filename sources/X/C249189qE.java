package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9qE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249189qE implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final AbstractC72932td<C76800UCe> LJLJI;

    public C249189qE() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C249189qE)) {
            return false;
        }
        C249189qE c249189qE = (C249189qE) obj;
        return o.LJ(this.LJLIL, c249189qE.LJLIL) && o.LJ(this.LJLILLLLZI, c249189qE.LJLILLLLZI) && o.LJ(this.LJLJI, c249189qE.LJLJI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        String str = this.LJLILLLLZI;
        return this.LJLJI.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeriesUIState(collectionId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", collectionName=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", collectionCreationStatus=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C249189qE(int i) {
        this("", null, C33X.LIZ);
    }

    public C249189qE(String collectionId, String str, AbstractC72932td<C76800UCe> collectionCreationStatus) {
        o.LJIIIZ(collectionId, "collectionId");
        o.LJIIIZ(collectionCreationStatus, "collectionCreationStatus");
        this.LJLIL = collectionId;
        this.LJLILLLLZI = str;
        this.LJLJI = collectionCreationStatus;
    }
}
