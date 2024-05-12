package X;

/* renamed from: X.Q8u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66520Q8u extends C66515Q8p {
    public C66515Q8p build() {
        return this;
    }

    public C66520Q8u mergeFrom(C66515Q8p c66515Q8p) {
        if (c66515Q8p.hasNationalNumberPattern()) {
            setNationalNumberPattern(c66515Q8p.getNationalNumberPattern());
        }
        for (int i = 0; i < c66515Q8p.getPossibleLengthCount(); i++) {
            addPossibleLength(c66515Q8p.getPossibleLength(i));
        }
        for (int i2 = 0; i2 < c66515Q8p.getPossibleLengthLocalOnlyCount(); i2++) {
            addPossibleLengthLocalOnly(c66515Q8p.getPossibleLengthLocalOnly(i2));
        }
        if (c66515Q8p.hasExampleNumber()) {
            setExampleNumber(c66515Q8p.getExampleNumber());
        }
        return this;
    }
}
