package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* renamed from: X.Wwg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83922Wwg {
    public static VECameraController LIZ(C83921Wwf c83921Wwf) {
        VECameraController vECameraController = new VECameraController(c83921Wwf.LJLIL, c83921Wwf.LJLJI, c83921Wwf.LJLJJI, c83921Wwf.LJLILLLLZI.LJJJJJL(), c83921Wwf.LJLJJL, c83921Wwf.LJLILLLLZI.LLIILII(), c83921Wwf.LJLJL, c83921Wwf.LJLJJLL);
        vECameraController.LLFF = c83921Wwf.LJLILLLLZI.C();
        vECameraController.LLFFF = c83921Wwf.LJLILLLLZI.o();
        vECameraController.LLIIJI = c83921Wwf.LJLILLLLZI.LJJJLIIL();
        vECameraController.LLIIJLIL = c83921Wwf.LJLILLLLZI.LJJJJZ();
        vECameraController.LLIIL = c83921Wwf.LJLILLLLZI.t();
        if (c83921Wwf.LJLILLLLZI.LLJJL()) {
            SparseIntArray sparseIntArray = new SparseIntArray(3);
            sparseIntArray.put(0, 2);
            sparseIntArray.put(2, 3);
            sparseIntArray.put(3, 0);
            vECameraController.LLILIL = sparseIntArray;
        }
        return vECameraController;
    }
}
