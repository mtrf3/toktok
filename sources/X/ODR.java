package X;

import com.bytedance.geckox.model.UpdatePackage;
import defpackage.i0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class ODR<IN, OUT> extends AbstractC61539ODf<IN, OUT> {
    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        String str;
        UpdatePackage updatePackage = (UpdatePackage) obj;
        if (updatePackage.getIsZstd()) {
            str = "branch_zstd";
        } else {
            int packageType = updatePackage.getPackageType();
            if (packageType != 0) {
                if (packageType == 1) {
                    str = "branch_single_file";
                } else {
                    throw new RuntimeException(KMP.LJ("unknown file type: ", packageType));
                }
            } else {
                str = "branch_zip";
            }
        }
        OEA oea = this.LJI.get(str);
        if (oea != null) {
            List<OE0> list = oea.LIZ;
            Object LJ = C61558ODy.LIZIZ(list, c61548ODo, this).LJ(obj);
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.isEmpty() || ((OE0) U26.LIZIZ(arrayList, 1, list)).LIZ != C61577OEr.class) {
                return LJ;
            }
            return c61548ODo.LJ(LJ);
        }
        throw new IllegalArgumentException(i0.LJFF("can not found branch, branch name is：", str));
    }
}
