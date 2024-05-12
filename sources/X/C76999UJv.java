package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UJv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76999UJv extends AbstractC42741m2 {
    public final LayeredElementContext LJLJJI;
    public boolean LJLJJL;

    @Override // X.AbstractC42741m2
    public final void LIZ() {
        if (this.LJLJJL) {
            this.LJLJJI.downElement(R.id.gi_);
            this.LJLJJI.downElement(R.id.ikl);
            this.LJLJJI.downElement(R.id.jm1);
            this.LJLJJI.downElement(R.id.jl9);
            this.LJLJJI.downElement(R.id.n4b);
            this.LJLJJI.downElement(R.id.k58);
            this.LJLJJI.downElement(R.id.dn0);
            this.LJLJJI.downElement(R.id.i_x);
            this.LJLJJI.downElement(R.id.krj);
            this.LJLJJI.downElement(R.id.dkc);
            this.LJLJJI.downElement(R.id.dkb);
            this.LJLJJL = false;
        }
    }

    @Override // X.AbstractC42741m2
    public final void LIZIZ() {
        if (!this.LJLJJL) {
            this.LJLJJI.upElement(R.id.gi_);
            this.LJLJJI.upElement(R.id.ikl);
            this.LJLJJI.upElement(R.id.jm1);
            this.LJLJJI.upElement(R.id.jl9);
            this.LJLJJI.upElement(R.id.n4b);
            this.LJLJJI.upElement(R.id.k58);
            this.LJLJJI.upElement(R.id.dn0);
            this.LJLJJI.upElement(R.id.i_x);
            this.LJLJJI.upElement(R.id.krj);
            this.LJLJJI.upElement(R.id.dkc);
            this.LJLJJI.upElement(R.id.dkb);
            this.LJLJJL = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76999UJv(LayeredElementContext layeredElementContext, View view) {
        super(layeredElementContext, view);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLJJI = layeredElementContext;
    }
}
