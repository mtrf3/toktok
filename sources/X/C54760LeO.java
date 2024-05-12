package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.LeO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54760LeO implements InterfaceC54674Ld0 {
    public final /* synthetic */ PoiPublishExtensionAssem LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC54674Ld0
    public final void LIZIZ(int i, String str) {
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZJ(int i) {
    }

    @Override // X.InterfaceC54674Ld0
    public final void LIZ() {
        C16880lQ.LJZI(this.LIZ.K3(), this.LIZIZ);
        LinearLayout poiContainer = this.LIZ.K3();
        o.LJIIIIZZ(poiContainer, "poiContainer");
        if (poiContainer.getChildCount() != 0) {
            LinearLayout poiContainer2 = this.LIZ.K3();
            o.LJIIIIZZ(poiContainer2, "poiContainer");
            View LIZJ = C78924UyG.LIZJ(poiContainer2);
            ViewGroup.LayoutParams layoutParams = LIZJ.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            LIZJ.setLayoutParams(marginLayoutParams);
        }
    }

    public C54760LeO(PoiPublishExtensionAssem poiPublishExtensionAssem, View view) {
        this.LIZ = poiPublishExtensionAssem;
        this.LIZIZ = view;
    }
}
