package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Nk7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60211Nk7 extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends C60213Nk9<View>>, C76800UCe> {
    public final /* synthetic */ AbstractC60239NkZ LJLIL;
    public final /* synthetic */ C60210Nk6 LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ android.net.Uri LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60211Nk7(AbstractC60239NkZ abstractC60239NkZ, C60210Nk6 c60210Nk6, boolean z, android.net.Uri uri) {
        super(1);
        this.LJLIL = abstractC60239NkZ;
        this.LJLILLLLZI = c60210Nk6;
        this.LJLJI = z;
        this.LJLJJI = uri;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends C60213Nk9<View>> list) {
        List<? extends C60213Nk9<View>> viewComponents = list;
        o.LJIIJ(viewComponents, "viewComponents");
        if (!viewComponents.isEmpty()) {
            boolean z = false;
            for (C60213Nk9<View> c60213Nk9 : viewComponents) {
                if (!z) {
                    this.LJLIL.LJIJJ(c60213Nk9, this.LJLJJI);
                    z = true;
                }
                this.LJLIL.LIZJ(c60213Nk9);
                this.LJLILLLLZI.LJLJI.invoke(c60213Nk9);
            }
            this.LJLIL.LIZIZ();
            this.LJLILLLLZI.LJLJJI.invoke(this.LJLIL, viewComponents, Boolean.valueOf(this.LJLJI));
        } else {
            InterfaceC88472Yns interfaceC88472Yns = this.LJLILLLLZI.LJLJJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initiateViewComponents failed for uri ");
            LIZ.append(this.LJLJJI);
            interfaceC88472Yns.invoke(new IllegalStateException(X1D.LIZIZ(LIZ)));
        }
        return C76800UCe.LIZ;
    }
}
