package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.LLc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54100LLc extends AbstractC72439Sbr {
    public final /* synthetic */ C54113LLp LJLIL;

    public C54100LLc(C54113LLp c54113LLp) {
        this.LJLIL = c54113LLp;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        this.LJLIL.LIZIZ();
        C54113LLp c54113LLp = this.LJLIL;
        c54113LLp.LJLLJ = false;
        c54113LLp.LIZJ();
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        Object LIZ;
        C54113LLp c54113LLp = this.LJLIL;
        try {
            Context context = c54113LLp.getContext();
            o.LJIIIIZZ(context, "context");
            if (o.LJ(C116694i1.LIZ(C45804HyK.LJJIFFI(context)).nv0(), c54113LLp.getIconData().LIZIZ)) {
                c54113LLp.LIZIZ();
                c54113LLp.LJLLJ = false;
                c54113LLp.LIZJ();
                LIZ = C76800UCe.LIZ;
            } else {
                c54113LLp.LIZ();
                LIZ = Integer.valueOf(android.util.Log.d("MaterialIconTab", "cubicInOutAnimation"));
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C54113LLp c54113LLp2 = this.LJLIL;
        if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
            c54113LLp2.LJLLJ = false;
            c54113LLp2.LIZJ();
        }
    }
}
