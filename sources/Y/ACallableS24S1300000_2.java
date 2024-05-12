package Y;

import X.AbstractC1552267i;
import X.C162396Yx;
import X.C16880lQ;
import X.C1JI;
import X.C67L;
import X.C67P;
import X.C76800UCe;
import X.H78;
import X.W5G;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS24S1300000_2 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS24S1300000_2 aCallableS24S1300000_2) {
        C162396Yx c162396Yx = (C162396Yx) aCallableS24S1300000_2.l1;
        if (c162396Yx != null) {
            String key = aCallableS24S1300000_2.s0;
            Bitmap bitmap = (Bitmap) aCallableS24S1300000_2.l2;
            o.LJIIIIZZ(bitmap, "bitmap");
            o.LJIIIZ(key, "key");
            if (c162396Yx.LIZJ) {
                c162396Yx.LIZ.put(key, bitmap);
            }
        }
        ((W5G) aCallableS24S1300000_2.l3).setImageBitmap((Bitmap) aCallableS24S1300000_2.l2);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS24S1300000_2 aCallableS24S1300000_2) {
        Bitmap bitmap;
        AbstractC1552267i abstractC1552267i = (AbstractC1552267i) aCallableS24S1300000_2.l1;
        View view = (View) aCallableS24S1300000_2.l2;
        View view2 = (View) aCallableS24S1300000_2.l3;
        String str = aCallableS24S1300000_2.s0;
        abstractC1552267i.getClass();
        H78.LIZ("StickerCompiler -> saveBgTask -> task running");
        ViewGroup viewGroup = (ViewGroup) view;
        if (view2 instanceof C67P) {
            if (C1JI.LJIL((C67P) view2)) {
                bitmap = AbstractC1552267i.LIZJ(view2, viewGroup);
            } else {
                AObjectS14S0001000_13 aObjectS14S0001000_13 = new AObjectS14S0001000_13(1, 0);
                int childCount = viewGroup.getChildCount();
                View[] viewArr = new View[childCount];
                int childCount2 = viewGroup.getChildCount();
                while (true) {
                    childCount2--;
                    if (childCount2 < 0) {
                        break;
                    }
                    if (viewGroup.getChildAt(childCount2) != view2) {
                        viewArr[childCount2] = viewGroup.getChildAt(childCount2);
                        C16880lQ.LLIFFJFJJ(childCount2, viewGroup);
                    }
                }
                int visibility = view2.getVisibility();
                if (visibility != 0) {
                    view2.setVisibility(0);
                }
                view2.invalidate();
                viewGroup.invalidate();
                Object invoke = aObjectS14S0001000_13.invoke(viewGroup);
                if (visibility != 0) {
                    view2.setVisibility(visibility);
                }
                for (int i = 0; i < childCount; i++) {
                    View view3 = viewArr[i];
                    if (view3 != null) {
                        viewGroup.addView(view3, i);
                    }
                }
                bitmap = (Bitmap) invoke;
            }
            return new C67L(bitmap, Integer.valueOf(CastIntegerProtector.parseInt(str.substring(str.lastIndexOf("_") + 1, str.lastIndexOf(".")))));
        }
        return new C67L(AbstractC1552267i.LIZJ(view2, viewGroup), Integer.valueOf(viewGroup.indexOfChild(view2)));
    }

    public ACallableS24S1300000_2(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
