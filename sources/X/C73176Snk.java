package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Snk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73176Snk extends AbstractC38521fE implements InterfaceC73205SoD {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJJL;
    public final C62822Ol8 LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C73176Snk.class), "content", "getContent()Landroid/view/View;");
        C65352Pkq.LIZ.getClass();
        LJLJJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC73205SoD
    public final View getView() {
        return (View) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC73205SoD
    public final void LIZJ(int i) {
        switch (i) {
            case 241:
                LJII();
                return;
            case 242:
                LJIIJJI(R.id.lwc);
                return;
            case 243:
                LJIIJJI(R.id.lwd);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73176Snk(ViewGroup parent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(2);
        o.LJIIJ(parent, "parent");
        this.LJLJJI = interfaceC65784Pro;
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0200000_12(this, parent, 65));
    }
}
