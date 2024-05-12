package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWK implements NXB {
    public final /* synthetic */ NWF LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.NXB
    public final void LIZIZ() {
        Activity LJIJJ = C45804HyK.LJIJJ(this.LIZIZ);
        if (LJIJJ != null && LJIJJ.isFinishing()) {
            return;
        }
        this.LIZ.LJLJLJ = true;
    }

    @Override // X.NXB
    public final void LIZJ() {
        this.LIZ.LIZ(R.id.hxg).setVisibility(8);
        View findViewById = this.LIZ.LIZ(R.id.hxh).findViewById(R.id.cyv);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        NWF nwf = this.LIZ;
        if (nwf.LLF && !o.LJ("about:blank", ((NZQ) nwf.LIZ(R.id.hxh)).getCurrentUrl())) {
            nwf.LLF = false;
            nwf.LIZJ();
        }
        if (nwf.LJIIJ()) {
            ((C2314696o) nwf.LIZ(R.id.hxq)).LIZJ();
            nwf.LIZ(R.id.hxm).setBackgroundResource(R.drawable.a0t);
            ((C59571NZn) nwf.LIZ(R.id.hxb)).LJIIJ(((NZQ) nwf.LIZ(R.id.hxh)).getCrossPlatformParams(), nwf.LJLJJL);
            if (!nwf.LLFF && !nwf.LJLJJL && NWB.LIZIZ(((NZQ) nwf.LIZ(R.id.hxh)).getCrossPlatformParams())) {
                if (nwf.LIZ(R.id.hxb).getVisibility() == 8) {
                    nwf.LIZ(R.id.hxb).setVisibility(0);
                    ((C59571NZn) nwf.LIZ(R.id.hxb)).LJIIIZ();
                }
            } else if (!nwf.LLFF && ((NZQ) nwf.LIZ(R.id.hxh)).canGoBack() && nwf.LIZ(R.id.hxb).getVisibility() == 8) {
                nwf.LIZ(R.id.hxb).setVisibility(0);
                ((C59571NZn) nwf.LIZ(R.id.hxb)).LJIIIZ();
            }
            ((C59571NZn) nwf.LIZ(R.id.hxb)).setGoBackEnable(((NZQ) nwf.LIZ(R.id.hxh)).canGoBack());
            ((C59571NZn) nwf.LIZ(R.id.hxb)).setGoForwardEnable(((NZQ) nwf.LIZ(R.id.hxh)).canGoForward());
            return;
        }
        NXI nxi = (NXI) ((NZQ) nwf.LIZ(R.id.hxh)).LJI(NXI.class);
        nxi.canGoBack();
        if (nxi.canGoBack()) {
            ((ImageView) ((C2314696o) nwf.LIZ(R.id.hxq)).LIZ(R.id.hx9)).setVisibility(0);
        } else {
            ((C2314696o) nwf.LIZ(R.id.hxq)).LIZJ();
        }
    }

    @Override // X.NXB
    public final void LIZLLL() {
        this.LIZ.LIZ(R.id.hxg).setVisibility(0);
        View findViewById = this.LIZ.LIZ(R.id.hxh).findViewById(R.id.cyv);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // X.NXB
    public final void LIZ() {
    }

    @Override // X.NXB
    public final void LJ() {
    }

    public NWK(Context context, NWF nwf) {
        this.LIZ = nwf;
        this.LIZIZ = context;
    }
}
