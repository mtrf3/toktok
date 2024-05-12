package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WEc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81946WEc implements WEY {
    public final /* synthetic */ C81947WEd LIZ;

    public C81946WEc(C81947WEd c81947WEd) {
        this.LIZ = c81947WEd;
    }

    public final void LIZIZ(float f, int i) {
        C81947WEd c81947WEd = this.LIZ;
        float f2 = 255.0f * f;
        c81947WEd.LJLLI = f2;
        c81947WEd.setBackgroundColor(c81947WEd.LIZJ(f2));
        C81949WEf c81949WEf = this.LIZ.LJLJJI;
        if (c81949WEf != null && f <= 0.05d && i == 2) {
            List list = c81949WEf.LJIIIIZZ;
            if (list == null) {
                list = new ArrayList();
            }
            ImageView imageView = (ImageView) ListProtector.get(list, this.LIZ.LJLJJI.LIZ);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }
    }

    public final void LIZ(int i, int i2, int i3) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C81947WEd c81947WEd = this.LIZ;
        c81947WEd.LJLL = false;
        if (i2 == 100) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                c81947WEd.LJI();
                return;
            }
            c81947WEd.LIZ();
            C80841Vo5 c80841Vo5 = this.LIZ.LJLILLLLZI;
            if (c80841Vo5 != null) {
                c80841Vo5.setVisibility(0);
            }
            WET wet = this.LIZ.LJLIL;
            if (wet == null || (viewGroup2 = (ViewGroup) wet.getParent()) == null) {
                return;
            }
            C16880lQ.LJLLL(wet, viewGroup2);
            return;
        }
        if (i != 1) {
            if (i != 2 || i3 != 201) {
                return;
            }
            c81947WEd.LJI();
            return;
        }
        if (i3 != 201) {
            return;
        }
        c81947WEd.LIZ();
        C80841Vo5 c80841Vo52 = this.LIZ.LJLILLLLZI;
        if (c80841Vo52 != null) {
            c80841Vo52.setVisibility(0);
        }
        WET wet2 = this.LIZ.LJLIL;
        if (wet2 == null || (viewGroup = (ViewGroup) wet2.getParent()) == null) {
            return;
        }
        C16880lQ.LJLLL(wet2, viewGroup);
    }
}
