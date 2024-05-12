package X;

/* renamed from: X.Q8s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66518Q8s extends C66517Q8r {
    public C66517Q8r build() {
        return this;
    }

    public C66518Q8s mergeFrom(C66517Q8r c66517Q8r) {
        if (c66517Q8r.hasPattern()) {
            setPattern(c66517Q8r.getPattern());
        }
        if (c66517Q8r.hasFormat()) {
            setFormat(c66517Q8r.getFormat());
        }
        for (int i = 0; i < c66517Q8r.leadingDigitsPatternSize(); i++) {
            addLeadingDigitsPattern(c66517Q8r.getLeadingDigitsPattern(i));
        }
        if (c66517Q8r.hasNationalPrefixFormattingRule()) {
            setNationalPrefixFormattingRule(c66517Q8r.getNationalPrefixFormattingRule());
        }
        if (c66517Q8r.hasDomesticCarrierCodeFormattingRule()) {
            setDomesticCarrierCodeFormattingRule(c66517Q8r.getDomesticCarrierCodeFormattingRule());
        }
        if (c66517Q8r.hasNationalPrefixOptionalWhenFormatting()) {
            setNationalPrefixOptionalWhenFormatting(c66517Q8r.getNationalPrefixOptionalWhenFormatting());
        }
        return this;
    }
}
