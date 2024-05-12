package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import kotlin.jvm.internal.o;

/* renamed from: X.B0s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28090B0s extends AbstractC03160Am<Object> {
    @Override // X.AbstractC03160Am
    public final boolean LIZ(Object obj, Object obj2) {
        Boolean bool;
        Boolean bool2;
        if (o.LJ(obj, obj2)) {
            Boolean bool3 = null;
            if ((obj instanceof B1J) && (obj2 instanceof B1J)) {
                B1J b1j = (B1J) obj;
                Availability availability = b1j.LIZ.availability;
                if (availability != null) {
                    bool2 = availability.isAvailable;
                } else {
                    bool2 = null;
                }
                B1J b1j2 = (B1J) obj2;
                Availability availability2 = b1j2.LIZ.availability;
                if (availability2 != null) {
                    bool3 = availability2.isAvailable;
                }
                if (!o.LJ(bool2, bool3) || !o.LJ(b1j.LIZ.balance, b1j2.LIZ.balance)) {
                    return false;
                }
                return true;
            }
            if ((obj instanceof C28120B1w) && (obj2 instanceof C28120B1w)) {
                B2I b2i = (B2I) obj;
                Availability availability3 = b2i.LIZIZ.availability;
                if (availability3 != null) {
                    bool = availability3.isAvailable;
                } else {
                    bool = null;
                }
                B2I b2i2 = (B2I) obj2;
                Availability availability4 = b2i2.LIZIZ.availability;
                if (availability4 != null) {
                    bool3 = availability4.isAvailable;
                }
                if (!o.LJ(bool, bool3) || !o.LJ(b2i.LIZIZ.balance, b2i2.LIZIZ.balance)) {
                    return false;
                }
                return true;
            }
        }
        return o.LJ(obj, obj2);
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(Object obj, Object obj2) {
        if ((obj instanceof B1J) && (obj2 instanceof B1J)) {
            return C61841OOv.LIZIZ(((B1J) obj).LIZ, ((B1J) obj2).LIZ);
        }
        if ((obj instanceof B2I) && (obj2 instanceof B2I)) {
            B2I b2i = (B2I) obj;
            B2I b2i2 = (B2I) obj2;
            if (o.LJ(b2i.LIZ.id, b2i2.LIZ.id) && C61841OOv.LIZIZ(b2i.LIZIZ, b2i2.LIZIZ)) {
                return true;
            }
            return false;
        }
        return o.LJ(obj, obj2);
    }
}
