package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import kotlin.jvm.internal.o;

/* renamed from: X.Ac3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26587Ac3 extends AbstractC03160Am<Object> {
    @Override // X.AbstractC03160Am
    public final boolean LIZ(Object obj, Object obj2) {
        return o.LJ(obj, obj2);
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(Object obj, Object obj2) {
        String str;
        if ((obj instanceof ReachableAddress) && (obj2 instanceof ReachableAddress)) {
            Address address = ((ReachableAddress) obj).address;
            String str2 = null;
            if (address != null) {
                str = address.id;
            } else {
                str = null;
            }
            Address address2 = ((ReachableAddress) obj2).address;
            if (address2 != null) {
                str2 = address2.id;
            }
            return o.LJ(str, str2);
        }
        if ((obj instanceof C26592Ac8) && (obj2 instanceof C26592Ac8)) {
            return o.LJ(obj.getClass(), obj2.getClass());
        }
        return o.LJ(obj.getClass(), obj2.getClass());
    }
}
