package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Lpd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55457Lpd implements InterfaceC48038ItG, InterfaceC73033SlR, C0K7 {
    public static AbstractC51036K1g LJLJJLL = null;
    public static JediViewModel LJLJL = null;
    public static AssemViewModel LJLJLJ = null;
    public static InterfaceC87502YVu LJLJLLL = null;
    public static AbstractC51036K1g LJLL = null;
    public static int LJLLI = -1;
    public static final C55457Lpd LJLIL = new C55457Lpd();
    public static final float[][] LJLILLLLZI = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] LJLJI = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] LJLJJI = {95.047f, 100.0f, 108.883f};
    public static final float[][] LJLJJL = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final C55457Lpd LJLLILLLL = new C55457Lpd();

    public static float LIZLLL() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final void LIZ(Fragment fragment) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        o.LJIIIZ(fragment, "<this>");
        AssemSupervisor LIZIZ = C212428Vi.LIZIZ(fragment);
        if (LIZIZ != null && (copyOnWriteArrayList = LIZIZ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof KR6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((KR6) it2.next()).LJLLILLLL();
            }
        }
    }

    public static int LIZIZ(float f) {
        boolean z;
        float f2;
        float f3;
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f4 = (f + 16.0f) / 116.0f;
        if (f > 8.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2 = f4 * f4 * f4;
        } else {
            f2 = f / 903.2963f;
        }
        float f5 = f4 * f4 * f4;
        if (f5 > 0.008856452f) {
            f3 = f5;
        } else {
            f3 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
            f5 = ((f4 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = LJLJJI;
        return C07290Qj.LIZIZ(f3 * fArr[0], f2 * fArr[1], f5 * fArr[2]);
    }

    public static float LIZJ(int i) {
        float pow;
        float f = i / 255.0f;
        if (f <= 0.04045f) {
            pow = f / 12.92f;
        } else {
            pow = (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        return new DiscoverSectionItem.BannerSection(it);
    }
}
