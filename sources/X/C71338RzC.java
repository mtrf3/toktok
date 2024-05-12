package X;

import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.RzC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71338RzC extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ C71335Rz9 LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ SHA LIZLLL;
    public final /* synthetic */ ShopWindowAnchorModel LJ;
    public final /* synthetic */ String LJFF;

    @Override // X.W4V, X.W4Z
    public final void LJ(String str, Throwable th) {
        C71335Rz9 c71335Rz9 = this.LIZIZ;
        int i = this.LIZJ;
        SHA icon = this.LIZLLL;
        o.LJIIIIZZ(icon, "icon");
        c71335Rz9.N(i, false, icon, this.LJ, this.LJFF);
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String str, Object obj, Animatable animatable) {
        C71335Rz9 c71335Rz9 = this.LIZIZ;
        int i = this.LIZJ;
        SHA icon = this.LIZLLL;
        o.LJIIIIZZ(icon, "icon");
        c71335Rz9.N(i, true, icon, this.LJ, this.LJFF);
    }

    public C71338RzC(C71335Rz9 c71335Rz9, int i, SHA sha, ShopWindowAnchorModel shopWindowAnchorModel, String str) {
        this.LIZIZ = c71335Rz9;
        this.LIZJ = i;
        this.LIZLLL = sha;
        this.LJ = shopWindowAnchorModel;
        this.LJFF = str;
    }
}
