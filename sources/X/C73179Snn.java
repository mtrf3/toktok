package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Snn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73179Snn extends AbstractC38521fE implements InterfaceC73206SoE {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJL;
    public final C62822Ol8 LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C73179Snn.class), "content", "getContent()Landroid/view/View;");
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC73206SoE
    public final View getView() {
        return (View) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC73206SoE
    public final void LIZIZ(int i) {
        switch (i) {
            case 241:
                LJIIJJI(R.id.lw_);
                return;
            case 242:
                LJIIJJI(R.id.ia9);
                return;
            case 243:
                LJIIJJI(R.id.lwx);
                return;
            case 244:
                LJIIJJI(R.id.lwp);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73179Snn(ViewGroup parent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        o.LJIIJ(parent, "parent");
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0200000_12(this, parent, 64));
    }
}
