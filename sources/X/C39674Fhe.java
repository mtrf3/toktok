package X;

/* renamed from: X.Fhe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39674Fhe extends AbstractC39672Fhc {
    public static final C39674Fhe LJLIL = new C39674Fhe();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // X.AbstractC39672Fhc
    public final boolean zzb() {
        return false;
    }

    @Override // X.AbstractC39672Fhc
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
}
