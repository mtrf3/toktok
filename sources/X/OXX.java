package X;

import android.app.Dialog;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OXX implements C4RB {
    public final /* synthetic */ C71804SGa LIZ;

    public OXX(C71804SGa c71804SGa) {
        this.LIZ = c71804SGa;
    }

    @Override // X.C4RB
    public final void LIZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZJ(BaseSharePackage sharePackage) {
        View view;
        o.LJIIIZ(sharePackage, "sharePackage");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ.LJLIL;
        if (interfaceC38263Ezz != null && (view = interfaceC38263Ezz.getView()) != null) {
            C71804SGa c71804SGa = this.LIZ;
            String string = view.getContext().getString(R.string.f9s);
            o.LJIIIIZZ(string, "it.context.getString(R.s…ecom_favorite_share_fail)");
            c71804SGa.getClass();
            C26045AKb c26045AKb = new C26045AKb(view);
            c26045AKb.LJIIIZ(string);
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.C4RB
    public final void LIZLLL(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJII(BaseSharePackage sharePackage) {
        View view;
        o.LJIIIZ(sharePackage, "sharePackage");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LIZ.LJLIL;
        if (interfaceC38263Ezz != null && (view = interfaceC38263Ezz.getView()) != null) {
            C71804SGa c71804SGa = this.LIZ;
            String string = view.getContext().getString(R.string.f9t);
            o.LJIIIIZZ(string, "it.context.getString(R.s…m_favorite_share_success)");
            c71804SGa.getClass();
            C26045AKb c26045AKb = new C26045AKb(view);
            c26045AKb.LJIIIZ(string);
            c26045AKb.LJIIJ();
        }
    }

    @Override // X.C4RB
    public final void LJIIIIZZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZIZ(BaseSharePackage sharePackage, String str) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJFF(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZ(dialog, baseSharePackage);
    }

    @Override // X.C4RB
    public final void LJI(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZIZ(dialog, baseSharePackage);
    }
}
