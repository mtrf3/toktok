package X;

import Y.ALAdapterS11S0200000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.o;

/* renamed from: X.WSe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82312WSe extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C82313WSf LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82312WSe(C82313WSf c82313WSf, float f, float f2, int i) {
        super(0);
        this.LJLIL = c82313WSf;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        float f;
        ValueAnimator ofFloat;
        EnumC82314WSg enumC82314WSg;
        long abs;
        C82313WSf c82313WSf = this.LJLIL;
        float f2 = this.LJLILLLLZI;
        float f3 = this.LJLJI;
        int i = this.LJLJJI;
        c82313WSf.getClass();
        if (Math.signum(f3) == Math.signum(f2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ofFloat = ValueAnimator.ofFloat(f3, 0.0f);
            o.LJIIIIZZ(ofFloat, "ValueAnimator.ofFloat(fraction, 0f)");
            enumC82314WSg = EnumC82314WSg.NONE;
            abs = Math.abs(f3) * i;
        } else {
            float[] fArr = new float[2];
            fArr[0] = f3;
            if (f2 >= 1.0E-5f) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            fArr[1] = f;
            ofFloat = ValueAnimator.ofFloat(fArr);
            o.LJIIIIZZ(ofFloat, "ValueAnimator.ofFloat(fr… >= EPSILON) -1f else 1f)");
            if (f2 >= 1.0E-5f) {
                enumC82314WSg = EnumC82314WSg.LEFT;
            } else {
                enumC82314WSg = EnumC82314WSg.RIGHT;
            }
            abs = (1 - Math.abs(f3)) * i;
        }
        long min = Math.min(((float) abs) / ((Math.abs(f2) / 1000) / 2), 400L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(min);
        ofFloat.addUpdateListener(new AUListenerS101S0100000_14(c82313WSf, 1));
        ofFloat.addListener(new ALAdapterS11S0200000_14(c82313WSf, enumC82314WSg, 0));
        ofFloat.start();
        c82313WSf.LIZ = ofFloat;
        return C76800UCe.LIZ;
    }
}
