package Y;

import X.A4T;
import X.A4Y;
import X.C76800UCe;
import X.EnumC25632A4e;
import X.InterfaceC35811ar;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDfS22S0200000_4 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64672gJ
    public final Object emit(List<? extends A4Y> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, list, interfaceC67352kd);
            case 1:
                return emit$1(this, list, interfaceC67352kd);
            case 2:
                return emit$2(this, list, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS22S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final Object emit$0(IDfS22S0200000_4 iDfS22S0200000_4, Object obj, InterfaceC67352kd interfaceC67352kd) {
        Long l;
        List list = (List) obj;
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) iDfS22S0200000_4.l1;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                A4Y a4y = (A4Y) it.next();
                Long collectionId = a4y.getCollectionId();
                CollectionDetailModel collectionDetailModel = (CollectionDetailModel) ((InterfaceC35811ar) iDfS22S0200000_4.l0).getValue();
                if (collectionDetailModel != null) {
                    l = new Long(collectionDetailModel.getCollectionId());
                } else {
                    l = null;
                }
                if (o.LJ(collectionId, l) && a4y.getTempOverrideState() == EnumC25632A4e.CREATION) {
                    z = true;
                    break;
                }
            }
        }
        interfaceC35811ar.setValue(Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }

    public static final Object emit$1(IDfS22S0200000_4 iDfS22S0200000_4, Object obj, InterfaceC67352kd interfaceC67352kd) {
        CollectionDetailModel value;
        Long l;
        List list = (List) obj;
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) iDfS22S0200000_4.l1;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                A4Y a4y = (A4Y) it.next();
                Long collectionId = a4y.getCollectionId();
                value = ((InterfaceC35811ar) iDfS22S0200000_4.l0).getValue();
                if (value != null) {
                    l = new Long(value.getCollectionId());
                } else {
                    l = null;
                }
                if (o.LJ(collectionId, l) && a4y.getTempOverrideState() == EnumC25632A4e.CREATION) {
                    z = true;
                    break;
                }
            }
        }
        interfaceC35811ar.setValue(Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }

    public static final Object emit$2(IDfS22S0200000_4 iDfS22S0200000_4, Object obj, InterfaceC67352kd interfaceC67352kd) {
        List list = (List) obj;
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) iDfS22S0200000_4.l1;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                A4Y a4y = (A4Y) it.next();
                Long collectionId = a4y.getCollectionId();
                long collectionId2 = ((A4T) iDfS22S0200000_4.l0).getCollectionId();
                if (collectionId != null && collectionId.longValue() == collectionId2 && a4y.getTempOverrideState() == EnumC25632A4e.CREATION) {
                    z = true;
                    break;
                }
            }
        }
        interfaceC35811ar.setValue(Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }
}
