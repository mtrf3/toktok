package androidx.mediarouter.app;

import X.AbstractC16150kF;
import X.C90101ZXt;
import X.C90570Zgc;
import X.ZX9;
import X.ZXK;
import X.ZY5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes29.dex */
public class MediaRouteActionProvider extends AbstractC16150kF {
    public final ZY5 LIZJ;
    public final C90101ZXt LIZLLL;
    public final ZXK LJ;
    public ZX9 LJFF;

    @Override // X.AbstractC16150kF
    public final boolean LJI() {
        return true;
    }

    @Override // X.AbstractC16150kF
    public final boolean LIZIZ() {
        ZY5 zy5 = this.LIZJ;
        C90101ZXt c90101ZXt = this.LIZLLL;
        zy5.getClass();
        return ZY5.LJFF(c90101ZXt, 1);
    }

    @Override // X.AbstractC16150kF
    public final View LIZJ() {
        ZX9 zx9 = new ZX9(this.LIZ);
        this.LJFF = zx9;
        zx9.setCheatSheetEnabled(true);
        this.LJFF.setRouteSelector(this.LIZLLL);
        this.LJFF.setAlwaysVisible(false);
        this.LJFF.setDialogFactory(this.LJ);
        this.LJFF.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.LJFF;
    }

    @Override // X.AbstractC16150kF
    public final boolean LJ() {
        ZX9 zx9 = this.LJFF;
        if (zx9 != null) {
            return zx9.LIZLLL();
        }
        return false;
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.LIZLLL = C90101ZXt.LIZJ;
        this.LJ = ZXK.LIZ;
        this.LIZJ = ZY5.LIZJ(context);
        new C90570Zgc(this);
    }
}
