package X;

import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* renamed from: X.EdA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class CallableC36848EdA extends AbstractC37055EgV implements Callable<C37021Efx> {
    @Override // java.util.concurrent.Callable
    public final C37021Efx call() {
        try {
            java.net.URL LIZIZ = AbstractC37055EgV.LIZIZ();
            if (C36849EdB.LIZJ == null) {
                C36849EdB.LIZJ = new P9P();
            }
            String LIZ = C36849EdB.LIZJ.LIZ(LIZIZ.toString(), LIZ());
            if (TextUtils.isEmpty(LIZ)) {
                return new C37021Efx();
            }
            try {
                return AbstractC37055EgV.LIZLLL(LIZ);
            } catch (JSONException e) {
                C37021Efx c37021Efx = new C37021Efx();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("source:  ");
                LIZ2.append(LIZ);
                LIZ2.append("  case : ");
                LIZ2.append(e.getMessage());
                AbstractC37055EgV.LIZJ(X1D.LIZIZ(LIZ2));
                return c37021Efx;
            }
        } catch (Exception e2) {
            C37021Efx c37021Efx2 = new C37021Efx();
            AbstractC37055EgV.LIZJ(e2.getMessage());
            return c37021Efx2;
        }
    }

    public CallableC36848EdA(C37060Ega c37060Ega) {
        super(c37060Ega);
    }
}
