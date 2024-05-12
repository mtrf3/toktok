package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CN6 implements InterfaceC60949Nw1 {
    public final /* synthetic */ C40135Fp5 LIZ;

    public CN6(C40135Fp5 c40135Fp5) {
        this.LIZ = c40135Fp5;
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZ(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZIZ(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        C36746EbW.LIZ(4, "onPreStarted");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LIZLLL(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPostStarted needIntercept = ");
        LIZ.append(this.LIZ.LJLILLLLZI);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (C78897Uxp.LJJIIZI()) {
            this.LIZ.LJLIL.setValue(Boolean.TRUE);
        } else {
            this.LIZ.LJLIL.postValue(Boolean.TRUE);
        }
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJFF(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        C36746EbW.LIZ(4, "onSparkPopupPostPaused");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJI(SparkPopup popup) {
        o.LJIIJ(popup, "popup");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIIZ(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPostDestroyed needIntercept = ");
        C1DI.LIZJ(LIZ, this.LIZ.LJLILLLLZI, LIZ, 4);
        if (this.LIZ.LJLILLLLZI) {
            if (C78897Uxp.LJJIIZI()) {
                this.LIZ.LJLIL.setValue(Boolean.FALSE);
            } else {
                this.LIZ.LJLIL.postValue(Boolean.FALSE);
            }
        }
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIL(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        C36746EbW.LIZ(4, "onPreDestroyed");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILJJIL(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        C36746EbW.LIZ(4, "onSparkPopupPostResumed");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILLIIL(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSparkPopupDismissed needIntercept = ");
        C1DI.LIZJ(LIZ, this.LIZ.LJLILLLLZI, LIZ, 4);
        if (this.LIZ.LJLILLLLZI) {
            if (C78897Uxp.LJJIIZI()) {
                this.LIZ.LJLIL.setValue(Boolean.FALSE);
            } else {
                this.LIZ.LJLIL.postValue(Boolean.FALSE);
            }
        }
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJ(SparkPopup popup) {
        o.LJIIIZ(popup, "popup");
        C36746EbW.LIZ(4, "onSparkPopupPreResumed");
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
        o.LJIIIZ(popup, "popup");
        C36746EbW.LIZ(4, "onSparkPopupPrePaused");
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
    public final void LJII(SparkPopup popup, View view, Bundle bundle) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(view, "view");
        C36746EbW.LIZ(4, "onSparkPopupPreViewCreated");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIILIIL(SparkPopup popup, View view, Bundle bundle) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(view, "view");
        C36746EbW.LIZ(4, "onSparkPopupPostViewCreated");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIIIZZ(SparkPopup popup, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(inflater, "inflater");
        C36746EbW.LIZ(4, "onSparkPopupPostCreateView");
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIIZILJ(SparkPopup sparkPopup, int i, String[] strArr, int[] iArr) {
        CLW.LJ(sparkPopup, strArr, iArr);
    }

    @Override // X.InterfaceC60949Nw1
    public final void LJIJJ(SparkPopup popup, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(popup, "popup");
        o.LJIIIZ(inflater, "inflater");
        C36746EbW.LIZ(4, "onSparkPopupPreCreateView");
    }
}
