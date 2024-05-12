package Y;

import X.C26634Aco;
import X.C62850Ola;
import X.C78946Uyc;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addressitem.GlobalAddressItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectaddress.USLogisticSelectAddressItemVH;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS19S0310000_4;

/* loaded from: classes5.dex */
public class ARunnableS3S0310000_4 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        View view = ((GlobalAddressItemViewHolder) this.l0).itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), new AqS154S0100000_4((Address) this.l1, 1126), new AqS19S0310000_4((Address) this.l1, (C26634Aco) this.l2, (GlobalAddressItemViewHolder) this.l0, this.z3, 5));
    }

    public final void LIZ$1() {
        View view = ((USLogisticSelectAddressItemVH) this.l0).itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), new AqS154S0100000_4((Address) this.l1, 1271), new AqS19S0310000_4((Address) this.l1, (ReachableAddress) this.l2, (USLogisticSelectAddressItemVH) this.l0, this.z3, 7));
    }

    public static final void run$0(ARunnableS3S0310000_4 aRunnableS3S0310000_4) {
        boolean LIZ;
        try {
            aRunnableS3S0310000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0310000_4 aRunnableS3S0310000_4) {
        boolean LIZ;
        try {
            aRunnableS3S0310000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0310000_4(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.z3 = z;
        this.l2 = obj2;
    }
}
