package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.C2q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30688C2q extends C31073CHl {
    public final /* synthetic */ C30687C2p LJLJL;
    public final /* synthetic */ C15540jG LJLJLJ;
    public final /* synthetic */ C76732zl LJLJLLL;
    public final /* synthetic */ C15540jG LJLL;

    @Override // X.C31073CHl
    public final void LJFF() {
        C76732zl c76732zl = this.LJLJLLL;
        C15540jG c15540jG = this.LJLL;
        C15540jG c15540jG2 = this.LJLJLJ;
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
        this.LJLJL.LIZJ.setVisibility(8);
        this.LJLJLJ.LIZ();
        this.LJLJL.LIZLLL();
    }

    public C30688C2q(C15540jG c15540jG, C15540jG c15540jG2, C30687C2p c30687C2p, C76732zl c76732zl) {
        this.LJLJL = c30687C2p;
        this.LJLJLJ = c15540jG;
        this.LJLJLLL = c76732zl;
        this.LJLL = c15540jG2;
    }
}
