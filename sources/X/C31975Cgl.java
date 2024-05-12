package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* renamed from: X.Cgl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31975Cgl implements InterfaceC60949Nw1 {
    public final /* synthetic */ SparkContext LIZ;

    public C31975Cgl(SparkContext sparkContext) {
        this.LIZ = sparkContext;
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
        o.LJIIIZ(popup, "popup");
        C31976Cgm.LIZ().LIZ(1, this.LIZ.url, this.LIZ.LJI());
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
        o.LJIIIZ(popup, "popup");
        C31976Cgm.LIZ().LIZ(2, this.LIZ.url, this.LIZ.LJI());
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILJJIL(SparkPopup popup) {
        EnumC39924Flg enumC39924Flg;
        o.LJIIIZ(popup, "popup");
        C40187Fpv LIZ = C31976Cgm.LIZ();
        InterfaceC60761Nsz LJI = this.LIZ.LJI();
        SparkContext sparkContext = this.LIZ;
        String str = sparkContext.url;
        InterfaceC60710NsA interfaceC60710NsA = sparkContext.hybridParams;
        if (interfaceC60710NsA != null) {
            enumC39924Flg = interfaceC60710NsA.getType();
        } else {
            enumC39924Flg = null;
        }
        LIZ.LIZIZ(LJI, str, enumC39924Flg, 1);
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
    public final void LJIJJ(SparkPopup sparkPopup, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CLW.LJIIIIZZ(sparkPopup, layoutInflater);
    }
}
