package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.Thw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75364Thw extends C31073CHl {
    public final /* synthetic */ C75357Thp LJLJL;

    public C75364Thw(C75357Thp c75357Thp) {
        this.LJLJL = c75357Thp;
    }

    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C75357Thp c75357Thp = this.LJLJL;
        C75362Thu c75362Thu = c75357Thp.LLFII;
        if (c75362Thu != null) {
            long j = c75362Thu.LIZJ;
            if (j == 1 || j == 2) {
                c75357Thp.LIZIZ();
                return;
            }
        }
        c75357Thp.LJIILLIIL();
    }
}
