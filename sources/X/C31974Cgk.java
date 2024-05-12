package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask;
import kotlin.jvm.internal.o;

/* renamed from: X.Cgk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31974Cgk implements InterfaceC60949Nw1 {
    public final /* synthetic */ DynamicPopupTask LIZ;
    public final /* synthetic */ C54082LKk LIZIZ;
    public final /* synthetic */ M78 LIZJ;

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
        o.LJIIIZ(popup, "popup");
        this.LIZJ.LIZ();
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
    public final boolean LJIIJJI(SparkPopup popup, SparkContext sparkContext) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(sparkContext, "sparkContext");
        DynamicPopupTask dynamicPopupTask = this.LIZ;
        if (dynamicPopupTask.LJLILLLLZI) {
            ActivityC45651qj LIZJ = this.LIZIZ.LIZJ();
            if (LIZJ != null) {
                if (LKR.LIZIZ(LIZJ, this.LIZ.LJLIL)) {
                    this.LIZ.LJIIIIZZ();
                    return false;
                }
                return true;
            }
            this.LIZ.LJIIIIZZ();
            return false;
        }
        dynamicPopupTask.LJIIIIZZ();
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

    public C31974Cgk(DynamicPopupTask dynamicPopupTask, C54082LKk c54082LKk, M78 m78) {
        this.LIZ = dynamicPopupTask;
        this.LIZIZ = c54082LKk;
        this.LIZJ = m78;
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
