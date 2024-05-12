package X;

import defpackage.i0;

/* loaded from: classes12.dex */
public class QAG extends Exception {
    public final String LJLIL;

    public String getMissingField() {
        return this.LJLIL;
    }

    public QAG(String str) {
        super(i0.LJFF("Missing mandatory configuration field: ", str));
        this.LJLIL = str;
    }
}
