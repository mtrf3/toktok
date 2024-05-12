package X;

import com.bytedance.geckox.model.UpdatePackage;

/* renamed from: X.ODg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61540ODg extends ODQ<UpdatePackage, UpdatePackage> {
    @Override // X.ODQ
    public final void LIZJ(Object obj, Throwable th, String str) {
        UpdatePackage updatePackage = (UpdatePackage) obj;
        if ("patch".equals(str)) {
            updatePackage.setUpdateWithPatch(false);
            OC6.LIZ("gecko-debug-tag", "start full update", updatePackage.toString());
        } else {
            StringBuilder LIZ = X1D.LIZ();
            throw new RuntimeException(C03090Af.LIZJ(LIZ, "full update failed, caused by:", th, LIZ), th);
        }
    }
}
