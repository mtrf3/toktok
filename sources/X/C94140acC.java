package X;

import com.bytedance.ies.effectcreator.swig.CanvasAnimationListener;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.canvas.CanvasFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.acC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94140acC extends CanvasAnimationListener {
    public final /* synthetic */ CanvasFragment LIZ;

    public C94140acC(CanvasFragment canvasFragment) {
        this.LIZ = canvasFragment;
    }

    @Override // com.bytedance.ies.effectcreator.swig.CanvasAnimationListener
    public final void animationStatusChanged(Feature feature, boolean z) {
        C94613ajp c94613ajp;
        this.LIZ.LJLIL = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("animation:");
        LIZ.append(z);
        C94034aaU.LIZ("CanvasFragment", X1D.LIZIZ(LIZ));
        C94338afO c94338afO = this.LIZ.LJLILLLLZI;
        if (c94338afO != null && (c94613ajp = c94338afO.LJLJI) != null) {
            List<C94252ae0> datalist = c94613ajp.getDatalist();
            if (datalist == null || datalist.isEmpty()) {
                return;
            }
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = -1;
            int size = datalist.size();
            for (int i = 0; i < size; i++) {
                if (((C94252ae0) ListProtector.get(datalist, i)).LJLJI == 3) {
                    c76732zl.element = i;
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("animation1:");
            LIZ2.append(z);
            C94034aaU.LIZ("CanvasFragment", X1D.LIZIZ(LIZ2));
            int i2 = c76732zl.element;
            if (i2 != -1) {
                if (z) {
                    ((C94252ae0) ListProtector.get(datalist, i2)).LJLILLLLZI = Integer.valueOf(R.drawable.dh1);
                } else {
                    ((C94252ae0) ListProtector.get(datalist, i2)).LJLILLLLZI = Integer.valueOf(R.drawable.dgz);
                }
                C93744aVo.LIZIZ(new C94606aji(this, z, c76732zl), 0L);
            }
        }
    }
}
