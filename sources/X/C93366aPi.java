package X;

import X.InterfaceC191727fk;
import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import kotlin.jvm.internal.o;

/* renamed from: X.aPi, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public class C93366aPi<T extends InterfaceC191727fk> implements InterfaceC93360aPc, InterfaceC199697sb<T> {
    public final T LIZ;
    public final C93394aQA LIZIZ;
    public final LatLng LIZJ;
    public final java.util.Set<T> LIZLLL;

    public C93366aPi() {
        throw null;
    }

    @Override // X.InterfaceC199697sb
    public final int getSize() {
        return 1;
    }

    @Override // X.InterfaceC199697sb
    public final C191717fj getPosition() {
        LatLng latLng = this.LIZJ;
        o.LJIIIZ(latLng, "<this>");
        return new C191717fj(latLng.latitude, latLng.longitude);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuadItem{mClusterItem=");
        LIZ.append(this.LIZ);
        LIZ.append(", mPosition=");
        LIZ.append(this.LIZJ);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC93360aPc
    public final C93394aQA LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC199697sb
    public final /* bridge */ /* synthetic */ Collection getItems() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C93366aPi(InterfaceC191727fk interfaceC191727fk) {
        this.LIZ = interfaceC191727fk;
        LatLng LIZ = C93345aPN.LIZ(interfaceC191727fk.getPosition());
        this.LIZJ = LIZ;
        this.LIZIZ = C93395aQB.LJ.LIZIZ(LIZ);
        this.LIZLLL = Collections.singleton(interfaceC191727fk);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C93366aPi)) {
            return false;
        }
        return ((C93366aPi) obj).LIZ.equals(this.LIZ);
    }
}
