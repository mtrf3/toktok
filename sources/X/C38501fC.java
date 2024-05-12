package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1fC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38501fC implements InterfaceC268913t {
    public Object LJLIL;
    public Object LJLILLLLZI;

    @Override // X.InterfaceC268913t
    public final AbstractC22650uj LIZ() {
        final C43751nf c43751nf = (C43751nf) ((C44451on) this.LJLIL).LIZ();
        final C43751nf c43751nf2 = (C43751nf) ((C44451on) this.LJLILLLLZI).LIZ();
        return new AbstractC22650uj<PointF, PointF>(c43751nf, c43751nf2) { // from class: X.1Zo
            public final PointF LJIIJ;
            public final AbstractC22650uj<Float, Float> LJIIJJI;
            public final AbstractC22650uj<Float, Float> LJIIL;

            @Override // X.AbstractC22650uj
            public final PointF LJI() {
                return this.LJIIJ;
            }

            @Override // X.AbstractC22650uj
            public final void LJIIIZ(float f) {
                this.LJIIJJI.LJIIIZ(f);
                this.LJIIL.LJIIIZ(f);
                this.LJIIJ.set(this.LJIIJJI.LJI().floatValue(), this.LJIIL.LJI().floatValue());
                for (int i = 0; i < ((ArrayList) this.LIZ).size(); i++) {
                    ((InterfaceC22630uh) ListProtector.get(this.LIZ, i)).LJI();
                }
            }

            {
                super(Collections.emptyList());
                this.LJIIJ = new PointF();
                this.LJIIJJI = c43751nf;
                this.LJIIL = c43751nf2;
                LJIIIZ(this.LJ);
            }

            @Override // X.AbstractC22650uj
            public final PointF LJII(C06780Ok<PointF> c06780Ok, float f) {
                return this.LJIIJ;
            }
        };
    }

    public C38501fC() {
    }

    public /* synthetic */ C38501fC(C44451on c44451on, C44451on c44451on2) {
        this.LJLIL = c44451on;
        this.LJLILLLLZI = c44451on2;
    }
}
