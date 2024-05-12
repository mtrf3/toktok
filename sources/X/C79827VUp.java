package X;

import com.lynx.tasm.behavior.ui.view.UIComponent;

/* renamed from: X.VUp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79827VUp {
    public final C79831VUt LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public String LIZLLL;
    public final int LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{type='");
        LIZ.append(this.LIZIZ);
        LIZ.append("', position=");
        LIZ.append(this.LIZJ);
        LIZ.append(", key='");
        return JBR.LJFF(LIZ, this.LIZLLL, "'}", LIZ);
    }

    public C79827VUp(C79831VUt c79831VUt, String str) {
        this.LIZ = c79831VUt;
        this.LIZIZ = str;
        this.LIZJ = c79831VUt.getLayoutPosition();
        UIComponent uIComponent = c79831VUt.LJLIL.LJLILLLLZI;
        if (uIComponent != null) {
            this.LIZLLL = uIComponent.LJLIL;
            this.LJ = uIComponent.getSign();
        }
    }
}
