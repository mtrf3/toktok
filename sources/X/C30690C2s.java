package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.C2s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30690C2s extends C31073CHl {
    public final /* synthetic */ C30687C2p LJLJL;
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

    public C30690C2s(C15540jG c15540jG, C15540jG c15540jG2, C30687C2p c30687C2p, C76732zl c76732zl) {
        this.LJLJL = c30687C2p;
        this.LJLJLJ = c76732zl;
        this.LJLJLLL = c15540jG;
        this.LJLL = c15540jG2;
    }
}
