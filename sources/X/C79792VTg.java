package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.VTg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79792VTg extends VZM<C79858VVu> {
    public Boolean LLIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79792VTg(Context context) {
        super(new C79858VVu(context), context);
        o.LJIIJ(context, "context");
        this.LLIIL = Boolean.FALSE;
    }

    public final void setPagerChangeAnimation(boolean z) {
        getMViewPager().setMPagerChangeAnimation(z);
    }

    @Override // X.VZM
    public void setTabBarElementAdded(boolean z) {
        this.LLIIL = Boolean.valueOf(z);
    }
}
