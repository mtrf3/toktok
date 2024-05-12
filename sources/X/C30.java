package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C30 extends C31073CHl {
    public final /* synthetic */ C30695C2x LJLJL;
    public final /* synthetic */ C76732zl LJLJLJ;
    public final /* synthetic */ C15540jG LJLJLLL;
    public final /* synthetic */ C15540jG LJLL;

    @Override // X.C31073CHl
    public final void LJFF() {
        C76732zl c76732zl = this.LJLJLJ;
        C15540jG c15540jG = this.LJLJLLL;
        C15540jG c15540jG2 = this.LJLL;
        int i = c76732zl.element - 1;
        c76732zl.element = i;
        if (i == 0) {
            c15540jG.LJ();
            c15540jG2.LJ();
        }
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        this.LJLJL.LIZJ.setClickable(false);
    }

    public C30(C15540jG c15540jG, C15540jG c15540jG2, C30695C2x c30695C2x, C76732zl c76732zl) {
        this.LJLJL = c30695C2x;
        this.LJLJLJ = c76732zl;
        this.LJLJLLL = c15540jG;
        this.LJLL = c15540jG2;
    }
}
