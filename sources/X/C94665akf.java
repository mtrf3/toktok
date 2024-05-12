package X;

import com.bytedance.ies.effectcreator.swig.Feature;
import kotlin.jvm.internal.o;

/* renamed from: X.akf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94665akf extends AbstractC94512aiC {
    public final Feature LIZ;

    @Override // X.AbstractC93990aZm
    public final int LIZIZ() {
        return C16880lQ.LLJIJIL(this.LIZ.id().objectId());
    }

    @Override // X.AbstractC94371afv
    public final String LIZJ() {
        String iconPath = this.LIZ.getIconPath();
        o.LJIIIIZZ(iconPath, "feature.iconPath");
        return iconPath;
    }

    @Override // X.AbstractC94371afv
    public final String LIZLLL() {
        String displayName = this.LIZ.getDisplayName();
        o.LJIIIIZZ(displayName, "feature.displayName");
        return displayName;
    }

    @Override // X.AbstractC94512aiC
    public final long LJ() {
        return this.LIZ.id().objectId();
    }

    public C94665akf(Feature feature) {
        o.LJIIIZ(feature, "feature");
        this.LIZ = feature;
    }

    @Override // X.AbstractC93990aZm
    public final boolean LIZ(Object other) {
        o.LJIIIZ(other, "other");
        boolean z = true;
        if (!o.LJ(other.getClass(), C94665akf.class)) {
            return false;
        }
        C94665akf c94665akf = (C94665akf) other;
        if (LJ() != c94665akf.LJ() || !o.LJ(LIZJ(), c94665akf.LIZJ()) || !o.LJ(LIZLLL(), c94665akf.LIZLLL()) || this.LIZ.getInitiallyVisible() != c94665akf.LIZ.getInitiallyVisible()) {
            z = false;
        }
        return z;
    }
}
