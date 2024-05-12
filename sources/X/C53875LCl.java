package X;

import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.LCl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53875LCl extends AbstractC65781Prl implements InterfaceC88472Yns<Float, C76800UCe> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ C82454WXq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53875LCl(float f, C82454WXq c82454WXq) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = c82454WXq;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Float f) {
        float floatValue = this.LJLIL * f.floatValue();
        ViewGroup viewGroup = this.LJLILLLLZI.LJLJL;
        if (viewGroup != null) {
            viewGroup.setScaleX(floatValue);
            viewGroup.setScaleY(floatValue);
            return C76800UCe.LIZ;
        }
        o.LJIJI("placeholderContent");
        throw null;
    }
}
