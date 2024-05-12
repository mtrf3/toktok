package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ci2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32054Ci2<P, R> extends AbstractC38123Exj<P, R> implements InterfaceC31231CNn {
    public boolean LJLIL;
    public Fragment LJLILLLLZI;

    public AbstractC32054Ci2(SparkContext sparkContext) {
        Fragment fragment;
        o.LJIIIZ(sparkContext, "sparkContext");
        InterfaceC40159FpT LJIILL = sparkContext.LJIILL();
        if (LJIILL == null) {
            return;
        }
        Object LJIILL2 = sparkContext.LJIILL();
        if (LJIILL2 instanceof SparkPopup) {
            this.LJLILLLLZI = (Fragment) LJIILL2;
        } else if (LJIILL2 instanceof ActivityC45651qj) {
            this.LJLIL = true;
            List<Fragment> LJJJJLI = ((ActivityC45651qj) LJIILL2).getSupportFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "container.supportFragmentManager.fragments");
            Iterator<Fragment> it = LJJJJLI.iterator();
            while (true) {
                if (it.hasNext()) {
                    fragment = it.next();
                    if (fragment instanceof SparkFragment) {
                        break;
                    }
                } else {
                    fragment = null;
                    break;
                }
            }
            this.LJLILLLLZI = fragment;
        }
        if (LJIILL instanceof InterfaceC32055Ci3) {
            ((InterfaceC32055Ci3) LJIILL).ec(new C32053Ci1(this));
        }
    }

    public AbstractC32054Ci2(BaseFragment baseFragment) {
        this.LJLILLLLZI = baseFragment;
    }
}
