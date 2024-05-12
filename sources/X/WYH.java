package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYH {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final ViewGroup LIZ;
    public Effect LIZIZ;
    public View LIZJ;
    public C164106cI LIZLLL;
    public LinearLayout LJ;
    public InterfaceC82683Wch LJFF;
    public TDU LJI;
    public final C73318Sq2 LJII = new C73318Sq2();
    public final C73849Syb<String> LJIIIIZZ = new C73849Syb<>();
    public boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public InterfaceC88471Ynr<? super Effect, ? super Boolean, C76800UCe> LJIIL;

    public final void LIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJFF;
        if (interfaceC82683Wch != null) {
            if (interfaceC82683Wch.isShowing()) {
                TDU tdu = this.LJI;
                if (tdu != null) {
                    tdu.setVisibility(8);
                    InterfaceC82683Wch interfaceC82683Wch2 = this.LJFF;
                    if (interfaceC82683Wch2 != null) {
                        interfaceC82683Wch2.dismiss();
                        return;
                    } else {
                        o.LJIJI("effectTip");
                        throw null;
                    }
                }
                o.LJIJI("progressView");
                throw null;
            }
            return;
        }
        o.LJIJI("effectTip");
        throw null;
    }

    public WYH(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LJIIJ = (int) C74275TDb.LIZIZ(context, 1.5f);
        this.LJIIJJI = (int) C74275TDb.LIZIZ(context, 2.0f);
    }
}
