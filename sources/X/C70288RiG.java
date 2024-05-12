package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.GlobalSpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import kotlin.jvm.internal.o;

/* renamed from: X.RiG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70288RiG extends F9E implements InterfaceC70245RhZ {
    public final String LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public ISpecUiStyle LJLJJI;

    @Override // X.InterfaceC70245RhZ
    public final void LJJLIIIIJ(String str) {
        o.LJIIIZ(str, "<set-?>");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC70245RhZ
    public final void LJLJLJ(ISpecUiStyle iSpecUiStyle) {
        o.LJIIIZ(iSpecUiStyle, "<set-?>");
        this.LJLJJI = iSpecUiStyle;
    }

    public C70288RiG(String text, boolean z, boolean z2) {
        o.LJIIIZ(text, "text");
        this.LJLIL = text;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = new GlobalSpecUiStyle();
    }
}
