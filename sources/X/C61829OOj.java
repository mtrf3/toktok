package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.EcomImageMonitorImpl;
import com.ss.android.ugc.aweme.ecommerce.ui.EcomFlattenUIImage;
import java.util.concurrent.CancellationException;

/* renamed from: X.OOj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61829OOj extends C61828OOi {
    public final /* synthetic */ C61828OOi LIZ;
    public final /* synthetic */ EcomFlattenUIImage LIZIZ;

    public C61829OOj(C61828OOi c61828OOi, EcomFlattenUIImage ecomFlattenUIImage) {
        this.LIZ = c61828OOi;
        this.LIZIZ = ecomFlattenUIImage;
    }

    @Override // X.C61828OOi
    public final void LIZLLL(int i, int i2) {
        C61828OOi c61828OOi = this.LIZ;
        if (c61828OOi != null) {
            c61828OOi.LIZLLL(i, i2);
        }
        EcomFlattenUIImage ecomFlattenUIImage = this.LIZIZ;
        String str = ecomFlattenUIImage.LJLJL;
        if (str == null) {
            return;
        }
        try {
            Long remove = ecomFlattenUIImage.LJLJLJ.remove(str);
            if (remove != null) {
                EcomFlattenUIImage ecomFlattenUIImage2 = this.LIZIZ;
                EcomImageMonitorImpl.LIZIZ().LIZ(true, ecomFlattenUIImage2.mLynxImageManager.LJIILJJIL, System.currentTimeMillis() - remove.longValue(), ecomFlattenUIImage2.LJLILLLLZI, null, null, null);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }

    @Override // X.C61828OOi
    public final void LIZJ(int i, int i2, String str) {
        if (this.LIZIZ.LJIJJLI()) {
            return;
        }
        C61828OOi c61828OOi = this.LIZ;
        if (c61828OOi != null) {
            c61828OOi.LIZJ(i, i2, str);
        }
        EcomFlattenUIImage ecomFlattenUIImage = this.LIZIZ;
        String str2 = ecomFlattenUIImage.LJLJL;
        if (str2 == null) {
            return;
        }
        try {
            Long remove = ecomFlattenUIImage.LJLJLJ.remove(str2);
            if (remove != null) {
                EcomFlattenUIImage ecomFlattenUIImage2 = this.LIZIZ;
                EcomImageMonitorImpl.LIZIZ().LIZ(false, ecomFlattenUIImage2.mLynxImageManager.LJIILJJIL, System.currentTimeMillis() - remove.longValue(), ecomFlattenUIImage2.LJLILLLLZI, str, Integer.valueOf(i), Integer.valueOf(i2));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
    }
}
