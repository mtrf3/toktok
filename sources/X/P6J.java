package X;

import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class P6J implements P3Q {
    public final /* synthetic */ C84133X0f LJLIL;

    public P6J(C84133X0f c84133X0f) {
        this.LJLIL = c84133X0f;
    }

    @Override // X.P3Q
    public final TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
        if (this.LJLIL.LJLJLLL == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            arrayList.add(new VESize(tEFrameSizei.width, tEFrameSizei.height));
        }
        VESize LIZ = this.LJLIL.LJLJLLL.LIZ(arrayList);
        if (LIZ == null) {
            return null;
        }
        TEFrameSizei tEFrameSizei2 = new TEFrameSizei();
        tEFrameSizei2.width = LIZ.width;
        tEFrameSizei2.height = LIZ.height;
        return tEFrameSizei2;
    }
}
