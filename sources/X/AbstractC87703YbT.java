package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.YbT, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87703YbT extends AbstractC87722Ybm implements InterfaceC87720Ybk {
    public List<C87721Ybl> LJII = new ArrayList();

    @Override // X.InterfaceC87720Ybk
    public final List<C87721Ybl> LIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC87720Ybk
    public final void LIZIZ(AbstractC87705YbV abstractC87705YbV) {
        this.LJII.add(abstractC87705YbV);
    }
}
