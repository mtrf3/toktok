package X;

import android.animation.IntEvaluator;

/* loaded from: classes15.dex */
public final class WNJ extends WNI {
    @Override // X.WNI
    public final void LIZLLL() {
    }

    @Override // X.WNI
    public final WNT LIZIZ(boolean z) {
        if (z) {
            if (this.LJLIL.getBackground() != null) {
                this.LJLIL.setBackgroundDrawable(this.LJLIL.getBackground().mutate());
                C76853UEf c76853UEf = new C76853UEf(this.LJLIL.getBackground());
                c76853UEf.LIZIZ.put(C76853UEf.LIZJ, new WNP(new IntEvaluator(), 0, 255));
                return new WNK(c76853UEf);
            }
        } else if (this.LJLIL.getBackground() != null) {
            this.LJLIL.setBackgroundDrawable(this.LJLIL.getBackground().mutate());
            C76853UEf c76853UEf2 = new C76853UEf(this.LJLIL.getBackground());
            c76853UEf2.LIZIZ.put(C76853UEf.LIZJ, new WNP(new IntEvaluator(), 255, 0));
            return new WNK(c76853UEf2);
        }
        return WNT.LIZIZ;
    }
}
