package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8U extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ U8H LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8U(U8H u8h, boolean z, boolean z2) {
        super(1);
        this.LJLIL = u8h;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        View vp = view;
        o.LJIIIZ(vp, "vp");
        this.LJLIL.LJIIJJI.setClipChildren(this.LJLILLLLZI);
        this.LJLIL.LJJIII().setClipChildren(this.LJLILLLLZI);
        vp.getGlobalVisibleRect(this.LJLIL.LJIJ);
        this.LJLIL.LJIJI = new OSZ<>(Integer.valueOf(vp.getWidth()), Integer.valueOf(vp.getHeight() + this.LJLIL.LJJIIZI));
        U8H u8h = this.LJLIL;
        ViewGroup viewGroup = u8h.LJJJJJL;
        u8h.LJJJJJL = (ViewGroup) vp;
        if (!o.LJ(viewGroup, vp)) {
            this.LJLIL.getClass();
            String LJJJ = U8H.LJJJ(856);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL.LJJIJ());
            LIZ.append(":setParent");
            C32014ChO.LJFF(LJJJ, X1D.LIZIZ(LIZ));
            Layout LIZJ = this.LJLIL.LJIJJ().LIZJ(false);
            if (LIZJ != null) {
                if (!this.LJLJI) {
                    U8H.LJJLIIIJJIZ(this.LJLIL, LIZJ, true, false, null, 24);
                }
                this.LJLIL.LJJIJIL();
            }
        }
        return C76800UCe.LIZ;
    }
}
