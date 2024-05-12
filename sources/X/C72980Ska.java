package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ska, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72980Ska implements InterfaceC72976SkW {
    public final /* synthetic */ C72979SkZ LIZ;

    public C72980Ska(C72979SkZ c72979SkZ) {
        this.LIZ = c72979SkZ;
    }

    @Override // X.InterfaceC72976SkW
    public final void LIZ(float f) {
        if (!C72985Skf.LIZIZ(this.LIZ.LIZ)) {
            f = 1 - f;
        }
        C72979SkZ c72979SkZ = this.LIZ;
        float f2 = f - c72979SkZ.LJJIIJ;
        C72981Skb c72981Skb = c72979SkZ.LJIILLIIL;
        if (c72981Skb != null) {
            c72981Skb.getPlayHeadCenterX().LIZ();
            this.LIZ.LJJII.invoke(Float.valueOf(f));
            C72979SkZ c72979SkZ2 = this.LIZ;
            RecyclerView recyclerView = c72979SkZ2.LJIIZILJ;
            if (recyclerView != null) {
                int LJJIIZ = O6R.LJJIIZ(c72979SkZ2.LJIIL.LIZIZ.floatValue() * f2);
                if (!C72985Skf.LIZIZ(this.LIZ.LIZ)) {
                    LJJIIZ = -LJJIIZ;
                }
                recyclerView.scrollBy(LJJIIZ, 0);
                return;
            }
            o.LJIJI("spriteRecyclerView");
            throw null;
        }
        o.LJIJI("scrollHandle");
        throw null;
    }
}
