package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.filterparam.VEVideoTransformFilterParam;
import java.util.HashMap;

/* renamed from: X.Wiq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83064Wiq {
    public VESize LIZJ;
    public CanvasFilterParam LIZLLL;
    public final HashMap<String, VEVideoTransformFilterParam> LIZ = new HashMap<>();
    public String LIZIZ = "unset";
    public final MutableLiveData<VEVideoTransformFilterParam> LJ = new MutableLiveData<>();

    public final VEVideoTransformFilterParam LIZ() {
        HashMap<String, VEVideoTransformFilterParam> hashMap = this.LIZ;
        String str = this.LIZIZ;
        VEVideoTransformFilterParam vEVideoTransformFilterParam = hashMap.get(str);
        if (vEVideoTransformFilterParam == null) {
            CanvasFilterParam canvasFilterParam = this.LIZLLL;
            if (canvasFilterParam != null) {
                vEVideoTransformFilterParam = C79004UzY.LJJJJZI(canvasFilterParam);
            } else {
                vEVideoTransformFilterParam = new VEVideoTransformFilterParam();
            }
            hashMap.put(str, vEVideoTransformFilterParam);
        }
        return vEVideoTransformFilterParam;
    }
}
