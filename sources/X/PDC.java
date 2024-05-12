package X;

import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class PDC implements PDB {
    public final /* synthetic */ EnumC84152X0y LIZ;

    public PDC(EnumC84152X0y enumC84152X0y) {
        this.LIZ = enumC84152X0y;
    }

    @Override // X.PDB
    public final TEFrameSizei LIZ(List<TEFrameSizei> list, List<TEFrameSizei> list2) {
        PDF pdf = this.LIZ.mPictureSizeCallback;
        if (pdf != null) {
            PDE pde = (PDE) pdf;
            if (pde.LIZ.LJLJLJ != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    TEFrameSizei tEFrameSizei = (TEFrameSizei) it.next();
                    arrayList.add(new VESize(tEFrameSizei.width, tEFrameSizei.height));
                }
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    TEFrameSizei tEFrameSizei2 = (TEFrameSizei) it2.next();
                    arrayList2.add(new VESize(tEFrameSizei2.width, tEFrameSizei2.height));
                }
                VESize LIZ = pde.LIZ.LJLJLJ.LIZ(arrayList);
                if (LIZ != null) {
                    TEFrameSizei tEFrameSizei3 = new TEFrameSizei();
                    tEFrameSizei3.width = LIZ.width;
                    tEFrameSizei3.height = LIZ.height;
                    return tEFrameSizei3;
                }
            }
        }
        return null;
    }
}
