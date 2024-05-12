package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.GlobalSpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.jvm.internal.o;

/* renamed from: X.Rhg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70252Rhg extends F9E implements InterfaceC70245RhZ {
    public final Image LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public ISpecUiStyle LJLJJL;

    @Override // X.InterfaceC70245RhZ
    public final void LJJLIIIIJ(String str) {
        o.LJIIIZ(str, "<set-?>");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    @Override // X.InterfaceC70245RhZ
    public final void LJLJLJ(ISpecUiStyle iSpecUiStyle) {
        o.LJIIIZ(iSpecUiStyle, "<set-?>");
        this.LJLJJL = iSpecUiStyle;
    }

    public C70252Rhg(Image image, String text, boolean z, boolean z2) {
        o.LJIIIZ(image, "image");
        o.LJIIIZ(text, "text");
        this.LJLIL = image;
        this.LJLILLLLZI = text;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = new GlobalSpecUiStyle();
    }
}
