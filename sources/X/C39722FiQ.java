package X;

import defpackage.a1;

/* renamed from: X.FiQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39722FiQ extends AbstractC39721FiP {
    public final String LIZ;

    @Override // X.AbstractC39721FiP
    public final String LIZ() {
        return this.LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a1.LJ("IntegrityTokenResponse{token=", this.LIZ, "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC39721FiP) {
            return this.LIZ.equals(((AbstractC39721FiP) obj).LIZ());
        }
        return false;
    }
}
