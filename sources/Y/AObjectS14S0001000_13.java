package Y;

import X.C2068389v;
import X.C37203Eit;
import X.C39214FaE;
import X.C6PB;
import X.C75017TcL;
import X.C75852Tpo;
import X.C76800UCe;
import X.C83622Wrq;
import X.CF3;
import X.GGS;
import X.GGT;
import X.InterfaceC88472Yns;
import X.V8I;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import java.util.Objects;

/* loaded from: classes14.dex */
public class AObjectS14S0001000_13 implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public AObjectS14S0001000_13(int i, int i2) {
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AObjectS14S0001000_13 aObjectS14S0001000_13, Object obj) {
        Bitmap bitmap = null;
        switch (aObjectS14S0001000_13.i0) {
            case 0:
                V8I v8i = (V8I) obj;
                CF3.LIZLLL(v8i.LIZ, v8i.LIZIZ, v8i.LIZJ, v8i.LIZLLL, v8i.LJ, v8i.LJFF, "local_mock", v8i.LJI);
                return C76800UCe.LIZ;
            case 1:
                View view = (View) obj;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    createBitmap.setDensity(C6PB.LIZ().getResources().getDisplayMetrics().densityDpi);
                    if (view.getDrawingCacheBackgroundColor() != 0) {
                        createBitmap.eraseColor(view.getDrawingCacheBackgroundColor());
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate(-view.getScrollX(), -view.getScrollY());
                    C37203Eit.LIZJ.getClass();
                    C39214FaE.LIZ(view, canvas);
                    bitmap = createBitmap;
                    return bitmap;
                } catch (OutOfMemoryError e) {
                    C6PB.LIZJ();
                    C6PB.LIZJ().LIZIZ(e);
                    return bitmap;
                }
            case 2:
                ((BaseViewModel) obj).config(new AObjectS22S0001000_6(1, 7));
                return null;
            case 3:
                return SettingNewVersionFragment.lambda$initUnits$8((C2068389v) obj);
            default:
                return C83622Wrq.O1((Integer) obj);
        }
    }

    public static final Object invoke$1(AObjectS14S0001000_13 aObjectS14S0001000_13, Object obj) {
        switch (aObjectS14S0001000_13.i0) {
            case 0:
                C75017TcL.LJ((String) obj, false);
                return C76800UCe.LIZ;
            default:
                return SettingNewVersionFragment.lambda$initUnits$81((C2068389v) obj);
        }
    }

    public static final Object invoke$2(AObjectS14S0001000_13 aObjectS14S0001000_13, Object obj) {
        switch (aObjectS14S0001000_13.i0) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    C75852Tpo.LIZIZ();
                }
                return C76800UCe.LIZ;
            default:
                ((BaseViewModel) obj).config(new AObjectS26S0000000_13(0));
                return null;
        }
    }

    public static final Object invoke$3(AObjectS14S0001000_13 aObjectS14S0001000_13, Object obj) {
        switch (aObjectS14S0001000_13.i0) {
            case 0:
                GGT ggt = GGS.LIZ;
                Objects.requireNonNull(ggt);
                ((BaseViewModel) obj).config(new AObjectS49S0101000_4(0, ggt, 1));
                return null;
            case 1:
                BaseViewModel baseViewModel = (BaseViewModel) obj;
                GGT ggt2 = GGS.LIZ;
                Objects.requireNonNull(ggt2);
                baseViewModel.config(new AObjectS56S0101000_13(3, ggt2, 1));
                baseViewModel.config(new AObjectS26S0000000_13(3));
                return null;
            default:
                return SettingNewVersionFragment.lambda$initUnits$61((C2068389v) obj);
        }
    }
}
