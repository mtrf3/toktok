package X;

import java.io.File;

/* renamed from: X.Cng, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32404Cng extends AbstractC32415Cnr {
    public C32404Cng(AbstractC32415Cnr abstractC32415Cnr) {
        super(abstractC32415Cnr);
    }

    @Override // X.AbstractC32415Cnr
    public final void LIZ(C32399Cnb c32399Cnb) {
        long j;
        C32221Ckj.LIZIZ();
        if (c32399Cnb != null) {
            j = c32399Cnb.LIZIZ;
        } else {
            j = 0;
        }
        File file = new File(C32405Cnh.LIZIZ(j));
        if (file.exists()) {
            file.setLastModified(System.currentTimeMillis());
        }
        AbstractC32415Cnr abstractC32415Cnr = this.LIZ;
        if (abstractC32415Cnr != null) {
            abstractC32415Cnr.LIZ(c32399Cnb);
        }
    }
}
