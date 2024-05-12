package ms.bd.o;

import X.AbstractC39721FiP;
import X.C16880lQ;
import X.C34821Yg;
import X.C63183Oqx;
import X.C67562QfO;
import X.C67646Qgk;
import X.InterfaceC67677QhF;
import X.InterfaceC67679QhH;
import X.QMX;
import X.QMY;
import X.X1D;
import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class m2 {
    public static volatile m2 LIZLLL;
    public long LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public m2(Context context) {
        this.LIZIZ = 0;
        this.LIZJ = 0;
        try {
            this.LIZIZ = C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), context) == 0 ? 1 : 0;
            this.LIZJ = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context, 13000000) == 0 ? 1 : 0;
        } catch (Throwable unused) {
            k.a(16777217, 0, 0L, "ba329f", new byte[]{102, 109, 73, 82, 21, 49, 104, 78, 107, 118, 51, 102, 88, 69, 3, 97, 117, 73, 109, 108});
        }
    }

    /* loaded from: classes7.dex */
    public class a implements InterfaceC67677QhF<AbstractC39721FiP> {
        public final /* synthetic */ List LJLIL;

        public a(List list) {
            this.LJLIL = list;
        }

        @Override // X.InterfaceC67677QhF
        public final void onSuccess(AbstractC39721FiP abstractC39721FiP) {
            String LIZ = abstractC39721FiP.LIZ();
            k.a(16777217, 0, 0L, "8ee5a3", new byte[]{0, 105, 2, 68, 89, 54, 50, 80, 45, 37, 8, 87, 63, 1, 113, 15, 122});
            this.LJLIL.add(LIZ);
            this.LJLIL.add("");
            k.a(536870915, 0, m2.this.LIZ, null, this.LJLIL.toArray(new String[0]));
        }
    }

    /* loaded from: classes7.dex */
    public class b implements InterfaceC67679QhH {
        public final /* synthetic */ List LJLIL;

        public b(List list) {
            this.LJLIL = list;
        }

        @Override // X.InterfaceC67679QhH
        public final void onFailure(Exception exc) {
            String message = exc.getMessage();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) k.a(16777217, 0, 0L, "d0521e", new byte[]{92, 60, 82, 67, 9, 96, 110, 5, 125, 34, 84, 2, 111, 6, 43, 64, 85, 62, 86, 35, 53}));
            LIZ.append(exc.getMessage());
            X1D.LIZIZ(LIZ);
            this.LJLIL.add("");
            this.LJLIL.add(message);
            k.a(536870915, 0, m2.this.LIZ, null, this.LJLIL.toArray(new String[0]));
        }
    }

    public final void LIZ(Context context, String str) {
        QMX qmx;
        synchronized (C63183Oqx.class) {
            int i = 0;
            if (C63183Oqx.LJLIL == null) {
                new C34821Yg(i);
                Context LLLLL = C16880lQ.LLLLL(context);
                if (LLLLL == null) {
                    LLLLL = context;
                }
                C63183Oqx.LJLIL = new QMX(LLLLL);
            }
            qmx = C63183Oqx.LJLIL;
        }
        QMY qmy = (QMY) qmx.LIZ.a();
        ArrayList arrayList = new ArrayList();
        if (this.LIZJ != 0) {
            k.a(16777217, 0, 0L, "213a14", new byte[]{16, 54, 78, 17, 7, 45, 54, 80, 75, 63, 55, 54, 71, 7, 7, 55, 40, 80, 67, 1, 10, 115, 82, 16, 31, 54, 52, 3, 118, Byte.MAX_VALUE});
            if (str != null) {
                C67646Qgk LIZ = qmy.LIZ(new C67562QfO(str));
                LIZ.LJ(new a(arrayList));
                LIZ.LJIILLIIL(new b(arrayList));
                return;
            }
            throw new NullPointerException("Null nonce");
        }
        Object a2 = k.a(16777217, 0, 0L, "24eb9c", new byte[]{4, 57, 25, 17, 10, 113, 113, 5, 56, 51, 58, 118, 31, 5, 70, 122, 62, 1, 116, 59, 45, 37, 2, 23, 10, 120, 52, 17});
        arrayList.add("");
        arrayList.add(a2);
        k.a(536870915, 0, this.LIZ, null, arrayList.toArray(new String[0]));
    }
}
