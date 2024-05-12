package X;

import X.InterfaceC191727fk;
import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: X.aPk, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93368aPk<T extends InterfaceC191727fk> implements InterfaceC199697sb<T> {
    public final C191717fj LIZ;
    public final Collection<T> LIZIZ;

    @Override // X.InterfaceC199697sb
    public final int getSize() {
        return this.LIZIZ.size();
    }

    public final int hashCode() {
        return this.LIZ.hashCode() + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StaticCluster{mCenter=");
        LIZ.append(this.LIZ);
        LIZ.append(", mItems.size=");
        LIZ.append(this.LIZIZ.size());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC199697sb
    public final Collection<T> getItems() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC199697sb
    public final C191717fj getPosition() {
        return this.LIZ;
    }

    public C93368aPk(C191717fj c191717fj) {
        this.LIZIZ = new LinkedHashSet();
        this.LIZ = c191717fj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C93368aPk)) {
            return false;
        }
        C93368aPk c93368aPk = (C93368aPk) obj;
        if (!c93368aPk.LIZ.equals(this.LIZ) || !c93368aPk.LIZIZ.equals(this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C93368aPk(C191717fj c191717fj, Collection<T> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LIZIZ = linkedHashSet;
        this.LIZ = c191717fj;
        linkedHashSet.addAll(collection);
    }
}
