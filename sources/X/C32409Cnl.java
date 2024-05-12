package X;

import Y.ARunnableS24S0200000_5;
import android.os.Handler;

/* renamed from: X.Cnl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32409Cnl extends AbstractC32415Cnr {
    public final Handler LIZIZ;

    public C32409Cnl(AbstractC32415Cnr abstractC32415Cnr) {
        super(abstractC32415Cnr);
        this.LIZIZ = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.AbstractC32415Cnr
    public final void LIZ(C32399Cnb c32399Cnb) {
        this.LIZIZ.post(new ARunnableS24S0200000_5(this, c32399Cnb, 34));
    }
}
