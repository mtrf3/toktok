package X;

/* loaded from: classes8.dex */
public final class GQ7 extends GQ9 {
    public final /* synthetic */ GQ5 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GQ7(GQ5 gq5) {
        super(1);
        this.LJLIL = gq5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0049, code lost:
    
        if (r0 == '\n') goto L22;
     */
    @Override // X.GQ9, android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void afterTextChanged(android.text.Editable r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQ7.afterTextChanged(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        int i4;
        int min;
        int i5 = i + i2;
        if (charSequence.length() == 0 || i5 < 0 || i5 >= charSequence.length()) {
            return;
        }
        int i6 = i3 - i2;
        GQ5 gq5 = this.LJLIL;
        if (charSequence.charAt(i5) == '\n' && i6 == 1) {
            z = true;
        } else {
            z = false;
        }
        gq5.LJIILIIL = z;
        GQ5 gq52 = this.LJLIL;
        boolean z2 = gq52.LJIILIIL;
        if (z2) {
            i4 = i5;
        } else {
            i4 = -1;
        }
        gq52.LJIILJJIL = i4;
        if (z2) {
            gq52.LIZJ("type");
        } else {
            if (i6 <= 1 || i5 > (min = Math.min(i + i3, charSequence.length())) || !charSequence.subSequence(i5, min).toString().contains("\n")) {
                return;
            }
            this.LJLIL.LIZJ("paste");
        }
    }
}
