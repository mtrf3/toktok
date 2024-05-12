package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.o;

/* renamed from: X.4qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122174qr extends AbstractC65781Prl implements InterfaceC88472Yns<C122034qd, C76800UCe> {
    public final /* synthetic */ FilterBean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C122174qr(float f, FilterBean filterBean, boolean z) {
        super(1);
        this.LJLIL = filterBean;
        this.LJLILLLLZI = z;
        this.LJLJI = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C122034qd c122034qd) {
        C122034qd editorPro = c122034qd;
        o.LJIIIZ(editorPro, "editorPro");
        if (editorPro.LJ().LIZIZ() != null) {
            editorPro.LJ().LJJIIJZLJL(null);
        }
        C121584pu c121584pu = new C121584pu(EnumC121554pr.COLOR_NO_COMPOSER);
        c121584pu.LIZ = this.LJLIL.getFilterFolder();
        boolean z = this.LJLILLLLZI;
        if (z) {
            c121584pu.LIZIZ = this.LJLJI;
        } else {
            c121584pu.LIZIZ = 1.0f;
        }
        c121584pu.LIZJ = z;
        c121584pu.LJI = this.LJLIL.getResId();
        editorPro.LJI().LJJIJIL(c121584pu);
        return C76800UCe.LIZ;
    }
}
