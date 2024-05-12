package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService;
import kotlin.jvm.internal.o;

/* renamed from: X.Cgj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31973Cgj implements InterfaceC60949Nw1 {
    public final /* synthetic */ IBTMTrackerService LIZ;

    public C31973Cgj(IBTMTrackerService iBTMTrackerService) {
        this.LIZ = iBTMTrackerService;
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
    public final void LIZJ(SparkPopup sparkPopup, View view, float f) {
        CLW.LJFF(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJ(SparkPopup sparkPopup, View view, int i) {
        CLW.LJIIJ(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJII(SparkPopup sparkPopup, View view, Bundle bundle) {
        CLW.LJIIIZ(sparkPopup, view);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILIIL(SparkPopup sparkPopup, View view, Bundle bundle) {
        CLW.LJII(sparkPopup, view);
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
    public final void LJIJJ(SparkPopup popup, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String LIZ;
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(inflater, "inflater");
        CLW.LJIIIIZZ(popup, inflater);
        SparkContext sparkContext = popup.LJLLI;
        if (sparkContext != null && (str = sparkContext.url) != null && (LIZ = C73592uh.LIZ(str)) != null && C78685UuP.LJJJZ(LIZ)) {
            this.LIZ.LJ(LIZ, popup);
        }
    }
}
