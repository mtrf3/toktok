package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.EcomImageMonitorImpl;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomUIImage;
import com.ss.android.ugc.aweme.ecommerce.ui.IEcomImageMonitor;
import java.lang.reflect.Field;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.OOg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61826OOg extends C61828OOi {
    public final /* synthetic */ C61828OOi LIZ;
    public final /* synthetic */ EcomUIImage LIZIZ;
    public final /* synthetic */ V9P LIZJ;

    @Override // X.C61828OOi
    public final boolean LIZ() {
        C61828OOi c61828OOi = this.LIZ;
        if (c61828OOi != null) {
            return c61828OOi.LIZ();
        }
        return false;
    }

    @Override // X.C61828OOi
    public final void LIZIZ(int i, int i2) {
        C61828OOi c61828OOi = this.LIZ;
        if (c61828OOi != null) {
            c61828OOi.LIZIZ(i, i2);
        }
    }

    @Override // X.C61828OOi
    public final void LIZLLL(int i, int i2) {
        Object obj;
        C61828OOi c61828OOi = this.LIZ;
        if (c61828OOi != null) {
            c61828OOi.LIZLLL(i, i2);
        }
        EcomUIImage ecomUIImage = this.LIZIZ;
        String str = ecomUIImage.LJLJL;
        if (str == null) {
            return;
        }
        W5O w5o = null;
        try {
            Long remove = ecomUIImage.LJLJLJ.remove(str);
            if (remove != null) {
                EcomUIImage ecomUIImage2 = this.LIZIZ;
                V9P view = this.LIZJ;
                long currentTimeMillis = System.currentTimeMillis();
                IEcomImageMonitor LIZIZ = EcomImageMonitorImpl.LIZIZ();
                o.LJIIIIZZ(view, "view");
                ecomUIImage2.getClass();
                Field field = EcomUIImage.LJLL;
                if (field != null) {
                    obj = field.get(view);
                } else {
                    obj = null;
                }
                if (obj instanceof W5O) {
                    w5o = (W5O) obj;
                }
                LIZIZ.LIZ(true, w5o, currentTimeMillis - remove.longValue(), ecomUIImage2.LJLILLLLZI, null, null, null);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    public C61826OOg(C61828OOi c61828OOi, EcomUIImage ecomUIImage, V9P v9p) {
        this.LIZ = c61828OOi;
        this.LIZIZ = ecomUIImage;
        this.LIZJ = v9p;
    }

    @Override // X.C61828OOi
    public final void LIZJ(int i, int i2, String str) {
        Object obj;
        if (this.LIZIZ.LJIJJLI()) {
            return;
        }
        C61828OOi c61828OOi = this.LIZ;
        if (c61828OOi != null) {
            c61828OOi.LIZJ(i, i2, str);
        }
        EcomUIImage ecomUIImage = this.LIZIZ;
        String str2 = ecomUIImage.LJLJL;
        if (str2 == null) {
            return;
        }
        W5O w5o = null;
        try {
            Long remove = ecomUIImage.LJLJLJ.remove(str2);
            if (remove != null) {
                EcomUIImage ecomUIImage2 = this.LIZIZ;
                V9P view = this.LIZJ;
                long currentTimeMillis = System.currentTimeMillis();
                IEcomImageMonitor LIZIZ = EcomImageMonitorImpl.LIZIZ();
                o.LJIIIIZZ(view, "view");
                ecomUIImage2.getClass();
                Field field = EcomUIImage.LJLL;
                if (field != null) {
                    obj = field.get(view);
                } else {
                    obj = null;
                }
                if (obj instanceof W5O) {
                    w5o = (W5O) obj;
                }
                LIZIZ.LIZ(false, w5o, currentTimeMillis - remove.longValue(), ecomUIImage2.LJLILLLLZI, str, Integer.valueOf(i), Integer.valueOf(i2));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
