package X;

import android.util.Property;

/* loaded from: classes15.dex */
public final class WNK extends WNT {
    public final /* synthetic */ C76853UEf LIZJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WNK(C76853UEf c76853UEf) {
        super(0);
        this.LIZJ = c76853UEf;
    }

    @Override // X.WNT
    public final void LIZIZ(float f) {
        for (Property property : this.LIZJ.LIZIZ.keySet()) {
            WNP wnp = this.LIZJ.LIZIZ.get(property);
            property.set(this.LIZJ.LIZ, wnp.LIZ.evaluate(f, wnp.LIZIZ, wnp.LIZJ));
        }
    }
}
