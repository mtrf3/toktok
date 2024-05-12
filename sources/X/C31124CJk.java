package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.hybrid.spark.SparkContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CJk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31124CJk implements InterfaceC32911Qx {
    public final SparkContext LJLIL;
    public final SheetOptions LJLILLLLZI;
    public final boolean LJLJI;
    public Fragment LJLJJI;
    public C12830et LJLJJL;
    public boolean LJLJJLL;

    @Override // X.InterfaceC32911Qx
    public final /* synthetic */ boolean ah() {
        return false;
    }

    @Override // X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C48690J9a.LIZIZ(context);
    }

    @Override // X.InterfaceC32911Qx
    public final /* synthetic */ void onWindowFocusChanged(boolean z) {
    }

    @Override // X.InterfaceC32911Qx
    public final void Q9() {
        InterfaceC31125CJl interfaceC31125CJl;
        InterfaceC40159FpT LJIILL = this.LJLIL.LJIILL();
        if ((LJIILL instanceof InterfaceC31125CJl) && (interfaceC31125CJl = (InterfaceC31125CJl) LJIILL) != null) {
            interfaceC31125CJl.LLLLLIL();
        }
    }

    @Override // X.InterfaceC32911Qx
    public final Fragment getFragment() {
        Fragment fragment = this.LJLJJI;
        if (fragment != null) {
            return fragment;
        }
        o.LJIJI("f");
        throw null;
    }

    @Override // X.InterfaceC32911Qx
    public final void hide() {
        C12830et c12830et = this.LJLJJL;
        if (c12830et != null) {
            c12830et.LJ(this);
        }
    }

    @Override // X.InterfaceC32911Qx
    public final boolean isAdded() {
        Fragment fragment = this.LJLJJI;
        if (fragment != null) {
            return fragment.isAdded();
        }
        o.LJIJI("f");
        throw null;
    }

    @Override // X.InterfaceC32911Qx
    public final boolean isHidden() {
        Fragment fragment = this.LJLJJI;
        if (fragment != null) {
            return fragment.isHidden();
        }
        o.LJIJI("f");
        throw null;
    }

    @Override // X.InterfaceC32911Qx
    public final String nk() {
        return this.LJLIL.containerId;
    }

    @Override // X.InterfaceC32911Qx
    public final void show() {
        C12830et c12830et = this.LJLJJL;
        if (c12830et != null) {
            c12830et.LJIILIIL(this);
        }
    }

    @Override // X.InterfaceC32911Qx
    public final boolean LJJJLZIJ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC32911Qx
    public final SheetOptions g1() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC32911Qx
    public final boolean n5() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC32911Qx
    public final int Ng(Context context) {
        return C259910h.LIZIZ(R.attr.bme, context);
    }

    @Override // X.InterfaceC32911Qx
    public final void jb(C12830et sheetController) {
        o.LJIIIZ(sheetController, "sheetController");
        this.LJLJJL = sheetController;
    }

    public C31124CJk(SparkContext sparkContext, SheetOptions sheetOptions, boolean z) {
        this.LJLIL = sparkContext;
        this.LJLILLLLZI = sheetOptions;
        this.LJLJI = z;
    }
}
