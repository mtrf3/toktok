package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class CLV implements InterfaceC60949Nw1 {
    public final /* synthetic */ SheetOptions LIZ;
    public final /* synthetic */ C31124CJk LIZIZ;
    public final /* synthetic */ SparkContext LIZJ;

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
        o.LJIIIZ(popup, "popup");
        C31124CJk c31124CJk = this.LIZIZ;
        C12830et c12830et = c31124CJk.LJLJJL;
        if (c12830et != null) {
            c12830et.LJIIJJI(c31124CJk);
        }
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
        o.LJIIIZ(popup, "popup");
        C12830et c12830et = this.LIZIZ.LJLJJL;
        if (c12830et != null) {
            c12830et.LIZ();
        }
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

    public CLV(SheetOptions sheetOptions, C31124CJk c31124CJk, SparkContext sparkContext) {
        this.LIZ = sheetOptions;
        this.LIZIZ = c31124CJk;
        this.LIZJ = sparkContext;
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZJ(SparkPopup popup, View bottomSheet, float f) {
        LC0 lc0;
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(bottomSheet, "bottomSheet");
        CLW.LJFF(popup, bottomSheet);
        if (this.LIZ.fullscreenEnabled && (lc0 = popup.LJLLLLLL) != null) {
            lc0.setAlpha(Math.max(0.0f, 1 - f));
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("container_id", this.LIZJ.containerId);
        jSONObject.put("slide_offset", Float.valueOf(f));
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "sheet_on_slide");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJ(SparkPopup popup, View bottomSheet, int i) {
        boolean z;
        C12830et c12830et;
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(bottomSheet, "bottomSheet");
        CLW.LJIIJ(popup, bottomSheet);
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("container_id", this.LIZJ.containerId);
        jSONObject.put("new_state", i);
        C01R.LIZIZ(currentTimeMillis, new C78528Urs(jSONObject), "sheet_on_state_change");
        C31124CJk c31124CJk = this.LIZIZ;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        c31124CJk.LJLJJLL = z;
        C12840eu.LIZ.LIZLLL();
        if (i == 5 && (c12830et = this.LIZIZ.LJLJJL) != null) {
            c12830et.LIZ();
        }
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJII(SparkPopup sparkPopup, View view, Bundle bundle) {
        CLW.LJIIIZ(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILIIL(SparkPopup popup, View view, Bundle bundle) {
        LC0 lc0;
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(view, "view");
        CLW.LJII(popup, view);
        if (!this.LIZ.fullscreenEnabled || (lc0 = popup.LJLLLLLL) == null) {
            return;
        }
        lc0.setAlpha(1.0f);
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
