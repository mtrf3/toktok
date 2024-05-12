package X;

import com.ss.android.ugc.aweme.ecommercelive.common.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import kotlin.jvm.internal.o;

/* renamed from: X.Rwk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71186Rwk {
    public final AbstractC71187Rwl LIZ;
    public InterfaceC71246Rxi LIZIZ;
    public final C71195Rwt LIZJ;

    public abstract void LIZ(String str);

    public abstract void LIZIZ();

    public abstract void LIZJ(OecInitData oecInitData);

    public abstract void LIZLLL(PopProductResp popProductResp, boolean z, boolean z2, boolean z3);

    public abstract void LJ();

    public abstract void LJFF(String str);

    public abstract void LJI();

    public abstract void LJII();

    public void LJIIIIZZ(String str, String str2) {
    }

    public AbstractC71186Rwk(AbstractC71187Rwl widget, InterfaceC71246Rxi interfaceC71246Rxi, C71195Rwt explainCardLoggerHelper) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(explainCardLoggerHelper, "explainCardLoggerHelper");
        this.LIZ = widget;
        this.LIZIZ = interfaceC71246Rxi;
        this.LIZJ = explainCardLoggerHelper;
    }
}
