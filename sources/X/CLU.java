package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CLU implements InterfaceC60949Nw1 {
    public final /* synthetic */ C56K LIZ;

    public CLU(C56K c56k) {
        this.LIZ = c56k;
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZIZ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZLLL(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJFF(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJI(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIIZ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIL(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILJJIL(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILLIIL(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJJLI(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIL(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJJ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJJI(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIJ(SparkPopup sparkPopup, Configuration configuration) {
        CLW.LIZ(sparkPopup, configuration);
    }

    @Override // X.InterfaceC60949Nw1
    public final boolean LJIIJJI(SparkPopup sparkPopup, SparkContext sparkContext) {
        CLW.LIZIZ(sparkPopup, sparkContext);
        return false;
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILL(SparkPopup sparkPopup, Bundle bundle) {
        CLW.LIZLLL(sparkPopup, bundle);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJI(SparkPopup sparkPopup, Bundle bundle) {
        CLW.LIZJ(sparkPopup, bundle);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZJ(SparkPopup popup, View bottomSheet, float f) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(bottomSheet, "bottomSheet");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onSlide slideOffset = ");
        LIZ.append(f);
        LIZ.append(" ms = ");
        LIZ.append(SystemClock.uptimeMillis() - GamePartnershipService.LJLJLLL);
        C0NB.LIZIZ("BottomSheetPage", X1D.LIZIZ(LIZ));
        GamePartnershipService.LJLJLLL = SystemClock.uptimeMillis();
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("slide_offset", Float.valueOf(f));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "game_sheet_on_slide");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJ(SparkPopup popup, View bottomSheet, int i) {
        String str;
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(bottomSheet, "bottomSheet");
        if (i == 5) {
            popup.Nl(true);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str = "STATE_HALF_EXPANDED";
                            }
                        } else {
                            str = "STATE_COLLAPSED";
                        }
                    } else {
                        str = "STATE_EXPANDED";
                    }
                } else {
                    str = "STATE_SETTLING";
                }
            } else {
                str = "STATE_DRAGGING";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" onStateChanged  newState = ");
            LIZ.append(i);
            LIZ.append("  ");
            LIZ.append(str);
            C0NB.LIZIZ("BottomSheetPage", X1D.LIZIZ(LIZ));
        }
        str = "STATE_HIDDEN";
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(" onStateChanged  newState = ");
        LIZ2.append(i);
        LIZ2.append("  ");
        LIZ2.append(str);
        C0NB.LIZIZ("BottomSheetPage", X1D.LIZIZ(LIZ2));
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJII(SparkPopup sparkPopup, View view, Bundle bundle) {
        CLW.LJIIIZ(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILIIL(SparkPopup popup, View view, Bundle bundle) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(view, "view");
        LC0 lc0 = popup.LJLLLLLL;
        if (lc0 == null) {
            return;
        }
        lc0.setAlpha(this.LIZ.element);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIIIZZ(SparkPopup sparkPopup, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CLW.LJI(sparkPopup, layoutInflater);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIZILJ(SparkPopup sparkPopup, int i, String[] strArr, int[] iArr) {
        CLW.LJ(sparkPopup, strArr, iArr);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJJ(SparkPopup sparkPopup, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CLW.LJIIIIZZ(sparkPopup, layoutInflater);
    }
}
