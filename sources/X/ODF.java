package X;

import android.util.Pair;
import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes11.dex */
public final class ODF extends AbstractC61551ODr<Pair<OEF, UpdatePackage>, Pair<OEF, UpdatePackage>> {
    public C61276O3c LJI;

    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        this.LJI = (C61276O3c) objArr[0];
    }

    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        Pair pair = (Pair) obj;
        OC6.LIZ("gecko-debug-tag", "start decompress zstd file, channel:", ((UpdatePackage) pair.second).getChannel());
        OEF oef = (OEF) pair.first;
        oef.position(0L);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File file = new File(oef.LJJIII().getParentFile(), "res.zst.tmp");
        C61467OAl.LIZJ(file);
        OEF LIZ = C61459OAd.LIZ(this.LJI, file, file.length());
        try {
            try {
                ODC.LIZ(oef, LIZ);
                C16880lQ.LLLZZIL(oef.LJJIII());
                LIZ.position(0L);
                try {
                    C61327O5b.LIZ(new OEG(LIZ), updatePackage.getPackage().getDecompressMd5());
                    try {
                        return c61548ODo.LJ(new Pair(LIZ, updatePackage));
                    } finally {
                        LIZ.release();
                    }
                } catch (Throwable th) {
                    C16880lQ.LLLZZIL(LIZ.LJJIII());
                    throw new C61562OEc(th.getMessage(), th);
                }
            } catch (Exception e) {
                C16880lQ.LLLZZIL(LIZ.LJJIII());
                throw new C61563OEd(e.getMessage(), e);
            }
        } catch (Throwable th2) {
            C16880lQ.LLLZZIL(oef.LJJIII());
            throw th2;
        }
    }
}
